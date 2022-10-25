package com.tencent.ads.tools;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.inject.Inject;
import com.squareup.okhttp.*;
import com.squareup.okhttp.MediaType;
import com.tencent.ads.*;
import com.tencent.ads.container.*;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.*;
import com.tencent.ads.utils.BasicNameValuePair;
import com.tencent.ads.utils.NameValuePair;
import com.tencent.ads.utils.URLEncode;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class RapidAdsContainer extends ApiContainer {
  @Inject CampaignsApiContainer campaignsApi;
  @Inject AdgroupsApiContainer adgroupsApi;
  @Inject AdcreativesApiContainer adcreativesApi;
  @Inject AdsApiContainer adApi;
  @Inject BatchRequestsApiContainer batchRequestsApi;

  private final ApiClient apiClient = Configuration.getDefaultApiClient();

  private final int ATTEMPT_TIMES = 2;
  private final ThreadLocal<Exception> lastException = new ThreadLocal<>();

  public RapidAddAdsResponseData rapidAddAds(RapidAddAdsRequestData rapidAddAdsRequest)
      throws TencentAdsResponseException {
    Long accountId = null, campaignId = null, adgroupId = null, adcreativeId = null, adId = null;
    AdStatus campaignStatus, adgroupStatus, adStatus;
    RapidAddAdsResponseData rapidAddAdsResponse = new RapidAddAdsResponseData();

    // 0. check accountId
    // if one account Id is provided then it will be set to all subrequests
    // if  multiple account Id is provided then will check the consistency
    if (rapidAddAdsRequest.campaignsAddRequest.getAccountId() != null) {
      accountId = rapidAddAdsRequest.campaignsAddRequest.getAccountId();
    }
    if (rapidAddAdsRequest.adgroupsAddRequest.getAccountId() != null) {
      if (accountId != null) {
        if (!accountId.equals(rapidAddAdsRequest.adgroupsAddRequest.getAccountId())) {
          throw new TencentAdsResponseException("Account id not consistent!");
        } else {
          accountId = rapidAddAdsRequest.adgroupsAddRequest.getAccountId();
        }
      }
    }
    if (rapidAddAdsRequest.adcreativesAddRequest.getAccountId() != null) {
      if (accountId != null) {
        if (!accountId.equals(rapidAddAdsRequest.adcreativesAddRequest.getAccountId())) {
          throw new TencentAdsResponseException("Account id not consistent!");
        } else {
          accountId = rapidAddAdsRequest.adcreativesAddRequest.getAccountId();
        }
      }
    }
    if (rapidAddAdsRequest.adAddRequest.getAccountId() != null) {
      if (accountId != null) {
        if (!accountId.equals(rapidAddAdsRequest.adAddRequest.getAccountId())) {
          throw new TencentAdsResponseException("Account id not consistent!");
        } else {
          accountId = rapidAddAdsRequest.adAddRequest.getAccountId();
        }
      }
    }

    // 1. add campaign
    campaignStatus = rapidAddAdsRequest.campaignsAddRequest.getConfiguredStatus();
    rapidAddAdsRequest.campaignsAddRequest.setAccountId(accountId);
    rapidAddAdsRequest.campaignsAddRequest.setConfiguredStatus(AdStatus.SUSPEND);
    for (int i = 0; i < ATTEMPT_TIMES; i++) {
      try {
        rapidAddAdsResponse.campaignsAddResponseData =
            campaignsApi.campaignsAdd(rapidAddAdsRequest.campaignsAddRequest);
        campaignId = rapidAddAdsResponse.campaignsAddResponseData.getCampaignId();
        break;
      } catch (ApiException | TencentAdsResponseException exception) {
        if (i == ATTEMPT_TIMES - 1) {
          exception.printStackTrace();
          throw new TencentAdsResponseException(exception.getMessage());
        }
      }
    }

    // 2. batch add adgroup & adcreative
    adgroupStatus = rapidAddAdsRequest.adgroupsAddRequest.getConfiguredStatus();
    rapidAddAdsRequest.adgroupsAddRequest.setAccountId(accountId);
    rapidAddAdsRequest.adgroupsAddRequest.setCampaignId(campaignId);
    rapidAddAdsRequest.adgroupsAddRequest.setConfiguredStatus(AdStatus.SUSPEND);

    rapidAddAdsRequest.adcreativesAddRequest.setAccountId(accountId);
    rapidAddAdsRequest.adcreativesAddRequest.setCampaignId(campaignId);
    try {
      BatchAddResult batchAddResult =
          batchAdd(accountId, campaignId, rapidAddAdsRequest, rapidAddAdsResponse);
      adgroupId = batchAddResult.adgroupId;
      adcreativeId = batchAddResult.adcreativeId;
    } catch (TencentAdsResponseException exception) {
      adgroupId = getFailedAdgroup(accountId, campaignId);
      if (adgroupId != null) {
        deleteAdgroup(accountId, adgroupId);
      }
      adcreativeId = getFailedAdcreative(accountId, campaignId);
      if (adcreativeId != null) {
        deleteAdcreative(accountId, adcreativeId);
      }
      deleteCampaign(accountId, campaignId);

      throw new TencentAdsResponseException(lastException.get().getMessage());
    }

    // 3. add ad
    adStatus = rapidAddAdsRequest.adAddRequest.getConfiguredStatus();
    rapidAddAdsRequest.adAddRequest.setAccountId(accountId);
    rapidAddAdsRequest.adAddRequest.setAdgroupId(adgroupId);
    rapidAddAdsRequest.adAddRequest.setAdcreativeId(adcreativeId);
    rapidAddAdsRequest.adAddRequest.setConfiguredStatus(AdStatus.SUSPEND);
    for (int i = 0; i < ATTEMPT_TIMES; i++) {
      try {
        rapidAddAdsResponse.adsAddResponseData = adApi.adsAdd(rapidAddAdsRequest.adAddRequest);
        adId = rapidAddAdsResponse.adsAddResponseData.getAdId();
        break;
      } catch (Exception exception) {
        if (exception instanceof ApiException) {
          adId = getFailedAd(accountId, campaignId);
          if (adId != null) {
            rapidAddAdsResponse.adsAddResponseData = new AdsAddResponseData().adId(adId);
            break;
          }
        }
        if (i == ATTEMPT_TIMES - 1) {
          exception.printStackTrace();

          deleteAdgroup(accountId, adgroupId);
          deleteAdcreative(accountId, adcreativeId);
          deleteCampaign(accountId, campaignId);
          throw new TencentAdsResponseException(exception.getMessage());
        }
      }
    }

    // 4. set suspend to normal
    try {
      batchUpdate(accountId, campaignId, adgroupId, adId, campaignStatus, adgroupStatus, adStatus);
    } catch (TencentAdsResponseException exception) {
      deleteAds(accountId, adId);
      deleteAdgroup(accountId, adgroupId);
      deleteAdcreative(accountId, adcreativeId);
      deleteCampaign(accountId, campaignId);
      throw new TencentAdsResponseException(exception.getMessage());
    }

    return rapidAddAdsResponse;
  }

  protected String buildFormData(String json) {
    JsonParser jsonParser = new JsonParser();
    JsonElement root = jsonParser.parse(json);
    List<NameValuePair> params = new ArrayList<>();
    addNameValuePair(params, root, "");

    return URLEncode.format(params, StandardCharsets.UTF_8);
  }

  protected void addNameValuePair(List<NameValuePair> params, JsonElement element, String prefix) {
    if (element.isJsonArray()) {
      int index = 0;
      for (JsonElement listElement : element.getAsJsonArray()) {
        addNameValuePair(params, listElement, prefix + "[" + index + "]");
        index++;
      }
    } else if (element.isJsonPrimitive()) {
      params.add(new BasicNameValuePair(prefix, element.getAsString()));
    } else if (element.isJsonObject()) {
      for (String key : element.getAsJsonObject().keySet()) {
        JsonElement value = element.getAsJsonObject().get(key);
        String temp = prefix;
        if (temp.equals("")) {
          temp = key;
        } else {
          temp += "[" + key + "]";
        }
        addNameValuePair(params, value, temp);
      }
    }
  }

  protected void batchUpdate(
      Long accountId,
      Long campaignId,
      Long adgroupId,
      Long adId,
      AdStatus campaignStatus,
      AdStatus adgroupStatus,
      AdStatus adStatus)
      throws TencentAdsResponseException {
    String version = "v1.1";
    BatchRequestsAddRequest batchRequestsAddRequest = new BatchRequestsAddRequest();

    List<Class<?>> requestClasses =
        new ArrayList<>(
            Arrays.asList(
                CampaignsUpdateRequest.class, AdgroupsUpdateRequest.class, AdsUpdateRequest.class));
    List<Class<?>> responseClasses =
        new ArrayList<>(
            Arrays.asList(
                CampaignsUpdateResponse.class,
                AdgroupsUpdateResponse.class,
                AdsUpdateResponse.class));

    List<BatchRequestSpecStruct> batchRequestSpecs = new ArrayList<>();
    CampaignsUpdateRequest campaignsUpdateRequest =
        buildCampaignUpdateRequest(accountId, campaignId, campaignStatus);
    String campaignUpdateFormData = buildFormData(campaignsUpdateRequest.toString());
    batchRequestSpecs.add(
        new BatchRequestSpecStruct()
            .relativePath(version + "/campaigns/update")
            .body(campaignUpdateFormData));

    AdgroupsUpdateRequest adgroupsUpdateRequest =
        buildAdgroupUpdateRequest(accountId, adgroupId, adgroupStatus);
    String adgroupUpdateFormData = buildFormData(adgroupsUpdateRequest.toString());
    batchRequestSpecs.add(
        new BatchRequestSpecStruct()
            .relativePath(version + "/adgroups/update")
            .body(adgroupUpdateFormData));

    AdsUpdateRequest adsUpdateRequest = buildAdsUpdateRequest(accountId, adId, adStatus);
    String adUpdateFormData = buildFormData(adsUpdateRequest.toString());
    batchRequestSpecs.add(
        new BatchRequestSpecStruct().relativePath(version + "/ads/update").body(adUpdateFormData));

    batchRequestsAddRequest.setBatchRequestSpec(batchRequestSpecs);

    for (int attemptTime = 0; attemptTime < ATTEMPT_TIMES; attemptTime++) {
      try {
        BatchRequestsAddResponseData batchRequestsAddResponse =
            batchRequestsApi.batchRequestsAdd(batchRequestsAddRequest);
        List<Class<?>> requestClassesCopy = new ArrayList<>();
        for (int i = 0; i < requestClasses.size(); i++) {
          requestClassesCopy.add(null);
        }
        Collections.copy(requestClassesCopy, requestClasses);

        List<BatchRequestSpecStruct> batchRequestSpecCopy = new ArrayList<>();
        for (int i = 0; i < batchRequestSpecs.size(); i++) {
          batchRequestSpecCopy.add(null);
        }
        Collections.copy(batchRequestSpecCopy, batchRequestSpecs);

        for (int classIndex = 0; classIndex < requestClassesCopy.size(); classIndex++) {
          Class<?> responseClass = responseClasses.get(classIndex);

          BatchRequestsAddListStruct response = batchRequestsAddResponse.getList().get(classIndex);

          Object result = parseResponse(response.getBody(), responseClass);
          if (result != null) {
            requestClasses.remove(requestClassesCopy.get(classIndex));
            responseClasses.remove(requestClassesCopy.get(classIndex));
            batchRequestSpecs.remove(batchRequestSpecCopy.get(classIndex));
          }
        }

        if (requestClasses.size() == 0) {
          return;
        }
      } catch (ApiException | TencentAdsResponseException exception) {
        if (attemptTime == ATTEMPT_TIMES - 1) {
          exception.printStackTrace();
          throw new TencentAdsResponseException(exception.getMessage());
        }
      }
    }
    throw new TencentAdsResponseException(lastException.get().getMessage());
  }

  class BatchAddResult {
    Long adgroupId;
    Long adcreativeId;
  }

  protected BatchAddResult batchAdd(
      Long accountId,
      Long campaignId,
      RapidAddAdsRequestData rapidAddAdsRequest,
      RapidAddAdsResponseData rapidAddAdsResponse)
      throws TencentAdsResponseException {
    //    String version = TencentAds.API_VERSION;
    String version = "v1.1";
    BatchAddResult batchAddResult = new BatchAddResult();
    BatchRequestsAddRequest batchRequestsAddRequest = new BatchRequestsAddRequest();

    for (int i = 0; i < ATTEMPT_TIMES; i++) {
      // construct batch request based on previous result
      List<BatchRequestSpecStruct> batchRequestSpecs = new ArrayList<>();
      boolean needAdgroup = batchAddResult.adgroupId == null,
          needAdcreative = batchAddResult.adcreativeId == null;
      if (needAdgroup) {
        String adgroupAddFormData = buildFormData(rapidAddAdsRequest.adgroupsAddRequest.toString());
        batchRequestSpecs.add(
            new BatchRequestSpecStruct()
                .relativePath(version + "/adgroups/add")
                .body(adgroupAddFormData));
      }
      if (needAdcreative) {
        String adcreativeAddFormData =
            buildFormData(rapidAddAdsRequest.adcreativesAddRequest.toString());
        batchRequestSpecs.add(
            new BatchRequestSpecStruct()
                .relativePath(version + "/adcreatives/add")
                .body(adcreativeAddFormData));
      }

      batchRequestsAddRequest.setBatchRequestSpec(batchRequestSpecs);
      try {
        BatchRequestsAddResponseData batchRequestsAddResponse =
            batchRequestsApi.batchRequestsAdd(batchRequestsAddRequest);

        // get response according to last result
        BatchRequestsAddListStruct adgroupsApiResponse = null, adcreativeApiResponse = null;
        if (needAdgroup && needAdcreative) {
          adgroupsApiResponse = batchRequestsAddResponse.getList().get(0);
          adcreativeApiResponse = batchRequestsAddResponse.getList().get(1);
        } else if (needAdgroup) {
          adgroupsApiResponse = batchRequestsAddResponse.getList().get(0);
        } else if (needAdcreative) {
          adcreativeApiResponse = batchRequestsAddResponse.getList().get(0);
        }

        if (needAdgroup) {
          AdgroupsAddResponse adgroupsAddResponse =
              parseResponse(adgroupsApiResponse.getBody(), AdgroupsAddResponse.class);
          if (adgroupsAddResponse != null) {
            rapidAddAdsResponse.adgroupsAddResponseData = adgroupsAddResponse.getData();
            batchAddResult.adgroupId = adgroupsAddResponse.getData().getAdgroupId();
          } else if (lastException.get() instanceof ApiException) {
            batchAddResult.adgroupId = getFailedAdgroup(accountId, campaignId);
          }
        }

        if (needAdcreative) {
          AdcreativesAddResponse adcreativesAddResponse =
              parseResponse(adcreativeApiResponse.getBody(), AdcreativesAddResponse.class);
          if (adcreativesAddResponse != null) {
            rapidAddAdsResponse.adcreativesAddResponseData = adcreativesAddResponse.getData();
            batchAddResult.adcreativeId = adcreativesAddResponse.getData().getAdcreativeId();
          } else if (lastException.get() instanceof ApiException) {
            batchAddResult.adcreativeId = getFailedAdcreative(accountId, campaignId);
          }
        }

        if (batchAddResult.adgroupId != null && batchAddResult.adcreativeId != null) {
          return batchAddResult;
        }
      } catch (ApiException | TencentAdsResponseException exception) {
        // batch request api error
        if (i == ATTEMPT_TIMES - 1) {
          exception.printStackTrace();
          throw new TencentAdsResponseException(exception.getMessage());
        }
      }
    }
    // add request api error
    throw new TencentAdsResponseException(lastException.get().getMessage());
  }

  protected <T> T parseResponse(String body, Type type) {
    try {
      String url = "http://ignored";
      Request request = new Request.Builder().url(url).build();
      ResponseBody responseBody = ResponseBody.create(MediaType.parse("text"), body);
      Response response =
          new Response.Builder()
              .request(request)
              .protocol(Protocol.HTTP_1_1)
              .code(200)
              .body(responseBody)
              .build();
      T addResponse = apiClient.handleResponse(response, type);
      handleResponse(gson.toJson(addResponse));
      return addResponse;
    } catch (ApiException | TencentAdsResponseException exception) {
      exception.printStackTrace();
      lastException.set(exception);
      return null;
    }
  }

  protected Long getFailedAdgroup(Long accountId, Long campaignId) {
    Long adgroupId = null;
    List<FilteringStruct> filtering =
        Collections.singletonList(
            new FilteringStruct()
                .field("campaign_id")
                .operator("EQUALS")
                .values(Collections.singletonList(String.valueOf(campaignId))));
    List<String> fields = Collections.singletonList("adgroup_id");
    for (int i = 0; i < ATTEMPT_TIMES; i++) {
      try {
        AdgroupsGetResponseData adgroupsGetResponse =
            adgroupsApi.adgroupsGet(accountId, filtering, null, null, null, null, fields);
        if (adgroupsGetResponse.getList() != null && adgroupsGetResponse.getList().size() == 1)
          adgroupId = adgroupsGetResponse.getList().get(0).getAdgroupId();
        break;
      } catch (ApiException | TencentAdsResponseException e) {
        if (i == ATTEMPT_TIMES - 1) {
          e.printStackTrace();
        }
      }
    }
    return adgroupId;
  }

  protected Long getFailedAdcreative(Long accountId, Long campaignId) {
    Long adcreativeId = null;
    List<FilteringStruct> filtering =
        Collections.singletonList(
            new FilteringStruct()
                .field("campaign_id")
                .operator("EQUALS")
                .values(Collections.singletonList(String.valueOf(campaignId))));
    List<String> fields = Collections.singletonList("adcreative_id");
    for (int i = 0; i < ATTEMPT_TIMES; i++) {
      try {
        AdcreativesGetResponseData adcreativesGetResponseData =
            adcreativesApi.adcreativesGet(
                accountId, filtering, null, null, null, null, null, fields);
        if (adcreativesGetResponseData.getList() != null
            && adcreativesGetResponseData.getList().size() == 1)
          adcreativeId = adcreativesGetResponseData.getList().get(0).getAdcreativeId();
        break;
      } catch (ApiException | TencentAdsResponseException e) {
        if (i == ATTEMPT_TIMES - 1) {
          e.printStackTrace();
        }
      }
    }
    return adcreativeId;
  }

  protected Long getFailedAd(Long accountId, Long campaignId) {
    Long adId = null;
    List<FilteringStruct> filtering =
        Collections.singletonList(
            new FilteringStruct()
                .field("campaign_id")
                .operator("EQUALS")
                .values(Collections.singletonList(String.valueOf(campaignId))));
    List<String> fields = Collections.singletonList("ad_id");
    for (int i = 0; i < ATTEMPT_TIMES; i++) {
      try {
        AdsGetResponseData adsGetResponseData =
            adApi.adsGet(accountId, filtering, null, null, null, null, fields);
        if (adsGetResponseData.getList() != null && adsGetResponseData.getList().size() == 1) {
          adId = adsGetResponseData.getList().get(0).getAdId();
        }
        break;
      } catch (ApiException | TencentAdsResponseException e) {
        if (i == ATTEMPT_TIMES - 1) {
          e.printStackTrace();
        }
      }
    }
    return adId;
  }

  protected CampaignsUpdateRequest buildCampaignUpdateRequest(
      Long accountId, Long campaignId, AdStatus status) {
    CampaignsUpdateRequest campaignsUpdateRequest =
        new CampaignsUpdateRequest().accountId(accountId).campaignId(campaignId);
    if (status == null) {
      status = AdStatus.NORMAL;
    }
    campaignsUpdateRequest.setConfiguredStatus(status);
    return campaignsUpdateRequest;
  }

  protected AdgroupsUpdateRequest buildAdgroupUpdateRequest(
      Long accountId, Long adgroupId, AdStatus status) {
    AdgroupsUpdateRequest adgroupsUpdateRequest =
        new AdgroupsUpdateRequest().accountId(accountId).adgroupId(adgroupId);
    if (status == null) {
      status = AdStatus.NORMAL;
    }
    adgroupsUpdateRequest.setConfiguredStatus(status);
    return adgroupsUpdateRequest;
  }

  protected AdsUpdateRequest buildAdsUpdateRequest(Long accountId, Long adId, AdStatus status) {
    if (status == null) {
      status = AdStatus.NORMAL;
    }
    AdsUpdateRequest adsUpdateRequest = new AdsUpdateRequest().accountId(accountId).adId(adId);
    adsUpdateRequest.setConfiguredStatus(status);
    return adsUpdateRequest;
  }

  protected void deleteAds(Long accoungId, Long adId) {
    AdsDeleteRequest adsDeleteRequest = new AdsDeleteRequest().accountId(accoungId).adId(adId);
    for (int i = 0; i < ATTEMPT_TIMES; i++) {
      try {
        adApi.adsDelete(adsDeleteRequest);
        break;
      } catch (ApiException | TencentAdsResponseException exception) {
        exception.printStackTrace();
      }
    }
  }

  protected void deleteAdgroup(Long accountId, Long adgroupId) {
    AdgroupsDeleteRequest adgroupsDeleteRequest =
        new AdgroupsDeleteRequest().accountId(accountId).adgroupId(adgroupId);
    for (int i = 0; i < ATTEMPT_TIMES; i++) {
      try {
        adgroupsApi.adgroupsDelete(adgroupsDeleteRequest);
        break;
      } catch (ApiException | TencentAdsResponseException exception) {
        exception.printStackTrace();
      }
    }
  }

  protected void deleteCampaign(Long accountId, Long campaignId) {
    CampaignsDeleteRequest campaignsDeleteRequest =
        new CampaignsDeleteRequest().accountId(accountId).campaignId(campaignId);
    for (int i = 0; i < ATTEMPT_TIMES; i++) {
      try {
        campaignsApi.campaignsDelete(campaignsDeleteRequest);
        break;
      } catch (ApiException | TencentAdsResponseException exception) {
        exception.printStackTrace();
      }
    }
  }

  protected void deleteAdcreative(Long accountId, Long adcreativeId) {
    AdcreativesDeleteRequest adcreativesDeleteRequest =
        new AdcreativesDeleteRequest().accountId(accountId).adcreativeId(adcreativeId);
    for (int i = 0; i < ATTEMPT_TIMES; i++) {
      try {
        adcreativesApi.adcreativesDelete(adcreativesDeleteRequest);
        break;
      } catch (ApiException | TencentAdsResponseException exception) {
        exception.printStackTrace();
      }
    }
  }

  public static class RapidAddAdsRequestData {
    public CampaignsAddRequest campaignsAddRequest;
    public AdgroupsAddRequest adgroupsAddRequest;
    public AdcreativesAddRequest adcreativesAddRequest;
    public AdsAddRequest adAddRequest;

    public RapidAddAdsRequestData() {}

    public RapidAddAdsRequestData(
        CampaignsAddRequest campaignsAddRequest,
        AdgroupsAddRequest adgroupsAddRequest,
        AdcreativesAddRequest adcreativesAddRequest,
        AdsAddRequest adAddRequest) {
      this.campaignsAddRequest = campaignsAddRequest;
      this.adgroupsAddRequest = adgroupsAddRequest;
      this.adcreativesAddRequest = adcreativesAddRequest;
      this.adAddRequest = adAddRequest;
    }
  }

  public static class RapidAddAdsResponseData {
    public CampaignsAddResponseData campaignsAddResponseData;
    public AdgroupsAddResponseData adgroupsAddResponseData;
    public AdcreativesAddResponseData adcreativesAddResponseData;
    public AdsAddResponseData adsAddResponseData;
  }
}

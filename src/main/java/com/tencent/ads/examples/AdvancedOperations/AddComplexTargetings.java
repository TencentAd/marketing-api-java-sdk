package com.tencent.ads.examples.AdvancedOperations;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.ApiException;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AgeStruct;
import com.tencent.ads.model.AudienceType;
import com.tencent.ads.model.CustomAudienceFilesAddResponseData;
import com.tencent.ads.model.CustomAudiencesAddRequest;
import com.tencent.ads.model.CustomAudiencesAddResponseData;
import com.tencent.ads.model.GeoLocations;
import com.tencent.ads.model.TargetingTagsGetListStruct;
import com.tencent.ads.model.TargetingTagsGetResponseData;
import com.tencent.ads.model.TargetingsAddRequest;
import com.tencent.ads.model.TargetingsAddResponseData;
import com.tencent.ads.model.WriteTargetingSetting;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * 本文件提供了一个创建定向的示例
 **/
public class AddComplexTargetings {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  // 本示例会提供创建两个定向人群包，其中一个是包含的人群包，另一个是排除的人群包
  public String AUDIENCE_FILE_POS_IMEI = "YOUR AUDIENCE FILE PATH";
  public String AUDIENCE_FILE_NEG_IMEI = "YOUR AUDIENCE FILE PATH";
  /**
   * TencentAds
   */
  public TencentAds tencentAds;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true));// debug==true 会打印请求详细信息
    this.tencentAds.useSandbox();// 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
  }

  /**
   * 创建定向
   *
   * @return 定向包id
   * @throws ApiException
   */
  public Long addComplexTargetings() throws ApiException {
    // 第一步，获取地域ID，用于地域定向，微信朋友圈广告必须
    List<String> regionNameList = Arrays.asList("北京市", "上海市", "广东省");
    List<Long> regionIdList = getTargetingRegion(regionNameList);

    // 第二步，创建人群包，可选，可创建定向用户群和排除用户群
    Long positionAudiences = addCustomAudience(AUDIENCE_FILE_POS_IMEI);
    Long negativeAudiences = addCustomAudience(AUDIENCE_FILE_NEG_IMEI);

    // 第三步，创建定向包
    Long targetingId = addTargeting(regionIdList, positionAudiences, negativeAudiences);
    return targetingId;
  }

  /**
   * 从区域名称得到区域定向ID
   *
   * @param regionNameList 区域名称列表
   * @return 区域定向ID
   * @throws ApiException
   */
  protected List<Long> getTargetingRegion(List<String> regionNameList) throws ApiException {
    List<Long> res = new ArrayList<Long>();
    TargetingTagsGetResponseData responseData = tencentAds.targetingTags()
        .targetingTagsGet("REGION", null, null);
    if (responseData != null && responseData.getList() != null) {
      for (TargetingTagsGetListStruct s : responseData.getList()) {
        if (regionNameList.contains(s.getName())) {
          res.add(s.getId());
        }
      }
    }
    return res;
  }

  /**
   * 从IMEI文件上传一个新的人群包
   *
   * @param audienceFilePath 文件地址
   * @return 人群id
   * @throws ApiException
   */
  protected Long addCustomAudience(String audienceFilePath) throws ApiException {
    CustomAudiencesAddRequest addRequest = new CustomAudiencesAddRequest();
    addRequest.setAccountId(ACCOUNT_ID);
    addRequest.setName("SDK sample aud" + UUID.randomUUID().toString().substring(0, 6));
    addRequest.setType(AudienceType.CUSTOMER_FILE);
    addRequest.setDescription("created by SDK samples");
    CustomAudiencesAddResponseData customAudiencesAddResponseData = tencentAds.customAudiences()
        .customAudiencesAdd(addRequest);
    if (customAudiencesAddResponseData != null
        && customAudiencesAddResponseData.getAudienceId() != null) {
      Long audienceId = customAudiencesAddResponseData.getAudienceId();
      CustomAudienceFilesAddResponseData customAudienceFilesAddResponseData = tencentAds
          .customAudienceFiles().customAudienceFilesAdd(ACCOUNT_ID, audienceId,
              "IMEI", new File(audienceFilePath), null, null, null);
      if (customAudienceFilesAddResponseData != null
          && customAudienceFilesAddResponseData.getCustomAudienceFileId() != null) {
        return audienceId;
      }
    }
    return null;
  }

  /**
   * 创建一个定向包
   *
   * @param regionIdList      区域定向ID
   * @param positionAudiences 定向用户群
   * @param negativeAudiences 排除用户群
   * @return 定向包id
   * @throws ApiException
   */
  protected Long addTargeting(List<Long> regionIdList, Long positionAudiences,
      Long negativeAudiences) throws ApiException {
    TargetingsAddRequest targetingsAddRequest = new TargetingsAddRequest();
    targetingsAddRequest.setAccountId(ACCOUNT_ID);
    targetingsAddRequest
        .setTargetingName("SDK sample targeting" + UUID.randomUUID().toString().substring(0, 6));
    targetingsAddRequest
        .setTargeting(new WriteTargetingSetting().gender(Arrays.asList("MALE"))
            .age(Arrays.asList(new AgeStruct().max(45L).min(23L)))
            .geoLocation(
                new GeoLocations().locationTypes(Arrays.asList("LIVE_IN")).regions(regionIdList))
            .userOs(Arrays.asList("IOS"))
            .customAudience(Arrays.asList(positionAudiences))
            .excludedCustomAudience(Arrays.asList(negativeAudiences)));
    targetingsAddRequest.setDescription("created by SDK samples");
    TargetingsAddResponseData targetingsAddResponseData = tencentAds.targetings()
        .targetingsAdd(targetingsAddRequest);
    if (targetingsAddResponseData != null) {
      return targetingsAddResponseData.getTargetingId();
    }
    return null;
  }

  public static void main(String[] args) {
    try {
      AddComplexTargetings addComplexTargetings = new AddComplexTargetings();
      addComplexTargetings.init();
      Long targetingId = addComplexTargetings.addComplexTargetings();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

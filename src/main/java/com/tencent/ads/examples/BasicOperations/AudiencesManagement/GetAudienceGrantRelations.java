package com.tencent.ads.examples.BasicOperations.AudiencesManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.FilteringStruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetAudienceGrantRelations {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public List<FilteringStruct> filtering = new ArrayList<>();

  public Long page = null;

  public Long pageSize = null;

  public List<String> fields = Arrays.asList("audience_id", "grant_type", "grant_spec");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    String field = "audience_id";
    FilteringStruct filteringStruct = new FilteringStruct();
    filteringStruct.setField(field);
    String operator = "IN";
    filteringStruct.setOperator(operator);
    List<String> values = Arrays.asList("YOUR AUDIENCE ID");
    filteringStruct.setValues(values);
    filtering.add(filteringStruct);
  }

  public AudienceGrantRelationsGetResponseData getAudienceGrantRelations() throws Exception {
    AudienceGrantRelationsGetResponseData response =
        tencentAds
            .audienceGrantRelations()
            .audienceGrantRelationsGet(accountId, filtering, page, pageSize, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetAudienceGrantRelations getAudienceGrantRelations = new GetAudienceGrantRelations();
      getAudienceGrantRelations.init();
      AudienceGrantRelationsGetResponseData response =
          getAudienceGrantRelations.getAudienceGrantRelations();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

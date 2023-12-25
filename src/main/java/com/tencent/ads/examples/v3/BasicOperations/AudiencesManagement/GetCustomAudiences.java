package com.tencent.ads.examples.v3.BasicOperations.AudiencesManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.v3.TencentAds;
import java.util.Arrays;
import java.util.List;

public class GetCustomAudiences {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public Long audienceId = null;

  public Long page = null;

  public Long pageSize = null;

  public List<String> fields =
      Arrays.asList(
          "audience_id",
          "account_id",
          "name",
          "external_audience_id",
          "description",
          "type",
          "status",
          "error_code",
          "user_count",
          "created_time",
          "last_modified_time",
          "audience_spec");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public CustomAudiencesGetResponseData getCustomAudiences() throws Exception {
    CustomAudiencesGetResponseData response =
        tencentAds
            .customAudiences()
            .customAudiencesGet(accountId, audienceId, page, pageSize, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetCustomAudiences getCustomAudiences = new GetCustomAudiences();
      getCustomAudiences.init();
      CustomAudiencesGetResponseData response = getCustomAudiences.getCustomAudiences();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

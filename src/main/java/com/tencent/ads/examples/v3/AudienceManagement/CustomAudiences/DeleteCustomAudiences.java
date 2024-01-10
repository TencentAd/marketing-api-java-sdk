package com.tencent.ads.examples.v3.AudienceManagement.CustomAudiences;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.CustomAudiencesDeleteRequest;
import com.tencent.ads.model.v3.CustomAudiencesDeleteResponse;
import com.tencent.ads.v3.TencentAds;

public class DeleteCustomAudiences {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;
  public CustomAudiencesDeleteRequest data = new CustomAudiencesDeleteRequest();
  public Long audienceId = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setAccountId(accountId);

    data.setAudienceId(audienceId);
  }

  public CustomAudiencesDeleteResponse deleteCustomAudiences() throws Exception {
    CustomAudiencesDeleteResponse response =
        tencentAds.customAudiences().customAudiencesDelete(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      DeleteCustomAudiences deleteCustomAudiences = new DeleteCustomAudiences();
      deleteCustomAudiences.init();
      CustomAudiencesDeleteResponse response = deleteCustomAudiences.deleteCustomAudiences();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

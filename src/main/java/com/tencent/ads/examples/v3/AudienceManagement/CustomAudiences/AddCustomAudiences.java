package com.tencent.ads.examples.v3.AudienceManagement.CustomAudiences;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.CustomAudiencesAddRequest;
import com.tencent.ads.v3.TencentAds;

public class AddCustomAudiences {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;
  public CustomAudiencesAddRequest data = new CustomAudiencesAddRequest();
  public String name = "SDK人群5ede252a51ce5";
  public String description = "SDK sample";
  public AudienceType type = AudienceType.CUSTOMER_FILE;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setAccountId(accountId);

    data.setName(name);

    data.setDescription(description);

    data.setType(type);
  }

  public CustomAudiencesAddResponseData addCustomAudiences() throws Exception {
    CustomAudiencesAddResponseData response = tencentAds.customAudiences().customAudiencesAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddCustomAudiences addCustomAudiences = new AddCustomAudiences();
      addCustomAudiences.init();
      CustomAudiencesAddResponseData response = addCustomAudiences.addCustomAudiences();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

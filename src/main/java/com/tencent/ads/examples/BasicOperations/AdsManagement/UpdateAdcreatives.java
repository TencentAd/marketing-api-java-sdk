package com.tencent.ads.examples.BasicOperations.AdsManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.AdcreativesUpdateRequest;

public class UpdateAdcreatives {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;
  public AdcreativesUpdateRequest data = new AdcreativesUpdateRequest();
  public String title = "YOUR AD TEXT";
  public String description = "YOUR AD DESCRIPTION";
  public String pageUrl = "YOUR AD PAGE URL";
  public Long adcreativeId = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {
    data.setAccountId(accountId);

    AdcreativeCreativeElementsMp adcreativeElements = new AdcreativeCreativeElementsMp();
    adcreativeElements.setTitle(title);
    adcreativeElements.setDescription(description);
    data.setAdcreativeElements(adcreativeElements);

    PageSpec pageSpec = new PageSpec();
    pageSpec.setPageUrl(pageUrl);
    data.setPageSpec(pageSpec);

    data.setAdcreativeId(adcreativeId);
  }

  public AdcreativesUpdateResponseData updateAdcreatives() throws Exception {
    AdcreativesUpdateResponseData response = tencentAds.adcreatives().adcreativesUpdate(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      UpdateAdcreatives updateAdcreatives = new UpdateAdcreatives();
      updateAdcreatives.init();
      AdcreativesUpdateResponseData response = updateAdcreatives.updateAdcreatives();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

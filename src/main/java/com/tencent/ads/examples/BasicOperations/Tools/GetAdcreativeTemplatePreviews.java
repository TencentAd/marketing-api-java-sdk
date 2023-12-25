package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.AdcreativeTemplatePreviewsGetRequest;

public class GetAdcreativeTemplatePreviews {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public AdcreativeTemplatePreviewsGetRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public AdcreativeTemplatePreviewsGetResponseData getAdcreativeTemplatePreviews()
      throws Exception {
    AdcreativeTemplatePreviewsGetResponseData response =
        tencentAds.adcreativeTemplatePreviews().adcreativeTemplatePreviewsGet(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetAdcreativeTemplatePreviews getAdcreativeTemplatePreviews =
          new GetAdcreativeTemplatePreviews();
      getAdcreativeTemplatePreviews.init();
      AdcreativeTemplatePreviewsGetResponseData response =
          getAdcreativeTemplatePreviews.getAdcreativeTemplatePreviews();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

package com.tencent.ads.examples.v3.BusinessAssets.ConversionLinkAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.ConversionLinkAssetsUpdateRequest;
import com.tencent.ads.v3.TencentAds;

public class UpdateConversionLinkAssets {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public ConversionLinkAssetsUpdateRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public ConversionLinkAssetsUpdateResponseData updateConversionLinkAssets() throws Exception {
    ConversionLinkAssetsUpdateResponseData response =
        tencentAds.conversionLinkAssets().conversionLinkAssetsUpdate(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      UpdateConversionLinkAssets updateConversionLinkAssets = new UpdateConversionLinkAssets();
      updateConversionLinkAssets.init();
      ConversionLinkAssetsUpdateResponseData response =
          updateConversionLinkAssets.updateConversionLinkAssets();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

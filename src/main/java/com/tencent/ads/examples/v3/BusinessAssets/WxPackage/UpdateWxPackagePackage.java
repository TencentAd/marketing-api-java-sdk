package com.tencent.ads.examples.v3.BusinessAssets.WxPackage;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.WxPackagePackageUpdateRequest;
import com.tencent.ads.model.v3.WxPackagePackageUpdateResponse;
import com.tencent.ads.v3.TencentAds;

public class UpdateWxPackagePackage {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public WxPackagePackageUpdateRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public WxPackagePackageUpdateResponse updateWxPackagePackage() throws Exception {
    WxPackagePackageUpdateResponse response =
        tencentAds.wxPackagePackage().wxPackagePackageUpdate(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      UpdateWxPackagePackage updateWxPackagePackage = new UpdateWxPackagePackage();
      updateWxPackagePackage.init();
      WxPackagePackageUpdateResponse response = updateWxPackagePackage.updateWxPackagePackage();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

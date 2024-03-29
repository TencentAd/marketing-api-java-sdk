package com.tencent.ads.examples.v3.BusinessAssets.WxPackage;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.WxPackagePackageAddRequest;
import com.tencent.ads.model.v3.WxPackagePackageAddResponse;
import com.tencent.ads.v3.TencentAds;

public class AddWxPackagePackage {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public WxPackagePackageAddRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public WxPackagePackageAddResponse addWxPackagePackage() throws Exception {
    WxPackagePackageAddResponse response = tencentAds.wxPackagePackage().wxPackagePackageAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddWxPackagePackage addWxPackagePackage = new AddWxPackagePackage();
      addWxPackagePackage.init();
      WxPackagePackageAddResponse response = addWxPackagePackage.addWxPackagePackage();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

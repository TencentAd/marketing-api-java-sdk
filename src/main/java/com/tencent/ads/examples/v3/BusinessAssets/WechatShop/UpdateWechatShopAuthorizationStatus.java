package com.tencent.ads.examples.v3.BusinessAssets.WechatShop;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.WechatShopAuthorizationStatusUpdateRequest;
import com.tencent.ads.v3.TencentAds;

public class UpdateWechatShopAuthorizationStatus {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public WechatShopAuthorizationStatusUpdateRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public WechatShopAuthorizationStatusUpdateResponseData updateWechatShopAuthorizationStatus()
      throws Exception {
    WechatShopAuthorizationStatusUpdateResponseData response =
        tencentAds.wechatShopAuthorizationStatus().wechatShopAuthorizationStatusUpdate(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      UpdateWechatShopAuthorizationStatus updateWechatShopAuthorizationStatus =
          new UpdateWechatShopAuthorizationStatus();
      updateWechatShopAuthorizationStatus.init();
      WechatShopAuthorizationStatusUpdateResponseData response =
          updateWechatShopAuthorizationStatus.updateWechatShopAuthorizationStatus();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

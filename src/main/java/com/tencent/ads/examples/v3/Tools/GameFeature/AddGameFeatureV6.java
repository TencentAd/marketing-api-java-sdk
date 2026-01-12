package com.tencent.ads.examples.v3.Tools.GameFeature;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.GameFeatureV6AddRequest;
import com.tencent.ads.v3.TencentAds;

public class AddGameFeatureV6 {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public GameFeatureV6AddRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public GameFeatureV6AddResponseData addGameFeatureV6() throws Exception {
    GameFeatureV6AddResponseData response = tencentAds.gameFeatureV6().gameFeatureV6Add(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddGameFeatureV6 addGameFeatureV6 = new AddGameFeatureV6();
      addGameFeatureV6.init();
      GameFeatureV6AddResponseData response = addGameFeatureV6.addGameFeatureV6();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

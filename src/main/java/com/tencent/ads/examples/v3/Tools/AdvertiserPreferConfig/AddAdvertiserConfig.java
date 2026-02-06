package com.tencent.ads.examples.v3.Tools.AdvertiserPreferConfig;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.AdvertiserConfigAddRequest;
import com.tencent.ads.model.v3.AdvertiserConfigAddResponse;
import com.tencent.ads.v3.TencentAds;

public class AddAdvertiserConfig {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public AdvertiserConfigAddRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public AdvertiserConfigAddResponse addAdvertiserConfig() throws Exception {
    AdvertiserConfigAddResponse response = tencentAds.advertiserConfig().advertiserConfigAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddAdvertiserConfig addAdvertiserConfig = new AddAdvertiserConfig();
      addAdvertiserConfig.init();
      AdvertiserConfigAddResponse response = addAdvertiserConfig.addAdvertiserConfig();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

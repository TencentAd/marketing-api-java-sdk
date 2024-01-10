package com.tencent.ads.examples.v3.Tools.GameFeature;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.v3.TencentAds;
import java.util.List;

public class GetGameFeature {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public String marketingTargetType = null;

  public String marketingTargetDetailId = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public GameFeatureGetResponseData getGameFeature() throws Exception {
    GameFeatureGetResponseData response =
        tencentAds
            .gameFeature()
            .gameFeatureGet(accountId, marketingTargetType, marketingTargetDetailId, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetGameFeature getGameFeature = new GetGameFeature();
      getGameFeature.init();
      GameFeatureGetResponseData response = getGameFeature.getGameFeature();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

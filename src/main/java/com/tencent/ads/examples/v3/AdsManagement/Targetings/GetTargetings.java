package com.tencent.ads.examples.v3.AdsManagement.Targetings;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.TargetingsGetRequest;
import com.tencent.ads.v3.TencentAds;

public class GetTargetings {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;
  public TargetingsGetRequest data = new TargetingsGetRequest();

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setAccountId(accountId);
  }

  public TargetingsGetResponseData getTargetings() throws Exception {
    TargetingsGetResponseData response = tencentAds.targetings().targetingsGet(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetTargetings getTargetings = new GetTargetings();
      getTargetings.init();
      TargetingsGetResponseData response = getTargetings.getTargetings();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

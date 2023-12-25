package com.tencent.ads.examples.BasicOperations.Adsmanagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.AdsUpdateRequest;

public class UpdateAds {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long adId = null;
  public AdsUpdateRequest data = new AdsUpdateRequest();
  public Long accountId = null;
  public AdStatus configuredStatus = AdStatus.SUSPEND;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setAdId(adId);

    data.setAccountId(accountId);

    data.setConfiguredStatus(configuredStatus);
  }

  public AdsUpdateResponseData updateAds() throws Exception {
    AdsUpdateResponseData response = tencentAds.ads().adsUpdate(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      UpdateAds updateAds = new UpdateAds();
      updateAds.init();
      AdsUpdateResponseData response = updateAds.updateAds();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

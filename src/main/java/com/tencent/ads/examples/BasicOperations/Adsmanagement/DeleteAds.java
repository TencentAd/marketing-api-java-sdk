package com.tencent.ads.examples.BasicOperations.Adsmanagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.AdsDeleteRequest;

public class DeleteAds {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long adId = null;
  public AdsDeleteRequest data = new AdsDeleteRequest();
  public Long accountId = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setAdId(adId);

    data.setAccountId(accountId);
  }

  public AdsDeleteResponseData deleteAds() throws Exception {
    AdsDeleteResponseData response = tencentAds.ads().adsDelete(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      DeleteAds deleteAds = new DeleteAds();
      deleteAds.init();
      AdsDeleteResponseData response = deleteAds.deleteAds();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

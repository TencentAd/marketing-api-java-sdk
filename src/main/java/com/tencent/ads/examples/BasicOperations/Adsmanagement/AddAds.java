package com.tencent.ads.examples.BasicOperations.Adsmanagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.AdsAddRequest;

public class AddAds {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;
  public AdsAddRequest data = new AdsAddRequest();
  public Long adgroupId = null;
  public Long adcreativeId = null;
  public String adName = "SDK广告5ede2529196c5";

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setAccountId(accountId);

    data.setAdgroupId(adgroupId);

    data.setAdcreativeId(adcreativeId);

    data.setAdName(adName);
  }

  public AdsAddResponseData addAds() throws Exception {
    AdsAddResponseData response = tencentAds.ads().adsAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddAds addAds = new AddAds();
      addAds.init();
      AdsAddResponseData response = addAds.addAds();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

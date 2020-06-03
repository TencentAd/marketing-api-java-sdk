package com.tencent.ads.examples.BasicOperations.AdsManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AdStatus;
import com.tencent.ads.model.AdsUpdateRequest;
import com.tencent.ads.model.AdsUpdateResponseData;

/**
 * 本文件提供了一个修改广告(Ad)的简单示例
 **/
public class UpdateAds {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * NEED UPDATE AD ID
   */
  public Long AD_ID = 0L;
  /**
   * 暂停
   */
  public AdStatus CONFIGURED_STATUS = AdStatus.SUSPEND;
  /**
   * TencentAds
   */
  public TencentAds tencentAds;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true));// debug==true 会打印请求详细信息
    this.tencentAds.useSandbox();// 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
  }

  public Long updateAds() throws Exception {
    AdsUpdateRequest data = new AdsUpdateRequest();
    data.setAccountId(ACCOUNT_ID);
    data.setAdId(AD_ID);
    data.setConfiguredStatus(CONFIGURED_STATUS);
    AdsUpdateResponseData response = tencentAds.ads().adsUpdate(data);
    if (response != null) {
      return response.getAdId();
    }
    return null;
  }

  public static void main(String[] args) {
    try {
      UpdateAds updateAds = new UpdateAds();
      updateAds.init();
      Long adId = updateAds.updateAds();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

package com.tencent.ads.examples.BasicOperations.AdsManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AdsDeleteRequest;
import com.tencent.ads.model.AdsDeleteResponseData;

/**
 * 本文件提供了一个删除广告(Ad)的简单示例
 **/
public class DeleteAds {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * NEED DELETE AD ID
   */
  public Long AD_ID = 0L;
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

  public Long deleteAds() throws Exception {
    AdsDeleteRequest data = new AdsDeleteRequest();
    data.setAccountId(ACCOUNT_ID);
    data.setAdId(AD_ID);
    AdsDeleteResponseData response = tencentAds.ads().adsDelete(data);
    if (response != null) {
      return response.getAdId();
    }
    return null;
  }

  public static void main(String[] args) {
    try {
      DeleteAds deleteAds = new DeleteAds();
      deleteAds.init();
      Long adId = deleteAds.deleteAds();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

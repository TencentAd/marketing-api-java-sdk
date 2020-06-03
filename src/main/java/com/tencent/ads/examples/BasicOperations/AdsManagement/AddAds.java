package com.tencent.ads.examples.BasicOperations.AdsManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AdsAddRequest;
import com.tencent.ads.model.AdsAddResponseData;
import java.util.UUID;

/**
 * 本文件提供了一个创建广告(Ad)的简单示例
 **/
public class AddAds {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;

  /**
   * YOUR CAMPAIGN ID
   */
  public Long CAMPAIGN_ID = 0L;
  /**
   * YOUR ADGROUP ID
   */
  public Long ADGROUP_ID = 0L;
  /**
   * YOUR ADCREATIVE ID
   */
  public Long ADCREATIVE_ID = 0L;
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

  public Long addAds() throws Exception {
    AdsAddRequest data = new AdsAddRequest();
    data.setAccountId(ACCOUNT_ID);
    data.setAdgroupId(ADGROUP_ID);
    data.setAdcreativeId(ADCREATIVE_ID);
    data.setAdName("SDK广告" + UUID.randomUUID().toString());
    AdsAddResponseData response = tencentAds.ads().adsAdd(data);
    if (response != null) {
      return response.getAdId();
    }
    return null;
  }

  public static void main(String[] args) {
    try {
      AddAds addAds = new AddAds();
      addAds.init();
      Long adId = addAds.addAds();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}

package com.tencent.ads.examples.BasicOperations.AdsManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AdcreativesDeleteRequest;
import com.tencent.ads.model.AdcreativesDeleteResponseData;

/**
 * 本文件提供了一个删除广告创意(Adcreative)的简单示例
 **/
public class DeleteAdcreatives {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * NEED DELETE ADCREATIVE ID
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

  public Long deleteAdcreatives() throws Exception {
    AdcreativesDeleteRequest data = new AdcreativesDeleteRequest();
    data.setAccountId(ACCOUNT_ID);
    data.setAdcreativeId(ADCREATIVE_ID);
    AdcreativesDeleteResponseData response = tencentAds.adcreatives().adcreativesDelete(data);
    if (response != null) {
      return response.getAdcreativeId();
    }
    return null;
  }

  public static void main(String[] args) {
    try {
      DeleteAdcreatives deleteAdcreatives = new DeleteAdcreatives();
      deleteAdcreatives.init();
      Long adcreativeId = deleteAdcreatives.deleteAdcreatives();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

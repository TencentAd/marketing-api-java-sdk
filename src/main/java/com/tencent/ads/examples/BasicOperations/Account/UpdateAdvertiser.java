package com.tencent.ads.examples.BasicOperations.Account;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AdvertiserUpdateRequest;
import com.tencent.ads.model.AdvertiserUpdateResponseData;

/**
 * 本文件提供了一个修改广告主(Advertiser)的简单示例
 */
public class UpdateAdvertiser {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * 要修改的业务介绍页地址
   */
  public String INTRODUCTION_URL = "YOUR INTRODUCTION PAGE URL";
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

  public Long updateAdvertiser() throws Exception {
    AdvertiserUpdateRequest data = new AdvertiserUpdateRequest();
    data.setAccountId(ACCOUNT_ID);
    data.setIntroductionUrl(INTRODUCTION_URL);
    AdvertiserUpdateResponseData response = tencentAds.advertiser().advertiserUpdate(data);
    if (response != null) {
      return response.getAccountId();
    }
    return null;
  }

  public static void main(String[] args) {
    try {
      UpdateAdvertiser UpdateAdvertiser = new UpdateAdvertiser();
      UpdateAdvertiser.init();
      Long accountId = UpdateAdvertiser.updateAdvertiser();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
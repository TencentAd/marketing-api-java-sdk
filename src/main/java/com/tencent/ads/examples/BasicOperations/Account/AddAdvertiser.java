package com.tencent.ads.examples.BasicOperations.Account;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AdvertiserAddRequest;
import com.tencent.ads.model.AdvertiserAddResponseData;

/**
 * 本文件提供了一个创建广告主(Advertiser)的简单示例
 */
public class AddAdvertiser {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * 企业名称
   */
  public String CORPORATION_NAME = "YOUR CORPORATION NAME";
  /**
   * 营业执照图片ID
   */
  public String CERTIFICATION_IMAGE_ID = "YOUR CERTIFICATION IMAGE ID";
  /**
   * 行业ID
   */
  public Long SYSTEM_INDUSTRY_ID = 0L;
  /**
   * 业务介绍页地址
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

  public Long addAdvertiser() throws Exception {
    AdvertiserAddRequest data = new AdvertiserAddRequest();
    data.setCorporationName(CORPORATION_NAME);
    data.setCertificationImageId(CERTIFICATION_IMAGE_ID);
    data.setSystemIndustryId(SYSTEM_INDUSTRY_ID);
    data.setIntroductionUrl(INTRODUCTION_URL);
    AdvertiserAddResponseData response = tencentAds.advertiser().advertiserAdd(data);
    if (response != null) {
      return response.getAccountId();
    }
    return null;
  }

  public static void main(String[] args) {
    try {
      AddAdvertiser AddAdvertiser = new AddAdvertiser();
      AddAdvertiser.init();
      Long accountId = AddAdvertiser.addAdvertiser();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
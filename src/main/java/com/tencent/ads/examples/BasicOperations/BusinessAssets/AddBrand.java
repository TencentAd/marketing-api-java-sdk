package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.BrandAddResponseData;
import java.io.File;

/**
 * 本文件提供了一个创建品牌形象(Brand)的简单示例
 */
public class AddBrand {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR BRAND NAME
   */
  public String BRAND_NAME = "YOUR BRAND NAME";
  /**
   * YOUR BRAND IMAGE FILE PATH
   */
  public String IMAGE_FILE = "YOUR BRAND IMAGE FILE PATH";
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

  public BrandAddResponseData addBrand() throws Exception {
    Long accountId = ACCOUNT_ID;
    String name = BRAND_NAME;
    File brandImageFile = new File(IMAGE_FILE);
    BrandAddResponseData response = tencentAds.brand().brandAdd(accountId, name, brandImageFile);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddBrand addBrand = new AddBrand();
      addBrand.init();
      BrandAddResponseData responseData = addBrand.addBrand();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.BrandGetResponseData;
import java.util.Arrays;

/*****
 * 本文件提供了一个获取品牌形象(Brand)列表的简单示例
 */
public class GetBrand {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
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

  public BrandGetResponseData getBrand() throws Exception {
    BrandGetResponseData response = tencentAds.brand().brandGet(ACCOUNT_ID, null, null,
        Arrays.asList("account_id", "name", "image_id", "width", "height", "image_url",
            "created_time"));

    return response;

  }

  public static void main(String[] args) {
    try {
      GetBrand getBrand = new GetBrand();
      getBrand.init();
      BrandGetResponseData response = getBrand.getBrand();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.ProductsSystemStatusGetResponseData;
import java.util.Arrays;


/*****
 * 本文件提供了一个获取商品审核状态(Product system status)列表的简单示例
 */
public class GetProductsSystemStatus {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR PRODUCT CATALOG ID
   */
  public Long PRODUCT_CATALOG_ID = 0L; // 商品库ID
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

  public ProductsSystemStatusGetResponseData getProductsSystemStatus() throws Exception {
    ProductsSystemStatusGetResponseData response = tencentAds.productsSystemStatus()
        .productsSystemStatusGet(ACCOUNT_ID,
            PRODUCT_CATALOG_ID, null, null, null,
            Arrays.asList("feed_id", "product_id", "system_status", "reject_message"));
    return response;
  }

  public static void main(String[] args) {
    try {
      GetProductsSystemStatus getProductsSystemStatus = new GetProductsSystemStatus();
      getProductsSystemStatus.init();
      ProductsSystemStatusGetResponseData response = getProductsSystemStatus
          .getProductsSystemStatus();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
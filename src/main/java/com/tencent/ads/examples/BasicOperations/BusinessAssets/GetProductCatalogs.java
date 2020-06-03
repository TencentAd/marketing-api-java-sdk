package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.ProductCatalogsGetResponseData;
import java.util.Arrays;

/*****
 * 本文件提供了一个获取商品库(Product catalog)列表的简单示例
 */
public class GetProductCatalogs {

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

  public ProductCatalogsGetResponseData getProductCatalogs() throws Exception {
    ProductCatalogsGetResponseData response = tencentAds.productCatalogs()
        .productCatalogsGet(ACCOUNT_ID, null, null,
            Arrays.asList("product_catalog_id", "product_catalog_name", "product_catalog_type",
                "product_catalog_vertical", "product_catalog_status", "product_recommend_methods",
                "deep_link_enabled"));
    return response;

  }

  public static void main(String[] args) {
    try {
      GetProductCatalogs getProductCatalogs = new GetProductCatalogs();
      getProductCatalogs.init();
      ProductCatalogsGetResponseData response = getProductCatalogs.getProductCatalogs();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

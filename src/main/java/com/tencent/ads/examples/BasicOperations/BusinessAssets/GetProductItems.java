package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.ProductItemsGetResponseData;
import java.util.Arrays;

/*****
 * 本文件提供了一个获取商品(Product item)列表的简单示例
 */
public class GetProductItems {

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

  public ProductItemsGetResponseData getProductItems() throws Exception {
    ProductItemsGetResponseData response = tencentAds.productItems()
        .productItemsGet(ACCOUNT_ID, PRODUCT_CATALOG_ID,
            null, Arrays.asList("product_outer_id", "product_name", "product_image_url"));
    return response;

  }

  public static void main(String[] args) {
    try {
      GetProductItems getProductItems = new GetProductItems();
      getProductItems.init();
      ProductItemsGetResponseData response = getProductItems.getProductItems();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

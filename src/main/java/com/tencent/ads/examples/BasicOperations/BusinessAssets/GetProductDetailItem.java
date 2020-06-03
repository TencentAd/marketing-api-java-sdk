package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.ProductItemsDetailGetResponseData;
import java.util.Arrays;


/*****
 * 本文件提供了一个获取商品详情(Product detail item)的简单示例
 */
public class GetProductDetailItem {

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
   * YOUR PRODUCT ID
   */
  public String PRODUCT_ID = "YOUR PRODUCT ID"; // 商品ID(自有ID)
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

  public ProductItemsDetailGetResponseData getProductDetailItem() throws Exception {
    ProductItemsDetailGetResponseData response = tencentAds.productItemsDetail()
        .productItemsDetailGet(ACCOUNT_ID,
            PRODUCT_CATALOG_ID, PRODUCT_ID,
            Arrays.asList("feed_id", "system_status", "reject_message", "product_item_spec"));
    return response;

  }

  public static void main(String[] args) {
    try {
      GetProductDetailItem getProductDetailItem = new GetProductDetailItem();
      getProductDetailItem.init();
      ProductItemsDetailGetResponseData response = getProductDetailItem.getProductDetailItem();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

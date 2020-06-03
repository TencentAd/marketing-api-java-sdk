package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.ProductItemsUpdateRequest;
import com.tencent.ads.model.ProductItemsUpdateResponse;

/*****
 * 本文件提供了一个修改商品(Product item)的简单示例
 */
public class UpdateProductItems {

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
   * PRODUCT_STOCK
   */
  public Long PRODUCT_STOCK = 20L; // 要修改的商品库存
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

  public ProductItemsUpdateResponse updateProductItems() throws Exception {
    ProductItemsUpdateRequest data = new ProductItemsUpdateRequest();
    data.accountId(ACCOUNT_ID);
    data.catalogId(PRODUCT_CATALOG_ID);
    data.productOuterId(PRODUCT_ID);
    data.stockVolume(PRODUCT_STOCK);
    ProductItemsUpdateResponse response = tencentAds.productItems().productItemsUpdate(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      UpdateProductItems updateProductItems = new UpdateProductItems();
      updateProductItems.init();
      ProductItemsUpdateResponse response = updateProductItems.updateProductItems();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

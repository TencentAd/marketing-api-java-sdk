package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.ProductItemSpec;
import com.tencent.ads.model.ProductItemsAddRequest;
import com.tencent.ads.model.ProductItemsAddResponseData;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;

/*****
 * 本文件提供了一个创建商品(Product item)的简单示例
 */
public class AddProductItems {

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
   * YOUR PRODUCT NAME
   */
  public String PRODUCT_NAME = "YOUR PRODUCT NAME"; // 商品名称
  /**
   * YOUR PRODUCT IMAGE URL
   */
  public String PRODUCT_IMAGE_URL = "YOUR PRODUCT IMAGE URL"; // 商品主图
  /**
   * PRODUCT_STOCK
   */
  public Long PRODUCT_STOCK = 10L; // 商品库存
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

  public ProductItemsAddResponseData addProductItems() throws Exception {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Calendar c = Calendar.getInstance();
    c.add(Calendar.DATE, 365);
    String expirationTime = sdf.format(c.getTime());
    ProductItemsAddRequest data = new ProductItemsAddRequest();
    data.accountId(ACCOUNT_ID);
    data.productCatalogId(PRODUCT_CATALOG_ID);
    data.productItemSpecList(Arrays.asList(
        new ProductItemSpec().productOuterId(PRODUCT_ID).productName(PRODUCT_NAME)
            .expirationTime(expirationTime).stockVolume(PRODUCT_STOCK).imageUrl(PRODUCT_IMAGE_URL)
            .description("Sdk sample")));

    ProductItemsAddResponseData response = tencentAds.productItems().productItemsAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddProductItems addProductItems = new AddProductItems();
      addProductItems.init();
      ProductItemsAddResponseData response = addProductItems.addProductItems();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

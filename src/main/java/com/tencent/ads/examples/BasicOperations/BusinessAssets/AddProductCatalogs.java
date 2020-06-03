package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.CatalogIndustry;
import com.tencent.ads.model.CatalogScale;
import com.tencent.ads.model.CatalogType;
import com.tencent.ads.model.ProductCatalogsAddRequest;
import com.tencent.ads.model.ProductCatalogsAddResponseData;
import java.util.UUID;

/*****
 * 本文件提供了一个创建商品库(Product catalog)的简单示例
 */
public class AddProductCatalogs {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * CATALOG_SCALE_TYPE
   */
  public CatalogScale CATALOG_SCALE_TYPE = CatalogScale.NORMAL; // 商品库规模
  /**
   * YOUR CATALOG_TYPE
   */
  public CatalogType CATALOG_TYPE = CatalogType.CATALOG_TYPE_STANDARD; // 商品库类型
  /**
   * YOUR INDUSTRY_TYPE
   */
  public CatalogIndustry INDUSTRY_TYPE = CatalogIndustry.INDUSTRY_TYPE_ECOMMERCE; // 商品库行业类型
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

  public ProductCatalogsAddResponseData addProductCatalogs() throws Exception {
    ProductCatalogsAddRequest data = new ProductCatalogsAddRequest();
    data.accountId(ACCOUNT_ID);
    data.catalogName("SDK商品库" + UUID.randomUUID().toString().substring(0, 10));
    data.industryType(INDUSTRY_TYPE);
    data.catalogScaleType(CATALOG_SCALE_TYPE);
    data.catalogType(CATALOG_TYPE);
    ProductCatalogsAddResponseData response = tencentAds.productCatalogs().productCatalogsAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddProductCatalogs addProductCatalogs = new AddProductCatalogs();
      addProductCatalogs.init();
      ProductCatalogsAddResponseData response = addProductCatalogs.addProductCatalogs();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
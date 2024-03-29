package com.tencent.ads.examples.v3.BusinessAssets.ProductCatalog;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.ProductCatalogsAddRequest;
import com.tencent.ads.v3.TencentAds;

public class AddProductCatalogs {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public String catalogName = "SDK商品库5ede252bae6f6";
  public ProductCatalogsAddRequest data = new ProductCatalogsAddRequest();
  public Long accountId = null;
  public DpaApiCatalogType catalogType = DpaApiCatalogType.STANDARD;
  public DpaCatalogIndustry industryType = DpaCatalogIndustry.ECOMMERCE;
  public CatalogScale catalogScaleType = CatalogScale.NORMAL;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setCatalogName(catalogName);

    data.setAccountId(accountId);

    data.setCatalogType(catalogType);

    data.setIndustryType(industryType);

    data.setCatalogScaleType(catalogScaleType);
  }

  public ProductCatalogsAddResponseData addProductCatalogs() throws Exception {
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

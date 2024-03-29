package com.tencent.ads.examples.v3.BusinessAssets.ProductCatalog;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.ProductItemsUpdateRequest;
import com.tencent.ads.model.v3.ProductItemsUpdateResponse;
import com.tencent.ads.v3.TencentAds;

public class UpdateProductItems {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long catalogId = null;
  public ProductItemsUpdateRequest data = new ProductItemsUpdateRequest();
  public String productOuterId = "YOUR PRODUCT ID";
  public Long accountId = null;
  public Long stockVolume = 20L;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setCatalogId(catalogId);

    data.setProductOuterId(productOuterId);

    data.setAccountId(accountId);

    data.setStockVolume(stockVolume);
  }

  public ProductItemsUpdateResponse updateProductItems() throws Exception {
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

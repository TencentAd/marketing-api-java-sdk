package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.ProductItemsAddRequest;
import java.util.ArrayList;
import java.util.List;

public class AddProductItems {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long productCatalogId = null;
  public ProductItemsAddRequest data = new ProductItemsAddRequest();
  public Long accountId = null;
  public String productOuterId = "YOUR PRODUCT ID";
  public String productName = "YOUR PRODUCT NAME";
  public String expirationTime = "2021-06-08 11:46:51";
  public Long stockVolume = 10L;
  public String imageUrl = "YOUR PRODUCT IMAGE URL";
  public String description = "SDK sample";

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setProductCatalogId(productCatalogId);

    data.setAccountId(accountId);

    ProductItemSpec productItemSpec = new ProductItemSpec();
    productItemSpec.setProductOuterId(productOuterId);
    productItemSpec.setProductName(productName);
    productItemSpec.setExpirationTime(expirationTime);
    productItemSpec.setStockVolume(stockVolume);
    productItemSpec.setImageUrl(imageUrl);
    productItemSpec.setDescription(description);
    List<ProductItemSpec> productItemSpecList = new ArrayList<>();
    productItemSpecList.add(productItemSpec);
    data.setProductItemSpecList(productItemSpecList);
  }

  public ProductItemsAddResponseData addProductItems() throws Exception {
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

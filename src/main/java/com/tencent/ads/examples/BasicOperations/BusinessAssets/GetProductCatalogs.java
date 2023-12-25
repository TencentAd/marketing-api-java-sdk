package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import java.util.Arrays;
import java.util.List;

public class GetProductCatalogs {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public Long catalogId = null;

  public String catalogName = null;

  public Long page = null;

  public Long pageSize = null;

  public List<String> fields =
      Arrays.asList(
          "product_catalog_id",
          "product_catalog_name",
          "product_catalog_type",
          "product_catalog_vertical",
          "product_catalog_status",
          "product_recommend_methods",
          "deep_link_enabled");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public ProductCatalogsGetResponseData getProductCatalogs() throws Exception {
    ProductCatalogsGetResponseData response =
        tencentAds
            .productCatalogs()
            .productCatalogsGet(accountId, catalogId, catalogName, page, pageSize, fields);
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

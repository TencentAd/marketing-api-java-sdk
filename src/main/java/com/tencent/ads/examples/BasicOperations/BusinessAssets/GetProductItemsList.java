package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import java.util.List;

public class GetProductItemsList {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public Long productCatalogId = null;

  public Long pageSize = null;

  public Long page = null;

  public String sortByProductLastModTime = null;

  public String sortByProductName = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {}

  public ProductItemsListGetResponseData getProductItemsList() throws Exception {
    ProductItemsListGetResponseData response =
        tencentAds
            .productItemsList()
            .productItemsListGet(
                accountId,
                productCatalogId,
                pageSize,
                page,
                sortByProductLastModTime,
                sortByProductName,
                fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetProductItemsList getProductItemsList = new GetProductItemsList();
      getProductItemsList.init();
      ProductItemsListGetResponseData response = getProductItemsList.getProductItemsList();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

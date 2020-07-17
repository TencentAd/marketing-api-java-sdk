package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import java.util.Arrays;
import java.util.List;

public class GetProductItemsDetail {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public Long productCatalogId = null;

  public String productOuterId = "YOUR PRODUCT ID";

  public List<String> fields =
      Arrays.asList("feed_id", "system_status", "reject_message", "product_item_spec");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {}

  public ProductItemsDetailGetResponseData getProductItemsDetail() throws Exception {
    ProductItemsDetailGetResponseData response =
        tencentAds
            .productItemsDetail()
            .productItemsDetailGet(accountId, productCatalogId, productOuterId, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetProductItemsDetail getProductItemsDetail = new GetProductItemsDetail();
      getProductItemsDetail.init();
      ProductItemsDetailGetResponseData response = getProductItemsDetail.getProductItemsDetail();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

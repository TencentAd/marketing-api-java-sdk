package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import java.util.Arrays;
import java.util.List;

public class GetProductsSystemStatus {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public Long productCatalogId = null;

  public Long feedId = null;

  public Long page = null;

  public Long pageSize = null;

  public List<String> fields =
      Arrays.asList("feed_id", "product_id", "system_status", "reject_message");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {}

  public ProductsSystemStatusGetResponseData getProductsSystemStatus() throws Exception {
    ProductsSystemStatusGetResponseData response =
        tencentAds
            .productsSystemStatus()
            .productsSystemStatusGet(accountId, productCatalogId, feedId, page, pageSize, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetProductsSystemStatus getProductsSystemStatus = new GetProductsSystemStatus();
      getProductsSystemStatus.init();
      ProductsSystemStatusGetResponseData response =
          getProductsSystemStatus.getProductsSystemStatus();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

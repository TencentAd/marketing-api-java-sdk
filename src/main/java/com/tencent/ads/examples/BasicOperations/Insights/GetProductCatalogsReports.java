package com.tencent.ads.examples.BasicOperations.Insights;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.ProductCatalogsReportsGetListStruct;
import com.tencent.ads.model.ProductCatalogsReportsGetResponseData;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetProductCatalogsReports {

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
   * REPORT START DATE
   */
  public String START_DATE = "REPORT START DATE"; // 报表开始日期 YYYY-MM-DDD
  /**
   * REPORT END DATE
   */
  public String END_DATE = "REPORT END DATE"; // 报表结束日期 YYYY-MM-DDD
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

  public ProductCatalogsReportsGetResponseData getProductCatalogsReports() throws Exception {
    Map<String, Object> dateRange = new HashMap<>();
    dateRange.put("start_date", START_DATE);
    dateRange.put("end_date", END_DATE);
    ProductCatalogsReportsGetResponseData response = tencentAds.productCatalogsReports()
        .productCatalogsReportsGet(ACCOUNT_ID,
            PRODUCT_CATALOG_ID, dateRange, null, null, null, Arrays
                .asList("date", "product_catalog_id", "product_outer_id", "view_count",
                    "valid_click_count", "ctr", "cpc", "cost"));

    return response;
  }

  public static void main(String[] args) {
    try {
      GetProductCatalogsReports getProductCatalogsReports = new GetProductCatalogsReports();
      getProductCatalogsReports.init();
      ProductCatalogsReportsGetResponseData response = getProductCatalogsReports
          .getProductCatalogsReports();
      if (response != null) {
        List<ProductCatalogsReportsGetListStruct> list = response.getList();
      }
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
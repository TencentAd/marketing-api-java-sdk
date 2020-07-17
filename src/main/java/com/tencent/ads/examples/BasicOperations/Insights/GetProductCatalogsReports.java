package com.tencent.ads.examples.BasicOperations.Insights;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.FilteringStruct;
import com.tencent.ads.model.OrderByStruct;
import com.tencent.ads.model.ReportDateRange;
import java.util.Arrays;
import java.util.List;

public class GetProductCatalogsReports {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public Long productCatalogId = null;

  public ReportDateRange dateRange = new ReportDateRange();

  public List<FilteringStruct> filtering = null;

  public List<String> groupBy = null;

  public List<OrderByStruct> orderBy = null;

  public List<String> fields =
      Arrays.asList(
          "date",
          "product_catalog_id",
          "product_outer_id",
          "view_count",
          "valid_click_count",
          "ctr",
          "cpc",
          "cost");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {
    String startDate = "REPORT START DATE";
    dateRange.setStartDate(startDate);
    String endDate = "REPORT END DATE";
    dateRange.setEndDate(endDate);
  }

  public ProductCatalogsReportsGetResponseData getProductCatalogsReports() throws Exception {
    ProductCatalogsReportsGetResponseData response =
        tencentAds
            .productCatalogsReports()
            .productCatalogsReportsGet(
                accountId, productCatalogId, dateRange, filtering, groupBy, orderBy, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetProductCatalogsReports getProductCatalogsReports = new GetProductCatalogsReports();
      getProductCatalogsReports.init();
      ProductCatalogsReportsGetResponseData response =
          getProductCatalogsReports.getProductCatalogsReports();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

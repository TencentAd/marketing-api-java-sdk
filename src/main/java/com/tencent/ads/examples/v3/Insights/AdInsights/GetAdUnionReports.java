package com.tencent.ads.examples.v3.Insights.AdInsights;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.OrderByStruct;
import com.tencent.ads.model.v3.ReportDateRange;
import com.tencent.ads.model.v3.UnionReportFiltering;
import com.tencent.ads.v3.TencentAds;
import java.util.List;

public class GetAdUnionReports {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public ReportDateRange dateRange = null;

  public List<String> fields = null;

  public UnionReportFiltering filtering = null;

  public List<String> groupBy = null;

  public List<OrderByStruct> orderBy = null;

  public Long page = null;

  public Long pageSize = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public AdUnionReportsGetResponseData getAdUnionReports() throws Exception {
    AdUnionReportsGetResponseData response =
        tencentAds
            .adUnionReports()
            .adUnionReportsGet(
                accountId, dateRange, fields, filtering, groupBy, orderBy, page, pageSize);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetAdUnionReports getAdUnionReports = new GetAdUnionReports();
      getAdUnionReports.init();
      AdUnionReportsGetResponseData response = getAdUnionReports.getAdUnionReports();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

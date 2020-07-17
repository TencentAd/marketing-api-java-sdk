package com.tencent.ads.examples.BasicOperations.Insights;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.DateRange;
import com.tencent.ads.model.FilteringStruct;
import com.tencent.ads.model.OrderByStruct;
import java.util.Arrays;
import java.util.List;

public class GetHourlyReports {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public String level = "REPORT_LEVEL_ADGROUP";

  public DateRange dateRange = new DateRange();

  public List<FilteringStruct> filtering = null;

  public List<String> groupBy = null;

  public List<OrderByStruct> orderBy = null;

  public Long page = null;

  public Long pageSize = null;

  public String timeLine = null;

  public List<String> fields =
      Arrays.asList("hour", "view_count", "valid_click_count", "ctr", "cpc", "cost");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {
    String startDate = "REPORT DATE";
    dateRange.setStartDate(startDate);
    String endDate = "REPORT DATE";
    dateRange.setEndDate(endDate);
  }

  public HourlyReportsGetResponseData getHourlyReports() throws Exception {
    HourlyReportsGetResponseData response =
        tencentAds
            .hourlyReports()
            .hourlyReportsGet(
                accountId, level, dateRange, filtering, groupBy, orderBy, page, pageSize, timeLine,
                fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetHourlyReports getHourlyReports = new GetHourlyReports();
      getHourlyReports.init();
      HourlyReportsGetResponseData response = getHourlyReports.getHourlyReports();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

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

public class GetTargetingTagReports {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public String type = "CITY";

  public String level = "ADVERTISER";

  public ReportDateRange dateRange = new ReportDateRange();

  public String posType = null;

  public List<FilteringStruct> filtering = null;

  public List<String> groupBy = null;

  public List<OrderByStruct> orderBy = null;

  public Long page = null;

  public Long pageSize = null;

  public String timeLine = null;

  public Boolean weixinOfficialAccountsUpgradeEnabled = null;

  public Boolean adqAccountsUpgradeEnabled = null;

  public List<String> fields =
      Arrays.asList(
          "date", "city_id", "city", "view_count", "valid_click_count", "ctr", "cpc", "cost");

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

  public TargetingTagReportsGetResponseData getTargetingTagReports() throws Exception {
    TargetingTagReportsGetResponseData response =
        tencentAds
            .targetingTagReports()
            .targetingTagReportsGet(
                accountId,
                type,
                level,
                dateRange,
                posType,
                filtering,
                groupBy,
                orderBy,
                page,
                pageSize,
                timeLine,
                weixinOfficialAccountsUpgradeEnabled,
                adqAccountsUpgradeEnabled,
                fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetTargetingTagReports getTargetingTagReports = new GetTargetingTagReports();
      getTargetingTagReports.init();
      TargetingTagReportsGetResponseData response = getTargetingTagReports.getTargetingTagReports();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

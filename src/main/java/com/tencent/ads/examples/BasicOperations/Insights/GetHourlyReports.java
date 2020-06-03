package com.tencent.ads.examples.BasicOperations.Insights;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.HourlyReportsGetListStruct;
import com.tencent.ads.model.HourlyReportsGetResponseData;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*****
 * 本文件提供了一个获取小时报表(Hourly report)列表的简单示例
 */
public class GetHourlyReports {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR REPORT LEVEL
   */
  public String LEVEL = "REPORT_LEVEL_ADGROUP"; // 广告组级别报表
  /**
   * YOUR REPORT DATE
   */
  public String DATE = "REPORT DATE"; // 报表查询日期 YYYY-MM-DD
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

  public HourlyReportsGetResponseData getHourlyReports() throws Exception {
    Map<String, Object> dateRange = new HashMap<>();
    dateRange.put("start_date", DATE);
    dateRange.put("end_date", DATE);
    HourlyReportsGetResponseData response = tencentAds.hourlyReports()
        .hourlyReportsGet(ACCOUNT_ID, LEVEL, dateRange, null,
            null, null, null, null, null,
            Arrays.asList("hour", "view_count", "valid_click_count", "ctr", "cpc", "cost"));
    return response;
  }

  public static void main(String[] args) {
    try {
      GetHourlyReports getHourlyReports = new GetHourlyReports();
      getHourlyReports.init();
      HourlyReportsGetResponseData response = getHourlyReports.getHourlyReports();
      if (response != null) {
        List<HourlyReportsGetListStruct> list = response.getList();
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
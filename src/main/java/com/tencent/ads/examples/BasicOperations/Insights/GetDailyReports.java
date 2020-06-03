package com.tencent.ads.examples.BasicOperations.Insights;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.DailyReportsGetListStruct;
import com.tencent.ads.model.DailyReportsGetResponseData;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 本文件提供了一个获取日报表(Daily report)列表的简单示例
 **/
public class GetDailyReports {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * REPORT_LEVEL_ADGROUP
   */
  public String LEVEL = "REPORT_LEVEL_ADGROUP"; // 广告组级别报表
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

  public DailyReportsGetResponseData getDailyReports() throws Exception {

    Map<String, Object> dateRange = new HashMap<>();
    dateRange.put("start_date", START_DATE);
    dateRange.put("end_date", END_DATE);
    DailyReportsGetResponseData response = tencentAds.dailyReports()
        .dailyReportsGet(ACCOUNT_ID, LEVEL, dateRange, null, null,
            null, null, null, null,
            Arrays.asList("date", "view_count", "valid_click_count", "ctr", "cpc", "cost"));

    return response;
  }

  public static void main(String[] args) {
    try {
      GetDailyReports GetDailyReports = new GetDailyReports();
      GetDailyReports.init();
      DailyReportsGetResponseData response = GetDailyReports.getDailyReports();
      if (response != null) {
        List<DailyReportsGetListStruct> list = response.getList();
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
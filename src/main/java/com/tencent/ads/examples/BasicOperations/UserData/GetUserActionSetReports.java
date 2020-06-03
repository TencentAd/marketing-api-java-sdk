package com.tencent.ads.examples.BasicOperations.UserData;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.TimeData;
import com.tencent.ads.model.UserActionSetReportsGetResponseData;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*****
 * 本文件提供了一个获取用户行为数据源报表(User action set report)列表的简单示例
 */
public class GetUserActionSetReports {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * 数据源ID
   */
  public Long USER_ACTION_SET_ID = 0L; // 数据源ID
  /**
   * 报表开始日期
   */
  public String START_DATE = "REPORT START DATE"; // 报表开始日期
  /**
   * 报表结束日期
   */
  public String END_DATE = "REPORT END DATE"; // 报表结束日期
  /**
   * 按日
   */
  public String TIME_GRANULARITY = "DAILY"; // 按日
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

  public List<TimeData> getUserActionSetReports() throws Exception {
    Map<String, Object> dateRange = new HashMap<>();
    dateRange.put("start_date", START_DATE);
    dateRange.put("end_date", END_DATE);
    List<String> fields = Arrays.asList("date", "action_type", "custom_action", "raw_action_count",
        "identified_action_count", "identified_user_count");

    UserActionSetReportsGetResponseData response = tencentAds.userActionSetReports()
        .userActionSetReportsGet(
            ACCOUNT_ID, USER_ACTION_SET_ID, dateRange, TIME_GRANULARITY, null, fields);
    if (response != null) {
      return response.getList();
    }
    return Collections.emptyList();
  }

  public static void main(String[] args) {
    try {
      GetUserActionSetReports example = new GetUserActionSetReports();
      example.init();
      List<TimeData> tdList = example.getUserActionSetReports();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

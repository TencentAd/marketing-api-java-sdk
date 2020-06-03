package com.tencent.ads.examples.BasicOperations.Insights;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AudienceReport;
import com.tencent.ads.model.CustomAudienceReportsGetResponseData;
import com.tencent.ads.model.FilteringStruct;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*****
 * 本文件提供了一个获取人群报表(Custom audience report)列表的简单示例
 */
public class GetCustomAudienceReports {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR AUDIENCE ID
   */
  public Long AUDIENCE_ID = 0L; // 人群ID
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

  public CustomAudienceReportsGetResponseData getCustomAudienceReports() throws Exception {
    Map<String, Object> dateRange = new HashMap<>();
    dateRange.put("start_date", START_DATE);
    dateRange.put("end_date", END_DATE);
    CustomAudienceReportsGetResponseData response = tencentAds.customAudienceReports()
        .customAudienceReportsGet(ACCOUNT_ID,
            Arrays.asList(new FilteringStruct().field("audience_id").operator("IN")
                    .values(Arrays.asList(String.valueOf(AUDIENCE_ID))),
                new FilteringStruct().field("audience_platform").operator("EQUALS")
                    .values(Arrays.asList("DMP"))), dateRange, null,
            Arrays.asList("audience_id", "account_id", "adgroup_id", "campaign_id",
                "wechat_adgroup_id", "wechat_campaign_id",
                "model_id", "audience_predict_task_id", "action_type", "cost",
                "action_count", "user_count"));
    return response;

  }

  public static void main(String[] args) {
    try {
      GetCustomAudienceReports GetCustomAudienceReports = new GetCustomAudienceReports();
      GetCustomAudienceReports.init();
      CustomAudienceReportsGetResponseData response = GetCustomAudienceReports
          .getCustomAudienceReports();
      if (response != null) {
        List<AudienceReport> list = response.getList();
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
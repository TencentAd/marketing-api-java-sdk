package com.tencent.ads.examples.BasicOperations.Insights;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.DateRange;
import com.tencent.ads.model.FilteringStruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetCustomAudienceReports {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public List<FilteringStruct> filtering = new ArrayList<>();

  public DateRange dateRange = new DateRange();

  public List<String> groupBy = null;

  public List<String> fields =
      Arrays.asList(
          "audience_id",
          "account_id",
          "adgroup_id",
          "campaign_id",
          "wechat_adgroup_id",
          "wechat_campaign_id",
          "model_id",
          "audience_predict_task_id",
          "action_type",
          "cost",
          "action_count",
          "user_count");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {
    String field = "audience_id";
    FilteringStruct filteringStruct = new FilteringStruct();
    filteringStruct.setField(field);
    String operator = "IN";
    filteringStruct.setOperator(operator);
    List<String> values = Arrays.asList("YOUR AUDIENCE ID");
    filteringStruct.setValues(values);
    String field_1 = "audience_platform";
    FilteringStruct filteringStruct_1 = new FilteringStruct();
    filteringStruct_1.setField(field_1);
    String operator_1 = "EQUALS";
    filteringStruct_1.setOperator(operator_1);
    List<String> values_1 = Arrays.asList("DMP");
    filteringStruct_1.setValues(values_1);
    filtering.add(filteringStruct);
    filtering.add(filteringStruct_1);
    String startDate = "REPORT START DATE";
    dateRange.setStartDate(startDate);
    String endDate = "REPORT END DATE";
    dateRange.setEndDate(endDate);
  }

  public CustomAudienceReportsGetResponseData getCustomAudienceReports() throws Exception {
    CustomAudienceReportsGetResponseData response =
        tencentAds
            .customAudienceReports()
            .customAudienceReportsGet(accountId, filtering, dateRange, groupBy, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetCustomAudienceReports getCustomAudienceReports = new GetCustomAudienceReports();
      getCustomAudienceReports.init();
      CustomAudienceReportsGetResponseData response =
          getCustomAudienceReports.getCustomAudienceReports();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

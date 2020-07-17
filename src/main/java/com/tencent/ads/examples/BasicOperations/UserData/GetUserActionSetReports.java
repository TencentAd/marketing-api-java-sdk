package com.tencent.ads.examples.BasicOperations.UserData;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.DateRange;
import java.util.Arrays;
import java.util.List;

public class GetUserActionSetReports {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public Long userActionSetId = null;

  public DateRange dateRange = new DateRange();

  public String timeGranularity = "DAILY";

  public String aggregation = null;

  public List<String> fields =
      Arrays.asList(
          "date",
          "action_type",
          "custom_action",
          "raw_action_count",
          "identified_action_count",
          "identified_user_count");

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

  public UserActionSetReportsGetResponseData getUserActionSetReports() throws Exception {
    UserActionSetReportsGetResponseData response =
        tencentAds
            .userActionSetReports()
            .userActionSetReportsGet(
                accountId, userActionSetId, dateRange, timeGranularity, aggregation, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetUserActionSetReports getUserActionSetReports = new GetUserActionSetReports();
      getUserActionSetReports.init();
      UserActionSetReportsGetResponseData response =
          getUserActionSetReports.getUserActionSetReports();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

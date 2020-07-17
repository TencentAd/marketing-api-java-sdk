package com.tencent.ads.examples.BasicOperations.Account;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.DateRange;
import java.util.Arrays;
import java.util.List;

public class GetFundStatementsDaily {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public String fundType = "FUND_TYPE_GIFT";

  public DateRange dateRange = new DateRange();

  public String tradeType = null;

  public List<String> fields =
      Arrays.asList("fund_type", "trade_type", "time", "amount", "description");

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

  public FundStatementsDailyGetResponseData getFundStatementsDaily() throws Exception {
    FundStatementsDailyGetResponseData response =
        tencentAds
            .fundStatementsDaily()
            .fundStatementsDailyGet(accountId, fundType, dateRange, tradeType, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetFundStatementsDaily getFundStatementsDaily = new GetFundStatementsDaily();
      getFundStatementsDaily.init();
      FundStatementsDailyGetResponseData response = getFundStatementsDaily.getFundStatementsDaily();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

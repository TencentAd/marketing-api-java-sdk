package com.tencent.ads.examples.v3.AccountManagement.AccountType;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.DateRangeTransaction;
import com.tencent.ads.v3.TencentAds;
import java.util.Arrays;
import java.util.List;

public class GetFundStatementsDetailed {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long advertiserId = null;

  public String fundType = "FUND_TYPE_GIFT";

  public DateRangeTransaction dateRange = new DateRangeTransaction();

  public Long page = null;

  public Long pageSize = null;

  public List<String> fields =
      Arrays.asList("time", "external_bill_no", "trade_type", "amount", "description");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    String startDate = "REPORT START DATE";
    dateRange.setStartDate(startDate);
    String endDate = "REPORT END DATE";
    dateRange.setEndDate(endDate);
  }

  public FundStatementsDetailedGetResponseData getFundStatementsDetailed() throws Exception {
    FundStatementsDetailedGetResponseData response =
        tencentAds
            .fundStatementsDetailed()
            .fundStatementsDetailedGet(advertiserId, fundType, dateRange, page, pageSize, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetFundStatementsDetailed getFundStatementsDetailed = new GetFundStatementsDetailed();
      getFundStatementsDetailed.init();
      FundStatementsDetailedGetResponseData response =
          getFundStatementsDetailed.getFundStatementsDetailed();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

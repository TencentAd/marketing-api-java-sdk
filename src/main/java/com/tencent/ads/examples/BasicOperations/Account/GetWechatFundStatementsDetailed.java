package com.tencent.ads.examples.BasicOperations.Account;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.FilteringStruct;
import com.tencent.ads.model.ReportDateRange;
import java.util.Arrays;
import java.util.List;

public class GetWechatFundStatementsDetailed {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public String tradeType = "ADVERTISER_CHARGE";

  public ReportDateRange dateRange = new ReportDateRange();

  public List<FilteringStruct> filtering = null;

  public Long page = null;

  public Long pageSize = null;

  public List<String> fields =
      Arrays.asList(
          "trade_type",
          "time",
          "amount",
          "wechat_account_id",
          "wechat_account_name",
          "fund_type",
          "external_bill_no",
          "description",
          "operator",
          "bill_no",
          "repayment_channel_type",
          "company_name",
          "contact_name",
          "contact_phone",
          "status");

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

  public WechatFundStatementsDetailedGetResponseData getWechatFundStatementsDetailed()
      throws Exception {
    WechatFundStatementsDetailedGetResponseData response =
        tencentAds
            .wechatFundStatementsDetailed()
            .wechatFundStatementsDetailedGet(
                tradeType, dateRange, filtering, page, pageSize, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetWechatFundStatementsDetailed getWechatFundStatementsDetailed =
          new GetWechatFundStatementsDetailed();
      getWechatFundStatementsDetailed.init();
      WechatFundStatementsDetailedGetResponseData response =
          getWechatFundStatementsDetailed.getWechatFundStatementsDetailed();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

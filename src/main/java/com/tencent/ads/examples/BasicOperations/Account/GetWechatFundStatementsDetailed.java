package com.tencent.ads.examples.BasicOperations.Account;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.FilteringStruct;
import com.tencent.ads.model.WechatFundStatementsDetailedGetResponseData;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 本文件提供了一个获取微信资金账户流水(Wechat fund statement detail)列表的简单示例
 */
public class GetWechatFundStatementsDetailed {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * 交易类型
   */
  public String TRADE_TYPE = "ADVERTISER_CHARGE";
  /**
   * 报表开始日期
   */
  public String START_DATE = "REPORT START DATE";
  /**
   * 报表结束日期
   */
  public String END_DATE = "REPORT END DATE";
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

  public WechatFundStatementsDetailedGetResponseData getWechatFundStatementsDetailed()
      throws Exception {
    String tradeType = TRADE_TYPE;
    Map<String, Object> dateRange = new HashMap<String, Object>();
    dateRange.put("start_date", START_DATE);
    dateRange.put("end_date", END_DATE);
    List<FilteringStruct> filtering = null;
    Long page = null;
    Long pageSize = null;
    List<String> fields = Arrays
        .asList("trade_type", "time", "amount", "wechat_account_id", "wechat_account_name",
            "fund_type", "external_bill_no", "description", "operator", "bill_no",
            "repayment_channel_type", "company_name", "contact_name", "contact_phone", "status");
    WechatFundStatementsDetailedGetResponseData response = tencentAds.wechatFundStatementsDetailed()
        .wechatFundStatementsDetailedGet(tradeType, dateRange, filtering, page, pageSize, fields);
    return response;

  }

  public static void main(String[] args) {
    try {
      GetWechatFundStatementsDetailed getWechatFundStatementsDetailed = new GetWechatFundStatementsDetailed();
      getWechatFundStatementsDetailed.init();
      WechatFundStatementsDetailedGetResponseData responseData = getWechatFundStatementsDetailed
          .getWechatFundStatementsDetailed();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
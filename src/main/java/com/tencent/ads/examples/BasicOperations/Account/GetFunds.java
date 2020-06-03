package com.tencent.ads.examples.BasicOperations.Account;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.FundsGetResponseData;
import java.util.Arrays;
import java.util.List;

/**
 * 本文件提供了一个获取资金账户(Fund)列表的简单示例
 */
public class GetFunds {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
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

  public FundsGetResponseData getFunds() throws Exception {
    Long accountId = ACCOUNT_ID;
    List<String> fields = Arrays.asList("fund_type", "balance", "fund_status", "realtime_cost");
    FundsGetResponseData response = tencentAds.funds().fundsGet(accountId, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetFunds getFunds = new GetFunds();
      getFunds.init();
      FundsGetResponseData responseData = getFunds.getFunds();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
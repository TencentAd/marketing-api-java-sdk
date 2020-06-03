package com.tencent.ads.examples.BasicOperations.Account;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AccountTypeMap;
import com.tencent.ads.model.FundTransferAddRequest;
import com.tencent.ads.model.FundTransferAddResponseData;

/**
 * 本文件提供了一个创建转账(Fund transfer)的简单示例
 */
public class AddFundTransfer {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * 资金账户类型
   */
  public AccountTypeMap FUND_TYPE = AccountTypeMap.GIFT;
  /**
   * 转账金额(分)
   */
  public Long AMOUNT = 0L;
  /**
   * 转账类型
   */
  public String TRANSFER_TYPE = "AGENCY_TO_ADVERTISER";
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

  public FundTransferAddResponseData addFundTransfer() throws Exception {
    FundTransferAddRequest data = new FundTransferAddRequest();
    data.setAccountId(ACCOUNT_ID);
    data.setFundType(FUND_TYPE);
    data.setAmount(AMOUNT);
    data.setTransferType(TRANSFER_TYPE);
    FundTransferAddResponseData response = tencentAds.fundTransfer().fundTransferAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddFundTransfer addFundTransfer = new AddFundTransfer();
      addFundTransfer.init();
      FundTransferAddResponseData responseData = addFundTransfer.addFundTransfer();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
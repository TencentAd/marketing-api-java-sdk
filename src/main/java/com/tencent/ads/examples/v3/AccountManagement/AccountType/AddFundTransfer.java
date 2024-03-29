package com.tencent.ads.examples.v3.AccountManagement.AccountType;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.FundTransferAddRequest;
import com.tencent.ads.v3.TencentAds;

public class AddFundTransfer {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long amount = null;
  public FundTransferAddRequest data = new FundTransferAddRequest();
  public Long accountId = null;
  public AccountTypeMap fundType = AccountTypeMap.GIFT;
  public String transferType = "AGENCY_TO_ADVERTISER";

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setAmount(amount);

    data.setAccountId(accountId);

    data.setFundType(fundType);

    data.setTransferType(transferType);
  }

  public FundTransferAddResponseData addFundTransfer() throws Exception {
    FundTransferAddResponseData response = tencentAds.fundTransfer().fundTransferAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddFundTransfer addFundTransfer = new AddFundTransfer();
      addFundTransfer.init();
      FundTransferAddResponseData response = addFundTransfer.addFundTransfer();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

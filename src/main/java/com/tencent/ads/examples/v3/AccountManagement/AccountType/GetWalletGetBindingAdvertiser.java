package com.tencent.ads.examples.v3.AccountManagement.AccountType;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.v3.TencentAds;
import java.util.List;

public class GetWalletGetBindingAdvertiser {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public Long walletId = null;

  public Long page = null;

  public Long pageSize = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public WalletGetBindingAdvertiserGetResponseData getWalletGetBindingAdvertiser()
      throws Exception {
    WalletGetBindingAdvertiserGetResponseData response =
        tencentAds
            .walletGetBindingAdvertiser()
            .walletGetBindingAdvertiserGet(accountId, walletId, page, pageSize, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetWalletGetBindingAdvertiser getWalletGetBindingAdvertiser =
          new GetWalletGetBindingAdvertiser();
      getWalletGetBindingAdvertiser.init();
      WalletGetBindingAdvertiserGetResponseData response =
          getWalletGetBindingAdvertiser.getWalletGetBindingAdvertiser();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

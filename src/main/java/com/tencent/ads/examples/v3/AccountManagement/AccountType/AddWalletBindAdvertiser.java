package com.tencent.ads.examples.v3.AccountManagement.AccountType;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.WalletBindAdvertiserAddRequest;
import com.tencent.ads.model.v3.WalletBindAdvertiserAddResponse;
import com.tencent.ads.v3.TencentAds;

public class AddWalletBindAdvertiser {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public WalletBindAdvertiserAddRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public WalletBindAdvertiserAddResponse addWalletBindAdvertiser() throws Exception {
    WalletBindAdvertiserAddResponse response =
        tencentAds.walletBindAdvertiser().walletBindAdvertiserAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddWalletBindAdvertiser addWalletBindAdvertiser = new AddWalletBindAdvertiser();
      addWalletBindAdvertiser.init();
      WalletBindAdvertiserAddResponse response = addWalletBindAdvertiser.addWalletBindAdvertiser();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

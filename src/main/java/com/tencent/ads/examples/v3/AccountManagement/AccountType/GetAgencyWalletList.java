package com.tencent.ads.examples.v3.AccountManagement.AccountType;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.v3.TencentAds;
import java.util.List;

public class GetAgencyWalletList {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public Long page = null;

  public Long pageSize = null;

  public Long mdmId = null;

  public Long walletId = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public AgencyWalletListGetResponseData getAgencyWalletList() throws Exception {
    AgencyWalletListGetResponseData response =
        tencentAds
            .agencyWalletList()
            .agencyWalletListGet(accountId, page, pageSize, mdmId, walletId, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetAgencyWalletList getAgencyWalletList = new GetAgencyWalletList();
      getAgencyWalletList.init();
      AgencyWalletListGetResponseData response = getAgencyWalletList.getAgencyWalletList();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

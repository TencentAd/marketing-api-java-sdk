package com.tencent.ads.examples.v3.BusinessAssets.WechatOfficial;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.v3.TencentAds;
import java.util.List;

public class GetWechatOfficialAccounts {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public WechatOfficialAccountsGetResponseData getWechatOfficialAccounts() throws Exception {
    WechatOfficialAccountsGetResponseData response =
        tencentAds.wechatOfficialAccounts().wechatOfficialAccountsGet(accountId, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetWechatOfficialAccounts getWechatOfficialAccounts = new GetWechatOfficialAccounts();
      getWechatOfficialAccounts.init();
      WechatOfficialAccountsGetResponseData response =
          getWechatOfficialAccounts.getWechatOfficialAccounts();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

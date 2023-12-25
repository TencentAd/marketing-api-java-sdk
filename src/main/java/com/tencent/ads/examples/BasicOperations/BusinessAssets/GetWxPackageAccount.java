package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import java.util.List;

public class GetWxPackageAccount {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public Long pageSize = null;

  public Long pageIndex = null;

  public String beginTime = null;

  public String endTime = null;

  public String keyword = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public WxPackageAccountGetResponseData getWxPackageAccount() throws Exception {
    WxPackageAccountGetResponseData response =
        tencentAds
            .wxPackageAccount()
            .wxPackageAccountGet(
                accountId, pageSize, pageIndex, beginTime, endTime, keyword, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetWxPackageAccount getWxPackageAccount = new GetWxPackageAccount();
      getWxPackageAccount.init();
      WxPackageAccountGetResponseData response = getWxPackageAccount.getWxPackageAccount();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

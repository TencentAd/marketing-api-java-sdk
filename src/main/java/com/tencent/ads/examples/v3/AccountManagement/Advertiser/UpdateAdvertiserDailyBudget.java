package com.tencent.ads.examples.v3.AccountManagement.Advertiser;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.AdvertiserDailyBudgetUpdateRequest;
import com.tencent.ads.v3.TencentAds;

public class UpdateAdvertiserDailyBudget {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public AdvertiserDailyBudgetUpdateRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public AdvertiserDailyBudgetUpdateResponseData updateAdvertiserDailyBudget() throws Exception {
    AdvertiserDailyBudgetUpdateResponseData response =
        tencentAds.advertiserDailyBudget().advertiserDailyBudgetUpdate(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      UpdateAdvertiserDailyBudget updateAdvertiserDailyBudget = new UpdateAdvertiserDailyBudget();
      updateAdvertiserDailyBudget.init();
      AdvertiserDailyBudgetUpdateResponseData response =
          updateAdvertiserDailyBudget.updateAdvertiserDailyBudget();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

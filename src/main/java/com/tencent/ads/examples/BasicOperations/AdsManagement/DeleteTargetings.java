package com.tencent.ads.examples.BasicOperations.AdsManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.TargetingsDeleteRequest;

public class DeleteTargetings {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long targetingId = null;
  public TargetingsDeleteRequest data = new TargetingsDeleteRequest();
  public Long accountId = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {
    data.setTargetingId(targetingId);

    data.setAccountId(accountId);
  }

  public TargetingsDeleteResponseData deleteTargetings() throws Exception {
    TargetingsDeleteResponseData response = tencentAds.targetings().targetingsDelete(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      DeleteTargetings deleteTargetings = new DeleteTargetings();
      deleteTargetings.init();
      TargetingsDeleteResponseData response = deleteTargetings.deleteTargetings();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

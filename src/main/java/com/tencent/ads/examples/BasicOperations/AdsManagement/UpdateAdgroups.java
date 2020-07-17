package com.tencent.ads.examples.BasicOperations.AdsManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.AdgroupsUpdateRequest;

public class UpdateAdgroups {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public String endDate = "YOUR ADGROUP END DATE";
  public AdgroupsUpdateRequest data = new AdgroupsUpdateRequest();
  public Long accountId = null;
  public Long adgroupId = null;
  public Long bidAmount = 300L;
  public String beginDate = "YOUR ADGROUP BEGIN DATE";
  public AdStatus configuredStatus = AdStatus.SUSPEND;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {
    data.setEndDate(endDate);

    data.setAccountId(accountId);

    data.setAdgroupId(adgroupId);

    data.setBidAmount(bidAmount);

    data.setBeginDate(beginDate);

    data.setConfiguredStatus(configuredStatus);
  }

  public AdgroupsUpdateResponseData updateAdgroups() throws Exception {
    AdgroupsUpdateResponseData response = tencentAds.adgroups().adgroupsUpdate(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      UpdateAdgroups updateAdgroups = new UpdateAdgroups();
      updateAdgroups.init();
      AdgroupsUpdateResponseData response = updateAdgroups.updateAdgroups();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

package com.tencent.ads.examples.v3.AdsManagement.Adgroups;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.AdgroupsDeleteRequest;
import com.tencent.ads.v3.TencentAds;

public class DeleteAdgroups {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;
  public AdgroupsDeleteRequest data = new AdgroupsDeleteRequest();
  public Long adgroupId = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setAccountId(accountId);

    data.setAdgroupId(adgroupId);
  }

  public AdgroupsDeleteResponseData deleteAdgroups() throws Exception {
    AdgroupsDeleteResponseData response = tencentAds.adgroups().adgroupsDelete(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      DeleteAdgroups deleteAdgroups = new DeleteAdgroups();
      deleteAdgroups.init();
      AdgroupsDeleteResponseData response = deleteAdgroups.deleteAdgroups();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

package com.tencent.ads.examples.BasicOperations.Adsmanagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.AdgroupsUpdateDatetimeRequest;

public class UpdateDatetimeAdgroups {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public AdgroupsUpdateDatetimeRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public AdgroupsUpdateDatetimeResponseData updatedatetimeAdgroups() throws Exception {
    AdgroupsUpdateDatetimeResponseData response =
        tencentAds.adgroups().adgroupsUpdateDatetime(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      UpdateDatetimeAdgroups updatedatetimeAdgroups = new UpdateDatetimeAdgroups();
      updatedatetimeAdgroups.init();
      AdgroupsUpdateDatetimeResponseData response = updatedatetimeAdgroups.updatedatetimeAdgroups();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

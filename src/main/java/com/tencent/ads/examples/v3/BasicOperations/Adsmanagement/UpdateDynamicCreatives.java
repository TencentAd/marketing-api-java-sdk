package com.tencent.ads.examples.v3.BasicOperations.Adsmanagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.DynamicCreativesUpdateRequest;
import com.tencent.ads.v3.TencentAds;

public class UpdateDynamicCreatives {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;
  public DynamicCreativesUpdateRequest data = new DynamicCreativesUpdateRequest();
  public Long dynamicCreativeId = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setAccountId(accountId);

    data.setDynamicCreativeId(dynamicCreativeId);
  }

  public DynamicCreativesUpdateResponseData updateDynamicCreatives() throws Exception {
    DynamicCreativesUpdateResponseData response =
        tencentAds.dynamicCreatives().dynamicCreativesUpdate(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      UpdateDynamicCreatives updateDynamicCreatives = new UpdateDynamicCreatives();
      updateDynamicCreatives.init();
      DynamicCreativesUpdateResponseData response = updateDynamicCreatives.updateDynamicCreatives();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

package com.tencent.ads.examples.v3.BasicOperations.Adsmanagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.DynamicCreativesAddRequest;
import com.tencent.ads.v3.TencentAds;

public class AddDynamicCreatives {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;
  public DynamicCreativesAddRequest data = new DynamicCreativesAddRequest();
  public String dynamicCreativeName = "SDK动态创意5ede25293ba60";

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setAccountId(accountId);

    data.setDynamicCreativeName(dynamicCreativeName);
  }

  public DynamicCreativesAddResponseData addDynamicCreatives() throws Exception {
    DynamicCreativesAddResponseData response =
        tencentAds.dynamicCreatives().dynamicCreativesAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddDynamicCreatives addDynamicCreatives = new AddDynamicCreatives();
      addDynamicCreatives.init();
      DynamicCreativesAddResponseData response = addDynamicCreatives.addDynamicCreatives();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.XijingPageUpdateRequest;
import com.tencent.ads.model.XijingPageUpdateResponse;

public class UpdateXijingPage {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public XijingPageUpdateRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public XijingPageUpdateResponse updateXijingPage() throws Exception {
    XijingPageUpdateResponse response = tencentAds.xijingPage().xijingPageUpdate(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      UpdateXijingPage updateXijingPage = new UpdateXijingPage();
      updateXijingPage.init();
      XijingPageUpdateResponse response = updateXijingPage.updateXijingPage();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

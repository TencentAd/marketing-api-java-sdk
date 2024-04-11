package com.tencent.ads.examples.v3.BusinessAssets.Pages;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.v3.TencentAds;
import java.io.File;

public class AddXijingPageInteractive {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public Long isAutoSubmit = null;

  public String pageType = null;

  public String interactivePageType = null;

  public String pageTitle = null;

  public String pageName = null;

  public String mobileAppId = null;

  public File file = null;

  public String transformType = null;

  public String pageConfig = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public XijingPageInteractiveAddResponseData addXijingPageInteractive() throws Exception {
    XijingPageInteractiveAddResponseData response =
        tencentAds
            .xijingPageInteractive()
            .xijingPageInteractiveAdd(
                accountId,
                isAutoSubmit,
                pageType,
                interactivePageType,
                pageTitle,
                pageName,
                mobileAppId,
                file,
                transformType,
                pageConfig);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddXijingPageInteractive addXijingPageInteractive = new AddXijingPageInteractive();
      addXijingPageInteractive.init();
      XijingPageInteractiveAddResponseData response =
          addXijingPageInteractive.addXijingPageInteractive();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.XijingPageInteractiveAddResponse;
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
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {}

  public XijingPageInteractiveAddResponse addXijingPageInteractive() throws Exception {
    XijingPageInteractiveAddResponse response =
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
      XijingPageInteractiveAddResponse response =
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

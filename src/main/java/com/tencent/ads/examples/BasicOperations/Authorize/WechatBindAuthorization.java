package com.tencent.ads.examples.BasicOperations.Authorize;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import java.util.List;

public class WechatBindAuthorization {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public String accessToken = null;

  public String redirectUri = null;

  public Long accountId = null;

  public String wechatAccountId = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public String wechatbindAuthorization() throws Exception {
    String response =
        tencentAds
            .authorization()
            .authorizationWechatBind(accessToken, redirectUri, accountId, wechatAccountId, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      WechatBindAuthorization wechatbindAuthorization = new WechatBindAuthorization();
      wechatbindAuthorization.init();
      String response = wechatbindAuthorization.wechatbindAuthorization();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

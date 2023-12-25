package com.tencent.ads.examples.BasicOperations.Authorize;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import java.util.List;

public class AuthorizeOauth {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long clientId = null;

  public String redirectUri = null;

  public String state = null;

  public String scope = null;

  public String accountType = null;

  public Long accountDisplayNumber = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public String authorizeOauth() throws Exception {
    String response =
        tencentAds
            .oauth()
            .oauthAuthorize(
                clientId, redirectUri, state, scope, accountType, accountDisplayNumber, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      AuthorizeOauth authorizeOauth = new AuthorizeOauth();
      authorizeOauth.init();
      String response = authorizeOauth.authorizeOauth();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

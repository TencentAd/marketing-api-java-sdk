package com.tencent.ads.examples.BasicOperations.Authorize;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;

public class TokenOauth {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long clientId = null;

  public String clientSecret = null;

  public String grantType = null;

  public String authorizationCode = null;

  public String refreshToken = null;

  public String redirectUri = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public OauthTokenResponseData tokenOauth() throws Exception {
    OauthTokenResponseData response =
        tencentAds
            .oauth()
            .oauthToken(
                clientId, clientSecret, grantType, authorizationCode, refreshToken, redirectUri);
    return response;
  }

  public static void main(String[] args) {
    try {
      TokenOauth tokenOauth = new TokenOauth();
      tokenOauth.init();
      OauthTokenResponseData response = tokenOauth.tokenOauth();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

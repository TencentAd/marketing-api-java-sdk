package com.tencent.ads.examples.v3.AuthorizeAndToken.Authorize;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.v3.TencentAds;
import java.util.List;

public class RefreshTokenOauth {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long clientId = null;

  public String clientSecret = null;

  public String refreshToken = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public OauthRefreshTokenResponseData refreshtokenOauth() throws Exception {
    OauthRefreshTokenResponseData response =
        tencentAds.oauth().oauthRefreshToken(clientId, clientSecret, refreshToken, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      RefreshTokenOauth refreshtokenOauth = new RefreshTokenOauth();
      refreshtokenOauth.init();
      OauthRefreshTokenResponseData response = refreshtokenOauth.refreshtokenOauth();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

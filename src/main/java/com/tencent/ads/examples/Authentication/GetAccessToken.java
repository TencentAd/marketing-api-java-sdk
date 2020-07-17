package com.tencent.ads.examples.Authentication;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.ApiException;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.OauthTokenResponseData;

/** 本文件提供了一个从Authorization Code获取Access Token的示例 */
public class GetAccessToken {

  /** YOUR CLIENT ID */
  public Long CLIENT_ID = 0L;
  /** YOUR CLIENT SECRET */
  public String CLIENT_SECRET = "YOUR CLIENT SECRET";
  /** YOUR AUTHORIZATION CODE */
  public String AUTHORIZATION_CODE = "YOUR AUTHORIZATION CODE";
  /** YOUR REDIRECT URI */
  public String REDIRECT_URI = "YOUR REDIRECT URI";
  /** TencentAds */
  public TencentAds tencentAds;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(new ApiContextConfig().isDebug(true));
    // oauth/token不提供沙箱环境
    this.tencentAds.useProduction();
  }

  public String getAccessToken() throws ApiException {
    OauthTokenResponseData responseData =
        tencentAds
            .oauth()
            .oauthToken(
                CLIENT_ID,
                CLIENT_SECRET,
                "authorization_code",
                AUTHORIZATION_CODE,
                null,
                REDIRECT_URI);
    if (responseData != null) {
      String accessToken = responseData.getAccessToken();
      tencentAds.setAccessToken(accessToken);
      return accessToken;
    }
    return null;
  }

  public static void main(String[] args) {
    try {
      GetAccessToken getAccessToken = new GetAccessToken();
      getAccessToken.init();
      String accessToken = getAccessToken.getAccessToken();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AndroidChannelPackagesGetResponseData;
import java.util.Arrays;


/*****
 * 本文件提供了一个获取安卓渠道包(Android channel package)的简单示例
 */
public class GetAndroidChannelPackages {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR MYAPP AUTH KEY
   */
  public String AUTH_KEY = "YOUR MYAPP AUTH KEY";
  /**
   * YOUR APP_ID
   */
  public Long APP_ID = 0L;
  /**
   * TencentAds
   */
  public TencentAds tencentAds;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true));// debug==true 会打印请求详细信息
    this.tencentAds.useSandbox();// 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
  }

  public AndroidChannelPackagesGetResponseData getAndroidChannelPackages() throws Exception {
    AndroidChannelPackagesGetResponseData response = tencentAds.androidChannelPackages()
        .androidChannelPackagesGet(ACCOUNT_ID,
            AUTH_KEY, APP_ID, null, null, Arrays
                .asList("android_app_id", "package_name", "channel_package_id", "version_code",
                    "version_name", "created_time", "last_modified_time", "system_status",
                    "audit_status"));
    return response;

  }

  public static void main(String[] args) {
    try {
      GetAndroidChannelPackages getAndroidChannelPackages = new GetAndroidChannelPackages();
      getAndroidChannelPackages.init();
      AndroidChannelPackagesGetResponseData response = getAndroidChannelPackages
          .getAndroidChannelPackages();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

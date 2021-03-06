package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.FilteringStruct;
import java.util.Arrays;
import java.util.List;

public class GetAndroidChannelPackages {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public Long androidAppId = null;

  public String myappAuthKey = "YOUR MYAPP AUTH KEY";

  public List<FilteringStruct> filtering = null;

  public Long page = null;

  public Long pageSize = null;

  public List<String> fields =
      Arrays.asList(
          "android_app_id",
          "package_name",
          "channel_package_id",
          "version_code",
          "version_name",
          "created_time",
          "last_modified_time",
          "system_status",
          "audit_status");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {}

  public AndroidChannelPackagesGetResponseData getAndroidChannelPackages() throws Exception {
    AndroidChannelPackagesGetResponseData response =
        tencentAds
            .androidChannelPackages()
            .androidChannelPackagesGet(
                accountId, androidAppId, myappAuthKey, filtering, page, pageSize, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetAndroidChannelPackages getAndroidChannelPackages = new GetAndroidChannelPackages();
      getAndroidChannelPackages.init();
      AndroidChannelPackagesGetResponseData response =
          getAndroidChannelPackages.getAndroidChannelPackages();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

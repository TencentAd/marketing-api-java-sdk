package com.tencent.ads.examples.v3.AudienceManagement.CustomAudienceFiles;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.v3.TencentAds;
import java.io.File;

public class AddCustomAudienceFiles {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public Long audienceId = null;

  public String userIdType = "QQ";

  public File file = new File("YOUR AUDIENCE FILE PATH");

  public String operationType = null;

  public String openAppId = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public CustomAudienceFilesAddResponseData addCustomAudienceFiles() throws Exception {
    CustomAudienceFilesAddResponseData response =
        tencentAds
            .customAudienceFiles()
            .customAudienceFilesAdd(
                accountId, audienceId, userIdType, file, operationType, openAppId);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddCustomAudienceFiles addCustomAudienceFiles = new AddCustomAudienceFiles();
      addCustomAudienceFiles.init();
      CustomAudienceFilesAddResponseData response = addCustomAudienceFiles.addCustomAudienceFiles();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

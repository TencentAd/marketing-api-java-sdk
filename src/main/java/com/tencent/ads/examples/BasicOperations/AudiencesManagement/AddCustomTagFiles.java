package com.tencent.ads.examples.BasicOperations.AudiencesManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import java.io.File;

public class AddCustomTagFiles {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public String userIdType = "QQ";

  public Long tagId = null;

  public File file = new File("YOUR TAG FILE PATH");

  public String operationType = null;

  public String openAppId = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public CustomTagFilesAddResponseData addCustomTagFiles() throws Exception {
    CustomTagFilesAddResponseData response =
        tencentAds
            .customTagFiles()
            .customTagFilesAdd(accountId, userIdType, tagId, file, operationType, openAppId);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddCustomTagFiles addCustomTagFiles = new AddCustomTagFiles();
      addCustomTagFiles.init();
      CustomTagFilesAddResponseData response = addCustomTagFiles.addCustomTagFiles();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

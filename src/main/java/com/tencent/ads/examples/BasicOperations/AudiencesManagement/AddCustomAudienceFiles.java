package com.tencent.ads.examples.BasicOperations.AudiencesManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.CustomAudienceFilesAddResponseData;
import java.io.File;

/*****
 * 本文件提供了一个创建客户人群数据文件(Custom audience file)的简单示例
 */
public class AddCustomAudienceFiles {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR AUDIENCE ID
   */
  public Long AUDIENCE_ID = 0L; // 人群ID
  /**
   * USER_ID_TYPE
   */
  public String USER_ID_TYPE = "QQ"; // QQ号码包
  /**
   * AUDIENCE_FILE_PATH
   */
  public String AUDIENCE_FILE_PATH = "YOUR AUDIENCE FILE PATH"; // 人群包文件路径
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

  public CustomAudienceFilesAddResponseData addCustomAudienceFiles() throws Exception {
    CustomAudienceFilesAddResponseData response = tencentAds.customAudienceFiles()
        .customAudienceFilesAdd(ACCOUNT_ID, AUDIENCE_ID,
            USER_ID_TYPE, new File(AUDIENCE_FILE_PATH), null, null, null);
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

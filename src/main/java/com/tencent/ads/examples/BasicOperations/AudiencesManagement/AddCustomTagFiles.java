package com.tencent.ads.examples.BasicOperations.AudiencesManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.CustomTagFilesAddResponseData;
import java.io.File;

/*****
 * 本文件提供了一个创建客户标签数据文件(Custom tag file)的简单示例
 */
public class AddCustomTagFiles {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR TAG ID
   */
  public Long TAG_ID = 0L; // 标签ID
  /**
   * USER_ID_TYPE
   */
  public String USER_ID_TYPE = "QQ"; // QQ号码包
  /**
   * TAG_FILE_PATH
   */
  public String TAG_FILE_PATH = "YOUR TAG FILE PATH"; // 标签人群文件路径
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

  public CustomTagFilesAddResponseData addCustomTagFiles() throws Exception {
    CustomTagFilesAddResponseData response = tencentAds.customTagFiles()
        .customTagFilesAdd(ACCOUNT_ID, USER_ID_TYPE,
            TAG_ID, new File(TAG_FILE_PATH), null, null);

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

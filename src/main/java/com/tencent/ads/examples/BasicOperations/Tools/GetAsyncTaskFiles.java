package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;

public class GetAsyncTaskFiles {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR TASK ID
   */
  public Long TASK_ID = 0L; // 异步任务ID
  /**
   * YOUR TASK FILE ID
   */
  public Long FILE_ID = 0L; // 异步任务文件ID
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

  public String getAsyncTaskFiles() throws Exception {
    String response = tencentAds.asyncTaskFiles()
        .asyncTaskFilesGet(ACCOUNT_ID, TASK_ID, FILE_ID, null);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetAsyncTaskFiles getAsyncTaskFiles = new GetAsyncTaskFiles();
      getAsyncTaskFiles.init();
      String response = getAsyncTaskFiles.getAsyncTaskFiles();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

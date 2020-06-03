package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AsyncTasksGetResponseData;
import java.util.Arrays;

/*****
 * 本文件提供了一个获取异步任务(Async task)列表的简单示例
 */
public class GetAsyncTasks {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
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

  public AsyncTasksGetResponseData getAsyncTasks() throws Exception {

    AsyncTasksGetResponseData response = tencentAds.asyncTasks()
        .asyncTasksGet(ACCOUNT_ID, null, null, null,
            Arrays.asList("task_id", "task_name", "task_type", "status", "created_time", "result"));
    return response;

  }

  public static void main(String[] args) {
    try {
      GetAsyncTasks getAsyncTasks = new GetAsyncTasks();
      getAsyncTasks.init();
      AsyncTasksGetResponseData response = getAsyncTasks.getAsyncTasks();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

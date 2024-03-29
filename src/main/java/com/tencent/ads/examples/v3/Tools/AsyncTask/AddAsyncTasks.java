package com.tencent.ads.examples.v3.Tools.AsyncTask;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.AsyncTasksAddRequest;
import com.tencent.ads.v3.TencentAds;

public class AddAsyncTasks {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public String taskName = "SDK异步任务5ede252e2f1db";
  public AsyncTasksAddRequest data = new AsyncTasksAddRequest();
  public Long accountId = null;
  public TaskType taskType = TaskType.AD_HOURLY_REPORT;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setTaskName(taskName);

    data.setAccountId(accountId);

    data.setTaskType(taskType);

    data.setTaskSpec(taskSpec);
  }

  public AsyncTasksAddResponseData addAsyncTasks() throws Exception {
    AsyncTasksAddResponseData response = tencentAds.asyncTasks().asyncTasksAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddAsyncTasks addAsyncTasks = new AddAsyncTasks();
      addAsyncTasks.init();
      AsyncTasksAddResponseData response = addAsyncTasks.addAsyncTasks();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AsyncTasksAddRequest;
import com.tencent.ads.model.AsyncTasksAddResponseData;
import com.tencent.ads.model.TaskSpec;
import com.tencent.ads.model.TaskType;
import com.tencent.ads.model.TaskTypeAdHourlyReportSpec;
import java.util.UUID;


/*****
 * 本文件提供了一个创建异步任务(Async task)的简单示例
 */
public class AddAsyncTasks {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR TASK_TYPE
   */
  public TaskType TASK_TYPE = TaskType.TASK_TYPE_AD_HOURLY_REPORT; // 广告小时报表数据
  /**
   * YOUR REPORT DATE
   */
  public String DATE = "REPORT DATE"; // 报表查询日期 YYYY-MM-DD
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

  public AsyncTasksAddResponseData addAsyncTasks() throws Exception {
    AsyncTasksAddRequest data = new AsyncTasksAddRequest();
    data.accountId(ACCOUNT_ID);
    data.taskType(TASK_TYPE);
    data.taskName("SDK异步任务" + UUID.randomUUID().toString().substring(0, 10));
    data.taskSpec(
        new TaskSpec().taskTypeAdHourlyReportSpec(new TaskTypeAdHourlyReportSpec().date(DATE)));
    AsyncTasksAddResponseData response = tencentAds.asyncTasks().asyncTasksAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddAsyncTasks addAsyncTasks = new AddAsyncTasks();
      addAsyncTasks.init();
      AsyncTasksAddResponseData response = addAsyncTasks.addAsyncTasks();
      if (response != null) {
        response.getTaskId();
      }
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
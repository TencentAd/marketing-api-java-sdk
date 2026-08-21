package com.tencent.ads.examples.v3.ReviewTool.PreReviewTask;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.PreReviewTaskAddRequest;
import com.tencent.ads.v3.TencentAds;

public class AddPreReviewTask {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public PreReviewTaskAddRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public PreReviewTaskAddResponseData addPreReviewTask() throws Exception {
    PreReviewTaskAddResponseData response = tencentAds.preReviewTask().preReviewTaskAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddPreReviewTask addPreReviewTask = new AddPreReviewTask();
      addPreReviewTask.init();
      PreReviewTaskAddResponseData response = addPreReviewTask.addPreReviewTask();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

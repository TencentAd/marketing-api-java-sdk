package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.ObjectCommentFlagUpdateRequest;
import com.tencent.ads.model.ObjectCommentFlagUpdateResponse;

public class UpdateObjectCommentFlag {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public ObjectCommentFlagUpdateRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {}

  public ObjectCommentFlagUpdateResponse updateObjectCommentFlag() throws Exception {
    ObjectCommentFlagUpdateResponse response =
        tencentAds.objectCommentFlag().objectCommentFlagUpdate(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      UpdateObjectCommentFlag updateObjectCommentFlag = new UpdateObjectCommentFlag();
      updateObjectCommentFlag.init();
      ObjectCommentFlagUpdateResponse response = updateObjectCommentFlag.updateObjectCommentFlag();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

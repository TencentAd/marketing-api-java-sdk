package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.WechatPagesCsgroupStatusUpdateRequest;
import com.tencent.ads.model.WechatPagesCsgroupStatusUpdateResponse;

public class UpdateWechatPagesCsgroupStatus {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public WechatPagesCsgroupStatusUpdateRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public WechatPagesCsgroupStatusUpdateResponse updateWechatPagesCsgroupStatus() throws Exception {
    WechatPagesCsgroupStatusUpdateResponse response =
        tencentAds.wechatPagesCsgroupStatus().wechatPagesCsgroupStatusUpdate(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      UpdateWechatPagesCsgroupStatus updateWechatPagesCsgroupStatus =
          new UpdateWechatPagesCsgroupStatus();
      updateWechatPagesCsgroupStatus.init();
      WechatPagesCsgroupStatusUpdateResponse response =
          updateWechatPagesCsgroupStatus.updateWechatPagesCsgroupStatus();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

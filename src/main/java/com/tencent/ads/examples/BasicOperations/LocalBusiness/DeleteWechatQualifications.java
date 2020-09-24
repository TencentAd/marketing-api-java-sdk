package com.tencent.ads.examples.BasicOperations.LocalBusiness;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.WechatQualificationsDeleteRequest;

public class DeleteWechatQualifications {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public WechatQualificationsDeleteRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {}

  public WechatQualificationsDeleteResponseData deleteWechatQualifications() throws Exception {
    WechatQualificationsDeleteResponseData response =
        tencentAds.wechatQualifications().wechatQualificationsDelete(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      DeleteWechatQualifications deleteWechatQualifications = new DeleteWechatQualifications();
      deleteWechatQualifications.init();
      WechatQualificationsDeleteResponseData response =
          deleteWechatQualifications.deleteWechatQualifications();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

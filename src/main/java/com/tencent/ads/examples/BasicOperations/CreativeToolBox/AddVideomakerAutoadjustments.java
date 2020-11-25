package com.tencent.ads.examples.BasicOperations.CreativeToolBox;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.ManualAdjustment;
import com.tencent.ads.model.SmartAdjustment;
import java.io.File;

public class AddVideomakerAutoadjustments {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public String adjustmentType = null;

  public String videoId = null;

  public File videoFile = null;

  public String signature = null;

  public SmartAdjustment smartAdjustment = null;

  public ManualAdjustment manualAdjustment = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {}

  public VideomakerAutoadjustmentsAddResponseData addVideomakerAutoadjustments() throws Exception {
    VideomakerAutoadjustmentsAddResponseData response =
        tencentAds
            .videomakerAutoadjustments()
            .videomakerAutoadjustmentsAdd(
                accountId,
                adjustmentType,
                videoId,
                videoFile,
                signature,
                smartAdjustment,
                manualAdjustment);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddVideomakerAutoadjustments addVideomakerAutoadjustments =
          new AddVideomakerAutoadjustments();
      addVideomakerAutoadjustments.init();
      VideomakerAutoadjustmentsAddResponseData response =
          addVideomakerAutoadjustments.addVideomakerAutoadjustments();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

package com.tencent.ads.examples.v3.Tools.RtaExperimentData;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.RtaexpDataRoiGetRequest;
import com.tencent.ads.v3.TencentAds;

public class GetRtaexpDataRoi {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public RtaexpDataRoiGetRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public RtaexpDataRoiGetResponseData getRtaexpDataRoi() throws Exception {
    RtaexpDataRoiGetResponseData response = tencentAds.rtaexpDataRoi().rtaexpDataRoiGet(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetRtaexpDataRoi getRtaexpDataRoi = new GetRtaexpDataRoi();
      getRtaexpDataRoi.init();
      RtaexpDataRoiGetResponseData response = getRtaexpDataRoi.getRtaexpDataRoi();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

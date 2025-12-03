package com.tencent.ads.examples.v3.CreativeToolBox.Watermark;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.WatermarksAddRequest;
import com.tencent.ads.v3.TencentAds;

public class AddWatermarks {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public WatermarksAddRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public WatermarksAddResponseData addWatermarks() throws Exception {
    WatermarksAddResponseData response = tencentAds.watermarks().watermarksAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddWatermarks addWatermarks = new AddWatermarks();
      addWatermarks.init();
      WatermarksAddResponseData response = addWatermarks.addWatermarks();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

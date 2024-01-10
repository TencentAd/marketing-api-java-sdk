package com.tencent.ads.examples.v3.CreativeToolBox.MaterialLabels;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.MaterialLabelsBindRequest;
import com.tencent.ads.v3.TencentAds;

public class BindMaterialLabels {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public MaterialLabelsBindRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public MaterialLabelsBindResponseData bindMaterialLabels() throws Exception {
    MaterialLabelsBindResponseData response = tencentAds.materialLabels().materialLabelsBind(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      BindMaterialLabels bindMaterialLabels = new BindMaterialLabels();
      bindMaterialLabels.init();
      MaterialLabelsBindResponseData response = bindMaterialLabels.bindMaterialLabels();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

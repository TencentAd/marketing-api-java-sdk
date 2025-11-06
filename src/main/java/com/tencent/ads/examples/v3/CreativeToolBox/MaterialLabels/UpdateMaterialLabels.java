package com.tencent.ads.examples.v3.CreativeToolBox.MaterialLabels;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.MaterialLabelsUpdateRequest;
import com.tencent.ads.v3.TencentAds;

public class UpdateMaterialLabels {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public MaterialLabelsUpdateRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public MaterialLabelsUpdateResponseData updateMaterialLabels() throws Exception {
    MaterialLabelsUpdateResponseData response =
        tencentAds.materialLabels().materialLabelsUpdate(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      UpdateMaterialLabels updateMaterialLabels = new UpdateMaterialLabels();
      updateMaterialLabels.init();
      MaterialLabelsUpdateResponseData response = updateMaterialLabels.updateMaterialLabels();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

package com.tencent.ads.examples.v3.CreativeToolBox.MuseAi;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.MuseAiMaterialAddRequest;
import com.tencent.ads.v3.TencentAds;

public class AddMuseAiMaterial {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public MuseAiMaterialAddRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public MuseAiMaterialAddResponseData addMuseAiMaterial() throws Exception {
    MuseAiMaterialAddResponseData response = tencentAds.museAiMaterial().museAiMaterialAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddMuseAiMaterial addMuseAiMaterial = new AddMuseAiMaterial();
      addMuseAiMaterial.init();
      MuseAiMaterialAddResponseData response = addMuseAiMaterial.addMuseAiMaterial();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

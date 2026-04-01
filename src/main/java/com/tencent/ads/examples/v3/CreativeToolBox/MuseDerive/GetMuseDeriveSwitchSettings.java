package com.tencent.ads.examples.v3.CreativeToolBox.MuseDerive;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.v3.TencentAds;
import java.util.List;

public class GetMuseDeriveSwitchSettings {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public String marketingTargetType = null;

  public String marketingCarrierType = null;

  public Boolean automaticSiteEnabled = null;

  public List<String> siteSet = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public MuseDeriveSwitchSettingsGetResponseData getMuseDeriveSwitchSettings() throws Exception {
    MuseDeriveSwitchSettingsGetResponseData response =
        tencentAds
            .museDeriveSwitchSettings()
            .museDeriveSwitchSettingsGet(
                accountId,
                marketingTargetType,
                marketingCarrierType,
                automaticSiteEnabled,
                siteSet,
                fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetMuseDeriveSwitchSettings getMuseDeriveSwitchSettings = new GetMuseDeriveSwitchSettings();
      getMuseDeriveSwitchSettings.init();
      MuseDeriveSwitchSettingsGetResponseData response =
          getMuseDeriveSwitchSettings.getMuseDeriveSwitchSettings();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

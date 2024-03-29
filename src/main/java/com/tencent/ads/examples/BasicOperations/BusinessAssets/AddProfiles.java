package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.ProfilesAddRequest;

public class AddProfiles {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public ProfilesAddRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public ProfilesAddResponseData addProfiles() throws Exception {
    ProfilesAddResponseData response = tencentAds.profiles().profilesAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddProfiles addProfiles = new AddProfiles();
      addProfiles.init();
      ProfilesAddResponseData response = addProfiles.addProfiles();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

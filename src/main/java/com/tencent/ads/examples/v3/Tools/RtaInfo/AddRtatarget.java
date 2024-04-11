package com.tencent.ads.examples.v3.Tools.RtaInfo;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.RtatargetAddRequest;
import com.tencent.ads.model.v3.RtatargetAddResponse;
import com.tencent.ads.v3.TencentAds;

public class AddRtatarget {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public RtatargetAddRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public RtatargetAddResponse addRtatarget() throws Exception {
    RtatargetAddResponse response = tencentAds.rtatarget().rtatargetAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddRtatarget addRtatarget = new AddRtatarget();
      addRtatarget.init();
      RtatargetAddResponse response = addRtatarget.addRtatarget();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

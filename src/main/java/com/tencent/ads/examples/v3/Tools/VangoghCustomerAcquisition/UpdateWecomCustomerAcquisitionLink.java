package com.tencent.ads.examples.v3.Tools.VangoghCustomerAcquisition;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.WecomCustomerAcquisitionLinkUpdateRequest;
import com.tencent.ads.model.v3.WecomCustomerAcquisitionLinkUpdateResponse;
import com.tencent.ads.v3.TencentAds;

public class UpdateWecomCustomerAcquisitionLink {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public WecomCustomerAcquisitionLinkUpdateRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public WecomCustomerAcquisitionLinkUpdateResponse updateWecomCustomerAcquisitionLink()
      throws Exception {
    WecomCustomerAcquisitionLinkUpdateResponse response =
        tencentAds.wecomCustomerAcquisitionLink().wecomCustomerAcquisitionLinkUpdate(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      UpdateWecomCustomerAcquisitionLink updateWecomCustomerAcquisitionLink =
          new UpdateWecomCustomerAcquisitionLink();
      updateWecomCustomerAcquisitionLink.init();
      WecomCustomerAcquisitionLinkUpdateResponse response =
          updateWecomCustomerAcquisitionLink.updateWecomCustomerAcquisitionLink();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.CreativeComponentsUpdateRequest;

public class UpdateCreativeComponents {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public CreativeComponentsUpdateRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public CreativeComponentsUpdateResponseData updateCreativeComponents() throws Exception {
    CreativeComponentsUpdateResponseData response =
        tencentAds.creativeComponents().creativeComponentsUpdate(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      UpdateCreativeComponents updateCreativeComponents = new UpdateCreativeComponents();
      updateCreativeComponents.init();
      CreativeComponentsUpdateResponseData response =
          updateCreativeComponents.updateCreativeComponents();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

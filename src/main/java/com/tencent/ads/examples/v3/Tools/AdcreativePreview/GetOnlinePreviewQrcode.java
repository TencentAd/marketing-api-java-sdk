package com.tencent.ads.examples.v3.Tools.AdcreativePreview;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.PreviewCreativeComponents;
import com.tencent.ads.v3.TencentAds;
import java.util.List;

public class GetOnlinePreviewQrcode {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public Long dynamicCreativeId = null;

  public String userIdType = null;

  public PreviewCreativeComponents previewCreativeComponents = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public OnlinePreviewQrcodeGetResponseData getOnlinePreviewQrcode() throws Exception {
    OnlinePreviewQrcodeGetResponseData response =
        tencentAds
            .onlinePreviewQrcode()
            .onlinePreviewQrcodeGet(
                accountId, dynamicCreativeId, userIdType, previewCreativeComponents, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetOnlinePreviewQrcode getOnlinePreviewQrcode = new GetOnlinePreviewQrcode();
      getOnlinePreviewQrcode.init();
      OnlinePreviewQrcodeGetResponseData response = getOnlinePreviewQrcode.getOnlinePreviewQrcode();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

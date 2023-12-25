package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import java.util.List;

public class GetDynamicAdVideo {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public Long productCatalogId = null;

  public String productMode = null;

  public String productOuterId = null;

  public Long dynamicAdTemplateId = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public DynamicAdVideoGetResponseData getDynamicAdVideo() throws Exception {
    DynamicAdVideoGetResponseData response =
        tencentAds
            .dynamicAdVideo()
            .dynamicAdVideoGet(
                accountId,
                productCatalogId,
                productMode,
                productOuterId,
                dynamicAdTemplateId,
                fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetDynamicAdVideo getDynamicAdVideo = new GetDynamicAdVideo();
      getDynamicAdVideo.init();
      DynamicAdVideoGetResponseData response = getDynamicAdVideo.getDynamicAdVideo();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

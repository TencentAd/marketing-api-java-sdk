package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.DynamicAdVideoAddRequest;

public class AddDynamicAdVideo {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long productCatalogId = null;
  public DynamicAdVideoAddRequest data = new DynamicAdVideoAddRequest();
  public Long videoMaxDuration = 240L;
  public Long accountId = null;
  public AdNum productMode = AdNum.SINGLE;
  public String productSource = "YOUR PRODUCT ID";
  public Long dynamicAdTemplateId = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {
    data.setProductCatalogId(productCatalogId);

    data.setVideoMaxDuration(videoMaxDuration);

    data.setAccountId(accountId);

    data.setProductMode(productMode);

    data.setProductSource(productSource);

    data.setDynamicAdTemplateId(dynamicAdTemplateId);
  }

  public DynamicAdVideoAddResponseData addDynamicAdVideo() throws Exception {
    DynamicAdVideoAddResponseData response = tencentAds.dynamicAdVideo().dynamicAdVideoAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddDynamicAdVideo addDynamicAdVideo = new AddDynamicAdVideo();
      addDynamicAdVideo.init();
      DynamicAdVideoAddResponseData response = addDynamicAdVideo.addDynamicAdVideo();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

package com.tencent.ads.examples.v3.ReviewTool.ComponentElementUrgeReview;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.v3.TencentAds;
import java.util.List;

public class GetComponentElementUrgeReview {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public Long dynamicCreativeId = null;

  public List<Long> componentIdList = null;

  public List<String> elementFingerprintList = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public ComponentElementUrgeReviewGetResponseData getComponentElementUrgeReview()
      throws Exception {
    ComponentElementUrgeReviewGetResponseData response =
        tencentAds
            .componentElementUrgeReview()
            .componentElementUrgeReviewGet(
                accountId, dynamicCreativeId, componentIdList, elementFingerprintList, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetComponentElementUrgeReview getComponentElementUrgeReview =
          new GetComponentElementUrgeReview();
      getComponentElementUrgeReview.init();
      ComponentElementUrgeReviewGetResponseData response =
          getComponentElementUrgeReview.getComponentElementUrgeReview();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

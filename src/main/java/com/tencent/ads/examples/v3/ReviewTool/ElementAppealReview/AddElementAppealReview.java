package com.tencent.ads.examples.v3.ReviewTool.ElementAppealReview;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.ElementAppealReviewAddRequest;
import com.tencent.ads.model.v3.ElementAppealReviewAddResponse;
import com.tencent.ads.v3.TencentAds;

public class AddElementAppealReview {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public ElementAppealReviewAddRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public ElementAppealReviewAddResponse addElementAppealReview() throws Exception {
    ElementAppealReviewAddResponse response =
        tencentAds.elementAppealReview().elementAppealReviewAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddElementAppealReview addElementAppealReview = new AddElementAppealReview();
      addElementAppealReview.init();
      ElementAppealReviewAddResponse response = addElementAppealReview.addElementAppealReview();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

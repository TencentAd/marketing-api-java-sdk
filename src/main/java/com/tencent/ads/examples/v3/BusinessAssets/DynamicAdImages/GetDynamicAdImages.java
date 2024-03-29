package com.tencent.ads.examples.v3.BusinessAssets.DynamicAdImages;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.FilteringStruct;
import com.tencent.ads.v3.TencentAds;
import java.util.Arrays;
import java.util.List;

public class GetDynamicAdImages {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public List<FilteringStruct> filtering = null;

  public Long page = null;

  public Long pageSize = null;

  public List<String> fields =
      Arrays.asList("image_id", "dynamic_ad_template_id", "width", "height", "sample_image_url");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public DynamicAdImagesGetResponseData getDynamicAdImages() throws Exception {
    DynamicAdImagesGetResponseData response =
        tencentAds
            .dynamicAdImages()
            .dynamicAdImagesGet(accountId, filtering, page, pageSize, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetDynamicAdImages getDynamicAdImages = new GetDynamicAdImages();
      getDynamicAdImages.init();
      DynamicAdImagesGetResponseData response = getDynamicAdImages.getDynamicAdImages();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

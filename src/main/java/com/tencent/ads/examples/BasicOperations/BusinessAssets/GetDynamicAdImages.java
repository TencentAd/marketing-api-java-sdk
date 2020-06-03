package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.DynamicAdImagesGetResponseData;
import java.util.Arrays;

/*****
 * 本文件提供了一个获取动态商品图片(Dynamic ad image)列表的简单示例
 */
public class GetDynamicAdImages {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * TencentAds
   */
  public TencentAds tencentAds;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true));// debug==true 会打印请求详细信息
    this.tencentAds.useSandbox();// 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
  }

  public DynamicAdImagesGetResponseData getDynamicAdImages() throws Exception {
    DynamicAdImagesGetResponseData response = tencentAds.dynamicAdImages()
        .dynamicAdImagesGet(ACCOUNT_ID, null, null, null,
            Arrays.asList("image_id", "dynamic_ad_template_id", "width", "height",
                "sample_image_url"));
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

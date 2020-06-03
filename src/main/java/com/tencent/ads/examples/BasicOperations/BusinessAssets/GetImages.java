package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.FilteringStruct;
import com.tencent.ads.model.ImagesGetResponseData;
import java.util.Arrays;


/*****
 * 本文件提供了一个获取图片(Image)列表的简单示例
 */
public class GetImages {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR IMAGE ID
   */
  public Long IMAGE_ID = 0L;
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

  public ImagesGetResponseData getImages() throws Exception {
    ImagesGetResponseData response = tencentAds.images().imagesGet(ACCOUNT_ID, Arrays.asList(
        new FilteringStruct().field("image_id").values(Arrays.asList(String.valueOf(IMAGE_ID)))
            .operator("EQUALS")), null, null, Arrays
        .asList("image_id", "width", "height", "file_size", "type", "signature", "source_signature",
            "preview_url", "source_type", "created_time", "last_modified_time"));
    return response;

  }

  public static void main(String[] args) {
    try {
      GetImages getImages = new GetImages();
      getImages.init();
      ImagesGetResponseData response = getImages.getImages();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

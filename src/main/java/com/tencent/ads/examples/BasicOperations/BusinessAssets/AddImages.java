package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.ImagesAddResponseData;
import com.tencent.ads.utils.SignatureUtils;
import java.io.File;

/*****
 * 本文件提供了一个创建图片(Image)的简单示例
 */
public class AddImages {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR IMAGE FILE PATH
   */
  public String IMAGE_FILE = "YOUR IMAGE FILE PATH";

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

  public ImagesAddResponseData addImages() throws Exception {
    ImagesAddResponseData response = tencentAds.images()
        .imagesAdd(ACCOUNT_ID, "UPLOAD_TYPE_FILE", SignatureUtils.getMD5Checksum(IMAGE_FILE),
            new File(IMAGE_FILE), null, null);
    return response;

  }

  public static void main(String[] args) {
    try {
      AddImages addImages = new AddImages();
      addImages.init();
      ImagesAddResponseData response = addImages.addImages();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

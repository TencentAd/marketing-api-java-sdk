package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.VideosAddResponseData;
import com.tencent.ads.utils.SignatureUtils;
import java.io.File;

/*****
 * 本文件提供了一个创建视频(Video)的简单示例
 */
public class AddVideos {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR VIDEO FILE PATH
   */
  public String VIDEO_FILE = "YOUR VIDEO FILE PATH";
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

  public VideosAddResponseData addVideos() throws Exception {
    VideosAddResponseData response = tencentAds.videos()
        .videosAdd(ACCOUNT_ID, new File(VIDEO_FILE), SignatureUtils.getMD5Checksum(VIDEO_FILE),
            null, null);
    return response;

  }

  public static void main(String[] args) {
    try {
      AddVideos addVideos = new AddVideos();
      addVideos.init();
      VideosAddResponseData response = addVideos.addVideos();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

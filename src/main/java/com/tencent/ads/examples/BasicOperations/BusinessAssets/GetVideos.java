package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.FilteringStruct;
import com.tencent.ads.model.VideosGetResponseData;
import java.util.Arrays;

/*****
 * 本文件提供了一个获取视频(Video)列表的简单示例
 */
public class GetVideos {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR VIDEO ID
   */
  public Long VIDEO_ID = 0L;
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

  public VideosGetResponseData getVideos() throws Exception {
    VideosGetResponseData response = tencentAds.videos().videosGet(ACCOUNT_ID, Arrays.asList(
        new FilteringStruct().operator("EQUALS").field("media_id")
            .values(Arrays.asList(String.valueOf(VIDEO_ID)))), null,
        null, Arrays
            .asList("video_id", "width", "height", "video_frames", "video_fps", "video_codec",
                "video_bit_rate", "audio_codec", "audio_bit_rate", "file_size", "type", "signature",
                "system_status", "description", "preview_url", "created_time", "last_modified_time",
                "video_profile_name", "audio_sample_rate", "max_keyframe_interval",
                "min_keyframe_interval", "sample_aspect_ratio", "audio_profile_name", "scan_type",
                "image_duration_millisecond", "audio_duration_millisecond", "source_type"));
    return response;

  }

  public static void main(String[] args) {
    try {
      GetVideos getVideos = new GetVideos();
      getVideos.init();
      VideosGetResponseData response = getVideos.getVideos();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

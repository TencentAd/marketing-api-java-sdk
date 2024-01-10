package com.tencent.ads.examples.v3.BusinessAssets.Video;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.v3.TencentAds;
import java.io.File;
import java.util.List;

public class AddVideos {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public File videoFile = new File("YOUR VIDEO FILE PATH");

  public String signature = null;

  public String description = null;

  public Long adcreativeTemplateId = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public VideosAddResponseData addVideos() throws Exception {
    VideosAddResponseData response =
        tencentAds
            .videos()
            .videosAdd(accountId, videoFile, signature, description, adcreativeTemplateId, fields);
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

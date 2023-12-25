package com.tencent.ads.examples.BasicOperations.CreativeToolBox;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import java.io.File;

public class AddVideomakerVideocaptures {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public String videoId = null;

  public File videoFile = null;

  public String signature = null;

  public Long number = null;

  public Boolean returnImageIds = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public VideomakerVideocapturesAddResponseData addVideomakerVideocaptures() throws Exception {
    VideomakerVideocapturesAddResponseData response =
        tencentAds
            .videomakerVideocaptures()
            .videomakerVideocapturesAdd(
                accountId, videoId, videoFile, signature, number, returnImageIds);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddVideomakerVideocaptures addVideomakerVideocaptures = new AddVideomakerVideocaptures();
      addVideomakerVideocaptures.init();
      VideomakerVideocapturesAddResponseData response =
          addVideomakerVideocaptures.addVideomakerVideocaptures();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

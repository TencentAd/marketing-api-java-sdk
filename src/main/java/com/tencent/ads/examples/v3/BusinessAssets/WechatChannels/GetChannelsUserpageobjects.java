package com.tencent.ads.examples.v3.BusinessAssets.WechatChannels;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.v3.TencentAds;
import java.util.List;

public class GetChannelsUserpageobjects {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public String finderUsername = null;

  public String nickname = null;

  public String lastBuffer = null;

  public Long count = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public ChannelsUserpageobjectsGetResponseData getChannelsUserpageobjects() throws Exception {
    ChannelsUserpageobjectsGetResponseData response =
        tencentAds
            .channelsUserpageobjects()
            .channelsUserpageobjectsGet(
                accountId, finderUsername, nickname, lastBuffer, count, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetChannelsUserpageobjects getChannelsUserpageobjects = new GetChannelsUserpageobjects();
      getChannelsUserpageobjects.init();
      ChannelsUserpageobjectsGetResponseData response =
          getChannelsUserpageobjects.getChannelsUserpageobjects();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

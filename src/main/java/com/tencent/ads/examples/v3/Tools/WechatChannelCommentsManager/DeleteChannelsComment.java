package com.tencent.ads.examples.v3.Tools.WechatChannelCommentsManager;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.ChannelsCommentDeleteRequest;
import com.tencent.ads.model.v3.ChannelsCommentDeleteResponse;
import com.tencent.ads.v3.TencentAds;

public class DeleteChannelsComment {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public ChannelsCommentDeleteRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public ChannelsCommentDeleteResponse deleteChannelsComment() throws Exception {
    ChannelsCommentDeleteResponse response =
        tencentAds.channelsComment().channelsCommentDelete(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      DeleteChannelsComment deleteChannelsComment = new DeleteChannelsComment();
      deleteChannelsComment.init();
      ChannelsCommentDeleteResponse response = deleteChannelsComment.deleteChannelsComment();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
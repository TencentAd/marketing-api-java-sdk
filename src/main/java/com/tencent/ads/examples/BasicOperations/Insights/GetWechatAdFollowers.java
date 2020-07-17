package com.tencent.ads.examples.BasicOperations.Insights;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.TimeRange;
import java.util.Arrays;
import java.util.List;

public class GetWechatAdFollowers {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public TimeRange timeRange = new TimeRange();

  public Long page = null;

  public Long pageSize = null;

  public List<String> fields =
      Arrays.asList(
          "openid",
          "wechat_adgroup_id",
          "wechat_campaign_id",
          "wechat_account_id",
          "wechat_agency_id",
          "subscribe_time",
          "position_type");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {
    Long startTime = null;
    timeRange.setStartTime(startTime);
    Long endTime = null;
    timeRange.setEndTime(endTime);
  }

  public WechatAdFollowersGetResponseData getWechatAdFollowers() throws Exception {
    WechatAdFollowersGetResponseData response =
        tencentAds.wechatAdFollowers().wechatAdFollowersGet(timeRange, page, pageSize, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetWechatAdFollowers getWechatAdFollowers = new GetWechatAdFollowers();
      getWechatAdFollowers.init();
      WechatAdFollowersGetResponseData response = getWechatAdFollowers.getWechatAdFollowers();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

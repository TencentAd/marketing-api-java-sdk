package com.tencent.ads.examples.BasicOperations.Account;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.WechatAdvertiserGetResponseData;
import java.util.List;

/**
 * 本文件提供了一个获取微信平台广告主(Wechat advertiser)列表的简单示例
 */
public class GetWechatAdvertiser {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
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

  public WechatAdvertiserGetResponseData getWechatAdvertiser() throws Exception {
    Long page = null;
    Long pageSize = null;
    List<String> fields = null;
    WechatAdvertiserGetResponseData response = tencentAds.wechatAdvertiser()
        .wechatAdvertiserGet(page, pageSize, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetWechatAdvertiser getWechatAdvertiser = new GetWechatAdvertiser();
      getWechatAdvertiser.init();
      WechatAdvertiserGetResponseData responseData = getWechatAdvertiser.getWechatAdvertiser();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
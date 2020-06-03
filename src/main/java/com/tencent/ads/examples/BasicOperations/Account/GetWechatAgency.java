package com.tencent.ads.examples.BasicOperations.Account;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.WechatAgencyGetResponseData;
import java.util.Arrays;
import java.util.List;

/**
 * 本文件提供了一个获取微信服务商(Wechat agency)列表的简单示例
 */
public class GetWechatAgency {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
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

  public WechatAgencyGetResponseData getWechatAgency() throws Exception {
    Long accountId = ACCOUNT_ID;
    List<String> fields = Arrays
        .asList("account_id", "wechat_account_id", "wechat_account_name", "corporation_name",
            "admin_name", "admin_phone_number", "admin_wechat_id", "certification_image",
            "corporation_licence", "advertiser_info_spec");
    WechatAgencyGetResponseData response = tencentAds.wechatAgency()
        .wechatAgencyGet(accountId, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetWechatAgency getWechatAgency = new GetWechatAgency();
      getWechatAgency.init();
      WechatAgencyGetResponseData responseData = getWechatAgency.getWechatAgency();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
package com.tencent.ads.examples.BasicOperations.Account;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.FilteringStruct;
import com.tencent.ads.model.WechatAdvertiserDetailGetResponseData;
import java.util.Arrays;
import java.util.List;

/**
 * 本文件提供了一个获取微信平台广告主信息(Wechat advertiser detail)的简单示例
 */
public class GetWechatAdvertiserDetail {

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

  public WechatAdvertiserDetailGetResponseData getWechatAdvertiserDetail() throws Exception {
    Long accountId = ACCOUNT_ID;
    List<FilteringStruct> filtering = null;
    Long page = null;
    Long pageSize = null;
    List<String> fields = Arrays
        .asList("account_id", "wechat_account_name", "system_industry_id", "wechat_account_id",
            "account_type", "corporation_name", "auth_status", "auth_time", "agency_id_list",
            "staff_wechat_id_list", "daily_budget");
    WechatAdvertiserDetailGetResponseData response = tencentAds.wechatAdvertiserDetail()
        .wechatAdvertiserDetailGet(accountId, filtering, page, pageSize, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetWechatAdvertiserDetail getWechatAdvertiserDetail = new GetWechatAdvertiserDetail();
      getWechatAdvertiserDetail.init();
      WechatAdvertiserDetailGetResponseData responseData = getWechatAdvertiserDetail
          .getWechatAdvertiserDetail();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
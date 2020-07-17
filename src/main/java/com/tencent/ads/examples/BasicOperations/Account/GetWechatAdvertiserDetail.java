package com.tencent.ads.examples.BasicOperations.Account;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.FilteringStruct;
import java.util.Arrays;
import java.util.List;

public class GetWechatAdvertiserDetail {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public List<FilteringStruct> filtering = null;

  public Long page = null;

  public Long pageSize = null;

  public List<String> fields =
      Arrays.asList(
          "account_id",
          "wechat_account_name",
          "system_industry_id",
          "wechat_account_id",
          "account_type",
          "corporation_name",
          "auth_status",
          "auth_time",
          "agency_id_list",
          "staff_wechat_id_list",
          "daily_budget");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {}

  public WechatAdvertiserDetailGetResponseData getWechatAdvertiserDetail() throws Exception {
    WechatAdvertiserDetailGetResponseData response =
        tencentAds
            .wechatAdvertiserDetail()
            .wechatAdvertiserDetailGet(accountId, filtering, page, pageSize, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetWechatAdvertiserDetail getWechatAdvertiserDetail = new GetWechatAdvertiserDetail();
      getWechatAdvertiserDetail.init();
      WechatAdvertiserDetailGetResponseData response =
          getWechatAdvertiserDetail.getWechatAdvertiserDetail();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

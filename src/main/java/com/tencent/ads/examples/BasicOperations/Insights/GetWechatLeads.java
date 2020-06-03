package com.tencent.ads.examples.BasicOperations.Insights;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.WechatLeadsGetListStruct;
import com.tencent.ads.model.WechatLeadsGetResponseData;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetWechatLeads {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * REPORT START DATE
   */
  public String START_DATE = "REPORT START DATE"; // 报表开始日期 YYYY-MM-DDD
  /**
   * REPORT END DATE
   */
  public String END_DATE = "REPORT END DATE"; // 报表结束日期 YYYY-MM-DDD
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

  public WechatLeadsGetResponseData getWechatLeads() throws Exception {
    Map<String, Object> dateRange = new HashMap<>();
    dateRange.put("start_date", START_DATE);
    dateRange.put("end_date", END_DATE);
    WechatLeadsGetResponseData response = tencentAds.wechatLeads().wechatLeadsGet(dateRange,
        null, null, null, null,
        Arrays.asList("adgroup_id", "leads_info", "campaign_id", "campaign_name", "adgroup_name",
            "agency_id", "agency_name", "click_id"));
    return response;
  }

  public static void main(String[] args) {
    try {
      GetWechatLeads getWechatLeads = new GetWechatLeads();
      getWechatLeads.init();
      WechatLeadsGetResponseData response = getWechatLeads.getWechatLeads();
      if (response != null) {
        List<WechatLeadsGetListStruct> list = response.getList();
      }
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

package com.tencent.ads.examples.BasicOperations.Insights;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.LeadsGetListStruct;
import com.tencent.ads.model.LeadsGetResponseData;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetLeads {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR POSITION_TYPE
   */
  public String POSITION_TYPE = "POSITION_TYPE_WECHAT_MOMENTS"; // 朋友圈广告
  /**
   * YOUR START_TIME
   */
  public Long START_TIME = 0L; // 报表开始时间戳
  /**
   * YOUR END_TIME
   */
  public Long END_TIME = 0L; // 报表结束时间戳
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

  public LeadsGetResponseData getLeads() throws Exception {
    Map<String, Object> timeRange = new HashMap<>();
    timeRange.put("start_time", START_TIME);
    timeRange.put("end_time", END_TIME);
    LeadsGetResponseData response = tencentAds.leads().leadsGet(ACCOUNT_ID, timeRange,
        POSITION_TYPE, null, null, null,
        Arrays.asList("campaign_id", "campaign_name", "adgroup_id", "adgroup_name",
            "wechat_adgroup_id",
            "lead_spec_list", "wechat_campaign_id", "wechat_campaign_name", "wechat_adgroup_name",
            "wechat_agency_id", "wechat_agency_name", "click_id"));
    return response;
  }

  public static void main(String[] args) {
    try {
      GetLeads getLeads = new GetLeads();
      getLeads.init();
      LeadsGetResponseData response = getLeads.getLeads();
      if (response != null) {
        List<LeadsGetListStruct> list = response.getList();
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
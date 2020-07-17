package com.tencent.ads.examples.BasicOperations.Insights;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.FilteringStruct;
import com.tencent.ads.model.TimeRange;
import java.util.Arrays;
import java.util.List;

public class GetLeads {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public TimeRange timeRange = new TimeRange();

  public String positionType = "POSITION_TYPE_WECHAT_MOMENTS";

  public List<FilteringStruct> filtering = null;

  public Long page = null;

  public Long pageSize = null;

  public List<String> fields =
      Arrays.asList(
          "campaign_id",
          "campaign_name",
          "adgroup_id",
          "adgroup_name",
          "wechat_adgroup_id",
          "lead_spec_list",
          "wechat_campaign_id",
          "wechat_campaign_name",
          "wechat_adgroup_name",
          "wechat_agency_id",
          "wechat_agency_name",
          "click_id");

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

  public LeadsGetResponseData getLeads() throws Exception {
    LeadsGetResponseData response =
        tencentAds
            .leads()
            .leadsGet(accountId, timeRange, positionType, filtering, page, pageSize, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetLeads getLeads = new GetLeads();
      getLeads.init();
      LeadsGetResponseData response = getLeads.getLeads();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

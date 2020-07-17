package com.tencent.ads.examples.BasicOperations.Insights;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.DateRange;
import com.tencent.ads.model.FilteringStruct;
import com.tencent.ads.model.TimeRange;
import java.util.Arrays;
import java.util.List;

public class GetWechatLeads {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public DateRange dateRange = new DateRange();

  public TimeRange timeRange = null;

  public List<FilteringStruct> filtering = null;

  public Long page = null;

  public Long pageSize = null;

  public List<String> fields =
      Arrays.asList(
          "adgroup_id",
          "leads_info",
          "campaign_id",
          "campaign_name",
          "adgroup_name",
          "agency_id",
          "agency_name",
          "click_id");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {
    String startDate = "REPORT START DATE";
    dateRange.setStartDate(startDate);
    String endDate = "REPORT END DATE";
    dateRange.setEndDate(endDate);
  }

  public WechatLeadsGetResponseData getWechatLeads() throws Exception {
    WechatLeadsGetResponseData response =
        tencentAds
            .wechatLeads()
            .wechatLeadsGet(dateRange, timeRange, filtering, page, pageSize, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetWechatLeads getWechatLeads = new GetWechatLeads();
      getWechatLeads.init();
      WechatLeadsGetResponseData response = getWechatLeads.getWechatLeads();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

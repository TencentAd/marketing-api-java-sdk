package com.tencent.ads.examples.v3.Insights.Leads;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.LeadsAddRequest;
import com.tencent.ads.v3.TencentAds;

public class AddLeads {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public LeadsAddRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public LeadsAddResponseData addLeads() throws Exception {
    LeadsAddResponseData response = tencentAds.leads().leadsAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddLeads addLeads = new AddLeads();
      addLeads.init();
      LeadsAddResponseData response = addLeads.addLeads();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

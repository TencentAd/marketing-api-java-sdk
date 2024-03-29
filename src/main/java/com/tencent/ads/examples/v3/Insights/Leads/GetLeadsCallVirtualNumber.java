package com.tencent.ads.examples.v3.Insights.Leads;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.v3.TencentAds;
import java.util.List;

public class GetLeadsCallVirtualNumber {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public String caller = null;

  public String callee = null;

  public Long leadsId = null;

  public String outerLeadsId = null;

  public String requestId = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public LeadsCallVirtualNumberGetResponseData getLeadsCallVirtualNumber() throws Exception {
    LeadsCallVirtualNumberGetResponseData response =
        tencentAds
            .leadsCallVirtualNumber()
            .leadsCallVirtualNumberGet(
                accountId, caller, callee, leadsId, outerLeadsId, requestId, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetLeadsCallVirtualNumber getLeadsCallVirtualNumber = new GetLeadsCallVirtualNumber();
      getLeadsCallVirtualNumber.init();
      LeadsCallVirtualNumberGetResponseData response =
          getLeadsCallVirtualNumber.getLeadsCallVirtualNumber();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

package com.tencent.ads.examples.v3.AccountManagement.AccountType;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.FilteringStruct;
import com.tencent.ads.v3.TencentAds;
import java.util.Arrays;
import java.util.List;

public class GetRealtimeCost {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public String level = "ADVERTISER";

  public String date = "YOUR DATE";

  public List<FilteringStruct> filtering = null;

  public Long page = null;

  public Long pageSize = null;

  public List<String> fields = Arrays.asList("campaign_id", "adgroup_id", "cost");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public RealtimeCostGetResponseData getRealtimeCost() throws Exception {
    RealtimeCostGetResponseData response =
        tencentAds
            .realtimeCost()
            .realtimeCostGet(accountId, level, date, filtering, page, pageSize, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetRealtimeCost getRealtimeCost = new GetRealtimeCost();
      getRealtimeCost.init();
      RealtimeCostGetResponseData response = getRealtimeCost.getRealtimeCost();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

package com.tencent.ads.examples.v3.Tools.Estimation;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.v3.TencentAds;
import java.util.List;

public class GetBidSimulation {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public Long reqType = null;

  public Long optimizationGoalLevel = null;

  public Long adgroupId = null;

  public List<Long> bidList = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public BidSimulationGetResponseData getBidSimulation() throws Exception {
    BidSimulationGetResponseData response =
        tencentAds
            .bidSimulation()
            .bidSimulationGet(
                accountId, reqType, optimizationGoalLevel, adgroupId, bidList, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetBidSimulation getBidSimulation = new GetBidSimulation();
      getBidSimulation.init();
      BidSimulationGetResponseData response = getBidSimulation.getBidSimulation();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

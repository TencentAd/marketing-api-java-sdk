package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.BidwordFlowGetRequest;

public class GetBidwordFlow {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public BidwordFlowGetRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public BidwordFlowGetResponseData getBidwordFlow() throws Exception {
    BidwordFlowGetResponseData response = tencentAds.bidwordFlow().bidwordFlowGet(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetBidwordFlow getBidwordFlow = new GetBidwordFlow();
      getBidwordFlow.init();
      BidwordFlowGetResponseData response = getBidwordFlow.getBidwordFlow();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

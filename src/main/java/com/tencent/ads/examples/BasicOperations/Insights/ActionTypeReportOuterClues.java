package com.tencent.ads.examples.BasicOperations.Insights;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.OuterCluesActionTypeReportRequest;

public class ActionTypeReportOuterClues {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public OuterCluesActionTypeReportRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public OuterCluesActionTypeReportResponseData actiontypereportOuterClues() throws Exception {
    OuterCluesActionTypeReportResponseData response =
        tencentAds.outerClues().outerCluesActionTypeReport(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      ActionTypeReportOuterClues actiontypereportOuterClues = new ActionTypeReportOuterClues();
      actiontypereportOuterClues.init();
      OuterCluesActionTypeReportResponseData response =
          actiontypereportOuterClues.actiontypereportOuterClues();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

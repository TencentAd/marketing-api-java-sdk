package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.ReportConversionsPredictRequest;

public class ConversionsPredictReport {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public ReportConversionsPredictRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public ReportConversionsPredictResponseData conversionspredictReport() throws Exception {
    ReportConversionsPredictResponseData response =
        tencentAds.report().reportConversionsPredict(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      ConversionsPredictReport conversionspredictReport = new ConversionsPredictReport();
      conversionspredictReport.init();
      ReportConversionsPredictResponseData response =
          conversionspredictReport.conversionspredictReport();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

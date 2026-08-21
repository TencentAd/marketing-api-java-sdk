package com.tencent.ads.examples.v3.ReviewTool.SaasMiniprogramPrereview;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.v3.TencentAds;
import java.util.List;

public class GetSaasMiniprogramPrereview {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public String taskId = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public SaasMiniprogramPrereviewGetResponseData getSaasMiniprogramPrereview() throws Exception {
    SaasMiniprogramPrereviewGetResponseData response =
        tencentAds.saasMiniprogramPrereview().saasMiniprogramPrereviewGet(taskId, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetSaasMiniprogramPrereview getSaasMiniprogramPrereview = new GetSaasMiniprogramPrereview();
      getSaasMiniprogramPrereview.init();
      SaasMiniprogramPrereviewGetResponseData response =
          getSaasMiniprogramPrereview.getSaasMiniprogramPrereview();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

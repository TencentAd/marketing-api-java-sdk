package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.AdDiagnosisGetRequest;
import java.util.Arrays;
import java.util.List;

public class GetAdDiagnosis {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;
  public AdDiagnosisGetRequest data = new AdDiagnosisGetRequest();
  public List<String> detailFields =
      Arrays.asList(
          "funnel",
          "target_detail",
          "compete_detail",
          "exposure_detail",
          "click_detail",
          "conversion_detail",
          "cpa_detail",
          "operation_log",
          "optimization");
  public List<Long> adgroupIdList = Arrays.asList(0L);

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {
    data.setAccountId(accountId);

    data.setDetailFields(detailFields);

    data.setAdgroupIdList(adgroupIdList);
  }

  public AdDiagnosisGetResponseData getAdDiagnosis() throws Exception {
    AdDiagnosisGetResponseData response = tencentAds.adDiagnosis().adDiagnosisGet(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetAdDiagnosis getAdDiagnosis = new GetAdDiagnosis();
      getAdDiagnosis.init();
      AdDiagnosisGetResponseData response = getAdDiagnosis.getAdDiagnosis();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

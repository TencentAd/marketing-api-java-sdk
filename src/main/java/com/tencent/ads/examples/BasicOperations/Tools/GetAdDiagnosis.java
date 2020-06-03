package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AdDiagnosisGetRequest;
import com.tencent.ads.model.AdDiagnosisGetResponseData;
import java.util.Arrays;

/*****
 * 本文件提供了一个获取广告诊断信息(Ad diagnosis)列表的简单示例
 */
public class GetAdDiagnosis {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR ADGROUP ID
   */
  public Long ADGROUP_ID = 0L; // 广告组ID
  /**
   * TencentAds
   */
  public TencentAds tencentAds;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true));// debug==true 会打印请求详细信息
    this.tencentAds.useSandbox();// 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
  }

  public AdDiagnosisGetResponseData getAdDiagnosis() throws Exception {
    AdDiagnosisGetRequest data = new AdDiagnosisGetRequest();
    data.accountId(ACCOUNT_ID);
    data.adgroupIdList(Arrays.asList(ADGROUP_ID));
    data.detailFields(Arrays
        .asList("funnel", "target_detail", "compete_detail", "exposure_detail", "click_detail",
            "conversion_detail", "cpa_detail", "operation_log", "optimization"));
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

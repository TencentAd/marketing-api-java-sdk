package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.ComplianceValidationGetRequest;
import com.tencent.ads.model.ComplianceValidationGetResponseData;
import com.tencent.ads.model.SiteSet;

/*****
 * 本文件提供了一个获取广告素材预审结果(Compliance validation)的简单示例
 */
public class GetComplianceValidation {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR SITE_SET
   */
  public SiteSet SITE_SET = SiteSet.QZONE; // 投放站点
  /**
   * YOUR AD TEXT
   */
  public String TEXT = "YOUR AD TEXT"; // 需预审的文案
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

  public ComplianceValidationGetResponseData getComplianceValidation() throws Exception {
    ComplianceValidationGetRequest data = new ComplianceValidationGetRequest();
    data.accountId(ACCOUNT_ID);
    data.siteSet(SITE_SET);
    data.text(TEXT);
    ComplianceValidationGetResponseData response = tencentAds.complianceValidation()
        .complianceValidationGet(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetComplianceValidation getComplianceValidation = new GetComplianceValidation();
      getComplianceValidation.init();
      ComplianceValidationGetResponseData response = getComplianceValidation
          .getComplianceValidation();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

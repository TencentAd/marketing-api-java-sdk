package com.tencent.ads.examples.BasicOperations.CreativeToolBox;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.ComplianceValidationGetRequest;

public class GetComplianceValidation {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;
  public ComplianceValidationGetRequest data = new ComplianceValidationGetRequest();
  public SiteSet siteSet = SiteSet.QZONE;
  public String text = "YOUR AD TEXT";

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setAccountId(accountId);

    data.setSiteSet(siteSet);

    data.setText(text);
  }

  public ComplianceValidationGetResponseData getComplianceValidation() throws Exception {
    ComplianceValidationGetResponseData response =
        tencentAds.complianceValidation().complianceValidationGet(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetComplianceValidation getComplianceValidation = new GetComplianceValidation();
      getComplianceValidation.init();
      ComplianceValidationGetResponseData response =
          getComplianceValidation.getComplianceValidation();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

package com.tencent.ads.examples.BasicOperations.Account;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.QualificationsAddRequest;
import java.util.Arrays;
import java.util.List;

public class AddQualifications {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;
  public QualificationsAddRequest data = new QualificationsAddRequest();
  public QualificationType qualificationType = QualificationType.ADDITIONAL_INDUSTRY_QUALIFICATION;
  public Long systemIndustryId = null;
  public String qualificationCode = "YOUR QUALIFICATION CODE";
  public List<String> imageIdList = Arrays.asList("YOUR QUALIFICATION IMAGE ID");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setAccountId(accountId);

    data.setQualificationType(qualificationType);

    AdditionalIndustryQualificationsSpec additionalIndustrySpec =
        new AdditionalIndustryQualificationsSpec();
    additionalIndustrySpec.setSystemIndustryId(systemIndustryId);
    additionalIndustrySpec.setQualificationCode(qualificationCode);
    additionalIndustrySpec.setImageIdList(imageIdList);
    QualificationSpec qualificationSpec = new QualificationSpec();
    qualificationSpec.setAdditionalIndustrySpec(additionalIndustrySpec);
    data.setQualificationSpec(qualificationSpec);
  }

  public QualificationsAddResponseData addQualifications() throws Exception {
    QualificationsAddResponseData response = tencentAds.qualifications().qualificationsAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddQualifications addQualifications = new AddQualifications();
      addQualifications.init();
      QualificationsAddResponseData response = addQualifications.addQualifications();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

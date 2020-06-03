package com.tencent.ads.examples.BasicOperations.Account;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AdditionalIndustryQualificationsSpec;
import com.tencent.ads.model.QualificationSpec;
import com.tencent.ads.model.QualificationType;
import com.tencent.ads.model.QualificationsAddRequest;
import com.tencent.ads.model.QualificationsAddResponseData;
import java.util.Arrays;
import java.util.List;

/**
 * 本文件提供了一个创建广告主资质(Qualification)的简单示例
 */
public class AddQualifications {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * 附加行业资质
   */
  public QualificationType QUALIFICATION_TYPE = QualificationType.ADDITIONAL_INDUSTRY_QUALIFICATION;
  /**
   * 行业ID
   */
  public Long SYSTEM_INDUSTRY_ID = 0L;
  /**
   * 资质编码
   */
  public String QUALIFICATION_CODE = "YOUR QUALIFICATION CODE";
  /**
   * 资质图片ID
   */
  public List<String> QUALIFICATION_IMAGE_ID = Arrays.asList("YOUR QUALIFICATION IMAGE ID");
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

  public Long addQualifications() throws Exception {
    QualificationsAddRequest data = new QualificationsAddRequest();
    data.setAccountId(ACCOUNT_ID);

    data.setQualificationSpec(new QualificationSpec().additionalIndustrySpec(
        new AdditionalIndustryQualificationsSpec().systemIndustryId(SYSTEM_INDUSTRY_ID)
            .qualificationCode(QUALIFICATION_CODE).imageIdList(QUALIFICATION_IMAGE_ID)));
    data.setQualificationType(QUALIFICATION_TYPE);
    QualificationsAddResponseData response = tencentAds.qualifications().qualificationsAdd(data);
    if (response != null) {
      return response.getQualificationId();
    }
    return null;
  }

  public static void main(String[] args) {
    try {
      AddQualifications addQualifications = new AddQualifications();
      addQualifications.init();
      Long qualificationId = addQualifications.addQualifications();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
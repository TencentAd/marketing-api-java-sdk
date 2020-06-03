package com.tencent.ads.examples.BasicOperations.Account;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.QualificationType;
import com.tencent.ads.model.QualificationsDeleteRequest;
import com.tencent.ads.model.QualificationsDeleteResponseData;

/**
 * 本文件提供了一个删除广告主资质(Qualification)的简单示例
 */
public class DeleteQualifications {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * 资质ID
   */
  public Long QUALIFICATION_ID = 0L;
  /**
   * 附加行业资质
   */
  public QualificationType QUALIFICATION_TYPE = QualificationType.ADDITIONAL_INDUSTRY_QUALIFICATION;
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

  public Long deleteQualifications() throws Exception {
    QualificationsDeleteRequest data = new QualificationsDeleteRequest();
    data.setAccountId(ACCOUNT_ID);
    data.setQualificationId(QUALIFICATION_ID);
    data.setQualificationType(QUALIFICATION_TYPE);
    QualificationsDeleteResponseData response = tencentAds.qualifications()
        .qualificationsDelete(data);
    if (response != null) {
      return response.getQualificationId();
    }
    return null;
  }

  public static void main(String[] args) {
    try {
      DeleteQualifications deleteQualifications = new DeleteQualifications();
      deleteQualifications.init();
      Long qualificationId = deleteQualifications.deleteQualifications();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
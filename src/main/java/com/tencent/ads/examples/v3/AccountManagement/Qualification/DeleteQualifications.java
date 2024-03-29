package com.tencent.ads.examples.v3.AccountManagement.Qualification;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.QualificationsDeleteRequest;
import com.tencent.ads.v3.TencentAds;

public class DeleteQualifications {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;
  public QualificationsDeleteRequest data = new QualificationsDeleteRequest();
  public Long qualificationId = null;
  public QualificationType qualificationType = QualificationType.ADDITIONAL_INDUSTRY_QUALIFICATION;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setAccountId(accountId);

    data.setQualificationId(qualificationId);

    data.setQualificationType(qualificationType);
  }

  public QualificationsDeleteResponseData deleteQualifications() throws Exception {
    QualificationsDeleteResponseData response =
        tencentAds.qualifications().qualificationsDelete(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      DeleteQualifications deleteQualifications = new DeleteQualifications();
      deleteQualifications.init();
      QualificationsDeleteResponseData response = deleteQualifications.deleteQualifications();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

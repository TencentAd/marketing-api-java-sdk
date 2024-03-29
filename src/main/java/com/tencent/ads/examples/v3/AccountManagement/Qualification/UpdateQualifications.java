package com.tencent.ads.examples.v3.AccountManagement.Qualification;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.QualificationsUpdateRequest;
import com.tencent.ads.v3.TencentAds;
import java.util.Arrays;
import java.util.List;

public class UpdateQualifications {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;
  public QualificationsUpdateRequest data = new QualificationsUpdateRequest();
  public Long qualificationId = null;
  public QualificationType qualificationType = QualificationType.ADDITIONAL_INDUSTRY_QUALIFICATION;
  public List<String> imageIdList = Arrays.asList("YOUR QUALIFICATION IMAGE ID");

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

    data.setImageIdList(imageIdList);
  }

  public QualificationsUpdateResponseData updateQualifications() throws Exception {
    QualificationsUpdateResponseData response =
        tencentAds.qualifications().qualificationsUpdate(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      UpdateQualifications updateQualifications = new UpdateQualifications();
      updateQualifications.init();
      QualificationsUpdateResponseData response = updateQualifications.updateQualifications();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

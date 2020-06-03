package com.tencent.ads.examples.BasicOperations.Account;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.QualificationType;
import com.tencent.ads.model.QualificationsUpdateRequest;
import com.tencent.ads.model.QualificationsUpdateResponseData;
import java.util.Arrays;
import java.util.List;

/**
 * 本文件提供了一个更新广告主资质(Qualification)的简单示例
 */
public class UpdateQualifications {

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
   * 资质ID
   */
  public Long QUALIFICATION_ID = 0L;
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

  public Long updateQualifications() throws Exception {
    QualificationsUpdateRequest data = new QualificationsUpdateRequest();
    data.setAccountId(ACCOUNT_ID);
    data.setQualificationId(QUALIFICATION_ID);
    data.setQualificationType(QUALIFICATION_TYPE);
    data.setImageIdList(QUALIFICATION_IMAGE_ID);
    QualificationsUpdateResponseData response = tencentAds.qualifications()
        .qualificationsUpdate(data);
    if (response != null) {
      return response.getQualificationId();
    }
    return null;
  }

  public static void main(String[] args) {
    try {
      UpdateQualifications updateQualifications = new UpdateQualifications();
      updateQualifications.init();
      Long qualificationId = updateQualifications.updateQualifications();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
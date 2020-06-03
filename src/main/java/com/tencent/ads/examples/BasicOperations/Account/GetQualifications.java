package com.tencent.ads.examples.BasicOperations.Account;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.FilteringStruct;
import com.tencent.ads.model.QualificationsGetResponseData;
import java.util.Arrays;
import java.util.List;

/**
 * 本文件提供了一个获取广告主资质(Qualification)列表的简单示例
 */
public class GetQualifications {

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
  public String QUALIFICATION_TYPE = "ADDITIONAL_INDUSTRY_QUALIFICATION";
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

  public QualificationsGetResponseData getQualifications() throws Exception {
    Long accountId = ACCOUNT_ID;
    String qualificationType = QUALIFICATION_TYPE;
    List<FilteringStruct> filtering = null;
    List<String> fields = Arrays.asList("industry_qualifications", "ad_qualifications",
        "additional_industry_qualifications", "industry_qualifications_wechat",
        "ad_qualifications_wechat");
    QualificationsGetResponseData response = tencentAds.qualifications()
        .qualificationsGet(accountId, qualificationType, filtering, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetQualifications getQualifications = new GetQualifications();
      getQualifications.init();
      QualificationsGetResponseData responseData = getQualifications.getQualifications();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
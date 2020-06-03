package com.tencent.ads.examples.BasicOperations.Account;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AdvertiserGetResponseData;
import com.tencent.ads.model.FilteringStruct;
import java.util.Arrays;
import java.util.List;

/**
 * 本文件提供了一个获取广告主(Advertiser)列表的简单示例
 */
public class GetAdvertiser {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
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

  public AdvertiserGetResponseData getAdvertiser() throws Exception {
    Long accountId = ACCOUNT_ID;
    List<FilteringStruct> filtering = null;
    Long page = null;
    Long pageSize = null;
    List<String> fields = Arrays
        .asList("account_id", "daily_budget", "system_status", "reject_message", "corporation_name",
            "corporation_licence", "certification_image_id", "certification_image",
            "identity_number", "individual_qualification", "corporate_image_name",
            "corporate_image_logo", "system_industry_id", "customized_industry",
            "introduction_url", "industry_qualification_image_id_list",
            "industry_qualification_image", "ad_qualification_image_id_list",
            "ad_qualification_image", "contact_person", "contact_person_email",
            "contact_person_telephone", "contact_person_mobile", "wechat_spec", "websites");
    AdvertiserGetResponseData response = tencentAds.advertiser()
        .advertiserGet(accountId, filtering, page, pageSize, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetAdvertiser GetAdvertiser = new GetAdvertiser();
      GetAdvertiser.init();
      AdvertiserGetResponseData responseData = GetAdvertiser.getAdvertiser();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
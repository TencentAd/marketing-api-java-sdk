package com.tencent.ads.examples.BasicOperations.Account;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.FilteringStruct;
import java.util.Arrays;
import java.util.List;

public class GetAdvertiser {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long agencyId = null;

  public Long accountId = null;

  public List<FilteringStruct> filtering = null;

  public List<String> fields =
      Arrays.asList(
          "account_id",
          "daily_budget",
          "system_status",
          "reject_message",
          "corporation_name",
          "corporation_licence",
          "certification_image_id",
          "certification_image",
          "identity_number",
          "individual_qualification",
          "corporate_image_name",
          "corporate_image_logo",
          "system_industry_id",
          "customized_industry",
          "introduction_url",
          "industry_qualification_image_id_list",
          "industry_qualification_image",
          "ad_qualification_image_id_list",
          "ad_qualification_image",
          "contact_person",
          "contact_person_email",
          "contact_person_telephone",
          "contact_person_mobile",
          "wechat_spec",
          "websites");

  public String paginationMode = null;

  public Long page = null;

  public Long pageSize = null;

  public Long cursor = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public AdvertiserGetResponseData getAdvertiser() throws Exception {
    AdvertiserGetResponseData response =
        tencentAds
            .advertiser()
            .advertiserGet(
                agencyId, accountId, filtering, fields, paginationMode, page, pageSize, cursor);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetAdvertiser getAdvertiser = new GetAdvertiser();
      getAdvertiser.init();
      AdvertiserGetResponseData response = getAdvertiser.getAdvertiser();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

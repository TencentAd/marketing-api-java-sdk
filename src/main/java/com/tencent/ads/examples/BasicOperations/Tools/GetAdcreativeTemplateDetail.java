package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import java.util.Arrays;
import java.util.List;

public class GetAdcreativeTemplateDetail {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long adcreativeTemplateId = 968L;

  public String promotedObjectType = "PROMOTED_OBJECT_TYPE_LINK";

  public Long accountId = null;

  public Boolean automaticSiteEnabled = null;

  public List<String> siteSet = Arrays.asList("SITE_SET_QZONE");

  public Boolean isDynamicCreativeAd = null;

  public List<String> fields =
      Arrays.asList(
          "adcreative_template_id",
          "adcreative_template_name",
          "adcreative_template_description",
          "adcreative_template_size",
          "adcreative_template_style",
          "adcreative_sample_image_list",
          "ad_attributes",
          "adcreative_attributes",
          "adcreative_elements",
          "support_billing_spec_list",
          "support_page_type",
          "unsupport_billing_spec_list",
          "unsupport_ad_attributes_spec_list",
          "unsupport_adcreative_attributes_spec_list",
          "unsupport_siteset_detail_spec",
          "support_dynamic_ability_spec_list");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {}

  public AdcreativeTemplateDetailGetResponseData getAdcreativeTemplateDetail() throws Exception {
    AdcreativeTemplateDetailGetResponseData response =
        tencentAds
            .adcreativeTemplateDetail()
            .adcreativeTemplateDetailGet(
                adcreativeTemplateId,
                promotedObjectType,
                accountId,
                automaticSiteEnabled,
                siteSet,
                isDynamicCreativeAd,
                fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetAdcreativeTemplateDetail getAdcreativeTemplateDetail = new GetAdcreativeTemplateDetail();
      getAdcreativeTemplateDetail.init();
      AdcreativeTemplateDetailGetResponseData response =
          getAdcreativeTemplateDetail.getAdcreativeTemplateDetail();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

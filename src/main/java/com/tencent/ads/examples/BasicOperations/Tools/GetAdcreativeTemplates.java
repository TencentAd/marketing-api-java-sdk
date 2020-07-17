package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.FilteringStruct;
import java.util.Arrays;
import java.util.List;

public class GetAdcreativeTemplates {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public List<FilteringStruct> filtering = null;

  public Long page = null;

  public Long pageSize = null;

  public List<String> fields =
      Arrays.asList(
          "adcreative_template_id",
          "adcreative_template_name",
          "adcreative_template_description",
          "adcreative_template_size",
          "adcreative_template_style",
          "adcreative_template_appellation",
          "site_set",
          "promoted_object_type",
          "adcreative_sample_image_list",
          "ad_attributes",
          "adcreative_attributes",
          "adcreative_elements",
          "support_page_type",
          "support_billing_spec_list",
          "support_dynamic_ability_spec_list");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {}

  public AdcreativeTemplatesGetResponseData getAdcreativeTemplates() throws Exception {
    AdcreativeTemplatesGetResponseData response =
        tencentAds
            .adcreativeTemplates()
            .adcreativeTemplatesGet(accountId, filtering, page, pageSize, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetAdcreativeTemplates getAdcreativeTemplates = new GetAdcreativeTemplates();
      getAdcreativeTemplates.init();
      AdcreativeTemplatesGetResponseData response = getAdcreativeTemplates.getAdcreativeTemplates();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

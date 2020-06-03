package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AdcreativeTemplatesGetResponseData;
import java.util.Arrays;

/*****
 * 本文件提供了一个获取创意规格(Adcreative template)列表的简单示例
 */
public class GetAdcreativeTemplates {

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

  public AdcreativeTemplatesGetResponseData getAdcreativeTemplates() throws Exception {
    AdcreativeTemplatesGetResponseData response = tencentAds.adcreativeTemplates()
        .adcreativeTemplatesGet(ACCOUNT_ID, null, null, null, Arrays
            .asList("adcreative_template_id", "adcreative_template_name",
                "adcreative_template_description",
                "adcreative_template_size", "adcreative_template_style",
                "adcreative_template_appellation",
                "site_set", "promoted_object_type", "adcreative_sample_image_list", "ad_attributes",
                "adcreative_attributes", "adcreative_elements", "support_page_type",
                "support_billing_spec_list",
                "support_dynamic_ability_spec_list"));
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
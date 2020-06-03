package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AdcreativeTemplateDetailGetResponseData;
import java.util.Arrays;

/*****
 * 本文件提供了一个获取创意规格详情(Adcreative template detail)列表的简单示例
 */
public class GetAdcreativeTemplateDetail {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * ADCREATIVE_TEMPLATE_ID
   */
  public Long ADCREATIVE_TEMPLATE_ID = 968L; // 968规格
  /**
   * PROMOTED_OBJECT_TYPE
   */
  public String PROMOTED_OBJECT_TYPE = "PROMOTED_OBJECT_TYPE_LINK"; // 普通外链
  /**
   * SITE_SET
   */
  public String SITE_SET = "SITE_SET_QZONE"; // QQ空间流量
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

  public AdcreativeTemplateDetailGetResponseData getAdcreativeTemplateDetail() throws Exception {
    AdcreativeTemplateDetailGetResponseData response = tencentAds.adcreativeTemplateDetail()
        .adcreativeTemplateDetailGet(ADCREATIVE_TEMPLATE_ID, PROMOTED_OBJECT_TYPE, ACCOUNT_ID,
            null, Arrays.asList(SITE_SET), null,
            Arrays.asList("adcreative_template_id", "adcreative_template_name",
                "adcreative_template_description",
                "adcreative_template_size", "adcreative_template_style",
                "adcreative_sample_image_list",
                "ad_attributes", "adcreative_attributes", "adcreative_elements",
                "support_billing_spec_list",
                "support_page_type", "unsupport_billing_spec_list",
                "unsupport_ad_attributes_spec_list",
                "unsupport_adcreative_attributes_spec_list", "unsupport_siteset_detail_spec",
                "support_dynamic_ability_spec_list"));
    return response;

  }

  public static void main(String[] args) {
    try {
      GetAdcreativeTemplateDetail getAdcreativeTemplateDetail = new GetAdcreativeTemplateDetail();
      getAdcreativeTemplateDetail.init();
      AdcreativeTemplateDetailGetResponseData response = getAdcreativeTemplateDetail
          .getAdcreativeTemplateDetail();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

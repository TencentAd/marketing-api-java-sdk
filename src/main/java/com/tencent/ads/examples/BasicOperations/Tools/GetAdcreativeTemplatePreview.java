package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AdcreativeCreativeElements;
import com.tencent.ads.model.AdcreativePreviewSpec;
import com.tencent.ads.model.AdcreativeTemplatePreviewGetRequest;
import com.tencent.ads.model.AdcreativeTemplatePreviewGetResponseData;
import com.tencent.ads.model.DestinationType;
import com.tencent.ads.model.PreviewPageSpec;
import com.tencent.ads.model.WechatPromotedObjectType;
import java.util.Arrays;


/*****
 * 本文件提供了一个获取广告创意预览(Adcreative template preview)的简单示例
 */
public class GetAdcreativeTemplatePreview {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * PROMOTED_OBJECT_TYPE
   */
  public WechatPromotedObjectType PROMOTED_OBJECT_TYPE = WechatPromotedObjectType.LINK_WECHAT; // 网页（微信推广）
  /**
   * SITE_SET
   */
  public String SITE_SET = "SITE_SET_WECHAT"; // 投放QQ空间流量
  /**
   * ADCREATIVE_TEMPLATE_ID
   */
  public Long ADCREATIVE_TEMPLATE_ID = 133L; // 单图文
  /**
   * YOUR IMAGE_ID
   */
  public String IMAGE_ID = "YOUR IMAGE_ID"; // 主图ID，133规格要求：582x166, <50K, jpg/png
  /**
   * YOUR PAGE_TYPE
   */
  public DestinationType PAGE_TYPE = DestinationType.DEFAULT; // 默认落地页类型
  /**
   * YOUR PAGE_URL
   */
  public String PAGE_URL = "YOUR AD PAGE URL"; // 广告落地页地址
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

  public AdcreativeTemplatePreviewGetResponseData getAdcreativeTemplatePreviews()
      throws Exception {
    AdcreativeTemplatePreviewGetRequest data = new AdcreativeTemplatePreviewGetRequest();
    data.accountId(ACCOUNT_ID);
    data.previewSpec(
        new AdcreativePreviewSpec().adcreativeTemplateId(ADCREATIVE_TEMPLATE_ID).siteSet(
            Arrays.asList(SITE_SET)).promotedObjectType(PROMOTED_OBJECT_TYPE).pageType(PAGE_TYPE)
            .adcreativeElements(new AdcreativeCreativeElements().image(Long.valueOf(IMAGE_ID)))
            .pageSpec(new PreviewPageSpec().pageUrl(PAGE_URL)));

    AdcreativeTemplatePreviewGetResponseData response = tencentAds.adcreativeTemplatePreview()
        .adcreativeTemplatePreviewGet(data);
    return response;

  }

  public static void main(String[] args) {
    try {
      GetAdcreativeTemplatePreview getAdcreativeTemplatePreviews = new GetAdcreativeTemplatePreview();
      getAdcreativeTemplatePreviews.init();
      AdcreativeTemplatePreviewGetResponseData response = getAdcreativeTemplatePreviews
          .getAdcreativeTemplatePreviews();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

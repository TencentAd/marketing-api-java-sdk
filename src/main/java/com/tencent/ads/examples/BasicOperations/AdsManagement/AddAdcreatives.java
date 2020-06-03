package com.tencent.ads.examples.BasicOperations.AdsManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AdcreativeCreativeElementsMp;
import com.tencent.ads.model.AdcreativesAddRequest;
import com.tencent.ads.model.AdcreativesAddResponseData;
import com.tencent.ads.model.DestinationType;
import com.tencent.ads.model.PageSpec;
import com.tencent.ads.model.PromotedObjectType;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * 本文件提供了一个创建广告创意(Adcreative)的简单示例
 **/
public class AddAdcreatives {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;

  /**
   * YOUR CAMPAIGN ID
   */
  public Long CAMPAIGN_ID = 0L;

  /**
   * 推广普通外链
   */
  public PromotedObjectType PROMOTED_OBJECT_TYPE = PromotedObjectType.LINK;
  /**
   * 投放QQ空间流量
   */
  public List<String> SITE_SET = Arrays.asList("SITE_SET_QZONE");
  /**
   * 文字链
   */
  public Long ADCREATIVE_TEMPLATE_ID = 968L;
  /**
   * 广告标题，968规格要求：字数：10~14
   */
  public String AD_TITLE = "YOUR AD TITLE";
  /**
   * 广告文案，968规格要求：字数：24~30
   */
  public String AD_DESCRIPTION = "YOUR AD DESCRIPTION";
  /**
   * 默认落地页类型
   */
  public DestinationType PAGE_TYPE = DestinationType.DEFAULT;
  /**
   * 广告落地页地址
   */
  public String PAGE_URL = "YOUR AD PAGE URL";
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

  public Long addAdcreatives() throws Exception {
    AdcreativesAddRequest data = new AdcreativesAddRequest();
    data.setAdcreativeName("SDK广告创意" + UUID.randomUUID().toString());
    data.setAdcreativeElements(
        new AdcreativeCreativeElementsMp().title(AD_TITLE).description(AD_DESCRIPTION));
    data.setPageSpec(new PageSpec().pageUrl(PAGE_URL));
    data.setAccountId(ACCOUNT_ID);
    data.setCampaignId(CAMPAIGN_ID);
    data.setAdcreativeTemplateId(ADCREATIVE_TEMPLATE_ID);
    data.setPromotedObjectType(PROMOTED_OBJECT_TYPE);
    data.setPageType(PAGE_TYPE);
    data.setSiteSet(SITE_SET);
    AdcreativesAddResponseData response = tencentAds.adcreatives().adcreativesAdd(data);
    if (response != null) {
      return response.getAdcreativeId();
    }
    return null;
  }

  public static void main(String[] args) {
    try {
      AddAdcreatives addAdcreatives = new AddAdcreatives();
      addAdcreatives.init();
      Long adcreativeId = addAdcreatives.addAdcreatives();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

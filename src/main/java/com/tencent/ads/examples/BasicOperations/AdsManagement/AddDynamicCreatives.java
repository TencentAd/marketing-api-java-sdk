package com.tencent.ads.examples.BasicOperations.AdsManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.CampaignType;
import com.tencent.ads.model.DestinationType;
import com.tencent.ads.model.DynamicCreativeElements;
import com.tencent.ads.model.DynamicCreativesAddRequest;
import com.tencent.ads.model.DynamicCreativesAddResponseData;
import com.tencent.ads.model.DynamicPageSpec;
import com.tencent.ads.model.PromotedObjectType;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/*****
 * 本文件提供了一个创建动态创意(Dynamic creative)的简单示例
 */
public class AddDynamicCreatives {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * 普通推广计划
   */
  public CampaignType CAMPAIGN_TYPE = CampaignType.NORMAL; // 普通推广计划
  /**
   * 推广普通外链
   */
  public PromotedObjectType PROMOTED_OBJECT_TYPE = PromotedObjectType.LINK; // 推广普通外链
  /**
   * 投放移动站点流量
   */
  public List<String> SITE_SET = Arrays.asList("SITE_SET_MOBILE_INNER"); // 投放移动站点流量
  /**
   * 方形小图
   */
  public Long ADCREATIVE_TEMPLATE_ID = 717L; // 方形小图
  /**
   * 广告图片
   */
  public String AD_IMAGE_ID = "YOUR AD IMAGE"; // 广告图片，717规格要求：147x147, <30K, png/jpg
  /**
   * 广告标题
   */
  public String AD_TITLE_1 = "YOUR AD TEXT 1"; // 广告标题，717规格要求：字数：1~10
  /**
   * 广告标题
   */
  public String AD_TITLE_2 = "YOUR AD TEXT 2"; // 广告标题，717规格要求：字数：1~10
  /**
   * 广告文案
   */
  public String AD_DESCRIPTION = "YOUR AD DESCRIPTION"; // 广告文案，717规格要求：字数：1~18
  /**
   * 默认落地页类型
   */
  public DestinationType PAGE_TYPE = DestinationType.DEFAULT; // 默认落地页类型
  /**
   * 广告落地页地址
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

  public Long addDynamicCreatives() throws Exception {
    DynamicCreativesAddRequest data = new DynamicCreativesAddRequest();
    data.accountId(ACCOUNT_ID);
    data.dynamicCreativeName("SDK动态创意" + UUID.randomUUID().toString().substring(0, 22));
    data.dynamicCreativeTemplateId(ADCREATIVE_TEMPLATE_ID);
    data.campaignType(CAMPAIGN_TYPE);
    data.promotedObjectType(PROMOTED_OBJECT_TYPE);
    data.siteSet(SITE_SET);
    data.pageSpec(new DynamicPageSpec().pageUrl(PAGE_URL));
    data.pageType(PAGE_TYPE);
    data.dynamicCreativeElements(
        new DynamicCreativeElements().imageOptions(Arrays.asList(AD_IMAGE_ID))
            .titleOptions(Arrays.asList(AD_TITLE_1, AD_TITLE_2))
            .descriptionOptions(Arrays.asList(AD_DESCRIPTION)));

    DynamicCreativesAddResponseData response = tencentAds.dynamicCreatives()
        .dynamicCreativesAdd(data);
    if (response != null) {
      return response.getDynamicCreativeId();
    }
    return null;
  }

  public static void main(String[] args) {
    try {
      AddDynamicCreatives example = new AddDynamicCreatives();
      example.init();
      Long id = example.addDynamicCreatives();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}

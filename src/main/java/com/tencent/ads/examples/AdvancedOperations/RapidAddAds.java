package com.tencent.ads.examples.AdvancedOperations;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.model.*;
import com.tencent.ads.tools.RapidAdsContainer;
import com.tencent.ads.tools.RapidAdsContainer.RapidAddAdsRequestData;

import java.util.Arrays;

public class RapidAddAds {
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public CampaignsAddRequest campaignsAddRequest = new CampaignsAddRequest();
  public AdgroupsAddRequest adgroupsAddRequest = new AdgroupsAddRequest();
  public AdcreativesAddRequest adcreativesAddRequest = new AdcreativesAddRequest();
  public AdsAddRequest adsAddRequest = new AdsAddRequest();

  public RapidAddAdsRequestData rapidAddAdsRequestData = new RapidAddAdsRequestData(campaignsAddRequest, adgroupsAddRequest, adcreativesAddRequest, adsAddRequest);

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {
    campaignsAddRequest.setCampaignName("SDK计划ede5fdcfffb0aafg1a17adf1c2");
    campaignsAddRequest.setAccountId(null);
    campaignsAddRequest.setCampaignType(CampaignType.NORMAL);
    campaignsAddRequest.setPromotedObjectType(PromotedObjectType.LINK);
    campaignsAddRequest.setDailyBudget(5000L);

    adgroupsAddRequest.setEndDate("YOUR ADGROUP END DATE");
    adgroupsAddRequest.setOptimizationGoal(OptimizationGoal.IMPRESSION);
    adgroupsAddRequest.setTargeting(new WriteTargetingSettingForAdgroup().userOs(Arrays.asList("IOS")));;
    adgroupsAddRequest.setBidAmount(150L);
    adgroupsAddRequest.setBillingEvent(BillingEvent.IMPRESSION);
    adgroupsAddRequest.setTimeSeries("111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    adgroupsAddRequest.setPromotedObjectType(PromotedObjectType.LINK);
    adgroupsAddRequest.setBeginDate("YOUR ADGROUP BEGIN DATE");
    adgroupsAddRequest.setSiteSet(Arrays.asList("SITE_SET_QZONE"));
    adgroupsAddRequest.setAdgroupName("SDK广告组ede525afc5fgfdcfb0aa1ajf1a1c2");

    // adcreative
    adcreativesAddRequest.setAdcreativeTemplateId(968L);
    adcreativesAddRequest.setAdcreativeElements(new AdcreativeCreativeElementsMp().title("YOUR AD TEXT").description("YOUR AD DESCRIPTION"));
    adcreativesAddRequest.setPageType(DestinationType.DEFAULT);
    adcreativesAddRequest.setPageSpec(new PageSpec().pageUrl("YOUR AD PAGE URL"));
    adcreativesAddRequest.setPromotedObjectType(PromotedObjectType.LINK);
    adcreativesAddRequest.setAdcreativeName("SDK广告创意ede525afc5jhgdcb0gaa1a1a1c2");
    adcreativesAddRequest.setSiteSet(Arrays.asList("SITE_SET_QZONE"));

    // ad
    adsAddRequest.setAdName("SDK广告5ede2529196c5");
  }

  public RapidAdsContainer.RapidAddAdsResponseData rapidAddAds() {
    return tencentAds.rapidAds().rapidAddAds(rapidAddAdsRequestData);
  }
}
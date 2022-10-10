package com.tencent.ads.examples.MoreAds;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.ApiException;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AdCreativeBrand;
import com.tencent.ads.model.AdNum;
import com.tencent.ads.model.AdcreativeCreativeElementsMp;
import com.tencent.ads.model.AdcreativeElementStoryArrayItem;
import com.tencent.ads.model.AdcreativesAddRequest;
import com.tencent.ads.model.AdcreativesAddResponseData;
import com.tencent.ads.model.AdgroupsAddRequest;
import com.tencent.ads.model.AdgroupsAddResponseData;
import com.tencent.ads.model.AdsAddRequest;
import com.tencent.ads.model.AdsAddResponseData;
import com.tencent.ads.model.AgeStruct;
import com.tencent.ads.model.BillingEvent;
import com.tencent.ads.model.CampaignType;
import com.tencent.ads.model.CampaignsAddRequest;
import com.tencent.ads.model.CampaignsAddResponseData;
import com.tencent.ads.model.DestinationType;
import com.tencent.ads.model.DynamicAdSpec;
import com.tencent.ads.model.DynamicAdcreativeSpec;
import com.tencent.ads.model.FilteringStruct;
import com.tencent.ads.model.GeoLocations;
import com.tencent.ads.model.ImagesAddResponseData;
import com.tencent.ads.model.LinkNameType;
import com.tencent.ads.model.OptimizationGoal;
import com.tencent.ads.model.PageSpec;
import com.tencent.ads.model.PromotedObjectType;
import com.tencent.ads.model.PromotedObjectsAddRequest;
import com.tencent.ads.model.PromotedObjectsGetResponseData;
import com.tencent.ads.model.PromotedObjectsUpdateRequest;
import com.tencent.ads.model.WriteTargetingSettingForAdgroup;
import com.tencent.ads.utils.SignatureUtils;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

/** 本文件提供了一个创建一个动态商品广告的示例 */
public class AddDynamicProductAds {

  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /** YOUR ACCOUNT ID */
  public Long ACCOUNT_ID = 0L;
  /** YOUR IOS_APP_ID */
  public String IOS_APP_ID = "IOS_APP_ID"; // 这里放被推广的iOS App的ID，即App Store的数字ID
  /** YOUR AD IMAGE PATH */
  public String IMAGE_PATH = "YOUR AD IMAGE PATH"; // 广告主图文件路径，
  /** YOUR BRAND AD IMAGE PATH */
  public String BRAND_IMAGE_PATH = "YOUR BRAND AD IMAGE PATH"; // 广告Brand图文件路径
  /** YOUR AD PAGE URL */
  public String AD_PAGE_URL = "YOUR AD PAGE URL";
  /** YOUR PRODUCT CATALOG ID */
  public Long PRODUCT_CATALOG_ID = 0L; // 商品库ID
  /** YOUR PRODUCT SOURCE */
  public String PRODUCT_SOURCE = "YOUR PRODUCT SOURCE"; // 商品ID 或者商品系列ID
  /** YOUR ADCREATIVE_TEMPLATE_ID */
  public static Long ADCREATIVE_TEMPLATE_ID = 725L; // 大图随心互动
  /** YOUR AD TEXT */
  public static String AD_TITLE = "YOUR AD TEXT"; // 广告文案
  /** TencentAds */
  public TencentAds tencentAds;

  private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
  }

  public Long addDynamicProductAds() throws Exception {

    PromotedObjectType promotedObjectType = PromotedObjectType.APP_IOS;

    // 第一步，创建推广计划
    Long campaignId = addCampaign(CampaignType.NORMAL, promotedObjectType);

    // 第二步，创建推广目标
    String promotedObjectId = addPromotedObject(promotedObjectType, IOS_APP_ID);

    // 第三步，创建广告组，不允许使用定向包，因此在广告组里创建定向
    List<String> siteSet = Arrays.asList("SITE_SET_MOBILE_INNER"); // 投放腾讯移动流量
    Long adgroupId = addAdgroup(campaignId, promotedObjectType, promotedObjectId, siteSet);

    // 第四步，上传素材
    String imageId = addDynamicImage(IMAGE_PATH);
    String brandImageId = addDynamicImage(BRAND_IMAGE_PATH);

    // 第五步，创建广告创意
    Long adcreativeId =
        addAdcreative(
            ADCREATIVE_TEMPLATE_ID,
            campaignId,
            promotedObjectType,
            promotedObjectId,
            siteSet,
            imageId,
            brandImageId,
            AD_TITLE);

    // 第六步，创建广告
    Long adId = addAd(adgroupId, adcreativeId);
    return adId;
  }

  // 创建朋友圈推广计划
  private Long addCampaign(CampaignType campaignType, PromotedObjectType promotedObjectType)
      throws ApiException {
    String campaignName = "SDK计划" + UUID.randomUUID().toString().substring(0, 10);

    Long campaignDailyBudget = 100001L; // 日预算

    CampaignsAddResponseData response =
        tencentAds
            .campaigns()
            .campaignsAdd(
                new CampaignsAddRequest()
                    .accountId(ACCOUNT_ID)
                    .campaignName(campaignName)
                    .campaignType(campaignType)
                    .promotedObjectType(promotedObjectType)
                    .dailyBudget(campaignDailyBudget));
    return response.getCampaignId();
  }

  // 创建iOS App推广目标
  private String addPromotedObject(PromotedObjectType promotedObjectType, String promotedObjectId)
      throws ApiException {

    PromotedObjectsGetResponseData getResponseData =
        tencentAds
            .promotedObjects()
            .promotedObjectsGet(
                ACCOUNT_ID,
                Arrays.asList(
                    new FilteringStruct()
                        .field("promoted_object_id")
                        .operator("EQUALS")
                        .values(Arrays.asList(String.valueOf(promotedObjectId)))),
                null,
                null,
                null);
    if (getResponseData != null && getResponseData.getList().size() > 0) {
      tencentAds
          .promotedObjects()
          .promotedObjectsUpdate(
              new PromotedObjectsUpdateRequest()
                  .accountId(ACCOUNT_ID)
                  .promotedObjectType(promotedObjectType)
                  .promotedObjectId(promotedObjectId));
    } else {
      tencentAds
          .promotedObjects()
          .promotedObjectsAdd(
              new PromotedObjectsAddRequest()
                  .accountId(ACCOUNT_ID)
                  .promotedObjectType(promotedObjectType)
                  .promotedObjectId(promotedObjectId));
    }

    return promotedObjectId;
  }

  // 创建广告组
  private Long addAdgroup(
      Long campaignId,
      PromotedObjectType promotedObjectType,
      String promotedObjectId,
      List<String> siteSet)
      throws ApiException {
    String adgroupName = "SDK sample adgroup " + UUID.randomUUID().toString().substring(0, 10);
    Calendar calendar = Calendar.getInstance();
    calendar.add(Calendar.DATE, 1);
    String beginDate = sdf.format(calendar.getTime());
    calendar.add(Calendar.DATE, 6);
    String endDate = sdf.format(calendar.getTime());
    BillingEvent billingEvent = BillingEvent.IMPRESSION; // CPM
    Long bidAmount = 150L; // 单位为分
    OptimizationGoal optimizationGoal = OptimizationGoal.ECOMMERCE_ORDER; // 优化下单
    String timeSeries =
        "11111111111111111111111"
            + "1111111111111111111111111111111111111111111"
            + "1111111111111111111111111111111111111111111"
            + "1111111111111111111111111111111111111111111"
            + "1111111111111111111111111111111111111111111"
            + "1111111111111111111111111111111111111111111"
            + "1111111111111111111111111111111111111111111"
            + "1111111111111111111111111111111111111111111111111111111"; // 全天投放
    Long adgroupDailyBudget = 1000000L; // 日预算10000元（单位为分）

    List<Long> regionIds = Arrays.asList(440300L);
    AdgroupsAddResponseData responseData =
        tencentAds
            .adgroups()
            .adgroupsAdd(
                new AdgroupsAddRequest()
                    .accountId(ACCOUNT_ID)
                    .campaignId(campaignId)
                    .adgroupName(adgroupName)
                    .promotedObjectType(promotedObjectType)
                    .beginDate(beginDate)
                    .endDate(endDate)
                    .billingEvent(billingEvent)
                    .bidAmount(bidAmount)
                    .optimizationGoal(optimizationGoal)
                    .timeSeries(timeSeries)
                    .siteSet(siteSet)
                    .dailyBudget(adgroupDailyBudget)
                    .promotedObjectId(promotedObjectId)
                    .targeting(
                        new WriteTargetingSettingForAdgroup()
                            .age(Arrays.asList(new AgeStruct().max(60L).min(14L)))
                            .gender(Arrays.asList("MALE"))
                            .geoLocation(
                                new GeoLocations()
                                    .locationTypes(Arrays.asList("LIVE_IN"))
                                    .regions(regionIds)))
                    .dynamicAdSpec(
                        new DynamicAdSpec()
                            .productCatalogId(PRODUCT_CATALOG_ID)
                            .productMode(AdNum.SINGLE)));

    return responseData.getAdgroupId();
  }

  // 上传素材
  private String addDynamicImage(String imageFile) throws Exception {
    String imageSignature = SignatureUtils.getMD5Checksum(imageFile);
    String uploadType = "UPLOAD_TYPE_FILE";
    ImagesAddResponseData responseData =
        tencentAds
            .images()
            .imagesAdd(
                ACCOUNT_ID,
                uploadType,
                imageSignature,
                new File(imageFile),
                null,
                null,
                null,
                null,
                null,
                null);

    return responseData.getImageId();
  }

  // 创建创意
  private Long addAdcreative(
      Long adcreativeTemplateId,
      Long campaignId,
      PromotedObjectType promotedObjectType,
      String promotedObjectId,
      List<String> siteSet,
      String imageId,
      String brandImageId,
      String adTitle)
      throws ApiException {
    String adcreativeName = "SDK sample adcreative " + UUID.randomUUID().toString();
    LinkNameType linkNameType = LinkNameType.VIEW_DETAILS;
    DestinationType pageType = DestinationType.DEFAULT;

    AdcreativesAddResponseData responseData =
        tencentAds
            .adcreatives()
            .adcreativesAdd(
                new AdcreativesAddRequest()
                    .accountId(ACCOUNT_ID)
                    .campaignId(campaignId)
                    .adcreativeName(adcreativeName)
                    .adcreativeTemplateId(adcreativeTemplateId)
                    .adcreativeElements(
                        new AdcreativeCreativeElementsMp()
                            .image(imageId)
                            .brand(
                                new AdCreativeBrand()
                                    .brandImg(brandImageId)
                                    .brandName(
                                        "sdk 725" + UUID.randomUUID().toString().substring(0, 10)))
                            .title(adTitle)
                            .animationEffect("ANIMATION_EFFECT_CIRCLE_TRANSFER")
                            .elementStory(
                                Arrays.asList(
                                    new AdcreativeElementStoryArrayItem().image(imageId),
                                    new AdcreativeElementStoryArrayItem().image(imageId)))
                            .buttonText("点击咨询"))
                    .promotedObjectType(promotedObjectType)
                    .pageType(pageType)
                    .pageSpec(new PageSpec().pageUrl(AD_PAGE_URL))
                    .siteSet(siteSet)
                    .promotedObjectId(promotedObjectId)
                    .dynamicAdcreativeSpec(
                        new DynamicAdcreativeSpec()
                            .productCatalogId(PRODUCT_CATALOG_ID)
                            .productMode(AdNum.SINGLE)
                            .productSource(PRODUCT_SOURCE))
                    .promotedObjectId(promotedObjectId));

    return responseData.getAdcreativeId();
  }

  // 创建创意
  private Long addAd(Long adgroupId, Long adcreativeId) throws ApiException {
    String adName = "SDK sample ad " + UUID.randomUUID().toString().substring(0, 10);

    AdsAddResponseData responseData =
        tencentAds
            .ads()
            .adsAdd(
                new AdsAddRequest()
                    .accountId(ACCOUNT_ID)
                    .adgroupId(adgroupId)
                    .adcreativeId(adcreativeId)
                    .adName(adName));

    return responseData.getAdId();
  }

  public static void main(String[] args) {
    AddDynamicProductAds addDynamicProductAds = new AddDynamicProductAds();
    addDynamicProductAds.init();
    try {
      Long adId = addDynamicProductAds.addDynamicProductAds();

    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

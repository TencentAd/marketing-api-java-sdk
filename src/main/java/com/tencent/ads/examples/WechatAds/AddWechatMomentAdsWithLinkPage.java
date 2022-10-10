package com.tencent.ads.examples.WechatAds;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.ApiException;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.utils.SignatureUtils;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

/** *** 本文件提供了一个创建一个微信推广Android App的朋友圈双落地页单图广告的示例 */
public class AddWechatMomentAdsWithLinkPage {

  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /** YOUR ACCOUNT ID */
  public Long ACCOUNT_ID = 0L;
  /** YOUR IOS_APP_ID */
  public static String ANDROID_APP_ID = "ANDROID_APP_ID"; // 这里放被推广的Android App的ID，即应用宝ID
  /** YOUR ADCREATIVE_TEMPLATE_ID */
  public static Long ADCREATIVE_TEMPLATE_ID = 310L; // 单图规格
  /** YOUR AD IMAGE PATH */
  public static String IMAGE_PATH =
      "YOUR AD IMAGE PATH"; // 广告主图文件路径，310规格要求：640x800, <300K, png/jpg

  public static String IMAGE_ID = "YOUR IMAGE ID"; // 如果已经有图片的，可提供Image ID
  public static Long WECHAT_PAGE_ID = 100L; // 使用你的原生页ID
  /** YOUR AD TEXT */
  public static String AD_TITLE = "YOUR AD TEXT"; // 广告文案，310规格要求：字数：1~40

  public static Long PROFILE_ID = 13305L; // 如果已经创建Profile的，可提供Profile ID
  /** TencentAds */
  public TencentAds tencentAds;

  private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
  }

  public Long addWechatMomentAdsWithLinkPage() throws Exception {

    // 第一步，创建推广计划
    CampaignType campaignType = CampaignType.NORMAL; // 朋友圈广告
    PromotedObjectType promotedObjectType = PromotedObjectType.APP_ANDROID; // 推广Android App
    Long campaignId = addCampaign(campaignType, promotedObjectType);

    // 第二步，创建推广目标
    String promotedObjectId = addPromotedObject(promotedObjectType, ANDROID_APP_ID);

    // 第三步，创建广告组，不允许使用定向包，因此在广告组里创建定向
    List<String> siteSet = Arrays.asList("SITE_SET_MOMENTS"); // 投放朋友圈流量
    Long adgroupId = addAdgroup(campaignId, promotedObjectType, promotedObjectId, siteSet);

    // 第四步，上传素材
    String imageId;
    // 如果已经提供了IMAGE_ID,可以直接使用
    if (IMAGE_ID != null) {
      imageId = IMAGE_ID;
    } else {
      imageId = addImage(IMAGE_PATH);
    }

    // 第五步，创建创意
    Long adcreativeId =
        addAdcreative(
            ADCREATIVE_TEMPLATE_ID,
            campaignId,
            promotedObjectType,
            promotedObjectId,
            siteSet,
            imageId,
            AD_TITLE);

    // 第六步，创建广告
    Long adId = addAd(adgroupId, adcreativeId);
    return adId;
  }

  public static void main(String[] args) {
    try {
      AddWechatMomentAds addWechatMomentAds = new AddWechatMomentAds();
      addWechatMomentAds.init();
      Long adId = addWechatMomentAds.addWechatMomentAds();

    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  // 创建朋友圈推广计划
  private Long addCampaign(CampaignType campaignType, PromotedObjectType promotedObjectType)
      throws ApiException {
    String campaignName = "SDK计划" + UUID.randomUUID().toString().substring(0, 10);

    Long campaignDailyBudget = 0L; // 不限日预算

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

  // 创建Android App推广目标
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
    calendar.add(Calendar.DATE, 10);
    String endDate = sdf.format(calendar.getTime());
    BillingEvent billingEvent = BillingEvent.IMPRESSION; // CPM
    Long bidAmount = 20000L; // 200元（单位为分）
    OptimizationGoal optimizationGoal = OptimizationGoal.APP_ACTIVATE; // 优化目标APP激活
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
    boolean expandEnabled = true; // 开启自动扩量
    List<String> expandTargeting = Arrays.asList("age", "geo_location", "gender"); // 自动扩量定向范围

    List<Long> regionIds = Arrays.asList(310000L, 110000L); // 上海，北京，朋友圈广告地域只能位于同一级别
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
                            .age(Arrays.asList(new AgeStruct().max(45L).min(23L)))
                            .gender(Arrays.asList("MALE"))
                            .geoLocation(
                                new GeoLocations()
                                    .locationTypes(Arrays.asList("LIVE_IN"))
                                    .regions(regionIds))
                            .userOs(Arrays.asList("ANDROID")))
                    .expandEnabled(expandEnabled)
                    .expandTargeting(expandTargeting));

    return responseData.getAdgroupId();
  }

  // 上传素材
  private String addImage(String imageFile) throws Exception {
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
      String adTitle)
      throws ApiException {
    String adcreativeName = "SDK sample adcreative " + UUID.randomUUID().toString();
    LinkNameType linkNameType = LinkNameType.VIEW_DETAILS;
    DestinationType pageType = DestinationType.CANVAS_WECHAT; // 'PAGE_TYPE_CANVAS_WECHAT';

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
                            .imageList(Arrays.asList(imageId))
                            .title(adTitle))
                    .promotedObjectType(promotedObjectType)
                    .pageType(pageType)
                    .pageSpec(
                        new PageSpec()
                            .pageId(WECHAT_PAGE_ID)
                            .overrideCanvasHeadOption(
                                OverrideCanvasHeadOption.CANVAS_OVERRIDE_CREATIVE))
                    .linkPageSpec(new LinkPageSpec().pageId(WECHAT_PAGE_ID))
                    .linkPageType(LinkPageType.CANVAS_WECHAT)
                    .linkNameType(LinkUrlLinkNameType.DOWNLOAD_APP)
                    .siteSet(siteSet)
                    .profileId(PROFILE_ID)
                    .promotedObjectId(promotedObjectId));

    return responseData.getAdcreativeId();
  }

  // 创建广告
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
}

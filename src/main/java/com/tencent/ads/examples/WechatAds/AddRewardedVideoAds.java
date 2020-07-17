package com.tencent.ads.examples.WechatAds;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.ApiException;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AdcreativeCorporate;
import com.tencent.ads.model.AdcreativeCreativeElementsMp;
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
import com.tencent.ads.model.FilteringStruct;
import com.tencent.ads.model.GeoLocations;
import com.tencent.ads.model.ImagesAddResponseData;
import com.tencent.ads.model.OptimizationGoal;
import com.tencent.ads.model.PromotedObjectType;
import com.tencent.ads.model.PromotedObjectsAddRequest;
import com.tencent.ads.model.PromotedObjectsGetResponseData;
import com.tencent.ads.model.PromotedObjectsUpdateRequest;
import com.tencent.ads.model.VideosAddResponseData;
import com.tencent.ads.model.WriteTargetingSettingForAdgroup;
import com.tencent.ads.utils.SignatureUtils;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

/** *** 本文件提供了一个创建一个微信推广IOS App的激励视频广告的示例 */
public class AddRewardedVideoAds {

  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /** YOUR ACCOUNT ID */
  public Long ACCOUNT_ID = 0L;
  /** YOUR IOS_APP_ID */
  public static String IOS_APP_ID = "IOS_APP_ID"; // 这里放被推广的iOS App的ID，即App Store的数字ID
  /** YOUR ADCREATIVE_TEMPLATE_ID */
  public static Long ADCREATIVE_TEMPLATE_ID = 560L; // 激励视频
  /** YOUR AD VIDEO_PATH */
  public static String VIDEO_PATH =
      "YOUR AD VIDEO PATH"; // 广告主视频文件路径，560规格要求：750x1334, 6-30秒, <7168K, mp4
  /** YOUR AD TEXT */
  public static String AD_TITLE = "YOUR AD TEXT"; // 广告文案，560规格要求：字数：1~12
  /** YOUR LOGO IMAGE PATH */
  public static String LOGO_IMAGE_PATH =
      "YOUR LOGO IMAGE PATH"; // 广告品牌LOGO图文件路径，560规格要求：300x300, <50K, png/jpg
  /** YOUR LOGO CORP NAME */
  public static String LOGO_CORP_NAME = "YOUR LOGO CORP NAME"; // 广告品牌商标名称，560规格要求：字数：1~9
  /** TencentAds */
  public TencentAds tencentAds;

  private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
  }

  public Long addRewardedVideoAds() throws Exception {
    // 第一步，创建推广计划
    CampaignType campaignType = CampaignType.NORMAL; // 普通展示广告
    PromotedObjectType promotedObjectType = PromotedObjectType.APP_IOS; // 推广IOS App
    Long campaignId = addCampaign(campaignType, promotedObjectType);

    // 第二步，创建推广目标
    String promotedObjectId = addPromotedObject(promotedObjectType, IOS_APP_ID);

    // 第三步，创建广告组，激励视频不允许使用定向包，因此在广告组里创建定向
    List<String> siteSet = Arrays.asList("SITE_SET_WECHAT"); // 投放微信流量
    Long adgroupId = addAdgroup(campaignId, promotedObjectType, promotedObjectId, siteSet);

    // 第四步，上传素材
    Long videoId = addVideo(VIDEO_PATH);
    String imageId = addImage(LOGO_IMAGE_PATH);

    // 第五步，创建创意
    Long adcreativeId =
        addAdcreative(
            ADCREATIVE_TEMPLATE_ID,
            campaignId,
            promotedObjectType,
            promotedObjectId,
            siteSet,
            String.valueOf(videoId),
            AD_TITLE,
            imageId,
            LOGO_CORP_NAME);

    // 第六步，创建广告
    Long adId = addAd(adgroupId, adcreativeId);
    return adId;
  }

  public static void main(String[] args) {

    try {
      AddRewardedVideoAds addRewardedVideoAds = new AddRewardedVideoAds();
      addRewardedVideoAds.init();
      Long adId = addRewardedVideoAds.addRewardedVideoAds();

    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  // 创建推广计划
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

    List<Long> regionIds = Arrays.asList(310000L); // 上海，激励视频地域只能位于同一城市
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
                            .userOs(Arrays.asList("IOS")))
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
            .imagesAdd(ACCOUNT_ID, uploadType, imageSignature, new File(imageFile), null, null);

    return responseData.getImageId();
  }

  // 上传视频
  private Long addVideo(String videoFile) throws Exception {
    String imageSignature = SignatureUtils.getMD5Checksum(videoFile);
    VideosAddResponseData responseData =
        tencentAds.videos().videosAdd(ACCOUNT_ID, new File(videoFile), imageSignature, null, null);
    return responseData.getVideoId();
  }

  // 创建创意
  private Long addAdcreative(
      Long adcreativeTemplateId,
      Long campaignId,
      PromotedObjectType promotedObjectType,
      String promotedObjectId,
      List<String> siteSet,
      String videoId,
      String adTitle,
      String logoImageId,
      String logoCorpName)
      throws ApiException {

    String adcreativeName = "SDK sample adcreative " + UUID.randomUUID().toString();
    DestinationType pageType = DestinationType.DEFAULT; // 'PAGE_TYPE_FULL_SCREEN_WECHAT';

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
                            .title(adTitle)
                            .video(videoId)
                            .corporate(
                                new AdcreativeCorporate()
                                    .corporateName(logoCorpName)
                                    .corporateImg(logoImageId)))
                    .promotedObjectType(promotedObjectType)
                    .pageType(pageType)
                    .siteSet(siteSet)
                    .promotedObjectId(String.valueOf(promotedObjectId)));

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

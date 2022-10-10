package com.tencent.ads.examples.WechatAds;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.ApiException;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AdcreativeCreativeElementsMp;
import com.tencent.ads.model.AdcreativeMiniProgramSpec;
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
import com.tencent.ads.model.GeoLocations;
import com.tencent.ads.model.ImagesAddResponseData;
import com.tencent.ads.model.OptimizationGoal;
import com.tencent.ads.model.PageSpec;
import com.tencent.ads.model.PromotedObjectType;
import com.tencent.ads.model.WriteTargetingSettingForAdgroup;
import com.tencent.ads.utils.SignatureUtils;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

/** *** 本文件提供了一个创建一个微信推广小游戏的小程序Banner广告的示例 */
public class AddMiniProgramBannerAds {

  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /** YOUR ACCOUNT ID */
  public Long ACCOUNT_ID = 0L;
  /** YOUR ADCREATIVE_TEMPLATE_ID */
  public static Long ADCREATIVE_TEMPLATE_ID = 608L; // 单图规格
  /** YOUR AD IMAGE PATH */
  public String IMAGE_PATH = "YOUR AD IMAGE PATH"; // 广告主图文件路径，608规格要求：960x334, <100K, png/jpg
  /** YOUR MINI GAME ID */
  public String MINI_GAME_ID = "YOUR MINI GAME ID"; // 小游戏ID
  /** YOUR MINI GAME PATH */
  public String MINI_GAME_PATH = "YOUR MINI GAME PATH"; // 小游戏内页路径
  /** TencentAds */
  public TencentAds tencentAds;

  private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
  }

  public Long addMiniProgramBannerAds() throws Exception {

    // 第一步，创建推广计划
    CampaignType campaignType = CampaignType.NORMAL; // 普通广告
    PromotedObjectType promotedObjectType = PromotedObjectType.MINI_GAME_WECHAT; // 推广小游戏
    Long campaignId = addCampaign(campaignType, promotedObjectType);

    // 第二步，创建广告组，不允许使用定向包，因此在广告组里创建定向
    List<String> siteSet = Arrays.asList("SITE_SET_WECHAT"); // 投放微信流量
    Long adgroupId = addAdgroup(campaignId, promotedObjectType, MINI_GAME_ID, siteSet);

    // 第三步，上传素材
    String imageId = addImage(IMAGE_PATH);

    // 第四步，创建创意
    Long adcreativeId =
        addAdcreative(
            ADCREATIVE_TEMPLATE_ID,
            campaignId,
            promotedObjectType,
            MINI_GAME_ID,
            siteSet,
            imageId,
            MINI_GAME_PATH);

    // 第六步，创建广告
    Long adId = addAd(adgroupId, adcreativeId);

    return adId;
  }

  public static void main(String[] args) {

    AddMiniProgramBannerAds addMiniProgramBannerAds = new AddMiniProgramBannerAds();
    addMiniProgramBannerAds.init();
    try {
      Long adId = addMiniProgramBannerAds.addMiniProgramBannerAds();
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
    OptimizationGoal optimizationGoal = OptimizationGoal.APP_REGISTER; // 优化目标APP注册
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
      String miniProgramPath)
      throws ApiException {
    String adcreativeName = "SDK sample adcreative " + UUID.randomUUID().toString();
    DestinationType pageType = DestinationType.MINI_GAME_WECHAT;

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
                        new AdcreativeCreativeElementsMp().imageList(Arrays.asList(imageId)))
                    .promotedObjectType(promotedObjectType)
                    .pageType(pageType)
                    .pageSpec(
                        new PageSpec()
                            .miniProgramSpec(
                                new AdcreativeMiniProgramSpec()
                                    .miniProgramId(promotedObjectId)
                                    .miniProgramPath(miniProgramPath)))
                    .siteSet(siteSet)
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

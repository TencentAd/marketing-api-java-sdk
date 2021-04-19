package com.tencent.ads.examples.WechatAds;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.ApiException;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
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
import com.tencent.ads.model.GeoLocations;
import com.tencent.ads.model.ImagesAddResponseData;
import com.tencent.ads.model.OptimizationGoal;
import com.tencent.ads.model.PageSpec;
import com.tencent.ads.model.ProfileType;
import com.tencent.ads.model.ProfilesAddRequest;
import com.tencent.ads.model.ProfilesAddResponseData;
import com.tencent.ads.model.PromotedObjectType;
import com.tencent.ads.model.WriteTargetingSettingForAdgroup;
import com.tencent.ads.utils.SignatureUtils;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/** 本文件提供了一个创建一个朋友圈线索收集广告的示例 */
public class AddLeadsAds {

  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /** YOUR ACCOUNT ID */
  public Long ACCOUNT_ID = 0L;
  /** 图片文件路径 */
  public String IMAGE_PATH = "YOUR AD IMAGE PATH"; // 450规格要求：800x450, <300K, png/jpg
  /** Profile图片文件路径 */
  public String IMAGE_PROFILE_PATH = "YOUR AD IMAGE PROFILE PATH"; // 200x200, <300K, png/jpg
  /** 朋友圈单图文 */
  public Long ADCREATIVE_TEMPLATE_ID = 450L;
  /** 广告标题，450规格要求：字数：1~10 */
  public String AD_TITLE = "YOUR AD TITLE";
  /** 广告文案，450规格要求：字数：1~30 */
  public String AD_DESCRIPTION = "YOUR AD DESCRIPTION";
  /** H5外链地址 */
  public String AD_URL = "YOUR AD PAGE URL";
  /** TencentAds */
  public TencentAds tencentAds;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
  }

  public Long addLeadsAds() throws Exception {
    // 第一步，创建推广计划
    // CampaignType.NORMAL: 普通展示广告, PromotedObjectType.LEAD_AD:线索收集
    Long campaignId = addCampaign(CampaignType.NORMAL, PromotedObjectType.LEAD_AD);
    // 第二步，创建广告组，不允许使用定向包，因此在广告组里创建定向
    // 投放微信流量
    List<String> siteSet = Arrays.asList("SITE_SET_MOMENTS");
    Long adgroupId = addAdgroups(campaignId, PromotedObjectType.LEAD_AD, siteSet);
    // 第三步，上传素材
    String imageId = addImage(IMAGE_PATH);
    String imageIdLeads = addImage(IMAGE_PROFILE_PATH);
    Long profileId = addProfile(PromotedObjectType.LEAD_AD, imageIdLeads);
    // 第四步，创建创意
    Long adcreativeId =
        addAdcreative(
            ADCREATIVE_TEMPLATE_ID,
            AD_URL,
            PromotedObjectType.LEAD_AD,
            AD_TITLE,
            AD_DESCRIPTION,
            campaignId,
            Arrays.asList(imageId),
            siteSet,
            profileId);
    // 第五步，创建广告
    Long adId = addAd(adgroupId, adcreativeId);
    return adId;
  }

  /**
   * 创建推广计划
   *
   * @param campaignType 推广计划类型
   * @param promotedObjectType 推广目标类型
   * @return 推广计划id
   * @throws ApiException 异常
   */
  protected Long addCampaign(CampaignType campaignType, PromotedObjectType promotedObjectType)
      throws ApiException {
    CampaignsAddRequest campaignsAddRequest = new CampaignsAddRequest();
    campaignsAddRequest.setAccountId(ACCOUNT_ID);
    campaignsAddRequest.setCampaignName(
        "SDK sample campaign" + UUID.randomUUID().toString().substring(0, 6));
    campaignsAddRequest.setCampaignType(campaignType);
    campaignsAddRequest.setPromotedObjectType(promotedObjectType);
    campaignsAddRequest.setDailyBudget(0L);
    CampaignsAddResponseData responseData =
        tencentAds.campaigns().campaignsAdd(campaignsAddRequest);
    if (responseData != null) {
      return responseData.getCampaignId();
    }
    return null;
  }

  /**
   * 创建广告组
   *
   * @param campaignId 推广计划id
   * @param promotedObjectType 推广目标类型
   * @param siteSet 投放站点
   * @return 返回
   * @throws ApiException 异常
   */
  protected Long addAdgroups(
      Long campaignId, PromotedObjectType promotedObjectType, List<String> siteSet)
      throws ApiException {
    AdgroupsAddRequest data = new AdgroupsAddRequest();
    data.setAccountId(ACCOUNT_ID);
    data.setAdgroupName("SDK sample adgroup" + UUID.randomUUID().toString().substring(0, 6));
    data.setPromotedObjectType(promotedObjectType);
    // 开始投放日期和结束投放日期
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    Date now = new Date();
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(now);
    calendar.add(Calendar.DATE, +1);
    Date start = calendar.getTime();
    calendar.setTime(now);
    calendar.add(Calendar.DATE, +10);
    Date end = calendar.getTime();
    data.setBeginDate(df.format(start));
    data.setEndDate(df.format(end));
    // CPM
    data.setBillingEvent(BillingEvent.IMPRESSION);
    // 50元（单位为分）
    data.setBidAmount(5000L);
    // 优化目标展示
    data.setOptimizationGoal(OptimizationGoal.IMPRESSION);
    // 日预算10000元（单位为分）
    data.setDailyBudget(1000000L);
    // 全天投放
    String timeSeries =
        "11111111111111111111111111111111111111111111111111111111"
            + "1111111111111111111111111111111111111111111111111111111111111111111111"
            + "1111111111111111111111111111111111111111111111111111111111111111111111"
            + "1111111111111111111111111111111111111111111111111111111111111111111111"
            + "1111111111111111111111111111111111111111111111111111111111111111111111";
    data.setTimeSeries(timeSeries);
    data.setSiteSet(siteSet);
    WriteTargetingSettingForAdgroup targeting = new WriteTargetingSettingForAdgroup();
    // 年龄定向: 23~45岁, 性别定向:男性, 地域定向: 北京
    targeting
        .age(Arrays.asList(new AgeStruct().max(45L).min(23L)))
        .gender(Arrays.asList("MALE"))
        .geoLocation(
            new GeoLocations()
                .locationTypes(Arrays.asList("LIVE_IN"))
                .regions(Arrays.asList(110000L)));
    data.setTargeting(targeting);
    data.setCampaignId(campaignId);
    AdgroupsAddResponseData responseData = tencentAds.adgroups().adgroupsAdd(data);
    if (responseData != null) {
      return responseData.getAdgroupId();
    }
    return null;
  }

  /**
   * 添加图片文件
   *
   * @param imageFile 图片文件地址
   * @return 图片id
   * @throws Exception 异常
   */
  protected String addImage(String imageFile) throws Exception {
    ImagesAddResponseData responseData =
        tencentAds
            .images()
            .imagesAdd(
                ACCOUNT_ID,
                "UPLOAD_TYPE_FILE",
                SignatureUtils.getMD5Checksum(imageFile),
                new File(imageFile),
                null,
                null,
                null);
    if (responseData != null) {
      return responseData.getImageId();
    }
    return null;
  }

  /**
   * 创建朋友圈头像昵称跳转页
   *
   * @param promotedObjectType 推广目标类型
   * @param imageId 图片id
   * @return 朋友圈头像及昵称跳转页 id
   * @throws ApiException 异常
   */
  protected Long addProfile(PromotedObjectType promotedObjectType, String imageId)
      throws ApiException {
    ProfilesAddRequest addRequest = new ProfilesAddRequest();
    addRequest.setAccountId(ACCOUNT_ID);
    addRequest.setProfileName("SDKsample" + UUID.randomUUID().toString().substring(0, 4));
    addRequest.setProfileType(ProfileType.DEFINITION);
    addRequest.setPromotedObjectType(promotedObjectType);
    addRequest.setHeadImageId(imageId);
    addRequest.setDescription("SDKsample");
    ProfilesAddResponseData responseData = tencentAds.profiles().profilesAdd(addRequest);
    if (responseData != null) {
      return responseData.getProfileId();
    }
    return null;
  }

  /**
   * @param adcreativeTemplateId 创意规格 id
   * @param pageUrl 落地页 url
   * @param promotedObjectType 推广目标类型
   * @param creativeElementsTitle 创意元素标题
   * @param creativeElementsDesc 创意元素描述
   * @param campaignId 推广计划id
   * @param imageIdList 图片id列表
   * @param siteSet 投放站点
   * @param profileId 朋友圈头像昵称跳转页 id
   * @return 创意id
   * @throws ApiException 异常
   */
  protected Long addAdcreative(
      Long adcreativeTemplateId,
      String pageUrl,
      PromotedObjectType promotedObjectType,
      String creativeElementsTitle,
      String creativeElementsDesc,
      Long campaignId,
      List<String> imageIdList,
      List<String> siteSet,
      Long profileId)
      throws ApiException {
    AdcreativesAddRequest data = new AdcreativesAddRequest();
    data.setAccountId(ACCOUNT_ID);
    data.setAdcreativeName("SDK sample adcreative" + UUID.randomUUID().toString().substring(0, 6));
    data.setAdcreativeElements(
        new AdcreativeCreativeElementsMp()
            .imageList(imageIdList)
            .title(creativeElementsTitle)
            .description(creativeElementsDesc));
    data.setPageSpec(new PageSpec().pageUrl(pageUrl));
    data.setPageType(DestinationType.DEFAULT);
    data.setAdcreativeTemplateId(adcreativeTemplateId);
    data.setPromotedObjectType(promotedObjectType);
    data.setCampaignId(campaignId);
    data.setSiteSet(siteSet);
    data.setProfileId(profileId);
    AdcreativesAddResponseData responseData = tencentAds.adcreatives().adcreativesAdd(data);
    if (responseData != null) {
      return responseData.getAdcreativeId();
    }
    return null;
  }

  /**
   * 创建广告
   *
   * @param adgroupId 广告组id
   * @param adcreativeId 广告创意id
   * @return 广告id
   * @throws ApiException 异常
   */
  protected Long addAd(Long adgroupId, Long adcreativeId) throws ApiException {
    AdsAddRequest data = new AdsAddRequest();
    data.setAccountId(ACCOUNT_ID);
    data.setAdgroupId(adgroupId);
    data.setAdcreativeId(adcreativeId);
    data.setAdName("SDK sample ad" + UUID.randomUUID().toString().substring(0, 6));
    AdsAddResponseData responseData = tencentAds.ads().adsAdd(data);
    if (responseData != null) {
      return responseData.getAdId();
    }
    return null;
  }

  public static void main(String[] args) {
    try {
      AddLeadsAds addLeadsAds = new AddLeadsAds();
      addLeadsAds.init();
      Long adId = addLeadsAds.addLeadsAds();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

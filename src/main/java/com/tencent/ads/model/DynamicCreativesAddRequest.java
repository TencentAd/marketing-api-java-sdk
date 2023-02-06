/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 1.3
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.tencent.ads.model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** DynamicCreativesAddRequest */
public class DynamicCreativesAddRequest {
  @SerializedName("dynamic_creative_name")
  private String dynamicCreativeName = null;

  @SerializedName("dynamic_creative_template_id")
  private Long dynamicCreativeTemplateId = null;

  @SerializedName("dynamic_creative_elements")
  private DynamicCreativeElements dynamicCreativeElements = null;

  @SerializedName("campaign_type")
  private CampaignType campaignType = null;

  @SerializedName("promoted_object_type")
  private PromotedObjectType promotedObjectType = null;

  @SerializedName("page_type")
  private DestinationType pageType = null;

  @SerializedName("automatic_site_enabled")
  private Boolean automaticSiteEnabled = null;

  @SerializedName("site_set")
  private List<String> siteSet = null;

  @SerializedName("promoted_object_id")
  private String promotedObjectId = null;

  @SerializedName("page_spec")
  private DynamicCreativePageSpec pageSpec = null;

  @SerializedName("link_page_type")
  private LinkPageType linkPageType = null;

  @SerializedName("link_name_type")
  private LinkUrlLinkNameType linkNameType = null;

  @SerializedName("link_page_spec")
  private LinkPageSpec linkPageSpec = null;

  @SerializedName("conversion_data_type")
  private ConversionDataType conversionDataType = null;

  @SerializedName("conversion_target_type")
  private ConversionTargetType conversionTargetType = null;

  @SerializedName("qq_mini_game_tracking_query_string")
  private String qqMiniGameTrackingQueryString = null;

  @SerializedName("deep_link_url")
  private String deepLinkUrl = null;

  @SerializedName("impression_tracking_url")
  private String impressionTrackingUrl = null;

  @SerializedName("click_tracking_url")
  private String clickTrackingUrl = null;

  @SerializedName("feeds_video_comment_switch")
  private Boolean feedsVideoCommentSwitch = null;

  @SerializedName("union_market_switch")
  private Boolean unionMarketSwitch = null;

  @SerializedName("android_deep_link_app_id")
  private String androidDeepLinkAppId = null;

  @SerializedName("ios_deep_link_app_id")
  private String iosDeepLinkAppId = null;

  @SerializedName("universal_link_url")
  private String universalLinkUrl = null;

  @SerializedName("profile_id")
  private Long profileId = null;

  @SerializedName("share_content_spec")
  private ShareContentSpec shareContentSpec = null;

  @SerializedName("dynamic_adcreative_spec")
  private DynamicAdcreativeSpecForDc dynamicAdcreativeSpec = null;

  @SerializedName("component_id")
  private Long componentId = null;

  @SerializedName("video_end_page")
  private VideoEndPageSpec videoEndPage = null;

  @SerializedName("webview_url")
  private String webviewUrl = null;

  @SerializedName("simple_canvas_sub_type")
  private SimpleCanvasSubType simpleCanvasSubType = null;

  @SerializedName("floating_zone")
  private FloatingZone floatingZone = null;

  @SerializedName("marketing_pendant_image_id")
  private String marketingPendantImageId = null;

  @SerializedName("barrage_list")
  private List<BarrageListCreateStruct> barrageList = null;

  @SerializedName("dynamic_creative_group_used")
  private DynamicCreativeGroupUsed dynamicCreativeGroupUsed = null;

  @SerializedName("countdown_switch")
  private Boolean countdownSwitch = null;

  @SerializedName("app_gift_pack_code")
  private AppGiftPackCode appGiftPackCode = null;

  @SerializedName("enable_breakthrough_siteset")
  private Boolean enableBreakthroughSiteset = null;

  @SerializedName("union_market_spec")
  private UnionMarketSpec unionMarketSpec = null;

  @SerializedName("auto_derived_program_creative_switch")
  private Boolean autoDerivedProgramCreativeSwitch = null;

  @SerializedName("program_creative_info")
  private ProgramCreativeInfo programCreativeInfo = null;

  @SerializedName("dynamic_creative_type")
  private DynamicCreativeType dynamicCreativeType = null;

  @SerializedName("head_click_type")
  private HeadClickType headClickType = null;

  @SerializedName("head_click_spec")
  private HeadClickSpec headClickSpec = null;

  @SerializedName("campaign_id")
  private Long campaignId = null;

  @SerializedName("page_track_url")
  private String pageTrackUrl = null;

  @SerializedName("industry_label")
  private String industryLabel = null;

  @SerializedName("sublink_switch")
  private AdvertiserSublinkSwitch sublinkSwitch = null;

  @SerializedName("pic_material_switch")
  private AdvertiserPicMaterialSwitch picMaterialSwitch = null;

  @SerializedName("account_id")
  private Long accountId = null;

  public DynamicCreativesAddRequest dynamicCreativeName(String dynamicCreativeName) {
    this.dynamicCreativeName = dynamicCreativeName;
    return this;
  }

  /**
   * Get dynamicCreativeName
   *
   * @return dynamicCreativeName
   */
  @ApiModelProperty(value = "")
  public String getDynamicCreativeName() {
    return dynamicCreativeName;
  }

  public void setDynamicCreativeName(String dynamicCreativeName) {
    this.dynamicCreativeName = dynamicCreativeName;
  }

  public DynamicCreativesAddRequest dynamicCreativeTemplateId(Long dynamicCreativeTemplateId) {
    this.dynamicCreativeTemplateId = dynamicCreativeTemplateId;
    return this;
  }

  /**
   * Get dynamicCreativeTemplateId
   *
   * @return dynamicCreativeTemplateId
   */
  @ApiModelProperty(value = "")
  public Long getDynamicCreativeTemplateId() {
    return dynamicCreativeTemplateId;
  }

  public void setDynamicCreativeTemplateId(Long dynamicCreativeTemplateId) {
    this.dynamicCreativeTemplateId = dynamicCreativeTemplateId;
  }

  public DynamicCreativesAddRequest dynamicCreativeElements(
      DynamicCreativeElements dynamicCreativeElements) {
    this.dynamicCreativeElements = dynamicCreativeElements;
    return this;
  }

  /**
   * Get dynamicCreativeElements
   *
   * @return dynamicCreativeElements
   */
  @ApiModelProperty(value = "")
  public DynamicCreativeElements getDynamicCreativeElements() {
    return dynamicCreativeElements;
  }

  public void setDynamicCreativeElements(DynamicCreativeElements dynamicCreativeElements) {
    this.dynamicCreativeElements = dynamicCreativeElements;
  }

  public DynamicCreativesAddRequest campaignType(CampaignType campaignType) {
    this.campaignType = campaignType;
    return this;
  }

  /**
   * Get campaignType
   *
   * @return campaignType
   */
  @ApiModelProperty(value = "")
  public CampaignType getCampaignType() {
    return campaignType;
  }

  public void setCampaignType(CampaignType campaignType) {
    this.campaignType = campaignType;
  }

  public DynamicCreativesAddRequest promotedObjectType(PromotedObjectType promotedObjectType) {
    this.promotedObjectType = promotedObjectType;
    return this;
  }

  /**
   * Get promotedObjectType
   *
   * @return promotedObjectType
   */
  @ApiModelProperty(value = "")
  public PromotedObjectType getPromotedObjectType() {
    return promotedObjectType;
  }

  public void setPromotedObjectType(PromotedObjectType promotedObjectType) {
    this.promotedObjectType = promotedObjectType;
  }

  public DynamicCreativesAddRequest pageType(DestinationType pageType) {
    this.pageType = pageType;
    return this;
  }

  /**
   * Get pageType
   *
   * @return pageType
   */
  @ApiModelProperty(value = "")
  public DestinationType getPageType() {
    return pageType;
  }

  public void setPageType(DestinationType pageType) {
    this.pageType = pageType;
  }

  public DynamicCreativesAddRequest automaticSiteEnabled(Boolean automaticSiteEnabled) {
    this.automaticSiteEnabled = automaticSiteEnabled;
    return this;
  }

  /**
   * Get automaticSiteEnabled
   *
   * @return automaticSiteEnabled
   */
  @ApiModelProperty(value = "")
  public Boolean isAutomaticSiteEnabled() {
    return automaticSiteEnabled;
  }

  public void setAutomaticSiteEnabled(Boolean automaticSiteEnabled) {
    this.automaticSiteEnabled = automaticSiteEnabled;
  }

  public DynamicCreativesAddRequest siteSet(List<String> siteSet) {
    this.siteSet = siteSet;
    return this;
  }

  public DynamicCreativesAddRequest addSiteSetItem(String siteSetItem) {
    if (this.siteSet == null) {
      this.siteSet = new ArrayList<String>();
    }
    this.siteSet.add(siteSetItem);
    return this;
  }

  /**
   * Get siteSet
   *
   * @return siteSet
   */
  @ApiModelProperty(value = "")
  public List<String> getSiteSet() {
    return siteSet;
  }

  public void setSiteSet(List<String> siteSet) {
    this.siteSet = siteSet;
  }

  public DynamicCreativesAddRequest promotedObjectId(String promotedObjectId) {
    this.promotedObjectId = promotedObjectId;
    return this;
  }

  /**
   * Get promotedObjectId
   *
   * @return promotedObjectId
   */
  @ApiModelProperty(value = "")
  public String getPromotedObjectId() {
    return promotedObjectId;
  }

  public void setPromotedObjectId(String promotedObjectId) {
    this.promotedObjectId = promotedObjectId;
  }

  public DynamicCreativesAddRequest pageSpec(DynamicCreativePageSpec pageSpec) {
    this.pageSpec = pageSpec;
    return this;
  }

  /**
   * Get pageSpec
   *
   * @return pageSpec
   */
  @ApiModelProperty(value = "")
  public DynamicCreativePageSpec getPageSpec() {
    return pageSpec;
  }

  public void setPageSpec(DynamicCreativePageSpec pageSpec) {
    this.pageSpec = pageSpec;
  }

  public DynamicCreativesAddRequest linkPageType(LinkPageType linkPageType) {
    this.linkPageType = linkPageType;
    return this;
  }

  /**
   * Get linkPageType
   *
   * @return linkPageType
   */
  @ApiModelProperty(value = "")
  public LinkPageType getLinkPageType() {
    return linkPageType;
  }

  public void setLinkPageType(LinkPageType linkPageType) {
    this.linkPageType = linkPageType;
  }

  public DynamicCreativesAddRequest linkNameType(LinkUrlLinkNameType linkNameType) {
    this.linkNameType = linkNameType;
    return this;
  }

  /**
   * Get linkNameType
   *
   * @return linkNameType
   */
  @ApiModelProperty(value = "")
  public LinkUrlLinkNameType getLinkNameType() {
    return linkNameType;
  }

  public void setLinkNameType(LinkUrlLinkNameType linkNameType) {
    this.linkNameType = linkNameType;
  }

  public DynamicCreativesAddRequest linkPageSpec(LinkPageSpec linkPageSpec) {
    this.linkPageSpec = linkPageSpec;
    return this;
  }

  /**
   * Get linkPageSpec
   *
   * @return linkPageSpec
   */
  @ApiModelProperty(value = "")
  public LinkPageSpec getLinkPageSpec() {
    return linkPageSpec;
  }

  public void setLinkPageSpec(LinkPageSpec linkPageSpec) {
    this.linkPageSpec = linkPageSpec;
  }

  public DynamicCreativesAddRequest conversionDataType(ConversionDataType conversionDataType) {
    this.conversionDataType = conversionDataType;
    return this;
  }

  /**
   * Get conversionDataType
   *
   * @return conversionDataType
   */
  @ApiModelProperty(value = "")
  public ConversionDataType getConversionDataType() {
    return conversionDataType;
  }

  public void setConversionDataType(ConversionDataType conversionDataType) {
    this.conversionDataType = conversionDataType;
  }

  public DynamicCreativesAddRequest conversionTargetType(
      ConversionTargetType conversionTargetType) {
    this.conversionTargetType = conversionTargetType;
    return this;
  }

  /**
   * Get conversionTargetType
   *
   * @return conversionTargetType
   */
  @ApiModelProperty(value = "")
  public ConversionTargetType getConversionTargetType() {
    return conversionTargetType;
  }

  public void setConversionTargetType(ConversionTargetType conversionTargetType) {
    this.conversionTargetType = conversionTargetType;
  }

  public DynamicCreativesAddRequest qqMiniGameTrackingQueryString(
      String qqMiniGameTrackingQueryString) {
    this.qqMiniGameTrackingQueryString = qqMiniGameTrackingQueryString;
    return this;
  }

  /**
   * Get qqMiniGameTrackingQueryString
   *
   * @return qqMiniGameTrackingQueryString
   */
  @ApiModelProperty(value = "")
  public String getQqMiniGameTrackingQueryString() {
    return qqMiniGameTrackingQueryString;
  }

  public void setQqMiniGameTrackingQueryString(String qqMiniGameTrackingQueryString) {
    this.qqMiniGameTrackingQueryString = qqMiniGameTrackingQueryString;
  }

  public DynamicCreativesAddRequest deepLinkUrl(String deepLinkUrl) {
    this.deepLinkUrl = deepLinkUrl;
    return this;
  }

  /**
   * Get deepLinkUrl
   *
   * @return deepLinkUrl
   */
  @ApiModelProperty(value = "")
  public String getDeepLinkUrl() {
    return deepLinkUrl;
  }

  public void setDeepLinkUrl(String deepLinkUrl) {
    this.deepLinkUrl = deepLinkUrl;
  }

  public DynamicCreativesAddRequest impressionTrackingUrl(String impressionTrackingUrl) {
    this.impressionTrackingUrl = impressionTrackingUrl;
    return this;
  }

  /**
   * Get impressionTrackingUrl
   *
   * @return impressionTrackingUrl
   */
  @ApiModelProperty(value = "")
  public String getImpressionTrackingUrl() {
    return impressionTrackingUrl;
  }

  public void setImpressionTrackingUrl(String impressionTrackingUrl) {
    this.impressionTrackingUrl = impressionTrackingUrl;
  }

  public DynamicCreativesAddRequest clickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
    return this;
  }

  /**
   * Get clickTrackingUrl
   *
   * @return clickTrackingUrl
   */
  @ApiModelProperty(value = "")
  public String getClickTrackingUrl() {
    return clickTrackingUrl;
  }

  public void setClickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
  }

  public DynamicCreativesAddRequest feedsVideoCommentSwitch(Boolean feedsVideoCommentSwitch) {
    this.feedsVideoCommentSwitch = feedsVideoCommentSwitch;
    return this;
  }

  /**
   * Get feedsVideoCommentSwitch
   *
   * @return feedsVideoCommentSwitch
   */
  @ApiModelProperty(value = "")
  public Boolean isFeedsVideoCommentSwitch() {
    return feedsVideoCommentSwitch;
  }

  public void setFeedsVideoCommentSwitch(Boolean feedsVideoCommentSwitch) {
    this.feedsVideoCommentSwitch = feedsVideoCommentSwitch;
  }

  public DynamicCreativesAddRequest unionMarketSwitch(Boolean unionMarketSwitch) {
    this.unionMarketSwitch = unionMarketSwitch;
    return this;
  }

  /**
   * Get unionMarketSwitch
   *
   * @return unionMarketSwitch
   */
  @ApiModelProperty(value = "")
  public Boolean isUnionMarketSwitch() {
    return unionMarketSwitch;
  }

  public void setUnionMarketSwitch(Boolean unionMarketSwitch) {
    this.unionMarketSwitch = unionMarketSwitch;
  }

  public DynamicCreativesAddRequest androidDeepLinkAppId(String androidDeepLinkAppId) {
    this.androidDeepLinkAppId = androidDeepLinkAppId;
    return this;
  }

  /**
   * Get androidDeepLinkAppId
   *
   * @return androidDeepLinkAppId
   */
  @ApiModelProperty(value = "")
  public String getAndroidDeepLinkAppId() {
    return androidDeepLinkAppId;
  }

  public void setAndroidDeepLinkAppId(String androidDeepLinkAppId) {
    this.androidDeepLinkAppId = androidDeepLinkAppId;
  }

  public DynamicCreativesAddRequest iosDeepLinkAppId(String iosDeepLinkAppId) {
    this.iosDeepLinkAppId = iosDeepLinkAppId;
    return this;
  }

  /**
   * Get iosDeepLinkAppId
   *
   * @return iosDeepLinkAppId
   */
  @ApiModelProperty(value = "")
  public String getIosDeepLinkAppId() {
    return iosDeepLinkAppId;
  }

  public void setIosDeepLinkAppId(String iosDeepLinkAppId) {
    this.iosDeepLinkAppId = iosDeepLinkAppId;
  }

  public DynamicCreativesAddRequest universalLinkUrl(String universalLinkUrl) {
    this.universalLinkUrl = universalLinkUrl;
    return this;
  }

  /**
   * Get universalLinkUrl
   *
   * @return universalLinkUrl
   */
  @ApiModelProperty(value = "")
  public String getUniversalLinkUrl() {
    return universalLinkUrl;
  }

  public void setUniversalLinkUrl(String universalLinkUrl) {
    this.universalLinkUrl = universalLinkUrl;
  }

  public DynamicCreativesAddRequest profileId(Long profileId) {
    this.profileId = profileId;
    return this;
  }

  /**
   * Get profileId
   *
   * @return profileId
   */
  @ApiModelProperty(value = "")
  public Long getProfileId() {
    return profileId;
  }

  public void setProfileId(Long profileId) {
    this.profileId = profileId;
  }

  public DynamicCreativesAddRequest shareContentSpec(ShareContentSpec shareContentSpec) {
    this.shareContentSpec = shareContentSpec;
    return this;
  }

  /**
   * Get shareContentSpec
   *
   * @return shareContentSpec
   */
  @ApiModelProperty(value = "")
  public ShareContentSpec getShareContentSpec() {
    return shareContentSpec;
  }

  public void setShareContentSpec(ShareContentSpec shareContentSpec) {
    this.shareContentSpec = shareContentSpec;
  }

  public DynamicCreativesAddRequest dynamicAdcreativeSpec(
      DynamicAdcreativeSpecForDc dynamicAdcreativeSpec) {
    this.dynamicAdcreativeSpec = dynamicAdcreativeSpec;
    return this;
  }

  /**
   * Get dynamicAdcreativeSpec
   *
   * @return dynamicAdcreativeSpec
   */
  @ApiModelProperty(value = "")
  public DynamicAdcreativeSpecForDc getDynamicAdcreativeSpec() {
    return dynamicAdcreativeSpec;
  }

  public void setDynamicAdcreativeSpec(DynamicAdcreativeSpecForDc dynamicAdcreativeSpec) {
    this.dynamicAdcreativeSpec = dynamicAdcreativeSpec;
  }

  public DynamicCreativesAddRequest componentId(Long componentId) {
    this.componentId = componentId;
    return this;
  }

  /**
   * Get componentId
   *
   * @return componentId
   */
  @ApiModelProperty(value = "")
  public Long getComponentId() {
    return componentId;
  }

  public void setComponentId(Long componentId) {
    this.componentId = componentId;
  }

  public DynamicCreativesAddRequest videoEndPage(VideoEndPageSpec videoEndPage) {
    this.videoEndPage = videoEndPage;
    return this;
  }

  /**
   * Get videoEndPage
   *
   * @return videoEndPage
   */
  @ApiModelProperty(value = "")
  public VideoEndPageSpec getVideoEndPage() {
    return videoEndPage;
  }

  public void setVideoEndPage(VideoEndPageSpec videoEndPage) {
    this.videoEndPage = videoEndPage;
  }

  public DynamicCreativesAddRequest webviewUrl(String webviewUrl) {
    this.webviewUrl = webviewUrl;
    return this;
  }

  /**
   * Get webviewUrl
   *
   * @return webviewUrl
   */
  @ApiModelProperty(value = "")
  public String getWebviewUrl() {
    return webviewUrl;
  }

  public void setWebviewUrl(String webviewUrl) {
    this.webviewUrl = webviewUrl;
  }

  public DynamicCreativesAddRequest simpleCanvasSubType(SimpleCanvasSubType simpleCanvasSubType) {
    this.simpleCanvasSubType = simpleCanvasSubType;
    return this;
  }

  /**
   * Get simpleCanvasSubType
   *
   * @return simpleCanvasSubType
   */
  @ApiModelProperty(value = "")
  public SimpleCanvasSubType getSimpleCanvasSubType() {
    return simpleCanvasSubType;
  }

  public void setSimpleCanvasSubType(SimpleCanvasSubType simpleCanvasSubType) {
    this.simpleCanvasSubType = simpleCanvasSubType;
  }

  public DynamicCreativesAddRequest floatingZone(FloatingZone floatingZone) {
    this.floatingZone = floatingZone;
    return this;
  }

  /**
   * Get floatingZone
   *
   * @return floatingZone
   */
  @ApiModelProperty(value = "")
  public FloatingZone getFloatingZone() {
    return floatingZone;
  }

  public void setFloatingZone(FloatingZone floatingZone) {
    this.floatingZone = floatingZone;
  }

  public DynamicCreativesAddRequest marketingPendantImageId(String marketingPendantImageId) {
    this.marketingPendantImageId = marketingPendantImageId;
    return this;
  }

  /**
   * Get marketingPendantImageId
   *
   * @return marketingPendantImageId
   */
  @ApiModelProperty(value = "")
  public String getMarketingPendantImageId() {
    return marketingPendantImageId;
  }

  public void setMarketingPendantImageId(String marketingPendantImageId) {
    this.marketingPendantImageId = marketingPendantImageId;
  }

  public DynamicCreativesAddRequest barrageList(List<BarrageListCreateStruct> barrageList) {
    this.barrageList = barrageList;
    return this;
  }

  public DynamicCreativesAddRequest addBarrageListItem(BarrageListCreateStruct barrageListItem) {
    if (this.barrageList == null) {
      this.barrageList = new ArrayList<BarrageListCreateStruct>();
    }
    this.barrageList.add(barrageListItem);
    return this;
  }

  /**
   * Get barrageList
   *
   * @return barrageList
   */
  @ApiModelProperty(value = "")
  public List<BarrageListCreateStruct> getBarrageList() {
    return barrageList;
  }

  public void setBarrageList(List<BarrageListCreateStruct> barrageList) {
    this.barrageList = barrageList;
  }

  public DynamicCreativesAddRequest dynamicCreativeGroupUsed(
      DynamicCreativeGroupUsed dynamicCreativeGroupUsed) {
    this.dynamicCreativeGroupUsed = dynamicCreativeGroupUsed;
    return this;
  }

  /**
   * Get dynamicCreativeGroupUsed
   *
   * @return dynamicCreativeGroupUsed
   */
  @ApiModelProperty(value = "")
  public DynamicCreativeGroupUsed getDynamicCreativeGroupUsed() {
    return dynamicCreativeGroupUsed;
  }

  public void setDynamicCreativeGroupUsed(DynamicCreativeGroupUsed dynamicCreativeGroupUsed) {
    this.dynamicCreativeGroupUsed = dynamicCreativeGroupUsed;
  }

  public DynamicCreativesAddRequest countdownSwitch(Boolean countdownSwitch) {
    this.countdownSwitch = countdownSwitch;
    return this;
  }

  /**
   * Get countdownSwitch
   *
   * @return countdownSwitch
   */
  @ApiModelProperty(value = "")
  public Boolean isCountdownSwitch() {
    return countdownSwitch;
  }

  public void setCountdownSwitch(Boolean countdownSwitch) {
    this.countdownSwitch = countdownSwitch;
  }

  public DynamicCreativesAddRequest appGiftPackCode(AppGiftPackCode appGiftPackCode) {
    this.appGiftPackCode = appGiftPackCode;
    return this;
  }

  /**
   * Get appGiftPackCode
   *
   * @return appGiftPackCode
   */
  @ApiModelProperty(value = "")
  public AppGiftPackCode getAppGiftPackCode() {
    return appGiftPackCode;
  }

  public void setAppGiftPackCode(AppGiftPackCode appGiftPackCode) {
    this.appGiftPackCode = appGiftPackCode;
  }

  public DynamicCreativesAddRequest enableBreakthroughSiteset(Boolean enableBreakthroughSiteset) {
    this.enableBreakthroughSiteset = enableBreakthroughSiteset;
    return this;
  }

  /**
   * Get enableBreakthroughSiteset
   *
   * @return enableBreakthroughSiteset
   */
  @ApiModelProperty(value = "")
  public Boolean isEnableBreakthroughSiteset() {
    return enableBreakthroughSiteset;
  }

  public void setEnableBreakthroughSiteset(Boolean enableBreakthroughSiteset) {
    this.enableBreakthroughSiteset = enableBreakthroughSiteset;
  }

  public DynamicCreativesAddRequest unionMarketSpec(UnionMarketSpec unionMarketSpec) {
    this.unionMarketSpec = unionMarketSpec;
    return this;
  }

  /**
   * Get unionMarketSpec
   *
   * @return unionMarketSpec
   */
  @ApiModelProperty(value = "")
  public UnionMarketSpec getUnionMarketSpec() {
    return unionMarketSpec;
  }

  public void setUnionMarketSpec(UnionMarketSpec unionMarketSpec) {
    this.unionMarketSpec = unionMarketSpec;
  }

  public DynamicCreativesAddRequest autoDerivedProgramCreativeSwitch(
      Boolean autoDerivedProgramCreativeSwitch) {
    this.autoDerivedProgramCreativeSwitch = autoDerivedProgramCreativeSwitch;
    return this;
  }

  /**
   * Get autoDerivedProgramCreativeSwitch
   *
   * @return autoDerivedProgramCreativeSwitch
   */
  @ApiModelProperty(value = "")
  public Boolean isAutoDerivedProgramCreativeSwitch() {
    return autoDerivedProgramCreativeSwitch;
  }

  public void setAutoDerivedProgramCreativeSwitch(Boolean autoDerivedProgramCreativeSwitch) {
    this.autoDerivedProgramCreativeSwitch = autoDerivedProgramCreativeSwitch;
  }

  public DynamicCreativesAddRequest programCreativeInfo(ProgramCreativeInfo programCreativeInfo) {
    this.programCreativeInfo = programCreativeInfo;
    return this;
  }

  /**
   * Get programCreativeInfo
   *
   * @return programCreativeInfo
   */
  @ApiModelProperty(value = "")
  public ProgramCreativeInfo getProgramCreativeInfo() {
    return programCreativeInfo;
  }

  public void setProgramCreativeInfo(ProgramCreativeInfo programCreativeInfo) {
    this.programCreativeInfo = programCreativeInfo;
  }

  public DynamicCreativesAddRequest dynamicCreativeType(DynamicCreativeType dynamicCreativeType) {
    this.dynamicCreativeType = dynamicCreativeType;
    return this;
  }

  /**
   * Get dynamicCreativeType
   *
   * @return dynamicCreativeType
   */
  @ApiModelProperty(value = "")
  public DynamicCreativeType getDynamicCreativeType() {
    return dynamicCreativeType;
  }

  public void setDynamicCreativeType(DynamicCreativeType dynamicCreativeType) {
    this.dynamicCreativeType = dynamicCreativeType;
  }

  public DynamicCreativesAddRequest headClickType(HeadClickType headClickType) {
    this.headClickType = headClickType;
    return this;
  }

  /**
   * Get headClickType
   *
   * @return headClickType
   */
  @ApiModelProperty(value = "")
  public HeadClickType getHeadClickType() {
    return headClickType;
  }

  public void setHeadClickType(HeadClickType headClickType) {
    this.headClickType = headClickType;
  }

  public DynamicCreativesAddRequest headClickSpec(HeadClickSpec headClickSpec) {
    this.headClickSpec = headClickSpec;
    return this;
  }

  /**
   * Get headClickSpec
   *
   * @return headClickSpec
   */
  @ApiModelProperty(value = "")
  public HeadClickSpec getHeadClickSpec() {
    return headClickSpec;
  }

  public void setHeadClickSpec(HeadClickSpec headClickSpec) {
    this.headClickSpec = headClickSpec;
  }

  public DynamicCreativesAddRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * Get campaignId
   *
   * @return campaignId
   */
  @ApiModelProperty(value = "")
  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public DynamicCreativesAddRequest pageTrackUrl(String pageTrackUrl) {
    this.pageTrackUrl = pageTrackUrl;
    return this;
  }

  /**
   * Get pageTrackUrl
   *
   * @return pageTrackUrl
   */
  @ApiModelProperty(value = "")
  public String getPageTrackUrl() {
    return pageTrackUrl;
  }

  public void setPageTrackUrl(String pageTrackUrl) {
    this.pageTrackUrl = pageTrackUrl;
  }

  public DynamicCreativesAddRequest industryLabel(String industryLabel) {
    this.industryLabel = industryLabel;
    return this;
  }

  /**
   * Get industryLabel
   *
   * @return industryLabel
   */
  @ApiModelProperty(value = "")
  public String getIndustryLabel() {
    return industryLabel;
  }

  public void setIndustryLabel(String industryLabel) {
    this.industryLabel = industryLabel;
  }

  public DynamicCreativesAddRequest sublinkSwitch(AdvertiserSublinkSwitch sublinkSwitch) {
    this.sublinkSwitch = sublinkSwitch;
    return this;
  }

  /**
   * Get sublinkSwitch
   *
   * @return sublinkSwitch
   */
  @ApiModelProperty(value = "")
  public AdvertiserSublinkSwitch getSublinkSwitch() {
    return sublinkSwitch;
  }

  public void setSublinkSwitch(AdvertiserSublinkSwitch sublinkSwitch) {
    this.sublinkSwitch = sublinkSwitch;
  }

  public DynamicCreativesAddRequest picMaterialSwitch(
      AdvertiserPicMaterialSwitch picMaterialSwitch) {
    this.picMaterialSwitch = picMaterialSwitch;
    return this;
  }

  /**
   * Get picMaterialSwitch
   *
   * @return picMaterialSwitch
   */
  @ApiModelProperty(value = "")
  public AdvertiserPicMaterialSwitch getPicMaterialSwitch() {
    return picMaterialSwitch;
  }

  public void setPicMaterialSwitch(AdvertiserPicMaterialSwitch picMaterialSwitch) {
    this.picMaterialSwitch = picMaterialSwitch;
  }

  public DynamicCreativesAddRequest accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   *
   * @return accountId
   */
  @ApiModelProperty(value = "")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicCreativesAddRequest dynamicCreativesAddRequest = (DynamicCreativesAddRequest) o;
    return Objects.equals(this.dynamicCreativeName, dynamicCreativesAddRequest.dynamicCreativeName)
        && Objects.equals(
            this.dynamicCreativeTemplateId, dynamicCreativesAddRequest.dynamicCreativeTemplateId)
        && Objects.equals(
            this.dynamicCreativeElements, dynamicCreativesAddRequest.dynamicCreativeElements)
        && Objects.equals(this.campaignType, dynamicCreativesAddRequest.campaignType)
        && Objects.equals(this.promotedObjectType, dynamicCreativesAddRequest.promotedObjectType)
        && Objects.equals(this.pageType, dynamicCreativesAddRequest.pageType)
        && Objects.equals(
            this.automaticSiteEnabled, dynamicCreativesAddRequest.automaticSiteEnabled)
        && Objects.equals(this.siteSet, dynamicCreativesAddRequest.siteSet)
        && Objects.equals(this.promotedObjectId, dynamicCreativesAddRequest.promotedObjectId)
        && Objects.equals(this.pageSpec, dynamicCreativesAddRequest.pageSpec)
        && Objects.equals(this.linkPageType, dynamicCreativesAddRequest.linkPageType)
        && Objects.equals(this.linkNameType, dynamicCreativesAddRequest.linkNameType)
        && Objects.equals(this.linkPageSpec, dynamicCreativesAddRequest.linkPageSpec)
        && Objects.equals(this.conversionDataType, dynamicCreativesAddRequest.conversionDataType)
        && Objects.equals(
            this.conversionTargetType, dynamicCreativesAddRequest.conversionTargetType)
        && Objects.equals(
            this.qqMiniGameTrackingQueryString,
            dynamicCreativesAddRequest.qqMiniGameTrackingQueryString)
        && Objects.equals(this.deepLinkUrl, dynamicCreativesAddRequest.deepLinkUrl)
        && Objects.equals(
            this.impressionTrackingUrl, dynamicCreativesAddRequest.impressionTrackingUrl)
        && Objects.equals(this.clickTrackingUrl, dynamicCreativesAddRequest.clickTrackingUrl)
        && Objects.equals(
            this.feedsVideoCommentSwitch, dynamicCreativesAddRequest.feedsVideoCommentSwitch)
        && Objects.equals(this.unionMarketSwitch, dynamicCreativesAddRequest.unionMarketSwitch)
        && Objects.equals(
            this.androidDeepLinkAppId, dynamicCreativesAddRequest.androidDeepLinkAppId)
        && Objects.equals(this.iosDeepLinkAppId, dynamicCreativesAddRequest.iosDeepLinkAppId)
        && Objects.equals(this.universalLinkUrl, dynamicCreativesAddRequest.universalLinkUrl)
        && Objects.equals(this.profileId, dynamicCreativesAddRequest.profileId)
        && Objects.equals(this.shareContentSpec, dynamicCreativesAddRequest.shareContentSpec)
        && Objects.equals(
            this.dynamicAdcreativeSpec, dynamicCreativesAddRequest.dynamicAdcreativeSpec)
        && Objects.equals(this.componentId, dynamicCreativesAddRequest.componentId)
        && Objects.equals(this.videoEndPage, dynamicCreativesAddRequest.videoEndPage)
        && Objects.equals(this.webviewUrl, dynamicCreativesAddRequest.webviewUrl)
        && Objects.equals(this.simpleCanvasSubType, dynamicCreativesAddRequest.simpleCanvasSubType)
        && Objects.equals(this.floatingZone, dynamicCreativesAddRequest.floatingZone)
        && Objects.equals(
            this.marketingPendantImageId, dynamicCreativesAddRequest.marketingPendantImageId)
        && Objects.equals(this.barrageList, dynamicCreativesAddRequest.barrageList)
        && Objects.equals(
            this.dynamicCreativeGroupUsed, dynamicCreativesAddRequest.dynamicCreativeGroupUsed)
        && Objects.equals(this.countdownSwitch, dynamicCreativesAddRequest.countdownSwitch)
        && Objects.equals(this.appGiftPackCode, dynamicCreativesAddRequest.appGiftPackCode)
        && Objects.equals(
            this.enableBreakthroughSiteset, dynamicCreativesAddRequest.enableBreakthroughSiteset)
        && Objects.equals(this.unionMarketSpec, dynamicCreativesAddRequest.unionMarketSpec)
        && Objects.equals(
            this.autoDerivedProgramCreativeSwitch,
            dynamicCreativesAddRequest.autoDerivedProgramCreativeSwitch)
        && Objects.equals(this.programCreativeInfo, dynamicCreativesAddRequest.programCreativeInfo)
        && Objects.equals(this.dynamicCreativeType, dynamicCreativesAddRequest.dynamicCreativeType)
        && Objects.equals(this.headClickType, dynamicCreativesAddRequest.headClickType)
        && Objects.equals(this.headClickSpec, dynamicCreativesAddRequest.headClickSpec)
        && Objects.equals(this.campaignId, dynamicCreativesAddRequest.campaignId)
        && Objects.equals(this.pageTrackUrl, dynamicCreativesAddRequest.pageTrackUrl)
        && Objects.equals(this.industryLabel, dynamicCreativesAddRequest.industryLabel)
        && Objects.equals(this.sublinkSwitch, dynamicCreativesAddRequest.sublinkSwitch)
        && Objects.equals(this.picMaterialSwitch, dynamicCreativesAddRequest.picMaterialSwitch)
        && Objects.equals(this.accountId, dynamicCreativesAddRequest.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dynamicCreativeName,
        dynamicCreativeTemplateId,
        dynamicCreativeElements,
        campaignType,
        promotedObjectType,
        pageType,
        automaticSiteEnabled,
        siteSet,
        promotedObjectId,
        pageSpec,
        linkPageType,
        linkNameType,
        linkPageSpec,
        conversionDataType,
        conversionTargetType,
        qqMiniGameTrackingQueryString,
        deepLinkUrl,
        impressionTrackingUrl,
        clickTrackingUrl,
        feedsVideoCommentSwitch,
        unionMarketSwitch,
        androidDeepLinkAppId,
        iosDeepLinkAppId,
        universalLinkUrl,
        profileId,
        shareContentSpec,
        dynamicAdcreativeSpec,
        componentId,
        videoEndPage,
        webviewUrl,
        simpleCanvasSubType,
        floatingZone,
        marketingPendantImageId,
        barrageList,
        dynamicCreativeGroupUsed,
        countdownSwitch,
        appGiftPackCode,
        enableBreakthroughSiteset,
        unionMarketSpec,
        autoDerivedProgramCreativeSwitch,
        programCreativeInfo,
        dynamicCreativeType,
        headClickType,
        headClickSpec,
        campaignId,
        pageTrackUrl,
        industryLabel,
        sublinkSwitch,
        picMaterialSwitch,
        accountId);
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

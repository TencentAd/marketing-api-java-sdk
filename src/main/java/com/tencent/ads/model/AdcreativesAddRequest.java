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

/** AdcreativesAddRequest */
public class AdcreativesAddRequest {
  @SerializedName("campaign_id")
  private Long campaignId = null;

  @SerializedName("adcreative_name")
  private String adcreativeName = null;

  @SerializedName("promoted_object_type")
  private PromotedObjectType promotedObjectType = null;

  @SerializedName("page_type")
  private DestinationType pageType = null;

  @SerializedName("automatic_site_enabled")
  private Boolean automaticSiteEnabled = null;

  @SerializedName("site_set")
  private List<String> siteSet = null;

  @SerializedName("page_spec")
  private PageSpec pageSpec = null;

  @SerializedName("link_page_type")
  private LinkPageType linkPageType = null;

  @SerializedName("link_name_type")
  private LinkNameTypeMP linkNameType = null;

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

  @SerializedName("android_deep_link_app_id")
  private String androidDeepLinkAppId = null;

  @SerializedName("ios_deep_link_app_id")
  private String iosDeepLinkAppId = null;

  @SerializedName("universal_link_url")
  private String universalLinkUrl = null;

  @SerializedName("promoted_object_id")
  private String promotedObjectId = null;

  @SerializedName("profile_id")
  private Long profileId = null;

  @SerializedName("share_content_spec")
  private ShareContentSpec shareContentSpec = null;

  @SerializedName("dynamic_adcreative_spec")
  private DynamicAdcreativeSpec dynamicAdcreativeSpec = null;

  @SerializedName("multi_share_optimization_enabled")
  private Boolean multiShareOptimizationEnabled = null;

  @SerializedName("component_id")
  private Long componentId = null;

  @SerializedName("category")
  private List<Long> category = null;

  @SerializedName("label")
  private List<String> label = null;

  @SerializedName("union_market_switch")
  private Boolean unionMarketSwitch = null;

  @SerializedName("playable_page_material_id")
  private String playablePageMaterialId = null;

  @SerializedName("video_end_page")
  private VideoEndPageSpec videoEndPage = null;

  @SerializedName("feeds_video_comment_switch")
  private Boolean feedsVideoCommentSwitch = null;

  @SerializedName("webview_url")
  private String webviewUrl = null;

  @SerializedName("simple_canvas_sub_type")
  private SimpleCanvasSubType simpleCanvasSubType = null;

  @SerializedName("floating_zone")
  private FloatingZone floatingZone = null;

  @SerializedName("marketing_pendant_image_id")
  private String marketingPendantImageId = null;

  @SerializedName("countdown_switch")
  private Boolean countdownSwitch = null;

  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("adcreative_template_id")
  private Long adcreativeTemplateId = null;

  @SerializedName("adcreative_elements")
  private AdcreativeCreativeElementsMp adcreativeElements = null;

  public AdcreativesAddRequest campaignId(Long campaignId) {
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

  public AdcreativesAddRequest adcreativeName(String adcreativeName) {
    this.adcreativeName = adcreativeName;
    return this;
  }

  /**
   * Get adcreativeName
   *
   * @return adcreativeName
   */
  @ApiModelProperty(value = "")
  public String getAdcreativeName() {
    return adcreativeName;
  }

  public void setAdcreativeName(String adcreativeName) {
    this.adcreativeName = adcreativeName;
  }

  public AdcreativesAddRequest promotedObjectType(PromotedObjectType promotedObjectType) {
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

  public AdcreativesAddRequest pageType(DestinationType pageType) {
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

  public AdcreativesAddRequest automaticSiteEnabled(Boolean automaticSiteEnabled) {
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

  public AdcreativesAddRequest siteSet(List<String> siteSet) {
    this.siteSet = siteSet;
    return this;
  }

  public AdcreativesAddRequest addSiteSetItem(String siteSetItem) {
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

  public AdcreativesAddRequest pageSpec(PageSpec pageSpec) {
    this.pageSpec = pageSpec;
    return this;
  }

  /**
   * Get pageSpec
   *
   * @return pageSpec
   */
  @ApiModelProperty(value = "")
  public PageSpec getPageSpec() {
    return pageSpec;
  }

  public void setPageSpec(PageSpec pageSpec) {
    this.pageSpec = pageSpec;
  }

  public AdcreativesAddRequest linkPageType(LinkPageType linkPageType) {
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

  public AdcreativesAddRequest linkNameType(LinkNameTypeMP linkNameType) {
    this.linkNameType = linkNameType;
    return this;
  }

  /**
   * Get linkNameType
   *
   * @return linkNameType
   */
  @ApiModelProperty(value = "")
  public LinkNameTypeMP getLinkNameType() {
    return linkNameType;
  }

  public void setLinkNameType(LinkNameTypeMP linkNameType) {
    this.linkNameType = linkNameType;
  }

  public AdcreativesAddRequest linkPageSpec(LinkPageSpec linkPageSpec) {
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

  public AdcreativesAddRequest conversionDataType(ConversionDataType conversionDataType) {
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

  public AdcreativesAddRequest conversionTargetType(ConversionTargetType conversionTargetType) {
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

  public AdcreativesAddRequest qqMiniGameTrackingQueryString(String qqMiniGameTrackingQueryString) {
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

  public AdcreativesAddRequest deepLinkUrl(String deepLinkUrl) {
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

  public AdcreativesAddRequest androidDeepLinkAppId(String androidDeepLinkAppId) {
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

  public AdcreativesAddRequest iosDeepLinkAppId(String iosDeepLinkAppId) {
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

  public AdcreativesAddRequest universalLinkUrl(String universalLinkUrl) {
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

  public AdcreativesAddRequest promotedObjectId(String promotedObjectId) {
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

  public AdcreativesAddRequest profileId(Long profileId) {
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

  public AdcreativesAddRequest shareContentSpec(ShareContentSpec shareContentSpec) {
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

  public AdcreativesAddRequest dynamicAdcreativeSpec(DynamicAdcreativeSpec dynamicAdcreativeSpec) {
    this.dynamicAdcreativeSpec = dynamicAdcreativeSpec;
    return this;
  }

  /**
   * Get dynamicAdcreativeSpec
   *
   * @return dynamicAdcreativeSpec
   */
  @ApiModelProperty(value = "")
  public DynamicAdcreativeSpec getDynamicAdcreativeSpec() {
    return dynamicAdcreativeSpec;
  }

  public void setDynamicAdcreativeSpec(DynamicAdcreativeSpec dynamicAdcreativeSpec) {
    this.dynamicAdcreativeSpec = dynamicAdcreativeSpec;
  }

  public AdcreativesAddRequest multiShareOptimizationEnabled(
      Boolean multiShareOptimizationEnabled) {
    this.multiShareOptimizationEnabled = multiShareOptimizationEnabled;
    return this;
  }

  /**
   * Get multiShareOptimizationEnabled
   *
   * @return multiShareOptimizationEnabled
   */
  @ApiModelProperty(value = "")
  public Boolean isMultiShareOptimizationEnabled() {
    return multiShareOptimizationEnabled;
  }

  public void setMultiShareOptimizationEnabled(Boolean multiShareOptimizationEnabled) {
    this.multiShareOptimizationEnabled = multiShareOptimizationEnabled;
  }

  public AdcreativesAddRequest componentId(Long componentId) {
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

  public AdcreativesAddRequest category(List<Long> category) {
    this.category = category;
    return this;
  }

  public AdcreativesAddRequest addCategoryItem(Long categoryItem) {
    if (this.category == null) {
      this.category = new ArrayList<Long>();
    }
    this.category.add(categoryItem);
    return this;
  }

  /**
   * Get category
   *
   * @return category
   */
  @ApiModelProperty(value = "")
  public List<Long> getCategory() {
    return category;
  }

  public void setCategory(List<Long> category) {
    this.category = category;
  }

  public AdcreativesAddRequest label(List<String> label) {
    this.label = label;
    return this;
  }

  public AdcreativesAddRequest addLabelItem(String labelItem) {
    if (this.label == null) {
      this.label = new ArrayList<String>();
    }
    this.label.add(labelItem);
    return this;
  }

  /**
   * Get label
   *
   * @return label
   */
  @ApiModelProperty(value = "")
  public List<String> getLabel() {
    return label;
  }

  public void setLabel(List<String> label) {
    this.label = label;
  }

  public AdcreativesAddRequest unionMarketSwitch(Boolean unionMarketSwitch) {
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

  public AdcreativesAddRequest playablePageMaterialId(String playablePageMaterialId) {
    this.playablePageMaterialId = playablePageMaterialId;
    return this;
  }

  /**
   * Get playablePageMaterialId
   *
   * @return playablePageMaterialId
   */
  @ApiModelProperty(value = "")
  public String getPlayablePageMaterialId() {
    return playablePageMaterialId;
  }

  public void setPlayablePageMaterialId(String playablePageMaterialId) {
    this.playablePageMaterialId = playablePageMaterialId;
  }

  public AdcreativesAddRequest videoEndPage(VideoEndPageSpec videoEndPage) {
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

  public AdcreativesAddRequest feedsVideoCommentSwitch(Boolean feedsVideoCommentSwitch) {
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

  public AdcreativesAddRequest webviewUrl(String webviewUrl) {
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

  public AdcreativesAddRequest simpleCanvasSubType(SimpleCanvasSubType simpleCanvasSubType) {
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

  public AdcreativesAddRequest floatingZone(FloatingZone floatingZone) {
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

  public AdcreativesAddRequest marketingPendantImageId(String marketingPendantImageId) {
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

  public AdcreativesAddRequest countdownSwitch(Boolean countdownSwitch) {
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

  public AdcreativesAddRequest accountId(Long accountId) {
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

  public AdcreativesAddRequest adcreativeTemplateId(Long adcreativeTemplateId) {
    this.adcreativeTemplateId = adcreativeTemplateId;
    return this;
  }

  /**
   * Get adcreativeTemplateId
   *
   * @return adcreativeTemplateId
   */
  @ApiModelProperty(value = "")
  public Long getAdcreativeTemplateId() {
    return adcreativeTemplateId;
  }

  public void setAdcreativeTemplateId(Long adcreativeTemplateId) {
    this.adcreativeTemplateId = adcreativeTemplateId;
  }

  public AdcreativesAddRequest adcreativeElements(AdcreativeCreativeElementsMp adcreativeElements) {
    this.adcreativeElements = adcreativeElements;
    return this;
  }

  /**
   * Get adcreativeElements
   *
   * @return adcreativeElements
   */
  @ApiModelProperty(value = "")
  public AdcreativeCreativeElementsMp getAdcreativeElements() {
    return adcreativeElements;
  }

  public void setAdcreativeElements(AdcreativeCreativeElementsMp adcreativeElements) {
    this.adcreativeElements = adcreativeElements;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdcreativesAddRequest adcreativesAddRequest = (AdcreativesAddRequest) o;
    return Objects.equals(this.campaignId, adcreativesAddRequest.campaignId)
        && Objects.equals(this.adcreativeName, adcreativesAddRequest.adcreativeName)
        && Objects.equals(this.promotedObjectType, adcreativesAddRequest.promotedObjectType)
        && Objects.equals(this.pageType, adcreativesAddRequest.pageType)
        && Objects.equals(this.automaticSiteEnabled, adcreativesAddRequest.automaticSiteEnabled)
        && Objects.equals(this.siteSet, adcreativesAddRequest.siteSet)
        && Objects.equals(this.pageSpec, adcreativesAddRequest.pageSpec)
        && Objects.equals(this.linkPageType, adcreativesAddRequest.linkPageType)
        && Objects.equals(this.linkNameType, adcreativesAddRequest.linkNameType)
        && Objects.equals(this.linkPageSpec, adcreativesAddRequest.linkPageSpec)
        && Objects.equals(this.conversionDataType, adcreativesAddRequest.conversionDataType)
        && Objects.equals(this.conversionTargetType, adcreativesAddRequest.conversionTargetType)
        && Objects.equals(
            this.qqMiniGameTrackingQueryString, adcreativesAddRequest.qqMiniGameTrackingQueryString)
        && Objects.equals(this.deepLinkUrl, adcreativesAddRequest.deepLinkUrl)
        && Objects.equals(this.androidDeepLinkAppId, adcreativesAddRequest.androidDeepLinkAppId)
        && Objects.equals(this.iosDeepLinkAppId, adcreativesAddRequest.iosDeepLinkAppId)
        && Objects.equals(this.universalLinkUrl, adcreativesAddRequest.universalLinkUrl)
        && Objects.equals(this.promotedObjectId, adcreativesAddRequest.promotedObjectId)
        && Objects.equals(this.profileId, adcreativesAddRequest.profileId)
        && Objects.equals(this.shareContentSpec, adcreativesAddRequest.shareContentSpec)
        && Objects.equals(this.dynamicAdcreativeSpec, adcreativesAddRequest.dynamicAdcreativeSpec)
        && Objects.equals(
            this.multiShareOptimizationEnabled, adcreativesAddRequest.multiShareOptimizationEnabled)
        && Objects.equals(this.componentId, adcreativesAddRequest.componentId)
        && Objects.equals(this.category, adcreativesAddRequest.category)
        && Objects.equals(this.label, adcreativesAddRequest.label)
        && Objects.equals(this.unionMarketSwitch, adcreativesAddRequest.unionMarketSwitch)
        && Objects.equals(this.playablePageMaterialId, adcreativesAddRequest.playablePageMaterialId)
        && Objects.equals(this.videoEndPage, adcreativesAddRequest.videoEndPage)
        && Objects.equals(
            this.feedsVideoCommentSwitch, adcreativesAddRequest.feedsVideoCommentSwitch)
        && Objects.equals(this.webviewUrl, adcreativesAddRequest.webviewUrl)
        && Objects.equals(this.simpleCanvasSubType, adcreativesAddRequest.simpleCanvasSubType)
        && Objects.equals(this.floatingZone, adcreativesAddRequest.floatingZone)
        && Objects.equals(
            this.marketingPendantImageId, adcreativesAddRequest.marketingPendantImageId)
        && Objects.equals(this.countdownSwitch, adcreativesAddRequest.countdownSwitch)
        && Objects.equals(this.accountId, adcreativesAddRequest.accountId)
        && Objects.equals(this.adcreativeTemplateId, adcreativesAddRequest.adcreativeTemplateId)
        && Objects.equals(this.adcreativeElements, adcreativesAddRequest.adcreativeElements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        campaignId,
        adcreativeName,
        promotedObjectType,
        pageType,
        automaticSiteEnabled,
        siteSet,
        pageSpec,
        linkPageType,
        linkNameType,
        linkPageSpec,
        conversionDataType,
        conversionTargetType,
        qqMiniGameTrackingQueryString,
        deepLinkUrl,
        androidDeepLinkAppId,
        iosDeepLinkAppId,
        universalLinkUrl,
        promotedObjectId,
        profileId,
        shareContentSpec,
        dynamicAdcreativeSpec,
        multiShareOptimizationEnabled,
        componentId,
        category,
        label,
        unionMarketSwitch,
        playablePageMaterialId,
        videoEndPage,
        feedsVideoCommentSwitch,
        webviewUrl,
        simpleCanvasSubType,
        floatingZone,
        marketingPendantImageId,
        countdownSwitch,
        accountId,
        adcreativeTemplateId,
        adcreativeElements);
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

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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** 广告创意 */
@ApiModel(description = "广告创意")
public class PreviewAdcreative {
  @SerializedName("adcreative_name")
  private String adcreativeName = null;

  @SerializedName("site_set")
  private List<String> siteSet = null;

  @SerializedName("promoted_object_type")
  private PromotedObjectType promotedObjectType = null;

  @SerializedName("promoted_object_id")
  private String promotedObjectId = null;

  @SerializedName("page_type")
  private PageTypeRead pageType = null;

  @SerializedName("page_spec")
  private PageSpec pageSpec = null;

  @SerializedName("qq_mini_game_tracking_query_string")
  private String qqMiniGameTrackingQueryString = null;

  @SerializedName("deep_link_url")
  private String deepLinkUrl = null;

  @SerializedName("universal_link_url")
  private String universalLinkUrl = null;

  @SerializedName("profile_id")
  private Long profileId = null;

  @SerializedName("created_time")
  private Long createdTime = null;

  @SerializedName("last_modified_time")
  private Long lastModifiedTime = null;

  @SerializedName("share_content_spec")
  private ShareContentSpec shareContentSpec = null;

  @SerializedName("dynamic_adcreative_spec")
  private DynamicAdcreativeSpec dynamicAdcreativeSpec = null;

  @SerializedName("is_deleted")
  private Boolean isDeleted = null;

  @SerializedName("is_dynamic_creative")
  private Boolean isDynamicCreative = null;

  @SerializedName("component_id")
  private Long componentId = null;

  @SerializedName("online_enabled")
  private Boolean onlineEnabled = null;

  @SerializedName("revised_adcreative_spec")
  private RevisedAdcreativeSpec revisedAdcreativeSpec = null;

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

  @SerializedName("conversion_data_type")
  private ConversionDataType conversionDataType = null;

  @SerializedName("conversion_target_type")
  private ConversionTargetType conversionTargetType = null;

  @SerializedName("adcreative_template_id")
  private Long adcreativeTemplateId = null;

  @SerializedName("adcreative_elements")
  private AdcreativeCreativeElements adcreativeElements = null;

  public PreviewAdcreative adcreativeName(String adcreativeName) {
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

  public PreviewAdcreative siteSet(List<String> siteSet) {
    this.siteSet = siteSet;
    return this;
  }

  public PreviewAdcreative addSiteSetItem(String siteSetItem) {
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

  public PreviewAdcreative promotedObjectType(PromotedObjectType promotedObjectType) {
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

  public PreviewAdcreative promotedObjectId(String promotedObjectId) {
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

  public PreviewAdcreative pageType(PageTypeRead pageType) {
    this.pageType = pageType;
    return this;
  }

  /**
   * Get pageType
   *
   * @return pageType
   */
  @ApiModelProperty(value = "")
  public PageTypeRead getPageType() {
    return pageType;
  }

  public void setPageType(PageTypeRead pageType) {
    this.pageType = pageType;
  }

  public PreviewAdcreative pageSpec(PageSpec pageSpec) {
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

  public PreviewAdcreative qqMiniGameTrackingQueryString(String qqMiniGameTrackingQueryString) {
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

  public PreviewAdcreative deepLinkUrl(String deepLinkUrl) {
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

  public PreviewAdcreative universalLinkUrl(String universalLinkUrl) {
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

  public PreviewAdcreative profileId(Long profileId) {
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

  public PreviewAdcreative createdTime(Long createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   *
   * @return createdTime
   */
  @ApiModelProperty(value = "")
  public Long getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Long createdTime) {
    this.createdTime = createdTime;
  }

  public PreviewAdcreative lastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

  /**
   * Get lastModifiedTime
   *
   * @return lastModifiedTime
   */
  @ApiModelProperty(value = "")
  public Long getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public PreviewAdcreative shareContentSpec(ShareContentSpec shareContentSpec) {
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

  public PreviewAdcreative dynamicAdcreativeSpec(DynamicAdcreativeSpec dynamicAdcreativeSpec) {
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

  public PreviewAdcreative isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Get isDeleted
   *
   * @return isDeleted
   */
  @ApiModelProperty(value = "")
  public Boolean isIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public PreviewAdcreative isDynamicCreative(Boolean isDynamicCreative) {
    this.isDynamicCreative = isDynamicCreative;
    return this;
  }

  /**
   * Get isDynamicCreative
   *
   * @return isDynamicCreative
   */
  @ApiModelProperty(value = "")
  public Boolean isIsDynamicCreative() {
    return isDynamicCreative;
  }

  public void setIsDynamicCreative(Boolean isDynamicCreative) {
    this.isDynamicCreative = isDynamicCreative;
  }

  public PreviewAdcreative componentId(Long componentId) {
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

  public PreviewAdcreative onlineEnabled(Boolean onlineEnabled) {
    this.onlineEnabled = onlineEnabled;
    return this;
  }

  /**
   * Get onlineEnabled
   *
   * @return onlineEnabled
   */
  @ApiModelProperty(value = "")
  public Boolean isOnlineEnabled() {
    return onlineEnabled;
  }

  public void setOnlineEnabled(Boolean onlineEnabled) {
    this.onlineEnabled = onlineEnabled;
  }

  public PreviewAdcreative revisedAdcreativeSpec(RevisedAdcreativeSpec revisedAdcreativeSpec) {
    this.revisedAdcreativeSpec = revisedAdcreativeSpec;
    return this;
  }

  /**
   * Get revisedAdcreativeSpec
   *
   * @return revisedAdcreativeSpec
   */
  @ApiModelProperty(value = "")
  public RevisedAdcreativeSpec getRevisedAdcreativeSpec() {
    return revisedAdcreativeSpec;
  }

  public void setRevisedAdcreativeSpec(RevisedAdcreativeSpec revisedAdcreativeSpec) {
    this.revisedAdcreativeSpec = revisedAdcreativeSpec;
  }

  public PreviewAdcreative category(List<Long> category) {
    this.category = category;
    return this;
  }

  public PreviewAdcreative addCategoryItem(Long categoryItem) {
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

  public PreviewAdcreative label(List<String> label) {
    this.label = label;
    return this;
  }

  public PreviewAdcreative addLabelItem(String labelItem) {
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

  public PreviewAdcreative unionMarketSwitch(Boolean unionMarketSwitch) {
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

  public PreviewAdcreative playablePageMaterialId(String playablePageMaterialId) {
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

  public PreviewAdcreative videoEndPage(VideoEndPageSpec videoEndPage) {
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

  public PreviewAdcreative feedsVideoCommentSwitch(Boolean feedsVideoCommentSwitch) {
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

  public PreviewAdcreative conversionDataType(ConversionDataType conversionDataType) {
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

  public PreviewAdcreative conversionTargetType(ConversionTargetType conversionTargetType) {
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

  public PreviewAdcreative adcreativeTemplateId(Long adcreativeTemplateId) {
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

  public PreviewAdcreative adcreativeElements(AdcreativeCreativeElements adcreativeElements) {
    this.adcreativeElements = adcreativeElements;
    return this;
  }

  /**
   * Get adcreativeElements
   *
   * @return adcreativeElements
   */
  @ApiModelProperty(value = "")
  public AdcreativeCreativeElements getAdcreativeElements() {
    return adcreativeElements;
  }

  public void setAdcreativeElements(AdcreativeCreativeElements adcreativeElements) {
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
    PreviewAdcreative previewAdcreative = (PreviewAdcreative) o;
    return Objects.equals(this.adcreativeName, previewAdcreative.adcreativeName)
        && Objects.equals(this.siteSet, previewAdcreative.siteSet)
        && Objects.equals(this.promotedObjectType, previewAdcreative.promotedObjectType)
        && Objects.equals(this.promotedObjectId, previewAdcreative.promotedObjectId)
        && Objects.equals(this.pageType, previewAdcreative.pageType)
        && Objects.equals(this.pageSpec, previewAdcreative.pageSpec)
        && Objects.equals(
            this.qqMiniGameTrackingQueryString, previewAdcreative.qqMiniGameTrackingQueryString)
        && Objects.equals(this.deepLinkUrl, previewAdcreative.deepLinkUrl)
        && Objects.equals(this.universalLinkUrl, previewAdcreative.universalLinkUrl)
        && Objects.equals(this.profileId, previewAdcreative.profileId)
        && Objects.equals(this.createdTime, previewAdcreative.createdTime)
        && Objects.equals(this.lastModifiedTime, previewAdcreative.lastModifiedTime)
        && Objects.equals(this.shareContentSpec, previewAdcreative.shareContentSpec)
        && Objects.equals(this.dynamicAdcreativeSpec, previewAdcreative.dynamicAdcreativeSpec)
        && Objects.equals(this.isDeleted, previewAdcreative.isDeleted)
        && Objects.equals(this.isDynamicCreative, previewAdcreative.isDynamicCreative)
        && Objects.equals(this.componentId, previewAdcreative.componentId)
        && Objects.equals(this.onlineEnabled, previewAdcreative.onlineEnabled)
        && Objects.equals(this.revisedAdcreativeSpec, previewAdcreative.revisedAdcreativeSpec)
        && Objects.equals(this.category, previewAdcreative.category)
        && Objects.equals(this.label, previewAdcreative.label)
        && Objects.equals(this.unionMarketSwitch, previewAdcreative.unionMarketSwitch)
        && Objects.equals(this.playablePageMaterialId, previewAdcreative.playablePageMaterialId)
        && Objects.equals(this.videoEndPage, previewAdcreative.videoEndPage)
        && Objects.equals(this.feedsVideoCommentSwitch, previewAdcreative.feedsVideoCommentSwitch)
        && Objects.equals(this.conversionDataType, previewAdcreative.conversionDataType)
        && Objects.equals(this.conversionTargetType, previewAdcreative.conversionTargetType)
        && Objects.equals(this.adcreativeTemplateId, previewAdcreative.adcreativeTemplateId)
        && Objects.equals(this.adcreativeElements, previewAdcreative.adcreativeElements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        adcreativeName,
        siteSet,
        promotedObjectType,
        promotedObjectId,
        pageType,
        pageSpec,
        qqMiniGameTrackingQueryString,
        deepLinkUrl,
        universalLinkUrl,
        profileId,
        createdTime,
        lastModifiedTime,
        shareContentSpec,
        dynamicAdcreativeSpec,
        isDeleted,
        isDynamicCreative,
        componentId,
        onlineEnabled,
        revisedAdcreativeSpec,
        category,
        label,
        unionMarketSwitch,
        playablePageMaterialId,
        videoEndPage,
        feedsVideoCommentSwitch,
        conversionDataType,
        conversionTargetType,
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

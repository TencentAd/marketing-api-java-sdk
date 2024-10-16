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
import java.util.Objects;

/** 返回结构 */
@ApiModel(description = "返回结构")
public class ConversionsGetListStruct {
  @SerializedName("conversion_id")
  private Long conversionId = null;

  @SerializedName("conversion_name")
  private String conversionName = null;

  @SerializedName("access_type")
  private AccessType accessType = null;

  @SerializedName("claim_type")
  private ClaimType claimType = null;

  @SerializedName("feedback_url")
  private String feedbackUrl = null;

  @SerializedName("self_attributed")
  private Boolean selfAttributed = null;

  @SerializedName("optimization_goal")
  private IntOptimizationGoal optimizationGoal = null;

  @SerializedName("deep_behavior_optimization_goal")
  private IntOptimizationGoal deepBehaviorOptimizationGoal = null;

  @SerializedName("deep_worth_optimization_goal")
  private ConversionOptimizationGoal deepWorthOptimizationGoal = null;

  @SerializedName("user_action_set_id")
  private Long userActionSetId = null;

  @SerializedName("user_action_set_key")
  private String userActionSetKey = null;

  @SerializedName("site_set_enable")
  private Boolean siteSetEnable = null;

  @SerializedName("is_deleted")
  private Boolean isDeleted = null;

  @SerializedName("access_status")
  private AccessStatus accessStatus = null;

  @SerializedName("create_source_type")
  private CreateSourceType createSourceType = null;

  @SerializedName("app_android_channel_package_id")
  private String appAndroidChannelPackageId = null;

  @SerializedName("promoted_object_id")
  private String promotedObjectId = null;

  @SerializedName("conversion_scene")
  private ConversionScene conversionScene = null;

  @SerializedName("owner_id")
  private Long ownerId = null;

  @SerializedName("deep_worth_advanced_goal")
  private ConversionOptimizationGoal deepWorthAdvancedGoal = null;

  @SerializedName("conversion_link_id")
  private Long conversionLinkId = null;

  @SerializedName("impression_feedback_url")
  private String impressionFeedbackUrl = null;

  @SerializedName("attribution_window")
  private Long attributionWindow = null;

  @SerializedName("deep_behavior_advanced_goal")
  private IntOptimizationGoal deepBehaviorAdvancedGoal = null;

  @SerializedName("deep_behavior_advanced_goal_min_price")
  private Long deepBehaviorAdvancedGoalMinPrice = null;

  @SerializedName("deep_behavior_advanced_goal_max_price")
  private Long deepBehaviorAdvancedGoalMaxPrice = null;

  @SerializedName("deep_optimization_goal_type")
  private DeepOptimizationGoalType deepOptimizationGoalType = null;

  @SerializedName("forward_link_assist")
  private IntOptimizationGoal forwardLinkAssist = null;

  @SerializedName("incubation_optimization_goal")
  private IntOptimizationGoal incubationOptimizationGoal = null;

  @SerializedName("disable_message")
  private String disableMessage = null;

  @SerializedName("inspection_free_switch")
  private Boolean inspectionFreeSwitch = null;

  public ConversionsGetListStruct conversionId(Long conversionId) {
    this.conversionId = conversionId;
    return this;
  }

  /**
   * Get conversionId
   *
   * @return conversionId
   */
  @ApiModelProperty(value = "")
  public Long getConversionId() {
    return conversionId;
  }

  public void setConversionId(Long conversionId) {
    this.conversionId = conversionId;
  }

  public ConversionsGetListStruct conversionName(String conversionName) {
    this.conversionName = conversionName;
    return this;
  }

  /**
   * Get conversionName
   *
   * @return conversionName
   */
  @ApiModelProperty(value = "")
  public String getConversionName() {
    return conversionName;
  }

  public void setConversionName(String conversionName) {
    this.conversionName = conversionName;
  }

  public ConversionsGetListStruct accessType(AccessType accessType) {
    this.accessType = accessType;
    return this;
  }

  /**
   * Get accessType
   *
   * @return accessType
   */
  @ApiModelProperty(value = "")
  public AccessType getAccessType() {
    return accessType;
  }

  public void setAccessType(AccessType accessType) {
    this.accessType = accessType;
  }

  public ConversionsGetListStruct claimType(ClaimType claimType) {
    this.claimType = claimType;
    return this;
  }

  /**
   * Get claimType
   *
   * @return claimType
   */
  @ApiModelProperty(value = "")
  public ClaimType getClaimType() {
    return claimType;
  }

  public void setClaimType(ClaimType claimType) {
    this.claimType = claimType;
  }

  public ConversionsGetListStruct feedbackUrl(String feedbackUrl) {
    this.feedbackUrl = feedbackUrl;
    return this;
  }

  /**
   * Get feedbackUrl
   *
   * @return feedbackUrl
   */
  @ApiModelProperty(value = "")
  public String getFeedbackUrl() {
    return feedbackUrl;
  }

  public void setFeedbackUrl(String feedbackUrl) {
    this.feedbackUrl = feedbackUrl;
  }

  public ConversionsGetListStruct selfAttributed(Boolean selfAttributed) {
    this.selfAttributed = selfAttributed;
    return this;
  }

  /**
   * Get selfAttributed
   *
   * @return selfAttributed
   */
  @ApiModelProperty(value = "")
  public Boolean isSelfAttributed() {
    return selfAttributed;
  }

  public void setSelfAttributed(Boolean selfAttributed) {
    this.selfAttributed = selfAttributed;
  }

  public ConversionsGetListStruct optimizationGoal(IntOptimizationGoal optimizationGoal) {
    this.optimizationGoal = optimizationGoal;
    return this;
  }

  /**
   * Get optimizationGoal
   *
   * @return optimizationGoal
   */
  @ApiModelProperty(value = "")
  public IntOptimizationGoal getOptimizationGoal() {
    return optimizationGoal;
  }

  public void setOptimizationGoal(IntOptimizationGoal optimizationGoal) {
    this.optimizationGoal = optimizationGoal;
  }

  public ConversionsGetListStruct deepBehaviorOptimizationGoal(
      IntOptimizationGoal deepBehaviorOptimizationGoal) {
    this.deepBehaviorOptimizationGoal = deepBehaviorOptimizationGoal;
    return this;
  }

  /**
   * Get deepBehaviorOptimizationGoal
   *
   * @return deepBehaviorOptimizationGoal
   */
  @ApiModelProperty(value = "")
  public IntOptimizationGoal getDeepBehaviorOptimizationGoal() {
    return deepBehaviorOptimizationGoal;
  }

  public void setDeepBehaviorOptimizationGoal(IntOptimizationGoal deepBehaviorOptimizationGoal) {
    this.deepBehaviorOptimizationGoal = deepBehaviorOptimizationGoal;
  }

  public ConversionsGetListStruct deepWorthOptimizationGoal(
      ConversionOptimizationGoal deepWorthOptimizationGoal) {
    this.deepWorthOptimizationGoal = deepWorthOptimizationGoal;
    return this;
  }

  /**
   * Get deepWorthOptimizationGoal
   *
   * @return deepWorthOptimizationGoal
   */
  @ApiModelProperty(value = "")
  public ConversionOptimizationGoal getDeepWorthOptimizationGoal() {
    return deepWorthOptimizationGoal;
  }

  public void setDeepWorthOptimizationGoal(ConversionOptimizationGoal deepWorthOptimizationGoal) {
    this.deepWorthOptimizationGoal = deepWorthOptimizationGoal;
  }

  public ConversionsGetListStruct userActionSetId(Long userActionSetId) {
    this.userActionSetId = userActionSetId;
    return this;
  }

  /**
   * Get userActionSetId
   *
   * @return userActionSetId
   */
  @ApiModelProperty(value = "")
  public Long getUserActionSetId() {
    return userActionSetId;
  }

  public void setUserActionSetId(Long userActionSetId) {
    this.userActionSetId = userActionSetId;
  }

  public ConversionsGetListStruct userActionSetKey(String userActionSetKey) {
    this.userActionSetKey = userActionSetKey;
    return this;
  }

  /**
   * Get userActionSetKey
   *
   * @return userActionSetKey
   */
  @ApiModelProperty(value = "")
  public String getUserActionSetKey() {
    return userActionSetKey;
  }

  public void setUserActionSetKey(String userActionSetKey) {
    this.userActionSetKey = userActionSetKey;
  }

  public ConversionsGetListStruct siteSetEnable(Boolean siteSetEnable) {
    this.siteSetEnable = siteSetEnable;
    return this;
  }

  /**
   * Get siteSetEnable
   *
   * @return siteSetEnable
   */
  @ApiModelProperty(value = "")
  public Boolean isSiteSetEnable() {
    return siteSetEnable;
  }

  public void setSiteSetEnable(Boolean siteSetEnable) {
    this.siteSetEnable = siteSetEnable;
  }

  public ConversionsGetListStruct isDeleted(Boolean isDeleted) {
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

  public ConversionsGetListStruct accessStatus(AccessStatus accessStatus) {
    this.accessStatus = accessStatus;
    return this;
  }

  /**
   * Get accessStatus
   *
   * @return accessStatus
   */
  @ApiModelProperty(value = "")
  public AccessStatus getAccessStatus() {
    return accessStatus;
  }

  public void setAccessStatus(AccessStatus accessStatus) {
    this.accessStatus = accessStatus;
  }

  public ConversionsGetListStruct createSourceType(CreateSourceType createSourceType) {
    this.createSourceType = createSourceType;
    return this;
  }

  /**
   * Get createSourceType
   *
   * @return createSourceType
   */
  @ApiModelProperty(value = "")
  public CreateSourceType getCreateSourceType() {
    return createSourceType;
  }

  public void setCreateSourceType(CreateSourceType createSourceType) {
    this.createSourceType = createSourceType;
  }

  public ConversionsGetListStruct appAndroidChannelPackageId(String appAndroidChannelPackageId) {
    this.appAndroidChannelPackageId = appAndroidChannelPackageId;
    return this;
  }

  /**
   * Get appAndroidChannelPackageId
   *
   * @return appAndroidChannelPackageId
   */
  @ApiModelProperty(value = "")
  public String getAppAndroidChannelPackageId() {
    return appAndroidChannelPackageId;
  }

  public void setAppAndroidChannelPackageId(String appAndroidChannelPackageId) {
    this.appAndroidChannelPackageId = appAndroidChannelPackageId;
  }

  public ConversionsGetListStruct promotedObjectId(String promotedObjectId) {
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

  public ConversionsGetListStruct conversionScene(ConversionScene conversionScene) {
    this.conversionScene = conversionScene;
    return this;
  }

  /**
   * Get conversionScene
   *
   * @return conversionScene
   */
  @ApiModelProperty(value = "")
  public ConversionScene getConversionScene() {
    return conversionScene;
  }

  public void setConversionScene(ConversionScene conversionScene) {
    this.conversionScene = conversionScene;
  }

  public ConversionsGetListStruct ownerId(Long ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * Get ownerId
   *
   * @return ownerId
   */
  @ApiModelProperty(value = "")
  public Long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }

  public ConversionsGetListStruct deepWorthAdvancedGoal(
      ConversionOptimizationGoal deepWorthAdvancedGoal) {
    this.deepWorthAdvancedGoal = deepWorthAdvancedGoal;
    return this;
  }

  /**
   * Get deepWorthAdvancedGoal
   *
   * @return deepWorthAdvancedGoal
   */
  @ApiModelProperty(value = "")
  public ConversionOptimizationGoal getDeepWorthAdvancedGoal() {
    return deepWorthAdvancedGoal;
  }

  public void setDeepWorthAdvancedGoal(ConversionOptimizationGoal deepWorthAdvancedGoal) {
    this.deepWorthAdvancedGoal = deepWorthAdvancedGoal;
  }

  public ConversionsGetListStruct conversionLinkId(Long conversionLinkId) {
    this.conversionLinkId = conversionLinkId;
    return this;
  }

  /**
   * Get conversionLinkId
   *
   * @return conversionLinkId
   */
  @ApiModelProperty(value = "")
  public Long getConversionLinkId() {
    return conversionLinkId;
  }

  public void setConversionLinkId(Long conversionLinkId) {
    this.conversionLinkId = conversionLinkId;
  }

  public ConversionsGetListStruct impressionFeedbackUrl(String impressionFeedbackUrl) {
    this.impressionFeedbackUrl = impressionFeedbackUrl;
    return this;
  }

  /**
   * Get impressionFeedbackUrl
   *
   * @return impressionFeedbackUrl
   */
  @ApiModelProperty(value = "")
  public String getImpressionFeedbackUrl() {
    return impressionFeedbackUrl;
  }

  public void setImpressionFeedbackUrl(String impressionFeedbackUrl) {
    this.impressionFeedbackUrl = impressionFeedbackUrl;
  }

  public ConversionsGetListStruct attributionWindow(Long attributionWindow) {
    this.attributionWindow = attributionWindow;
    return this;
  }

  /**
   * Get attributionWindow
   *
   * @return attributionWindow
   */
  @ApiModelProperty(value = "")
  public Long getAttributionWindow() {
    return attributionWindow;
  }

  public void setAttributionWindow(Long attributionWindow) {
    this.attributionWindow = attributionWindow;
  }

  public ConversionsGetListStruct deepBehaviorAdvancedGoal(
      IntOptimizationGoal deepBehaviorAdvancedGoal) {
    this.deepBehaviorAdvancedGoal = deepBehaviorAdvancedGoal;
    return this;
  }

  /**
   * Get deepBehaviorAdvancedGoal
   *
   * @return deepBehaviorAdvancedGoal
   */
  @ApiModelProperty(value = "")
  public IntOptimizationGoal getDeepBehaviorAdvancedGoal() {
    return deepBehaviorAdvancedGoal;
  }

  public void setDeepBehaviorAdvancedGoal(IntOptimizationGoal deepBehaviorAdvancedGoal) {
    this.deepBehaviorAdvancedGoal = deepBehaviorAdvancedGoal;
  }

  public ConversionsGetListStruct deepBehaviorAdvancedGoalMinPrice(
      Long deepBehaviorAdvancedGoalMinPrice) {
    this.deepBehaviorAdvancedGoalMinPrice = deepBehaviorAdvancedGoalMinPrice;
    return this;
  }

  /**
   * Get deepBehaviorAdvancedGoalMinPrice
   *
   * @return deepBehaviorAdvancedGoalMinPrice
   */
  @ApiModelProperty(value = "")
  public Long getDeepBehaviorAdvancedGoalMinPrice() {
    return deepBehaviorAdvancedGoalMinPrice;
  }

  public void setDeepBehaviorAdvancedGoalMinPrice(Long deepBehaviorAdvancedGoalMinPrice) {
    this.deepBehaviorAdvancedGoalMinPrice = deepBehaviorAdvancedGoalMinPrice;
  }

  public ConversionsGetListStruct deepBehaviorAdvancedGoalMaxPrice(
      Long deepBehaviorAdvancedGoalMaxPrice) {
    this.deepBehaviorAdvancedGoalMaxPrice = deepBehaviorAdvancedGoalMaxPrice;
    return this;
  }

  /**
   * Get deepBehaviorAdvancedGoalMaxPrice
   *
   * @return deepBehaviorAdvancedGoalMaxPrice
   */
  @ApiModelProperty(value = "")
  public Long getDeepBehaviorAdvancedGoalMaxPrice() {
    return deepBehaviorAdvancedGoalMaxPrice;
  }

  public void setDeepBehaviorAdvancedGoalMaxPrice(Long deepBehaviorAdvancedGoalMaxPrice) {
    this.deepBehaviorAdvancedGoalMaxPrice = deepBehaviorAdvancedGoalMaxPrice;
  }

  public ConversionsGetListStruct deepOptimizationGoalType(
      DeepOptimizationGoalType deepOptimizationGoalType) {
    this.deepOptimizationGoalType = deepOptimizationGoalType;
    return this;
  }

  /**
   * Get deepOptimizationGoalType
   *
   * @return deepOptimizationGoalType
   */
  @ApiModelProperty(value = "")
  public DeepOptimizationGoalType getDeepOptimizationGoalType() {
    return deepOptimizationGoalType;
  }

  public void setDeepOptimizationGoalType(DeepOptimizationGoalType deepOptimizationGoalType) {
    this.deepOptimizationGoalType = deepOptimizationGoalType;
  }

  public ConversionsGetListStruct forwardLinkAssist(IntOptimizationGoal forwardLinkAssist) {
    this.forwardLinkAssist = forwardLinkAssist;
    return this;
  }

  /**
   * Get forwardLinkAssist
   *
   * @return forwardLinkAssist
   */
  @ApiModelProperty(value = "")
  public IntOptimizationGoal getForwardLinkAssist() {
    return forwardLinkAssist;
  }

  public void setForwardLinkAssist(IntOptimizationGoal forwardLinkAssist) {
    this.forwardLinkAssist = forwardLinkAssist;
  }

  public ConversionsGetListStruct incubationOptimizationGoal(
      IntOptimizationGoal incubationOptimizationGoal) {
    this.incubationOptimizationGoal = incubationOptimizationGoal;
    return this;
  }

  /**
   * Get incubationOptimizationGoal
   *
   * @return incubationOptimizationGoal
   */
  @ApiModelProperty(value = "")
  public IntOptimizationGoal getIncubationOptimizationGoal() {
    return incubationOptimizationGoal;
  }

  public void setIncubationOptimizationGoal(IntOptimizationGoal incubationOptimizationGoal) {
    this.incubationOptimizationGoal = incubationOptimizationGoal;
  }

  public ConversionsGetListStruct disableMessage(String disableMessage) {
    this.disableMessage = disableMessage;
    return this;
  }

  /**
   * Get disableMessage
   *
   * @return disableMessage
   */
  @ApiModelProperty(value = "")
  public String getDisableMessage() {
    return disableMessage;
  }

  public void setDisableMessage(String disableMessage) {
    this.disableMessage = disableMessage;
  }

  public ConversionsGetListStruct inspectionFreeSwitch(Boolean inspectionFreeSwitch) {
    this.inspectionFreeSwitch = inspectionFreeSwitch;
    return this;
  }

  /**
   * Get inspectionFreeSwitch
   *
   * @return inspectionFreeSwitch
   */
  @ApiModelProperty(value = "")
  public Boolean isInspectionFreeSwitch() {
    return inspectionFreeSwitch;
  }

  public void setInspectionFreeSwitch(Boolean inspectionFreeSwitch) {
    this.inspectionFreeSwitch = inspectionFreeSwitch;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionsGetListStruct conversionsGetListStruct = (ConversionsGetListStruct) o;
    return Objects.equals(this.conversionId, conversionsGetListStruct.conversionId)
        && Objects.equals(this.conversionName, conversionsGetListStruct.conversionName)
        && Objects.equals(this.accessType, conversionsGetListStruct.accessType)
        && Objects.equals(this.claimType, conversionsGetListStruct.claimType)
        && Objects.equals(this.feedbackUrl, conversionsGetListStruct.feedbackUrl)
        && Objects.equals(this.selfAttributed, conversionsGetListStruct.selfAttributed)
        && Objects.equals(this.optimizationGoal, conversionsGetListStruct.optimizationGoal)
        && Objects.equals(
            this.deepBehaviorOptimizationGoal,
            conversionsGetListStruct.deepBehaviorOptimizationGoal)
        && Objects.equals(
            this.deepWorthOptimizationGoal, conversionsGetListStruct.deepWorthOptimizationGoal)
        && Objects.equals(this.userActionSetId, conversionsGetListStruct.userActionSetId)
        && Objects.equals(this.userActionSetKey, conversionsGetListStruct.userActionSetKey)
        && Objects.equals(this.siteSetEnable, conversionsGetListStruct.siteSetEnable)
        && Objects.equals(this.isDeleted, conversionsGetListStruct.isDeleted)
        && Objects.equals(this.accessStatus, conversionsGetListStruct.accessStatus)
        && Objects.equals(this.createSourceType, conversionsGetListStruct.createSourceType)
        && Objects.equals(
            this.appAndroidChannelPackageId, conversionsGetListStruct.appAndroidChannelPackageId)
        && Objects.equals(this.promotedObjectId, conversionsGetListStruct.promotedObjectId)
        && Objects.equals(this.conversionScene, conversionsGetListStruct.conversionScene)
        && Objects.equals(this.ownerId, conversionsGetListStruct.ownerId)
        && Objects.equals(
            this.deepWorthAdvancedGoal, conversionsGetListStruct.deepWorthAdvancedGoal)
        && Objects.equals(this.conversionLinkId, conversionsGetListStruct.conversionLinkId)
        && Objects.equals(
            this.impressionFeedbackUrl, conversionsGetListStruct.impressionFeedbackUrl)
        && Objects.equals(this.attributionWindow, conversionsGetListStruct.attributionWindow)
        && Objects.equals(
            this.deepBehaviorAdvancedGoal, conversionsGetListStruct.deepBehaviorAdvancedGoal)
        && Objects.equals(
            this.deepBehaviorAdvancedGoalMinPrice,
            conversionsGetListStruct.deepBehaviorAdvancedGoalMinPrice)
        && Objects.equals(
            this.deepBehaviorAdvancedGoalMaxPrice,
            conversionsGetListStruct.deepBehaviorAdvancedGoalMaxPrice)
        && Objects.equals(
            this.deepOptimizationGoalType, conversionsGetListStruct.deepOptimizationGoalType)
        && Objects.equals(this.forwardLinkAssist, conversionsGetListStruct.forwardLinkAssist)
        && Objects.equals(
            this.incubationOptimizationGoal, conversionsGetListStruct.incubationOptimizationGoal)
        && Objects.equals(this.disableMessage, conversionsGetListStruct.disableMessage)
        && Objects.equals(this.inspectionFreeSwitch, conversionsGetListStruct.inspectionFreeSwitch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        conversionId,
        conversionName,
        accessType,
        claimType,
        feedbackUrl,
        selfAttributed,
        optimizationGoal,
        deepBehaviorOptimizationGoal,
        deepWorthOptimizationGoal,
        userActionSetId,
        userActionSetKey,
        siteSetEnable,
        isDeleted,
        accessStatus,
        createSourceType,
        appAndroidChannelPackageId,
        promotedObjectId,
        conversionScene,
        ownerId,
        deepWorthAdvancedGoal,
        conversionLinkId,
        impressionFeedbackUrl,
        attributionWindow,
        deepBehaviorAdvancedGoal,
        deepBehaviorAdvancedGoalMinPrice,
        deepBehaviorAdvancedGoalMaxPrice,
        deepOptimizationGoalType,
        forwardLinkAssist,
        incubationOptimizationGoal,
        disableMessage,
        inspectionFreeSwitch);
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

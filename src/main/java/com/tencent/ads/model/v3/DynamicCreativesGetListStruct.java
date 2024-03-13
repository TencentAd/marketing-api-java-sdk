/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 3.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.tencent.ads.model.v3;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** 返回结构 */
@ApiModel(description = "返回结构")
public class DynamicCreativesGetListStruct {
  @SerializedName("adgroup_id")
  private Long adgroupId = null;

  @SerializedName("dynamic_creative_id")
  private Long dynamicCreativeId = null;

  @SerializedName("dynamic_creative_name")
  private String dynamicCreativeName = null;

  @SerializedName("creative_template_id")
  private Long creativeTemplateId = null;

  @SerializedName("delivery_mode")
  private DeliveryMode deliveryMode = null;

  @SerializedName("dynamic_creative_type")
  private DynamicCreativeType dynamicCreativeType = null;

  @SerializedName("creative_components")
  private CreativeComponents creativeComponents = null;

  @SerializedName("impression_tracking_url")
  private String impressionTrackingUrl = null;

  @SerializedName("click_tracking_url")
  private String clickTrackingUrl = null;

  @SerializedName("page_track_url")
  private String pageTrackUrl = null;

  @SerializedName("configured_status")
  private ConfiguredStatus configuredStatus = null;

  @SerializedName("enable_breakthrough_siteset")
  private Boolean enableBreakthroughSiteset = null;

  @SerializedName("is_deleted")
  private Boolean isDeleted = null;

  @SerializedName("system_status")
  private DynamicCreativeStatus systemStatus = null;

  @SerializedName("created_time")
  private Long createdTime = null;

  @SerializedName("last_modified_time")
  private Long lastModifiedTime = null;

  @SerializedName("dynamic_creative_status_info")
  private List<DcInfoStruct> dynamicCreativeStatusInfo = null;

  @SerializedName("system_status_explanation")
  private String systemStatusExplanation = null;

  @SerializedName("marketing_asset_verification")
  private MarketingAssetVerification marketingAssetVerification = null;

  public DynamicCreativesGetListStruct adgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
    return this;
  }

  /**
   * Get adgroupId
   *
   * @return adgroupId
   */
  @ApiModelProperty(value = "")
  public Long getAdgroupId() {
    return adgroupId;
  }

  public void setAdgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
  }

  public DynamicCreativesGetListStruct dynamicCreativeId(Long dynamicCreativeId) {
    this.dynamicCreativeId = dynamicCreativeId;
    return this;
  }

  /**
   * Get dynamicCreativeId
   *
   * @return dynamicCreativeId
   */
  @ApiModelProperty(value = "")
  public Long getDynamicCreativeId() {
    return dynamicCreativeId;
  }

  public void setDynamicCreativeId(Long dynamicCreativeId) {
    this.dynamicCreativeId = dynamicCreativeId;
  }

  public DynamicCreativesGetListStruct dynamicCreativeName(String dynamicCreativeName) {
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

  public DynamicCreativesGetListStruct creativeTemplateId(Long creativeTemplateId) {
    this.creativeTemplateId = creativeTemplateId;
    return this;
  }

  /**
   * Get creativeTemplateId
   *
   * @return creativeTemplateId
   */
  @ApiModelProperty(value = "")
  public Long getCreativeTemplateId() {
    return creativeTemplateId;
  }

  public void setCreativeTemplateId(Long creativeTemplateId) {
    this.creativeTemplateId = creativeTemplateId;
  }

  public DynamicCreativesGetListStruct deliveryMode(DeliveryMode deliveryMode) {
    this.deliveryMode = deliveryMode;
    return this;
  }

  /**
   * Get deliveryMode
   *
   * @return deliveryMode
   */
  @ApiModelProperty(value = "")
  public DeliveryMode getDeliveryMode() {
    return deliveryMode;
  }

  public void setDeliveryMode(DeliveryMode deliveryMode) {
    this.deliveryMode = deliveryMode;
  }

  public DynamicCreativesGetListStruct dynamicCreativeType(
      DynamicCreativeType dynamicCreativeType) {
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

  public DynamicCreativesGetListStruct creativeComponents(CreativeComponents creativeComponents) {
    this.creativeComponents = creativeComponents;
    return this;
  }

  /**
   * Get creativeComponents
   *
   * @return creativeComponents
   */
  @ApiModelProperty(value = "")
  public CreativeComponents getCreativeComponents() {
    return creativeComponents;
  }

  public void setCreativeComponents(CreativeComponents creativeComponents) {
    this.creativeComponents = creativeComponents;
  }

  public DynamicCreativesGetListStruct impressionTrackingUrl(String impressionTrackingUrl) {
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

  public DynamicCreativesGetListStruct clickTrackingUrl(String clickTrackingUrl) {
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

  public DynamicCreativesGetListStruct pageTrackUrl(String pageTrackUrl) {
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

  public DynamicCreativesGetListStruct configuredStatus(ConfiguredStatus configuredStatus) {
    this.configuredStatus = configuredStatus;
    return this;
  }

  /**
   * Get configuredStatus
   *
   * @return configuredStatus
   */
  @ApiModelProperty(value = "")
  public ConfiguredStatus getConfiguredStatus() {
    return configuredStatus;
  }

  public void setConfiguredStatus(ConfiguredStatus configuredStatus) {
    this.configuredStatus = configuredStatus;
  }

  public DynamicCreativesGetListStruct enableBreakthroughSiteset(
      Boolean enableBreakthroughSiteset) {
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

  public DynamicCreativesGetListStruct isDeleted(Boolean isDeleted) {
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

  public DynamicCreativesGetListStruct systemStatus(DynamicCreativeStatus systemStatus) {
    this.systemStatus = systemStatus;
    return this;
  }

  /**
   * Get systemStatus
   *
   * @return systemStatus
   */
  @ApiModelProperty(value = "")
  public DynamicCreativeStatus getSystemStatus() {
    return systemStatus;
  }

  public void setSystemStatus(DynamicCreativeStatus systemStatus) {
    this.systemStatus = systemStatus;
  }

  public DynamicCreativesGetListStruct createdTime(Long createdTime) {
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

  public DynamicCreativesGetListStruct lastModifiedTime(Long lastModifiedTime) {
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

  public DynamicCreativesGetListStruct dynamicCreativeStatusInfo(
      List<DcInfoStruct> dynamicCreativeStatusInfo) {
    this.dynamicCreativeStatusInfo = dynamicCreativeStatusInfo;
    return this;
  }

  public DynamicCreativesGetListStruct addDynamicCreativeStatusInfoItem(
      DcInfoStruct dynamicCreativeStatusInfoItem) {
    if (this.dynamicCreativeStatusInfo == null) {
      this.dynamicCreativeStatusInfo = new ArrayList<DcInfoStruct>();
    }
    this.dynamicCreativeStatusInfo.add(dynamicCreativeStatusInfoItem);
    return this;
  }

  /**
   * Get dynamicCreativeStatusInfo
   *
   * @return dynamicCreativeStatusInfo
   */
  @ApiModelProperty(value = "")
  public List<DcInfoStruct> getDynamicCreativeStatusInfo() {
    return dynamicCreativeStatusInfo;
  }

  public void setDynamicCreativeStatusInfo(List<DcInfoStruct> dynamicCreativeStatusInfo) {
    this.dynamicCreativeStatusInfo = dynamicCreativeStatusInfo;
  }

  public DynamicCreativesGetListStruct systemStatusExplanation(String systemStatusExplanation) {
    this.systemStatusExplanation = systemStatusExplanation;
    return this;
  }

  /**
   * Get systemStatusExplanation
   *
   * @return systemStatusExplanation
   */
  @ApiModelProperty(value = "")
  public String getSystemStatusExplanation() {
    return systemStatusExplanation;
  }

  public void setSystemStatusExplanation(String systemStatusExplanation) {
    this.systemStatusExplanation = systemStatusExplanation;
  }

  public DynamicCreativesGetListStruct marketingAssetVerification(
      MarketingAssetVerification marketingAssetVerification) {
    this.marketingAssetVerification = marketingAssetVerification;
    return this;
  }

  /**
   * Get marketingAssetVerification
   *
   * @return marketingAssetVerification
   */
  @ApiModelProperty(value = "")
  public MarketingAssetVerification getMarketingAssetVerification() {
    return marketingAssetVerification;
  }

  public void setMarketingAssetVerification(MarketingAssetVerification marketingAssetVerification) {
    this.marketingAssetVerification = marketingAssetVerification;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicCreativesGetListStruct dynamicCreativesGetListStruct = (DynamicCreativesGetListStruct) o;
    return Objects.equals(this.adgroupId, dynamicCreativesGetListStruct.adgroupId)
        && Objects.equals(this.dynamicCreativeId, dynamicCreativesGetListStruct.dynamicCreativeId)
        && Objects.equals(
            this.dynamicCreativeName, dynamicCreativesGetListStruct.dynamicCreativeName)
        && Objects.equals(this.creativeTemplateId, dynamicCreativesGetListStruct.creativeTemplateId)
        && Objects.equals(this.deliveryMode, dynamicCreativesGetListStruct.deliveryMode)
        && Objects.equals(
            this.dynamicCreativeType, dynamicCreativesGetListStruct.dynamicCreativeType)
        && Objects.equals(this.creativeComponents, dynamicCreativesGetListStruct.creativeComponents)
        && Objects.equals(
            this.impressionTrackingUrl, dynamicCreativesGetListStruct.impressionTrackingUrl)
        && Objects.equals(this.clickTrackingUrl, dynamicCreativesGetListStruct.clickTrackingUrl)
        && Objects.equals(this.pageTrackUrl, dynamicCreativesGetListStruct.pageTrackUrl)
        && Objects.equals(this.configuredStatus, dynamicCreativesGetListStruct.configuredStatus)
        && Objects.equals(
            this.enableBreakthroughSiteset, dynamicCreativesGetListStruct.enableBreakthroughSiteset)
        && Objects.equals(this.isDeleted, dynamicCreativesGetListStruct.isDeleted)
        && Objects.equals(this.systemStatus, dynamicCreativesGetListStruct.systemStatus)
        && Objects.equals(this.createdTime, dynamicCreativesGetListStruct.createdTime)
        && Objects.equals(this.lastModifiedTime, dynamicCreativesGetListStruct.lastModifiedTime)
        && Objects.equals(
            this.dynamicCreativeStatusInfo, dynamicCreativesGetListStruct.dynamicCreativeStatusInfo)
        && Objects.equals(
            this.systemStatusExplanation, dynamicCreativesGetListStruct.systemStatusExplanation)
        && Objects.equals(
            this.marketingAssetVerification,
            dynamicCreativesGetListStruct.marketingAssetVerification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        adgroupId,
        dynamicCreativeId,
        dynamicCreativeName,
        creativeTemplateId,
        deliveryMode,
        dynamicCreativeType,
        creativeComponents,
        impressionTrackingUrl,
        clickTrackingUrl,
        pageTrackUrl,
        configuredStatus,
        enableBreakthroughSiteset,
        isDeleted,
        systemStatus,
        createdTime,
        lastModifiedTime,
        dynamicCreativeStatusInfo,
        systemStatusExplanation,
        marketingAssetVerification);
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

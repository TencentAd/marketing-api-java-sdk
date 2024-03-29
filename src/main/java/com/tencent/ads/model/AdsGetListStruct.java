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

/** 返回结构 */
@ApiModel(description = "返回结构")
public class AdsGetListStruct {
  @SerializedName("campaign_id")
  private Long campaignId = null;

  @SerializedName("adgroup_id")
  private Long adgroupId = null;

  @SerializedName("ad_id")
  private Long adId = null;

  @SerializedName("ad_name")
  private String adName = null;

  @SerializedName("adcreative_id")
  private Long adcreativeId = null;

  @SerializedName("adcreative")
  private Adcreative adcreative = null;

  @SerializedName("configured_status")
  private AdStatus configuredStatus = null;

  @SerializedName("system_status")
  private AdStatus systemStatus = null;

  @SerializedName("audit_spec")
  private List<AuditSpecStruct> auditSpec = null;

  @SerializedName("impression_tracking_url")
  private String impressionTrackingUrl = null;

  @SerializedName("click_tracking_url")
  private String clickTrackingUrl = null;

  @SerializedName("feeds_interaction_enabled")
  private Boolean feedsInteractionEnabled = null;

  @SerializedName("is_deleted")
  private Boolean isDeleted = null;

  @SerializedName("is_dynamic_creative")
  private Boolean isDynamicCreative = null;

  @SerializedName("created_time")
  private Long createdTime = null;

  @SerializedName("last_modified_time")
  private Long lastModifiedTime = null;

  @SerializedName("reject_message")
  private String rejectMessage = null;

  public AdsGetListStruct campaignId(Long campaignId) {
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

  public AdsGetListStruct adgroupId(Long adgroupId) {
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

  public AdsGetListStruct adId(Long adId) {
    this.adId = adId;
    return this;
  }

  /**
   * Get adId
   *
   * @return adId
   */
  @ApiModelProperty(value = "")
  public Long getAdId() {
    return adId;
  }

  public void setAdId(Long adId) {
    this.adId = adId;
  }

  public AdsGetListStruct adName(String adName) {
    this.adName = adName;
    return this;
  }

  /**
   * Get adName
   *
   * @return adName
   */
  @ApiModelProperty(value = "")
  public String getAdName() {
    return adName;
  }

  public void setAdName(String adName) {
    this.adName = adName;
  }

  public AdsGetListStruct adcreativeId(Long adcreativeId) {
    this.adcreativeId = adcreativeId;
    return this;
  }

  /**
   * Get adcreativeId
   *
   * @return adcreativeId
   */
  @ApiModelProperty(value = "")
  public Long getAdcreativeId() {
    return adcreativeId;
  }

  public void setAdcreativeId(Long adcreativeId) {
    this.adcreativeId = adcreativeId;
  }

  public AdsGetListStruct adcreative(Adcreative adcreative) {
    this.adcreative = adcreative;
    return this;
  }

  /**
   * Get adcreative
   *
   * @return adcreative
   */
  @ApiModelProperty(value = "")
  public Adcreative getAdcreative() {
    return adcreative;
  }

  public void setAdcreative(Adcreative adcreative) {
    this.adcreative = adcreative;
  }

  public AdsGetListStruct configuredStatus(AdStatus configuredStatus) {
    this.configuredStatus = configuredStatus;
    return this;
  }

  /**
   * Get configuredStatus
   *
   * @return configuredStatus
   */
  @ApiModelProperty(value = "")
  public AdStatus getConfiguredStatus() {
    return configuredStatus;
  }

  public void setConfiguredStatus(AdStatus configuredStatus) {
    this.configuredStatus = configuredStatus;
  }

  public AdsGetListStruct systemStatus(AdStatus systemStatus) {
    this.systemStatus = systemStatus;
    return this;
  }

  /**
   * Get systemStatus
   *
   * @return systemStatus
   */
  @ApiModelProperty(value = "")
  public AdStatus getSystemStatus() {
    return systemStatus;
  }

  public void setSystemStatus(AdStatus systemStatus) {
    this.systemStatus = systemStatus;
  }

  public AdsGetListStruct auditSpec(List<AuditSpecStruct> auditSpec) {
    this.auditSpec = auditSpec;
    return this;
  }

  public AdsGetListStruct addAuditSpecItem(AuditSpecStruct auditSpecItem) {
    if (this.auditSpec == null) {
      this.auditSpec = new ArrayList<AuditSpecStruct>();
    }
    this.auditSpec.add(auditSpecItem);
    return this;
  }

  /**
   * Get auditSpec
   *
   * @return auditSpec
   */
  @ApiModelProperty(value = "")
  public List<AuditSpecStruct> getAuditSpec() {
    return auditSpec;
  }

  public void setAuditSpec(List<AuditSpecStruct> auditSpec) {
    this.auditSpec = auditSpec;
  }

  public AdsGetListStruct impressionTrackingUrl(String impressionTrackingUrl) {
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

  public AdsGetListStruct clickTrackingUrl(String clickTrackingUrl) {
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

  public AdsGetListStruct feedsInteractionEnabled(Boolean feedsInteractionEnabled) {
    this.feedsInteractionEnabled = feedsInteractionEnabled;
    return this;
  }

  /**
   * Get feedsInteractionEnabled
   *
   * @return feedsInteractionEnabled
   */
  @ApiModelProperty(value = "")
  public Boolean isFeedsInteractionEnabled() {
    return feedsInteractionEnabled;
  }

  public void setFeedsInteractionEnabled(Boolean feedsInteractionEnabled) {
    this.feedsInteractionEnabled = feedsInteractionEnabled;
  }

  public AdsGetListStruct isDeleted(Boolean isDeleted) {
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

  public AdsGetListStruct isDynamicCreative(Boolean isDynamicCreative) {
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

  public AdsGetListStruct createdTime(Long createdTime) {
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

  public AdsGetListStruct lastModifiedTime(Long lastModifiedTime) {
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

  public AdsGetListStruct rejectMessage(String rejectMessage) {
    this.rejectMessage = rejectMessage;
    return this;
  }

  /**
   * Get rejectMessage
   *
   * @return rejectMessage
   */
  @ApiModelProperty(value = "")
  public String getRejectMessage() {
    return rejectMessage;
  }

  public void setRejectMessage(String rejectMessage) {
    this.rejectMessage = rejectMessage;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdsGetListStruct adsGetListStruct = (AdsGetListStruct) o;
    return Objects.equals(this.campaignId, adsGetListStruct.campaignId)
        && Objects.equals(this.adgroupId, adsGetListStruct.adgroupId)
        && Objects.equals(this.adId, adsGetListStruct.adId)
        && Objects.equals(this.adName, adsGetListStruct.adName)
        && Objects.equals(this.adcreativeId, adsGetListStruct.adcreativeId)
        && Objects.equals(this.adcreative, adsGetListStruct.adcreative)
        && Objects.equals(this.configuredStatus, adsGetListStruct.configuredStatus)
        && Objects.equals(this.systemStatus, adsGetListStruct.systemStatus)
        && Objects.equals(this.auditSpec, adsGetListStruct.auditSpec)
        && Objects.equals(this.impressionTrackingUrl, adsGetListStruct.impressionTrackingUrl)
        && Objects.equals(this.clickTrackingUrl, adsGetListStruct.clickTrackingUrl)
        && Objects.equals(this.feedsInteractionEnabled, adsGetListStruct.feedsInteractionEnabled)
        && Objects.equals(this.isDeleted, adsGetListStruct.isDeleted)
        && Objects.equals(this.isDynamicCreative, adsGetListStruct.isDynamicCreative)
        && Objects.equals(this.createdTime, adsGetListStruct.createdTime)
        && Objects.equals(this.lastModifiedTime, adsGetListStruct.lastModifiedTime)
        && Objects.equals(this.rejectMessage, adsGetListStruct.rejectMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        campaignId,
        adgroupId,
        adId,
        adName,
        adcreativeId,
        adcreative,
        configuredStatus,
        systemStatus,
        auditSpec,
        impressionTrackingUrl,
        clickTrackingUrl,
        feedsInteractionEnabled,
        isDeleted,
        isDynamicCreative,
        createdTime,
        lastModifiedTime,
        rejectMessage);
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

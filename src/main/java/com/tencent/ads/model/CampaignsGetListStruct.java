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
public class CampaignsGetListStruct {
  @SerializedName("campaign_id")
  private Long campaignId = null;

  @SerializedName("campaign_name")
  private String campaignName = null;

  @SerializedName("configured_status")
  private AdStatus configuredStatus = null;

  @SerializedName("campaign_type")
  private CampaignType campaignType = null;

  @SerializedName("promoted_object_type")
  private PromotedObjectType promotedObjectType = null;

  @SerializedName("daily_budget")
  private Long dailyBudget = null;

  @SerializedName("total_budget")
  private Long totalBudget = null;

  @SerializedName("budget_reach_date")
  private Long budgetReachDate = null;

  @SerializedName("created_time")
  private Long createdTime = null;

  @SerializedName("last_modified_time")
  private Long lastModifiedTime = null;

  @SerializedName("speed_mode")
  private SpeedMode speedMode = null;

  @SerializedName("is_deleted")
  private Boolean isDeleted = null;

  @SerializedName("is_auto_replenish")
  private Long isAutoReplenish = null;

  public CampaignsGetListStruct campaignId(Long campaignId) {
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

  public CampaignsGetListStruct campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

  /**
   * Get campaignName
   *
   * @return campaignName
   */
  @ApiModelProperty(value = "")
  public String getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }

  public CampaignsGetListStruct configuredStatus(AdStatus configuredStatus) {
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

  public CampaignsGetListStruct campaignType(CampaignType campaignType) {
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

  public CampaignsGetListStruct promotedObjectType(PromotedObjectType promotedObjectType) {
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

  public CampaignsGetListStruct dailyBudget(Long dailyBudget) {
    this.dailyBudget = dailyBudget;
    return this;
  }

  /**
   * Get dailyBudget
   *
   * @return dailyBudget
   */
  @ApiModelProperty(value = "")
  public Long getDailyBudget() {
    return dailyBudget;
  }

  public void setDailyBudget(Long dailyBudget) {
    this.dailyBudget = dailyBudget;
  }

  public CampaignsGetListStruct totalBudget(Long totalBudget) {
    this.totalBudget = totalBudget;
    return this;
  }

  /**
   * Get totalBudget
   *
   * @return totalBudget
   */
  @ApiModelProperty(value = "")
  public Long getTotalBudget() {
    return totalBudget;
  }

  public void setTotalBudget(Long totalBudget) {
    this.totalBudget = totalBudget;
  }

  public CampaignsGetListStruct budgetReachDate(Long budgetReachDate) {
    this.budgetReachDate = budgetReachDate;
    return this;
  }

  /**
   * Get budgetReachDate
   *
   * @return budgetReachDate
   */
  @ApiModelProperty(value = "")
  public Long getBudgetReachDate() {
    return budgetReachDate;
  }

  public void setBudgetReachDate(Long budgetReachDate) {
    this.budgetReachDate = budgetReachDate;
  }

  public CampaignsGetListStruct createdTime(Long createdTime) {
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

  public CampaignsGetListStruct lastModifiedTime(Long lastModifiedTime) {
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

  public CampaignsGetListStruct speedMode(SpeedMode speedMode) {
    this.speedMode = speedMode;
    return this;
  }

  /**
   * Get speedMode
   *
   * @return speedMode
   */
  @ApiModelProperty(value = "")
  public SpeedMode getSpeedMode() {
    return speedMode;
  }

  public void setSpeedMode(SpeedMode speedMode) {
    this.speedMode = speedMode;
  }

  public CampaignsGetListStruct isDeleted(Boolean isDeleted) {
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

  public CampaignsGetListStruct isAutoReplenish(Long isAutoReplenish) {
    this.isAutoReplenish = isAutoReplenish;
    return this;
  }

  /**
   * Get isAutoReplenish
   *
   * @return isAutoReplenish
   */
  @ApiModelProperty(value = "")
  public Long getIsAutoReplenish() {
    return isAutoReplenish;
  }

  public void setIsAutoReplenish(Long isAutoReplenish) {
    this.isAutoReplenish = isAutoReplenish;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignsGetListStruct campaignsGetListStruct = (CampaignsGetListStruct) o;
    return Objects.equals(this.campaignId, campaignsGetListStruct.campaignId)
        && Objects.equals(this.campaignName, campaignsGetListStruct.campaignName)
        && Objects.equals(this.configuredStatus, campaignsGetListStruct.configuredStatus)
        && Objects.equals(this.campaignType, campaignsGetListStruct.campaignType)
        && Objects.equals(this.promotedObjectType, campaignsGetListStruct.promotedObjectType)
        && Objects.equals(this.dailyBudget, campaignsGetListStruct.dailyBudget)
        && Objects.equals(this.totalBudget, campaignsGetListStruct.totalBudget)
        && Objects.equals(this.budgetReachDate, campaignsGetListStruct.budgetReachDate)
        && Objects.equals(this.createdTime, campaignsGetListStruct.createdTime)
        && Objects.equals(this.lastModifiedTime, campaignsGetListStruct.lastModifiedTime)
        && Objects.equals(this.speedMode, campaignsGetListStruct.speedMode)
        && Objects.equals(this.isDeleted, campaignsGetListStruct.isDeleted)
        && Objects.equals(this.isAutoReplenish, campaignsGetListStruct.isAutoReplenish);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        campaignId,
        campaignName,
        configuredStatus,
        campaignType,
        promotedObjectType,
        dailyBudget,
        totalBudget,
        budgetReachDate,
        createdTime,
        lastModifiedTime,
        speedMode,
        isDeleted,
        isAutoReplenish);
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

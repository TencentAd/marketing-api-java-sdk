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

/** 任务所需条件 */
@ApiModel(description = "任务所需条件")
public class BatchAsyncRequestTaskSpec {
  @SerializedName("update_union_position_package_spec")
  private List<UpdateUnionPositionPackageItem> updateUnionPositionPackageSpec = null;

  @SerializedName("update_exclude_union_position_package_spec")
  private List<UpdateExcludeUnionPositionPackageItem> updateExcludeUnionPositionPackageSpec = null;

  @SerializedName("update_targeting_id_spec")
  private List<UpdateTargetingIdItem> updateTargetingIdSpec = null;

  @SerializedName("update_bid_strategy_spec")
  private List<UpdateBidStrategyItem> updateBidStrategySpec = null;

  @SerializedName("update_deep_conversion_behavior_bid_spec")
  private List<UpdateDeepConversionBehaviorBidItem> updateDeepConversionBehaviorBidSpec = null;

  @SerializedName("update_adgroup_app_android_channel_package_id_spec")
  private List<UpdateAdgroupAppAndroidChannelPackageIdItem>
      updateAdgroupAppAndroidChannelPackageIdSpec = null;

  @SerializedName("update_campaign_speed_mode_spec")
  private List<UpdateCampaignSpeedModeItem> updateCampaignSpeedModeSpec = null;

  @SerializedName("delete_campaign_spec")
  private List<DeleteCampaignItem> deleteCampaignSpec = null;

  @SerializedName("delete_adgroup_spec")
  private List<DeleteAdgroupItem> deleteAdgroupSpec = null;

  @SerializedName("delete_ad_spec")
  private List<DeleteAdItem> deleteAdSpec = null;

  @SerializedName("update_adgroup_deep_conversion_worth_rate_spec")
  private List<UpdateAdgroupDeepConversionWorthRateItem> updateAdgroupDeepConversionWorthRateSpec =
      null;

  @SerializedName("update_adcreative_deep_link_url_spec")
  private List<UpdateAdcreativeDeepLinkUrlItem> updateAdcreativeDeepLinkUrlSpec = null;

  @SerializedName("targetings_share_spec")
  private List<TargetingsShareItem> targetingsShareSpec = null;

  @SerializedName("update_campaign_configured_status_spec")
  private List<UpdateCampaignConfiguredStatusItem> updateCampaignConfiguredStatusSpec = null;

  @SerializedName("update_campaign_daily_budget_spec")
  private List<UpdateCampaignDailyBudgetItem> updateCampaignDailyBudgetSpec = null;

  @SerializedName("update_adgroup_configured_status_spec")
  private List<UpdateAdgroupConfiguredStatusItem> updateAdgroupConfiguredStatusSpec = null;

  @SerializedName("update_adgroup_daily_budget_spec")
  private List<UpdateAdgroupDailyBudgetItem> updateAdgroupDailyBudgetSpec = null;

  @SerializedName("update_ad_configured_status_spec")
  private List<UpdateAdConfiguredStatusItem> updateAdConfiguredStatusSpec = null;

  @SerializedName("update_adgroup_auto_acquisition_spec")
  private List<UpdateAdgroupAutoAcquisitionItem> updateAdgroupAutoAcquisitionSpec = null;

  @SerializedName("update_adcreative_landing_page_spec")
  private List<UpdateAdcreativeLandingPageItem> updateAdcreativeLandingPageSpec = null;

  @SerializedName("update_adgroup_deep_conversion_worth_advanced_rate_spec")
  private List<UpdateAdgroupDeepConversionWorthAdvancedRateItem>
      updateAdgroupDeepConversionWorthAdvancedRateSpec = null;

  @SerializedName("update_deep_conversion_behavior_advanced_bid_spec")
  private List<UpdateDeepConversionBehaviorAdvancedBidItem>
      updateDeepConversionBehaviorAdvancedBidSpec = null;

  public BatchAsyncRequestTaskSpec updateUnionPositionPackageSpec(
      List<UpdateUnionPositionPackageItem> updateUnionPositionPackageSpec) {
    this.updateUnionPositionPackageSpec = updateUnionPositionPackageSpec;
    return this;
  }

  public BatchAsyncRequestTaskSpec addUpdateUnionPositionPackageSpecItem(
      UpdateUnionPositionPackageItem updateUnionPositionPackageSpecItem) {
    if (this.updateUnionPositionPackageSpec == null) {
      this.updateUnionPositionPackageSpec = new ArrayList<UpdateUnionPositionPackageItem>();
    }
    this.updateUnionPositionPackageSpec.add(updateUnionPositionPackageSpecItem);
    return this;
  }

  /**
   * Get updateUnionPositionPackageSpec
   *
   * @return updateUnionPositionPackageSpec
   */
  @ApiModelProperty(value = "")
  public List<UpdateUnionPositionPackageItem> getUpdateUnionPositionPackageSpec() {
    return updateUnionPositionPackageSpec;
  }

  public void setUpdateUnionPositionPackageSpec(
      List<UpdateUnionPositionPackageItem> updateUnionPositionPackageSpec) {
    this.updateUnionPositionPackageSpec = updateUnionPositionPackageSpec;
  }

  public BatchAsyncRequestTaskSpec updateExcludeUnionPositionPackageSpec(
      List<UpdateExcludeUnionPositionPackageItem> updateExcludeUnionPositionPackageSpec) {
    this.updateExcludeUnionPositionPackageSpec = updateExcludeUnionPositionPackageSpec;
    return this;
  }

  public BatchAsyncRequestTaskSpec addUpdateExcludeUnionPositionPackageSpecItem(
      UpdateExcludeUnionPositionPackageItem updateExcludeUnionPositionPackageSpecItem) {
    if (this.updateExcludeUnionPositionPackageSpec == null) {
      this.updateExcludeUnionPositionPackageSpec =
          new ArrayList<UpdateExcludeUnionPositionPackageItem>();
    }
    this.updateExcludeUnionPositionPackageSpec.add(updateExcludeUnionPositionPackageSpecItem);
    return this;
  }

  /**
   * Get updateExcludeUnionPositionPackageSpec
   *
   * @return updateExcludeUnionPositionPackageSpec
   */
  @ApiModelProperty(value = "")
  public List<UpdateExcludeUnionPositionPackageItem> getUpdateExcludeUnionPositionPackageSpec() {
    return updateExcludeUnionPositionPackageSpec;
  }

  public void setUpdateExcludeUnionPositionPackageSpec(
      List<UpdateExcludeUnionPositionPackageItem> updateExcludeUnionPositionPackageSpec) {
    this.updateExcludeUnionPositionPackageSpec = updateExcludeUnionPositionPackageSpec;
  }

  public BatchAsyncRequestTaskSpec updateTargetingIdSpec(
      List<UpdateTargetingIdItem> updateTargetingIdSpec) {
    this.updateTargetingIdSpec = updateTargetingIdSpec;
    return this;
  }

  public BatchAsyncRequestTaskSpec addUpdateTargetingIdSpecItem(
      UpdateTargetingIdItem updateTargetingIdSpecItem) {
    if (this.updateTargetingIdSpec == null) {
      this.updateTargetingIdSpec = new ArrayList<UpdateTargetingIdItem>();
    }
    this.updateTargetingIdSpec.add(updateTargetingIdSpecItem);
    return this;
  }

  /**
   * Get updateTargetingIdSpec
   *
   * @return updateTargetingIdSpec
   */
  @ApiModelProperty(value = "")
  public List<UpdateTargetingIdItem> getUpdateTargetingIdSpec() {
    return updateTargetingIdSpec;
  }

  public void setUpdateTargetingIdSpec(List<UpdateTargetingIdItem> updateTargetingIdSpec) {
    this.updateTargetingIdSpec = updateTargetingIdSpec;
  }

  public BatchAsyncRequestTaskSpec updateBidStrategySpec(
      List<UpdateBidStrategyItem> updateBidStrategySpec) {
    this.updateBidStrategySpec = updateBidStrategySpec;
    return this;
  }

  public BatchAsyncRequestTaskSpec addUpdateBidStrategySpecItem(
      UpdateBidStrategyItem updateBidStrategySpecItem) {
    if (this.updateBidStrategySpec == null) {
      this.updateBidStrategySpec = new ArrayList<UpdateBidStrategyItem>();
    }
    this.updateBidStrategySpec.add(updateBidStrategySpecItem);
    return this;
  }

  /**
   * Get updateBidStrategySpec
   *
   * @return updateBidStrategySpec
   */
  @ApiModelProperty(value = "")
  public List<UpdateBidStrategyItem> getUpdateBidStrategySpec() {
    return updateBidStrategySpec;
  }

  public void setUpdateBidStrategySpec(List<UpdateBidStrategyItem> updateBidStrategySpec) {
    this.updateBidStrategySpec = updateBidStrategySpec;
  }

  public BatchAsyncRequestTaskSpec updateDeepConversionBehaviorBidSpec(
      List<UpdateDeepConversionBehaviorBidItem> updateDeepConversionBehaviorBidSpec) {
    this.updateDeepConversionBehaviorBidSpec = updateDeepConversionBehaviorBidSpec;
    return this;
  }

  public BatchAsyncRequestTaskSpec addUpdateDeepConversionBehaviorBidSpecItem(
      UpdateDeepConversionBehaviorBidItem updateDeepConversionBehaviorBidSpecItem) {
    if (this.updateDeepConversionBehaviorBidSpec == null) {
      this.updateDeepConversionBehaviorBidSpec =
          new ArrayList<UpdateDeepConversionBehaviorBidItem>();
    }
    this.updateDeepConversionBehaviorBidSpec.add(updateDeepConversionBehaviorBidSpecItem);
    return this;
  }

  /**
   * Get updateDeepConversionBehaviorBidSpec
   *
   * @return updateDeepConversionBehaviorBidSpec
   */
  @ApiModelProperty(value = "")
  public List<UpdateDeepConversionBehaviorBidItem> getUpdateDeepConversionBehaviorBidSpec() {
    return updateDeepConversionBehaviorBidSpec;
  }

  public void setUpdateDeepConversionBehaviorBidSpec(
      List<UpdateDeepConversionBehaviorBidItem> updateDeepConversionBehaviorBidSpec) {
    this.updateDeepConversionBehaviorBidSpec = updateDeepConversionBehaviorBidSpec;
  }

  public BatchAsyncRequestTaskSpec updateAdgroupAppAndroidChannelPackageIdSpec(
      List<UpdateAdgroupAppAndroidChannelPackageIdItem>
          updateAdgroupAppAndroidChannelPackageIdSpec) {
    this.updateAdgroupAppAndroidChannelPackageIdSpec = updateAdgroupAppAndroidChannelPackageIdSpec;
    return this;
  }

  public BatchAsyncRequestTaskSpec addUpdateAdgroupAppAndroidChannelPackageIdSpecItem(
      UpdateAdgroupAppAndroidChannelPackageIdItem updateAdgroupAppAndroidChannelPackageIdSpecItem) {
    if (this.updateAdgroupAppAndroidChannelPackageIdSpec == null) {
      this.updateAdgroupAppAndroidChannelPackageIdSpec =
          new ArrayList<UpdateAdgroupAppAndroidChannelPackageIdItem>();
    }
    this.updateAdgroupAppAndroidChannelPackageIdSpec.add(
        updateAdgroupAppAndroidChannelPackageIdSpecItem);
    return this;
  }

  /**
   * Get updateAdgroupAppAndroidChannelPackageIdSpec
   *
   * @return updateAdgroupAppAndroidChannelPackageIdSpec
   */
  @ApiModelProperty(value = "")
  public List<UpdateAdgroupAppAndroidChannelPackageIdItem>
      getUpdateAdgroupAppAndroidChannelPackageIdSpec() {
    return updateAdgroupAppAndroidChannelPackageIdSpec;
  }

  public void setUpdateAdgroupAppAndroidChannelPackageIdSpec(
      List<UpdateAdgroupAppAndroidChannelPackageIdItem>
          updateAdgroupAppAndroidChannelPackageIdSpec) {
    this.updateAdgroupAppAndroidChannelPackageIdSpec = updateAdgroupAppAndroidChannelPackageIdSpec;
  }

  public BatchAsyncRequestTaskSpec updateCampaignSpeedModeSpec(
      List<UpdateCampaignSpeedModeItem> updateCampaignSpeedModeSpec) {
    this.updateCampaignSpeedModeSpec = updateCampaignSpeedModeSpec;
    return this;
  }

  public BatchAsyncRequestTaskSpec addUpdateCampaignSpeedModeSpecItem(
      UpdateCampaignSpeedModeItem updateCampaignSpeedModeSpecItem) {
    if (this.updateCampaignSpeedModeSpec == null) {
      this.updateCampaignSpeedModeSpec = new ArrayList<UpdateCampaignSpeedModeItem>();
    }
    this.updateCampaignSpeedModeSpec.add(updateCampaignSpeedModeSpecItem);
    return this;
  }

  /**
   * Get updateCampaignSpeedModeSpec
   *
   * @return updateCampaignSpeedModeSpec
   */
  @ApiModelProperty(value = "")
  public List<UpdateCampaignSpeedModeItem> getUpdateCampaignSpeedModeSpec() {
    return updateCampaignSpeedModeSpec;
  }

  public void setUpdateCampaignSpeedModeSpec(
      List<UpdateCampaignSpeedModeItem> updateCampaignSpeedModeSpec) {
    this.updateCampaignSpeedModeSpec = updateCampaignSpeedModeSpec;
  }

  public BatchAsyncRequestTaskSpec deleteCampaignSpec(List<DeleteCampaignItem> deleteCampaignSpec) {
    this.deleteCampaignSpec = deleteCampaignSpec;
    return this;
  }

  public BatchAsyncRequestTaskSpec addDeleteCampaignSpecItem(
      DeleteCampaignItem deleteCampaignSpecItem) {
    if (this.deleteCampaignSpec == null) {
      this.deleteCampaignSpec = new ArrayList<DeleteCampaignItem>();
    }
    this.deleteCampaignSpec.add(deleteCampaignSpecItem);
    return this;
  }

  /**
   * Get deleteCampaignSpec
   *
   * @return deleteCampaignSpec
   */
  @ApiModelProperty(value = "")
  public List<DeleteCampaignItem> getDeleteCampaignSpec() {
    return deleteCampaignSpec;
  }

  public void setDeleteCampaignSpec(List<DeleteCampaignItem> deleteCampaignSpec) {
    this.deleteCampaignSpec = deleteCampaignSpec;
  }

  public BatchAsyncRequestTaskSpec deleteAdgroupSpec(List<DeleteAdgroupItem> deleteAdgroupSpec) {
    this.deleteAdgroupSpec = deleteAdgroupSpec;
    return this;
  }

  public BatchAsyncRequestTaskSpec addDeleteAdgroupSpecItem(
      DeleteAdgroupItem deleteAdgroupSpecItem) {
    if (this.deleteAdgroupSpec == null) {
      this.deleteAdgroupSpec = new ArrayList<DeleteAdgroupItem>();
    }
    this.deleteAdgroupSpec.add(deleteAdgroupSpecItem);
    return this;
  }

  /**
   * Get deleteAdgroupSpec
   *
   * @return deleteAdgroupSpec
   */
  @ApiModelProperty(value = "")
  public List<DeleteAdgroupItem> getDeleteAdgroupSpec() {
    return deleteAdgroupSpec;
  }

  public void setDeleteAdgroupSpec(List<DeleteAdgroupItem> deleteAdgroupSpec) {
    this.deleteAdgroupSpec = deleteAdgroupSpec;
  }

  public BatchAsyncRequestTaskSpec deleteAdSpec(List<DeleteAdItem> deleteAdSpec) {
    this.deleteAdSpec = deleteAdSpec;
    return this;
  }

  public BatchAsyncRequestTaskSpec addDeleteAdSpecItem(DeleteAdItem deleteAdSpecItem) {
    if (this.deleteAdSpec == null) {
      this.deleteAdSpec = new ArrayList<DeleteAdItem>();
    }
    this.deleteAdSpec.add(deleteAdSpecItem);
    return this;
  }

  /**
   * Get deleteAdSpec
   *
   * @return deleteAdSpec
   */
  @ApiModelProperty(value = "")
  public List<DeleteAdItem> getDeleteAdSpec() {
    return deleteAdSpec;
  }

  public void setDeleteAdSpec(List<DeleteAdItem> deleteAdSpec) {
    this.deleteAdSpec = deleteAdSpec;
  }

  public BatchAsyncRequestTaskSpec updateAdgroupDeepConversionWorthRateSpec(
      List<UpdateAdgroupDeepConversionWorthRateItem> updateAdgroupDeepConversionWorthRateSpec) {
    this.updateAdgroupDeepConversionWorthRateSpec = updateAdgroupDeepConversionWorthRateSpec;
    return this;
  }

  public BatchAsyncRequestTaskSpec addUpdateAdgroupDeepConversionWorthRateSpecItem(
      UpdateAdgroupDeepConversionWorthRateItem updateAdgroupDeepConversionWorthRateSpecItem) {
    if (this.updateAdgroupDeepConversionWorthRateSpec == null) {
      this.updateAdgroupDeepConversionWorthRateSpec =
          new ArrayList<UpdateAdgroupDeepConversionWorthRateItem>();
    }
    this.updateAdgroupDeepConversionWorthRateSpec.add(updateAdgroupDeepConversionWorthRateSpecItem);
    return this;
  }

  /**
   * Get updateAdgroupDeepConversionWorthRateSpec
   *
   * @return updateAdgroupDeepConversionWorthRateSpec
   */
  @ApiModelProperty(value = "")
  public List<UpdateAdgroupDeepConversionWorthRateItem>
      getUpdateAdgroupDeepConversionWorthRateSpec() {
    return updateAdgroupDeepConversionWorthRateSpec;
  }

  public void setUpdateAdgroupDeepConversionWorthRateSpec(
      List<UpdateAdgroupDeepConversionWorthRateItem> updateAdgroupDeepConversionWorthRateSpec) {
    this.updateAdgroupDeepConversionWorthRateSpec = updateAdgroupDeepConversionWorthRateSpec;
  }

  public BatchAsyncRequestTaskSpec updateAdcreativeDeepLinkUrlSpec(
      List<UpdateAdcreativeDeepLinkUrlItem> updateAdcreativeDeepLinkUrlSpec) {
    this.updateAdcreativeDeepLinkUrlSpec = updateAdcreativeDeepLinkUrlSpec;
    return this;
  }

  public BatchAsyncRequestTaskSpec addUpdateAdcreativeDeepLinkUrlSpecItem(
      UpdateAdcreativeDeepLinkUrlItem updateAdcreativeDeepLinkUrlSpecItem) {
    if (this.updateAdcreativeDeepLinkUrlSpec == null) {
      this.updateAdcreativeDeepLinkUrlSpec = new ArrayList<UpdateAdcreativeDeepLinkUrlItem>();
    }
    this.updateAdcreativeDeepLinkUrlSpec.add(updateAdcreativeDeepLinkUrlSpecItem);
    return this;
  }

  /**
   * Get updateAdcreativeDeepLinkUrlSpec
   *
   * @return updateAdcreativeDeepLinkUrlSpec
   */
  @ApiModelProperty(value = "")
  public List<UpdateAdcreativeDeepLinkUrlItem> getUpdateAdcreativeDeepLinkUrlSpec() {
    return updateAdcreativeDeepLinkUrlSpec;
  }

  public void setUpdateAdcreativeDeepLinkUrlSpec(
      List<UpdateAdcreativeDeepLinkUrlItem> updateAdcreativeDeepLinkUrlSpec) {
    this.updateAdcreativeDeepLinkUrlSpec = updateAdcreativeDeepLinkUrlSpec;
  }

  public BatchAsyncRequestTaskSpec targetingsShareSpec(
      List<TargetingsShareItem> targetingsShareSpec) {
    this.targetingsShareSpec = targetingsShareSpec;
    return this;
  }

  public BatchAsyncRequestTaskSpec addTargetingsShareSpecItem(
      TargetingsShareItem targetingsShareSpecItem) {
    if (this.targetingsShareSpec == null) {
      this.targetingsShareSpec = new ArrayList<TargetingsShareItem>();
    }
    this.targetingsShareSpec.add(targetingsShareSpecItem);
    return this;
  }

  /**
   * Get targetingsShareSpec
   *
   * @return targetingsShareSpec
   */
  @ApiModelProperty(value = "")
  public List<TargetingsShareItem> getTargetingsShareSpec() {
    return targetingsShareSpec;
  }

  public void setTargetingsShareSpec(List<TargetingsShareItem> targetingsShareSpec) {
    this.targetingsShareSpec = targetingsShareSpec;
  }

  public BatchAsyncRequestTaskSpec updateCampaignConfiguredStatusSpec(
      List<UpdateCampaignConfiguredStatusItem> updateCampaignConfiguredStatusSpec) {
    this.updateCampaignConfiguredStatusSpec = updateCampaignConfiguredStatusSpec;
    return this;
  }

  public BatchAsyncRequestTaskSpec addUpdateCampaignConfiguredStatusSpecItem(
      UpdateCampaignConfiguredStatusItem updateCampaignConfiguredStatusSpecItem) {
    if (this.updateCampaignConfiguredStatusSpec == null) {
      this.updateCampaignConfiguredStatusSpec = new ArrayList<UpdateCampaignConfiguredStatusItem>();
    }
    this.updateCampaignConfiguredStatusSpec.add(updateCampaignConfiguredStatusSpecItem);
    return this;
  }

  /**
   * Get updateCampaignConfiguredStatusSpec
   *
   * @return updateCampaignConfiguredStatusSpec
   */
  @ApiModelProperty(value = "")
  public List<UpdateCampaignConfiguredStatusItem> getUpdateCampaignConfiguredStatusSpec() {
    return updateCampaignConfiguredStatusSpec;
  }

  public void setUpdateCampaignConfiguredStatusSpec(
      List<UpdateCampaignConfiguredStatusItem> updateCampaignConfiguredStatusSpec) {
    this.updateCampaignConfiguredStatusSpec = updateCampaignConfiguredStatusSpec;
  }

  public BatchAsyncRequestTaskSpec updateCampaignDailyBudgetSpec(
      List<UpdateCampaignDailyBudgetItem> updateCampaignDailyBudgetSpec) {
    this.updateCampaignDailyBudgetSpec = updateCampaignDailyBudgetSpec;
    return this;
  }

  public BatchAsyncRequestTaskSpec addUpdateCampaignDailyBudgetSpecItem(
      UpdateCampaignDailyBudgetItem updateCampaignDailyBudgetSpecItem) {
    if (this.updateCampaignDailyBudgetSpec == null) {
      this.updateCampaignDailyBudgetSpec = new ArrayList<UpdateCampaignDailyBudgetItem>();
    }
    this.updateCampaignDailyBudgetSpec.add(updateCampaignDailyBudgetSpecItem);
    return this;
  }

  /**
   * Get updateCampaignDailyBudgetSpec
   *
   * @return updateCampaignDailyBudgetSpec
   */
  @ApiModelProperty(value = "")
  public List<UpdateCampaignDailyBudgetItem> getUpdateCampaignDailyBudgetSpec() {
    return updateCampaignDailyBudgetSpec;
  }

  public void setUpdateCampaignDailyBudgetSpec(
      List<UpdateCampaignDailyBudgetItem> updateCampaignDailyBudgetSpec) {
    this.updateCampaignDailyBudgetSpec = updateCampaignDailyBudgetSpec;
  }

  public BatchAsyncRequestTaskSpec updateAdgroupConfiguredStatusSpec(
      List<UpdateAdgroupConfiguredStatusItem> updateAdgroupConfiguredStatusSpec) {
    this.updateAdgroupConfiguredStatusSpec = updateAdgroupConfiguredStatusSpec;
    return this;
  }

  public BatchAsyncRequestTaskSpec addUpdateAdgroupConfiguredStatusSpecItem(
      UpdateAdgroupConfiguredStatusItem updateAdgroupConfiguredStatusSpecItem) {
    if (this.updateAdgroupConfiguredStatusSpec == null) {
      this.updateAdgroupConfiguredStatusSpec = new ArrayList<UpdateAdgroupConfiguredStatusItem>();
    }
    this.updateAdgroupConfiguredStatusSpec.add(updateAdgroupConfiguredStatusSpecItem);
    return this;
  }

  /**
   * Get updateAdgroupConfiguredStatusSpec
   *
   * @return updateAdgroupConfiguredStatusSpec
   */
  @ApiModelProperty(value = "")
  public List<UpdateAdgroupConfiguredStatusItem> getUpdateAdgroupConfiguredStatusSpec() {
    return updateAdgroupConfiguredStatusSpec;
  }

  public void setUpdateAdgroupConfiguredStatusSpec(
      List<UpdateAdgroupConfiguredStatusItem> updateAdgroupConfiguredStatusSpec) {
    this.updateAdgroupConfiguredStatusSpec = updateAdgroupConfiguredStatusSpec;
  }

  public BatchAsyncRequestTaskSpec updateAdgroupDailyBudgetSpec(
      List<UpdateAdgroupDailyBudgetItem> updateAdgroupDailyBudgetSpec) {
    this.updateAdgroupDailyBudgetSpec = updateAdgroupDailyBudgetSpec;
    return this;
  }

  public BatchAsyncRequestTaskSpec addUpdateAdgroupDailyBudgetSpecItem(
      UpdateAdgroupDailyBudgetItem updateAdgroupDailyBudgetSpecItem) {
    if (this.updateAdgroupDailyBudgetSpec == null) {
      this.updateAdgroupDailyBudgetSpec = new ArrayList<UpdateAdgroupDailyBudgetItem>();
    }
    this.updateAdgroupDailyBudgetSpec.add(updateAdgroupDailyBudgetSpecItem);
    return this;
  }

  /**
   * Get updateAdgroupDailyBudgetSpec
   *
   * @return updateAdgroupDailyBudgetSpec
   */
  @ApiModelProperty(value = "")
  public List<UpdateAdgroupDailyBudgetItem> getUpdateAdgroupDailyBudgetSpec() {
    return updateAdgroupDailyBudgetSpec;
  }

  public void setUpdateAdgroupDailyBudgetSpec(
      List<UpdateAdgroupDailyBudgetItem> updateAdgroupDailyBudgetSpec) {
    this.updateAdgroupDailyBudgetSpec = updateAdgroupDailyBudgetSpec;
  }

  public BatchAsyncRequestTaskSpec updateAdConfiguredStatusSpec(
      List<UpdateAdConfiguredStatusItem> updateAdConfiguredStatusSpec) {
    this.updateAdConfiguredStatusSpec = updateAdConfiguredStatusSpec;
    return this;
  }

  public BatchAsyncRequestTaskSpec addUpdateAdConfiguredStatusSpecItem(
      UpdateAdConfiguredStatusItem updateAdConfiguredStatusSpecItem) {
    if (this.updateAdConfiguredStatusSpec == null) {
      this.updateAdConfiguredStatusSpec = new ArrayList<UpdateAdConfiguredStatusItem>();
    }
    this.updateAdConfiguredStatusSpec.add(updateAdConfiguredStatusSpecItem);
    return this;
  }

  /**
   * Get updateAdConfiguredStatusSpec
   *
   * @return updateAdConfiguredStatusSpec
   */
  @ApiModelProperty(value = "")
  public List<UpdateAdConfiguredStatusItem> getUpdateAdConfiguredStatusSpec() {
    return updateAdConfiguredStatusSpec;
  }

  public void setUpdateAdConfiguredStatusSpec(
      List<UpdateAdConfiguredStatusItem> updateAdConfiguredStatusSpec) {
    this.updateAdConfiguredStatusSpec = updateAdConfiguredStatusSpec;
  }

  public BatchAsyncRequestTaskSpec updateAdgroupAutoAcquisitionSpec(
      List<UpdateAdgroupAutoAcquisitionItem> updateAdgroupAutoAcquisitionSpec) {
    this.updateAdgroupAutoAcquisitionSpec = updateAdgroupAutoAcquisitionSpec;
    return this;
  }

  public BatchAsyncRequestTaskSpec addUpdateAdgroupAutoAcquisitionSpecItem(
      UpdateAdgroupAutoAcquisitionItem updateAdgroupAutoAcquisitionSpecItem) {
    if (this.updateAdgroupAutoAcquisitionSpec == null) {
      this.updateAdgroupAutoAcquisitionSpec = new ArrayList<UpdateAdgroupAutoAcquisitionItem>();
    }
    this.updateAdgroupAutoAcquisitionSpec.add(updateAdgroupAutoAcquisitionSpecItem);
    return this;
  }

  /**
   * Get updateAdgroupAutoAcquisitionSpec
   *
   * @return updateAdgroupAutoAcquisitionSpec
   */
  @ApiModelProperty(value = "")
  public List<UpdateAdgroupAutoAcquisitionItem> getUpdateAdgroupAutoAcquisitionSpec() {
    return updateAdgroupAutoAcquisitionSpec;
  }

  public void setUpdateAdgroupAutoAcquisitionSpec(
      List<UpdateAdgroupAutoAcquisitionItem> updateAdgroupAutoAcquisitionSpec) {
    this.updateAdgroupAutoAcquisitionSpec = updateAdgroupAutoAcquisitionSpec;
  }

  public BatchAsyncRequestTaskSpec updateAdcreativeLandingPageSpec(
      List<UpdateAdcreativeLandingPageItem> updateAdcreativeLandingPageSpec) {
    this.updateAdcreativeLandingPageSpec = updateAdcreativeLandingPageSpec;
    return this;
  }

  public BatchAsyncRequestTaskSpec addUpdateAdcreativeLandingPageSpecItem(
      UpdateAdcreativeLandingPageItem updateAdcreativeLandingPageSpecItem) {
    if (this.updateAdcreativeLandingPageSpec == null) {
      this.updateAdcreativeLandingPageSpec = new ArrayList<UpdateAdcreativeLandingPageItem>();
    }
    this.updateAdcreativeLandingPageSpec.add(updateAdcreativeLandingPageSpecItem);
    return this;
  }

  /**
   * Get updateAdcreativeLandingPageSpec
   *
   * @return updateAdcreativeLandingPageSpec
   */
  @ApiModelProperty(value = "")
  public List<UpdateAdcreativeLandingPageItem> getUpdateAdcreativeLandingPageSpec() {
    return updateAdcreativeLandingPageSpec;
  }

  public void setUpdateAdcreativeLandingPageSpec(
      List<UpdateAdcreativeLandingPageItem> updateAdcreativeLandingPageSpec) {
    this.updateAdcreativeLandingPageSpec = updateAdcreativeLandingPageSpec;
  }

  public BatchAsyncRequestTaskSpec updateAdgroupDeepConversionWorthAdvancedRateSpec(
      List<UpdateAdgroupDeepConversionWorthAdvancedRateItem>
          updateAdgroupDeepConversionWorthAdvancedRateSpec) {
    this.updateAdgroupDeepConversionWorthAdvancedRateSpec =
        updateAdgroupDeepConversionWorthAdvancedRateSpec;
    return this;
  }

  public BatchAsyncRequestTaskSpec addUpdateAdgroupDeepConversionWorthAdvancedRateSpecItem(
      UpdateAdgroupDeepConversionWorthAdvancedRateItem
          updateAdgroupDeepConversionWorthAdvancedRateSpecItem) {
    if (this.updateAdgroupDeepConversionWorthAdvancedRateSpec == null) {
      this.updateAdgroupDeepConversionWorthAdvancedRateSpec =
          new ArrayList<UpdateAdgroupDeepConversionWorthAdvancedRateItem>();
    }
    this.updateAdgroupDeepConversionWorthAdvancedRateSpec.add(
        updateAdgroupDeepConversionWorthAdvancedRateSpecItem);
    return this;
  }

  /**
   * Get updateAdgroupDeepConversionWorthAdvancedRateSpec
   *
   * @return updateAdgroupDeepConversionWorthAdvancedRateSpec
   */
  @ApiModelProperty(value = "")
  public List<UpdateAdgroupDeepConversionWorthAdvancedRateItem>
      getUpdateAdgroupDeepConversionWorthAdvancedRateSpec() {
    return updateAdgroupDeepConversionWorthAdvancedRateSpec;
  }

  public void setUpdateAdgroupDeepConversionWorthAdvancedRateSpec(
      List<UpdateAdgroupDeepConversionWorthAdvancedRateItem>
          updateAdgroupDeepConversionWorthAdvancedRateSpec) {
    this.updateAdgroupDeepConversionWorthAdvancedRateSpec =
        updateAdgroupDeepConversionWorthAdvancedRateSpec;
  }

  public BatchAsyncRequestTaskSpec updateDeepConversionBehaviorAdvancedBidSpec(
      List<UpdateDeepConversionBehaviorAdvancedBidItem>
          updateDeepConversionBehaviorAdvancedBidSpec) {
    this.updateDeepConversionBehaviorAdvancedBidSpec = updateDeepConversionBehaviorAdvancedBidSpec;
    return this;
  }

  public BatchAsyncRequestTaskSpec addUpdateDeepConversionBehaviorAdvancedBidSpecItem(
      UpdateDeepConversionBehaviorAdvancedBidItem updateDeepConversionBehaviorAdvancedBidSpecItem) {
    if (this.updateDeepConversionBehaviorAdvancedBidSpec == null) {
      this.updateDeepConversionBehaviorAdvancedBidSpec =
          new ArrayList<UpdateDeepConversionBehaviorAdvancedBidItem>();
    }
    this.updateDeepConversionBehaviorAdvancedBidSpec.add(
        updateDeepConversionBehaviorAdvancedBidSpecItem);
    return this;
  }

  /**
   * Get updateDeepConversionBehaviorAdvancedBidSpec
   *
   * @return updateDeepConversionBehaviorAdvancedBidSpec
   */
  @ApiModelProperty(value = "")
  public List<UpdateDeepConversionBehaviorAdvancedBidItem>
      getUpdateDeepConversionBehaviorAdvancedBidSpec() {
    return updateDeepConversionBehaviorAdvancedBidSpec;
  }

  public void setUpdateDeepConversionBehaviorAdvancedBidSpec(
      List<UpdateDeepConversionBehaviorAdvancedBidItem>
          updateDeepConversionBehaviorAdvancedBidSpec) {
    this.updateDeepConversionBehaviorAdvancedBidSpec = updateDeepConversionBehaviorAdvancedBidSpec;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchAsyncRequestTaskSpec batchAsyncRequestTaskSpec = (BatchAsyncRequestTaskSpec) o;
    return Objects.equals(
            this.updateUnionPositionPackageSpec,
            batchAsyncRequestTaskSpec.updateUnionPositionPackageSpec)
        && Objects.equals(
            this.updateExcludeUnionPositionPackageSpec,
            batchAsyncRequestTaskSpec.updateExcludeUnionPositionPackageSpec)
        && Objects.equals(
            this.updateTargetingIdSpec, batchAsyncRequestTaskSpec.updateTargetingIdSpec)
        && Objects.equals(
            this.updateBidStrategySpec, batchAsyncRequestTaskSpec.updateBidStrategySpec)
        && Objects.equals(
            this.updateDeepConversionBehaviorBidSpec,
            batchAsyncRequestTaskSpec.updateDeepConversionBehaviorBidSpec)
        && Objects.equals(
            this.updateAdgroupAppAndroidChannelPackageIdSpec,
            batchAsyncRequestTaskSpec.updateAdgroupAppAndroidChannelPackageIdSpec)
        && Objects.equals(
            this.updateCampaignSpeedModeSpec, batchAsyncRequestTaskSpec.updateCampaignSpeedModeSpec)
        && Objects.equals(this.deleteCampaignSpec, batchAsyncRequestTaskSpec.deleteCampaignSpec)
        && Objects.equals(this.deleteAdgroupSpec, batchAsyncRequestTaskSpec.deleteAdgroupSpec)
        && Objects.equals(this.deleteAdSpec, batchAsyncRequestTaskSpec.deleteAdSpec)
        && Objects.equals(
            this.updateAdgroupDeepConversionWorthRateSpec,
            batchAsyncRequestTaskSpec.updateAdgroupDeepConversionWorthRateSpec)
        && Objects.equals(
            this.updateAdcreativeDeepLinkUrlSpec,
            batchAsyncRequestTaskSpec.updateAdcreativeDeepLinkUrlSpec)
        && Objects.equals(this.targetingsShareSpec, batchAsyncRequestTaskSpec.targetingsShareSpec)
        && Objects.equals(
            this.updateCampaignConfiguredStatusSpec,
            batchAsyncRequestTaskSpec.updateCampaignConfiguredStatusSpec)
        && Objects.equals(
            this.updateCampaignDailyBudgetSpec,
            batchAsyncRequestTaskSpec.updateCampaignDailyBudgetSpec)
        && Objects.equals(
            this.updateAdgroupConfiguredStatusSpec,
            batchAsyncRequestTaskSpec.updateAdgroupConfiguredStatusSpec)
        && Objects.equals(
            this.updateAdgroupDailyBudgetSpec,
            batchAsyncRequestTaskSpec.updateAdgroupDailyBudgetSpec)
        && Objects.equals(
            this.updateAdConfiguredStatusSpec,
            batchAsyncRequestTaskSpec.updateAdConfiguredStatusSpec)
        && Objects.equals(
            this.updateAdgroupAutoAcquisitionSpec,
            batchAsyncRequestTaskSpec.updateAdgroupAutoAcquisitionSpec)
        && Objects.equals(
            this.updateAdcreativeLandingPageSpec,
            batchAsyncRequestTaskSpec.updateAdcreativeLandingPageSpec)
        && Objects.equals(
            this.updateAdgroupDeepConversionWorthAdvancedRateSpec,
            batchAsyncRequestTaskSpec.updateAdgroupDeepConversionWorthAdvancedRateSpec)
        && Objects.equals(
            this.updateDeepConversionBehaviorAdvancedBidSpec,
            batchAsyncRequestTaskSpec.updateDeepConversionBehaviorAdvancedBidSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        updateUnionPositionPackageSpec,
        updateExcludeUnionPositionPackageSpec,
        updateTargetingIdSpec,
        updateBidStrategySpec,
        updateDeepConversionBehaviorBidSpec,
        updateAdgroupAppAndroidChannelPackageIdSpec,
        updateCampaignSpeedModeSpec,
        deleteCampaignSpec,
        deleteAdgroupSpec,
        deleteAdSpec,
        updateAdgroupDeepConversionWorthRateSpec,
        updateAdcreativeDeepLinkUrlSpec,
        targetingsShareSpec,
        updateCampaignConfiguredStatusSpec,
        updateCampaignDailyBudgetSpec,
        updateAdgroupConfiguredStatusSpec,
        updateAdgroupDailyBudgetSpec,
        updateAdConfiguredStatusSpec,
        updateAdgroupAutoAcquisitionSpec,
        updateAdcreativeLandingPageSpec,
        updateAdgroupDeepConversionWorthAdvancedRateSpec,
        updateDeepConversionBehaviorAdvancedBidSpec);
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

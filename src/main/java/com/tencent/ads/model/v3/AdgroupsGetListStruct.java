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
public class AdgroupsGetListStruct {
  @SerializedName("targeting")
  private ReadTargetingSetting targeting = null;

  @SerializedName("adgroup_id")
  private Long adgroupId = null;

  @SerializedName("targeting_id")
  private Long targetingId = null;

  @SerializedName("targeting_translation")
  private String targetingTranslation = null;

  @SerializedName("configured_status")
  private ConfiguredStatus configuredStatus = null;

  @SerializedName("created_time")
  private Long createdTime = null;

  @SerializedName("last_modified_time")
  private Long lastModifiedTime = null;

  @SerializedName("is_deleted")
  private Boolean isDeleted = null;

  @SerializedName("system_status")
  private CalcAdGroupStatus systemStatus = null;

  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("adgroup_name")
  private String adgroupName = null;

  @SerializedName("marketing_goal")
  private MarketingGoal marketingGoal = null;

  @SerializedName("marketing_sub_goal")
  private MarketingSubGoal marketingSubGoal = null;

  @SerializedName("marketing_carrier_type")
  private MarketingCarrierType marketingCarrierType = null;

  @SerializedName("marketing_carrier_detail")
  private MarketingCarrierDetail marketingCarrierDetail = null;

  @SerializedName("marketing_target_type")
  private MarketingTargetType marketingTargetType = null;

  @SerializedName("marketing_target_detail")
  private MarketingTargetDetail marketingTargetDetail = null;

  @SerializedName("marketing_target_id")
  private Long marketingTargetId = null;

  @SerializedName("begin_date")
  private String beginDate = null;

  @SerializedName("end_date")
  private String endDate = null;

  @SerializedName("first_day_begin_time")
  private String firstDayBeginTime = null;

  @SerializedName("bid_amount")
  private Long bidAmount = null;

  @SerializedName("optimization_goal")
  private OptimizationGoal optimizationGoal = null;

  @SerializedName("time_series")
  private String timeSeries = null;

  @SerializedName("automatic_site_enabled")
  private Boolean automaticSiteEnabled = null;

  @SerializedName("site_set")
  private List<String> siteSet = null;

  @SerializedName("daily_budget")
  private Long dailyBudget = null;

  @SerializedName("scene_spec")
  private SceneTargetingForWrite sceneSpec = null;

  @SerializedName("user_action_sets")
  private List<UserActionSetStruct> userActionSets = null;

  @SerializedName("bid_strategy")
  private BidStrategy bidStrategy = null;

  @SerializedName("deep_conversion_spec")
  private DeepConversionSpec deepConversionSpec = null;

  @SerializedName("conversion_id")
  private Long conversionId = null;

  @SerializedName("deep_conversion_behavior_bid")
  private Long deepConversionBehaviorBid = null;

  @SerializedName("deep_conversion_worth_rate")
  private Double deepConversionWorthRate = null;

  @SerializedName("deep_conversion_worth_advanced_rate")
  private Double deepConversionWorthAdvancedRate = null;

  @SerializedName("deep_conversion_behavior_advanced_bid")
  private Long deepConversionBehaviorAdvancedBid = null;

  @SerializedName("bid_mode")
  private BidMode bidMode = null;

  @SerializedName("auto_acquisition_enabled")
  private Boolean autoAcquisitionEnabled = null;

  @SerializedName("auto_acquisition_budget")
  private Long autoAcquisitionBudget = null;

  @SerializedName("smart_bid_type")
  private SmartBidType smartBidType = null;

  @SerializedName("smart_cost_cap")
  private Long smartCostCap = null;

  @SerializedName("auto_derived_creative_enabled")
  private Boolean autoDerivedCreativeEnabled = null;

  @SerializedName("search_expand_targeting_switch")
  private SearchExpandTargetingSwitch searchExpandTargetingSwitch = null;

  @SerializedName("auto_derived_landing_page_switch")
  private Boolean autoDerivedLandingPageSwitch = null;

  @SerializedName("data_model_version")
  private Long dataModelVersion = null;

  @SerializedName("bid_scene")
  private BidScene bidScene = null;

  @SerializedName("marketing_target_ext")
  private MarketingTargetExt marketingTargetExt = null;

  @SerializedName("deep_optimization_type")
  private DeepOptimizationType deepOptimizationType = null;

  @SerializedName("flow_optimization_enabled")
  private Boolean flowOptimizationEnabled = null;

  @SerializedName("marketing_target_attachment")
  private MarketingTargetAttachment marketingTargetAttachment = null;

  @SerializedName("negative_word_cnt")
  private NegativeWordCntStruct negativeWordCnt = null;

  @SerializedName("search_expansion_switch")
  private SearchExpansionSwitch searchExpansionSwitch = null;

  @SerializedName("marketing_asset_id")
  private Long marketingAssetId = null;

  @SerializedName("promoted_asset_type")
  private PromotedAssetType promotedAssetType = null;

  @SerializedName("material_package_id")
  private Long materialPackageId = null;

  @SerializedName("marketing_asset_outer_spec")
  private MarketingAssetOuterSpec marketingAssetOuterSpec = null;

  @SerializedName("poi_list")
  private List<String> poiList = null;

  public AdgroupsGetListStruct targeting(ReadTargetingSetting targeting) {
    this.targeting = targeting;
    return this;
  }

  /**
   * Get targeting
   *
   * @return targeting
   */
  @ApiModelProperty(value = "")
  public ReadTargetingSetting getTargeting() {
    return targeting;
  }

  public void setTargeting(ReadTargetingSetting targeting) {
    this.targeting = targeting;
  }

  public AdgroupsGetListStruct adgroupId(Long adgroupId) {
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

  public AdgroupsGetListStruct targetingId(Long targetingId) {
    this.targetingId = targetingId;
    return this;
  }

  /**
   * Get targetingId
   *
   * @return targetingId
   */
  @ApiModelProperty(value = "")
  public Long getTargetingId() {
    return targetingId;
  }

  public void setTargetingId(Long targetingId) {
    this.targetingId = targetingId;
  }

  public AdgroupsGetListStruct targetingTranslation(String targetingTranslation) {
    this.targetingTranslation = targetingTranslation;
    return this;
  }

  /**
   * Get targetingTranslation
   *
   * @return targetingTranslation
   */
  @ApiModelProperty(value = "")
  public String getTargetingTranslation() {
    return targetingTranslation;
  }

  public void setTargetingTranslation(String targetingTranslation) {
    this.targetingTranslation = targetingTranslation;
  }

  public AdgroupsGetListStruct configuredStatus(ConfiguredStatus configuredStatus) {
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

  public AdgroupsGetListStruct createdTime(Long createdTime) {
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

  public AdgroupsGetListStruct lastModifiedTime(Long lastModifiedTime) {
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

  public AdgroupsGetListStruct isDeleted(Boolean isDeleted) {
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

  public AdgroupsGetListStruct systemStatus(CalcAdGroupStatus systemStatus) {
    this.systemStatus = systemStatus;
    return this;
  }

  /**
   * Get systemStatus
   *
   * @return systemStatus
   */
  @ApiModelProperty(value = "")
  public CalcAdGroupStatus getSystemStatus() {
    return systemStatus;
  }

  public void setSystemStatus(CalcAdGroupStatus systemStatus) {
    this.systemStatus = systemStatus;
  }

  public AdgroupsGetListStruct accountId(Long accountId) {
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

  public AdgroupsGetListStruct adgroupName(String adgroupName) {
    this.adgroupName = adgroupName;
    return this;
  }

  /**
   * Get adgroupName
   *
   * @return adgroupName
   */
  @ApiModelProperty(value = "")
  public String getAdgroupName() {
    return adgroupName;
  }

  public void setAdgroupName(String adgroupName) {
    this.adgroupName = adgroupName;
  }

  public AdgroupsGetListStruct marketingGoal(MarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
    return this;
  }

  /**
   * Get marketingGoal
   *
   * @return marketingGoal
   */
  @ApiModelProperty(value = "")
  public MarketingGoal getMarketingGoal() {
    return marketingGoal;
  }

  public void setMarketingGoal(MarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
  }

  public AdgroupsGetListStruct marketingSubGoal(MarketingSubGoal marketingSubGoal) {
    this.marketingSubGoal = marketingSubGoal;
    return this;
  }

  /**
   * Get marketingSubGoal
   *
   * @return marketingSubGoal
   */
  @ApiModelProperty(value = "")
  public MarketingSubGoal getMarketingSubGoal() {
    return marketingSubGoal;
  }

  public void setMarketingSubGoal(MarketingSubGoal marketingSubGoal) {
    this.marketingSubGoal = marketingSubGoal;
  }

  public AdgroupsGetListStruct marketingCarrierType(MarketingCarrierType marketingCarrierType) {
    this.marketingCarrierType = marketingCarrierType;
    return this;
  }

  /**
   * Get marketingCarrierType
   *
   * @return marketingCarrierType
   */
  @ApiModelProperty(value = "")
  public MarketingCarrierType getMarketingCarrierType() {
    return marketingCarrierType;
  }

  public void setMarketingCarrierType(MarketingCarrierType marketingCarrierType) {
    this.marketingCarrierType = marketingCarrierType;
  }

  public AdgroupsGetListStruct marketingCarrierDetail(
      MarketingCarrierDetail marketingCarrierDetail) {
    this.marketingCarrierDetail = marketingCarrierDetail;
    return this;
  }

  /**
   * Get marketingCarrierDetail
   *
   * @return marketingCarrierDetail
   */
  @ApiModelProperty(value = "")
  public MarketingCarrierDetail getMarketingCarrierDetail() {
    return marketingCarrierDetail;
  }

  public void setMarketingCarrierDetail(MarketingCarrierDetail marketingCarrierDetail) {
    this.marketingCarrierDetail = marketingCarrierDetail;
  }

  public AdgroupsGetListStruct marketingTargetType(MarketingTargetType marketingTargetType) {
    this.marketingTargetType = marketingTargetType;
    return this;
  }

  /**
   * Get marketingTargetType
   *
   * @return marketingTargetType
   */
  @ApiModelProperty(value = "")
  public MarketingTargetType getMarketingTargetType() {
    return marketingTargetType;
  }

  public void setMarketingTargetType(MarketingTargetType marketingTargetType) {
    this.marketingTargetType = marketingTargetType;
  }

  public AdgroupsGetListStruct marketingTargetDetail(MarketingTargetDetail marketingTargetDetail) {
    this.marketingTargetDetail = marketingTargetDetail;
    return this;
  }

  /**
   * Get marketingTargetDetail
   *
   * @return marketingTargetDetail
   */
  @ApiModelProperty(value = "")
  public MarketingTargetDetail getMarketingTargetDetail() {
    return marketingTargetDetail;
  }

  public void setMarketingTargetDetail(MarketingTargetDetail marketingTargetDetail) {
    this.marketingTargetDetail = marketingTargetDetail;
  }

  public AdgroupsGetListStruct marketingTargetId(Long marketingTargetId) {
    this.marketingTargetId = marketingTargetId;
    return this;
  }

  /**
   * Get marketingTargetId
   *
   * @return marketingTargetId
   */
  @ApiModelProperty(value = "")
  public Long getMarketingTargetId() {
    return marketingTargetId;
  }

  public void setMarketingTargetId(Long marketingTargetId) {
    this.marketingTargetId = marketingTargetId;
  }

  public AdgroupsGetListStruct beginDate(String beginDate) {
    this.beginDate = beginDate;
    return this;
  }

  /**
   * Get beginDate
   *
   * @return beginDate
   */
  @ApiModelProperty(value = "")
  public String getBeginDate() {
    return beginDate;
  }

  public void setBeginDate(String beginDate) {
    this.beginDate = beginDate;
  }

  public AdgroupsGetListStruct endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   *
   * @return endDate
   */
  @ApiModelProperty(value = "")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public AdgroupsGetListStruct firstDayBeginTime(String firstDayBeginTime) {
    this.firstDayBeginTime = firstDayBeginTime;
    return this;
  }

  /**
   * Get firstDayBeginTime
   *
   * @return firstDayBeginTime
   */
  @ApiModelProperty(value = "")
  public String getFirstDayBeginTime() {
    return firstDayBeginTime;
  }

  public void setFirstDayBeginTime(String firstDayBeginTime) {
    this.firstDayBeginTime = firstDayBeginTime;
  }

  public AdgroupsGetListStruct bidAmount(Long bidAmount) {
    this.bidAmount = bidAmount;
    return this;
  }

  /**
   * Get bidAmount
   *
   * @return bidAmount
   */
  @ApiModelProperty(value = "")
  public Long getBidAmount() {
    return bidAmount;
  }

  public void setBidAmount(Long bidAmount) {
    this.bidAmount = bidAmount;
  }

  public AdgroupsGetListStruct optimizationGoal(OptimizationGoal optimizationGoal) {
    this.optimizationGoal = optimizationGoal;
    return this;
  }

  /**
   * Get optimizationGoal
   *
   * @return optimizationGoal
   */
  @ApiModelProperty(value = "")
  public OptimizationGoal getOptimizationGoal() {
    return optimizationGoal;
  }

  public void setOptimizationGoal(OptimizationGoal optimizationGoal) {
    this.optimizationGoal = optimizationGoal;
  }

  public AdgroupsGetListStruct timeSeries(String timeSeries) {
    this.timeSeries = timeSeries;
    return this;
  }

  /**
   * Get timeSeries
   *
   * @return timeSeries
   */
  @ApiModelProperty(value = "")
  public String getTimeSeries() {
    return timeSeries;
  }

  public void setTimeSeries(String timeSeries) {
    this.timeSeries = timeSeries;
  }

  public AdgroupsGetListStruct automaticSiteEnabled(Boolean automaticSiteEnabled) {
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

  public AdgroupsGetListStruct siteSet(List<String> siteSet) {
    this.siteSet = siteSet;
    return this;
  }

  public AdgroupsGetListStruct addSiteSetItem(String siteSetItem) {
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

  public AdgroupsGetListStruct dailyBudget(Long dailyBudget) {
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

  public AdgroupsGetListStruct sceneSpec(SceneTargetingForWrite sceneSpec) {
    this.sceneSpec = sceneSpec;
    return this;
  }

  /**
   * Get sceneSpec
   *
   * @return sceneSpec
   */
  @ApiModelProperty(value = "")
  public SceneTargetingForWrite getSceneSpec() {
    return sceneSpec;
  }

  public void setSceneSpec(SceneTargetingForWrite sceneSpec) {
    this.sceneSpec = sceneSpec;
  }

  public AdgroupsGetListStruct userActionSets(List<UserActionSetStruct> userActionSets) {
    this.userActionSets = userActionSets;
    return this;
  }

  public AdgroupsGetListStruct addUserActionSetsItem(UserActionSetStruct userActionSetsItem) {
    if (this.userActionSets == null) {
      this.userActionSets = new ArrayList<UserActionSetStruct>();
    }
    this.userActionSets.add(userActionSetsItem);
    return this;
  }

  /**
   * Get userActionSets
   *
   * @return userActionSets
   */
  @ApiModelProperty(value = "")
  public List<UserActionSetStruct> getUserActionSets() {
    return userActionSets;
  }

  public void setUserActionSets(List<UserActionSetStruct> userActionSets) {
    this.userActionSets = userActionSets;
  }

  public AdgroupsGetListStruct bidStrategy(BidStrategy bidStrategy) {
    this.bidStrategy = bidStrategy;
    return this;
  }

  /**
   * Get bidStrategy
   *
   * @return bidStrategy
   */
  @ApiModelProperty(value = "")
  public BidStrategy getBidStrategy() {
    return bidStrategy;
  }

  public void setBidStrategy(BidStrategy bidStrategy) {
    this.bidStrategy = bidStrategy;
  }

  public AdgroupsGetListStruct deepConversionSpec(DeepConversionSpec deepConversionSpec) {
    this.deepConversionSpec = deepConversionSpec;
    return this;
  }

  /**
   * Get deepConversionSpec
   *
   * @return deepConversionSpec
   */
  @ApiModelProperty(value = "")
  public DeepConversionSpec getDeepConversionSpec() {
    return deepConversionSpec;
  }

  public void setDeepConversionSpec(DeepConversionSpec deepConversionSpec) {
    this.deepConversionSpec = deepConversionSpec;
  }

  public AdgroupsGetListStruct conversionId(Long conversionId) {
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

  public AdgroupsGetListStruct deepConversionBehaviorBid(Long deepConversionBehaviorBid) {
    this.deepConversionBehaviorBid = deepConversionBehaviorBid;
    return this;
  }

  /**
   * Get deepConversionBehaviorBid
   *
   * @return deepConversionBehaviorBid
   */
  @ApiModelProperty(value = "")
  public Long getDeepConversionBehaviorBid() {
    return deepConversionBehaviorBid;
  }

  public void setDeepConversionBehaviorBid(Long deepConversionBehaviorBid) {
    this.deepConversionBehaviorBid = deepConversionBehaviorBid;
  }

  public AdgroupsGetListStruct deepConversionWorthRate(Double deepConversionWorthRate) {
    this.deepConversionWorthRate = deepConversionWorthRate;
    return this;
  }

  /**
   * Get deepConversionWorthRate
   *
   * @return deepConversionWorthRate
   */
  @ApiModelProperty(value = "")
  public Double getDeepConversionWorthRate() {
    return deepConversionWorthRate;
  }

  public void setDeepConversionWorthRate(Double deepConversionWorthRate) {
    this.deepConversionWorthRate = deepConversionWorthRate;
  }

  public AdgroupsGetListStruct deepConversionWorthAdvancedRate(
      Double deepConversionWorthAdvancedRate) {
    this.deepConversionWorthAdvancedRate = deepConversionWorthAdvancedRate;
    return this;
  }

  /**
   * Get deepConversionWorthAdvancedRate
   *
   * @return deepConversionWorthAdvancedRate
   */
  @ApiModelProperty(value = "")
  public Double getDeepConversionWorthAdvancedRate() {
    return deepConversionWorthAdvancedRate;
  }

  public void setDeepConversionWorthAdvancedRate(Double deepConversionWorthAdvancedRate) {
    this.deepConversionWorthAdvancedRate = deepConversionWorthAdvancedRate;
  }

  public AdgroupsGetListStruct deepConversionBehaviorAdvancedBid(
      Long deepConversionBehaviorAdvancedBid) {
    this.deepConversionBehaviorAdvancedBid = deepConversionBehaviorAdvancedBid;
    return this;
  }

  /**
   * Get deepConversionBehaviorAdvancedBid
   *
   * @return deepConversionBehaviorAdvancedBid
   */
  @ApiModelProperty(value = "")
  public Long getDeepConversionBehaviorAdvancedBid() {
    return deepConversionBehaviorAdvancedBid;
  }

  public void setDeepConversionBehaviorAdvancedBid(Long deepConversionBehaviorAdvancedBid) {
    this.deepConversionBehaviorAdvancedBid = deepConversionBehaviorAdvancedBid;
  }

  public AdgroupsGetListStruct bidMode(BidMode bidMode) {
    this.bidMode = bidMode;
    return this;
  }

  /**
   * Get bidMode
   *
   * @return bidMode
   */
  @ApiModelProperty(value = "")
  public BidMode getBidMode() {
    return bidMode;
  }

  public void setBidMode(BidMode bidMode) {
    this.bidMode = bidMode;
  }

  public AdgroupsGetListStruct autoAcquisitionEnabled(Boolean autoAcquisitionEnabled) {
    this.autoAcquisitionEnabled = autoAcquisitionEnabled;
    return this;
  }

  /**
   * Get autoAcquisitionEnabled
   *
   * @return autoAcquisitionEnabled
   */
  @ApiModelProperty(value = "")
  public Boolean isAutoAcquisitionEnabled() {
    return autoAcquisitionEnabled;
  }

  public void setAutoAcquisitionEnabled(Boolean autoAcquisitionEnabled) {
    this.autoAcquisitionEnabled = autoAcquisitionEnabled;
  }

  public AdgroupsGetListStruct autoAcquisitionBudget(Long autoAcquisitionBudget) {
    this.autoAcquisitionBudget = autoAcquisitionBudget;
    return this;
  }

  /**
   * Get autoAcquisitionBudget
   *
   * @return autoAcquisitionBudget
   */
  @ApiModelProperty(value = "")
  public Long getAutoAcquisitionBudget() {
    return autoAcquisitionBudget;
  }

  public void setAutoAcquisitionBudget(Long autoAcquisitionBudget) {
    this.autoAcquisitionBudget = autoAcquisitionBudget;
  }

  public AdgroupsGetListStruct smartBidType(SmartBidType smartBidType) {
    this.smartBidType = smartBidType;
    return this;
  }

  /**
   * Get smartBidType
   *
   * @return smartBidType
   */
  @ApiModelProperty(value = "")
  public SmartBidType getSmartBidType() {
    return smartBidType;
  }

  public void setSmartBidType(SmartBidType smartBidType) {
    this.smartBidType = smartBidType;
  }

  public AdgroupsGetListStruct smartCostCap(Long smartCostCap) {
    this.smartCostCap = smartCostCap;
    return this;
  }

  /**
   * Get smartCostCap
   *
   * @return smartCostCap
   */
  @ApiModelProperty(value = "")
  public Long getSmartCostCap() {
    return smartCostCap;
  }

  public void setSmartCostCap(Long smartCostCap) {
    this.smartCostCap = smartCostCap;
  }

  public AdgroupsGetListStruct autoDerivedCreativeEnabled(Boolean autoDerivedCreativeEnabled) {
    this.autoDerivedCreativeEnabled = autoDerivedCreativeEnabled;
    return this;
  }

  /**
   * Get autoDerivedCreativeEnabled
   *
   * @return autoDerivedCreativeEnabled
   */
  @ApiModelProperty(value = "")
  public Boolean isAutoDerivedCreativeEnabled() {
    return autoDerivedCreativeEnabled;
  }

  public void setAutoDerivedCreativeEnabled(Boolean autoDerivedCreativeEnabled) {
    this.autoDerivedCreativeEnabled = autoDerivedCreativeEnabled;
  }

  public AdgroupsGetListStruct searchExpandTargetingSwitch(
      SearchExpandTargetingSwitch searchExpandTargetingSwitch) {
    this.searchExpandTargetingSwitch = searchExpandTargetingSwitch;
    return this;
  }

  /**
   * Get searchExpandTargetingSwitch
   *
   * @return searchExpandTargetingSwitch
   */
  @ApiModelProperty(value = "")
  public SearchExpandTargetingSwitch getSearchExpandTargetingSwitch() {
    return searchExpandTargetingSwitch;
  }

  public void setSearchExpandTargetingSwitch(
      SearchExpandTargetingSwitch searchExpandTargetingSwitch) {
    this.searchExpandTargetingSwitch = searchExpandTargetingSwitch;
  }

  public AdgroupsGetListStruct autoDerivedLandingPageSwitch(Boolean autoDerivedLandingPageSwitch) {
    this.autoDerivedLandingPageSwitch = autoDerivedLandingPageSwitch;
    return this;
  }

  /**
   * Get autoDerivedLandingPageSwitch
   *
   * @return autoDerivedLandingPageSwitch
   */
  @ApiModelProperty(value = "")
  public Boolean isAutoDerivedLandingPageSwitch() {
    return autoDerivedLandingPageSwitch;
  }

  public void setAutoDerivedLandingPageSwitch(Boolean autoDerivedLandingPageSwitch) {
    this.autoDerivedLandingPageSwitch = autoDerivedLandingPageSwitch;
  }

  public AdgroupsGetListStruct dataModelVersion(Long dataModelVersion) {
    this.dataModelVersion = dataModelVersion;
    return this;
  }

  /**
   * Get dataModelVersion
   *
   * @return dataModelVersion
   */
  @ApiModelProperty(value = "")
  public Long getDataModelVersion() {
    return dataModelVersion;
  }

  public void setDataModelVersion(Long dataModelVersion) {
    this.dataModelVersion = dataModelVersion;
  }

  public AdgroupsGetListStruct bidScene(BidScene bidScene) {
    this.bidScene = bidScene;
    return this;
  }

  /**
   * Get bidScene
   *
   * @return bidScene
   */
  @ApiModelProperty(value = "")
  public BidScene getBidScene() {
    return bidScene;
  }

  public void setBidScene(BidScene bidScene) {
    this.bidScene = bidScene;
  }

  public AdgroupsGetListStruct marketingTargetExt(MarketingTargetExt marketingTargetExt) {
    this.marketingTargetExt = marketingTargetExt;
    return this;
  }

  /**
   * Get marketingTargetExt
   *
   * @return marketingTargetExt
   */
  @ApiModelProperty(value = "")
  public MarketingTargetExt getMarketingTargetExt() {
    return marketingTargetExt;
  }

  public void setMarketingTargetExt(MarketingTargetExt marketingTargetExt) {
    this.marketingTargetExt = marketingTargetExt;
  }

  public AdgroupsGetListStruct deepOptimizationType(DeepOptimizationType deepOptimizationType) {
    this.deepOptimizationType = deepOptimizationType;
    return this;
  }

  /**
   * Get deepOptimizationType
   *
   * @return deepOptimizationType
   */
  @ApiModelProperty(value = "")
  public DeepOptimizationType getDeepOptimizationType() {
    return deepOptimizationType;
  }

  public void setDeepOptimizationType(DeepOptimizationType deepOptimizationType) {
    this.deepOptimizationType = deepOptimizationType;
  }

  public AdgroupsGetListStruct flowOptimizationEnabled(Boolean flowOptimizationEnabled) {
    this.flowOptimizationEnabled = flowOptimizationEnabled;
    return this;
  }

  /**
   * Get flowOptimizationEnabled
   *
   * @return flowOptimizationEnabled
   */
  @ApiModelProperty(value = "")
  public Boolean isFlowOptimizationEnabled() {
    return flowOptimizationEnabled;
  }

  public void setFlowOptimizationEnabled(Boolean flowOptimizationEnabled) {
    this.flowOptimizationEnabled = flowOptimizationEnabled;
  }

  public AdgroupsGetListStruct marketingTargetAttachment(
      MarketingTargetAttachment marketingTargetAttachment) {
    this.marketingTargetAttachment = marketingTargetAttachment;
    return this;
  }

  /**
   * Get marketingTargetAttachment
   *
   * @return marketingTargetAttachment
   */
  @ApiModelProperty(value = "")
  public MarketingTargetAttachment getMarketingTargetAttachment() {
    return marketingTargetAttachment;
  }

  public void setMarketingTargetAttachment(MarketingTargetAttachment marketingTargetAttachment) {
    this.marketingTargetAttachment = marketingTargetAttachment;
  }

  public AdgroupsGetListStruct negativeWordCnt(NegativeWordCntStruct negativeWordCnt) {
    this.negativeWordCnt = negativeWordCnt;
    return this;
  }

  /**
   * Get negativeWordCnt
   *
   * @return negativeWordCnt
   */
  @ApiModelProperty(value = "")
  public NegativeWordCntStruct getNegativeWordCnt() {
    return negativeWordCnt;
  }

  public void setNegativeWordCnt(NegativeWordCntStruct negativeWordCnt) {
    this.negativeWordCnt = negativeWordCnt;
  }

  public AdgroupsGetListStruct searchExpansionSwitch(SearchExpansionSwitch searchExpansionSwitch) {
    this.searchExpansionSwitch = searchExpansionSwitch;
    return this;
  }

  /**
   * Get searchExpansionSwitch
   *
   * @return searchExpansionSwitch
   */
  @ApiModelProperty(value = "")
  public SearchExpansionSwitch getSearchExpansionSwitch() {
    return searchExpansionSwitch;
  }

  public void setSearchExpansionSwitch(SearchExpansionSwitch searchExpansionSwitch) {
    this.searchExpansionSwitch = searchExpansionSwitch;
  }

  public AdgroupsGetListStruct marketingAssetId(Long marketingAssetId) {
    this.marketingAssetId = marketingAssetId;
    return this;
  }

  /**
   * Get marketingAssetId
   *
   * @return marketingAssetId
   */
  @ApiModelProperty(value = "")
  public Long getMarketingAssetId() {
    return marketingAssetId;
  }

  public void setMarketingAssetId(Long marketingAssetId) {
    this.marketingAssetId = marketingAssetId;
  }

  public AdgroupsGetListStruct promotedAssetType(PromotedAssetType promotedAssetType) {
    this.promotedAssetType = promotedAssetType;
    return this;
  }

  /**
   * Get promotedAssetType
   *
   * @return promotedAssetType
   */
  @ApiModelProperty(value = "")
  public PromotedAssetType getPromotedAssetType() {
    return promotedAssetType;
  }

  public void setPromotedAssetType(PromotedAssetType promotedAssetType) {
    this.promotedAssetType = promotedAssetType;
  }

  public AdgroupsGetListStruct materialPackageId(Long materialPackageId) {
    this.materialPackageId = materialPackageId;
    return this;
  }

  /**
   * Get materialPackageId
   *
   * @return materialPackageId
   */
  @ApiModelProperty(value = "")
  public Long getMaterialPackageId() {
    return materialPackageId;
  }

  public void setMaterialPackageId(Long materialPackageId) {
    this.materialPackageId = materialPackageId;
  }

  public AdgroupsGetListStruct marketingAssetOuterSpec(
      MarketingAssetOuterSpec marketingAssetOuterSpec) {
    this.marketingAssetOuterSpec = marketingAssetOuterSpec;
    return this;
  }

  /**
   * Get marketingAssetOuterSpec
   *
   * @return marketingAssetOuterSpec
   */
  @ApiModelProperty(value = "")
  public MarketingAssetOuterSpec getMarketingAssetOuterSpec() {
    return marketingAssetOuterSpec;
  }

  public void setMarketingAssetOuterSpec(MarketingAssetOuterSpec marketingAssetOuterSpec) {
    this.marketingAssetOuterSpec = marketingAssetOuterSpec;
  }

  public AdgroupsGetListStruct poiList(List<String> poiList) {
    this.poiList = poiList;
    return this;
  }

  public AdgroupsGetListStruct addPoiListItem(String poiListItem) {
    if (this.poiList == null) {
      this.poiList = new ArrayList<String>();
    }
    this.poiList.add(poiListItem);
    return this;
  }

  /**
   * Get poiList
   *
   * @return poiList
   */
  @ApiModelProperty(value = "")
  public List<String> getPoiList() {
    return poiList;
  }

  public void setPoiList(List<String> poiList) {
    this.poiList = poiList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdgroupsGetListStruct adgroupsGetListStruct = (AdgroupsGetListStruct) o;
    return Objects.equals(this.targeting, adgroupsGetListStruct.targeting)
        && Objects.equals(this.adgroupId, adgroupsGetListStruct.adgroupId)
        && Objects.equals(this.targetingId, adgroupsGetListStruct.targetingId)
        && Objects.equals(this.targetingTranslation, adgroupsGetListStruct.targetingTranslation)
        && Objects.equals(this.configuredStatus, adgroupsGetListStruct.configuredStatus)
        && Objects.equals(this.createdTime, adgroupsGetListStruct.createdTime)
        && Objects.equals(this.lastModifiedTime, adgroupsGetListStruct.lastModifiedTime)
        && Objects.equals(this.isDeleted, adgroupsGetListStruct.isDeleted)
        && Objects.equals(this.systemStatus, adgroupsGetListStruct.systemStatus)
        && Objects.equals(this.accountId, adgroupsGetListStruct.accountId)
        && Objects.equals(this.adgroupName, adgroupsGetListStruct.adgroupName)
        && Objects.equals(this.marketingGoal, adgroupsGetListStruct.marketingGoal)
        && Objects.equals(this.marketingSubGoal, adgroupsGetListStruct.marketingSubGoal)
        && Objects.equals(this.marketingCarrierType, adgroupsGetListStruct.marketingCarrierType)
        && Objects.equals(this.marketingCarrierDetail, adgroupsGetListStruct.marketingCarrierDetail)
        && Objects.equals(this.marketingTargetType, adgroupsGetListStruct.marketingTargetType)
        && Objects.equals(this.marketingTargetDetail, adgroupsGetListStruct.marketingTargetDetail)
        && Objects.equals(this.marketingTargetId, adgroupsGetListStruct.marketingTargetId)
        && Objects.equals(this.beginDate, adgroupsGetListStruct.beginDate)
        && Objects.equals(this.endDate, adgroupsGetListStruct.endDate)
        && Objects.equals(this.firstDayBeginTime, adgroupsGetListStruct.firstDayBeginTime)
        && Objects.equals(this.bidAmount, adgroupsGetListStruct.bidAmount)
        && Objects.equals(this.optimizationGoal, adgroupsGetListStruct.optimizationGoal)
        && Objects.equals(this.timeSeries, adgroupsGetListStruct.timeSeries)
        && Objects.equals(this.automaticSiteEnabled, adgroupsGetListStruct.automaticSiteEnabled)
        && Objects.equals(this.siteSet, adgroupsGetListStruct.siteSet)
        && Objects.equals(this.dailyBudget, adgroupsGetListStruct.dailyBudget)
        && Objects.equals(this.sceneSpec, adgroupsGetListStruct.sceneSpec)
        && Objects.equals(this.userActionSets, adgroupsGetListStruct.userActionSets)
        && Objects.equals(this.bidStrategy, adgroupsGetListStruct.bidStrategy)
        && Objects.equals(this.deepConversionSpec, adgroupsGetListStruct.deepConversionSpec)
        && Objects.equals(this.conversionId, adgroupsGetListStruct.conversionId)
        && Objects.equals(
            this.deepConversionBehaviorBid, adgroupsGetListStruct.deepConversionBehaviorBid)
        && Objects.equals(
            this.deepConversionWorthRate, adgroupsGetListStruct.deepConversionWorthRate)
        && Objects.equals(
            this.deepConversionWorthAdvancedRate,
            adgroupsGetListStruct.deepConversionWorthAdvancedRate)
        && Objects.equals(
            this.deepConversionBehaviorAdvancedBid,
            adgroupsGetListStruct.deepConversionBehaviorAdvancedBid)
        && Objects.equals(this.bidMode, adgroupsGetListStruct.bidMode)
        && Objects.equals(this.autoAcquisitionEnabled, adgroupsGetListStruct.autoAcquisitionEnabled)
        && Objects.equals(this.autoAcquisitionBudget, adgroupsGetListStruct.autoAcquisitionBudget)
        && Objects.equals(this.smartBidType, adgroupsGetListStruct.smartBidType)
        && Objects.equals(this.smartCostCap, adgroupsGetListStruct.smartCostCap)
        && Objects.equals(
            this.autoDerivedCreativeEnabled, adgroupsGetListStruct.autoDerivedCreativeEnabled)
        && Objects.equals(
            this.searchExpandTargetingSwitch, adgroupsGetListStruct.searchExpandTargetingSwitch)
        && Objects.equals(
            this.autoDerivedLandingPageSwitch, adgroupsGetListStruct.autoDerivedLandingPageSwitch)
        && Objects.equals(this.dataModelVersion, adgroupsGetListStruct.dataModelVersion)
        && Objects.equals(this.bidScene, adgroupsGetListStruct.bidScene)
        && Objects.equals(this.marketingTargetExt, adgroupsGetListStruct.marketingTargetExt)
        && Objects.equals(this.deepOptimizationType, adgroupsGetListStruct.deepOptimizationType)
        && Objects.equals(
            this.flowOptimizationEnabled, adgroupsGetListStruct.flowOptimizationEnabled)
        && Objects.equals(
            this.marketingTargetAttachment, adgroupsGetListStruct.marketingTargetAttachment)
        && Objects.equals(this.negativeWordCnt, adgroupsGetListStruct.negativeWordCnt)
        && Objects.equals(this.searchExpansionSwitch, adgroupsGetListStruct.searchExpansionSwitch)
        && Objects.equals(this.marketingAssetId, adgroupsGetListStruct.marketingAssetId)
        && Objects.equals(this.promotedAssetType, adgroupsGetListStruct.promotedAssetType)
        && Objects.equals(this.materialPackageId, adgroupsGetListStruct.materialPackageId)
        && Objects.equals(
            this.marketingAssetOuterSpec, adgroupsGetListStruct.marketingAssetOuterSpec)
        && Objects.equals(this.poiList, adgroupsGetListStruct.poiList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        targeting,
        adgroupId,
        targetingId,
        targetingTranslation,
        configuredStatus,
        createdTime,
        lastModifiedTime,
        isDeleted,
        systemStatus,
        accountId,
        adgroupName,
        marketingGoal,
        marketingSubGoal,
        marketingCarrierType,
        marketingCarrierDetail,
        marketingTargetType,
        marketingTargetDetail,
        marketingTargetId,
        beginDate,
        endDate,
        firstDayBeginTime,
        bidAmount,
        optimizationGoal,
        timeSeries,
        automaticSiteEnabled,
        siteSet,
        dailyBudget,
        sceneSpec,
        userActionSets,
        bidStrategy,
        deepConversionSpec,
        conversionId,
        deepConversionBehaviorBid,
        deepConversionWorthRate,
        deepConversionWorthAdvancedRate,
        deepConversionBehaviorAdvancedBid,
        bidMode,
        autoAcquisitionEnabled,
        autoAcquisitionBudget,
        smartBidType,
        smartCostCap,
        autoDerivedCreativeEnabled,
        searchExpandTargetingSwitch,
        autoDerivedLandingPageSwitch,
        dataModelVersion,
        bidScene,
        marketingTargetExt,
        deepOptimizationType,
        flowOptimizationEnabled,
        marketingTargetAttachment,
        negativeWordCnt,
        searchExpansionSwitch,
        marketingAssetId,
        promotedAssetType,
        materialPackageId,
        marketingAssetOuterSpec,
        poiList);
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

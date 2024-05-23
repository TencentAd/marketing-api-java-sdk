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
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** AdgroupsAddRequest */
public class AdgroupsAddRequest {
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

  @SerializedName("targeting")
  private WriteTargetingSetting targeting = null;

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

  @SerializedName("bid_scene")
  private BidScene bidScene = null;

  @SerializedName("configured_status")
  private ConfiguredStatus configuredStatus = null;

  @SerializedName("flow_optimization_enabled")
  private Boolean flowOptimizationEnabled = null;

  @SerializedName("material_package_id")
  private Long materialPackageId = null;

  @SerializedName("marketing_asset_id")
  private Long marketingAssetId = null;

  @SerializedName("marketing_asset_outer_spec")
  private MarketingAssetOuterSpec marketingAssetOuterSpec = null;

  @SerializedName("poi_list")
  private List<String> poiList = null;

  @SerializedName("exploration_strategy")
  private SiteSetExplorationStrategy explorationStrategy = null;

  @SerializedName("priority_site_set")
  private List<String> prioritySiteSet = null;

  @SerializedName("ecom_pkam_switch")
  private EcomPkamSwitch ecomPkamSwitch = null;

  @SerializedName("forward_link_assist")
  private OptimizationGoal forwardLinkAssist = null;

  @SerializedName("rta_id")
  private Long rtaId = null;

  @SerializedName("rta_target_id")
  private String rtaTargetId = null;

  @SerializedName("mpa_spec")
  private MpaSpec mpaSpec = null;

  @SerializedName("cost_constraint_scene")
  private CostConstraintScene costConstraintScene = null;

  @SerializedName("custom_cost_cap")
  private Long customCostCap = null;

  @SerializedName("feedback_id")
  private Long feedbackId = null;

  @SerializedName("short_play_pay_type")
  private ShortPlayPayType shortPlayPayType = null;

  @SerializedName("sell_strategy_id")
  private Long sellStrategyId = null;

  @SerializedName("dynamic_ad_type")
  private DynamicAdType dynamicAdType = null;

  @SerializedName("og_completion_type")
  private OgCompletionType ogCompletionType = null;

  public AdgroupsAddRequest accountId(Long accountId) {
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

  public AdgroupsAddRequest adgroupName(String adgroupName) {
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

  public AdgroupsAddRequest marketingGoal(MarketingGoal marketingGoal) {
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

  public AdgroupsAddRequest marketingSubGoal(MarketingSubGoal marketingSubGoal) {
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

  public AdgroupsAddRequest marketingCarrierType(MarketingCarrierType marketingCarrierType) {
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

  public AdgroupsAddRequest marketingCarrierDetail(MarketingCarrierDetail marketingCarrierDetail) {
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

  public AdgroupsAddRequest beginDate(String beginDate) {
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

  public AdgroupsAddRequest endDate(String endDate) {
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

  public AdgroupsAddRequest firstDayBeginTime(String firstDayBeginTime) {
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

  public AdgroupsAddRequest bidAmount(Long bidAmount) {
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

  public AdgroupsAddRequest optimizationGoal(OptimizationGoal optimizationGoal) {
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

  public AdgroupsAddRequest timeSeries(String timeSeries) {
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

  public AdgroupsAddRequest automaticSiteEnabled(Boolean automaticSiteEnabled) {
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

  public AdgroupsAddRequest siteSet(List<String> siteSet) {
    this.siteSet = siteSet;
    return this;
  }

  public AdgroupsAddRequest addSiteSetItem(String siteSetItem) {
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

  public AdgroupsAddRequest dailyBudget(Long dailyBudget) {
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

  public AdgroupsAddRequest targeting(WriteTargetingSetting targeting) {
    this.targeting = targeting;
    return this;
  }

  /**
   * Get targeting
   *
   * @return targeting
   */
  @ApiModelProperty(value = "")
  public WriteTargetingSetting getTargeting() {
    return targeting;
  }

  public void setTargeting(WriteTargetingSetting targeting) {
    this.targeting = targeting;
  }

  public AdgroupsAddRequest sceneSpec(SceneTargetingForWrite sceneSpec) {
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

  public AdgroupsAddRequest userActionSets(List<UserActionSetStruct> userActionSets) {
    this.userActionSets = userActionSets;
    return this;
  }

  public AdgroupsAddRequest addUserActionSetsItem(UserActionSetStruct userActionSetsItem) {
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

  public AdgroupsAddRequest bidStrategy(BidStrategy bidStrategy) {
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

  public AdgroupsAddRequest deepConversionSpec(DeepConversionSpec deepConversionSpec) {
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

  public AdgroupsAddRequest conversionId(Long conversionId) {
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

  public AdgroupsAddRequest deepConversionBehaviorBid(Long deepConversionBehaviorBid) {
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

  public AdgroupsAddRequest deepConversionWorthRate(Double deepConversionWorthRate) {
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

  public AdgroupsAddRequest deepConversionWorthAdvancedRate(
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

  public AdgroupsAddRequest deepConversionBehaviorAdvancedBid(
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

  public AdgroupsAddRequest bidMode(BidMode bidMode) {
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

  public AdgroupsAddRequest autoAcquisitionEnabled(Boolean autoAcquisitionEnabled) {
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

  public AdgroupsAddRequest autoAcquisitionBudget(Long autoAcquisitionBudget) {
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

  public AdgroupsAddRequest smartBidType(SmartBidType smartBidType) {
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

  public AdgroupsAddRequest smartCostCap(Long smartCostCap) {
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

  public AdgroupsAddRequest autoDerivedCreativeEnabled(Boolean autoDerivedCreativeEnabled) {
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

  public AdgroupsAddRequest searchExpandTargetingSwitch(
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

  public AdgroupsAddRequest autoDerivedLandingPageSwitch(Boolean autoDerivedLandingPageSwitch) {
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

  public AdgroupsAddRequest bidScene(BidScene bidScene) {
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

  public AdgroupsAddRequest configuredStatus(ConfiguredStatus configuredStatus) {
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

  public AdgroupsAddRequest flowOptimizationEnabled(Boolean flowOptimizationEnabled) {
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

  public AdgroupsAddRequest materialPackageId(Long materialPackageId) {
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

  public AdgroupsAddRequest marketingAssetId(Long marketingAssetId) {
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

  public AdgroupsAddRequest marketingAssetOuterSpec(
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

  public AdgroupsAddRequest poiList(List<String> poiList) {
    this.poiList = poiList;
    return this;
  }

  public AdgroupsAddRequest addPoiListItem(String poiListItem) {
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

  public AdgroupsAddRequest explorationStrategy(SiteSetExplorationStrategy explorationStrategy) {
    this.explorationStrategy = explorationStrategy;
    return this;
  }

  /**
   * Get explorationStrategy
   *
   * @return explorationStrategy
   */
  @ApiModelProperty(value = "")
  public SiteSetExplorationStrategy getExplorationStrategy() {
    return explorationStrategy;
  }

  public void setExplorationStrategy(SiteSetExplorationStrategy explorationStrategy) {
    this.explorationStrategy = explorationStrategy;
  }

  public AdgroupsAddRequest prioritySiteSet(List<String> prioritySiteSet) {
    this.prioritySiteSet = prioritySiteSet;
    return this;
  }

  public AdgroupsAddRequest addPrioritySiteSetItem(String prioritySiteSetItem) {
    if (this.prioritySiteSet == null) {
      this.prioritySiteSet = new ArrayList<String>();
    }
    this.prioritySiteSet.add(prioritySiteSetItem);
    return this;
  }

  /**
   * Get prioritySiteSet
   *
   * @return prioritySiteSet
   */
  @ApiModelProperty(value = "")
  public List<String> getPrioritySiteSet() {
    return prioritySiteSet;
  }

  public void setPrioritySiteSet(List<String> prioritySiteSet) {
    this.prioritySiteSet = prioritySiteSet;
  }

  public AdgroupsAddRequest ecomPkamSwitch(EcomPkamSwitch ecomPkamSwitch) {
    this.ecomPkamSwitch = ecomPkamSwitch;
    return this;
  }

  /**
   * Get ecomPkamSwitch
   *
   * @return ecomPkamSwitch
   */
  @ApiModelProperty(value = "")
  public EcomPkamSwitch getEcomPkamSwitch() {
    return ecomPkamSwitch;
  }

  public void setEcomPkamSwitch(EcomPkamSwitch ecomPkamSwitch) {
    this.ecomPkamSwitch = ecomPkamSwitch;
  }

  public AdgroupsAddRequest forwardLinkAssist(OptimizationGoal forwardLinkAssist) {
    this.forwardLinkAssist = forwardLinkAssist;
    return this;
  }

  /**
   * Get forwardLinkAssist
   *
   * @return forwardLinkAssist
   */
  @ApiModelProperty(value = "")
  public OptimizationGoal getForwardLinkAssist() {
    return forwardLinkAssist;
  }

  public void setForwardLinkAssist(OptimizationGoal forwardLinkAssist) {
    this.forwardLinkAssist = forwardLinkAssist;
  }

  public AdgroupsAddRequest rtaId(Long rtaId) {
    this.rtaId = rtaId;
    return this;
  }

  /**
   * Get rtaId
   *
   * @return rtaId
   */
  @ApiModelProperty(value = "")
  public Long getRtaId() {
    return rtaId;
  }

  public void setRtaId(Long rtaId) {
    this.rtaId = rtaId;
  }

  public AdgroupsAddRequest rtaTargetId(String rtaTargetId) {
    this.rtaTargetId = rtaTargetId;
    return this;
  }

  /**
   * Get rtaTargetId
   *
   * @return rtaTargetId
   */
  @ApiModelProperty(value = "")
  public String getRtaTargetId() {
    return rtaTargetId;
  }

  public void setRtaTargetId(String rtaTargetId) {
    this.rtaTargetId = rtaTargetId;
  }

  public AdgroupsAddRequest mpaSpec(MpaSpec mpaSpec) {
    this.mpaSpec = mpaSpec;
    return this;
  }

  /**
   * Get mpaSpec
   *
   * @return mpaSpec
   */
  @ApiModelProperty(value = "")
  public MpaSpec getMpaSpec() {
    return mpaSpec;
  }

  public void setMpaSpec(MpaSpec mpaSpec) {
    this.mpaSpec = mpaSpec;
  }

  public AdgroupsAddRequest costConstraintScene(CostConstraintScene costConstraintScene) {
    this.costConstraintScene = costConstraintScene;
    return this;
  }

  /**
   * Get costConstraintScene
   *
   * @return costConstraintScene
   */
  @ApiModelProperty(value = "")
  public CostConstraintScene getCostConstraintScene() {
    return costConstraintScene;
  }

  public void setCostConstraintScene(CostConstraintScene costConstraintScene) {
    this.costConstraintScene = costConstraintScene;
  }

  public AdgroupsAddRequest customCostCap(Long customCostCap) {
    this.customCostCap = customCostCap;
    return this;
  }

  /**
   * Get customCostCap
   *
   * @return customCostCap
   */
  @ApiModelProperty(value = "")
  public Long getCustomCostCap() {
    return customCostCap;
  }

  public void setCustomCostCap(Long customCostCap) {
    this.customCostCap = customCostCap;
  }

  public AdgroupsAddRequest feedbackId(Long feedbackId) {
    this.feedbackId = feedbackId;
    return this;
  }

  /**
   * Get feedbackId
   *
   * @return feedbackId
   */
  @ApiModelProperty(value = "")
  public Long getFeedbackId() {
    return feedbackId;
  }

  public void setFeedbackId(Long feedbackId) {
    this.feedbackId = feedbackId;
  }

  public AdgroupsAddRequest shortPlayPayType(ShortPlayPayType shortPlayPayType) {
    this.shortPlayPayType = shortPlayPayType;
    return this;
  }

  /**
   * Get shortPlayPayType
   *
   * @return shortPlayPayType
   */
  @ApiModelProperty(value = "")
  public ShortPlayPayType getShortPlayPayType() {
    return shortPlayPayType;
  }

  public void setShortPlayPayType(ShortPlayPayType shortPlayPayType) {
    this.shortPlayPayType = shortPlayPayType;
  }

  public AdgroupsAddRequest sellStrategyId(Long sellStrategyId) {
    this.sellStrategyId = sellStrategyId;
    return this;
  }

  /**
   * Get sellStrategyId
   *
   * @return sellStrategyId
   */
  @ApiModelProperty(value = "")
  public Long getSellStrategyId() {
    return sellStrategyId;
  }

  public void setSellStrategyId(Long sellStrategyId) {
    this.sellStrategyId = sellStrategyId;
  }

  public AdgroupsAddRequest dynamicAdType(DynamicAdType dynamicAdType) {
    this.dynamicAdType = dynamicAdType;
    return this;
  }

  /**
   * Get dynamicAdType
   *
   * @return dynamicAdType
   */
  @ApiModelProperty(value = "")
  public DynamicAdType getDynamicAdType() {
    return dynamicAdType;
  }

  public void setDynamicAdType(DynamicAdType dynamicAdType) {
    this.dynamicAdType = dynamicAdType;
  }

  public AdgroupsAddRequest ogCompletionType(OgCompletionType ogCompletionType) {
    this.ogCompletionType = ogCompletionType;
    return this;
  }

  /**
   * Get ogCompletionType
   *
   * @return ogCompletionType
   */
  @ApiModelProperty(value = "")
  public OgCompletionType getOgCompletionType() {
    return ogCompletionType;
  }

  public void setOgCompletionType(OgCompletionType ogCompletionType) {
    this.ogCompletionType = ogCompletionType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdgroupsAddRequest adgroupsAddRequest = (AdgroupsAddRequest) o;
    return Objects.equals(this.accountId, adgroupsAddRequest.accountId)
        && Objects.equals(this.adgroupName, adgroupsAddRequest.adgroupName)
        && Objects.equals(this.marketingGoal, adgroupsAddRequest.marketingGoal)
        && Objects.equals(this.marketingSubGoal, adgroupsAddRequest.marketingSubGoal)
        && Objects.equals(this.marketingCarrierType, adgroupsAddRequest.marketingCarrierType)
        && Objects.equals(this.marketingCarrierDetail, adgroupsAddRequest.marketingCarrierDetail)
        && Objects.equals(this.beginDate, adgroupsAddRequest.beginDate)
        && Objects.equals(this.endDate, adgroupsAddRequest.endDate)
        && Objects.equals(this.firstDayBeginTime, adgroupsAddRequest.firstDayBeginTime)
        && Objects.equals(this.bidAmount, adgroupsAddRequest.bidAmount)
        && Objects.equals(this.optimizationGoal, adgroupsAddRequest.optimizationGoal)
        && Objects.equals(this.timeSeries, adgroupsAddRequest.timeSeries)
        && Objects.equals(this.automaticSiteEnabled, adgroupsAddRequest.automaticSiteEnabled)
        && Objects.equals(this.siteSet, adgroupsAddRequest.siteSet)
        && Objects.equals(this.dailyBudget, adgroupsAddRequest.dailyBudget)
        && Objects.equals(this.targeting, adgroupsAddRequest.targeting)
        && Objects.equals(this.sceneSpec, adgroupsAddRequest.sceneSpec)
        && Objects.equals(this.userActionSets, adgroupsAddRequest.userActionSets)
        && Objects.equals(this.bidStrategy, adgroupsAddRequest.bidStrategy)
        && Objects.equals(this.deepConversionSpec, adgroupsAddRequest.deepConversionSpec)
        && Objects.equals(this.conversionId, adgroupsAddRequest.conversionId)
        && Objects.equals(
            this.deepConversionBehaviorBid, adgroupsAddRequest.deepConversionBehaviorBid)
        && Objects.equals(this.deepConversionWorthRate, adgroupsAddRequest.deepConversionWorthRate)
        && Objects.equals(
            this.deepConversionWorthAdvancedRate,
            adgroupsAddRequest.deepConversionWorthAdvancedRate)
        && Objects.equals(
            this.deepConversionBehaviorAdvancedBid,
            adgroupsAddRequest.deepConversionBehaviorAdvancedBid)
        && Objects.equals(this.bidMode, adgroupsAddRequest.bidMode)
        && Objects.equals(this.autoAcquisitionEnabled, adgroupsAddRequest.autoAcquisitionEnabled)
        && Objects.equals(this.autoAcquisitionBudget, adgroupsAddRequest.autoAcquisitionBudget)
        && Objects.equals(this.smartBidType, adgroupsAddRequest.smartBidType)
        && Objects.equals(this.smartCostCap, adgroupsAddRequest.smartCostCap)
        && Objects.equals(
            this.autoDerivedCreativeEnabled, adgroupsAddRequest.autoDerivedCreativeEnabled)
        && Objects.equals(
            this.searchExpandTargetingSwitch, adgroupsAddRequest.searchExpandTargetingSwitch)
        && Objects.equals(
            this.autoDerivedLandingPageSwitch, adgroupsAddRequest.autoDerivedLandingPageSwitch)
        && Objects.equals(this.bidScene, adgroupsAddRequest.bidScene)
        && Objects.equals(this.configuredStatus, adgroupsAddRequest.configuredStatus)
        && Objects.equals(this.flowOptimizationEnabled, adgroupsAddRequest.flowOptimizationEnabled)
        && Objects.equals(this.materialPackageId, adgroupsAddRequest.materialPackageId)
        && Objects.equals(this.marketingAssetId, adgroupsAddRequest.marketingAssetId)
        && Objects.equals(this.marketingAssetOuterSpec, adgroupsAddRequest.marketingAssetOuterSpec)
        && Objects.equals(this.poiList, adgroupsAddRequest.poiList)
        && Objects.equals(this.explorationStrategy, adgroupsAddRequest.explorationStrategy)
        && Objects.equals(this.prioritySiteSet, adgroupsAddRequest.prioritySiteSet)
        && Objects.equals(this.ecomPkamSwitch, adgroupsAddRequest.ecomPkamSwitch)
        && Objects.equals(this.forwardLinkAssist, adgroupsAddRequest.forwardLinkAssist)
        && Objects.equals(this.rtaId, adgroupsAddRequest.rtaId)
        && Objects.equals(this.rtaTargetId, adgroupsAddRequest.rtaTargetId)
        && Objects.equals(this.mpaSpec, adgroupsAddRequest.mpaSpec)
        && Objects.equals(this.costConstraintScene, adgroupsAddRequest.costConstraintScene)
        && Objects.equals(this.customCostCap, adgroupsAddRequest.customCostCap)
        && Objects.equals(this.feedbackId, adgroupsAddRequest.feedbackId)
        && Objects.equals(this.shortPlayPayType, adgroupsAddRequest.shortPlayPayType)
        && Objects.equals(this.sellStrategyId, adgroupsAddRequest.sellStrategyId)
        && Objects.equals(this.dynamicAdType, adgroupsAddRequest.dynamicAdType)
        && Objects.equals(this.ogCompletionType, adgroupsAddRequest.ogCompletionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        adgroupName,
        marketingGoal,
        marketingSubGoal,
        marketingCarrierType,
        marketingCarrierDetail,
        beginDate,
        endDate,
        firstDayBeginTime,
        bidAmount,
        optimizationGoal,
        timeSeries,
        automaticSiteEnabled,
        siteSet,
        dailyBudget,
        targeting,
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
        bidScene,
        configuredStatus,
        flowOptimizationEnabled,
        materialPackageId,
        marketingAssetId,
        marketingAssetOuterSpec,
        poiList,
        explorationStrategy,
        prioritySiteSet,
        ecomPkamSwitch,
        forwardLinkAssist,
        rtaId,
        rtaTargetId,
        mpaSpec,
        costConstraintScene,
        customCostCap,
        feedbackId,
        shortPlayPayType,
        sellStrategyId,
        dynamicAdType,
        ogCompletionType);
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

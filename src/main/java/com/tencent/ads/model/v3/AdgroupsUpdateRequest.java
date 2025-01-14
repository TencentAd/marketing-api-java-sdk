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

/** AdgroupsUpdateRequest */
public class AdgroupsUpdateRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("adgroup_id")
  private Long adgroupId = null;

  @SerializedName("adgroup_name")
  private String adgroupName = null;

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

  @SerializedName("daily_budget")
  private Long dailyBudget = null;

  @SerializedName("targeting")
  private WriteTargetingSetting targeting = null;

  @SerializedName("scene_spec")
  private SceneTargetingForWrite sceneSpec = null;

  @SerializedName("user_action_sets")
  private List<UserActionSetStruct> userActionSets = null;

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

  @SerializedName("auto_derived_landing_page_switch")
  private Boolean autoDerivedLandingPageSwitch = null;

  @SerializedName("auto_derived_creative_enabled")
  private Boolean autoDerivedCreativeEnabled = null;

  @SerializedName("configured_status")
  private ConfiguredStatus configuredStatus = null;

  @SerializedName("flow_optimization_enabled")
  private Boolean flowOptimizationEnabled = null;

  @SerializedName("poi_list")
  private List<String> poiList = null;

  @SerializedName("ecom_pkam_switch")
  private EcomPkamSwitch ecomPkamSwitch = null;

  @SerializedName("rta_id")
  private Long rtaId = null;

  @SerializedName("rta_target_id")
  private String rtaTargetId = null;

  @SerializedName("cost_constraint_scene")
  private CostConstraintScene costConstraintScene = null;

  @SerializedName("custom_cost_cap")
  private Long customCostCap = null;

  @SerializedName("feedback_id")
  private Long feedbackId = null;

  @SerializedName("aoi_optimization_strategy")
  private AoiOptimizationStrategy aoiOptimizationStrategy = null;

  @SerializedName("search_expand_targeting_switch")
  private SearchExpandTargetingSwitch searchExpandTargetingSwitch = null;

  @SerializedName("cloud_union_spec")
  private CloudUnionSpec cloudUnionSpec = null;

  @SerializedName("live_recommend_strategy_enabled")
  private Boolean liveRecommendStrategyEnabled = null;

  @SerializedName("custom_cost_roi_cap")
  private Double customCostRoiCap = null;

  public AdgroupsUpdateRequest accountId(Long accountId) {
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

  public AdgroupsUpdateRequest adgroupId(Long adgroupId) {
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

  public AdgroupsUpdateRequest adgroupName(String adgroupName) {
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

  public AdgroupsUpdateRequest beginDate(String beginDate) {
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

  public AdgroupsUpdateRequest endDate(String endDate) {
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

  public AdgroupsUpdateRequest firstDayBeginTime(String firstDayBeginTime) {
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

  public AdgroupsUpdateRequest bidAmount(Long bidAmount) {
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

  public AdgroupsUpdateRequest optimizationGoal(OptimizationGoal optimizationGoal) {
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

  public AdgroupsUpdateRequest timeSeries(String timeSeries) {
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

  public AdgroupsUpdateRequest dailyBudget(Long dailyBudget) {
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

  public AdgroupsUpdateRequest targeting(WriteTargetingSetting targeting) {
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

  public AdgroupsUpdateRequest sceneSpec(SceneTargetingForWrite sceneSpec) {
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

  public AdgroupsUpdateRequest userActionSets(List<UserActionSetStruct> userActionSets) {
    this.userActionSets = userActionSets;
    return this;
  }

  public AdgroupsUpdateRequest addUserActionSetsItem(UserActionSetStruct userActionSetsItem) {
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

  public AdgroupsUpdateRequest deepConversionSpec(DeepConversionSpec deepConversionSpec) {
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

  public AdgroupsUpdateRequest conversionId(Long conversionId) {
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

  public AdgroupsUpdateRequest deepConversionBehaviorBid(Long deepConversionBehaviorBid) {
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

  public AdgroupsUpdateRequest deepConversionWorthRate(Double deepConversionWorthRate) {
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

  public AdgroupsUpdateRequest deepConversionWorthAdvancedRate(
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

  public AdgroupsUpdateRequest deepConversionBehaviorAdvancedBid(
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

  public AdgroupsUpdateRequest bidMode(BidMode bidMode) {
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

  public AdgroupsUpdateRequest autoAcquisitionEnabled(Boolean autoAcquisitionEnabled) {
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

  public AdgroupsUpdateRequest autoAcquisitionBudget(Long autoAcquisitionBudget) {
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

  public AdgroupsUpdateRequest autoDerivedLandingPageSwitch(Boolean autoDerivedLandingPageSwitch) {
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

  public AdgroupsUpdateRequest autoDerivedCreativeEnabled(Boolean autoDerivedCreativeEnabled) {
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

  public AdgroupsUpdateRequest configuredStatus(ConfiguredStatus configuredStatus) {
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

  public AdgroupsUpdateRequest flowOptimizationEnabled(Boolean flowOptimizationEnabled) {
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

  public AdgroupsUpdateRequest poiList(List<String> poiList) {
    this.poiList = poiList;
    return this;
  }

  public AdgroupsUpdateRequest addPoiListItem(String poiListItem) {
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

  public AdgroupsUpdateRequest ecomPkamSwitch(EcomPkamSwitch ecomPkamSwitch) {
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

  public AdgroupsUpdateRequest rtaId(Long rtaId) {
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

  public AdgroupsUpdateRequest rtaTargetId(String rtaTargetId) {
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

  public AdgroupsUpdateRequest costConstraintScene(CostConstraintScene costConstraintScene) {
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

  public AdgroupsUpdateRequest customCostCap(Long customCostCap) {
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

  public AdgroupsUpdateRequest feedbackId(Long feedbackId) {
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

  public AdgroupsUpdateRequest aoiOptimizationStrategy(
      AoiOptimizationStrategy aoiOptimizationStrategy) {
    this.aoiOptimizationStrategy = aoiOptimizationStrategy;
    return this;
  }

  /**
   * Get aoiOptimizationStrategy
   *
   * @return aoiOptimizationStrategy
   */
  @ApiModelProperty(value = "")
  public AoiOptimizationStrategy getAoiOptimizationStrategy() {
    return aoiOptimizationStrategy;
  }

  public void setAoiOptimizationStrategy(AoiOptimizationStrategy aoiOptimizationStrategy) {
    this.aoiOptimizationStrategy = aoiOptimizationStrategy;
  }

  public AdgroupsUpdateRequest searchExpandTargetingSwitch(
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

  public AdgroupsUpdateRequest cloudUnionSpec(CloudUnionSpec cloudUnionSpec) {
    this.cloudUnionSpec = cloudUnionSpec;
    return this;
  }

  /**
   * Get cloudUnionSpec
   *
   * @return cloudUnionSpec
   */
  @ApiModelProperty(value = "")
  public CloudUnionSpec getCloudUnionSpec() {
    return cloudUnionSpec;
  }

  public void setCloudUnionSpec(CloudUnionSpec cloudUnionSpec) {
    this.cloudUnionSpec = cloudUnionSpec;
  }

  public AdgroupsUpdateRequest liveRecommendStrategyEnabled(Boolean liveRecommendStrategyEnabled) {
    this.liveRecommendStrategyEnabled = liveRecommendStrategyEnabled;
    return this;
  }

  /**
   * Get liveRecommendStrategyEnabled
   *
   * @return liveRecommendStrategyEnabled
   */
  @ApiModelProperty(value = "")
  public Boolean isLiveRecommendStrategyEnabled() {
    return liveRecommendStrategyEnabled;
  }

  public void setLiveRecommendStrategyEnabled(Boolean liveRecommendStrategyEnabled) {
    this.liveRecommendStrategyEnabled = liveRecommendStrategyEnabled;
  }

  public AdgroupsUpdateRequest customCostRoiCap(Double customCostRoiCap) {
    this.customCostRoiCap = customCostRoiCap;
    return this;
  }

  /**
   * Get customCostRoiCap
   *
   * @return customCostRoiCap
   */
  @ApiModelProperty(value = "")
  public Double getCustomCostRoiCap() {
    return customCostRoiCap;
  }

  public void setCustomCostRoiCap(Double customCostRoiCap) {
    this.customCostRoiCap = customCostRoiCap;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdgroupsUpdateRequest adgroupsUpdateRequest = (AdgroupsUpdateRequest) o;
    return Objects.equals(this.accountId, adgroupsUpdateRequest.accountId)
        && Objects.equals(this.adgroupId, adgroupsUpdateRequest.adgroupId)
        && Objects.equals(this.adgroupName, adgroupsUpdateRequest.adgroupName)
        && Objects.equals(this.beginDate, adgroupsUpdateRequest.beginDate)
        && Objects.equals(this.endDate, adgroupsUpdateRequest.endDate)
        && Objects.equals(this.firstDayBeginTime, adgroupsUpdateRequest.firstDayBeginTime)
        && Objects.equals(this.bidAmount, adgroupsUpdateRequest.bidAmount)
        && Objects.equals(this.optimizationGoal, adgroupsUpdateRequest.optimizationGoal)
        && Objects.equals(this.timeSeries, adgroupsUpdateRequest.timeSeries)
        && Objects.equals(this.dailyBudget, adgroupsUpdateRequest.dailyBudget)
        && Objects.equals(this.targeting, adgroupsUpdateRequest.targeting)
        && Objects.equals(this.sceneSpec, adgroupsUpdateRequest.sceneSpec)
        && Objects.equals(this.userActionSets, adgroupsUpdateRequest.userActionSets)
        && Objects.equals(this.deepConversionSpec, adgroupsUpdateRequest.deepConversionSpec)
        && Objects.equals(this.conversionId, adgroupsUpdateRequest.conversionId)
        && Objects.equals(
            this.deepConversionBehaviorBid, adgroupsUpdateRequest.deepConversionBehaviorBid)
        && Objects.equals(
            this.deepConversionWorthRate, adgroupsUpdateRequest.deepConversionWorthRate)
        && Objects.equals(
            this.deepConversionWorthAdvancedRate,
            adgroupsUpdateRequest.deepConversionWorthAdvancedRate)
        && Objects.equals(
            this.deepConversionBehaviorAdvancedBid,
            adgroupsUpdateRequest.deepConversionBehaviorAdvancedBid)
        && Objects.equals(this.bidMode, adgroupsUpdateRequest.bidMode)
        && Objects.equals(this.autoAcquisitionEnabled, adgroupsUpdateRequest.autoAcquisitionEnabled)
        && Objects.equals(this.autoAcquisitionBudget, adgroupsUpdateRequest.autoAcquisitionBudget)
        && Objects.equals(
            this.autoDerivedLandingPageSwitch, adgroupsUpdateRequest.autoDerivedLandingPageSwitch)
        && Objects.equals(
            this.autoDerivedCreativeEnabled, adgroupsUpdateRequest.autoDerivedCreativeEnabled)
        && Objects.equals(this.configuredStatus, adgroupsUpdateRequest.configuredStatus)
        && Objects.equals(
            this.flowOptimizationEnabled, adgroupsUpdateRequest.flowOptimizationEnabled)
        && Objects.equals(this.poiList, adgroupsUpdateRequest.poiList)
        && Objects.equals(this.ecomPkamSwitch, adgroupsUpdateRequest.ecomPkamSwitch)
        && Objects.equals(this.rtaId, adgroupsUpdateRequest.rtaId)
        && Objects.equals(this.rtaTargetId, adgroupsUpdateRequest.rtaTargetId)
        && Objects.equals(this.costConstraintScene, adgroupsUpdateRequest.costConstraintScene)
        && Objects.equals(this.customCostCap, adgroupsUpdateRequest.customCostCap)
        && Objects.equals(this.feedbackId, adgroupsUpdateRequest.feedbackId)
        && Objects.equals(
            this.aoiOptimizationStrategy, adgroupsUpdateRequest.aoiOptimizationStrategy)
        && Objects.equals(
            this.searchExpandTargetingSwitch, adgroupsUpdateRequest.searchExpandTargetingSwitch)
        && Objects.equals(this.cloudUnionSpec, adgroupsUpdateRequest.cloudUnionSpec)
        && Objects.equals(
            this.liveRecommendStrategyEnabled, adgroupsUpdateRequest.liveRecommendStrategyEnabled)
        && Objects.equals(this.customCostRoiCap, adgroupsUpdateRequest.customCostRoiCap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        adgroupId,
        adgroupName,
        beginDate,
        endDate,
        firstDayBeginTime,
        bidAmount,
        optimizationGoal,
        timeSeries,
        dailyBudget,
        targeting,
        sceneSpec,
        userActionSets,
        deepConversionSpec,
        conversionId,
        deepConversionBehaviorBid,
        deepConversionWorthRate,
        deepConversionWorthAdvancedRate,
        deepConversionBehaviorAdvancedBid,
        bidMode,
        autoAcquisitionEnabled,
        autoAcquisitionBudget,
        autoDerivedLandingPageSwitch,
        autoDerivedCreativeEnabled,
        configuredStatus,
        flowOptimizationEnabled,
        poiList,
        ecomPkamSwitch,
        rtaId,
        rtaTargetId,
        costConstraintScene,
        customCostCap,
        feedbackId,
        aoiOptimizationStrategy,
        searchExpandTargetingSwitch,
        cloudUnionSpec,
        liveRecommendStrategyEnabled,
        customCostRoiCap);
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

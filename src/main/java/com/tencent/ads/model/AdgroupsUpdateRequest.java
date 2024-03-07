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

/** AdgroupsUpdateRequest */
public class AdgroupsUpdateRequest {
  @SerializedName("adgroup_id")
  private Long adgroupId = null;

  @SerializedName("adgroup_name")
  private String adgroupName = null;

  @SerializedName("begin_date")
  private String beginDate = null;

  @SerializedName("first_day_begin_time")
  private String firstDayBeginTime = null;

  @SerializedName("end_date")
  private String endDate = null;

  @SerializedName("bid_amount")
  private Long bidAmount = null;

  @SerializedName("conversion_id")
  private Long conversionId = null;

  @SerializedName("optimization_goal")
  private OptimizationGoal optimizationGoal = null;

  @SerializedName("time_series")
  private String timeSeries = null;

  @SerializedName("daily_budget")
  private Long dailyBudget = null;

  @SerializedName("app_android_channel_package_id")
  private String appAndroidChannelPackageId = null;

  @SerializedName("targeting_id")
  private Long targetingId = null;

  @SerializedName("targeting")
  private WriteTargetingSettingForAdgroup targeting = null;

  @SerializedName("scene_spec")
  private SceneTargetingForWrite sceneSpec = null;

  @SerializedName("flow_optimization_enabled")
  private Boolean flowOptimizationEnabled = null;

  @SerializedName("configured_status")
  private AdStatus configuredStatus = null;

  @SerializedName("customized_category")
  private String customizedCategory = null;

  @SerializedName("additional_user_action_sets")
  private List<UserActionSetStruct> additionalUserActionSets = null;

  @SerializedName("bid_strategy")
  private BidStrategy bidStrategy = null;

  @SerializedName("cold_start_audience")
  private List<Long> coldStartAudience = null;

  @SerializedName("auto_audience")
  private Boolean autoAudience = null;

  @SerializedName("expand_enabled")
  private Boolean expandEnabled = null;

  @SerializedName("expand_targeting")
  private List<String> expandTargeting = null;

  @SerializedName("deep_conversion_spec")
  private DeepConversionSpec deepConversionSpec = null;

  @SerializedName("poi_list")
  private List<String> poiList = null;

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

  @SerializedName("bid_adjustment")
  private BidAdjustment bidAdjustment = null;

  @SerializedName("auto_acquisition_enabled")
  private Boolean autoAcquisitionEnabled = null;

  @SerializedName("auto_acquisition_budget")
  private Long autoAcquisitionBudget = null;

  @SerializedName("auto_derived_creative_enabled")
  private Boolean autoDerivedCreativeEnabled = null;

  @SerializedName("auto_derived_creative_status")
  private AutoDerivedCreativeStatus autoDerivedCreativeStatus = null;

  @SerializedName("live_video_mode")
  private LiveVideoMode liveVideoMode = null;

  @SerializedName("live_video_sub_mode")
  private LiveVideoSubMode liveVideoSubMode = null;

  @SerializedName("user_action_sets")
  private List<UserActionSetStruct> userActionSets = null;

  @SerializedName("dynamic_ad_spec")
  private DynamicAdSpec dynamicAdSpec = null;

  @SerializedName("custom_adgroup_tag")
  private List<String> customAdgroupTag = null;

  @SerializedName("smart_targeting")
  private SmartTargeting smartTargeting = null;

  @SerializedName("dynamic_creative_id_set")
  private List<Long> dynamicCreativeIdSet = null;

  @SerializedName("auto_derived_landing_page_switch")
  private Boolean autoDerivedLandingPageSwitch = null;

  @SerializedName("ecom_pkam_switch")
  private EcomPkamSwitch ecomPkamSwitch = null;

  @SerializedName("account_id")
  private Long accountId = null;

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

  public AdgroupsUpdateRequest appAndroidChannelPackageId(String appAndroidChannelPackageId) {
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

  public AdgroupsUpdateRequest targetingId(Long targetingId) {
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

  public AdgroupsUpdateRequest targeting(WriteTargetingSettingForAdgroup targeting) {
    this.targeting = targeting;
    return this;
  }

  /**
   * Get targeting
   *
   * @return targeting
   */
  @ApiModelProperty(value = "")
  public WriteTargetingSettingForAdgroup getTargeting() {
    return targeting;
  }

  public void setTargeting(WriteTargetingSettingForAdgroup targeting) {
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

  public AdgroupsUpdateRequest configuredStatus(AdStatus configuredStatus) {
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

  public AdgroupsUpdateRequest customizedCategory(String customizedCategory) {
    this.customizedCategory = customizedCategory;
    return this;
  }

  /**
   * Get customizedCategory
   *
   * @return customizedCategory
   */
  @ApiModelProperty(value = "")
  public String getCustomizedCategory() {
    return customizedCategory;
  }

  public void setCustomizedCategory(String customizedCategory) {
    this.customizedCategory = customizedCategory;
  }

  public AdgroupsUpdateRequest additionalUserActionSets(
      List<UserActionSetStruct> additionalUserActionSets) {
    this.additionalUserActionSets = additionalUserActionSets;
    return this;
  }

  public AdgroupsUpdateRequest addAdditionalUserActionSetsItem(
      UserActionSetStruct additionalUserActionSetsItem) {
    if (this.additionalUserActionSets == null) {
      this.additionalUserActionSets = new ArrayList<UserActionSetStruct>();
    }
    this.additionalUserActionSets.add(additionalUserActionSetsItem);
    return this;
  }

  /**
   * Get additionalUserActionSets
   *
   * @return additionalUserActionSets
   */
  @ApiModelProperty(value = "")
  public List<UserActionSetStruct> getAdditionalUserActionSets() {
    return additionalUserActionSets;
  }

  public void setAdditionalUserActionSets(List<UserActionSetStruct> additionalUserActionSets) {
    this.additionalUserActionSets = additionalUserActionSets;
  }

  public AdgroupsUpdateRequest bidStrategy(BidStrategy bidStrategy) {
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

  public AdgroupsUpdateRequest coldStartAudience(List<Long> coldStartAudience) {
    this.coldStartAudience = coldStartAudience;
    return this;
  }

  public AdgroupsUpdateRequest addColdStartAudienceItem(Long coldStartAudienceItem) {
    if (this.coldStartAudience == null) {
      this.coldStartAudience = new ArrayList<Long>();
    }
    this.coldStartAudience.add(coldStartAudienceItem);
    return this;
  }

  /**
   * Get coldStartAudience
   *
   * @return coldStartAudience
   */
  @ApiModelProperty(value = "")
  public List<Long> getColdStartAudience() {
    return coldStartAudience;
  }

  public void setColdStartAudience(List<Long> coldStartAudience) {
    this.coldStartAudience = coldStartAudience;
  }

  public AdgroupsUpdateRequest autoAudience(Boolean autoAudience) {
    this.autoAudience = autoAudience;
    return this;
  }

  /**
   * Get autoAudience
   *
   * @return autoAudience
   */
  @ApiModelProperty(value = "")
  public Boolean isAutoAudience() {
    return autoAudience;
  }

  public void setAutoAudience(Boolean autoAudience) {
    this.autoAudience = autoAudience;
  }

  public AdgroupsUpdateRequest expandEnabled(Boolean expandEnabled) {
    this.expandEnabled = expandEnabled;
    return this;
  }

  /**
   * Get expandEnabled
   *
   * @return expandEnabled
   */
  @ApiModelProperty(value = "")
  public Boolean isExpandEnabled() {
    return expandEnabled;
  }

  public void setExpandEnabled(Boolean expandEnabled) {
    this.expandEnabled = expandEnabled;
  }

  public AdgroupsUpdateRequest expandTargeting(List<String> expandTargeting) {
    this.expandTargeting = expandTargeting;
    return this;
  }

  public AdgroupsUpdateRequest addExpandTargetingItem(String expandTargetingItem) {
    if (this.expandTargeting == null) {
      this.expandTargeting = new ArrayList<String>();
    }
    this.expandTargeting.add(expandTargetingItem);
    return this;
  }

  /**
   * Get expandTargeting
   *
   * @return expandTargeting
   */
  @ApiModelProperty(value = "")
  public List<String> getExpandTargeting() {
    return expandTargeting;
  }

  public void setExpandTargeting(List<String> expandTargeting) {
    this.expandTargeting = expandTargeting;
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

  public AdgroupsUpdateRequest bidAdjustment(BidAdjustment bidAdjustment) {
    this.bidAdjustment = bidAdjustment;
    return this;
  }

  /**
   * Get bidAdjustment
   *
   * @return bidAdjustment
   */
  @ApiModelProperty(value = "")
  public BidAdjustment getBidAdjustment() {
    return bidAdjustment;
  }

  public void setBidAdjustment(BidAdjustment bidAdjustment) {
    this.bidAdjustment = bidAdjustment;
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

  public AdgroupsUpdateRequest autoDerivedCreativeStatus(
      AutoDerivedCreativeStatus autoDerivedCreativeStatus) {
    this.autoDerivedCreativeStatus = autoDerivedCreativeStatus;
    return this;
  }

  /**
   * Get autoDerivedCreativeStatus
   *
   * @return autoDerivedCreativeStatus
   */
  @ApiModelProperty(value = "")
  public AutoDerivedCreativeStatus getAutoDerivedCreativeStatus() {
    return autoDerivedCreativeStatus;
  }

  public void setAutoDerivedCreativeStatus(AutoDerivedCreativeStatus autoDerivedCreativeStatus) {
    this.autoDerivedCreativeStatus = autoDerivedCreativeStatus;
  }

  public AdgroupsUpdateRequest liveVideoMode(LiveVideoMode liveVideoMode) {
    this.liveVideoMode = liveVideoMode;
    return this;
  }

  /**
   * Get liveVideoMode
   *
   * @return liveVideoMode
   */
  @ApiModelProperty(value = "")
  public LiveVideoMode getLiveVideoMode() {
    return liveVideoMode;
  }

  public void setLiveVideoMode(LiveVideoMode liveVideoMode) {
    this.liveVideoMode = liveVideoMode;
  }

  public AdgroupsUpdateRequest liveVideoSubMode(LiveVideoSubMode liveVideoSubMode) {
    this.liveVideoSubMode = liveVideoSubMode;
    return this;
  }

  /**
   * Get liveVideoSubMode
   *
   * @return liveVideoSubMode
   */
  @ApiModelProperty(value = "")
  public LiveVideoSubMode getLiveVideoSubMode() {
    return liveVideoSubMode;
  }

  public void setLiveVideoSubMode(LiveVideoSubMode liveVideoSubMode) {
    this.liveVideoSubMode = liveVideoSubMode;
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

  public AdgroupsUpdateRequest dynamicAdSpec(DynamicAdSpec dynamicAdSpec) {
    this.dynamicAdSpec = dynamicAdSpec;
    return this;
  }

  /**
   * Get dynamicAdSpec
   *
   * @return dynamicAdSpec
   */
  @ApiModelProperty(value = "")
  public DynamicAdSpec getDynamicAdSpec() {
    return dynamicAdSpec;
  }

  public void setDynamicAdSpec(DynamicAdSpec dynamicAdSpec) {
    this.dynamicAdSpec = dynamicAdSpec;
  }

  public AdgroupsUpdateRequest customAdgroupTag(List<String> customAdgroupTag) {
    this.customAdgroupTag = customAdgroupTag;
    return this;
  }

  public AdgroupsUpdateRequest addCustomAdgroupTagItem(String customAdgroupTagItem) {
    if (this.customAdgroupTag == null) {
      this.customAdgroupTag = new ArrayList<String>();
    }
    this.customAdgroupTag.add(customAdgroupTagItem);
    return this;
  }

  /**
   * Get customAdgroupTag
   *
   * @return customAdgroupTag
   */
  @ApiModelProperty(value = "")
  public List<String> getCustomAdgroupTag() {
    return customAdgroupTag;
  }

  public void setCustomAdgroupTag(List<String> customAdgroupTag) {
    this.customAdgroupTag = customAdgroupTag;
  }

  public AdgroupsUpdateRequest smartTargeting(SmartTargeting smartTargeting) {
    this.smartTargeting = smartTargeting;
    return this;
  }

  /**
   * Get smartTargeting
   *
   * @return smartTargeting
   */
  @ApiModelProperty(value = "")
  public SmartTargeting getSmartTargeting() {
    return smartTargeting;
  }

  public void setSmartTargeting(SmartTargeting smartTargeting) {
    this.smartTargeting = smartTargeting;
  }

  public AdgroupsUpdateRequest dynamicCreativeIdSet(List<Long> dynamicCreativeIdSet) {
    this.dynamicCreativeIdSet = dynamicCreativeIdSet;
    return this;
  }

  public AdgroupsUpdateRequest addDynamicCreativeIdSetItem(Long dynamicCreativeIdSetItem) {
    if (this.dynamicCreativeIdSet == null) {
      this.dynamicCreativeIdSet = new ArrayList<Long>();
    }
    this.dynamicCreativeIdSet.add(dynamicCreativeIdSetItem);
    return this;
  }

  /**
   * Get dynamicCreativeIdSet
   *
   * @return dynamicCreativeIdSet
   */
  @ApiModelProperty(value = "")
  public List<Long> getDynamicCreativeIdSet() {
    return dynamicCreativeIdSet;
  }

  public void setDynamicCreativeIdSet(List<Long> dynamicCreativeIdSet) {
    this.dynamicCreativeIdSet = dynamicCreativeIdSet;
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdgroupsUpdateRequest adgroupsUpdateRequest = (AdgroupsUpdateRequest) o;
    return Objects.equals(this.adgroupId, adgroupsUpdateRequest.adgroupId)
        && Objects.equals(this.adgroupName, adgroupsUpdateRequest.adgroupName)
        && Objects.equals(this.beginDate, adgroupsUpdateRequest.beginDate)
        && Objects.equals(this.firstDayBeginTime, adgroupsUpdateRequest.firstDayBeginTime)
        && Objects.equals(this.endDate, adgroupsUpdateRequest.endDate)
        && Objects.equals(this.bidAmount, adgroupsUpdateRequest.bidAmount)
        && Objects.equals(this.conversionId, adgroupsUpdateRequest.conversionId)
        && Objects.equals(this.optimizationGoal, adgroupsUpdateRequest.optimizationGoal)
        && Objects.equals(this.timeSeries, adgroupsUpdateRequest.timeSeries)
        && Objects.equals(this.dailyBudget, adgroupsUpdateRequest.dailyBudget)
        && Objects.equals(
            this.appAndroidChannelPackageId, adgroupsUpdateRequest.appAndroidChannelPackageId)
        && Objects.equals(this.targetingId, adgroupsUpdateRequest.targetingId)
        && Objects.equals(this.targeting, adgroupsUpdateRequest.targeting)
        && Objects.equals(this.sceneSpec, adgroupsUpdateRequest.sceneSpec)
        && Objects.equals(
            this.flowOptimizationEnabled, adgroupsUpdateRequest.flowOptimizationEnabled)
        && Objects.equals(this.configuredStatus, adgroupsUpdateRequest.configuredStatus)
        && Objects.equals(this.customizedCategory, adgroupsUpdateRequest.customizedCategory)
        && Objects.equals(
            this.additionalUserActionSets, adgroupsUpdateRequest.additionalUserActionSets)
        && Objects.equals(this.bidStrategy, adgroupsUpdateRequest.bidStrategy)
        && Objects.equals(this.coldStartAudience, adgroupsUpdateRequest.coldStartAudience)
        && Objects.equals(this.autoAudience, adgroupsUpdateRequest.autoAudience)
        && Objects.equals(this.expandEnabled, adgroupsUpdateRequest.expandEnabled)
        && Objects.equals(this.expandTargeting, adgroupsUpdateRequest.expandTargeting)
        && Objects.equals(this.deepConversionSpec, adgroupsUpdateRequest.deepConversionSpec)
        && Objects.equals(this.poiList, adgroupsUpdateRequest.poiList)
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
        && Objects.equals(this.bidAdjustment, adgroupsUpdateRequest.bidAdjustment)
        && Objects.equals(this.autoAcquisitionEnabled, adgroupsUpdateRequest.autoAcquisitionEnabled)
        && Objects.equals(this.autoAcquisitionBudget, adgroupsUpdateRequest.autoAcquisitionBudget)
        && Objects.equals(
            this.autoDerivedCreativeEnabled, adgroupsUpdateRequest.autoDerivedCreativeEnabled)
        && Objects.equals(
            this.autoDerivedCreativeStatus, adgroupsUpdateRequest.autoDerivedCreativeStatus)
        && Objects.equals(this.liveVideoMode, adgroupsUpdateRequest.liveVideoMode)
        && Objects.equals(this.liveVideoSubMode, adgroupsUpdateRequest.liveVideoSubMode)
        && Objects.equals(this.userActionSets, adgroupsUpdateRequest.userActionSets)
        && Objects.equals(this.dynamicAdSpec, adgroupsUpdateRequest.dynamicAdSpec)
        && Objects.equals(this.customAdgroupTag, adgroupsUpdateRequest.customAdgroupTag)
        && Objects.equals(this.smartTargeting, adgroupsUpdateRequest.smartTargeting)
        && Objects.equals(this.dynamicCreativeIdSet, adgroupsUpdateRequest.dynamicCreativeIdSet)
        && Objects.equals(
            this.autoDerivedLandingPageSwitch, adgroupsUpdateRequest.autoDerivedLandingPageSwitch)
        && Objects.equals(this.ecomPkamSwitch, adgroupsUpdateRequest.ecomPkamSwitch)
        && Objects.equals(this.accountId, adgroupsUpdateRequest.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        adgroupId,
        adgroupName,
        beginDate,
        firstDayBeginTime,
        endDate,
        bidAmount,
        conversionId,
        optimizationGoal,
        timeSeries,
        dailyBudget,
        appAndroidChannelPackageId,
        targetingId,
        targeting,
        sceneSpec,
        flowOptimizationEnabled,
        configuredStatus,
        customizedCategory,
        additionalUserActionSets,
        bidStrategy,
        coldStartAudience,
        autoAudience,
        expandEnabled,
        expandTargeting,
        deepConversionSpec,
        poiList,
        deepConversionBehaviorBid,
        deepConversionWorthRate,
        deepConversionWorthAdvancedRate,
        deepConversionBehaviorAdvancedBid,
        bidMode,
        bidAdjustment,
        autoAcquisitionEnabled,
        autoAcquisitionBudget,
        autoDerivedCreativeEnabled,
        autoDerivedCreativeStatus,
        liveVideoMode,
        liveVideoSubMode,
        userActionSets,
        dynamicAdSpec,
        customAdgroupTag,
        smartTargeting,
        dynamicCreativeIdSet,
        autoDerivedLandingPageSwitch,
        ecomPkamSwitch,
        accountId);
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

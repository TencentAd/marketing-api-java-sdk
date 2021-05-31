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

/** 广告组结构 */
@ApiModel(description = "广告组结构")
public class AdgroupCreateSpec {
  @SerializedName("adgroup_name")
  private String adgroupName = null;

  @SerializedName("begin_date")
  private String beginDate = null;

  @SerializedName("end_date")
  private String endDate = null;

  @SerializedName("optimization_goal")
  private OptimizationGoal optimizationGoal = null;

  @SerializedName("total_budget")
  private Long totalBudget = null;

  @SerializedName("targeting")
  private DpWriteTargetingSetting targeting = null;

  @SerializedName("poi_list")
  private List<String> poiList = null;

  @SerializedName("poi_radius")
  private Long poiRadius = null;

  @SerializedName("package_level")
  private PackageLevel packageLevel = null;

  @SerializedName("local_business_mode")
  private EcoLocalBusinessMode localBusinessMode = null;

  public AdgroupCreateSpec adgroupName(String adgroupName) {
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

  public AdgroupCreateSpec beginDate(String beginDate) {
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

  public AdgroupCreateSpec endDate(String endDate) {
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

  public AdgroupCreateSpec optimizationGoal(OptimizationGoal optimizationGoal) {
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

  public AdgroupCreateSpec totalBudget(Long totalBudget) {
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

  public AdgroupCreateSpec targeting(DpWriteTargetingSetting targeting) {
    this.targeting = targeting;
    return this;
  }

  /**
   * Get targeting
   *
   * @return targeting
   */
  @ApiModelProperty(value = "")
  public DpWriteTargetingSetting getTargeting() {
    return targeting;
  }

  public void setTargeting(DpWriteTargetingSetting targeting) {
    this.targeting = targeting;
  }

  public AdgroupCreateSpec poiList(List<String> poiList) {
    this.poiList = poiList;
    return this;
  }

  public AdgroupCreateSpec addPoiListItem(String poiListItem) {
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

  public AdgroupCreateSpec poiRadius(Long poiRadius) {
    this.poiRadius = poiRadius;
    return this;
  }

  /**
   * Get poiRadius
   *
   * @return poiRadius
   */
  @ApiModelProperty(value = "")
  public Long getPoiRadius() {
    return poiRadius;
  }

  public void setPoiRadius(Long poiRadius) {
    this.poiRadius = poiRadius;
  }

  public AdgroupCreateSpec packageLevel(PackageLevel packageLevel) {
    this.packageLevel = packageLevel;
    return this;
  }

  /**
   * Get packageLevel
   *
   * @return packageLevel
   */
  @ApiModelProperty(value = "")
  public PackageLevel getPackageLevel() {
    return packageLevel;
  }

  public void setPackageLevel(PackageLevel packageLevel) {
    this.packageLevel = packageLevel;
  }

  public AdgroupCreateSpec localBusinessMode(EcoLocalBusinessMode localBusinessMode) {
    this.localBusinessMode = localBusinessMode;
    return this;
  }

  /**
   * Get localBusinessMode
   *
   * @return localBusinessMode
   */
  @ApiModelProperty(value = "")
  public EcoLocalBusinessMode getLocalBusinessMode() {
    return localBusinessMode;
  }

  public void setLocalBusinessMode(EcoLocalBusinessMode localBusinessMode) {
    this.localBusinessMode = localBusinessMode;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdgroupCreateSpec adgroupCreateSpec = (AdgroupCreateSpec) o;
    return Objects.equals(this.adgroupName, adgroupCreateSpec.adgroupName)
        && Objects.equals(this.beginDate, adgroupCreateSpec.beginDate)
        && Objects.equals(this.endDate, adgroupCreateSpec.endDate)
        && Objects.equals(this.optimizationGoal, adgroupCreateSpec.optimizationGoal)
        && Objects.equals(this.totalBudget, adgroupCreateSpec.totalBudget)
        && Objects.equals(this.targeting, adgroupCreateSpec.targeting)
        && Objects.equals(this.poiList, adgroupCreateSpec.poiList)
        && Objects.equals(this.poiRadius, adgroupCreateSpec.poiRadius)
        && Objects.equals(this.packageLevel, adgroupCreateSpec.packageLevel)
        && Objects.equals(this.localBusinessMode, adgroupCreateSpec.localBusinessMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        adgroupName,
        beginDate,
        endDate,
        optimizationGoal,
        totalBudget,
        targeting,
        poiList,
        poiRadius,
        packageLevel,
        localBusinessMode);
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

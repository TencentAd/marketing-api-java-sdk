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
public class DeepBehaviorAdvancedGoalPermissionStruct {
  @SerializedName("optimization_goal")
  private OptimizationGoal optimizationGoal = null;

  @SerializedName("deep_behavior_advanced_goal_list")
  private List<String> deepBehaviorAdvancedGoalList = null;

  public DeepBehaviorAdvancedGoalPermissionStruct optimizationGoal(
      OptimizationGoal optimizationGoal) {
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

  public DeepBehaviorAdvancedGoalPermissionStruct deepBehaviorAdvancedGoalList(
      List<String> deepBehaviorAdvancedGoalList) {
    this.deepBehaviorAdvancedGoalList = deepBehaviorAdvancedGoalList;
    return this;
  }

  public DeepBehaviorAdvancedGoalPermissionStruct addDeepBehaviorAdvancedGoalListItem(
      String deepBehaviorAdvancedGoalListItem) {
    if (this.deepBehaviorAdvancedGoalList == null) {
      this.deepBehaviorAdvancedGoalList = new ArrayList<String>();
    }
    this.deepBehaviorAdvancedGoalList.add(deepBehaviorAdvancedGoalListItem);
    return this;
  }

  /**
   * Get deepBehaviorAdvancedGoalList
   *
   * @return deepBehaviorAdvancedGoalList
   */
  @ApiModelProperty(value = "")
  public List<String> getDeepBehaviorAdvancedGoalList() {
    return deepBehaviorAdvancedGoalList;
  }

  public void setDeepBehaviorAdvancedGoalList(List<String> deepBehaviorAdvancedGoalList) {
    this.deepBehaviorAdvancedGoalList = deepBehaviorAdvancedGoalList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeepBehaviorAdvancedGoalPermissionStruct deepBehaviorAdvancedGoalPermissionStruct =
        (DeepBehaviorAdvancedGoalPermissionStruct) o;
    return Objects.equals(
            this.optimizationGoal, deepBehaviorAdvancedGoalPermissionStruct.optimizationGoal)
        && Objects.equals(
            this.deepBehaviorAdvancedGoalList,
            deepBehaviorAdvancedGoalPermissionStruct.deepBehaviorAdvancedGoalList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optimizationGoal, deepBehaviorAdvancedGoalList);
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

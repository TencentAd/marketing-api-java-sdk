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
public class JointBudgetRulesGetListStruct {
  @SerializedName("joint_budget_rule_id")
  private Long jointBudgetRuleId = null;

  @SerializedName("joint_budget_rule_name")
  private String jointBudgetRuleName = null;

  @SerializedName("daily_budget")
  private Long dailyBudget = null;

  @SerializedName("total_budget")
  private Long totalBudget = null;

  @SerializedName("created_time")
  private Long createdTime = null;

  @SerializedName("last_mod_time")
  private Long lastModTime = null;

  @SerializedName("completed_time")
  private Long completedTime = null;

  @SerializedName("bldate")
  private Long bldate = null;

  @SerializedName("adgroup_id_list")
  private List<Long> adgroupIdList = null;

  public JointBudgetRulesGetListStruct jointBudgetRuleId(Long jointBudgetRuleId) {
    this.jointBudgetRuleId = jointBudgetRuleId;
    return this;
  }

  /**
   * Get jointBudgetRuleId
   *
   * @return jointBudgetRuleId
   */
  @ApiModelProperty(value = "")
  public Long getJointBudgetRuleId() {
    return jointBudgetRuleId;
  }

  public void setJointBudgetRuleId(Long jointBudgetRuleId) {
    this.jointBudgetRuleId = jointBudgetRuleId;
  }

  public JointBudgetRulesGetListStruct jointBudgetRuleName(String jointBudgetRuleName) {
    this.jointBudgetRuleName = jointBudgetRuleName;
    return this;
  }

  /**
   * Get jointBudgetRuleName
   *
   * @return jointBudgetRuleName
   */
  @ApiModelProperty(value = "")
  public String getJointBudgetRuleName() {
    return jointBudgetRuleName;
  }

  public void setJointBudgetRuleName(String jointBudgetRuleName) {
    this.jointBudgetRuleName = jointBudgetRuleName;
  }

  public JointBudgetRulesGetListStruct dailyBudget(Long dailyBudget) {
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

  public JointBudgetRulesGetListStruct totalBudget(Long totalBudget) {
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

  public JointBudgetRulesGetListStruct createdTime(Long createdTime) {
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

  public JointBudgetRulesGetListStruct lastModTime(Long lastModTime) {
    this.lastModTime = lastModTime;
    return this;
  }

  /**
   * Get lastModTime
   *
   * @return lastModTime
   */
  @ApiModelProperty(value = "")
  public Long getLastModTime() {
    return lastModTime;
  }

  public void setLastModTime(Long lastModTime) {
    this.lastModTime = lastModTime;
  }

  public JointBudgetRulesGetListStruct completedTime(Long completedTime) {
    this.completedTime = completedTime;
    return this;
  }

  /**
   * Get completedTime
   *
   * @return completedTime
   */
  @ApiModelProperty(value = "")
  public Long getCompletedTime() {
    return completedTime;
  }

  public void setCompletedTime(Long completedTime) {
    this.completedTime = completedTime;
  }

  public JointBudgetRulesGetListStruct bldate(Long bldate) {
    this.bldate = bldate;
    return this;
  }

  /**
   * Get bldate
   *
   * @return bldate
   */
  @ApiModelProperty(value = "")
  public Long getBldate() {
    return bldate;
  }

  public void setBldate(Long bldate) {
    this.bldate = bldate;
  }

  public JointBudgetRulesGetListStruct adgroupIdList(List<Long> adgroupIdList) {
    this.adgroupIdList = adgroupIdList;
    return this;
  }

  public JointBudgetRulesGetListStruct addAdgroupIdListItem(Long adgroupIdListItem) {
    if (this.adgroupIdList == null) {
      this.adgroupIdList = new ArrayList<Long>();
    }
    this.adgroupIdList.add(adgroupIdListItem);
    return this;
  }

  /**
   * Get adgroupIdList
   *
   * @return adgroupIdList
   */
  @ApiModelProperty(value = "")
  public List<Long> getAdgroupIdList() {
    return adgroupIdList;
  }

  public void setAdgroupIdList(List<Long> adgroupIdList) {
    this.adgroupIdList = adgroupIdList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JointBudgetRulesGetListStruct jointBudgetRulesGetListStruct = (JointBudgetRulesGetListStruct) o;
    return Objects.equals(this.jointBudgetRuleId, jointBudgetRulesGetListStruct.jointBudgetRuleId)
        && Objects.equals(
            this.jointBudgetRuleName, jointBudgetRulesGetListStruct.jointBudgetRuleName)
        && Objects.equals(this.dailyBudget, jointBudgetRulesGetListStruct.dailyBudget)
        && Objects.equals(this.totalBudget, jointBudgetRulesGetListStruct.totalBudget)
        && Objects.equals(this.createdTime, jointBudgetRulesGetListStruct.createdTime)
        && Objects.equals(this.lastModTime, jointBudgetRulesGetListStruct.lastModTime)
        && Objects.equals(this.completedTime, jointBudgetRulesGetListStruct.completedTime)
        && Objects.equals(this.bldate, jointBudgetRulesGetListStruct.bldate)
        && Objects.equals(this.adgroupIdList, jointBudgetRulesGetListStruct.adgroupIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        jointBudgetRuleId,
        jointBudgetRuleName,
        dailyBudget,
        totalBudget,
        createdTime,
        lastModTime,
        completedTime,
        bldate,
        adgroupIdList);
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

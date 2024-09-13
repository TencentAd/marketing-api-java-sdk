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

/** JointBudgetRulesAddRequest */
public class JointBudgetRulesAddRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("joint_budget_rule_name")
  private String jointBudgetRuleName = null;

  @SerializedName("daily_budget")
  private Long dailyBudget = null;

  @SerializedName("total_budget")
  private Long totalBudget = null;

  @SerializedName("adgroup_id_list")
  private List<Long> adgroupIdList = null;

  @SerializedName("joint_budget_rule_type")
  private JointBudgetRuleType jointBudgetRuleType = null;

  public JointBudgetRulesAddRequest accountId(Long accountId) {
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

  public JointBudgetRulesAddRequest jointBudgetRuleName(String jointBudgetRuleName) {
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

  public JointBudgetRulesAddRequest dailyBudget(Long dailyBudget) {
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

  public JointBudgetRulesAddRequest totalBudget(Long totalBudget) {
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

  public JointBudgetRulesAddRequest adgroupIdList(List<Long> adgroupIdList) {
    this.adgroupIdList = adgroupIdList;
    return this;
  }

  public JointBudgetRulesAddRequest addAdgroupIdListItem(Long adgroupIdListItem) {
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

  public JointBudgetRulesAddRequest jointBudgetRuleType(JointBudgetRuleType jointBudgetRuleType) {
    this.jointBudgetRuleType = jointBudgetRuleType;
    return this;
  }

  /**
   * Get jointBudgetRuleType
   *
   * @return jointBudgetRuleType
   */
  @ApiModelProperty(value = "")
  public JointBudgetRuleType getJointBudgetRuleType() {
    return jointBudgetRuleType;
  }

  public void setJointBudgetRuleType(JointBudgetRuleType jointBudgetRuleType) {
    this.jointBudgetRuleType = jointBudgetRuleType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JointBudgetRulesAddRequest jointBudgetRulesAddRequest = (JointBudgetRulesAddRequest) o;
    return Objects.equals(this.accountId, jointBudgetRulesAddRequest.accountId)
        && Objects.equals(this.jointBudgetRuleName, jointBudgetRulesAddRequest.jointBudgetRuleName)
        && Objects.equals(this.dailyBudget, jointBudgetRulesAddRequest.dailyBudget)
        && Objects.equals(this.totalBudget, jointBudgetRulesAddRequest.totalBudget)
        && Objects.equals(this.adgroupIdList, jointBudgetRulesAddRequest.adgroupIdList)
        && Objects.equals(this.jointBudgetRuleType, jointBudgetRulesAddRequest.jointBudgetRuleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        jointBudgetRuleName,
        dailyBudget,
        totalBudget,
        adgroupIdList,
        jointBudgetRuleType);
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

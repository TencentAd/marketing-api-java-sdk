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

/** OuterCluesUpdateRequest */
public class OuterCluesUpdateRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("match_type")
  private LeadsMatchType matchType = null;

  @SerializedName("leads_conversion_status_list")
  private List<OuterLeadsStatusInfoStruct> leadsConversionStatusList = null;

  public OuterCluesUpdateRequest accountId(Long accountId) {
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

  public OuterCluesUpdateRequest matchType(LeadsMatchType matchType) {
    this.matchType = matchType;
    return this;
  }

  /**
   * Get matchType
   *
   * @return matchType
   */
  @ApiModelProperty(value = "")
  public LeadsMatchType getMatchType() {
    return matchType;
  }

  public void setMatchType(LeadsMatchType matchType) {
    this.matchType = matchType;
  }

  public OuterCluesUpdateRequest leadsConversionStatusList(
      List<OuterLeadsStatusInfoStruct> leadsConversionStatusList) {
    this.leadsConversionStatusList = leadsConversionStatusList;
    return this;
  }

  public OuterCluesUpdateRequest addLeadsConversionStatusListItem(
      OuterLeadsStatusInfoStruct leadsConversionStatusListItem) {
    if (this.leadsConversionStatusList == null) {
      this.leadsConversionStatusList = new ArrayList<OuterLeadsStatusInfoStruct>();
    }
    this.leadsConversionStatusList.add(leadsConversionStatusListItem);
    return this;
  }

  /**
   * Get leadsConversionStatusList
   *
   * @return leadsConversionStatusList
   */
  @ApiModelProperty(value = "")
  public List<OuterLeadsStatusInfoStruct> getLeadsConversionStatusList() {
    return leadsConversionStatusList;
  }

  public void setLeadsConversionStatusList(
      List<OuterLeadsStatusInfoStruct> leadsConversionStatusList) {
    this.leadsConversionStatusList = leadsConversionStatusList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OuterCluesUpdateRequest outerCluesUpdateRequest = (OuterCluesUpdateRequest) o;
    return Objects.equals(this.accountId, outerCluesUpdateRequest.accountId)
        && Objects.equals(this.matchType, outerCluesUpdateRequest.matchType)
        && Objects.equals(
            this.leadsConversionStatusList, outerCluesUpdateRequest.leadsConversionStatusList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, matchType, leadsConversionStatusList);
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

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

/** OuterCluesAddRequest */
public class OuterCluesAddRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("match_type")
  private LeadsMatchType matchType = null;

  @SerializedName("leads_info_list")
  private List<LeadsImportInfoStruct> leadsInfoList = null;

  @SerializedName("customized_tags")
  private List<CustomizedTagsStruct> customizedTags = null;

  public OuterCluesAddRequest accountId(Long accountId) {
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

  public OuterCluesAddRequest matchType(LeadsMatchType matchType) {
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

  public OuterCluesAddRequest leadsInfoList(List<LeadsImportInfoStruct> leadsInfoList) {
    this.leadsInfoList = leadsInfoList;
    return this;
  }

  public OuterCluesAddRequest addLeadsInfoListItem(LeadsImportInfoStruct leadsInfoListItem) {
    if (this.leadsInfoList == null) {
      this.leadsInfoList = new ArrayList<LeadsImportInfoStruct>();
    }
    this.leadsInfoList.add(leadsInfoListItem);
    return this;
  }

  /**
   * Get leadsInfoList
   *
   * @return leadsInfoList
   */
  @ApiModelProperty(value = "")
  public List<LeadsImportInfoStruct> getLeadsInfoList() {
    return leadsInfoList;
  }

  public void setLeadsInfoList(List<LeadsImportInfoStruct> leadsInfoList) {
    this.leadsInfoList = leadsInfoList;
  }

  public OuterCluesAddRequest customizedTags(List<CustomizedTagsStruct> customizedTags) {
    this.customizedTags = customizedTags;
    return this;
  }

  public OuterCluesAddRequest addCustomizedTagsItem(CustomizedTagsStruct customizedTagsItem) {
    if (this.customizedTags == null) {
      this.customizedTags = new ArrayList<CustomizedTagsStruct>();
    }
    this.customizedTags.add(customizedTagsItem);
    return this;
  }

  /**
   * Get customizedTags
   *
   * @return customizedTags
   */
  @ApiModelProperty(value = "")
  public List<CustomizedTagsStruct> getCustomizedTags() {
    return customizedTags;
  }

  public void setCustomizedTags(List<CustomizedTagsStruct> customizedTags) {
    this.customizedTags = customizedTags;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OuterCluesAddRequest outerCluesAddRequest = (OuterCluesAddRequest) o;
    return Objects.equals(this.accountId, outerCluesAddRequest.accountId)
        && Objects.equals(this.matchType, outerCluesAddRequest.matchType)
        && Objects.equals(this.leadsInfoList, outerCluesAddRequest.leadsInfoList)
        && Objects.equals(this.customizedTags, outerCluesAddRequest.customizedTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, matchType, leadsInfoList, customizedTags);
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

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

/** AdcreativePreviewsAddRequest */
public class AdcreativePreviewsAddRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("adgroup_id")
  private Long adgroupId = null;

  @SerializedName("user_id_type")
  private ViewerIdType userIdType = null;

  @SerializedName("user_id_list")
  private List<String> userIdList = null;

  public AdcreativePreviewsAddRequest accountId(Long accountId) {
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

  public AdcreativePreviewsAddRequest adgroupId(Long adgroupId) {
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

  public AdcreativePreviewsAddRequest userIdType(ViewerIdType userIdType) {
    this.userIdType = userIdType;
    return this;
  }

  /**
   * Get userIdType
   *
   * @return userIdType
   */
  @ApiModelProperty(value = "")
  public ViewerIdType getUserIdType() {
    return userIdType;
  }

  public void setUserIdType(ViewerIdType userIdType) {
    this.userIdType = userIdType;
  }

  public AdcreativePreviewsAddRequest userIdList(List<String> userIdList) {
    this.userIdList = userIdList;
    return this;
  }

  public AdcreativePreviewsAddRequest addUserIdListItem(String userIdListItem) {
    if (this.userIdList == null) {
      this.userIdList = new ArrayList<String>();
    }
    this.userIdList.add(userIdListItem);
    return this;
  }

  /**
   * Get userIdList
   *
   * @return userIdList
   */
  @ApiModelProperty(value = "")
  public List<String> getUserIdList() {
    return userIdList;
  }

  public void setUserIdList(List<String> userIdList) {
    this.userIdList = userIdList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdcreativePreviewsAddRequest adcreativePreviewsAddRequest = (AdcreativePreviewsAddRequest) o;
    return Objects.equals(this.accountId, adcreativePreviewsAddRequest.accountId)
        && Objects.equals(this.adgroupId, adcreativePreviewsAddRequest.adgroupId)
        && Objects.equals(this.userIdType, adcreativePreviewsAddRequest.userIdType)
        && Objects.equals(this.userIdList, adcreativePreviewsAddRequest.userIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adgroupId, userIdType, userIdList);
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
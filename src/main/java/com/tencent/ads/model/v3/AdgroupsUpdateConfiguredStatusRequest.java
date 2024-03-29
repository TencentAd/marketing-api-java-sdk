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

/** AdgroupsUpdateConfiguredStatusRequest */
public class AdgroupsUpdateConfiguredStatusRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("update_configured_status_spec")
  private List<UpdateConfiguredStatusStruct> updateConfiguredStatusSpec = null;

  public AdgroupsUpdateConfiguredStatusRequest accountId(Long accountId) {
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

  public AdgroupsUpdateConfiguredStatusRequest updateConfiguredStatusSpec(
      List<UpdateConfiguredStatusStruct> updateConfiguredStatusSpec) {
    this.updateConfiguredStatusSpec = updateConfiguredStatusSpec;
    return this;
  }

  public AdgroupsUpdateConfiguredStatusRequest addUpdateConfiguredStatusSpecItem(
      UpdateConfiguredStatusStruct updateConfiguredStatusSpecItem) {
    if (this.updateConfiguredStatusSpec == null) {
      this.updateConfiguredStatusSpec = new ArrayList<UpdateConfiguredStatusStruct>();
    }
    this.updateConfiguredStatusSpec.add(updateConfiguredStatusSpecItem);
    return this;
  }

  /**
   * Get updateConfiguredStatusSpec
   *
   * @return updateConfiguredStatusSpec
   */
  @ApiModelProperty(value = "")
  public List<UpdateConfiguredStatusStruct> getUpdateConfiguredStatusSpec() {
    return updateConfiguredStatusSpec;
  }

  public void setUpdateConfiguredStatusSpec(
      List<UpdateConfiguredStatusStruct> updateConfiguredStatusSpec) {
    this.updateConfiguredStatusSpec = updateConfiguredStatusSpec;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdgroupsUpdateConfiguredStatusRequest adgroupsUpdateConfiguredStatusRequest =
        (AdgroupsUpdateConfiguredStatusRequest) o;
    return Objects.equals(this.accountId, adgroupsUpdateConfiguredStatusRequest.accountId)
        && Objects.equals(
            this.updateConfiguredStatusSpec,
            adgroupsUpdateConfiguredStatusRequest.updateConfiguredStatusSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, updateConfiguredStatusSpec);
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

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

/** AdgroupsUpdateBidAmountRequest */
public class AdgroupsUpdateBidAmountRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("update_bid_amount_spec")
  private List<UpdateBidAmountStruct> updateBidAmountSpec = null;

  public AdgroupsUpdateBidAmountRequest accountId(Long accountId) {
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

  public AdgroupsUpdateBidAmountRequest updateBidAmountSpec(
      List<UpdateBidAmountStruct> updateBidAmountSpec) {
    this.updateBidAmountSpec = updateBidAmountSpec;
    return this;
  }

  public AdgroupsUpdateBidAmountRequest addUpdateBidAmountSpecItem(
      UpdateBidAmountStruct updateBidAmountSpecItem) {
    if (this.updateBidAmountSpec == null) {
      this.updateBidAmountSpec = new ArrayList<UpdateBidAmountStruct>();
    }
    this.updateBidAmountSpec.add(updateBidAmountSpecItem);
    return this;
  }

  /**
   * Get updateBidAmountSpec
   *
   * @return updateBidAmountSpec
   */
  @ApiModelProperty(value = "")
  public List<UpdateBidAmountStruct> getUpdateBidAmountSpec() {
    return updateBidAmountSpec;
  }

  public void setUpdateBidAmountSpec(List<UpdateBidAmountStruct> updateBidAmountSpec) {
    this.updateBidAmountSpec = updateBidAmountSpec;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdgroupsUpdateBidAmountRequest adgroupsUpdateBidAmountRequest =
        (AdgroupsUpdateBidAmountRequest) o;
    return Objects.equals(this.accountId, adgroupsUpdateBidAmountRequest.accountId)
        && Objects.equals(
            this.updateBidAmountSpec, adgroupsUpdateBidAmountRequest.updateBidAmountSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, updateBidAmountSpec);
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

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

/** AssetPermissionsAddResponseData */
public class AssetPermissionsAddResponseData {
  @SerializedName("fail_num")
  private Long failNum = null;

  @SerializedName("success_num")
  private Long successNum = null;

  @SerializedName("fail_reason")
  private List<FailReasonStruct> failReason = null;

  public AssetPermissionsAddResponseData failNum(Long failNum) {
    this.failNum = failNum;
    return this;
  }

  /**
   * Get failNum
   *
   * @return failNum
   */
  @ApiModelProperty(value = "")
  public Long getFailNum() {
    return failNum;
  }

  public void setFailNum(Long failNum) {
    this.failNum = failNum;
  }

  public AssetPermissionsAddResponseData successNum(Long successNum) {
    this.successNum = successNum;
    return this;
  }

  /**
   * Get successNum
   *
   * @return successNum
   */
  @ApiModelProperty(value = "")
  public Long getSuccessNum() {
    return successNum;
  }

  public void setSuccessNum(Long successNum) {
    this.successNum = successNum;
  }

  public AssetPermissionsAddResponseData failReason(List<FailReasonStruct> failReason) {
    this.failReason = failReason;
    return this;
  }

  public AssetPermissionsAddResponseData addFailReasonItem(FailReasonStruct failReasonItem) {
    if (this.failReason == null) {
      this.failReason = new ArrayList<FailReasonStruct>();
    }
    this.failReason.add(failReasonItem);
    return this;
  }

  /**
   * Get failReason
   *
   * @return failReason
   */
  @ApiModelProperty(value = "")
  public List<FailReasonStruct> getFailReason() {
    return failReason;
  }

  public void setFailReason(List<FailReasonStruct> failReason) {
    this.failReason = failReason;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetPermissionsAddResponseData assetPermissionsAddResponseData =
        (AssetPermissionsAddResponseData) o;
    return Objects.equals(this.failNum, assetPermissionsAddResponseData.failNum)
        && Objects.equals(this.successNum, assetPermissionsAddResponseData.successNum)
        && Objects.equals(this.failReason, assetPermissionsAddResponseData.failReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failNum, successNum, failReason);
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

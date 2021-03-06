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
import java.util.Objects;

/** 关联的子客信息 */
@ApiModel(description = "关联的子客信息")
public class AdvertiserInfoSpecStruct {
  @SerializedName("status_pre_authorization_number")
  private Long statusPreAuthorizationNumber = null;

  @SerializedName("status_confirm_authorization_number")
  private Long statusConfirmAuthorizationNumber = null;

  @SerializedName("status_request_cancelation_number")
  private Long statusRequestCancelationNumber = null;

  public AdvertiserInfoSpecStruct statusPreAuthorizationNumber(Long statusPreAuthorizationNumber) {
    this.statusPreAuthorizationNumber = statusPreAuthorizationNumber;
    return this;
  }

  /**
   * Get statusPreAuthorizationNumber
   *
   * @return statusPreAuthorizationNumber
   */
  @ApiModelProperty(value = "")
  public Long getStatusPreAuthorizationNumber() {
    return statusPreAuthorizationNumber;
  }

  public void setStatusPreAuthorizationNumber(Long statusPreAuthorizationNumber) {
    this.statusPreAuthorizationNumber = statusPreAuthorizationNumber;
  }

  public AdvertiserInfoSpecStruct statusConfirmAuthorizationNumber(
      Long statusConfirmAuthorizationNumber) {
    this.statusConfirmAuthorizationNumber = statusConfirmAuthorizationNumber;
    return this;
  }

  /**
   * Get statusConfirmAuthorizationNumber
   *
   * @return statusConfirmAuthorizationNumber
   */
  @ApiModelProperty(value = "")
  public Long getStatusConfirmAuthorizationNumber() {
    return statusConfirmAuthorizationNumber;
  }

  public void setStatusConfirmAuthorizationNumber(Long statusConfirmAuthorizationNumber) {
    this.statusConfirmAuthorizationNumber = statusConfirmAuthorizationNumber;
  }

  public AdvertiserInfoSpecStruct statusRequestCancelationNumber(
      Long statusRequestCancelationNumber) {
    this.statusRequestCancelationNumber = statusRequestCancelationNumber;
    return this;
  }

  /**
   * Get statusRequestCancelationNumber
   *
   * @return statusRequestCancelationNumber
   */
  @ApiModelProperty(value = "")
  public Long getStatusRequestCancelationNumber() {
    return statusRequestCancelationNumber;
  }

  public void setStatusRequestCancelationNumber(Long statusRequestCancelationNumber) {
    this.statusRequestCancelationNumber = statusRequestCancelationNumber;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserInfoSpecStruct advertiserInfoSpecStruct = (AdvertiserInfoSpecStruct) o;
    return Objects.equals(
            this.statusPreAuthorizationNumber,
            advertiserInfoSpecStruct.statusPreAuthorizationNumber)
        && Objects.equals(
            this.statusConfirmAuthorizationNumber,
            advertiserInfoSpecStruct.statusConfirmAuthorizationNumber)
        && Objects.equals(
            this.statusRequestCancelationNumber,
            advertiserInfoSpecStruct.statusRequestCancelationNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        statusPreAuthorizationNumber,
        statusConfirmAuthorizationNumber,
        statusRequestCancelationNumber);
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

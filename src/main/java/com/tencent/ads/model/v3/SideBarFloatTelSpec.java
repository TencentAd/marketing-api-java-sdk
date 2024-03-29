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
import java.util.Objects;

/** 一键拨号的参数结构 */
@ApiModel(description = "一键拨号的参数结构")
public class SideBarFloatTelSpec {
  @SerializedName("phone_number")
  private String phoneNumber = null;

  @SerializedName("phone_type")
  private String phoneType = null;

  public SideBarFloatTelSpec phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   *
   * @return phoneNumber
   */
  @ApiModelProperty(value = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public SideBarFloatTelSpec phoneType(String phoneType) {
    this.phoneType = phoneType;
    return this;
  }

  /**
   * Get phoneType
   *
   * @return phoneType
   */
  @ApiModelProperty(value = "")
  public String getPhoneType() {
    return phoneType;
  }

  public void setPhoneType(String phoneType) {
    this.phoneType = phoneType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SideBarFloatTelSpec sideBarFloatTelSpec = (SideBarFloatTelSpec) o;
    return Objects.equals(this.phoneNumber, sideBarFloatTelSpec.phoneNumber)
        && Objects.equals(this.phoneType, sideBarFloatTelSpec.phoneType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, phoneType);
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

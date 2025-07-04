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
import java.util.Objects;

/** BusinessUnitAddRequest */
public class BusinessUnitAddRequest {
  @SerializedName("business_unit_name")
  private String businessUnitName = null;

  @SerializedName("business_unit_remark")
  private String businessUnitRemark = null;

  public BusinessUnitAddRequest businessUnitName(String businessUnitName) {
    this.businessUnitName = businessUnitName;
    return this;
  }

  /**
   * Get businessUnitName
   *
   * @return businessUnitName
   */
  @ApiModelProperty(value = "")
  public String getBusinessUnitName() {
    return businessUnitName;
  }

  public void setBusinessUnitName(String businessUnitName) {
    this.businessUnitName = businessUnitName;
  }

  public BusinessUnitAddRequest businessUnitRemark(String businessUnitRemark) {
    this.businessUnitRemark = businessUnitRemark;
    return this;
  }

  /**
   * Get businessUnitRemark
   *
   * @return businessUnitRemark
   */
  @ApiModelProperty(value = "")
  public String getBusinessUnitRemark() {
    return businessUnitRemark;
  }

  public void setBusinessUnitRemark(String businessUnitRemark) {
    this.businessUnitRemark = businessUnitRemark;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessUnitAddRequest businessUnitAddRequest = (BusinessUnitAddRequest) o;
    return Objects.equals(this.businessUnitName, businessUnitAddRequest.businessUnitName)
        && Objects.equals(this.businessUnitRemark, businessUnitAddRequest.businessUnitRemark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessUnitName, businessUnitRemark);
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

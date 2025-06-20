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

/** 业务单元信息 */
@ApiModel(description = "业务单元信息")
public class BusinessUnitListGetListStruct {
  @SerializedName("organization_id")
  private Long organizationId = null;

  @SerializedName("organization_name")
  private String organizationName = null;

  @SerializedName("parent_organization_id")
  private Long parentOrganizationId = null;

  public BusinessUnitListGetListStruct organizationId(Long organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  /**
   * Get organizationId
   *
   * @return organizationId
   */
  @ApiModelProperty(value = "")
  public Long getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(Long organizationId) {
    this.organizationId = organizationId;
  }

  public BusinessUnitListGetListStruct organizationName(String organizationName) {
    this.organizationName = organizationName;
    return this;
  }

  /**
   * Get organizationName
   *
   * @return organizationName
   */
  @ApiModelProperty(value = "")
  public String getOrganizationName() {
    return organizationName;
  }

  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }

  public BusinessUnitListGetListStruct parentOrganizationId(Long parentOrganizationId) {
    this.parentOrganizationId = parentOrganizationId;
    return this;
  }

  /**
   * Get parentOrganizationId
   *
   * @return parentOrganizationId
   */
  @ApiModelProperty(value = "")
  public Long getParentOrganizationId() {
    return parentOrganizationId;
  }

  public void setParentOrganizationId(Long parentOrganizationId) {
    this.parentOrganizationId = parentOrganizationId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessUnitListGetListStruct businessUnitListGetListStruct = (BusinessUnitListGetListStruct) o;
    return Objects.equals(this.organizationId, businessUnitListGetListStruct.organizationId)
        && Objects.equals(this.organizationName, businessUnitListGetListStruct.organizationName)
        && Objects.equals(
            this.parentOrganizationId, businessUnitListGetListStruct.parentOrganizationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, organizationName, parentOrganizationId);
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

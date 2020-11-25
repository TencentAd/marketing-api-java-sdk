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

/** 返回结构 */
@ApiModel(description = "返回结构")
public class BusinessMdmAccountRelationsGetListStruct {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("business_id")
  private Long businessId = null;

  @SerializedName("mdm_id")
  private Long mdmId = null;

  @SerializedName("agency_account_id")
  private Long agencyAccountId = null;

  public BusinessMdmAccountRelationsGetListStruct accountId(Long accountId) {
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

  public BusinessMdmAccountRelationsGetListStruct businessId(Long businessId) {
    this.businessId = businessId;
    return this;
  }

  /**
   * Get businessId
   *
   * @return businessId
   */
  @ApiModelProperty(value = "")
  public Long getBusinessId() {
    return businessId;
  }

  public void setBusinessId(Long businessId) {
    this.businessId = businessId;
  }

  public BusinessMdmAccountRelationsGetListStruct mdmId(Long mdmId) {
    this.mdmId = mdmId;
    return this;
  }

  /**
   * Get mdmId
   *
   * @return mdmId
   */
  @ApiModelProperty(value = "")
  public Long getMdmId() {
    return mdmId;
  }

  public void setMdmId(Long mdmId) {
    this.mdmId = mdmId;
  }

  public BusinessMdmAccountRelationsGetListStruct agencyAccountId(Long agencyAccountId) {
    this.agencyAccountId = agencyAccountId;
    return this;
  }

  /**
   * Get agencyAccountId
   *
   * @return agencyAccountId
   */
  @ApiModelProperty(value = "")
  public Long getAgencyAccountId() {
    return agencyAccountId;
  }

  public void setAgencyAccountId(Long agencyAccountId) {
    this.agencyAccountId = agencyAccountId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessMdmAccountRelationsGetListStruct businessMdmAccountRelationsGetListStruct =
        (BusinessMdmAccountRelationsGetListStruct) o;
    return Objects.equals(this.accountId, businessMdmAccountRelationsGetListStruct.accountId)
        && Objects.equals(this.businessId, businessMdmAccountRelationsGetListStruct.businessId)
        && Objects.equals(this.mdmId, businessMdmAccountRelationsGetListStruct.mdmId)
        && Objects.equals(
            this.agencyAccountId, businessMdmAccountRelationsGetListStruct.agencyAccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, businessId, mdmId, agencyAccountId);
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

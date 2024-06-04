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

/** AgencyBusinessUnitAddRequest */
public class AgencyBusinessUnitAddRequest {
  @SerializedName("business_unit_name")
  private String businessUnitName = null;

  @SerializedName("business_unit_remark")
  private String businessUnitRemark = null;

  @SerializedName("account_id_list")
  private List<Long> accountIdList = null;

  public AgencyBusinessUnitAddRequest businessUnitName(String businessUnitName) {
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

  public AgencyBusinessUnitAddRequest businessUnitRemark(String businessUnitRemark) {
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

  public AgencyBusinessUnitAddRequest accountIdList(List<Long> accountIdList) {
    this.accountIdList = accountIdList;
    return this;
  }

  public AgencyBusinessUnitAddRequest addAccountIdListItem(Long accountIdListItem) {
    if (this.accountIdList == null) {
      this.accountIdList = new ArrayList<Long>();
    }
    this.accountIdList.add(accountIdListItem);
    return this;
  }

  /**
   * Get accountIdList
   *
   * @return accountIdList
   */
  @ApiModelProperty(value = "")
  public List<Long> getAccountIdList() {
    return accountIdList;
  }

  public void setAccountIdList(List<Long> accountIdList) {
    this.accountIdList = accountIdList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgencyBusinessUnitAddRequest agencyBusinessUnitAddRequest = (AgencyBusinessUnitAddRequest) o;
    return Objects.equals(this.businessUnitName, agencyBusinessUnitAddRequest.businessUnitName)
        && Objects.equals(this.businessUnitRemark, agencyBusinessUnitAddRequest.businessUnitRemark)
        && Objects.equals(this.accountIdList, agencyBusinessUnitAddRequest.accountIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessUnitName, businessUnitRemark, accountIdList);
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

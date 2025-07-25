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

/** BusinessUnitAccountUpdateRequest */
public class BusinessUnitAccountUpdateRequest {
  @SerializedName("organization_id")
  private Long organizationId = null;

  @SerializedName("add_account_id_list")
  private List<Long> addAccountIdList = null;

  @SerializedName("delete_account_id_list")
  private List<Long> deleteAccountIdList = null;

  public BusinessUnitAccountUpdateRequest organizationId(Long organizationId) {
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

  public BusinessUnitAccountUpdateRequest addAccountIdList(List<Long> addAccountIdList) {
    this.addAccountIdList = addAccountIdList;
    return this;
  }

  public BusinessUnitAccountUpdateRequest addAddAccountIdListItem(Long addAccountIdListItem) {
    if (this.addAccountIdList == null) {
      this.addAccountIdList = new ArrayList<Long>();
    }
    this.addAccountIdList.add(addAccountIdListItem);
    return this;
  }

  /**
   * Get addAccountIdList
   *
   * @return addAccountIdList
   */
  @ApiModelProperty(value = "")
  public List<Long> getAddAccountIdList() {
    return addAccountIdList;
  }

  public void setAddAccountIdList(List<Long> addAccountIdList) {
    this.addAccountIdList = addAccountIdList;
  }

  public BusinessUnitAccountUpdateRequest deleteAccountIdList(List<Long> deleteAccountIdList) {
    this.deleteAccountIdList = deleteAccountIdList;
    return this;
  }

  public BusinessUnitAccountUpdateRequest addDeleteAccountIdListItem(Long deleteAccountIdListItem) {
    if (this.deleteAccountIdList == null) {
      this.deleteAccountIdList = new ArrayList<Long>();
    }
    this.deleteAccountIdList.add(deleteAccountIdListItem);
    return this;
  }

  /**
   * Get deleteAccountIdList
   *
   * @return deleteAccountIdList
   */
  @ApiModelProperty(value = "")
  public List<Long> getDeleteAccountIdList() {
    return deleteAccountIdList;
  }

  public void setDeleteAccountIdList(List<Long> deleteAccountIdList) {
    this.deleteAccountIdList = deleteAccountIdList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessUnitAccountUpdateRequest businessUnitAccountUpdateRequest =
        (BusinessUnitAccountUpdateRequest) o;
    return Objects.equals(this.organizationId, businessUnitAccountUpdateRequest.organizationId)
        && Objects.equals(this.addAccountIdList, businessUnitAccountUpdateRequest.addAccountIdList)
        && Objects.equals(
            this.deleteAccountIdList, businessUnitAccountUpdateRequest.deleteAccountIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, addAccountIdList, deleteAccountIdList);
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

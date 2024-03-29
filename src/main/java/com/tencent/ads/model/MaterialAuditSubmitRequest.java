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

/** MaterialAuditSubmitRequest */
public class MaterialAuditSubmitRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("material_list")
  private List<MaterialAuditSubmitListStruct> materialList = null;

  public MaterialAuditSubmitRequest accountId(Long accountId) {
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

  public MaterialAuditSubmitRequest materialList(List<MaterialAuditSubmitListStruct> materialList) {
    this.materialList = materialList;
    return this;
  }

  public MaterialAuditSubmitRequest addMaterialListItem(
      MaterialAuditSubmitListStruct materialListItem) {
    if (this.materialList == null) {
      this.materialList = new ArrayList<MaterialAuditSubmitListStruct>();
    }
    this.materialList.add(materialListItem);
    return this;
  }

  /**
   * Get materialList
   *
   * @return materialList
   */
  @ApiModelProperty(value = "")
  public List<MaterialAuditSubmitListStruct> getMaterialList() {
    return materialList;
  }

  public void setMaterialList(List<MaterialAuditSubmitListStruct> materialList) {
    this.materialList = materialList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaterialAuditSubmitRequest materialAuditSubmitRequest = (MaterialAuditSubmitRequest) o;
    return Objects.equals(this.accountId, materialAuditSubmitRequest.accountId)
        && Objects.equals(this.materialList, materialAuditSubmitRequest.materialList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, materialList);
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

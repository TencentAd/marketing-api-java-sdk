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

/** 返回结构 */
@ApiModel(description = "返回结构")
public class ComponentSharingGetListStruct {
  @SerializedName("shared_account_id")
  private Long sharedAccountId = null;

  @SerializedName("shared_account_type")
  private SharedAccountType sharedAccountType = null;

  public ComponentSharingGetListStruct sharedAccountId(Long sharedAccountId) {
    this.sharedAccountId = sharedAccountId;
    return this;
  }

  /**
   * Get sharedAccountId
   *
   * @return sharedAccountId
   */
  @ApiModelProperty(value = "")
  public Long getSharedAccountId() {
    return sharedAccountId;
  }

  public void setSharedAccountId(Long sharedAccountId) {
    this.sharedAccountId = sharedAccountId;
  }

  public ComponentSharingGetListStruct sharedAccountType(SharedAccountType sharedAccountType) {
    this.sharedAccountType = sharedAccountType;
    return this;
  }

  /**
   * Get sharedAccountType
   *
   * @return sharedAccountType
   */
  @ApiModelProperty(value = "")
  public SharedAccountType getSharedAccountType() {
    return sharedAccountType;
  }

  public void setSharedAccountType(SharedAccountType sharedAccountType) {
    this.sharedAccountType = sharedAccountType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentSharingGetListStruct componentSharingGetListStruct = (ComponentSharingGetListStruct) o;
    return Objects.equals(this.sharedAccountId, componentSharingGetListStruct.sharedAccountId)
        && Objects.equals(this.sharedAccountType, componentSharingGetListStruct.sharedAccountType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sharedAccountId, sharedAccountType);
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

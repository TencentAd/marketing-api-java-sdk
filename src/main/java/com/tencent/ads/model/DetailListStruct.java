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
public class DetailListStruct {
  @SerializedName("scope_object_id")
  private Long scopeObjectId = null;

  @SerializedName("scope_object_id_str")
  private String scopeObjectIdStr = null;

  @SerializedName("scope_object_name")
  private String scopeObjectName = null;

  @SerializedName("detail_result_type")
  private TaskDetailResultType detailResultType = null;

  @SerializedName("message")
  private String message = null;

  public DetailListStruct scopeObjectId(Long scopeObjectId) {
    this.scopeObjectId = scopeObjectId;
    return this;
  }

  /**
   * Get scopeObjectId
   *
   * @return scopeObjectId
   */
  @ApiModelProperty(value = "")
  public Long getScopeObjectId() {
    return scopeObjectId;
  }

  public void setScopeObjectId(Long scopeObjectId) {
    this.scopeObjectId = scopeObjectId;
  }

  public DetailListStruct scopeObjectIdStr(String scopeObjectIdStr) {
    this.scopeObjectIdStr = scopeObjectIdStr;
    return this;
  }

  /**
   * Get scopeObjectIdStr
   *
   * @return scopeObjectIdStr
   */
  @ApiModelProperty(value = "")
  public String getScopeObjectIdStr() {
    return scopeObjectIdStr;
  }

  public void setScopeObjectIdStr(String scopeObjectIdStr) {
    this.scopeObjectIdStr = scopeObjectIdStr;
  }

  public DetailListStruct scopeObjectName(String scopeObjectName) {
    this.scopeObjectName = scopeObjectName;
    return this;
  }

  /**
   * Get scopeObjectName
   *
   * @return scopeObjectName
   */
  @ApiModelProperty(value = "")
  public String getScopeObjectName() {
    return scopeObjectName;
  }

  public void setScopeObjectName(String scopeObjectName) {
    this.scopeObjectName = scopeObjectName;
  }

  public DetailListStruct detailResultType(TaskDetailResultType detailResultType) {
    this.detailResultType = detailResultType;
    return this;
  }

  /**
   * Get detailResultType
   *
   * @return detailResultType
   */
  @ApiModelProperty(value = "")
  public TaskDetailResultType getDetailResultType() {
    return detailResultType;
  }

  public void setDetailResultType(TaskDetailResultType detailResultType) {
    this.detailResultType = detailResultType;
  }

  public DetailListStruct message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   *
   * @return message
   */
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailListStruct detailListStruct = (DetailListStruct) o;
    return Objects.equals(this.scopeObjectId, detailListStruct.scopeObjectId)
        && Objects.equals(this.scopeObjectIdStr, detailListStruct.scopeObjectIdStr)
        && Objects.equals(this.scopeObjectName, detailListStruct.scopeObjectName)
        && Objects.equals(this.detailResultType, detailListStruct.detailResultType)
        && Objects.equals(this.message, detailListStruct.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        scopeObjectId, scopeObjectIdStr, scopeObjectName, detailResultType, message);
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

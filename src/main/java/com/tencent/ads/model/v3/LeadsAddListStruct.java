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
public class LeadsAddListStruct {
  @SerializedName("index")
  private Long index = null;

  @SerializedName("outer_leads_id")
  private String outerLeadsId = null;

  @SerializedName("detailed_err_code")
  private String detailedErrCode = null;

  @SerializedName("detailed_err_msg")
  private String detailedErrMsg = null;

  public LeadsAddListStruct index(Long index) {
    this.index = index;
    return this;
  }

  /**
   * Get index
   *
   * @return index
   */
  @ApiModelProperty(value = "")
  public Long getIndex() {
    return index;
  }

  public void setIndex(Long index) {
    this.index = index;
  }

  public LeadsAddListStruct outerLeadsId(String outerLeadsId) {
    this.outerLeadsId = outerLeadsId;
    return this;
  }

  /**
   * Get outerLeadsId
   *
   * @return outerLeadsId
   */
  @ApiModelProperty(value = "")
  public String getOuterLeadsId() {
    return outerLeadsId;
  }

  public void setOuterLeadsId(String outerLeadsId) {
    this.outerLeadsId = outerLeadsId;
  }

  public LeadsAddListStruct detailedErrCode(String detailedErrCode) {
    this.detailedErrCode = detailedErrCode;
    return this;
  }

  /**
   * Get detailedErrCode
   *
   * @return detailedErrCode
   */
  @ApiModelProperty(value = "")
  public String getDetailedErrCode() {
    return detailedErrCode;
  }

  public void setDetailedErrCode(String detailedErrCode) {
    this.detailedErrCode = detailedErrCode;
  }

  public LeadsAddListStruct detailedErrMsg(String detailedErrMsg) {
    this.detailedErrMsg = detailedErrMsg;
    return this;
  }

  /**
   * Get detailedErrMsg
   *
   * @return detailedErrMsg
   */
  @ApiModelProperty(value = "")
  public String getDetailedErrMsg() {
    return detailedErrMsg;
  }

  public void setDetailedErrMsg(String detailedErrMsg) {
    this.detailedErrMsg = detailedErrMsg;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadsAddListStruct leadsAddListStruct = (LeadsAddListStruct) o;
    return Objects.equals(this.index, leadsAddListStruct.index)
        && Objects.equals(this.outerLeadsId, leadsAddListStruct.outerLeadsId)
        && Objects.equals(this.detailedErrCode, leadsAddListStruct.detailedErrCode)
        && Objects.equals(this.detailedErrMsg, leadsAddListStruct.detailedErrMsg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, outerLeadsId, detailedErrCode, detailedErrMsg);
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
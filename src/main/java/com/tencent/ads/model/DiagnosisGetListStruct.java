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

/** 广告诊断信息列表 */
@ApiModel(description = "广告诊断信息列表")
public class DiagnosisGetListStruct {
  @SerializedName("adgroup_id")
  private Long adgroupId = null;

  @SerializedName("wechat_diagnosis_result_spec")
  private WechatDiagnosisResultSpec wechatDiagnosisResultSpec = null;

  public DiagnosisGetListStruct adgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
    return this;
  }

  /**
   * Get adgroupId
   *
   * @return adgroupId
   */
  @ApiModelProperty(value = "")
  public Long getAdgroupId() {
    return adgroupId;
  }

  public void setAdgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
  }

  public DiagnosisGetListStruct wechatDiagnosisResultSpec(
      WechatDiagnosisResultSpec wechatDiagnosisResultSpec) {
    this.wechatDiagnosisResultSpec = wechatDiagnosisResultSpec;
    return this;
  }

  /**
   * Get wechatDiagnosisResultSpec
   *
   * @return wechatDiagnosisResultSpec
   */
  @ApiModelProperty(value = "")
  public WechatDiagnosisResultSpec getWechatDiagnosisResultSpec() {
    return wechatDiagnosisResultSpec;
  }

  public void setWechatDiagnosisResultSpec(WechatDiagnosisResultSpec wechatDiagnosisResultSpec) {
    this.wechatDiagnosisResultSpec = wechatDiagnosisResultSpec;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiagnosisGetListStruct diagnosisGetListStruct = (DiagnosisGetListStruct) o;
    return Objects.equals(this.adgroupId, diagnosisGetListStruct.adgroupId)
        && Objects.equals(
            this.wechatDiagnosisResultSpec, diagnosisGetListStruct.wechatDiagnosisResultSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adgroupId, wechatDiagnosisResultSpec);
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

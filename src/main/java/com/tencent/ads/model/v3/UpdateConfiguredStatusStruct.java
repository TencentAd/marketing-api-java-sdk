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

/** 更新单个广告客户设置的状态条件 */
@ApiModel(description = "更新单个广告客户设置的状态条件")
public class UpdateConfiguredStatusStruct {
  @SerializedName("adgroup_id")
  private Long adgroupId = null;

  @SerializedName("configured_status")
  private ConfiguredStatus configuredStatus = null;

  public UpdateConfiguredStatusStruct adgroupId(Long adgroupId) {
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

  public UpdateConfiguredStatusStruct configuredStatus(ConfiguredStatus configuredStatus) {
    this.configuredStatus = configuredStatus;
    return this;
  }

  /**
   * Get configuredStatus
   *
   * @return configuredStatus
   */
  @ApiModelProperty(value = "")
  public ConfiguredStatus getConfiguredStatus() {
    return configuredStatus;
  }

  public void setConfiguredStatus(ConfiguredStatus configuredStatus) {
    this.configuredStatus = configuredStatus;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateConfiguredStatusStruct updateConfiguredStatusStruct = (UpdateConfiguredStatusStruct) o;
    return Objects.equals(this.adgroupId, updateConfiguredStatusStruct.adgroupId)
        && Objects.equals(this.configuredStatus, updateConfiguredStatusStruct.configuredStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adgroupId, configuredStatus);
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

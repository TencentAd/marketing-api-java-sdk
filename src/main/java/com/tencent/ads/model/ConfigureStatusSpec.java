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

/** 状态修改信息 */
@ApiModel(description = "状态修改信息")
public class ConfigureStatusSpec {
  @SerializedName("configure_status")
  private AdStatus configureStatus = null;

  public ConfigureStatusSpec configureStatus(AdStatus configureStatus) {
    this.configureStatus = configureStatus;
    return this;
  }

  /**
   * Get configureStatus
   *
   * @return configureStatus
   */
  @ApiModelProperty(value = "")
  public AdStatus getConfigureStatus() {
    return configureStatus;
  }

  public void setConfigureStatus(AdStatus configureStatus) {
    this.configureStatus = configureStatus;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigureStatusSpec configureStatusSpec = (ConfigureStatusSpec) o;
    return Objects.equals(this.configureStatus, configureStatusSpec.configureStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configureStatus);
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

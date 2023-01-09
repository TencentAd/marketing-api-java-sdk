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

/** 文件附属信息 */
@ApiModel(description = "文件附属信息")
public class FileExtraInfo {
  @SerializedName("open_app_id")
  private String openAppId = null;

  public FileExtraInfo openAppId(String openAppId) {
    this.openAppId = openAppId;
    return this;
  }

  /**
   * Get openAppId
   *
   * @return openAppId
   */
  @ApiModelProperty(value = "")
  public String getOpenAppId() {
    return openAppId;
  }

  public void setOpenAppId(String openAppId) {
    this.openAppId = openAppId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileExtraInfo fileExtraInfo = (FileExtraInfo) o;
    return Objects.equals(this.openAppId, fileExtraInfo.openAppId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openAppId);
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

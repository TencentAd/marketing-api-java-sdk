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

/** android 默认落地页内容 */
@ApiModel(description = "android 默认落地页内容")
public class IosAppPageSpec {
  @SerializedName("ios_app_id")
  private String iosAppId = null;

  public IosAppPageSpec iosAppId(String iosAppId) {
    this.iosAppId = iosAppId;
    return this;
  }

  /**
   * Get iosAppId
   *
   * @return iosAppId
   */
  @ApiModelProperty(value = "")
  public String getIosAppId() {
    return iosAppId;
  }

  public void setIosAppId(String iosAppId) {
    this.iosAppId = iosAppId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IosAppPageSpec iosAppPageSpec = (IosAppPageSpec) o;
    return Objects.equals(this.iosAppId, iosAppPageSpec.iosAppId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iosAppId);
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
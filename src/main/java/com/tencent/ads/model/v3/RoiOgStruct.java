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

/** roi og结构信息 */
@ApiModel(description = "roi og结构信息")
public class RoiOgStruct {
  @SerializedName("roi_og_id")
  private Long roiOgId = null;

  @SerializedName("roi_og_name")
  private String roiOgName = null;

  public RoiOgStruct roiOgId(Long roiOgId) {
    this.roiOgId = roiOgId;
    return this;
  }

  /**
   * Get roiOgId
   *
   * @return roiOgId
   */
  @ApiModelProperty(value = "")
  public Long getRoiOgId() {
    return roiOgId;
  }

  public void setRoiOgId(Long roiOgId) {
    this.roiOgId = roiOgId;
  }

  public RoiOgStruct roiOgName(String roiOgName) {
    this.roiOgName = roiOgName;
    return this;
  }

  /**
   * Get roiOgName
   *
   * @return roiOgName
   */
  @ApiModelProperty(value = "")
  public String getRoiOgName() {
    return roiOgName;
  }

  public void setRoiOgName(String roiOgName) {
    this.roiOgName = roiOgName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoiOgStruct roiOgStruct = (RoiOgStruct) o;
    return Objects.equals(this.roiOgId, roiOgStruct.roiOgId)
        && Objects.equals(this.roiOgName, roiOgStruct.roiOgName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roiOgId, roiOgName);
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
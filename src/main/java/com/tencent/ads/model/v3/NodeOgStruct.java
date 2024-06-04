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

/** og结构信息 */
@ApiModel(description = "og结构信息")
public class NodeOgStruct {
  @SerializedName("og_id")
  private Long ogId = null;

  @SerializedName("og_name")
  private String ogName = null;

  public NodeOgStruct ogId(Long ogId) {
    this.ogId = ogId;
    return this;
  }

  /**
   * Get ogId
   *
   * @return ogId
   */
  @ApiModelProperty(value = "")
  public Long getOgId() {
    return ogId;
  }

  public void setOgId(Long ogId) {
    this.ogId = ogId;
  }

  public NodeOgStruct ogName(String ogName) {
    this.ogName = ogName;
    return this;
  }

  /**
   * Get ogName
   *
   * @return ogName
   */
  @ApiModelProperty(value = "")
  public String getOgName() {
    return ogName;
  }

  public void setOgName(String ogName) {
    this.ogName = ogName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeOgStruct nodeOgStruct = (NodeOgStruct) o;
    return Objects.equals(this.ogId, nodeOgStruct.ogId)
        && Objects.equals(this.ogName, nodeOgStruct.ogName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ogId, ogName);
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

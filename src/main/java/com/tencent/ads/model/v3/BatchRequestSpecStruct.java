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

/** 单个请求所需条件 */
@ApiModel(description = "单个请求所需条件")
public class BatchRequestSpecStruct {
  @SerializedName("relative_path")
  private String relativePath = null;

  @SerializedName("body")
  private String body = null;

  public BatchRequestSpecStruct relativePath(String relativePath) {
    this.relativePath = relativePath;
    return this;
  }

  /**
   * Get relativePath
   *
   * @return relativePath
   */
  @ApiModelProperty(value = "")
  public String getRelativePath() {
    return relativePath;
  }

  public void setRelativePath(String relativePath) {
    this.relativePath = relativePath;
  }

  public BatchRequestSpecStruct body(String body) {
    this.body = body;
    return this;
  }

  /**
   * Get body
   *
   * @return body
   */
  @ApiModelProperty(value = "")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchRequestSpecStruct batchRequestSpecStruct = (BatchRequestSpecStruct) o;
    return Objects.equals(this.relativePath, batchRequestSpecStruct.relativePath)
        && Objects.equals(this.body, batchRequestSpecStruct.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relativePath, body);
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

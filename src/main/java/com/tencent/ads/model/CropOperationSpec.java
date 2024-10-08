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

/** 处理操作信息 */
@ApiModel(description = "处理操作信息")
public class CropOperationSpec {
  @SerializedName("resize_spec")
  private ResizeSpec resizeSpec = null;

  public CropOperationSpec resizeSpec(ResizeSpec resizeSpec) {
    this.resizeSpec = resizeSpec;
    return this;
  }

  /**
   * Get resizeSpec
   *
   * @return resizeSpec
   */
  @ApiModelProperty(value = "")
  public ResizeSpec getResizeSpec() {
    return resizeSpec;
  }

  public void setResizeSpec(ResizeSpec resizeSpec) {
    this.resizeSpec = resizeSpec;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CropOperationSpec cropOperationSpec = (CropOperationSpec) o;
    return Objects.equals(this.resizeSpec, cropOperationSpec.resizeSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resizeSpec);
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

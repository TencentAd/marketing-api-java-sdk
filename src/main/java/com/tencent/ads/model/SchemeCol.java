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

/** 文件Schema列 */
@ApiModel(description = "文件Schema列")
public class SchemeCol {
  @SerializedName("col_key")
  private FileSchemaColKey colKey = null;

  @SerializedName("index")
  private Long index = null;

  public SchemeCol colKey(FileSchemaColKey colKey) {
    this.colKey = colKey;
    return this;
  }

  /**
   * Get colKey
   *
   * @return colKey
   */
  @ApiModelProperty(value = "")
  public FileSchemaColKey getColKey() {
    return colKey;
  }

  public void setColKey(FileSchemaColKey colKey) {
    this.colKey = colKey;
  }

  public SchemeCol index(Long index) {
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemeCol schemeCol = (SchemeCol) o;
    return Objects.equals(this.colKey, schemeCol.colKey)
        && Objects.equals(this.index, schemeCol.index);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colKey, index);
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

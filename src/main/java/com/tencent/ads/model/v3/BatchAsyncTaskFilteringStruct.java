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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** 过滤条件 */
@ApiModel(description = "过滤条件")
public class BatchAsyncTaskFilteringStruct {
  @SerializedName("field")
  private String field = null;

  @SerializedName("operator")
  private FilterOperator operator = null;

  @SerializedName("values")
  private List<String> values = null;

  public BatchAsyncTaskFilteringStruct field(String field) {
    this.field = field;
    return this;
  }

  /**
   * Get field
   *
   * @return field
   */
  @ApiModelProperty(value = "")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public BatchAsyncTaskFilteringStruct operator(FilterOperator operator) {
    this.operator = operator;
    return this;
  }

  /**
   * Get operator
   *
   * @return operator
   */
  @ApiModelProperty(value = "")
  public FilterOperator getOperator() {
    return operator;
  }

  public void setOperator(FilterOperator operator) {
    this.operator = operator;
  }

  public BatchAsyncTaskFilteringStruct values(List<String> values) {
    this.values = values;
    return this;
  }

  public BatchAsyncTaskFilteringStruct addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<String>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   *
   * @return values
   */
  @ApiModelProperty(value = "")
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchAsyncTaskFilteringStruct batchAsyncTaskFilteringStruct = (BatchAsyncTaskFilteringStruct) o;
    return Objects.equals(this.field, batchAsyncTaskFilteringStruct.field)
        && Objects.equals(this.operator, batchAsyncTaskFilteringStruct.operator)
        && Objects.equals(this.values, batchAsyncTaskFilteringStruct.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, operator, values);
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

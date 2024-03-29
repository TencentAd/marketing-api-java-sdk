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

/** 数据外显组件 */
@ApiModel(description = "数据外显组件")
public class ShowDataStruct {
  @SerializedName("conversion_data_type")
  private ConversionDataType conversionDataType = null;

  @SerializedName("conversion_target_type")
  private ConversionTargetType conversionTargetType = null;

  public ShowDataStruct conversionDataType(ConversionDataType conversionDataType) {
    this.conversionDataType = conversionDataType;
    return this;
  }

  /**
   * Get conversionDataType
   *
   * @return conversionDataType
   */
  @ApiModelProperty(value = "")
  public ConversionDataType getConversionDataType() {
    return conversionDataType;
  }

  public void setConversionDataType(ConversionDataType conversionDataType) {
    this.conversionDataType = conversionDataType;
  }

  public ShowDataStruct conversionTargetType(ConversionTargetType conversionTargetType) {
    this.conversionTargetType = conversionTargetType;
    return this;
  }

  /**
   * Get conversionTargetType
   *
   * @return conversionTargetType
   */
  @ApiModelProperty(value = "")
  public ConversionTargetType getConversionTargetType() {
    return conversionTargetType;
  }

  public void setConversionTargetType(ConversionTargetType conversionTargetType) {
    this.conversionTargetType = conversionTargetType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShowDataStruct showDataStruct = (ShowDataStruct) o;
    return Objects.equals(this.conversionDataType, showDataStruct.conversionDataType)
        && Objects.equals(this.conversionTargetType, showDataStruct.conversionTargetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionDataType, conversionTargetType);
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

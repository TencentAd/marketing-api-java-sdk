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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** 排除已转化用户定向 */
@ApiModel(description = "排除已转化用户定向")
public class ExcludedConvertedAudienceStruct {
  @SerializedName("excluded_dimension")
  private ExcludedConvertedAudience excludedDimension = null;

  @SerializedName("conversion_behavior_list")
  private List<String> conversionBehaviorList = null;

  public ExcludedConvertedAudienceStruct excludedDimension(
      ExcludedConvertedAudience excludedDimension) {
    this.excludedDimension = excludedDimension;
    return this;
  }

  /**
   * Get excludedDimension
   *
   * @return excludedDimension
   */
  @ApiModelProperty(value = "")
  public ExcludedConvertedAudience getExcludedDimension() {
    return excludedDimension;
  }

  public void setExcludedDimension(ExcludedConvertedAudience excludedDimension) {
    this.excludedDimension = excludedDimension;
  }

  public ExcludedConvertedAudienceStruct conversionBehaviorList(
      List<String> conversionBehaviorList) {
    this.conversionBehaviorList = conversionBehaviorList;
    return this;
  }

  public ExcludedConvertedAudienceStruct addConversionBehaviorListItem(
      String conversionBehaviorListItem) {
    if (this.conversionBehaviorList == null) {
      this.conversionBehaviorList = new ArrayList<String>();
    }
    this.conversionBehaviorList.add(conversionBehaviorListItem);
    return this;
  }

  /**
   * Get conversionBehaviorList
   *
   * @return conversionBehaviorList
   */
  @ApiModelProperty(value = "")
  public List<String> getConversionBehaviorList() {
    return conversionBehaviorList;
  }

  public void setConversionBehaviorList(List<String> conversionBehaviorList) {
    this.conversionBehaviorList = conversionBehaviorList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExcludedConvertedAudienceStruct excludedConvertedAudienceStruct =
        (ExcludedConvertedAudienceStruct) o;
    return Objects.equals(this.excludedDimension, excludedConvertedAudienceStruct.excludedDimension)
        && Objects.equals(
            this.conversionBehaviorList, excludedConvertedAudienceStruct.conversionBehaviorList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excludedDimension, conversionBehaviorList);
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

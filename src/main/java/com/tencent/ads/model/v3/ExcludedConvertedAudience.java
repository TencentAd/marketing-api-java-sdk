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

/** 排除已转化人群行为定向 */
@ApiModel(description = "排除已转化人群行为定向")
public class ExcludedConvertedAudience {
  @SerializedName("excluded_dimension")
  private ExcludedDimension excludedDimension = null;

  @SerializedName("conversion_behavior_list")
  private List<String> conversionBehaviorList = null;

  @SerializedName("excluded_day")
  private ExcludedDay excludedDay = null;

  public ExcludedConvertedAudience excludedDimension(ExcludedDimension excludedDimension) {
    this.excludedDimension = excludedDimension;
    return this;
  }

  /**
   * Get excludedDimension
   *
   * @return excludedDimension
   */
  @ApiModelProperty(value = "")
  public ExcludedDimension getExcludedDimension() {
    return excludedDimension;
  }

  public void setExcludedDimension(ExcludedDimension excludedDimension) {
    this.excludedDimension = excludedDimension;
  }

  public ExcludedConvertedAudience conversionBehaviorList(List<String> conversionBehaviorList) {
    this.conversionBehaviorList = conversionBehaviorList;
    return this;
  }

  public ExcludedConvertedAudience addConversionBehaviorListItem(
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

  public ExcludedConvertedAudience excludedDay(ExcludedDay excludedDay) {
    this.excludedDay = excludedDay;
    return this;
  }

  /**
   * Get excludedDay
   *
   * @return excludedDay
   */
  @ApiModelProperty(value = "")
  public ExcludedDay getExcludedDay() {
    return excludedDay;
  }

  public void setExcludedDay(ExcludedDay excludedDay) {
    this.excludedDay = excludedDay;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExcludedConvertedAudience excludedConvertedAudience = (ExcludedConvertedAudience) o;
    return Objects.equals(this.excludedDimension, excludedConvertedAudience.excludedDimension)
        && Objects.equals(
            this.conversionBehaviorList, excludedConvertedAudience.conversionBehaviorList)
        && Objects.equals(this.excludedDay, excludedConvertedAudience.excludedDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excludedDimension, conversionBehaviorList, excludedDay);
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

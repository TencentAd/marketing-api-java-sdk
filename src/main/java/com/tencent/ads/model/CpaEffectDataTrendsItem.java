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

/** 深浅成本趋势 */
@ApiModel(description = "深浅成本趋势")
public class CpaEffectDataTrendsItem {
  @SerializedName("rank")
  private Long rank = null;

  @SerializedName("target_cpa")
  private List<PointStruct> targetCpa = null;

  @SerializedName("real_cpa")
  private List<PointStruct> realCpa = null;

  public CpaEffectDataTrendsItem rank(Long rank) {
    this.rank = rank;
    return this;
  }

  /**
   * Get rank
   *
   * @return rank
   */
  @ApiModelProperty(value = "")
  public Long getRank() {
    return rank;
  }

  public void setRank(Long rank) {
    this.rank = rank;
  }

  public CpaEffectDataTrendsItem targetCpa(List<PointStruct> targetCpa) {
    this.targetCpa = targetCpa;
    return this;
  }

  public CpaEffectDataTrendsItem addTargetCpaItem(PointStruct targetCpaItem) {
    if (this.targetCpa == null) {
      this.targetCpa = new ArrayList<PointStruct>();
    }
    this.targetCpa.add(targetCpaItem);
    return this;
  }

  /**
   * Get targetCpa
   *
   * @return targetCpa
   */
  @ApiModelProperty(value = "")
  public List<PointStruct> getTargetCpa() {
    return targetCpa;
  }

  public void setTargetCpa(List<PointStruct> targetCpa) {
    this.targetCpa = targetCpa;
  }

  public CpaEffectDataTrendsItem realCpa(List<PointStruct> realCpa) {
    this.realCpa = realCpa;
    return this;
  }

  public CpaEffectDataTrendsItem addRealCpaItem(PointStruct realCpaItem) {
    if (this.realCpa == null) {
      this.realCpa = new ArrayList<PointStruct>();
    }
    this.realCpa.add(realCpaItem);
    return this;
  }

  /**
   * Get realCpa
   *
   * @return realCpa
   */
  @ApiModelProperty(value = "")
  public List<PointStruct> getRealCpa() {
    return realCpa;
  }

  public void setRealCpa(List<PointStruct> realCpa) {
    this.realCpa = realCpa;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CpaEffectDataTrendsItem cpaEffectDataTrendsItem = (CpaEffectDataTrendsItem) o;
    return Objects.equals(this.rank, cpaEffectDataTrendsItem.rank)
        && Objects.equals(this.targetCpa, cpaEffectDataTrendsItem.targetCpa)
        && Objects.equals(this.realCpa, cpaEffectDataTrendsItem.realCpa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rank, targetCpa, realCpa);
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

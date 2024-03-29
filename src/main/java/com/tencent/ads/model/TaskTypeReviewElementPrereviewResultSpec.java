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

/** 获取元素的预审结果条件 */
@ApiModel(description = "获取元素的预审结果条件")
public class TaskTypeReviewElementPrereviewResultSpec {
  @SerializedName("adgroup_id")
  private Long adgroupId = null;

  @SerializedName("elements")
  private List<PrereviewElementStruct> elements = null;

  @SerializedName("supplement")
  private List<ReviewElementPrereviewSupplementStruct> supplement = null;

  public TaskTypeReviewElementPrereviewResultSpec adgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
    return this;
  }

  /**
   * Get adgroupId
   *
   * @return adgroupId
   */
  @ApiModelProperty(value = "")
  public Long getAdgroupId() {
    return adgroupId;
  }

  public void setAdgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
  }

  public TaskTypeReviewElementPrereviewResultSpec elements(List<PrereviewElementStruct> elements) {
    this.elements = elements;
    return this;
  }

  public TaskTypeReviewElementPrereviewResultSpec addElementsItem(
      PrereviewElementStruct elementsItem) {
    if (this.elements == null) {
      this.elements = new ArrayList<PrereviewElementStruct>();
    }
    this.elements.add(elementsItem);
    return this;
  }

  /**
   * Get elements
   *
   * @return elements
   */
  @ApiModelProperty(value = "")
  public List<PrereviewElementStruct> getElements() {
    return elements;
  }

  public void setElements(List<PrereviewElementStruct> elements) {
    this.elements = elements;
  }

  public TaskTypeReviewElementPrereviewResultSpec supplement(
      List<ReviewElementPrereviewSupplementStruct> supplement) {
    this.supplement = supplement;
    return this;
  }

  public TaskTypeReviewElementPrereviewResultSpec addSupplementItem(
      ReviewElementPrereviewSupplementStruct supplementItem) {
    if (this.supplement == null) {
      this.supplement = new ArrayList<ReviewElementPrereviewSupplementStruct>();
    }
    this.supplement.add(supplementItem);
    return this;
  }

  /**
   * Get supplement
   *
   * @return supplement
   */
  @ApiModelProperty(value = "")
  public List<ReviewElementPrereviewSupplementStruct> getSupplement() {
    return supplement;
  }

  public void setSupplement(List<ReviewElementPrereviewSupplementStruct> supplement) {
    this.supplement = supplement;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskTypeReviewElementPrereviewResultSpec taskTypeReviewElementPrereviewResultSpec =
        (TaskTypeReviewElementPrereviewResultSpec) o;
    return Objects.equals(this.adgroupId, taskTypeReviewElementPrereviewResultSpec.adgroupId)
        && Objects.equals(this.elements, taskTypeReviewElementPrereviewResultSpec.elements)
        && Objects.equals(this.supplement, taskTypeReviewElementPrereviewResultSpec.supplement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adgroupId, elements, supplement);
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

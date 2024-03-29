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

/** 标签信息 */
@ApiModel(description = "标签信息")
public class CreateLabel {
  @SerializedName("label_name")
  private String labelName = null;

  @SerializedName("first_label_level_name")
  private String firstLabelLevelName = null;

  @SerializedName("second_label_level_name")
  private String secondLabelLevelName = null;

  @SerializedName("business_scenario")
  private BusinessScenario businessScenario = null;

  public CreateLabel labelName(String labelName) {
    this.labelName = labelName;
    return this;
  }

  /**
   * Get labelName
   *
   * @return labelName
   */
  @ApiModelProperty(value = "")
  public String getLabelName() {
    return labelName;
  }

  public void setLabelName(String labelName) {
    this.labelName = labelName;
  }

  public CreateLabel firstLabelLevelName(String firstLabelLevelName) {
    this.firstLabelLevelName = firstLabelLevelName;
    return this;
  }

  /**
   * Get firstLabelLevelName
   *
   * @return firstLabelLevelName
   */
  @ApiModelProperty(value = "")
  public String getFirstLabelLevelName() {
    return firstLabelLevelName;
  }

  public void setFirstLabelLevelName(String firstLabelLevelName) {
    this.firstLabelLevelName = firstLabelLevelName;
  }

  public CreateLabel secondLabelLevelName(String secondLabelLevelName) {
    this.secondLabelLevelName = secondLabelLevelName;
    return this;
  }

  /**
   * Get secondLabelLevelName
   *
   * @return secondLabelLevelName
   */
  @ApiModelProperty(value = "")
  public String getSecondLabelLevelName() {
    return secondLabelLevelName;
  }

  public void setSecondLabelLevelName(String secondLabelLevelName) {
    this.secondLabelLevelName = secondLabelLevelName;
  }

  public CreateLabel businessScenario(BusinessScenario businessScenario) {
    this.businessScenario = businessScenario;
    return this;
  }

  /**
   * Get businessScenario
   *
   * @return businessScenario
   */
  @ApiModelProperty(value = "")
  public BusinessScenario getBusinessScenario() {
    return businessScenario;
  }

  public void setBusinessScenario(BusinessScenario businessScenario) {
    this.businessScenario = businessScenario;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateLabel createLabel = (CreateLabel) o;
    return Objects.equals(this.labelName, createLabel.labelName)
        && Objects.equals(this.firstLabelLevelName, createLabel.firstLabelLevelName)
        && Objects.equals(this.secondLabelLevelName, createLabel.secondLabelLevelName)
        && Objects.equals(this.businessScenario, createLabel.businessScenario);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelName, firstLabelLevelName, secondLabelLevelName, businessScenario);
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

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

/** 身份证明 */
@ApiModel(description = "身份证明")
public class IndividualQualification {
  @SerializedName("name")
  private String name = null;

  @SerializedName("identification_number")
  private String identificationNumber = null;

  @SerializedName("identification_front_image_id")
  private String identificationFrontImageId = null;

  @SerializedName("identification_back_image_id")
  private String identificationBackImageId = null;

  public IndividualQualification name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   *
   * @return name
   */
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IndividualQualification identificationNumber(String identificationNumber) {
    this.identificationNumber = identificationNumber;
    return this;
  }

  /**
   * Get identificationNumber
   *
   * @return identificationNumber
   */
  @ApiModelProperty(value = "")
  public String getIdentificationNumber() {
    return identificationNumber;
  }

  public void setIdentificationNumber(String identificationNumber) {
    this.identificationNumber = identificationNumber;
  }

  public IndividualQualification identificationFrontImageId(String identificationFrontImageId) {
    this.identificationFrontImageId = identificationFrontImageId;
    return this;
  }

  /**
   * Get identificationFrontImageId
   *
   * @return identificationFrontImageId
   */
  @ApiModelProperty(value = "")
  public String getIdentificationFrontImageId() {
    return identificationFrontImageId;
  }

  public void setIdentificationFrontImageId(String identificationFrontImageId) {
    this.identificationFrontImageId = identificationFrontImageId;
  }

  public IndividualQualification identificationBackImageId(String identificationBackImageId) {
    this.identificationBackImageId = identificationBackImageId;
    return this;
  }

  /**
   * Get identificationBackImageId
   *
   * @return identificationBackImageId
   */
  @ApiModelProperty(value = "")
  public String getIdentificationBackImageId() {
    return identificationBackImageId;
  }

  public void setIdentificationBackImageId(String identificationBackImageId) {
    this.identificationBackImageId = identificationBackImageId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndividualQualification individualQualification = (IndividualQualification) o;
    return Objects.equals(this.name, individualQualification.name)
        && Objects.equals(this.identificationNumber, individualQualification.identificationNumber)
        && Objects.equals(
            this.identificationFrontImageId, individualQualification.identificationFrontImageId)
        && Objects.equals(
            this.identificationBackImageId, individualQualification.identificationBackImageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        name, identificationNumber, identificationFrontImageId, identificationBackImageId);
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

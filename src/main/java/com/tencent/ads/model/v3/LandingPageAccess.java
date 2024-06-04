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

/** 落地页准入控制 */
@ApiModel(description = "落地页准入控制")
public class LandingPageAccess {
  @SerializedName("support_page_types")
  private List<String> supportPageTypes = null;

  @SerializedName("must_not_page_types")
  private List<String> mustNotPageTypes = null;

  @SerializedName("must_page_types")
  private List<String> mustPageTypes = null;

  public LandingPageAccess supportPageTypes(List<String> supportPageTypes) {
    this.supportPageTypes = supportPageTypes;
    return this;
  }

  public LandingPageAccess addSupportPageTypesItem(String supportPageTypesItem) {
    if (this.supportPageTypes == null) {
      this.supportPageTypes = new ArrayList<String>();
    }
    this.supportPageTypes.add(supportPageTypesItem);
    return this;
  }

  /**
   * Get supportPageTypes
   *
   * @return supportPageTypes
   */
  @ApiModelProperty(value = "")
  public List<String> getSupportPageTypes() {
    return supportPageTypes;
  }

  public void setSupportPageTypes(List<String> supportPageTypes) {
    this.supportPageTypes = supportPageTypes;
  }

  public LandingPageAccess mustNotPageTypes(List<String> mustNotPageTypes) {
    this.mustNotPageTypes = mustNotPageTypes;
    return this;
  }

  public LandingPageAccess addMustNotPageTypesItem(String mustNotPageTypesItem) {
    if (this.mustNotPageTypes == null) {
      this.mustNotPageTypes = new ArrayList<String>();
    }
    this.mustNotPageTypes.add(mustNotPageTypesItem);
    return this;
  }

  /**
   * Get mustNotPageTypes
   *
   * @return mustNotPageTypes
   */
  @ApiModelProperty(value = "")
  public List<String> getMustNotPageTypes() {
    return mustNotPageTypes;
  }

  public void setMustNotPageTypes(List<String> mustNotPageTypes) {
    this.mustNotPageTypes = mustNotPageTypes;
  }

  public LandingPageAccess mustPageTypes(List<String> mustPageTypes) {
    this.mustPageTypes = mustPageTypes;
    return this;
  }

  public LandingPageAccess addMustPageTypesItem(String mustPageTypesItem) {
    if (this.mustPageTypes == null) {
      this.mustPageTypes = new ArrayList<String>();
    }
    this.mustPageTypes.add(mustPageTypesItem);
    return this;
  }

  /**
   * Get mustPageTypes
   *
   * @return mustPageTypes
   */
  @ApiModelProperty(value = "")
  public List<String> getMustPageTypes() {
    return mustPageTypes;
  }

  public void setMustPageTypes(List<String> mustPageTypes) {
    this.mustPageTypes = mustPageTypes;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LandingPageAccess landingPageAccess = (LandingPageAccess) o;
    return Objects.equals(this.supportPageTypes, landingPageAccess.supportPageTypes)
        && Objects.equals(this.mustNotPageTypes, landingPageAccess.mustNotPageTypes)
        && Objects.equals(this.mustPageTypes, landingPageAccess.mustPageTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportPageTypes, mustNotPageTypes, mustPageTypes);
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

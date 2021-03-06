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

/** 人群授权信息 */
@ApiModel(description = "人群授权信息")
public class AudienceGrantRelationsGetGrantSpec {
  @SerializedName("grant_to_business_spec")
  private AudienceGrantRelationsGetGrantToBusinessSpec grantToBusinessSpec = null;

  public AudienceGrantRelationsGetGrantSpec grantToBusinessSpec(
      AudienceGrantRelationsGetGrantToBusinessSpec grantToBusinessSpec) {
    this.grantToBusinessSpec = grantToBusinessSpec;
    return this;
  }

  /**
   * Get grantToBusinessSpec
   *
   * @return grantToBusinessSpec
   */
  @ApiModelProperty(value = "")
  public AudienceGrantRelationsGetGrantToBusinessSpec getGrantToBusinessSpec() {
    return grantToBusinessSpec;
  }

  public void setGrantToBusinessSpec(
      AudienceGrantRelationsGetGrantToBusinessSpec grantToBusinessSpec) {
    this.grantToBusinessSpec = grantToBusinessSpec;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceGrantRelationsGetGrantSpec audienceGrantRelationsGetGrantSpec =
        (AudienceGrantRelationsGetGrantSpec) o;
    return Objects.equals(
        this.grantToBusinessSpec, audienceGrantRelationsGetGrantSpec.grantToBusinessSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grantToBusinessSpec);
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

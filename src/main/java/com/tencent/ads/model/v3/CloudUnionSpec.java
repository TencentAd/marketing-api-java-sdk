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

/** */
@ApiModel(description = "")
public class CloudUnionSpec {
  @SerializedName("roi_goal")
  private DeepConversionWorthGoal roiGoal = null;

  @SerializedName("expected_roi")
  private Double expectedRoi = null;

  public CloudUnionSpec roiGoal(DeepConversionWorthGoal roiGoal) {
    this.roiGoal = roiGoal;
    return this;
  }

  /**
   * Get roiGoal
   *
   * @return roiGoal
   */
  @ApiModelProperty(value = "")
  public DeepConversionWorthGoal getRoiGoal() {
    return roiGoal;
  }

  public void setRoiGoal(DeepConversionWorthGoal roiGoal) {
    this.roiGoal = roiGoal;
  }

  public CloudUnionSpec expectedRoi(Double expectedRoi) {
    this.expectedRoi = expectedRoi;
    return this;
  }

  /**
   * Get expectedRoi
   *
   * @return expectedRoi
   */
  @ApiModelProperty(value = "")
  public Double getExpectedRoi() {
    return expectedRoi;
  }

  public void setExpectedRoi(Double expectedRoi) {
    this.expectedRoi = expectedRoi;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudUnionSpec cloudUnionSpec = (CloudUnionSpec) o;
    return Objects.equals(this.roiGoal, cloudUnionSpec.roiGoal)
        && Objects.equals(this.expectedRoi, cloudUnionSpec.expectedRoi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roiGoal, expectedRoi);
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

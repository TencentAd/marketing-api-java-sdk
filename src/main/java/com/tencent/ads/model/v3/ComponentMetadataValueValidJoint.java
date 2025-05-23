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

/** 组件list内容联合校验 */
@ApiModel(description = "组件list内容联合校验")
public class ComponentMetadataValueValidJoint {
  @SerializedName("total_length")
  private List<ComponentMetadataValueValidJointTotalLengthItem> totalLength = null;

  @SerializedName("unique_length")
  private List<ComponentMetadataValueValidJointUniqueLengthItem> uniqueLength = null;

  public ComponentMetadataValueValidJoint totalLength(
      List<ComponentMetadataValueValidJointTotalLengthItem> totalLength) {
    this.totalLength = totalLength;
    return this;
  }

  public ComponentMetadataValueValidJoint addTotalLengthItem(
      ComponentMetadataValueValidJointTotalLengthItem totalLengthItem) {
    if (this.totalLength == null) {
      this.totalLength = new ArrayList<ComponentMetadataValueValidJointTotalLengthItem>();
    }
    this.totalLength.add(totalLengthItem);
    return this;
  }

  /**
   * Get totalLength
   *
   * @return totalLength
   */
  @ApiModelProperty(value = "")
  public List<ComponentMetadataValueValidJointTotalLengthItem> getTotalLength() {
    return totalLength;
  }

  public void setTotalLength(List<ComponentMetadataValueValidJointTotalLengthItem> totalLength) {
    this.totalLength = totalLength;
  }

  public ComponentMetadataValueValidJoint uniqueLength(
      List<ComponentMetadataValueValidJointUniqueLengthItem> uniqueLength) {
    this.uniqueLength = uniqueLength;
    return this;
  }

  public ComponentMetadataValueValidJoint addUniqueLengthItem(
      ComponentMetadataValueValidJointUniqueLengthItem uniqueLengthItem) {
    if (this.uniqueLength == null) {
      this.uniqueLength = new ArrayList<ComponentMetadataValueValidJointUniqueLengthItem>();
    }
    this.uniqueLength.add(uniqueLengthItem);
    return this;
  }

  /**
   * Get uniqueLength
   *
   * @return uniqueLength
   */
  @ApiModelProperty(value = "")
  public List<ComponentMetadataValueValidJointUniqueLengthItem> getUniqueLength() {
    return uniqueLength;
  }

  public void setUniqueLength(List<ComponentMetadataValueValidJointUniqueLengthItem> uniqueLength) {
    this.uniqueLength = uniqueLength;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentMetadataValueValidJoint componentMetadataValueValidJoint =
        (ComponentMetadataValueValidJoint) o;
    return Objects.equals(this.totalLength, componentMetadataValueValidJoint.totalLength)
        && Objects.equals(this.uniqueLength, componentMetadataValueValidJoint.uniqueLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalLength, uniqueLength);
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

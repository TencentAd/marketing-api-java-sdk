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

/** 线索跑量目标信息 */
@ApiModel(description = "线索跑量目标信息")
public class SmartDeliveryGoalLeadsSpec {
  @SerializedName("leads_cost")
  private Long leadsCost = null;

  public SmartDeliveryGoalLeadsSpec leadsCost(Long leadsCost) {
    this.leadsCost = leadsCost;
    return this;
  }

  /**
   * Get leadsCost
   *
   * @return leadsCost
   */
  @ApiModelProperty(value = "")
  public Long getLeadsCost() {
    return leadsCost;
  }

  public void setLeadsCost(Long leadsCost) {
    this.leadsCost = leadsCost;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartDeliveryGoalLeadsSpec smartDeliveryGoalLeadsSpec = (SmartDeliveryGoalLeadsSpec) o;
    return Objects.equals(this.leadsCost, smartDeliveryGoalLeadsSpec.leadsCost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leadsCost);
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

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

/** 修改广告深度优化行为目标出价 */
@ApiModel(description = "修改广告深度优化行为目标出价")
public class UpdateDeepConversionBehaviorBidItem {
  @SerializedName("adgroup_id")
  private Long adgroupId = null;

  @SerializedName("deep_conversion_behavior_bid")
  private Long deepConversionBehaviorBid = null;

  public UpdateDeepConversionBehaviorBidItem adgroupId(Long adgroupId) {
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

  public UpdateDeepConversionBehaviorBidItem deepConversionBehaviorBid(
      Long deepConversionBehaviorBid) {
    this.deepConversionBehaviorBid = deepConversionBehaviorBid;
    return this;
  }

  /**
   * Get deepConversionBehaviorBid
   *
   * @return deepConversionBehaviorBid
   */
  @ApiModelProperty(value = "")
  public Long getDeepConversionBehaviorBid() {
    return deepConversionBehaviorBid;
  }

  public void setDeepConversionBehaviorBid(Long deepConversionBehaviorBid) {
    this.deepConversionBehaviorBid = deepConversionBehaviorBid;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDeepConversionBehaviorBidItem updateDeepConversionBehaviorBidItem =
        (UpdateDeepConversionBehaviorBidItem) o;
    return Objects.equals(this.adgroupId, updateDeepConversionBehaviorBidItem.adgroupId)
        && Objects.equals(
            this.deepConversionBehaviorBid,
            updateDeepConversionBehaviorBidItem.deepConversionBehaviorBid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adgroupId, deepConversionBehaviorBid);
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

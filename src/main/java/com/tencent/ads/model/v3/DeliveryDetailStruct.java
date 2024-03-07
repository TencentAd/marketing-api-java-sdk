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

/** 快递详情元素 */
@ApiModel(description = "快递详情元素")
public class DeliveryDetailStruct {
  @SerializedName("delivery_update_time")
  private String deliveryUpdateTime = null;

  @SerializedName("delivery_detail")
  private String deliveryDetail = null;

  public DeliveryDetailStruct deliveryUpdateTime(String deliveryUpdateTime) {
    this.deliveryUpdateTime = deliveryUpdateTime;
    return this;
  }

  /**
   * Get deliveryUpdateTime
   *
   * @return deliveryUpdateTime
   */
  @ApiModelProperty(value = "")
  public String getDeliveryUpdateTime() {
    return deliveryUpdateTime;
  }

  public void setDeliveryUpdateTime(String deliveryUpdateTime) {
    this.deliveryUpdateTime = deliveryUpdateTime;
  }

  public DeliveryDetailStruct deliveryDetail(String deliveryDetail) {
    this.deliveryDetail = deliveryDetail;
    return this;
  }

  /**
   * Get deliveryDetail
   *
   * @return deliveryDetail
   */
  @ApiModelProperty(value = "")
  public String getDeliveryDetail() {
    return deliveryDetail;
  }

  public void setDeliveryDetail(String deliveryDetail) {
    this.deliveryDetail = deliveryDetail;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryDetailStruct deliveryDetailStruct = (DeliveryDetailStruct) o;
    return Objects.equals(this.deliveryUpdateTime, deliveryDetailStruct.deliveryUpdateTime)
        && Objects.equals(this.deliveryDetail, deliveryDetailStruct.deliveryDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryUpdateTime, deliveryDetail);
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

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
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** CreativeComponentsUpdateStatusRequest */
public class CreativeComponentsUpdateStatusRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("component_id")
  private Long componentId = null;

  @SerializedName("component_type")
  private CreativeComponentType componentType = null;

  @SerializedName("status")
  private AdStatus status = null;

  @SerializedName("live_begin_time")
  private Long liveBeginTime = null;

  public CreativeComponentsUpdateStatusRequest accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   *
   * @return accountId
   */
  @ApiModelProperty(value = "")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public CreativeComponentsUpdateStatusRequest componentId(Long componentId) {
    this.componentId = componentId;
    return this;
  }

  /**
   * Get componentId
   *
   * @return componentId
   */
  @ApiModelProperty(value = "")
  public Long getComponentId() {
    return componentId;
  }

  public void setComponentId(Long componentId) {
    this.componentId = componentId;
  }

  public CreativeComponentsUpdateStatusRequest componentType(CreativeComponentType componentType) {
    this.componentType = componentType;
    return this;
  }

  /**
   * Get componentType
   *
   * @return componentType
   */
  @ApiModelProperty(value = "")
  public CreativeComponentType getComponentType() {
    return componentType;
  }

  public void setComponentType(CreativeComponentType componentType) {
    this.componentType = componentType;
  }

  public CreativeComponentsUpdateStatusRequest status(AdStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  @ApiModelProperty(value = "")
  public AdStatus getStatus() {
    return status;
  }

  public void setStatus(AdStatus status) {
    this.status = status;
  }

  public CreativeComponentsUpdateStatusRequest liveBeginTime(Long liveBeginTime) {
    this.liveBeginTime = liveBeginTime;
    return this;
  }

  /**
   * Get liveBeginTime
   *
   * @return liveBeginTime
   */
  @ApiModelProperty(value = "")
  public Long getLiveBeginTime() {
    return liveBeginTime;
  }

  public void setLiveBeginTime(Long liveBeginTime) {
    this.liveBeginTime = liveBeginTime;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeComponentsUpdateStatusRequest creativeComponentsUpdateStatusRequest =
        (CreativeComponentsUpdateStatusRequest) o;
    return Objects.equals(this.accountId, creativeComponentsUpdateStatusRequest.accountId)
        && Objects.equals(this.componentId, creativeComponentsUpdateStatusRequest.componentId)
        && Objects.equals(this.componentType, creativeComponentsUpdateStatusRequest.componentType)
        && Objects.equals(this.status, creativeComponentsUpdateStatusRequest.status)
        && Objects.equals(this.liveBeginTime, creativeComponentsUpdateStatusRequest.liveBeginTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, componentId, componentType, status, liveBeginTime);
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

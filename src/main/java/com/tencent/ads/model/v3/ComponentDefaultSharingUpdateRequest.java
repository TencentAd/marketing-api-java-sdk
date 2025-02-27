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
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ComponentDefaultSharingUpdateRequest */
public class ComponentDefaultSharingUpdateRequest {
  @SerializedName("organization_id")
  private Long organizationId = null;

  @SerializedName("default_shared_type")
  private DefaultSharedType defaultSharedType = null;

  public ComponentDefaultSharingUpdateRequest organizationId(Long organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  /**
   * Get organizationId
   *
   * @return organizationId
   */
  @ApiModelProperty(value = "")
  public Long getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(Long organizationId) {
    this.organizationId = organizationId;
  }

  public ComponentDefaultSharingUpdateRequest defaultSharedType(
      DefaultSharedType defaultSharedType) {
    this.defaultSharedType = defaultSharedType;
    return this;
  }

  /**
   * Get defaultSharedType
   *
   * @return defaultSharedType
   */
  @ApiModelProperty(value = "")
  public DefaultSharedType getDefaultSharedType() {
    return defaultSharedType;
  }

  public void setDefaultSharedType(DefaultSharedType defaultSharedType) {
    this.defaultSharedType = defaultSharedType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentDefaultSharingUpdateRequest componentDefaultSharingUpdateRequest =
        (ComponentDefaultSharingUpdateRequest) o;
    return Objects.equals(this.organizationId, componentDefaultSharingUpdateRequest.organizationId)
        && Objects.equals(
            this.defaultSharedType, componentDefaultSharingUpdateRequest.defaultSharedType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, defaultSharedType);
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

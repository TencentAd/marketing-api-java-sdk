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

/** ComponentsDeleteRequest */
public class ComponentsDeleteRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("component_id")
  private Long componentId = null;

  @SerializedName("organization_id")
  private Long organizationId = null;

  @SerializedName("delete_strategy")
  private DeleteStrategy deleteStrategy = null;

  public ComponentsDeleteRequest accountId(Long accountId) {
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

  public ComponentsDeleteRequest componentId(Long componentId) {
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

  public ComponentsDeleteRequest organizationId(Long organizationId) {
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

  public ComponentsDeleteRequest deleteStrategy(DeleteStrategy deleteStrategy) {
    this.deleteStrategy = deleteStrategy;
    return this;
  }

  /**
   * Get deleteStrategy
   *
   * @return deleteStrategy
   */
  @ApiModelProperty(value = "")
  public DeleteStrategy getDeleteStrategy() {
    return deleteStrategy;
  }

  public void setDeleteStrategy(DeleteStrategy deleteStrategy) {
    this.deleteStrategy = deleteStrategy;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentsDeleteRequest componentsDeleteRequest = (ComponentsDeleteRequest) o;
    return Objects.equals(this.accountId, componentsDeleteRequest.accountId)
        && Objects.equals(this.componentId, componentsDeleteRequest.componentId)
        && Objects.equals(this.organizationId, componentsDeleteRequest.organizationId)
        && Objects.equals(this.deleteStrategy, componentsDeleteRequest.deleteStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, componentId, organizationId, deleteStrategy);
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

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

/** 营销挂件组件 */
@ApiModel(description = "营销挂件组件")
public class MarketingPendantComponent {
  @SerializedName("component_id")
  private Long componentId = null;

  @SerializedName("value")
  private MarketingPendantStruct value = null;

  public MarketingPendantComponent componentId(Long componentId) {
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

  public MarketingPendantComponent value(MarketingPendantStruct value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   *
   * @return value
   */
  @ApiModelProperty(value = "")
  public MarketingPendantStruct getValue() {
    return value;
  }

  public void setValue(MarketingPendantStruct value) {
    this.value = value;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketingPendantComponent marketingPendantComponent = (MarketingPendantComponent) o;
    return Objects.equals(this.componentId, marketingPendantComponent.componentId)
        && Objects.equals(this.value, marketingPendantComponent.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentId, value);
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

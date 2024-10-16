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

/** 商品属性列表 */
@ApiModel(description = "商品属性列表")
public class AttributeItem {
  @SerializedName("attribute_name")
  private String attributeName = null;

  @SerializedName("attribute_type")
  private ProductAttributeType attributeType = null;

  @SerializedName("last_category_id")
  private Long lastCategoryId = null;

  public AttributeItem attributeName(String attributeName) {
    this.attributeName = attributeName;
    return this;
  }

  /**
   * Get attributeName
   *
   * @return attributeName
   */
  @ApiModelProperty(value = "")
  public String getAttributeName() {
    return attributeName;
  }

  public void setAttributeName(String attributeName) {
    this.attributeName = attributeName;
  }

  public AttributeItem attributeType(ProductAttributeType attributeType) {
    this.attributeType = attributeType;
    return this;
  }

  /**
   * Get attributeType
   *
   * @return attributeType
   */
  @ApiModelProperty(value = "")
  public ProductAttributeType getAttributeType() {
    return attributeType;
  }

  public void setAttributeType(ProductAttributeType attributeType) {
    this.attributeType = attributeType;
  }

  public AttributeItem lastCategoryId(Long lastCategoryId) {
    this.lastCategoryId = lastCategoryId;
    return this;
  }

  /**
   * Get lastCategoryId
   *
   * @return lastCategoryId
   */
  @ApiModelProperty(value = "")
  public Long getLastCategoryId() {
    return lastCategoryId;
  }

  public void setLastCategoryId(Long lastCategoryId) {
    this.lastCategoryId = lastCategoryId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributeItem attributeItem = (AttributeItem) o;
    return Objects.equals(this.attributeName, attributeItem.attributeName)
        && Objects.equals(this.attributeType, attributeItem.attributeType)
        && Objects.equals(this.lastCategoryId, attributeItem.lastCategoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeName, attributeType, lastCategoryId);
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
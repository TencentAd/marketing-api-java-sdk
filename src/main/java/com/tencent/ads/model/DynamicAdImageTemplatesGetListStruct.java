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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** 返回结构 */
@ApiModel(description = "返回结构")
public class DynamicAdImageTemplatesGetListStruct {
  @SerializedName("dynamic_ad_template_id")
  private Long dynamicAdTemplateId = null;

  @SerializedName("dynamic_ad_template_name")
  private String dynamicAdTemplateName = null;

  @SerializedName("product_item_display_quantity")
  private AdNum productItemDisplayQuantity = null;

  @SerializedName("dynamic_ad_template_width")
  private Long dynamicAdTemplateWidth = null;

  @SerializedName("dynamic_ad_template_height")
  private Long dynamicAdTemplateHeight = null;

  @SerializedName("image_url")
  private String imageUrl = null;

  @SerializedName("image_product_fields")
  private List<String> imageProductFields = null;

  @SerializedName("fill_type")
  private TemplateImageFillType fillType = null;

  @SerializedName("coverage")
  private Double coverage = null;

  public DynamicAdImageTemplatesGetListStruct dynamicAdTemplateId(Long dynamicAdTemplateId) {
    this.dynamicAdTemplateId = dynamicAdTemplateId;
    return this;
  }

  /**
   * Get dynamicAdTemplateId
   *
   * @return dynamicAdTemplateId
   */
  @ApiModelProperty(value = "")
  public Long getDynamicAdTemplateId() {
    return dynamicAdTemplateId;
  }

  public void setDynamicAdTemplateId(Long dynamicAdTemplateId) {
    this.dynamicAdTemplateId = dynamicAdTemplateId;
  }

  public DynamicAdImageTemplatesGetListStruct dynamicAdTemplateName(String dynamicAdTemplateName) {
    this.dynamicAdTemplateName = dynamicAdTemplateName;
    return this;
  }

  /**
   * Get dynamicAdTemplateName
   *
   * @return dynamicAdTemplateName
   */
  @ApiModelProperty(value = "")
  public String getDynamicAdTemplateName() {
    return dynamicAdTemplateName;
  }

  public void setDynamicAdTemplateName(String dynamicAdTemplateName) {
    this.dynamicAdTemplateName = dynamicAdTemplateName;
  }

  public DynamicAdImageTemplatesGetListStruct productItemDisplayQuantity(
      AdNum productItemDisplayQuantity) {
    this.productItemDisplayQuantity = productItemDisplayQuantity;
    return this;
  }

  /**
   * Get productItemDisplayQuantity
   *
   * @return productItemDisplayQuantity
   */
  @ApiModelProperty(value = "")
  public AdNum getProductItemDisplayQuantity() {
    return productItemDisplayQuantity;
  }

  public void setProductItemDisplayQuantity(AdNum productItemDisplayQuantity) {
    this.productItemDisplayQuantity = productItemDisplayQuantity;
  }

  public DynamicAdImageTemplatesGetListStruct dynamicAdTemplateWidth(Long dynamicAdTemplateWidth) {
    this.dynamicAdTemplateWidth = dynamicAdTemplateWidth;
    return this;
  }

  /**
   * Get dynamicAdTemplateWidth
   *
   * @return dynamicAdTemplateWidth
   */
  @ApiModelProperty(value = "")
  public Long getDynamicAdTemplateWidth() {
    return dynamicAdTemplateWidth;
  }

  public void setDynamicAdTemplateWidth(Long dynamicAdTemplateWidth) {
    this.dynamicAdTemplateWidth = dynamicAdTemplateWidth;
  }

  public DynamicAdImageTemplatesGetListStruct dynamicAdTemplateHeight(
      Long dynamicAdTemplateHeight) {
    this.dynamicAdTemplateHeight = dynamicAdTemplateHeight;
    return this;
  }

  /**
   * Get dynamicAdTemplateHeight
   *
   * @return dynamicAdTemplateHeight
   */
  @ApiModelProperty(value = "")
  public Long getDynamicAdTemplateHeight() {
    return dynamicAdTemplateHeight;
  }

  public void setDynamicAdTemplateHeight(Long dynamicAdTemplateHeight) {
    this.dynamicAdTemplateHeight = dynamicAdTemplateHeight;
  }

  public DynamicAdImageTemplatesGetListStruct imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Get imageUrl
   *
   * @return imageUrl
   */
  @ApiModelProperty(value = "")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public DynamicAdImageTemplatesGetListStruct imageProductFields(List<String> imageProductFields) {
    this.imageProductFields = imageProductFields;
    return this;
  }

  public DynamicAdImageTemplatesGetListStruct addImageProductFieldsItem(
      String imageProductFieldsItem) {
    if (this.imageProductFields == null) {
      this.imageProductFields = new ArrayList<String>();
    }
    this.imageProductFields.add(imageProductFieldsItem);
    return this;
  }

  /**
   * Get imageProductFields
   *
   * @return imageProductFields
   */
  @ApiModelProperty(value = "")
  public List<String> getImageProductFields() {
    return imageProductFields;
  }

  public void setImageProductFields(List<String> imageProductFields) {
    this.imageProductFields = imageProductFields;
  }

  public DynamicAdImageTemplatesGetListStruct fillType(TemplateImageFillType fillType) {
    this.fillType = fillType;
    return this;
  }

  /**
   * Get fillType
   *
   * @return fillType
   */
  @ApiModelProperty(value = "")
  public TemplateImageFillType getFillType() {
    return fillType;
  }

  public void setFillType(TemplateImageFillType fillType) {
    this.fillType = fillType;
  }

  public DynamicAdImageTemplatesGetListStruct coverage(Double coverage) {
    this.coverage = coverage;
    return this;
  }

  /**
   * Get coverage
   *
   * @return coverage
   */
  @ApiModelProperty(value = "")
  public Double getCoverage() {
    return coverage;
  }

  public void setCoverage(Double coverage) {
    this.coverage = coverage;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicAdImageTemplatesGetListStruct dynamicAdImageTemplatesGetListStruct =
        (DynamicAdImageTemplatesGetListStruct) o;
    return Objects.equals(
            this.dynamicAdTemplateId, dynamicAdImageTemplatesGetListStruct.dynamicAdTemplateId)
        && Objects.equals(
            this.dynamicAdTemplateName, dynamicAdImageTemplatesGetListStruct.dynamicAdTemplateName)
        && Objects.equals(
            this.productItemDisplayQuantity,
            dynamicAdImageTemplatesGetListStruct.productItemDisplayQuantity)
        && Objects.equals(
            this.dynamicAdTemplateWidth,
            dynamicAdImageTemplatesGetListStruct.dynamicAdTemplateWidth)
        && Objects.equals(
            this.dynamicAdTemplateHeight,
            dynamicAdImageTemplatesGetListStruct.dynamicAdTemplateHeight)
        && Objects.equals(this.imageUrl, dynamicAdImageTemplatesGetListStruct.imageUrl)
        && Objects.equals(
            this.imageProductFields, dynamicAdImageTemplatesGetListStruct.imageProductFields)
        && Objects.equals(this.fillType, dynamicAdImageTemplatesGetListStruct.fillType)
        && Objects.equals(this.coverage, dynamicAdImageTemplatesGetListStruct.coverage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dynamicAdTemplateId,
        dynamicAdTemplateName,
        productItemDisplayQuantity,
        dynamicAdTemplateWidth,
        dynamicAdTemplateHeight,
        imageUrl,
        imageProductFields,
        fillType,
        coverage);
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

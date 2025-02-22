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

/** 创意组件字段结构 */
@ApiModel(description = "创意组件字段结构")
public class ComponentMetadataValueField {
  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private ComponentMetadataFieldType type = null;

  @SerializedName("structure")
  private List<ComponentMetadataValueFieldStructureField> structure = null;

  @SerializedName("is_array")
  private Boolean isArray = null;

  @SerializedName("valid")
  private ComponentMetadataValueValid valid = null;

  @SerializedName("label")
  private String label = null;

  public ComponentMetadataValueField name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   *
   * @return name
   */
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ComponentMetadataValueField type(ComponentMetadataFieldType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @ApiModelProperty(value = "")
  public ComponentMetadataFieldType getType() {
    return type;
  }

  public void setType(ComponentMetadataFieldType type) {
    this.type = type;
  }

  public ComponentMetadataValueField structure(
      List<ComponentMetadataValueFieldStructureField> structure) {
    this.structure = structure;
    return this;
  }

  public ComponentMetadataValueField addStructureItem(
      ComponentMetadataValueFieldStructureField structureItem) {
    if (this.structure == null) {
      this.structure = new ArrayList<ComponentMetadataValueFieldStructureField>();
    }
    this.structure.add(structureItem);
    return this;
  }

  /**
   * Get structure
   *
   * @return structure
   */
  @ApiModelProperty(value = "")
  public List<ComponentMetadataValueFieldStructureField> getStructure() {
    return structure;
  }

  public void setStructure(List<ComponentMetadataValueFieldStructureField> structure) {
    this.structure = structure;
  }

  public ComponentMetadataValueField isArray(Boolean isArray) {
    this.isArray = isArray;
    return this;
  }

  /**
   * Get isArray
   *
   * @return isArray
   */
  @ApiModelProperty(value = "")
  public Boolean isIsArray() {
    return isArray;
  }

  public void setIsArray(Boolean isArray) {
    this.isArray = isArray;
  }

  public ComponentMetadataValueField valid(ComponentMetadataValueValid valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   *
   * @return valid
   */
  @ApiModelProperty(value = "")
  public ComponentMetadataValueValid getValid() {
    return valid;
  }

  public void setValid(ComponentMetadataValueValid valid) {
    this.valid = valid;
  }

  public ComponentMetadataValueField label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   *
   * @return label
   */
  @ApiModelProperty(value = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentMetadataValueField componentMetadataValueField = (ComponentMetadataValueField) o;
    return Objects.equals(this.name, componentMetadataValueField.name)
        && Objects.equals(this.type, componentMetadataValueField.type)
        && Objects.equals(this.structure, componentMetadataValueField.structure)
        && Objects.equals(this.isArray, componentMetadataValueField.isArray)
        && Objects.equals(this.valid, componentMetadataValueField.valid)
        && Objects.equals(this.label, componentMetadataValueField.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, structure, isArray, valid, label);
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

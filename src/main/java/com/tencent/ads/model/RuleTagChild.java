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

/** 标签 */
@ApiModel(description = "标签")
public class RuleTagChild {
  @SerializedName("tag_id")
  private Long tagId = null;

  @SerializedName("parent_id")
  private Long parentId = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("level")
  private Long level = null;

  @SerializedName("type")
  private RuleLabTag type = null;

  @SerializedName("children")
  private List<RuleTagChildStr> children = null;

  public RuleTagChild tagId(Long tagId) {
    this.tagId = tagId;
    return this;
  }

  /**
   * Get tagId
   *
   * @return tagId
   */
  @ApiModelProperty(value = "")
  public Long getTagId() {
    return tagId;
  }

  public void setTagId(Long tagId) {
    this.tagId = tagId;
  }

  public RuleTagChild parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Get parentId
   *
   * @return parentId
   */
  @ApiModelProperty(value = "")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public RuleTagChild value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   *
   * @return value
   */
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public RuleTagChild name(String name) {
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

  public RuleTagChild level(Long level) {
    this.level = level;
    return this;
  }

  /**
   * Get level
   *
   * @return level
   */
  @ApiModelProperty(value = "")
  public Long getLevel() {
    return level;
  }

  public void setLevel(Long level) {
    this.level = level;
  }

  public RuleTagChild type(RuleLabTag type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @ApiModelProperty(value = "")
  public RuleLabTag getType() {
    return type;
  }

  public void setType(RuleLabTag type) {
    this.type = type;
  }

  public RuleTagChild children(List<RuleTagChildStr> children) {
    this.children = children;
    return this;
  }

  public RuleTagChild addChildrenItem(RuleTagChildStr childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<RuleTagChildStr>();
    }
    this.children.add(childrenItem);
    return this;
  }

  /**
   * Get children
   *
   * @return children
   */
  @ApiModelProperty(value = "")
  public List<RuleTagChildStr> getChildren() {
    return children;
  }

  public void setChildren(List<RuleTagChildStr> children) {
    this.children = children;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleTagChild ruleTagChild = (RuleTagChild) o;
    return Objects.equals(this.tagId, ruleTagChild.tagId)
        && Objects.equals(this.parentId, ruleTagChild.parentId)
        && Objects.equals(this.value, ruleTagChild.value)
        && Objects.equals(this.name, ruleTagChild.name)
        && Objects.equals(this.level, ruleTagChild.level)
        && Objects.equals(this.type, ruleTagChild.type)
        && Objects.equals(this.children, ruleTagChild.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagId, parentId, value, name, level, type, children);
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

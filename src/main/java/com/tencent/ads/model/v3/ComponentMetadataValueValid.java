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

/** 创意组件字段结构 */
@ApiModel(description = "创意组件字段结构")
public class ComponentMetadataValueValid {
  @SerializedName("required")
  private Boolean required = null;

  @SerializedName("type")
  private ComponentMetadataFieldValidType type = null;

  @SerializedName("file_format")
  private String fileFormat = null;

  @SerializedName("file_size_kb_limit")
  private Long fileSizeKbLimit = null;

  @SerializedName("height")
  private Long height = null;

  @SerializedName("width")
  private Long width = null;

  @SerializedName("max_length")
  private Long maxLength = null;

  @SerializedName("min_length")
  private Long minLength = null;

  @SerializedName("pattern")
  private String pattern = null;

  @SerializedName("min_emoji_occurs")
  private Long minEmojiOccurs = null;

  @SerializedName("max_emoji_occurs")
  private Long maxEmojiOccurs = null;

  @SerializedName("ratio_height")
  private Long ratioHeight = null;

  @SerializedName("ratio_width")
  private Long ratioWidth = null;

  @SerializedName("min_duration")
  private Long minDuration = null;

  @SerializedName("max_duration")
  private Long maxDuration = null;

  @SerializedName("min_height")
  private Long minHeight = null;

  @SerializedName("min_width")
  private Long minWidth = null;

  public ComponentMetadataValueValid required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Get required
   *
   * @return required
   */
  @ApiModelProperty(value = "")
  public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public ComponentMetadataValueValid type(ComponentMetadataFieldValidType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @ApiModelProperty(value = "")
  public ComponentMetadataFieldValidType getType() {
    return type;
  }

  public void setType(ComponentMetadataFieldValidType type) {
    this.type = type;
  }

  public ComponentMetadataValueValid fileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
    return this;
  }

  /**
   * Get fileFormat
   *
   * @return fileFormat
   */
  @ApiModelProperty(value = "")
  public String getFileFormat() {
    return fileFormat;
  }

  public void setFileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
  }

  public ComponentMetadataValueValid fileSizeKbLimit(Long fileSizeKbLimit) {
    this.fileSizeKbLimit = fileSizeKbLimit;
    return this;
  }

  /**
   * Get fileSizeKbLimit
   *
   * @return fileSizeKbLimit
   */
  @ApiModelProperty(value = "")
  public Long getFileSizeKbLimit() {
    return fileSizeKbLimit;
  }

  public void setFileSizeKbLimit(Long fileSizeKbLimit) {
    this.fileSizeKbLimit = fileSizeKbLimit;
  }

  public ComponentMetadataValueValid height(Long height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   *
   * @return height
   */
  @ApiModelProperty(value = "")
  public Long getHeight() {
    return height;
  }

  public void setHeight(Long height) {
    this.height = height;
  }

  public ComponentMetadataValueValid width(Long width) {
    this.width = width;
    return this;
  }

  /**
   * Get width
   *
   * @return width
   */
  @ApiModelProperty(value = "")
  public Long getWidth() {
    return width;
  }

  public void setWidth(Long width) {
    this.width = width;
  }

  public ComponentMetadataValueValid maxLength(Long maxLength) {
    this.maxLength = maxLength;
    return this;
  }

  /**
   * Get maxLength
   *
   * @return maxLength
   */
  @ApiModelProperty(value = "")
  public Long getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(Long maxLength) {
    this.maxLength = maxLength;
  }

  public ComponentMetadataValueValid minLength(Long minLength) {
    this.minLength = minLength;
    return this;
  }

  /**
   * Get minLength
   *
   * @return minLength
   */
  @ApiModelProperty(value = "")
  public Long getMinLength() {
    return minLength;
  }

  public void setMinLength(Long minLength) {
    this.minLength = minLength;
  }

  public ComponentMetadataValueValid pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

  /**
   * Get pattern
   *
   * @return pattern
   */
  @ApiModelProperty(value = "")
  public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  public ComponentMetadataValueValid minEmojiOccurs(Long minEmojiOccurs) {
    this.minEmojiOccurs = minEmojiOccurs;
    return this;
  }

  /**
   * Get minEmojiOccurs
   *
   * @return minEmojiOccurs
   */
  @ApiModelProperty(value = "")
  public Long getMinEmojiOccurs() {
    return minEmojiOccurs;
  }

  public void setMinEmojiOccurs(Long minEmojiOccurs) {
    this.minEmojiOccurs = minEmojiOccurs;
  }

  public ComponentMetadataValueValid maxEmojiOccurs(Long maxEmojiOccurs) {
    this.maxEmojiOccurs = maxEmojiOccurs;
    return this;
  }

  /**
   * Get maxEmojiOccurs
   *
   * @return maxEmojiOccurs
   */
  @ApiModelProperty(value = "")
  public Long getMaxEmojiOccurs() {
    return maxEmojiOccurs;
  }

  public void setMaxEmojiOccurs(Long maxEmojiOccurs) {
    this.maxEmojiOccurs = maxEmojiOccurs;
  }

  public ComponentMetadataValueValid ratioHeight(Long ratioHeight) {
    this.ratioHeight = ratioHeight;
    return this;
  }

  /**
   * Get ratioHeight
   *
   * @return ratioHeight
   */
  @ApiModelProperty(value = "")
  public Long getRatioHeight() {
    return ratioHeight;
  }

  public void setRatioHeight(Long ratioHeight) {
    this.ratioHeight = ratioHeight;
  }

  public ComponentMetadataValueValid ratioWidth(Long ratioWidth) {
    this.ratioWidth = ratioWidth;
    return this;
  }

  /**
   * Get ratioWidth
   *
   * @return ratioWidth
   */
  @ApiModelProperty(value = "")
  public Long getRatioWidth() {
    return ratioWidth;
  }

  public void setRatioWidth(Long ratioWidth) {
    this.ratioWidth = ratioWidth;
  }

  public ComponentMetadataValueValid minDuration(Long minDuration) {
    this.minDuration = minDuration;
    return this;
  }

  /**
   * Get minDuration
   *
   * @return minDuration
   */
  @ApiModelProperty(value = "")
  public Long getMinDuration() {
    return minDuration;
  }

  public void setMinDuration(Long minDuration) {
    this.minDuration = minDuration;
  }

  public ComponentMetadataValueValid maxDuration(Long maxDuration) {
    this.maxDuration = maxDuration;
    return this;
  }

  /**
   * Get maxDuration
   *
   * @return maxDuration
   */
  @ApiModelProperty(value = "")
  public Long getMaxDuration() {
    return maxDuration;
  }

  public void setMaxDuration(Long maxDuration) {
    this.maxDuration = maxDuration;
  }

  public ComponentMetadataValueValid minHeight(Long minHeight) {
    this.minHeight = minHeight;
    return this;
  }

  /**
   * Get minHeight
   *
   * @return minHeight
   */
  @ApiModelProperty(value = "")
  public Long getMinHeight() {
    return minHeight;
  }

  public void setMinHeight(Long minHeight) {
    this.minHeight = minHeight;
  }

  public ComponentMetadataValueValid minWidth(Long minWidth) {
    this.minWidth = minWidth;
    return this;
  }

  /**
   * Get minWidth
   *
   * @return minWidth
   */
  @ApiModelProperty(value = "")
  public Long getMinWidth() {
    return minWidth;
  }

  public void setMinWidth(Long minWidth) {
    this.minWidth = minWidth;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentMetadataValueValid componentMetadataValueValid = (ComponentMetadataValueValid) o;
    return Objects.equals(this.required, componentMetadataValueValid.required)
        && Objects.equals(this.type, componentMetadataValueValid.type)
        && Objects.equals(this.fileFormat, componentMetadataValueValid.fileFormat)
        && Objects.equals(this.fileSizeKbLimit, componentMetadataValueValid.fileSizeKbLimit)
        && Objects.equals(this.height, componentMetadataValueValid.height)
        && Objects.equals(this.width, componentMetadataValueValid.width)
        && Objects.equals(this.maxLength, componentMetadataValueValid.maxLength)
        && Objects.equals(this.minLength, componentMetadataValueValid.minLength)
        && Objects.equals(this.pattern, componentMetadataValueValid.pattern)
        && Objects.equals(this.minEmojiOccurs, componentMetadataValueValid.minEmojiOccurs)
        && Objects.equals(this.maxEmojiOccurs, componentMetadataValueValid.maxEmojiOccurs)
        && Objects.equals(this.ratioHeight, componentMetadataValueValid.ratioHeight)
        && Objects.equals(this.ratioWidth, componentMetadataValueValid.ratioWidth)
        && Objects.equals(this.minDuration, componentMetadataValueValid.minDuration)
        && Objects.equals(this.maxDuration, componentMetadataValueValid.maxDuration)
        && Objects.equals(this.minHeight, componentMetadataValueValid.minHeight)
        && Objects.equals(this.minWidth, componentMetadataValueValid.minWidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        required,
        type,
        fileFormat,
        fileSizeKbLimit,
        height,
        width,
        maxLength,
        minLength,
        pattern,
        minEmojiOccurs,
        maxEmojiOccurs,
        ratioHeight,
        ratioWidth,
        minDuration,
        maxDuration,
        minHeight,
        minWidth);
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
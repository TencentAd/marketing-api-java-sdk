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

/** 基础轮播图组件元素 */
@ApiModel(description = "基础轮播图组件元素")
public class SliderSpec {
  @SerializedName("image_id_list")
  private List<String> imageIdList = null;

  @SerializedName("width")
  private Long width = null;

  @SerializedName("height")
  private Long height = null;

  @SerializedName("slider_style")
  private Long sliderStyle = null;

  @SerializedName("bg_color")
  private String bgColor = null;

  public SliderSpec imageIdList(List<String> imageIdList) {
    this.imageIdList = imageIdList;
    return this;
  }

  public SliderSpec addImageIdListItem(String imageIdListItem) {
    if (this.imageIdList == null) {
      this.imageIdList = new ArrayList<String>();
    }
    this.imageIdList.add(imageIdListItem);
    return this;
  }

  /**
   * Get imageIdList
   *
   * @return imageIdList
   */
  @ApiModelProperty(value = "")
  public List<String> getImageIdList() {
    return imageIdList;
  }

  public void setImageIdList(List<String> imageIdList) {
    this.imageIdList = imageIdList;
  }

  public SliderSpec width(Long width) {
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

  public SliderSpec height(Long height) {
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

  public SliderSpec sliderStyle(Long sliderStyle) {
    this.sliderStyle = sliderStyle;
    return this;
  }

  /**
   * Get sliderStyle
   *
   * @return sliderStyle
   */
  @ApiModelProperty(value = "")
  public Long getSliderStyle() {
    return sliderStyle;
  }

  public void setSliderStyle(Long sliderStyle) {
    this.sliderStyle = sliderStyle;
  }

  public SliderSpec bgColor(String bgColor) {
    this.bgColor = bgColor;
    return this;
  }

  /**
   * Get bgColor
   *
   * @return bgColor
   */
  @ApiModelProperty(value = "")
  public String getBgColor() {
    return bgColor;
  }

  public void setBgColor(String bgColor) {
    this.bgColor = bgColor;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SliderSpec sliderSpec = (SliderSpec) o;
    return Objects.equals(this.imageIdList, sliderSpec.imageIdList)
        && Objects.equals(this.width, sliderSpec.width)
        && Objects.equals(this.height, sliderSpec.height)
        && Objects.equals(this.sliderStyle, sliderSpec.sliderStyle)
        && Objects.equals(this.bgColor, sliderSpec.bgColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageIdList, width, height, sliderStyle, bgColor);
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

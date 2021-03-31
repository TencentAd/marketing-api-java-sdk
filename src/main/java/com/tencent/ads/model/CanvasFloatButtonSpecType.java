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

/** 悬浮组件元素 */
@ApiModel(description = "悬浮组件元素")
public class CanvasFloatButtonSpecType {
  @SerializedName("style_type")
  private Long styleType = null;

  @SerializedName("image_id")
  private String imageId = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("title_color")
  private String titleColor = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("desc_color")
  private String descColor = null;

  @SerializedName("appear_type")
  private Long appearType = null;

  @SerializedName("disappear_type")
  private Long disappearType = null;

  @SerializedName("forbid_page")
  private List<Long> forbidPage = null;

  @SerializedName("element_type")
  private CanvasFloatElementType elementType = null;

  @SerializedName("app_download_spec")
  private FloatAppDownloadSpec appDownloadSpec = null;

  public CanvasFloatButtonSpecType styleType(Long styleType) {
    this.styleType = styleType;
    return this;
  }

  /**
   * Get styleType
   *
   * @return styleType
   */
  @ApiModelProperty(value = "")
  public Long getStyleType() {
    return styleType;
  }

  public void setStyleType(Long styleType) {
    this.styleType = styleType;
  }

  public CanvasFloatButtonSpecType imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

  /**
   * Get imageId
   *
   * @return imageId
   */
  @ApiModelProperty(value = "")
  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  public CanvasFloatButtonSpecType title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   *
   * @return title
   */
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CanvasFloatButtonSpecType titleColor(String titleColor) {
    this.titleColor = titleColor;
    return this;
  }

  /**
   * Get titleColor
   *
   * @return titleColor
   */
  @ApiModelProperty(value = "")
  public String getTitleColor() {
    return titleColor;
  }

  public void setTitleColor(String titleColor) {
    this.titleColor = titleColor;
  }

  public CanvasFloatButtonSpecType desc(String desc) {
    this.desc = desc;
    return this;
  }

  /**
   * Get desc
   *
   * @return desc
   */
  @ApiModelProperty(value = "")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public CanvasFloatButtonSpecType descColor(String descColor) {
    this.descColor = descColor;
    return this;
  }

  /**
   * Get descColor
   *
   * @return descColor
   */
  @ApiModelProperty(value = "")
  public String getDescColor() {
    return descColor;
  }

  public void setDescColor(String descColor) {
    this.descColor = descColor;
  }

  public CanvasFloatButtonSpecType appearType(Long appearType) {
    this.appearType = appearType;
    return this;
  }

  /**
   * Get appearType
   *
   * @return appearType
   */
  @ApiModelProperty(value = "")
  public Long getAppearType() {
    return appearType;
  }

  public void setAppearType(Long appearType) {
    this.appearType = appearType;
  }

  public CanvasFloatButtonSpecType disappearType(Long disappearType) {
    this.disappearType = disappearType;
    return this;
  }

  /**
   * Get disappearType
   *
   * @return disappearType
   */
  @ApiModelProperty(value = "")
  public Long getDisappearType() {
    return disappearType;
  }

  public void setDisappearType(Long disappearType) {
    this.disappearType = disappearType;
  }

  public CanvasFloatButtonSpecType forbidPage(List<Long> forbidPage) {
    this.forbidPage = forbidPage;
    return this;
  }

  public CanvasFloatButtonSpecType addForbidPageItem(Long forbidPageItem) {
    if (this.forbidPage == null) {
      this.forbidPage = new ArrayList<Long>();
    }
    this.forbidPage.add(forbidPageItem);
    return this;
  }

  /**
   * Get forbidPage
   *
   * @return forbidPage
   */
  @ApiModelProperty(value = "")
  public List<Long> getForbidPage() {
    return forbidPage;
  }

  public void setForbidPage(List<Long> forbidPage) {
    this.forbidPage = forbidPage;
  }

  public CanvasFloatButtonSpecType elementType(CanvasFloatElementType elementType) {
    this.elementType = elementType;
    return this;
  }

  /**
   * Get elementType
   *
   * @return elementType
   */
  @ApiModelProperty(value = "")
  public CanvasFloatElementType getElementType() {
    return elementType;
  }

  public void setElementType(CanvasFloatElementType elementType) {
    this.elementType = elementType;
  }

  public CanvasFloatButtonSpecType appDownloadSpec(FloatAppDownloadSpec appDownloadSpec) {
    this.appDownloadSpec = appDownloadSpec;
    return this;
  }

  /**
   * Get appDownloadSpec
   *
   * @return appDownloadSpec
   */
  @ApiModelProperty(value = "")
  public FloatAppDownloadSpec getAppDownloadSpec() {
    return appDownloadSpec;
  }

  public void setAppDownloadSpec(FloatAppDownloadSpec appDownloadSpec) {
    this.appDownloadSpec = appDownloadSpec;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CanvasFloatButtonSpecType canvasFloatButtonSpecType = (CanvasFloatButtonSpecType) o;
    return Objects.equals(this.styleType, canvasFloatButtonSpecType.styleType)
        && Objects.equals(this.imageId, canvasFloatButtonSpecType.imageId)
        && Objects.equals(this.title, canvasFloatButtonSpecType.title)
        && Objects.equals(this.titleColor, canvasFloatButtonSpecType.titleColor)
        && Objects.equals(this.desc, canvasFloatButtonSpecType.desc)
        && Objects.equals(this.descColor, canvasFloatButtonSpecType.descColor)
        && Objects.equals(this.appearType, canvasFloatButtonSpecType.appearType)
        && Objects.equals(this.disappearType, canvasFloatButtonSpecType.disappearType)
        && Objects.equals(this.forbidPage, canvasFloatButtonSpecType.forbidPage)
        && Objects.equals(this.elementType, canvasFloatButtonSpecType.elementType)
        && Objects.equals(this.appDownloadSpec, canvasFloatButtonSpecType.appDownloadSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        styleType,
        imageId,
        title,
        titleColor,
        desc,
        descColor,
        appearType,
        disappearType,
        forbidPage,
        elementType,
        appDownloadSpec);
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

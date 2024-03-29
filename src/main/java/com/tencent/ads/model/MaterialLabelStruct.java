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

/** 素材标签信息 */
@ApiModel(description = "素材标签信息")
public class MaterialLabelStruct {
  @SerializedName("image_id")
  private String imageId = null;

  @SerializedName("media_id")
  private String mediaId = null;

  @SerializedName("label_list")
  private List<CustomLabelStruct> labelList = null;

  public MaterialLabelStruct imageId(String imageId) {
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

  public MaterialLabelStruct mediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }

  /**
   * Get mediaId
   *
   * @return mediaId
   */
  @ApiModelProperty(value = "")
  public String getMediaId() {
    return mediaId;
  }

  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }

  public MaterialLabelStruct labelList(List<CustomLabelStruct> labelList) {
    this.labelList = labelList;
    return this;
  }

  public MaterialLabelStruct addLabelListItem(CustomLabelStruct labelListItem) {
    if (this.labelList == null) {
      this.labelList = new ArrayList<CustomLabelStruct>();
    }
    this.labelList.add(labelListItem);
    return this;
  }

  /**
   * Get labelList
   *
   * @return labelList
   */
  @ApiModelProperty(value = "")
  public List<CustomLabelStruct> getLabelList() {
    return labelList;
  }

  public void setLabelList(List<CustomLabelStruct> labelList) {
    this.labelList = labelList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaterialLabelStruct materialLabelStruct = (MaterialLabelStruct) o;
    return Objects.equals(this.imageId, materialLabelStruct.imageId)
        && Objects.equals(this.mediaId, materialLabelStruct.mediaId)
        && Objects.equals(this.labelList, materialLabelStruct.labelList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageId, mediaId, labelList);
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

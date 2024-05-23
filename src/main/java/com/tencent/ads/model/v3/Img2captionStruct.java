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

/** 图片提取描述参数信息 */
@ApiModel(description = "图片提取描述参数信息")
public class Img2captionStruct {
  @SerializedName("image_ids")
  private List<String> imageIds = null;

  public Img2captionStruct imageIds(List<String> imageIds) {
    this.imageIds = imageIds;
    return this;
  }

  public Img2captionStruct addImageIdsItem(String imageIdsItem) {
    if (this.imageIds == null) {
      this.imageIds = new ArrayList<String>();
    }
    this.imageIds.add(imageIdsItem);
    return this;
  }

  /**
   * Get imageIds
   *
   * @return imageIds
   */
  @ApiModelProperty(value = "")
  public List<String> getImageIds() {
    return imageIds;
  }

  public void setImageIds(List<String> imageIds) {
    this.imageIds = imageIds;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Img2captionStruct img2captionStruct = (Img2captionStruct) o;
    return Objects.equals(this.imageIds, img2captionStruct.imageIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageIds);
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

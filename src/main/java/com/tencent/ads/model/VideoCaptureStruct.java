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
import java.util.Objects;

/** 视频封面图 */
@ApiModel(description = "视频封面图")
public class VideoCaptureStruct {
  @SerializedName("image_url")
  private String imageUrl = null;

  @SerializedName("image_type")
  private VideoCaptureImageType imageType = null;

  @SerializedName("image_id")
  private String imageId = null;

  public VideoCaptureStruct imageUrl(String imageUrl) {
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

  public VideoCaptureStruct imageType(VideoCaptureImageType imageType) {
    this.imageType = imageType;
    return this;
  }

  /**
   * Get imageType
   *
   * @return imageType
   */
  @ApiModelProperty(value = "")
  public VideoCaptureImageType getImageType() {
    return imageType;
  }

  public void setImageType(VideoCaptureImageType imageType) {
    this.imageType = imageType;
  }

  public VideoCaptureStruct imageId(String imageId) {
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoCaptureStruct videoCaptureStruct = (VideoCaptureStruct) o;
    return Objects.equals(this.imageUrl, videoCaptureStruct.imageUrl)
        && Objects.equals(this.imageType, videoCaptureStruct.imageType)
        && Objects.equals(this.imageId, videoCaptureStruct.imageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageUrl, imageType, imageId);
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

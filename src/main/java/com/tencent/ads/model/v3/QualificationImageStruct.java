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

/** 资质图片信息 */
@ApiModel(description = "资质图片信息")
public class QualificationImageStruct {
  @SerializedName("image_id")
  private String imageId = null;

  @SerializedName("image_url")
  private String imageUrl = null;

  public QualificationImageStruct imageId(String imageId) {
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

  public QualificationImageStruct imageUrl(String imageUrl) {
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QualificationImageStruct qualificationImageStruct = (QualificationImageStruct) o;
    return Objects.equals(this.imageId, qualificationImageStruct.imageId)
        && Objects.equals(this.imageUrl, qualificationImageStruct.imageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageId, imageUrl);
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
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

/** 基础视频组件元素&lt;br&gt; 视频时长1-30秒. &lt;br&gt; 视频大小不超过20MB. &lt;br&gt; 视频尺寸: 750*&lt;&#x3D;1536 */
@ApiModel(
    description =
        "基础视频组件元素<br>        视频时长1-30秒. <br>        视频大小不超过20MB. <br>        视频尺寸: 750*<=1536")
public class VideoSpec {
  @SerializedName("video_id")
  private String videoId = null;

  @SerializedName("width")
  private Long width = null;

  @SerializedName("height")
  private Long height = null;

  @SerializedName("in_middle")
  private Long inMiddle = null;

  public VideoSpec videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

  /**
   * Get videoId
   *
   * @return videoId
   */
  @ApiModelProperty(value = "")
  public String getVideoId() {
    return videoId;
  }

  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }

  public VideoSpec width(Long width) {
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

  public VideoSpec height(Long height) {
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

  public VideoSpec inMiddle(Long inMiddle) {
    this.inMiddle = inMiddle;
    return this;
  }

  /**
   * Get inMiddle
   *
   * @return inMiddle
   */
  @ApiModelProperty(value = "")
  public Long getInMiddle() {
    return inMiddle;
  }

  public void setInMiddle(Long inMiddle) {
    this.inMiddle = inMiddle;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoSpec videoSpec = (VideoSpec) o;
    return Objects.equals(this.videoId, videoSpec.videoId)
        && Objects.equals(this.width, videoSpec.width)
        && Objects.equals(this.height, videoSpec.height)
        && Objects.equals(this.inMiddle, videoSpec.inMiddle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoId, width, height, inMiddle);
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

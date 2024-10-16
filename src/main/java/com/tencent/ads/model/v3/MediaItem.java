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

/** 视频素材 */
@ApiModel(description = "视频素材")
public class MediaItem {
  @SerializedName("media_id")
  private Long mediaId = null;

  @SerializedName("info")
  private List<MediaInfoItem> info = null;

  public MediaItem mediaId(Long mediaId) {
    this.mediaId = mediaId;
    return this;
  }

  /**
   * Get mediaId
   *
   * @return mediaId
   */
  @ApiModelProperty(value = "")
  public Long getMediaId() {
    return mediaId;
  }

  public void setMediaId(Long mediaId) {
    this.mediaId = mediaId;
  }

  public MediaItem info(List<MediaInfoItem> info) {
    this.info = info;
    return this;
  }

  public MediaItem addInfoItem(MediaInfoItem infoItem) {
    if (this.info == null) {
      this.info = new ArrayList<MediaInfoItem>();
    }
    this.info.add(infoItem);
    return this;
  }

  /**
   * Get info
   *
   * @return info
   */
  @ApiModelProperty(value = "")
  public List<MediaInfoItem> getInfo() {
    return info;
  }

  public void setInfo(List<MediaInfoItem> info) {
    this.info = info;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaItem mediaItem = (MediaItem) o;
    return Objects.equals(this.mediaId, mediaItem.mediaId)
        && Objects.equals(this.info, mediaItem.info);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaId, info);
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
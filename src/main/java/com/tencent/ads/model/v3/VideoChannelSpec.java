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

/** 关注视频号信息元素 */
@ApiModel(description = "关注视频号信息元素")
public class VideoChannelSpec {
  @SerializedName("title")
  private String title = null;

  @SerializedName("finder_nickname")
  private String finderNickname = null;

  @SerializedName("fast_follow")
  private Long fastFollow = null;

  public VideoChannelSpec title(String title) {
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

  public VideoChannelSpec finderNickname(String finderNickname) {
    this.finderNickname = finderNickname;
    return this;
  }

  /**
   * Get finderNickname
   *
   * @return finderNickname
   */
  @ApiModelProperty(value = "")
  public String getFinderNickname() {
    return finderNickname;
  }

  public void setFinderNickname(String finderNickname) {
    this.finderNickname = finderNickname;
  }

  public VideoChannelSpec fastFollow(Long fastFollow) {
    this.fastFollow = fastFollow;
    return this;
  }

  /**
   * Get fastFollow
   *
   * @return fastFollow
   */
  @ApiModelProperty(value = "")
  public Long getFastFollow() {
    return fastFollow;
  }

  public void setFastFollow(Long fastFollow) {
    this.fastFollow = fastFollow;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoChannelSpec videoChannelSpec = (VideoChannelSpec) o;
    return Objects.equals(this.title, videoChannelSpec.title)
        && Objects.equals(this.finderNickname, videoChannelSpec.finderNickname)
        && Objects.equals(this.fastFollow, videoChannelSpec.fastFollow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, finderNickname, fastFollow);
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

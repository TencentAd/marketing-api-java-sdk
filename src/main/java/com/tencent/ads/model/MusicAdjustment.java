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

/** 添加背景音乐 */
@ApiModel(description = "添加背景音乐")
public class MusicAdjustment {
  @SerializedName("music_adjustment_method")
  private MusicAdjustmentMethodEnum musicAdjustmentMethod = null;

  public MusicAdjustment musicAdjustmentMethod(MusicAdjustmentMethodEnum musicAdjustmentMethod) {
    this.musicAdjustmentMethod = musicAdjustmentMethod;
    return this;
  }

  /**
   * Get musicAdjustmentMethod
   *
   * @return musicAdjustmentMethod
   */
  @ApiModelProperty(value = "")
  public MusicAdjustmentMethodEnum getMusicAdjustmentMethod() {
    return musicAdjustmentMethod;
  }

  public void setMusicAdjustmentMethod(MusicAdjustmentMethodEnum musicAdjustmentMethod) {
    this.musicAdjustmentMethod = musicAdjustmentMethod;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MusicAdjustment musicAdjustment = (MusicAdjustment) o;
    return Objects.equals(this.musicAdjustmentMethod, musicAdjustment.musicAdjustmentMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(musicAdjustmentMethod);
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

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

/** 手工调整视频 */
@ApiModel(description = "手工调整视频")
public class ManualAdjustment {
  @SerializedName("size_adjustment")
  private SizeAdjustment sizeAdjustment = null;

  @SerializedName("length_adjustment")
  private LengthAdjustment lengthAdjustment = null;

  @SerializedName("music_adjustment")
  private MusicAdjustment musicAdjustment = null;

  public ManualAdjustment sizeAdjustment(SizeAdjustment sizeAdjustment) {
    this.sizeAdjustment = sizeAdjustment;
    return this;
  }

  /**
   * Get sizeAdjustment
   *
   * @return sizeAdjustment
   */
  @ApiModelProperty(value = "")
  public SizeAdjustment getSizeAdjustment() {
    return sizeAdjustment;
  }

  public void setSizeAdjustment(SizeAdjustment sizeAdjustment) {
    this.sizeAdjustment = sizeAdjustment;
  }

  public ManualAdjustment lengthAdjustment(LengthAdjustment lengthAdjustment) {
    this.lengthAdjustment = lengthAdjustment;
    return this;
  }

  /**
   * Get lengthAdjustment
   *
   * @return lengthAdjustment
   */
  @ApiModelProperty(value = "")
  public LengthAdjustment getLengthAdjustment() {
    return lengthAdjustment;
  }

  public void setLengthAdjustment(LengthAdjustment lengthAdjustment) {
    this.lengthAdjustment = lengthAdjustment;
  }

  public ManualAdjustment musicAdjustment(MusicAdjustment musicAdjustment) {
    this.musicAdjustment = musicAdjustment;
    return this;
  }

  /**
   * Get musicAdjustment
   *
   * @return musicAdjustment
   */
  @ApiModelProperty(value = "")
  public MusicAdjustment getMusicAdjustment() {
    return musicAdjustment;
  }

  public void setMusicAdjustment(MusicAdjustment musicAdjustment) {
    this.musicAdjustment = musicAdjustment;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManualAdjustment manualAdjustment = (ManualAdjustment) o;
    return Objects.equals(this.sizeAdjustment, manualAdjustment.sizeAdjustment)
        && Objects.equals(this.lengthAdjustment, manualAdjustment.lengthAdjustment)
        && Objects.equals(this.musicAdjustment, manualAdjustment.musicAdjustment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sizeAdjustment, lengthAdjustment, musicAdjustment);
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

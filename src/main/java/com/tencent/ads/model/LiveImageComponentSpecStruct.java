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

/** 喝彩图&amp;背景图创意组件详情 */
@ApiModel(description = "喝彩图&背景图创意组件详情")
public class LiveImageComponentSpecStruct {
  @SerializedName("bg_img_url")
  private String bgImgUrl = null;

  @SerializedName("bg_img_id")
  private String bgImgId = null;

  @SerializedName("cheer_icon")
  private List<LiveCheerIconStruct> cheerIcon = null;

  @SerializedName("is_use_cheer_icon")
  private Long isUseCheerIcon = null;

  @SerializedName("is_use_bg_img")
  private Long isUseBgImg = null;

  @SerializedName("live_begin_time")
  private Long liveBeginTime = null;

  public LiveImageComponentSpecStruct bgImgUrl(String bgImgUrl) {
    this.bgImgUrl = bgImgUrl;
    return this;
  }

  /**
   * Get bgImgUrl
   *
   * @return bgImgUrl
   */
  @ApiModelProperty(value = "")
  public String getBgImgUrl() {
    return bgImgUrl;
  }

  public void setBgImgUrl(String bgImgUrl) {
    this.bgImgUrl = bgImgUrl;
  }

  public LiveImageComponentSpecStruct bgImgId(String bgImgId) {
    this.bgImgId = bgImgId;
    return this;
  }

  /**
   * Get bgImgId
   *
   * @return bgImgId
   */
  @ApiModelProperty(value = "")
  public String getBgImgId() {
    return bgImgId;
  }

  public void setBgImgId(String bgImgId) {
    this.bgImgId = bgImgId;
  }

  public LiveImageComponentSpecStruct cheerIcon(List<LiveCheerIconStruct> cheerIcon) {
    this.cheerIcon = cheerIcon;
    return this;
  }

  public LiveImageComponentSpecStruct addCheerIconItem(LiveCheerIconStruct cheerIconItem) {
    if (this.cheerIcon == null) {
      this.cheerIcon = new ArrayList<LiveCheerIconStruct>();
    }
    this.cheerIcon.add(cheerIconItem);
    return this;
  }

  /**
   * Get cheerIcon
   *
   * @return cheerIcon
   */
  @ApiModelProperty(value = "")
  public List<LiveCheerIconStruct> getCheerIcon() {
    return cheerIcon;
  }

  public void setCheerIcon(List<LiveCheerIconStruct> cheerIcon) {
    this.cheerIcon = cheerIcon;
  }

  public LiveImageComponentSpecStruct isUseCheerIcon(Long isUseCheerIcon) {
    this.isUseCheerIcon = isUseCheerIcon;
    return this;
  }

  /**
   * Get isUseCheerIcon
   *
   * @return isUseCheerIcon
   */
  @ApiModelProperty(value = "")
  public Long getIsUseCheerIcon() {
    return isUseCheerIcon;
  }

  public void setIsUseCheerIcon(Long isUseCheerIcon) {
    this.isUseCheerIcon = isUseCheerIcon;
  }

  public LiveImageComponentSpecStruct isUseBgImg(Long isUseBgImg) {
    this.isUseBgImg = isUseBgImg;
    return this;
  }

  /**
   * Get isUseBgImg
   *
   * @return isUseBgImg
   */
  @ApiModelProperty(value = "")
  public Long getIsUseBgImg() {
    return isUseBgImg;
  }

  public void setIsUseBgImg(Long isUseBgImg) {
    this.isUseBgImg = isUseBgImg;
  }

  public LiveImageComponentSpecStruct liveBeginTime(Long liveBeginTime) {
    this.liveBeginTime = liveBeginTime;
    return this;
  }

  /**
   * Get liveBeginTime
   *
   * @return liveBeginTime
   */
  @ApiModelProperty(value = "")
  public Long getLiveBeginTime() {
    return liveBeginTime;
  }

  public void setLiveBeginTime(Long liveBeginTime) {
    this.liveBeginTime = liveBeginTime;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveImageComponentSpecStruct liveImageComponentSpecStruct = (LiveImageComponentSpecStruct) o;
    return Objects.equals(this.bgImgUrl, liveImageComponentSpecStruct.bgImgUrl)
        && Objects.equals(this.bgImgId, liveImageComponentSpecStruct.bgImgId)
        && Objects.equals(this.cheerIcon, liveImageComponentSpecStruct.cheerIcon)
        && Objects.equals(this.isUseCheerIcon, liveImageComponentSpecStruct.isUseCheerIcon)
        && Objects.equals(this.isUseBgImg, liveImageComponentSpecStruct.isUseBgImg)
        && Objects.equals(this.liveBeginTime, liveImageComponentSpecStruct.liveBeginTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bgImgUrl, bgImgId, cheerIcon, isUseCheerIcon, isUseBgImg, liveBeginTime);
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

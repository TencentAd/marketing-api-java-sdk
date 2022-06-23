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

/** 微信搜一搜品牌专区-doc区块-卡片信息 */
@ApiModel(description = "微信搜一搜品牌专区-doc区块-卡片信息")
public class WxSearchBrandAreaDocActivityInfoCardInfo {
  @SerializedName("card_type")
  private Long cardType = null;

  @SerializedName("image_url")
  private String imageUrl = null;

  @SerializedName("video_url")
  private String videoUrl = null;

  @SerializedName("jump_info")
  private WxSearchBrandAreaDocJumpInfo jumpInfo = null;

  @SerializedName("menus")
  private List<WxSearchBrandAreaDocActivityInfoMenus> menus = null;

  @SerializedName("activity_block")
  private WxSearchBrandAreaDocActivityInfoActivityBlock activityBlock = null;

  @SerializedName("finder_username")
  private String finderUsername = null;

  @SerializedName("hide_number_of_visitors")
  private Boolean hideNumberOfVisitors = null;

  @SerializedName("hide_source")
  private Boolean hideSource = null;

  @SerializedName("hide_data_label")
  private Boolean hideDataLabel = null;

  public WxSearchBrandAreaDocActivityInfoCardInfo cardType(Long cardType) {
    this.cardType = cardType;
    return this;
  }

  /**
   * Get cardType
   *
   * @return cardType
   */
  @ApiModelProperty(value = "")
  public Long getCardType() {
    return cardType;
  }

  public void setCardType(Long cardType) {
    this.cardType = cardType;
  }

  public WxSearchBrandAreaDocActivityInfoCardInfo imageUrl(String imageUrl) {
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

  public WxSearchBrandAreaDocActivityInfoCardInfo videoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
    return this;
  }

  /**
   * Get videoUrl
   *
   * @return videoUrl
   */
  @ApiModelProperty(value = "")
  public String getVideoUrl() {
    return videoUrl;
  }

  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }

  public WxSearchBrandAreaDocActivityInfoCardInfo jumpInfo(WxSearchBrandAreaDocJumpInfo jumpInfo) {
    this.jumpInfo = jumpInfo;
    return this;
  }

  /**
   * Get jumpInfo
   *
   * @return jumpInfo
   */
  @ApiModelProperty(value = "")
  public WxSearchBrandAreaDocJumpInfo getJumpInfo() {
    return jumpInfo;
  }

  public void setJumpInfo(WxSearchBrandAreaDocJumpInfo jumpInfo) {
    this.jumpInfo = jumpInfo;
  }

  public WxSearchBrandAreaDocActivityInfoCardInfo menus(
      List<WxSearchBrandAreaDocActivityInfoMenus> menus) {
    this.menus = menus;
    return this;
  }

  public WxSearchBrandAreaDocActivityInfoCardInfo addMenusItem(
      WxSearchBrandAreaDocActivityInfoMenus menusItem) {
    if (this.menus == null) {
      this.menus = new ArrayList<WxSearchBrandAreaDocActivityInfoMenus>();
    }
    this.menus.add(menusItem);
    return this;
  }

  /**
   * Get menus
   *
   * @return menus
   */
  @ApiModelProperty(value = "")
  public List<WxSearchBrandAreaDocActivityInfoMenus> getMenus() {
    return menus;
  }

  public void setMenus(List<WxSearchBrandAreaDocActivityInfoMenus> menus) {
    this.menus = menus;
  }

  public WxSearchBrandAreaDocActivityInfoCardInfo activityBlock(
      WxSearchBrandAreaDocActivityInfoActivityBlock activityBlock) {
    this.activityBlock = activityBlock;
    return this;
  }

  /**
   * Get activityBlock
   *
   * @return activityBlock
   */
  @ApiModelProperty(value = "")
  public WxSearchBrandAreaDocActivityInfoActivityBlock getActivityBlock() {
    return activityBlock;
  }

  public void setActivityBlock(WxSearchBrandAreaDocActivityInfoActivityBlock activityBlock) {
    this.activityBlock = activityBlock;
  }

  public WxSearchBrandAreaDocActivityInfoCardInfo finderUsername(String finderUsername) {
    this.finderUsername = finderUsername;
    return this;
  }

  /**
   * Get finderUsername
   *
   * @return finderUsername
   */
  @ApiModelProperty(value = "")
  public String getFinderUsername() {
    return finderUsername;
  }

  public void setFinderUsername(String finderUsername) {
    this.finderUsername = finderUsername;
  }

  public WxSearchBrandAreaDocActivityInfoCardInfo hideNumberOfVisitors(
      Boolean hideNumberOfVisitors) {
    this.hideNumberOfVisitors = hideNumberOfVisitors;
    return this;
  }

  /**
   * Get hideNumberOfVisitors
   *
   * @return hideNumberOfVisitors
   */
  @ApiModelProperty(value = "")
  public Boolean isHideNumberOfVisitors() {
    return hideNumberOfVisitors;
  }

  public void setHideNumberOfVisitors(Boolean hideNumberOfVisitors) {
    this.hideNumberOfVisitors = hideNumberOfVisitors;
  }

  public WxSearchBrandAreaDocActivityInfoCardInfo hideSource(Boolean hideSource) {
    this.hideSource = hideSource;
    return this;
  }

  /**
   * Get hideSource
   *
   * @return hideSource
   */
  @ApiModelProperty(value = "")
  public Boolean isHideSource() {
    return hideSource;
  }

  public void setHideSource(Boolean hideSource) {
    this.hideSource = hideSource;
  }

  public WxSearchBrandAreaDocActivityInfoCardInfo hideDataLabel(Boolean hideDataLabel) {
    this.hideDataLabel = hideDataLabel;
    return this;
  }

  /**
   * Get hideDataLabel
   *
   * @return hideDataLabel
   */
  @ApiModelProperty(value = "")
  public Boolean isHideDataLabel() {
    return hideDataLabel;
  }

  public void setHideDataLabel(Boolean hideDataLabel) {
    this.hideDataLabel = hideDataLabel;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WxSearchBrandAreaDocActivityInfoCardInfo wxSearchBrandAreaDocActivityInfoCardInfo =
        (WxSearchBrandAreaDocActivityInfoCardInfo) o;
    return Objects.equals(this.cardType, wxSearchBrandAreaDocActivityInfoCardInfo.cardType)
        && Objects.equals(this.imageUrl, wxSearchBrandAreaDocActivityInfoCardInfo.imageUrl)
        && Objects.equals(this.videoUrl, wxSearchBrandAreaDocActivityInfoCardInfo.videoUrl)
        && Objects.equals(this.jumpInfo, wxSearchBrandAreaDocActivityInfoCardInfo.jumpInfo)
        && Objects.equals(this.menus, wxSearchBrandAreaDocActivityInfoCardInfo.menus)
        && Objects.equals(
            this.activityBlock, wxSearchBrandAreaDocActivityInfoCardInfo.activityBlock)
        && Objects.equals(
            this.finderUsername, wxSearchBrandAreaDocActivityInfoCardInfo.finderUsername)
        && Objects.equals(
            this.hideNumberOfVisitors,
            wxSearchBrandAreaDocActivityInfoCardInfo.hideNumberOfVisitors)
        && Objects.equals(this.hideSource, wxSearchBrandAreaDocActivityInfoCardInfo.hideSource)
        && Objects.equals(
            this.hideDataLabel, wxSearchBrandAreaDocActivityInfoCardInfo.hideDataLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cardType,
        imageUrl,
        videoUrl,
        jumpInfo,
        menus,
        activityBlock,
        finderUsername,
        hideNumberOfVisitors,
        hideSource,
        hideDataLabel);
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

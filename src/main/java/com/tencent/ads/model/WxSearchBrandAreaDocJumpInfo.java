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

/** 微信搜一搜品牌专区-通用跳转结构 */
@ApiModel(description = "微信搜一搜品牌专区-通用跳转结构")
public class WxSearchBrandAreaDocJumpInfo {
  @SerializedName("jump_type")
  private Long jumpType = null;

  @SerializedName("user_name")
  private String userName = null;

  @SerializedName("weapp_url")
  private String weappUrl = null;

  @SerializedName("jump_url")
  private String jumpUrl = null;

  @SerializedName("feed_id")
  private String feedId = null;

  @SerializedName("comment_scene")
  private Long commentScene = null;

  @SerializedName("feed_nonce_id")
  private String feedNonceId = null;

  @SerializedName("ext_info")
  private String extInfo = null;

  @SerializedName("canvas_id")
  private String canvasId = null;

  public WxSearchBrandAreaDocJumpInfo jumpType(Long jumpType) {
    this.jumpType = jumpType;
    return this;
  }

  /**
   * Get jumpType
   *
   * @return jumpType
   */
  @ApiModelProperty(value = "")
  public Long getJumpType() {
    return jumpType;
  }

  public void setJumpType(Long jumpType) {
    this.jumpType = jumpType;
  }

  public WxSearchBrandAreaDocJumpInfo userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   *
   * @return userName
   */
  @ApiModelProperty(value = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public WxSearchBrandAreaDocJumpInfo weappUrl(String weappUrl) {
    this.weappUrl = weappUrl;
    return this;
  }

  /**
   * Get weappUrl
   *
   * @return weappUrl
   */
  @ApiModelProperty(value = "")
  public String getWeappUrl() {
    return weappUrl;
  }

  public void setWeappUrl(String weappUrl) {
    this.weappUrl = weappUrl;
  }

  public WxSearchBrandAreaDocJumpInfo jumpUrl(String jumpUrl) {
    this.jumpUrl = jumpUrl;
    return this;
  }

  /**
   * Get jumpUrl
   *
   * @return jumpUrl
   */
  @ApiModelProperty(value = "")
  public String getJumpUrl() {
    return jumpUrl;
  }

  public void setJumpUrl(String jumpUrl) {
    this.jumpUrl = jumpUrl;
  }

  public WxSearchBrandAreaDocJumpInfo feedId(String feedId) {
    this.feedId = feedId;
    return this;
  }

  /**
   * Get feedId
   *
   * @return feedId
   */
  @ApiModelProperty(value = "")
  public String getFeedId() {
    return feedId;
  }

  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

  public WxSearchBrandAreaDocJumpInfo commentScene(Long commentScene) {
    this.commentScene = commentScene;
    return this;
  }

  /**
   * Get commentScene
   *
   * @return commentScene
   */
  @ApiModelProperty(value = "")
  public Long getCommentScene() {
    return commentScene;
  }

  public void setCommentScene(Long commentScene) {
    this.commentScene = commentScene;
  }

  public WxSearchBrandAreaDocJumpInfo feedNonceId(String feedNonceId) {
    this.feedNonceId = feedNonceId;
    return this;
  }

  /**
   * Get feedNonceId
   *
   * @return feedNonceId
   */
  @ApiModelProperty(value = "")
  public String getFeedNonceId() {
    return feedNonceId;
  }

  public void setFeedNonceId(String feedNonceId) {
    this.feedNonceId = feedNonceId;
  }

  public WxSearchBrandAreaDocJumpInfo extInfo(String extInfo) {
    this.extInfo = extInfo;
    return this;
  }

  /**
   * Get extInfo
   *
   * @return extInfo
   */
  @ApiModelProperty(value = "")
  public String getExtInfo() {
    return extInfo;
  }

  public void setExtInfo(String extInfo) {
    this.extInfo = extInfo;
  }

  public WxSearchBrandAreaDocJumpInfo canvasId(String canvasId) {
    this.canvasId = canvasId;
    return this;
  }

  /**
   * Get canvasId
   *
   * @return canvasId
   */
  @ApiModelProperty(value = "")
  public String getCanvasId() {
    return canvasId;
  }

  public void setCanvasId(String canvasId) {
    this.canvasId = canvasId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WxSearchBrandAreaDocJumpInfo wxSearchBrandAreaDocJumpInfo = (WxSearchBrandAreaDocJumpInfo) o;
    return Objects.equals(this.jumpType, wxSearchBrandAreaDocJumpInfo.jumpType)
        && Objects.equals(this.userName, wxSearchBrandAreaDocJumpInfo.userName)
        && Objects.equals(this.weappUrl, wxSearchBrandAreaDocJumpInfo.weappUrl)
        && Objects.equals(this.jumpUrl, wxSearchBrandAreaDocJumpInfo.jumpUrl)
        && Objects.equals(this.feedId, wxSearchBrandAreaDocJumpInfo.feedId)
        && Objects.equals(this.commentScene, wxSearchBrandAreaDocJumpInfo.commentScene)
        && Objects.equals(this.feedNonceId, wxSearchBrandAreaDocJumpInfo.feedNonceId)
        && Objects.equals(this.extInfo, wxSearchBrandAreaDocJumpInfo.extInfo)
        && Objects.equals(this.canvasId, wxSearchBrandAreaDocJumpInfo.canvasId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        jumpType,
        userName,
        weappUrl,
        jumpUrl,
        feedId,
        commentScene,
        feedNonceId,
        extInfo,
        canvasId);
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

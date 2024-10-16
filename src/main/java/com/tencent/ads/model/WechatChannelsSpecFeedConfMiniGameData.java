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

/** 小游戏跳转 */
@ApiModel(description = "小游戏跳转")
public class WechatChannelsSpecFeedConfMiniGameData {
  @SerializedName("mini_game_gh_id")
  private String miniGameGhId = null;

  @SerializedName("mini_game_monitor_query_string")
  private String miniGameMonitorQueryString = null;

  @SerializedName("mini_game_app_id")
  private String miniGameAppId = null;

  public WechatChannelsSpecFeedConfMiniGameData miniGameGhId(String miniGameGhId) {
    this.miniGameGhId = miniGameGhId;
    return this;
  }

  /**
   * Get miniGameGhId
   *
   * @return miniGameGhId
   */
  @ApiModelProperty(value = "")
  public String getMiniGameGhId() {
    return miniGameGhId;
  }

  public void setMiniGameGhId(String miniGameGhId) {
    this.miniGameGhId = miniGameGhId;
  }

  public WechatChannelsSpecFeedConfMiniGameData miniGameMonitorQueryString(
      String miniGameMonitorQueryString) {
    this.miniGameMonitorQueryString = miniGameMonitorQueryString;
    return this;
  }

  /**
   * Get miniGameMonitorQueryString
   *
   * @return miniGameMonitorQueryString
   */
  @ApiModelProperty(value = "")
  public String getMiniGameMonitorQueryString() {
    return miniGameMonitorQueryString;
  }

  public void setMiniGameMonitorQueryString(String miniGameMonitorQueryString) {
    this.miniGameMonitorQueryString = miniGameMonitorQueryString;
  }

  public WechatChannelsSpecFeedConfMiniGameData miniGameAppId(String miniGameAppId) {
    this.miniGameAppId = miniGameAppId;
    return this;
  }

  /**
   * Get miniGameAppId
   *
   * @return miniGameAppId
   */
  @ApiModelProperty(value = "")
  public String getMiniGameAppId() {
    return miniGameAppId;
  }

  public void setMiniGameAppId(String miniGameAppId) {
    this.miniGameAppId = miniGameAppId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WechatChannelsSpecFeedConfMiniGameData wechatChannelsSpecFeedConfMiniGameData =
        (WechatChannelsSpecFeedConfMiniGameData) o;
    return Objects.equals(this.miniGameGhId, wechatChannelsSpecFeedConfMiniGameData.miniGameGhId)
        && Objects.equals(
            this.miniGameMonitorQueryString,
            wechatChannelsSpecFeedConfMiniGameData.miniGameMonitorQueryString)
        && Objects.equals(this.miniGameAppId, wechatChannelsSpecFeedConfMiniGameData.miniGameAppId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(miniGameGhId, miniGameMonitorQueryString, miniGameAppId);
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
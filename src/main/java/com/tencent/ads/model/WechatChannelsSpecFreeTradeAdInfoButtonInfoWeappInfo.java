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

/** 小程序/小游戏信息 */
@ApiModel(description = "小程序/小游戏信息")
public class WechatChannelsSpecFreeTradeAdInfoButtonInfoWeappInfo {
  @SerializedName("gh_id")
  private String ghId = null;

  @SerializedName("user_name")
  private String userName = null;

  @SerializedName("app_id")
  private String appId = null;

  public WechatChannelsSpecFreeTradeAdInfoButtonInfoWeappInfo ghId(String ghId) {
    this.ghId = ghId;
    return this;
  }

  /**
   * Get ghId
   *
   * @return ghId
   */
  @ApiModelProperty(value = "")
  public String getGhId() {
    return ghId;
  }

  public void setGhId(String ghId) {
    this.ghId = ghId;
  }

  public WechatChannelsSpecFreeTradeAdInfoButtonInfoWeappInfo userName(String userName) {
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

  public WechatChannelsSpecFreeTradeAdInfoButtonInfoWeappInfo appId(String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * Get appId
   *
   * @return appId
   */
  @ApiModelProperty(value = "")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WechatChannelsSpecFreeTradeAdInfoButtonInfoWeappInfo
        wechatChannelsSpecFreeTradeAdInfoButtonInfoWeappInfo =
            (WechatChannelsSpecFreeTradeAdInfoButtonInfoWeappInfo) o;
    return Objects.equals(this.ghId, wechatChannelsSpecFreeTradeAdInfoButtonInfoWeappInfo.ghId)
        && Objects.equals(
            this.userName, wechatChannelsSpecFreeTradeAdInfoButtonInfoWeappInfo.userName)
        && Objects.equals(this.appId, wechatChannelsSpecFreeTradeAdInfoButtonInfoWeappInfo.appId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ghId, userName, appId);
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

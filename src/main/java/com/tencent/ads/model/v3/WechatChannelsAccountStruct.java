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

/** 视频号列表 */
@ApiModel(description = "视频号列表")
public class WechatChannelsAccountStruct {
  @SerializedName("wechat_channels_account_id")
  private String wechatChannelsAccountId = null;

  @SerializedName("wechat_channels_account_name")
  private String wechatChannelsAccountName = null;

  @SerializedName("created_time")
  private Long createdTime = null;

  @SerializedName("last_modified_time")
  private Long lastModifiedTime = null;

  @SerializedName("wechat_channels_spam_block")
  private Boolean wechatChannelsSpamBlock = null;

  @SerializedName("wechat_channels_spam_slient")
  private Boolean wechatChannelsSpamSlient = null;

  public WechatChannelsAccountStruct wechatChannelsAccountId(String wechatChannelsAccountId) {
    this.wechatChannelsAccountId = wechatChannelsAccountId;
    return this;
  }

  /**
   * Get wechatChannelsAccountId
   *
   * @return wechatChannelsAccountId
   */
  @ApiModelProperty(value = "")
  public String getWechatChannelsAccountId() {
    return wechatChannelsAccountId;
  }

  public void setWechatChannelsAccountId(String wechatChannelsAccountId) {
    this.wechatChannelsAccountId = wechatChannelsAccountId;
  }

  public WechatChannelsAccountStruct wechatChannelsAccountName(String wechatChannelsAccountName) {
    this.wechatChannelsAccountName = wechatChannelsAccountName;
    return this;
  }

  /**
   * Get wechatChannelsAccountName
   *
   * @return wechatChannelsAccountName
   */
  @ApiModelProperty(value = "")
  public String getWechatChannelsAccountName() {
    return wechatChannelsAccountName;
  }

  public void setWechatChannelsAccountName(String wechatChannelsAccountName) {
    this.wechatChannelsAccountName = wechatChannelsAccountName;
  }

  public WechatChannelsAccountStruct createdTime(Long createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   *
   * @return createdTime
   */
  @ApiModelProperty(value = "")
  public Long getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Long createdTime) {
    this.createdTime = createdTime;
  }

  public WechatChannelsAccountStruct lastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

  /**
   * Get lastModifiedTime
   *
   * @return lastModifiedTime
   */
  @ApiModelProperty(value = "")
  public Long getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public WechatChannelsAccountStruct wechatChannelsSpamBlock(Boolean wechatChannelsSpamBlock) {
    this.wechatChannelsSpamBlock = wechatChannelsSpamBlock;
    return this;
  }

  /**
   * Get wechatChannelsSpamBlock
   *
   * @return wechatChannelsSpamBlock
   */
  @ApiModelProperty(value = "")
  public Boolean isWechatChannelsSpamBlock() {
    return wechatChannelsSpamBlock;
  }

  public void setWechatChannelsSpamBlock(Boolean wechatChannelsSpamBlock) {
    this.wechatChannelsSpamBlock = wechatChannelsSpamBlock;
  }

  public WechatChannelsAccountStruct wechatChannelsSpamSlient(Boolean wechatChannelsSpamSlient) {
    this.wechatChannelsSpamSlient = wechatChannelsSpamSlient;
    return this;
  }

  /**
   * Get wechatChannelsSpamSlient
   *
   * @return wechatChannelsSpamSlient
   */
  @ApiModelProperty(value = "")
  public Boolean isWechatChannelsSpamSlient() {
    return wechatChannelsSpamSlient;
  }

  public void setWechatChannelsSpamSlient(Boolean wechatChannelsSpamSlient) {
    this.wechatChannelsSpamSlient = wechatChannelsSpamSlient;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WechatChannelsAccountStruct wechatChannelsAccountStruct = (WechatChannelsAccountStruct) o;
    return Objects.equals(
            this.wechatChannelsAccountId, wechatChannelsAccountStruct.wechatChannelsAccountId)
        && Objects.equals(
            this.wechatChannelsAccountName, wechatChannelsAccountStruct.wechatChannelsAccountName)
        && Objects.equals(this.createdTime, wechatChannelsAccountStruct.createdTime)
        && Objects.equals(this.lastModifiedTime, wechatChannelsAccountStruct.lastModifiedTime)
        && Objects.equals(
            this.wechatChannelsSpamBlock, wechatChannelsAccountStruct.wechatChannelsSpamBlock)
        && Objects.equals(
            this.wechatChannelsSpamSlient, wechatChannelsAccountStruct.wechatChannelsSpamSlient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        wechatChannelsAccountId,
        wechatChannelsAccountName,
        createdTime,
        lastModifiedTime,
        wechatChannelsSpamBlock,
        wechatChannelsSpamSlient);
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

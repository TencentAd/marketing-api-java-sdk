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

  @SerializedName("wechat_channels_account_icon")
  private String wechatChannelsAccountIcon = null;

  @SerializedName("authorization_type")
  private WechatChannelsAuthType authorizationType = null;

  @SerializedName("authorization_scope")
  private WechatChannelsAuthScope authorizationScope = null;

  @SerializedName("is_blocked")
  private Boolean isBlocked = null;

  @SerializedName("is_private")
  private Boolean isPrivate = null;

  @SerializedName("is_ad_acct")
  private Boolean isAdAcct = null;

  @SerializedName("authorization_begin_time")
  private Long authorizationBeginTime = null;

  @SerializedName("authorization_ttl")
  private Long authorizationTtl = null;

  @SerializedName("is_disable")
  private Boolean isDisable = null;

  @SerializedName("disable_message")
  private String disableMessage = null;

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

  public WechatChannelsAccountStruct wechatChannelsAccountIcon(String wechatChannelsAccountIcon) {
    this.wechatChannelsAccountIcon = wechatChannelsAccountIcon;
    return this;
  }

  /**
   * Get wechatChannelsAccountIcon
   *
   * @return wechatChannelsAccountIcon
   */
  @ApiModelProperty(value = "")
  public String getWechatChannelsAccountIcon() {
    return wechatChannelsAccountIcon;
  }

  public void setWechatChannelsAccountIcon(String wechatChannelsAccountIcon) {
    this.wechatChannelsAccountIcon = wechatChannelsAccountIcon;
  }

  public WechatChannelsAccountStruct authorizationType(WechatChannelsAuthType authorizationType) {
    this.authorizationType = authorizationType;
    return this;
  }

  /**
   * Get authorizationType
   *
   * @return authorizationType
   */
  @ApiModelProperty(value = "")
  public WechatChannelsAuthType getAuthorizationType() {
    return authorizationType;
  }

  public void setAuthorizationType(WechatChannelsAuthType authorizationType) {
    this.authorizationType = authorizationType;
  }

  public WechatChannelsAccountStruct authorizationScope(
      WechatChannelsAuthScope authorizationScope) {
    this.authorizationScope = authorizationScope;
    return this;
  }

  /**
   * Get authorizationScope
   *
   * @return authorizationScope
   */
  @ApiModelProperty(value = "")
  public WechatChannelsAuthScope getAuthorizationScope() {
    return authorizationScope;
  }

  public void setAuthorizationScope(WechatChannelsAuthScope authorizationScope) {
    this.authorizationScope = authorizationScope;
  }

  public WechatChannelsAccountStruct isBlocked(Boolean isBlocked) {
    this.isBlocked = isBlocked;
    return this;
  }

  /**
   * Get isBlocked
   *
   * @return isBlocked
   */
  @ApiModelProperty(value = "")
  public Boolean isIsBlocked() {
    return isBlocked;
  }

  public void setIsBlocked(Boolean isBlocked) {
    this.isBlocked = isBlocked;
  }

  public WechatChannelsAccountStruct isPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
    return this;
  }

  /**
   * Get isPrivate
   *
   * @return isPrivate
   */
  @ApiModelProperty(value = "")
  public Boolean isIsPrivate() {
    return isPrivate;
  }

  public void setIsPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
  }

  public WechatChannelsAccountStruct isAdAcct(Boolean isAdAcct) {
    this.isAdAcct = isAdAcct;
    return this;
  }

  /**
   * Get isAdAcct
   *
   * @return isAdAcct
   */
  @ApiModelProperty(value = "")
  public Boolean isIsAdAcct() {
    return isAdAcct;
  }

  public void setIsAdAcct(Boolean isAdAcct) {
    this.isAdAcct = isAdAcct;
  }

  public WechatChannelsAccountStruct authorizationBeginTime(Long authorizationBeginTime) {
    this.authorizationBeginTime = authorizationBeginTime;
    return this;
  }

  /**
   * Get authorizationBeginTime
   *
   * @return authorizationBeginTime
   */
  @ApiModelProperty(value = "")
  public Long getAuthorizationBeginTime() {
    return authorizationBeginTime;
  }

  public void setAuthorizationBeginTime(Long authorizationBeginTime) {
    this.authorizationBeginTime = authorizationBeginTime;
  }

  public WechatChannelsAccountStruct authorizationTtl(Long authorizationTtl) {
    this.authorizationTtl = authorizationTtl;
    return this;
  }

  /**
   * Get authorizationTtl
   *
   * @return authorizationTtl
   */
  @ApiModelProperty(value = "")
  public Long getAuthorizationTtl() {
    return authorizationTtl;
  }

  public void setAuthorizationTtl(Long authorizationTtl) {
    this.authorizationTtl = authorizationTtl;
  }

  public WechatChannelsAccountStruct isDisable(Boolean isDisable) {
    this.isDisable = isDisable;
    return this;
  }

  /**
   * Get isDisable
   *
   * @return isDisable
   */
  @ApiModelProperty(value = "")
  public Boolean isIsDisable() {
    return isDisable;
  }

  public void setIsDisable(Boolean isDisable) {
    this.isDisable = isDisable;
  }

  public WechatChannelsAccountStruct disableMessage(String disableMessage) {
    this.disableMessage = disableMessage;
    return this;
  }

  /**
   * Get disableMessage
   *
   * @return disableMessage
   */
  @ApiModelProperty(value = "")
  public String getDisableMessage() {
    return disableMessage;
  }

  public void setDisableMessage(String disableMessage) {
    this.disableMessage = disableMessage;
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
            this.wechatChannelsSpamSlient, wechatChannelsAccountStruct.wechatChannelsSpamSlient)
        && Objects.equals(
            this.wechatChannelsAccountIcon, wechatChannelsAccountStruct.wechatChannelsAccountIcon)
        && Objects.equals(this.authorizationType, wechatChannelsAccountStruct.authorizationType)
        && Objects.equals(this.authorizationScope, wechatChannelsAccountStruct.authorizationScope)
        && Objects.equals(this.isBlocked, wechatChannelsAccountStruct.isBlocked)
        && Objects.equals(this.isPrivate, wechatChannelsAccountStruct.isPrivate)
        && Objects.equals(this.isAdAcct, wechatChannelsAccountStruct.isAdAcct)
        && Objects.equals(
            this.authorizationBeginTime, wechatChannelsAccountStruct.authorizationBeginTime)
        && Objects.equals(this.authorizationTtl, wechatChannelsAccountStruct.authorizationTtl)
        && Objects.equals(this.isDisable, wechatChannelsAccountStruct.isDisable)
        && Objects.equals(this.disableMessage, wechatChannelsAccountStruct.disableMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        wechatChannelsAccountId,
        wechatChannelsAccountName,
        createdTime,
        lastModifiedTime,
        wechatChannelsSpamBlock,
        wechatChannelsSpamSlient,
        wechatChannelsAccountIcon,
        authorizationType,
        authorizationScope,
        isBlocked,
        isPrivate,
        isAdAcct,
        authorizationBeginTime,
        authorizationTtl,
        isDisable,
        disableMessage);
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

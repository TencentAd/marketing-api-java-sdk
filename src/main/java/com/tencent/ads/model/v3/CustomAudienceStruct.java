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

/** custom_audience返回结构 */
@ApiModel(description = "custom_audience返回结构")
public class CustomAudienceStruct {
  @SerializedName("audience_id")
  private Long audienceId = null;

  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("outer_audience_id")
  private String outerAudienceId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("cooperated")
  private Boolean cooperated = null;

  @SerializedName("type")
  private AudienceType type = null;

  @SerializedName("source")
  private AudienceSource source = null;

  @SerializedName("status")
  private ProcessStatus status = null;

  @SerializedName("online_status")
  private AudienceOnlineStatus onlineStatus = null;

  @SerializedName("is_own")
  private Boolean isOwn = null;

  @SerializedName("error_code")
  private Long errorCode = null;

  @SerializedName("user_count")
  private Long userCount = null;

  @SerializedName("created_time")
  private String createdTime = null;

  @SerializedName("last_modified_time")
  private String lastModifiedTime = null;

  @SerializedName("audience_spec")
  private AudienceSpec audienceSpec = null;

  public CustomAudienceStruct audienceId(Long audienceId) {
    this.audienceId = audienceId;
    return this;
  }

  /**
   * Get audienceId
   *
   * @return audienceId
   */
  @ApiModelProperty(value = "")
  public Long getAudienceId() {
    return audienceId;
  }

  public void setAudienceId(Long audienceId) {
    this.audienceId = audienceId;
  }

  public CustomAudienceStruct accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   *
   * @return accountId
   */
  @ApiModelProperty(value = "")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public CustomAudienceStruct name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   *
   * @return name
   */
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomAudienceStruct outerAudienceId(String outerAudienceId) {
    this.outerAudienceId = outerAudienceId;
    return this;
  }

  /**
   * Get outerAudienceId
   *
   * @return outerAudienceId
   */
  @ApiModelProperty(value = "")
  public String getOuterAudienceId() {
    return outerAudienceId;
  }

  public void setOuterAudienceId(String outerAudienceId) {
    this.outerAudienceId = outerAudienceId;
  }

  public CustomAudienceStruct description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   *
   * @return description
   */
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CustomAudienceStruct cooperated(Boolean cooperated) {
    this.cooperated = cooperated;
    return this;
  }

  /**
   * Get cooperated
   *
   * @return cooperated
   */
  @ApiModelProperty(value = "")
  public Boolean isCooperated() {
    return cooperated;
  }

  public void setCooperated(Boolean cooperated) {
    this.cooperated = cooperated;
  }

  public CustomAudienceStruct type(AudienceType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @ApiModelProperty(value = "")
  public AudienceType getType() {
    return type;
  }

  public void setType(AudienceType type) {
    this.type = type;
  }

  public CustomAudienceStruct source(AudienceSource source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   *
   * @return source
   */
  @ApiModelProperty(value = "")
  public AudienceSource getSource() {
    return source;
  }

  public void setSource(AudienceSource source) {
    this.source = source;
  }

  public CustomAudienceStruct status(ProcessStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  @ApiModelProperty(value = "")
  public ProcessStatus getStatus() {
    return status;
  }

  public void setStatus(ProcessStatus status) {
    this.status = status;
  }

  public CustomAudienceStruct onlineStatus(AudienceOnlineStatus onlineStatus) {
    this.onlineStatus = onlineStatus;
    return this;
  }

  /**
   * Get onlineStatus
   *
   * @return onlineStatus
   */
  @ApiModelProperty(value = "")
  public AudienceOnlineStatus getOnlineStatus() {
    return onlineStatus;
  }

  public void setOnlineStatus(AudienceOnlineStatus onlineStatus) {
    this.onlineStatus = onlineStatus;
  }

  public CustomAudienceStruct isOwn(Boolean isOwn) {
    this.isOwn = isOwn;
    return this;
  }

  /**
   * Get isOwn
   *
   * @return isOwn
   */
  @ApiModelProperty(value = "")
  public Boolean isIsOwn() {
    return isOwn;
  }

  public void setIsOwn(Boolean isOwn) {
    this.isOwn = isOwn;
  }

  public CustomAudienceStruct errorCode(Long errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   *
   * @return errorCode
   */
  @ApiModelProperty(value = "")
  public Long getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Long errorCode) {
    this.errorCode = errorCode;
  }

  public CustomAudienceStruct userCount(Long userCount) {
    this.userCount = userCount;
    return this;
  }

  /**
   * Get userCount
   *
   * @return userCount
   */
  @ApiModelProperty(value = "")
  public Long getUserCount() {
    return userCount;
  }

  public void setUserCount(Long userCount) {
    this.userCount = userCount;
  }

  public CustomAudienceStruct createdTime(String createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   *
   * @return createdTime
   */
  @ApiModelProperty(value = "")
  public String getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
  }

  public CustomAudienceStruct lastModifiedTime(String lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

  /**
   * Get lastModifiedTime
   *
   * @return lastModifiedTime
   */
  @ApiModelProperty(value = "")
  public String getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(String lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public CustomAudienceStruct audienceSpec(AudienceSpec audienceSpec) {
    this.audienceSpec = audienceSpec;
    return this;
  }

  /**
   * Get audienceSpec
   *
   * @return audienceSpec
   */
  @ApiModelProperty(value = "")
  public AudienceSpec getAudienceSpec() {
    return audienceSpec;
  }

  public void setAudienceSpec(AudienceSpec audienceSpec) {
    this.audienceSpec = audienceSpec;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomAudienceStruct customAudienceStruct = (CustomAudienceStruct) o;
    return Objects.equals(this.audienceId, customAudienceStruct.audienceId)
        && Objects.equals(this.accountId, customAudienceStruct.accountId)
        && Objects.equals(this.name, customAudienceStruct.name)
        && Objects.equals(this.outerAudienceId, customAudienceStruct.outerAudienceId)
        && Objects.equals(this.description, customAudienceStruct.description)
        && Objects.equals(this.cooperated, customAudienceStruct.cooperated)
        && Objects.equals(this.type, customAudienceStruct.type)
        && Objects.equals(this.source, customAudienceStruct.source)
        && Objects.equals(this.status, customAudienceStruct.status)
        && Objects.equals(this.onlineStatus, customAudienceStruct.onlineStatus)
        && Objects.equals(this.isOwn, customAudienceStruct.isOwn)
        && Objects.equals(this.errorCode, customAudienceStruct.errorCode)
        && Objects.equals(this.userCount, customAudienceStruct.userCount)
        && Objects.equals(this.createdTime, customAudienceStruct.createdTime)
        && Objects.equals(this.lastModifiedTime, customAudienceStruct.lastModifiedTime)
        && Objects.equals(this.audienceSpec, customAudienceStruct.audienceSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        audienceId,
        accountId,
        name,
        outerAudienceId,
        description,
        cooperated,
        type,
        source,
        status,
        onlineStatus,
        isOwn,
        errorCode,
        userCount,
        createdTime,
        lastModifiedTime,
        audienceSpec);
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

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

/** 返回结构 */
@ApiModel(description = "返回结构")
public class ListStruct {
  @SerializedName("wechat_qualification_name")
  private String wechatQualificationName = null;

  @SerializedName("wechat_qualification_url")
  private String wechatQualificationUrl = null;

  @SerializedName("wechat_qualification_id")
  private Long wechatQualificationId = null;

  @SerializedName("review_status")
  private LocalBusinessQualificationReviewStatus reviewStatus = null;

  @SerializedName("audit_message")
  private String auditMessage = null;

  public ListStruct wechatQualificationName(String wechatQualificationName) {
    this.wechatQualificationName = wechatQualificationName;
    return this;
  }

  /**
   * Get wechatQualificationName
   *
   * @return wechatQualificationName
   */
  @ApiModelProperty(value = "")
  public String getWechatQualificationName() {
    return wechatQualificationName;
  }

  public void setWechatQualificationName(String wechatQualificationName) {
    this.wechatQualificationName = wechatQualificationName;
  }

  public ListStruct wechatQualificationUrl(String wechatQualificationUrl) {
    this.wechatQualificationUrl = wechatQualificationUrl;
    return this;
  }

  /**
   * Get wechatQualificationUrl
   *
   * @return wechatQualificationUrl
   */
  @ApiModelProperty(value = "")
  public String getWechatQualificationUrl() {
    return wechatQualificationUrl;
  }

  public void setWechatQualificationUrl(String wechatQualificationUrl) {
    this.wechatQualificationUrl = wechatQualificationUrl;
  }

  public ListStruct wechatQualificationId(Long wechatQualificationId) {
    this.wechatQualificationId = wechatQualificationId;
    return this;
  }

  /**
   * Get wechatQualificationId
   *
   * @return wechatQualificationId
   */
  @ApiModelProperty(value = "")
  public Long getWechatQualificationId() {
    return wechatQualificationId;
  }

  public void setWechatQualificationId(Long wechatQualificationId) {
    this.wechatQualificationId = wechatQualificationId;
  }

  public ListStruct reviewStatus(LocalBusinessQualificationReviewStatus reviewStatus) {
    this.reviewStatus = reviewStatus;
    return this;
  }

  /**
   * Get reviewStatus
   *
   * @return reviewStatus
   */
  @ApiModelProperty(value = "")
  public LocalBusinessQualificationReviewStatus getReviewStatus() {
    return reviewStatus;
  }

  public void setReviewStatus(LocalBusinessQualificationReviewStatus reviewStatus) {
    this.reviewStatus = reviewStatus;
  }

  public ListStruct auditMessage(String auditMessage) {
    this.auditMessage = auditMessage;
    return this;
  }

  /**
   * Get auditMessage
   *
   * @return auditMessage
   */
  @ApiModelProperty(value = "")
  public String getAuditMessage() {
    return auditMessage;
  }

  public void setAuditMessage(String auditMessage) {
    this.auditMessage = auditMessage;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListStruct listStruct = (ListStruct) o;
    return Objects.equals(this.wechatQualificationName, listStruct.wechatQualificationName)
        && Objects.equals(this.wechatQualificationUrl, listStruct.wechatQualificationUrl)
        && Objects.equals(this.wechatQualificationId, listStruct.wechatQualificationId)
        && Objects.equals(this.reviewStatus, listStruct.reviewStatus)
        && Objects.equals(this.auditMessage, listStruct.auditMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        wechatQualificationName,
        wechatQualificationUrl,
        wechatQualificationId,
        reviewStatus,
        auditMessage);
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

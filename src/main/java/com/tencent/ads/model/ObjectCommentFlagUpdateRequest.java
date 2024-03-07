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
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ObjectCommentFlagUpdateRequest */
public class ObjectCommentFlagUpdateRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("adcreative_id")
  private Long adcreativeId = null;

  @SerializedName("op_type")
  private SetObjectCommentFlagOpType opType = null;

  @SerializedName("comment_id")
  private String commentId = null;

  @SerializedName("comment_level")
  private Long commentLevel = null;

  public ObjectCommentFlagUpdateRequest accountId(Long accountId) {
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

  public ObjectCommentFlagUpdateRequest adcreativeId(Long adcreativeId) {
    this.adcreativeId = adcreativeId;
    return this;
  }

  /**
   * Get adcreativeId
   *
   * @return adcreativeId
   */
  @ApiModelProperty(value = "")
  public Long getAdcreativeId() {
    return adcreativeId;
  }

  public void setAdcreativeId(Long adcreativeId) {
    this.adcreativeId = adcreativeId;
  }

  public ObjectCommentFlagUpdateRequest opType(SetObjectCommentFlagOpType opType) {
    this.opType = opType;
    return this;
  }

  /**
   * Get opType
   *
   * @return opType
   */
  @ApiModelProperty(value = "")
  public SetObjectCommentFlagOpType getOpType() {
    return opType;
  }

  public void setOpType(SetObjectCommentFlagOpType opType) {
    this.opType = opType;
  }

  public ObjectCommentFlagUpdateRequest commentId(String commentId) {
    this.commentId = commentId;
    return this;
  }

  /**
   * Get commentId
   *
   * @return commentId
   */
  @ApiModelProperty(value = "")
  public String getCommentId() {
    return commentId;
  }

  public void setCommentId(String commentId) {
    this.commentId = commentId;
  }

  public ObjectCommentFlagUpdateRequest commentLevel(Long commentLevel) {
    this.commentLevel = commentLevel;
    return this;
  }

  /**
   * Get commentLevel
   *
   * @return commentLevel
   */
  @ApiModelProperty(value = "")
  public Long getCommentLevel() {
    return commentLevel;
  }

  public void setCommentLevel(Long commentLevel) {
    this.commentLevel = commentLevel;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectCommentFlagUpdateRequest objectCommentFlagUpdateRequest =
        (ObjectCommentFlagUpdateRequest) o;
    return Objects.equals(this.accountId, objectCommentFlagUpdateRequest.accountId)
        && Objects.equals(this.adcreativeId, objectCommentFlagUpdateRequest.adcreativeId)
        && Objects.equals(this.opType, objectCommentFlagUpdateRequest.opType)
        && Objects.equals(this.commentId, objectCommentFlagUpdateRequest.commentId)
        && Objects.equals(this.commentLevel, objectCommentFlagUpdateRequest.commentLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adcreativeId, opType, commentId, commentLevel);
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

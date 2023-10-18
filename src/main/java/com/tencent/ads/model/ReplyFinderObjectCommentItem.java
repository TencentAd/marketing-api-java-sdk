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

/** 评论回复 */
@ApiModel(description = "评论回复")
public class ReplyFinderObjectCommentItem {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("reply_comment_id")
  private String replyCommentId = null;

  @SerializedName("export_id")
  private String exportId = null;

  @SerializedName("content")
  private String content = null;

  @SerializedName("adcreative_id")
  private Long adcreativeId = null;

  public ReplyFinderObjectCommentItem accountId(Long accountId) {
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

  public ReplyFinderObjectCommentItem replyCommentId(String replyCommentId) {
    this.replyCommentId = replyCommentId;
    return this;
  }

  /**
   * Get replyCommentId
   *
   * @return replyCommentId
   */
  @ApiModelProperty(value = "")
  public String getReplyCommentId() {
    return replyCommentId;
  }

  public void setReplyCommentId(String replyCommentId) {
    this.replyCommentId = replyCommentId;
  }

  public ReplyFinderObjectCommentItem exportId(String exportId) {
    this.exportId = exportId;
    return this;
  }

  /**
   * Get exportId
   *
   * @return exportId
   */
  @ApiModelProperty(value = "")
  public String getExportId() {
    return exportId;
  }

  public void setExportId(String exportId) {
    this.exportId = exportId;
  }

  public ReplyFinderObjectCommentItem content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   *
   * @return content
   */
  @ApiModelProperty(value = "")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public ReplyFinderObjectCommentItem adcreativeId(Long adcreativeId) {
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplyFinderObjectCommentItem replyFinderObjectCommentItem = (ReplyFinderObjectCommentItem) o;
    return Objects.equals(this.accountId, replyFinderObjectCommentItem.accountId)
        && Objects.equals(this.replyCommentId, replyFinderObjectCommentItem.replyCommentId)
        && Objects.equals(this.exportId, replyFinderObjectCommentItem.exportId)
        && Objects.equals(this.content, replyFinderObjectCommentItem.content)
        && Objects.equals(this.adcreativeId, replyFinderObjectCommentItem.adcreativeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, replyCommentId, exportId, content, adcreativeId);
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

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
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ChannelsCommentAddRequest */
public class ChannelsCommentAddRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("finder_ad_object_id")
  private Long finderAdObjectId = null;

  @SerializedName("reply_comment_id")
  private String replyCommentId = null;

  @SerializedName("content")
  private String content = null;

  public ChannelsCommentAddRequest accountId(Long accountId) {
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

  public ChannelsCommentAddRequest finderAdObjectId(Long finderAdObjectId) {
    this.finderAdObjectId = finderAdObjectId;
    return this;
  }

  /**
   * Get finderAdObjectId
   *
   * @return finderAdObjectId
   */
  @ApiModelProperty(value = "")
  public Long getFinderAdObjectId() {
    return finderAdObjectId;
  }

  public void setFinderAdObjectId(Long finderAdObjectId) {
    this.finderAdObjectId = finderAdObjectId;
  }

  public ChannelsCommentAddRequest replyCommentId(String replyCommentId) {
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

  public ChannelsCommentAddRequest content(String content) {
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelsCommentAddRequest channelsCommentAddRequest = (ChannelsCommentAddRequest) o;
    return Objects.equals(this.accountId, channelsCommentAddRequest.accountId)
        && Objects.equals(this.finderAdObjectId, channelsCommentAddRequest.finderAdObjectId)
        && Objects.equals(this.replyCommentId, channelsCommentAddRequest.replyCommentId)
        && Objects.equals(this.content, channelsCommentAddRequest.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, finderAdObjectId, replyCommentId, content);
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
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

/** 问答信息组件 */
@ApiModel(description = "问答信息组件")
public class WechatChannelsSpecFeedCardInfoContestInfo {
  @SerializedName("export_event_id")
  private String exportEventId = null;

  @SerializedName("question_id")
  private Long questionId = null;

  public WechatChannelsSpecFeedCardInfoContestInfo exportEventId(String exportEventId) {
    this.exportEventId = exportEventId;
    return this;
  }

  /**
   * Get exportEventId
   *
   * @return exportEventId
   */
  @ApiModelProperty(value = "")
  public String getExportEventId() {
    return exportEventId;
  }

  public void setExportEventId(String exportEventId) {
    this.exportEventId = exportEventId;
  }

  public WechatChannelsSpecFeedCardInfoContestInfo questionId(Long questionId) {
    this.questionId = questionId;
    return this;
  }

  /**
   * Get questionId
   *
   * @return questionId
   */
  @ApiModelProperty(value = "")
  public Long getQuestionId() {
    return questionId;
  }

  public void setQuestionId(Long questionId) {
    this.questionId = questionId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WechatChannelsSpecFeedCardInfoContestInfo wechatChannelsSpecFeedCardInfoContestInfo =
        (WechatChannelsSpecFeedCardInfoContestInfo) o;
    return Objects.equals(
            this.exportEventId, wechatChannelsSpecFeedCardInfoContestInfo.exportEventId)
        && Objects.equals(this.questionId, wechatChannelsSpecFeedCardInfoContestInfo.questionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportEventId, questionId);
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

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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** 回传信息结构 */
@ApiModel(description = "回传信息结构")
public class OuterLeadsStatusInfoStruct {
  @SerializedName("outer_leads_id")
  private String outerLeadsId = null;

  @SerializedName("leads_id")
  private Long leadsId = null;

  @SerializedName("leads_tel")
  private String leadsTel = null;

  @SerializedName("leads_qq")
  private Long leadsQq = null;

  @SerializedName("leads_wechat")
  private String leadsWechat = null;

  @SerializedName("click_id")
  private String clickId = null;

  @SerializedName("leads_convert_type")
  private String leadsConvertType = null;

  @SerializedName("leads_ineffect_reason")
  private String leadsIneffectReason = null;

  @SerializedName("outer_leads_convert_type")
  private String outerLeadsConvertType = null;

  @SerializedName("outer_leads_ineffect_reason")
  private String outerLeadsIneffectReason = null;

  @SerializedName("customized_tags")
  private List<CustomizedTagsStruct> customizedTags = null;

  public OuterLeadsStatusInfoStruct outerLeadsId(String outerLeadsId) {
    this.outerLeadsId = outerLeadsId;
    return this;
  }

  /**
   * Get outerLeadsId
   *
   * @return outerLeadsId
   */
  @ApiModelProperty(value = "")
  public String getOuterLeadsId() {
    return outerLeadsId;
  }

  public void setOuterLeadsId(String outerLeadsId) {
    this.outerLeadsId = outerLeadsId;
  }

  public OuterLeadsStatusInfoStruct leadsId(Long leadsId) {
    this.leadsId = leadsId;
    return this;
  }

  /**
   * Get leadsId
   *
   * @return leadsId
   */
  @ApiModelProperty(value = "")
  public Long getLeadsId() {
    return leadsId;
  }

  public void setLeadsId(Long leadsId) {
    this.leadsId = leadsId;
  }

  public OuterLeadsStatusInfoStruct leadsTel(String leadsTel) {
    this.leadsTel = leadsTel;
    return this;
  }

  /**
   * Get leadsTel
   *
   * @return leadsTel
   */
  @ApiModelProperty(value = "")
  public String getLeadsTel() {
    return leadsTel;
  }

  public void setLeadsTel(String leadsTel) {
    this.leadsTel = leadsTel;
  }

  public OuterLeadsStatusInfoStruct leadsQq(Long leadsQq) {
    this.leadsQq = leadsQq;
    return this;
  }

  /**
   * Get leadsQq
   *
   * @return leadsQq
   */
  @ApiModelProperty(value = "")
  public Long getLeadsQq() {
    return leadsQq;
  }

  public void setLeadsQq(Long leadsQq) {
    this.leadsQq = leadsQq;
  }

  public OuterLeadsStatusInfoStruct leadsWechat(String leadsWechat) {
    this.leadsWechat = leadsWechat;
    return this;
  }

  /**
   * Get leadsWechat
   *
   * @return leadsWechat
   */
  @ApiModelProperty(value = "")
  public String getLeadsWechat() {
    return leadsWechat;
  }

  public void setLeadsWechat(String leadsWechat) {
    this.leadsWechat = leadsWechat;
  }

  public OuterLeadsStatusInfoStruct clickId(String clickId) {
    this.clickId = clickId;
    return this;
  }

  /**
   * Get clickId
   *
   * @return clickId
   */
  @ApiModelProperty(value = "")
  public String getClickId() {
    return clickId;
  }

  public void setClickId(String clickId) {
    this.clickId = clickId;
  }

  public OuterLeadsStatusInfoStruct leadsConvertType(String leadsConvertType) {
    this.leadsConvertType = leadsConvertType;
    return this;
  }

  /**
   * Get leadsConvertType
   *
   * @return leadsConvertType
   */
  @ApiModelProperty(value = "")
  public String getLeadsConvertType() {
    return leadsConvertType;
  }

  public void setLeadsConvertType(String leadsConvertType) {
    this.leadsConvertType = leadsConvertType;
  }

  public OuterLeadsStatusInfoStruct leadsIneffectReason(String leadsIneffectReason) {
    this.leadsIneffectReason = leadsIneffectReason;
    return this;
  }

  /**
   * Get leadsIneffectReason
   *
   * @return leadsIneffectReason
   */
  @ApiModelProperty(value = "")
  public String getLeadsIneffectReason() {
    return leadsIneffectReason;
  }

  public void setLeadsIneffectReason(String leadsIneffectReason) {
    this.leadsIneffectReason = leadsIneffectReason;
  }

  public OuterLeadsStatusInfoStruct outerLeadsConvertType(String outerLeadsConvertType) {
    this.outerLeadsConvertType = outerLeadsConvertType;
    return this;
  }

  /**
   * Get outerLeadsConvertType
   *
   * @return outerLeadsConvertType
   */
  @ApiModelProperty(value = "")
  public String getOuterLeadsConvertType() {
    return outerLeadsConvertType;
  }

  public void setOuterLeadsConvertType(String outerLeadsConvertType) {
    this.outerLeadsConvertType = outerLeadsConvertType;
  }

  public OuterLeadsStatusInfoStruct outerLeadsIneffectReason(String outerLeadsIneffectReason) {
    this.outerLeadsIneffectReason = outerLeadsIneffectReason;
    return this;
  }

  /**
   * Get outerLeadsIneffectReason
   *
   * @return outerLeadsIneffectReason
   */
  @ApiModelProperty(value = "")
  public String getOuterLeadsIneffectReason() {
    return outerLeadsIneffectReason;
  }

  public void setOuterLeadsIneffectReason(String outerLeadsIneffectReason) {
    this.outerLeadsIneffectReason = outerLeadsIneffectReason;
  }

  public OuterLeadsStatusInfoStruct customizedTags(List<CustomizedTagsStruct> customizedTags) {
    this.customizedTags = customizedTags;
    return this;
  }

  public OuterLeadsStatusInfoStruct addCustomizedTagsItem(CustomizedTagsStruct customizedTagsItem) {
    if (this.customizedTags == null) {
      this.customizedTags = new ArrayList<CustomizedTagsStruct>();
    }
    this.customizedTags.add(customizedTagsItem);
    return this;
  }

  /**
   * Get customizedTags
   *
   * @return customizedTags
   */
  @ApiModelProperty(value = "")
  public List<CustomizedTagsStruct> getCustomizedTags() {
    return customizedTags;
  }

  public void setCustomizedTags(List<CustomizedTagsStruct> customizedTags) {
    this.customizedTags = customizedTags;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OuterLeadsStatusInfoStruct outerLeadsStatusInfoStruct = (OuterLeadsStatusInfoStruct) o;
    return Objects.equals(this.outerLeadsId, outerLeadsStatusInfoStruct.outerLeadsId)
        && Objects.equals(this.leadsId, outerLeadsStatusInfoStruct.leadsId)
        && Objects.equals(this.leadsTel, outerLeadsStatusInfoStruct.leadsTel)
        && Objects.equals(this.leadsQq, outerLeadsStatusInfoStruct.leadsQq)
        && Objects.equals(this.leadsWechat, outerLeadsStatusInfoStruct.leadsWechat)
        && Objects.equals(this.clickId, outerLeadsStatusInfoStruct.clickId)
        && Objects.equals(this.leadsConvertType, outerLeadsStatusInfoStruct.leadsConvertType)
        && Objects.equals(this.leadsIneffectReason, outerLeadsStatusInfoStruct.leadsIneffectReason)
        && Objects.equals(
            this.outerLeadsConvertType, outerLeadsStatusInfoStruct.outerLeadsConvertType)
        && Objects.equals(
            this.outerLeadsIneffectReason, outerLeadsStatusInfoStruct.outerLeadsIneffectReason)
        && Objects.equals(this.customizedTags, outerLeadsStatusInfoStruct.customizedTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        outerLeadsId,
        leadsId,
        leadsTel,
        leadsQq,
        leadsWechat,
        clickId,
        leadsConvertType,
        leadsIneffectReason,
        outerLeadsConvertType,
        outerLeadsIneffectReason,
        customizedTags);
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

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

/** 多版位的审核结果信息 */
@ApiModel(description = "多版位的审核结果信息")
public class AuditSpecStruct {
  @SerializedName("site_set")
  private SiteSetDefinition siteSet = null;

  @SerializedName("system_status")
  private AdStatus systemStatus = null;

  @SerializedName("reject_message")
  private String rejectMessage = null;

  @SerializedName("element_reject_detail_info")
  private List<ElementRejectDetailInfo> elementRejectDetailInfo = null;

  public AuditSpecStruct siteSet(SiteSetDefinition siteSet) {
    this.siteSet = siteSet;
    return this;
  }

  /**
   * Get siteSet
   *
   * @return siteSet
   */
  @ApiModelProperty(value = "")
  public SiteSetDefinition getSiteSet() {
    return siteSet;
  }

  public void setSiteSet(SiteSetDefinition siteSet) {
    this.siteSet = siteSet;
  }

  public AuditSpecStruct systemStatus(AdStatus systemStatus) {
    this.systemStatus = systemStatus;
    return this;
  }

  /**
   * Get systemStatus
   *
   * @return systemStatus
   */
  @ApiModelProperty(value = "")
  public AdStatus getSystemStatus() {
    return systemStatus;
  }

  public void setSystemStatus(AdStatus systemStatus) {
    this.systemStatus = systemStatus;
  }

  public AuditSpecStruct rejectMessage(String rejectMessage) {
    this.rejectMessage = rejectMessage;
    return this;
  }

  /**
   * Get rejectMessage
   *
   * @return rejectMessage
   */
  @ApiModelProperty(value = "")
  public String getRejectMessage() {
    return rejectMessage;
  }

  public void setRejectMessage(String rejectMessage) {
    this.rejectMessage = rejectMessage;
  }

  public AuditSpecStruct elementRejectDetailInfo(
      List<ElementRejectDetailInfo> elementRejectDetailInfo) {
    this.elementRejectDetailInfo = elementRejectDetailInfo;
    return this;
  }

  public AuditSpecStruct addElementRejectDetailInfoItem(
      ElementRejectDetailInfo elementRejectDetailInfoItem) {
    if (this.elementRejectDetailInfo == null) {
      this.elementRejectDetailInfo = new ArrayList<ElementRejectDetailInfo>();
    }
    this.elementRejectDetailInfo.add(elementRejectDetailInfoItem);
    return this;
  }

  /**
   * Get elementRejectDetailInfo
   *
   * @return elementRejectDetailInfo
   */
  @ApiModelProperty(value = "")
  public List<ElementRejectDetailInfo> getElementRejectDetailInfo() {
    return elementRejectDetailInfo;
  }

  public void setElementRejectDetailInfo(List<ElementRejectDetailInfo> elementRejectDetailInfo) {
    this.elementRejectDetailInfo = elementRejectDetailInfo;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditSpecStruct auditSpecStruct = (AuditSpecStruct) o;
    return Objects.equals(this.siteSet, auditSpecStruct.siteSet)
        && Objects.equals(this.systemStatus, auditSpecStruct.systemStatus)
        && Objects.equals(this.rejectMessage, auditSpecStruct.rejectMessage)
        && Objects.equals(this.elementRejectDetailInfo, auditSpecStruct.elementRejectDetailInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siteSet, systemStatus, rejectMessage, elementRejectDetailInfo);
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

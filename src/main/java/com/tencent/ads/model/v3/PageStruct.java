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

/** 获取落地页列表落地页数据结构 */
@ApiModel(description = "获取落地页列表落地页数据结构")
public class PageStruct {
  @SerializedName("page_id")
  private Long pageId = null;

  @SerializedName("page_service_id")
  private String pageServiceId = null;

  @SerializedName("page_name")
  private String pageName = null;

  @SerializedName("page_type")
  private XJPageType pageType = null;

  @SerializedName("page_publish_status")
  private PagePublishStatus pagePublishStatus = null;

  @SerializedName("page_status")
  private PageAuditStatus pageStatus = null;

  @SerializedName("page_last_modify_time")
  private String pageLastModifyTime = null;

  @SerializedName("page_owner_id")
  private Long pageOwnerId = null;

  @SerializedName("publish_url")
  private String publishUrl = null;

  @SerializedName("reject_reason")
  private String rejectReason = null;

  @SerializedName("playable_type")
  private XJPlayableType playableType = null;

  @SerializedName("publish_app_id")
  private PublishAppId publishAppId = null;

  @SerializedName("unpublish_app_id")
  private UnpublishAppId unpublishAppId = null;

  public PageStruct pageId(Long pageId) {
    this.pageId = pageId;
    return this;
  }

  /**
   * Get pageId
   *
   * @return pageId
   */
  @ApiModelProperty(value = "")
  public Long getPageId() {
    return pageId;
  }

  public void setPageId(Long pageId) {
    this.pageId = pageId;
  }

  public PageStruct pageServiceId(String pageServiceId) {
    this.pageServiceId = pageServiceId;
    return this;
  }

  /**
   * Get pageServiceId
   *
   * @return pageServiceId
   */
  @ApiModelProperty(value = "")
  public String getPageServiceId() {
    return pageServiceId;
  }

  public void setPageServiceId(String pageServiceId) {
    this.pageServiceId = pageServiceId;
  }

  public PageStruct pageName(String pageName) {
    this.pageName = pageName;
    return this;
  }

  /**
   * Get pageName
   *
   * @return pageName
   */
  @ApiModelProperty(value = "")
  public String getPageName() {
    return pageName;
  }

  public void setPageName(String pageName) {
    this.pageName = pageName;
  }

  public PageStruct pageType(XJPageType pageType) {
    this.pageType = pageType;
    return this;
  }

  /**
   * Get pageType
   *
   * @return pageType
   */
  @ApiModelProperty(value = "")
  public XJPageType getPageType() {
    return pageType;
  }

  public void setPageType(XJPageType pageType) {
    this.pageType = pageType;
  }

  public PageStruct pagePublishStatus(PagePublishStatus pagePublishStatus) {
    this.pagePublishStatus = pagePublishStatus;
    return this;
  }

  /**
   * Get pagePublishStatus
   *
   * @return pagePublishStatus
   */
  @ApiModelProperty(value = "")
  public PagePublishStatus getPagePublishStatus() {
    return pagePublishStatus;
  }

  public void setPagePublishStatus(PagePublishStatus pagePublishStatus) {
    this.pagePublishStatus = pagePublishStatus;
  }

  public PageStruct pageStatus(PageAuditStatus pageStatus) {
    this.pageStatus = pageStatus;
    return this;
  }

  /**
   * Get pageStatus
   *
   * @return pageStatus
   */
  @ApiModelProperty(value = "")
  public PageAuditStatus getPageStatus() {
    return pageStatus;
  }

  public void setPageStatus(PageAuditStatus pageStatus) {
    this.pageStatus = pageStatus;
  }

  public PageStruct pageLastModifyTime(String pageLastModifyTime) {
    this.pageLastModifyTime = pageLastModifyTime;
    return this;
  }

  /**
   * Get pageLastModifyTime
   *
   * @return pageLastModifyTime
   */
  @ApiModelProperty(value = "")
  public String getPageLastModifyTime() {
    return pageLastModifyTime;
  }

  public void setPageLastModifyTime(String pageLastModifyTime) {
    this.pageLastModifyTime = pageLastModifyTime;
  }

  public PageStruct pageOwnerId(Long pageOwnerId) {
    this.pageOwnerId = pageOwnerId;
    return this;
  }

  /**
   * Get pageOwnerId
   *
   * @return pageOwnerId
   */
  @ApiModelProperty(value = "")
  public Long getPageOwnerId() {
    return pageOwnerId;
  }

  public void setPageOwnerId(Long pageOwnerId) {
    this.pageOwnerId = pageOwnerId;
  }

  public PageStruct publishUrl(String publishUrl) {
    this.publishUrl = publishUrl;
    return this;
  }

  /**
   * Get publishUrl
   *
   * @return publishUrl
   */
  @ApiModelProperty(value = "")
  public String getPublishUrl() {
    return publishUrl;
  }

  public void setPublishUrl(String publishUrl) {
    this.publishUrl = publishUrl;
  }

  public PageStruct rejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
    return this;
  }

  /**
   * Get rejectReason
   *
   * @return rejectReason
   */
  @ApiModelProperty(value = "")
  public String getRejectReason() {
    return rejectReason;
  }

  public void setRejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
  }

  public PageStruct playableType(XJPlayableType playableType) {
    this.playableType = playableType;
    return this;
  }

  /**
   * Get playableType
   *
   * @return playableType
   */
  @ApiModelProperty(value = "")
  public XJPlayableType getPlayableType() {
    return playableType;
  }

  public void setPlayableType(XJPlayableType playableType) {
    this.playableType = playableType;
  }

  public PageStruct publishAppId(PublishAppId publishAppId) {
    this.publishAppId = publishAppId;
    return this;
  }

  /**
   * Get publishAppId
   *
   * @return publishAppId
   */
  @ApiModelProperty(value = "")
  public PublishAppId getPublishAppId() {
    return publishAppId;
  }

  public void setPublishAppId(PublishAppId publishAppId) {
    this.publishAppId = publishAppId;
  }

  public PageStruct unpublishAppId(UnpublishAppId unpublishAppId) {
    this.unpublishAppId = unpublishAppId;
    return this;
  }

  /**
   * Get unpublishAppId
   *
   * @return unpublishAppId
   */
  @ApiModelProperty(value = "")
  public UnpublishAppId getUnpublishAppId() {
    return unpublishAppId;
  }

  public void setUnpublishAppId(UnpublishAppId unpublishAppId) {
    this.unpublishAppId = unpublishAppId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageStruct pageStruct = (PageStruct) o;
    return Objects.equals(this.pageId, pageStruct.pageId)
        && Objects.equals(this.pageServiceId, pageStruct.pageServiceId)
        && Objects.equals(this.pageName, pageStruct.pageName)
        && Objects.equals(this.pageType, pageStruct.pageType)
        && Objects.equals(this.pagePublishStatus, pageStruct.pagePublishStatus)
        && Objects.equals(this.pageStatus, pageStruct.pageStatus)
        && Objects.equals(this.pageLastModifyTime, pageStruct.pageLastModifyTime)
        && Objects.equals(this.pageOwnerId, pageStruct.pageOwnerId)
        && Objects.equals(this.publishUrl, pageStruct.publishUrl)
        && Objects.equals(this.rejectReason, pageStruct.rejectReason)
        && Objects.equals(this.playableType, pageStruct.playableType)
        && Objects.equals(this.publishAppId, pageStruct.publishAppId)
        && Objects.equals(this.unpublishAppId, pageStruct.unpublishAppId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        pageId,
        pageServiceId,
        pageName,
        pageType,
        pagePublishStatus,
        pageStatus,
        pageLastModifyTime,
        pageOwnerId,
        publishUrl,
        rejectReason,
        playableType,
        publishAppId,
        unpublishAppId);
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
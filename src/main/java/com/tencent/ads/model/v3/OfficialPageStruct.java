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

/** 官方落地页结构数据 */
@ApiModel(description = "官方落地页结构数据")
public class OfficialPageStruct {
  @SerializedName("page_id")
  private Long pageId = null;

  @SerializedName("landing_page_id")
  private Long landingPageId = null;

  @SerializedName("page_name")
  private String pageName = null;

  @SerializedName("page_title")
  private String pageTitle = null;

  @SerializedName("page_type")
  private OfficialPageType pageType = null;

  @SerializedName("page_status")
  private OfficialPageStatus pageStatus = null;

  public OfficialPageStruct pageId(Long pageId) {
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

  public OfficialPageStruct landingPageId(Long landingPageId) {
    this.landingPageId = landingPageId;
    return this;
  }

  /**
   * Get landingPageId
   *
   * @return landingPageId
   */
  @ApiModelProperty(value = "")
  public Long getLandingPageId() {
    return landingPageId;
  }

  public void setLandingPageId(Long landingPageId) {
    this.landingPageId = landingPageId;
  }

  public OfficialPageStruct pageName(String pageName) {
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

  public OfficialPageStruct pageTitle(String pageTitle) {
    this.pageTitle = pageTitle;
    return this;
  }

  /**
   * Get pageTitle
   *
   * @return pageTitle
   */
  @ApiModelProperty(value = "")
  public String getPageTitle() {
    return pageTitle;
  }

  public void setPageTitle(String pageTitle) {
    this.pageTitle = pageTitle;
  }

  public OfficialPageStruct pageType(OfficialPageType pageType) {
    this.pageType = pageType;
    return this;
  }

  /**
   * Get pageType
   *
   * @return pageType
   */
  @ApiModelProperty(value = "")
  public OfficialPageType getPageType() {
    return pageType;
  }

  public void setPageType(OfficialPageType pageType) {
    this.pageType = pageType;
  }

  public OfficialPageStruct pageStatus(OfficialPageStatus pageStatus) {
    this.pageStatus = pageStatus;
    return this;
  }

  /**
   * Get pageStatus
   *
   * @return pageStatus
   */
  @ApiModelProperty(value = "")
  public OfficialPageStatus getPageStatus() {
    return pageStatus;
  }

  public void setPageStatus(OfficialPageStatus pageStatus) {
    this.pageStatus = pageStatus;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfficialPageStruct officialPageStruct = (OfficialPageStruct) o;
    return Objects.equals(this.pageId, officialPageStruct.pageId)
        && Objects.equals(this.landingPageId, officialPageStruct.landingPageId)
        && Objects.equals(this.pageName, officialPageStruct.pageName)
        && Objects.equals(this.pageTitle, officialPageStruct.pageTitle)
        && Objects.equals(this.pageType, officialPageStruct.pageType)
        && Objects.equals(this.pageStatus, officialPageStruct.pageStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageId, landingPageId, pageName, pageTitle, pageType, pageStatus);
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

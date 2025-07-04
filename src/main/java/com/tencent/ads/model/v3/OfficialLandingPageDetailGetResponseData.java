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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** OfficialLandingPageDetailGetResponseData */
public class OfficialLandingPageDetailGetResponseData {
  @SerializedName("page_id")
  private Long pageId = null;

  @SerializedName("landing_page_id")
  private Long landingPageId = null;

  @SerializedName("page_config")
  private PageConfigDetail pageConfig = null;

  @SerializedName("page_elements")
  private List<PageElement> pageElements = null;

  public OfficialLandingPageDetailGetResponseData pageId(Long pageId) {
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

  public OfficialLandingPageDetailGetResponseData landingPageId(Long landingPageId) {
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

  public OfficialLandingPageDetailGetResponseData pageConfig(PageConfigDetail pageConfig) {
    this.pageConfig = pageConfig;
    return this;
  }

  /**
   * Get pageConfig
   *
   * @return pageConfig
   */
  @ApiModelProperty(value = "")
  public PageConfigDetail getPageConfig() {
    return pageConfig;
  }

  public void setPageConfig(PageConfigDetail pageConfig) {
    this.pageConfig = pageConfig;
  }

  public OfficialLandingPageDetailGetResponseData pageElements(List<PageElement> pageElements) {
    this.pageElements = pageElements;
    return this;
  }

  public OfficialLandingPageDetailGetResponseData addPageElementsItem(
      PageElement pageElementsItem) {
    if (this.pageElements == null) {
      this.pageElements = new ArrayList<PageElement>();
    }
    this.pageElements.add(pageElementsItem);
    return this;
  }

  /**
   * Get pageElements
   *
   * @return pageElements
   */
  @ApiModelProperty(value = "")
  public List<PageElement> getPageElements() {
    return pageElements;
  }

  public void setPageElements(List<PageElement> pageElements) {
    this.pageElements = pageElements;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfficialLandingPageDetailGetResponseData officialLandingPageDetailGetResponseData =
        (OfficialLandingPageDetailGetResponseData) o;
    return Objects.equals(this.pageId, officialLandingPageDetailGetResponseData.pageId)
        && Objects.equals(
            this.landingPageId, officialLandingPageDetailGetResponseData.landingPageId)
        && Objects.equals(this.pageConfig, officialLandingPageDetailGetResponseData.pageConfig)
        && Objects.equals(this.pageElements, officialLandingPageDetailGetResponseData.pageElements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageId, landingPageId, pageConfig, pageElements);
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

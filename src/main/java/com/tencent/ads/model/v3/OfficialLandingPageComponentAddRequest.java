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

/** OfficialLandingPageComponentAddRequest */
public class OfficialLandingPageComponentAddRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("page_config")
  private PageConfigSave pageConfig = null;

  @SerializedName("page_elements")
  private List<PageElement> pageElements = null;

  @SerializedName("proto_version")
  private Long protoVersion = null;

  public OfficialLandingPageComponentAddRequest accountId(Long accountId) {
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

  public OfficialLandingPageComponentAddRequest pageConfig(PageConfigSave pageConfig) {
    this.pageConfig = pageConfig;
    return this;
  }

  /**
   * Get pageConfig
   *
   * @return pageConfig
   */
  @ApiModelProperty(value = "")
  public PageConfigSave getPageConfig() {
    return pageConfig;
  }

  public void setPageConfig(PageConfigSave pageConfig) {
    this.pageConfig = pageConfig;
  }

  public OfficialLandingPageComponentAddRequest pageElements(List<PageElement> pageElements) {
    this.pageElements = pageElements;
    return this;
  }

  public OfficialLandingPageComponentAddRequest addPageElementsItem(PageElement pageElementsItem) {
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

  public OfficialLandingPageComponentAddRequest protoVersion(Long protoVersion) {
    this.protoVersion = protoVersion;
    return this;
  }

  /**
   * Get protoVersion
   *
   * @return protoVersion
   */
  @ApiModelProperty(value = "")
  public Long getProtoVersion() {
    return protoVersion;
  }

  public void setProtoVersion(Long protoVersion) {
    this.protoVersion = protoVersion;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfficialLandingPageComponentAddRequest officialLandingPageComponentAddRequest =
        (OfficialLandingPageComponentAddRequest) o;
    return Objects.equals(this.accountId, officialLandingPageComponentAddRequest.accountId)
        && Objects.equals(this.pageConfig, officialLandingPageComponentAddRequest.pageConfig)
        && Objects.equals(this.pageElements, officialLandingPageComponentAddRequest.pageElements)
        && Objects.equals(this.protoVersion, officialLandingPageComponentAddRequest.protoVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, pageConfig, pageElements, protoVersion);
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

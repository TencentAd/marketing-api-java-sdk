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

/** ComplianceValidationGetRequest */
public class ComplianceValidationGetRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("site_set")
  private SiteSet siteSet = null;

  @SerializedName("image_id")
  private String imageId = null;

  @SerializedName("text")
  private String text = null;

  public ComplianceValidationGetRequest accountId(Long accountId) {
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

  public ComplianceValidationGetRequest siteSet(SiteSet siteSet) {
    this.siteSet = siteSet;
    return this;
  }

  /**
   * Get siteSet
   *
   * @return siteSet
   */
  @ApiModelProperty(value = "")
  public SiteSet getSiteSet() {
    return siteSet;
  }

  public void setSiteSet(SiteSet siteSet) {
    this.siteSet = siteSet;
  }

  public ComplianceValidationGetRequest imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

  /**
   * Get imageId
   *
   * @return imageId
   */
  @ApiModelProperty(value = "")
  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  public ComplianceValidationGetRequest text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   *
   * @return text
   */
  @ApiModelProperty(value = "")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComplianceValidationGetRequest complianceValidationGetRequest =
        (ComplianceValidationGetRequest) o;
    return Objects.equals(this.accountId, complianceValidationGetRequest.accountId)
        && Objects.equals(this.siteSet, complianceValidationGetRequest.siteSet)
        && Objects.equals(this.imageId, complianceValidationGetRequest.imageId)
        && Objects.equals(this.text, complianceValidationGetRequest.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, siteSet, imageId, text);
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

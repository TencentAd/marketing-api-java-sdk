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

/** ConversionLinkAssetsAddRequest */
public class ConversionLinkAssetsAddRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("second_category_type")
  private ConversionLinkSecondCategoryType secondCategoryType = null;

  @SerializedName("marketing_carrier_id")
  private String marketingCarrierId = null;

  @SerializedName("marketing_carrier_name")
  private String marketingCarrierName = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("conversion_link_id")
  private Long conversionLinkId = null;

  @SerializedName("claim_type")
  private Long claimType = null;

  @SerializedName("attribution_window")
  private Long attributionWindow = null;

  @SerializedName("feedback_id")
  private Long feedbackId = null;

  @SerializedName("optional_og_nodes_index")
  private List<Long> optionalOgNodesIndex = null;

  @SerializedName("custom_report_nodes_index")
  private List<Long> customReportNodesIndex = null;

  public ConversionLinkAssetsAddRequest accountId(Long accountId) {
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

  public ConversionLinkAssetsAddRequest secondCategoryType(
      ConversionLinkSecondCategoryType secondCategoryType) {
    this.secondCategoryType = secondCategoryType;
    return this;
  }

  /**
   * Get secondCategoryType
   *
   * @return secondCategoryType
   */
  @ApiModelProperty(value = "")
  public ConversionLinkSecondCategoryType getSecondCategoryType() {
    return secondCategoryType;
  }

  public void setSecondCategoryType(ConversionLinkSecondCategoryType secondCategoryType) {
    this.secondCategoryType = secondCategoryType;
  }

  public ConversionLinkAssetsAddRequest marketingCarrierId(String marketingCarrierId) {
    this.marketingCarrierId = marketingCarrierId;
    return this;
  }

  /**
   * Get marketingCarrierId
   *
   * @return marketingCarrierId
   */
  @ApiModelProperty(value = "")
  public String getMarketingCarrierId() {
    return marketingCarrierId;
  }

  public void setMarketingCarrierId(String marketingCarrierId) {
    this.marketingCarrierId = marketingCarrierId;
  }

  public ConversionLinkAssetsAddRequest marketingCarrierName(String marketingCarrierName) {
    this.marketingCarrierName = marketingCarrierName;
    return this;
  }

  /**
   * Get marketingCarrierName
   *
   * @return marketingCarrierName
   */
  @ApiModelProperty(value = "")
  public String getMarketingCarrierName() {
    return marketingCarrierName;
  }

  public void setMarketingCarrierName(String marketingCarrierName) {
    this.marketingCarrierName = marketingCarrierName;
  }

  public ConversionLinkAssetsAddRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   *
   * @return name
   */
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ConversionLinkAssetsAddRequest conversionLinkId(Long conversionLinkId) {
    this.conversionLinkId = conversionLinkId;
    return this;
  }

  /**
   * Get conversionLinkId
   *
   * @return conversionLinkId
   */
  @ApiModelProperty(value = "")
  public Long getConversionLinkId() {
    return conversionLinkId;
  }

  public void setConversionLinkId(Long conversionLinkId) {
    this.conversionLinkId = conversionLinkId;
  }

  public ConversionLinkAssetsAddRequest claimType(Long claimType) {
    this.claimType = claimType;
    return this;
  }

  /**
   * Get claimType
   *
   * @return claimType
   */
  @ApiModelProperty(value = "")
  public Long getClaimType() {
    return claimType;
  }

  public void setClaimType(Long claimType) {
    this.claimType = claimType;
  }

  public ConversionLinkAssetsAddRequest attributionWindow(Long attributionWindow) {
    this.attributionWindow = attributionWindow;
    return this;
  }

  /**
   * Get attributionWindow
   *
   * @return attributionWindow
   */
  @ApiModelProperty(value = "")
  public Long getAttributionWindow() {
    return attributionWindow;
  }

  public void setAttributionWindow(Long attributionWindow) {
    this.attributionWindow = attributionWindow;
  }

  public ConversionLinkAssetsAddRequest feedbackId(Long feedbackId) {
    this.feedbackId = feedbackId;
    return this;
  }

  /**
   * Get feedbackId
   *
   * @return feedbackId
   */
  @ApiModelProperty(value = "")
  public Long getFeedbackId() {
    return feedbackId;
  }

  public void setFeedbackId(Long feedbackId) {
    this.feedbackId = feedbackId;
  }

  public ConversionLinkAssetsAddRequest optionalOgNodesIndex(List<Long> optionalOgNodesIndex) {
    this.optionalOgNodesIndex = optionalOgNodesIndex;
    return this;
  }

  public ConversionLinkAssetsAddRequest addOptionalOgNodesIndexItem(Long optionalOgNodesIndexItem) {
    if (this.optionalOgNodesIndex == null) {
      this.optionalOgNodesIndex = new ArrayList<Long>();
    }
    this.optionalOgNodesIndex.add(optionalOgNodesIndexItem);
    return this;
  }

  /**
   * Get optionalOgNodesIndex
   *
   * @return optionalOgNodesIndex
   */
  @ApiModelProperty(value = "")
  public List<Long> getOptionalOgNodesIndex() {
    return optionalOgNodesIndex;
  }

  public void setOptionalOgNodesIndex(List<Long> optionalOgNodesIndex) {
    this.optionalOgNodesIndex = optionalOgNodesIndex;
  }

  public ConversionLinkAssetsAddRequest customReportNodesIndex(List<Long> customReportNodesIndex) {
    this.customReportNodesIndex = customReportNodesIndex;
    return this;
  }

  public ConversionLinkAssetsAddRequest addCustomReportNodesIndexItem(
      Long customReportNodesIndexItem) {
    if (this.customReportNodesIndex == null) {
      this.customReportNodesIndex = new ArrayList<Long>();
    }
    this.customReportNodesIndex.add(customReportNodesIndexItem);
    return this;
  }

  /**
   * Get customReportNodesIndex
   *
   * @return customReportNodesIndex
   */
  @ApiModelProperty(value = "")
  public List<Long> getCustomReportNodesIndex() {
    return customReportNodesIndex;
  }

  public void setCustomReportNodesIndex(List<Long> customReportNodesIndex) {
    this.customReportNodesIndex = customReportNodesIndex;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionLinkAssetsAddRequest conversionLinkAssetsAddRequest =
        (ConversionLinkAssetsAddRequest) o;
    return Objects.equals(this.accountId, conversionLinkAssetsAddRequest.accountId)
        && Objects.equals(
            this.secondCategoryType, conversionLinkAssetsAddRequest.secondCategoryType)
        && Objects.equals(
            this.marketingCarrierId, conversionLinkAssetsAddRequest.marketingCarrierId)
        && Objects.equals(
            this.marketingCarrierName, conversionLinkAssetsAddRequest.marketingCarrierName)
        && Objects.equals(this.name, conversionLinkAssetsAddRequest.name)
        && Objects.equals(this.conversionLinkId, conversionLinkAssetsAddRequest.conversionLinkId)
        && Objects.equals(this.claimType, conversionLinkAssetsAddRequest.claimType)
        && Objects.equals(this.attributionWindow, conversionLinkAssetsAddRequest.attributionWindow)
        && Objects.equals(this.feedbackId, conversionLinkAssetsAddRequest.feedbackId)
        && Objects.equals(
            this.optionalOgNodesIndex, conversionLinkAssetsAddRequest.optionalOgNodesIndex)
        && Objects.equals(
            this.customReportNodesIndex, conversionLinkAssetsAddRequest.customReportNodesIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        secondCategoryType,
        marketingCarrierId,
        marketingCarrierName,
        name,
        conversionLinkId,
        claimType,
        attributionWindow,
        feedbackId,
        optionalOgNodesIndex,
        customReportNodesIndex);
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
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

/** DynamicCreativesUpdateRequest */
public class DynamicCreativesUpdateRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("dynamic_creative_id")
  private Long dynamicCreativeId = null;

  @SerializedName("dynamic_creative_name")
  private String dynamicCreativeName = null;

  @SerializedName("creative_components")
  private CreativeComponents creativeComponents = null;

  @SerializedName("impression_tracking_url")
  private String impressionTrackingUrl = null;

  @SerializedName("click_tracking_url")
  private String clickTrackingUrl = null;

  @SerializedName("auto_derived_program_creative_switch")
  private Boolean autoDerivedProgramCreativeSwitch = null;

  @SerializedName("configured_status")
  private ConfiguredStatus configuredStatus = null;

  @SerializedName("is_retry_batch_update")
  private Boolean isRetryBatchUpdate = null;

  public DynamicCreativesUpdateRequest accountId(Long accountId) {
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

  public DynamicCreativesUpdateRequest dynamicCreativeId(Long dynamicCreativeId) {
    this.dynamicCreativeId = dynamicCreativeId;
    return this;
  }

  /**
   * Get dynamicCreativeId
   *
   * @return dynamicCreativeId
   */
  @ApiModelProperty(value = "")
  public Long getDynamicCreativeId() {
    return dynamicCreativeId;
  }

  public void setDynamicCreativeId(Long dynamicCreativeId) {
    this.dynamicCreativeId = dynamicCreativeId;
  }

  public DynamicCreativesUpdateRequest dynamicCreativeName(String dynamicCreativeName) {
    this.dynamicCreativeName = dynamicCreativeName;
    return this;
  }

  /**
   * Get dynamicCreativeName
   *
   * @return dynamicCreativeName
   */
  @ApiModelProperty(value = "")
  public String getDynamicCreativeName() {
    return dynamicCreativeName;
  }

  public void setDynamicCreativeName(String dynamicCreativeName) {
    this.dynamicCreativeName = dynamicCreativeName;
  }

  public DynamicCreativesUpdateRequest creativeComponents(CreativeComponents creativeComponents) {
    this.creativeComponents = creativeComponents;
    return this;
  }

  /**
   * Get creativeComponents
   *
   * @return creativeComponents
   */
  @ApiModelProperty(value = "")
  public CreativeComponents getCreativeComponents() {
    return creativeComponents;
  }

  public void setCreativeComponents(CreativeComponents creativeComponents) {
    this.creativeComponents = creativeComponents;
  }

  public DynamicCreativesUpdateRequest impressionTrackingUrl(String impressionTrackingUrl) {
    this.impressionTrackingUrl = impressionTrackingUrl;
    return this;
  }

  /**
   * Get impressionTrackingUrl
   *
   * @return impressionTrackingUrl
   */
  @ApiModelProperty(value = "")
  public String getImpressionTrackingUrl() {
    return impressionTrackingUrl;
  }

  public void setImpressionTrackingUrl(String impressionTrackingUrl) {
    this.impressionTrackingUrl = impressionTrackingUrl;
  }

  public DynamicCreativesUpdateRequest clickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
    return this;
  }

  /**
   * Get clickTrackingUrl
   *
   * @return clickTrackingUrl
   */
  @ApiModelProperty(value = "")
  public String getClickTrackingUrl() {
    return clickTrackingUrl;
  }

  public void setClickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
  }

  public DynamicCreativesUpdateRequest autoDerivedProgramCreativeSwitch(
      Boolean autoDerivedProgramCreativeSwitch) {
    this.autoDerivedProgramCreativeSwitch = autoDerivedProgramCreativeSwitch;
    return this;
  }

  /**
   * Get autoDerivedProgramCreativeSwitch
   *
   * @return autoDerivedProgramCreativeSwitch
   */
  @ApiModelProperty(value = "")
  public Boolean isAutoDerivedProgramCreativeSwitch() {
    return autoDerivedProgramCreativeSwitch;
  }

  public void setAutoDerivedProgramCreativeSwitch(Boolean autoDerivedProgramCreativeSwitch) {
    this.autoDerivedProgramCreativeSwitch = autoDerivedProgramCreativeSwitch;
  }

  public DynamicCreativesUpdateRequest configuredStatus(ConfiguredStatus configuredStatus) {
    this.configuredStatus = configuredStatus;
    return this;
  }

  /**
   * Get configuredStatus
   *
   * @return configuredStatus
   */
  @ApiModelProperty(value = "")
  public ConfiguredStatus getConfiguredStatus() {
    return configuredStatus;
  }

  public void setConfiguredStatus(ConfiguredStatus configuredStatus) {
    this.configuredStatus = configuredStatus;
  }

  public DynamicCreativesUpdateRequest isRetryBatchUpdate(Boolean isRetryBatchUpdate) {
    this.isRetryBatchUpdate = isRetryBatchUpdate;
    return this;
  }

  /**
   * Get isRetryBatchUpdate
   *
   * @return isRetryBatchUpdate
   */
  @ApiModelProperty(value = "")
  public Boolean isIsRetryBatchUpdate() {
    return isRetryBatchUpdate;
  }

  public void setIsRetryBatchUpdate(Boolean isRetryBatchUpdate) {
    this.isRetryBatchUpdate = isRetryBatchUpdate;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicCreativesUpdateRequest dynamicCreativesUpdateRequest = (DynamicCreativesUpdateRequest) o;
    return Objects.equals(this.accountId, dynamicCreativesUpdateRequest.accountId)
        && Objects.equals(this.dynamicCreativeId, dynamicCreativesUpdateRequest.dynamicCreativeId)
        && Objects.equals(
            this.dynamicCreativeName, dynamicCreativesUpdateRequest.dynamicCreativeName)
        && Objects.equals(this.creativeComponents, dynamicCreativesUpdateRequest.creativeComponents)
        && Objects.equals(
            this.impressionTrackingUrl, dynamicCreativesUpdateRequest.impressionTrackingUrl)
        && Objects.equals(this.clickTrackingUrl, dynamicCreativesUpdateRequest.clickTrackingUrl)
        && Objects.equals(
            this.autoDerivedProgramCreativeSwitch,
            dynamicCreativesUpdateRequest.autoDerivedProgramCreativeSwitch)
        && Objects.equals(this.configuredStatus, dynamicCreativesUpdateRequest.configuredStatus)
        && Objects.equals(
            this.isRetryBatchUpdate, dynamicCreativesUpdateRequest.isRetryBatchUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        dynamicCreativeId,
        dynamicCreativeName,
        creativeComponents,
        impressionTrackingUrl,
        clickTrackingUrl,
        autoDerivedProgramCreativeSwitch,
        configuredStatus,
        isRetryBatchUpdate);
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

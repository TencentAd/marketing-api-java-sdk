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

/** DynamicCreativesAddRequest */
public class DynamicCreativesAddRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("adgroup_id")
  private Long adgroupId = null;

  @SerializedName("dynamic_creative_name")
  private String dynamicCreativeName = null;

  @SerializedName("creative_template_id")
  private Long creativeTemplateId = null;

  @SerializedName("delivery_mode")
  private DeliveryMode deliveryMode = null;

  @SerializedName("dynamic_creative_type")
  private DynamicCreativeType dynamicCreativeType = null;

  @SerializedName("creative_components")
  private CreativeComponents creativeComponents = null;

  @SerializedName("impression_tracking_url")
  private String impressionTrackingUrl = null;

  @SerializedName("click_tracking_url")
  private String clickTrackingUrl = null;

  @SerializedName("program_creative_info")
  private ProgramCreativeInfo programCreativeInfo = null;

  @SerializedName("page_track_url")
  private String pageTrackUrl = null;

  @SerializedName("auto_derived_program_creative_switch")
  private Boolean autoDerivedProgramCreativeSwitch = null;

  @SerializedName("configured_status")
  private ConfiguredStatus configuredStatus = null;

  public DynamicCreativesAddRequest accountId(Long accountId) {
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

  public DynamicCreativesAddRequest adgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
    return this;
  }

  /**
   * Get adgroupId
   *
   * @return adgroupId
   */
  @ApiModelProperty(value = "")
  public Long getAdgroupId() {
    return adgroupId;
  }

  public void setAdgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
  }

  public DynamicCreativesAddRequest dynamicCreativeName(String dynamicCreativeName) {
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

  public DynamicCreativesAddRequest creativeTemplateId(Long creativeTemplateId) {
    this.creativeTemplateId = creativeTemplateId;
    return this;
  }

  /**
   * Get creativeTemplateId
   *
   * @return creativeTemplateId
   */
  @ApiModelProperty(value = "")
  public Long getCreativeTemplateId() {
    return creativeTemplateId;
  }

  public void setCreativeTemplateId(Long creativeTemplateId) {
    this.creativeTemplateId = creativeTemplateId;
  }

  public DynamicCreativesAddRequest deliveryMode(DeliveryMode deliveryMode) {
    this.deliveryMode = deliveryMode;
    return this;
  }

  /**
   * Get deliveryMode
   *
   * @return deliveryMode
   */
  @ApiModelProperty(value = "")
  public DeliveryMode getDeliveryMode() {
    return deliveryMode;
  }

  public void setDeliveryMode(DeliveryMode deliveryMode) {
    this.deliveryMode = deliveryMode;
  }

  public DynamicCreativesAddRequest dynamicCreativeType(DynamicCreativeType dynamicCreativeType) {
    this.dynamicCreativeType = dynamicCreativeType;
    return this;
  }

  /**
   * Get dynamicCreativeType
   *
   * @return dynamicCreativeType
   */
  @ApiModelProperty(value = "")
  public DynamicCreativeType getDynamicCreativeType() {
    return dynamicCreativeType;
  }

  public void setDynamicCreativeType(DynamicCreativeType dynamicCreativeType) {
    this.dynamicCreativeType = dynamicCreativeType;
  }

  public DynamicCreativesAddRequest creativeComponents(CreativeComponents creativeComponents) {
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

  public DynamicCreativesAddRequest impressionTrackingUrl(String impressionTrackingUrl) {
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

  public DynamicCreativesAddRequest clickTrackingUrl(String clickTrackingUrl) {
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

  public DynamicCreativesAddRequest programCreativeInfo(ProgramCreativeInfo programCreativeInfo) {
    this.programCreativeInfo = programCreativeInfo;
    return this;
  }

  /**
   * Get programCreativeInfo
   *
   * @return programCreativeInfo
   */
  @ApiModelProperty(value = "")
  public ProgramCreativeInfo getProgramCreativeInfo() {
    return programCreativeInfo;
  }

  public void setProgramCreativeInfo(ProgramCreativeInfo programCreativeInfo) {
    this.programCreativeInfo = programCreativeInfo;
  }

  public DynamicCreativesAddRequest pageTrackUrl(String pageTrackUrl) {
    this.pageTrackUrl = pageTrackUrl;
    return this;
  }

  /**
   * Get pageTrackUrl
   *
   * @return pageTrackUrl
   */
  @ApiModelProperty(value = "")
  public String getPageTrackUrl() {
    return pageTrackUrl;
  }

  public void setPageTrackUrl(String pageTrackUrl) {
    this.pageTrackUrl = pageTrackUrl;
  }

  public DynamicCreativesAddRequest autoDerivedProgramCreativeSwitch(
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

  public DynamicCreativesAddRequest configuredStatus(ConfiguredStatus configuredStatus) {
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicCreativesAddRequest dynamicCreativesAddRequest = (DynamicCreativesAddRequest) o;
    return Objects.equals(this.accountId, dynamicCreativesAddRequest.accountId)
        && Objects.equals(this.adgroupId, dynamicCreativesAddRequest.adgroupId)
        && Objects.equals(this.dynamicCreativeName, dynamicCreativesAddRequest.dynamicCreativeName)
        && Objects.equals(this.creativeTemplateId, dynamicCreativesAddRequest.creativeTemplateId)
        && Objects.equals(this.deliveryMode, dynamicCreativesAddRequest.deliveryMode)
        && Objects.equals(this.dynamicCreativeType, dynamicCreativesAddRequest.dynamicCreativeType)
        && Objects.equals(this.creativeComponents, dynamicCreativesAddRequest.creativeComponents)
        && Objects.equals(
            this.impressionTrackingUrl, dynamicCreativesAddRequest.impressionTrackingUrl)
        && Objects.equals(this.clickTrackingUrl, dynamicCreativesAddRequest.clickTrackingUrl)
        && Objects.equals(this.programCreativeInfo, dynamicCreativesAddRequest.programCreativeInfo)
        && Objects.equals(this.pageTrackUrl, dynamicCreativesAddRequest.pageTrackUrl)
        && Objects.equals(
            this.autoDerivedProgramCreativeSwitch,
            dynamicCreativesAddRequest.autoDerivedProgramCreativeSwitch)
        && Objects.equals(this.configuredStatus, dynamicCreativesAddRequest.configuredStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        adgroupId,
        dynamicCreativeName,
        creativeTemplateId,
        deliveryMode,
        dynamicCreativeType,
        creativeComponents,
        impressionTrackingUrl,
        clickTrackingUrl,
        programCreativeInfo,
        pageTrackUrl,
        autoDerivedProgramCreativeSwitch,
        configuredStatus);
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

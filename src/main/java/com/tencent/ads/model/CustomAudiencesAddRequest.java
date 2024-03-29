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

/** CustomAudiencesAddRequest */
public class CustomAudiencesAddRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private AudienceType type = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("cooperated")
  private Boolean cooperated = null;

  @SerializedName("audience_spec")
  private AudienceSpec audienceSpec = null;

  @SerializedName("platform")
  private DataPlatform platform = null;

  @SerializedName("external_audience_id")
  private String externalAudienceId = null;

  public CustomAudiencesAddRequest accountId(Long accountId) {
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

  public CustomAudiencesAddRequest name(String name) {
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

  public CustomAudiencesAddRequest type(AudienceType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @ApiModelProperty(value = "")
  public AudienceType getType() {
    return type;
  }

  public void setType(AudienceType type) {
    this.type = type;
  }

  public CustomAudiencesAddRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   *
   * @return description
   */
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CustomAudiencesAddRequest cooperated(Boolean cooperated) {
    this.cooperated = cooperated;
    return this;
  }

  /**
   * Get cooperated
   *
   * @return cooperated
   */
  @ApiModelProperty(value = "")
  public Boolean isCooperated() {
    return cooperated;
  }

  public void setCooperated(Boolean cooperated) {
    this.cooperated = cooperated;
  }

  public CustomAudiencesAddRequest audienceSpec(AudienceSpec audienceSpec) {
    this.audienceSpec = audienceSpec;
    return this;
  }

  /**
   * Get audienceSpec
   *
   * @return audienceSpec
   */
  @ApiModelProperty(value = "")
  public AudienceSpec getAudienceSpec() {
    return audienceSpec;
  }

  public void setAudienceSpec(AudienceSpec audienceSpec) {
    this.audienceSpec = audienceSpec;
  }

  public CustomAudiencesAddRequest platform(DataPlatform platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Get platform
   *
   * @return platform
   */
  @ApiModelProperty(value = "")
  public DataPlatform getPlatform() {
    return platform;
  }

  public void setPlatform(DataPlatform platform) {
    this.platform = platform;
  }

  public CustomAudiencesAddRequest externalAudienceId(String externalAudienceId) {
    this.externalAudienceId = externalAudienceId;
    return this;
  }

  /**
   * Get externalAudienceId
   *
   * @return externalAudienceId
   */
  @ApiModelProperty(value = "")
  public String getExternalAudienceId() {
    return externalAudienceId;
  }

  public void setExternalAudienceId(String externalAudienceId) {
    this.externalAudienceId = externalAudienceId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomAudiencesAddRequest customAudiencesAddRequest = (CustomAudiencesAddRequest) o;
    return Objects.equals(this.accountId, customAudiencesAddRequest.accountId)
        && Objects.equals(this.name, customAudiencesAddRequest.name)
        && Objects.equals(this.type, customAudiencesAddRequest.type)
        && Objects.equals(this.description, customAudiencesAddRequest.description)
        && Objects.equals(this.cooperated, customAudiencesAddRequest.cooperated)
        && Objects.equals(this.audienceSpec, customAudiencesAddRequest.audienceSpec)
        && Objects.equals(this.platform, customAudiencesAddRequest.platform)
        && Objects.equals(this.externalAudienceId, customAudiencesAddRequest.externalAudienceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId, name, type, description, cooperated, audienceSpec, platform, externalAudienceId);
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

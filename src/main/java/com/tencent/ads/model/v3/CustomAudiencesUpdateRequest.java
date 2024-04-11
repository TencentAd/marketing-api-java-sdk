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

/** CustomAudiencesUpdateRequest */
public class CustomAudiencesUpdateRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("audience_id")
  private Long audienceId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("cooperated")
  private Boolean cooperated = null;

  public CustomAudiencesUpdateRequest accountId(Long accountId) {
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

  public CustomAudiencesUpdateRequest audienceId(Long audienceId) {
    this.audienceId = audienceId;
    return this;
  }

  /**
   * Get audienceId
   *
   * @return audienceId
   */
  @ApiModelProperty(value = "")
  public Long getAudienceId() {
    return audienceId;
  }

  public void setAudienceId(Long audienceId) {
    this.audienceId = audienceId;
  }

  public CustomAudiencesUpdateRequest name(String name) {
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

  public CustomAudiencesUpdateRequest description(String description) {
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

  public CustomAudiencesUpdateRequest cooperated(Boolean cooperated) {
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomAudiencesUpdateRequest customAudiencesUpdateRequest = (CustomAudiencesUpdateRequest) o;
    return Objects.equals(this.accountId, customAudiencesUpdateRequest.accountId)
        && Objects.equals(this.audienceId, customAudiencesUpdateRequest.audienceId)
        && Objects.equals(this.name, customAudiencesUpdateRequest.name)
        && Objects.equals(this.description, customAudiencesUpdateRequest.description)
        && Objects.equals(this.cooperated, customAudiencesUpdateRequest.cooperated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, audienceId, name, description, cooperated);
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
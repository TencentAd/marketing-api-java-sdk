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

/** ProfilesAddRequest */
public class ProfilesAddRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("marketing_goal")
  private MarketingGoal marketingGoal = null;

  @SerializedName("marketing_sub_goal")
  private MarketingSubGoal marketingSubGoal = null;

  @SerializedName("marketing_carrier_type")
  private MarketingCarrierType marketingCarrierType = null;

  @SerializedName("marketing_target_type")
  private MarketingTargetType marketingTargetType = null;

  @SerializedName("marketing_carrier_id")
  private String marketingCarrierId = null;

  @SerializedName("profile_type")
  private ProfileType profileType = null;

  @SerializedName("head_image_id")
  private String headImageId = null;

  @SerializedName("profile_name")
  private String profileName = null;

  @SerializedName("description")
  private String description = null;

  public ProfilesAddRequest accountId(Long accountId) {
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

  public ProfilesAddRequest marketingGoal(MarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
    return this;
  }

  /**
   * Get marketingGoal
   *
   * @return marketingGoal
   */
  @ApiModelProperty(value = "")
  public MarketingGoal getMarketingGoal() {
    return marketingGoal;
  }

  public void setMarketingGoal(MarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
  }

  public ProfilesAddRequest marketingSubGoal(MarketingSubGoal marketingSubGoal) {
    this.marketingSubGoal = marketingSubGoal;
    return this;
  }

  /**
   * Get marketingSubGoal
   *
   * @return marketingSubGoal
   */
  @ApiModelProperty(value = "")
  public MarketingSubGoal getMarketingSubGoal() {
    return marketingSubGoal;
  }

  public void setMarketingSubGoal(MarketingSubGoal marketingSubGoal) {
    this.marketingSubGoal = marketingSubGoal;
  }

  public ProfilesAddRequest marketingCarrierType(MarketingCarrierType marketingCarrierType) {
    this.marketingCarrierType = marketingCarrierType;
    return this;
  }

  /**
   * Get marketingCarrierType
   *
   * @return marketingCarrierType
   */
  @ApiModelProperty(value = "")
  public MarketingCarrierType getMarketingCarrierType() {
    return marketingCarrierType;
  }

  public void setMarketingCarrierType(MarketingCarrierType marketingCarrierType) {
    this.marketingCarrierType = marketingCarrierType;
  }

  public ProfilesAddRequest marketingTargetType(MarketingTargetType marketingTargetType) {
    this.marketingTargetType = marketingTargetType;
    return this;
  }

  /**
   * Get marketingTargetType
   *
   * @return marketingTargetType
   */
  @ApiModelProperty(value = "")
  public MarketingTargetType getMarketingTargetType() {
    return marketingTargetType;
  }

  public void setMarketingTargetType(MarketingTargetType marketingTargetType) {
    this.marketingTargetType = marketingTargetType;
  }

  public ProfilesAddRequest marketingCarrierId(String marketingCarrierId) {
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

  public ProfilesAddRequest profileType(ProfileType profileType) {
    this.profileType = profileType;
    return this;
  }

  /**
   * Get profileType
   *
   * @return profileType
   */
  @ApiModelProperty(value = "")
  public ProfileType getProfileType() {
    return profileType;
  }

  public void setProfileType(ProfileType profileType) {
    this.profileType = profileType;
  }

  public ProfilesAddRequest headImageId(String headImageId) {
    this.headImageId = headImageId;
    return this;
  }

  /**
   * Get headImageId
   *
   * @return headImageId
   */
  @ApiModelProperty(value = "")
  public String getHeadImageId() {
    return headImageId;
  }

  public void setHeadImageId(String headImageId) {
    this.headImageId = headImageId;
  }

  public ProfilesAddRequest profileName(String profileName) {
    this.profileName = profileName;
    return this;
  }

  /**
   * Get profileName
   *
   * @return profileName
   */
  @ApiModelProperty(value = "")
  public String getProfileName() {
    return profileName;
  }

  public void setProfileName(String profileName) {
    this.profileName = profileName;
  }

  public ProfilesAddRequest description(String description) {
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfilesAddRequest profilesAddRequest = (ProfilesAddRequest) o;
    return Objects.equals(this.accountId, profilesAddRequest.accountId)
        && Objects.equals(this.marketingGoal, profilesAddRequest.marketingGoal)
        && Objects.equals(this.marketingSubGoal, profilesAddRequest.marketingSubGoal)
        && Objects.equals(this.marketingCarrierType, profilesAddRequest.marketingCarrierType)
        && Objects.equals(this.marketingTargetType, profilesAddRequest.marketingTargetType)
        && Objects.equals(this.marketingCarrierId, profilesAddRequest.marketingCarrierId)
        && Objects.equals(this.profileType, profilesAddRequest.profileType)
        && Objects.equals(this.headImageId, profilesAddRequest.headImageId)
        && Objects.equals(this.profileName, profilesAddRequest.profileName)
        && Objects.equals(this.description, profilesAddRequest.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        marketingGoal,
        marketingSubGoal,
        marketingCarrierType,
        marketingTargetType,
        marketingCarrierId,
        profileType,
        headImageId,
        profileName,
        description);
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

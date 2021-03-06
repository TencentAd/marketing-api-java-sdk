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

/** ShopUpdateRequest */
public class ShopUpdateRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("adgroup_id")
  private Long adgroupId = null;

  @SerializedName("adgroup")
  private AdgroupUpdateSpec adgroup = null;

  @SerializedName("campaign")
  private CampaignUpdateSpec campaign = null;

  @SerializedName("adcreative")
  private AdCreativeUpdateSpec adcreative = null;

  public ShopUpdateRequest accountId(Long accountId) {
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

  public ShopUpdateRequest adgroupId(Long adgroupId) {
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

  public ShopUpdateRequest adgroup(AdgroupUpdateSpec adgroup) {
    this.adgroup = adgroup;
    return this;
  }

  /**
   * Get adgroup
   *
   * @return adgroup
   */
  @ApiModelProperty(value = "")
  public AdgroupUpdateSpec getAdgroup() {
    return adgroup;
  }

  public void setAdgroup(AdgroupUpdateSpec adgroup) {
    this.adgroup = adgroup;
  }

  public ShopUpdateRequest campaign(CampaignUpdateSpec campaign) {
    this.campaign = campaign;
    return this;
  }

  /**
   * Get campaign
   *
   * @return campaign
   */
  @ApiModelProperty(value = "")
  public CampaignUpdateSpec getCampaign() {
    return campaign;
  }

  public void setCampaign(CampaignUpdateSpec campaign) {
    this.campaign = campaign;
  }

  public ShopUpdateRequest adcreative(AdCreativeUpdateSpec adcreative) {
    this.adcreative = adcreative;
    return this;
  }

  /**
   * Get adcreative
   *
   * @return adcreative
   */
  @ApiModelProperty(value = "")
  public AdCreativeUpdateSpec getAdcreative() {
    return adcreative;
  }

  public void setAdcreative(AdCreativeUpdateSpec adcreative) {
    this.adcreative = adcreative;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopUpdateRequest shopUpdateRequest = (ShopUpdateRequest) o;
    return Objects.equals(this.accountId, shopUpdateRequest.accountId)
        && Objects.equals(this.adgroupId, shopUpdateRequest.adgroupId)
        && Objects.equals(this.adgroup, shopUpdateRequest.adgroup)
        && Objects.equals(this.campaign, shopUpdateRequest.campaign)
        && Objects.equals(this.adcreative, shopUpdateRequest.adcreative);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adgroupId, adgroup, campaign, adcreative);
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

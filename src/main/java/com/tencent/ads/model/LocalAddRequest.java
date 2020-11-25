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

/** LocalAddRequest */
public class LocalAddRequest {
  @SerializedName("adgroup")
  private AdgroupCreateSpec adgroup = null;

  @SerializedName("campaign")
  private CampaignCreateSpec campaign = null;

  @SerializedName("adcreative")
  private AdCreativeCreateSpec adcreative = null;

  public LocalAddRequest adgroup(AdgroupCreateSpec adgroup) {
    this.adgroup = adgroup;
    return this;
  }

  /**
   * Get adgroup
   *
   * @return adgroup
   */
  @ApiModelProperty(value = "")
  public AdgroupCreateSpec getAdgroup() {
    return adgroup;
  }

  public void setAdgroup(AdgroupCreateSpec adgroup) {
    this.adgroup = adgroup;
  }

  public LocalAddRequest campaign(CampaignCreateSpec campaign) {
    this.campaign = campaign;
    return this;
  }

  /**
   * Get campaign
   *
   * @return campaign
   */
  @ApiModelProperty(value = "")
  public CampaignCreateSpec getCampaign() {
    return campaign;
  }

  public void setCampaign(CampaignCreateSpec campaign) {
    this.campaign = campaign;
  }

  public LocalAddRequest adcreative(AdCreativeCreateSpec adcreative) {
    this.adcreative = adcreative;
    return this;
  }

  /**
   * Get adcreative
   *
   * @return adcreative
   */
  @ApiModelProperty(value = "")
  public AdCreativeCreateSpec getAdcreative() {
    return adcreative;
  }

  public void setAdcreative(AdCreativeCreateSpec adcreative) {
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
    LocalAddRequest localAddRequest = (LocalAddRequest) o;
    return Objects.equals(this.adgroup, localAddRequest.adgroup)
        && Objects.equals(this.campaign, localAddRequest.campaign)
        && Objects.equals(this.adcreative, localAddRequest.adcreative);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adgroup, campaign, adcreative);
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

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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** */
@ApiModel(description = "")
public class MarketingAssetOuterSpecV1 {
  @SerializedName("marketing_asset_outer_id")
  private String marketingAssetOuterId = null;

  @SerializedName("marketing_target_type")
  private String marketingTargetType = null;

  public MarketingAssetOuterSpecV1 marketingAssetOuterId(String marketingAssetOuterId) {
    this.marketingAssetOuterId = marketingAssetOuterId;
    return this;
  }

  /**
   * Get marketingAssetOuterId
   *
   * @return marketingAssetOuterId
   */
  @ApiModelProperty(value = "")
  public String getMarketingAssetOuterId() {
    return marketingAssetOuterId;
  }

  public void setMarketingAssetOuterId(String marketingAssetOuterId) {
    this.marketingAssetOuterId = marketingAssetOuterId;
  }

  public MarketingAssetOuterSpecV1 marketingTargetType(String marketingTargetType) {
    this.marketingTargetType = marketingTargetType;
    return this;
  }

  /**
   * Get marketingTargetType
   *
   * @return marketingTargetType
   */
  @ApiModelProperty(value = "")
  public String getMarketingTargetType() {
    return marketingTargetType;
  }

  public void setMarketingTargetType(String marketingTargetType) {
    this.marketingTargetType = marketingTargetType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketingAssetOuterSpecV1 marketingAssetOuterSpecV1 = (MarketingAssetOuterSpecV1) o;
    return Objects.equals(
            this.marketingAssetOuterId, marketingAssetOuterSpecV1.marketingAssetOuterId)
        && Objects.equals(this.marketingTargetType, marketingAssetOuterSpecV1.marketingTargetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketingAssetOuterId, marketingTargetType);
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

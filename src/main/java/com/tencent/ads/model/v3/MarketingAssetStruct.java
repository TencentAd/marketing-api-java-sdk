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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** 推广资产信息 */
@ApiModel(description = "推广资产信息")
public class MarketingAssetStruct {
  @SerializedName("marketing_asset_id")
  private Long marketingAssetId = null;

  @SerializedName("marketing_asset_name")
  private String marketingAssetName = null;

  @SerializedName("marketing_asset_type")
  private MarketingAssetType marketingAssetType = null;

  @SerializedName("created_time")
  private Long createdTime = null;

  @SerializedName("is_deleted")
  private Boolean isDeleted = null;

  @SerializedName("properties")
  private List<PropertyStruct> properties = null;

  public MarketingAssetStruct marketingAssetId(Long marketingAssetId) {
    this.marketingAssetId = marketingAssetId;
    return this;
  }

  /**
   * Get marketingAssetId
   *
   * @return marketingAssetId
   */
  @ApiModelProperty(value = "")
  public Long getMarketingAssetId() {
    return marketingAssetId;
  }

  public void setMarketingAssetId(Long marketingAssetId) {
    this.marketingAssetId = marketingAssetId;
  }

  public MarketingAssetStruct marketingAssetName(String marketingAssetName) {
    this.marketingAssetName = marketingAssetName;
    return this;
  }

  /**
   * Get marketingAssetName
   *
   * @return marketingAssetName
   */
  @ApiModelProperty(value = "")
  public String getMarketingAssetName() {
    return marketingAssetName;
  }

  public void setMarketingAssetName(String marketingAssetName) {
    this.marketingAssetName = marketingAssetName;
  }

  public MarketingAssetStruct marketingAssetType(MarketingAssetType marketingAssetType) {
    this.marketingAssetType = marketingAssetType;
    return this;
  }

  /**
   * Get marketingAssetType
   *
   * @return marketingAssetType
   */
  @ApiModelProperty(value = "")
  public MarketingAssetType getMarketingAssetType() {
    return marketingAssetType;
  }

  public void setMarketingAssetType(MarketingAssetType marketingAssetType) {
    this.marketingAssetType = marketingAssetType;
  }

  public MarketingAssetStruct createdTime(Long createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   *
   * @return createdTime
   */
  @ApiModelProperty(value = "")
  public Long getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Long createdTime) {
    this.createdTime = createdTime;
  }

  public MarketingAssetStruct isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Get isDeleted
   *
   * @return isDeleted
   */
  @ApiModelProperty(value = "")
  public Boolean isIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public MarketingAssetStruct properties(List<PropertyStruct> properties) {
    this.properties = properties;
    return this;
  }

  public MarketingAssetStruct addPropertiesItem(PropertyStruct propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<PropertyStruct>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

  /**
   * Get properties
   *
   * @return properties
   */
  @ApiModelProperty(value = "")
  public List<PropertyStruct> getProperties() {
    return properties;
  }

  public void setProperties(List<PropertyStruct> properties) {
    this.properties = properties;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketingAssetStruct marketingAssetStruct = (MarketingAssetStruct) o;
    return Objects.equals(this.marketingAssetId, marketingAssetStruct.marketingAssetId)
        && Objects.equals(this.marketingAssetName, marketingAssetStruct.marketingAssetName)
        && Objects.equals(this.marketingAssetType, marketingAssetStruct.marketingAssetType)
        && Objects.equals(this.createdTime, marketingAssetStruct.createdTime)
        && Objects.equals(this.isDeleted, marketingAssetStruct.isDeleted)
        && Objects.equals(this.properties, marketingAssetStruct.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        marketingAssetId,
        marketingAssetName,
        marketingAssetType,
        createdTime,
        isDeleted,
        properties);
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

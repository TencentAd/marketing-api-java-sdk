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

/** 过滤条件 */
@ApiModel(description = "过滤条件")
public class ConversionLinkAssetStruct {
  @SerializedName("conversion_link_asset_id")
  private Long conversionLinkAssetId = null;

  @SerializedName("conversion_link_asset_name")
  private String conversionLinkAssetName = null;

  @SerializedName("conversion_link_asset_desc")
  private String conversionLinkAssetDesc = null;

  public ConversionLinkAssetStruct conversionLinkAssetId(Long conversionLinkAssetId) {
    this.conversionLinkAssetId = conversionLinkAssetId;
    return this;
  }

  /**
   * Get conversionLinkAssetId
   *
   * @return conversionLinkAssetId
   */
  @ApiModelProperty(value = "")
  public Long getConversionLinkAssetId() {
    return conversionLinkAssetId;
  }

  public void setConversionLinkAssetId(Long conversionLinkAssetId) {
    this.conversionLinkAssetId = conversionLinkAssetId;
  }

  public ConversionLinkAssetStruct conversionLinkAssetName(String conversionLinkAssetName) {
    this.conversionLinkAssetName = conversionLinkAssetName;
    return this;
  }

  /**
   * Get conversionLinkAssetName
   *
   * @return conversionLinkAssetName
   */
  @ApiModelProperty(value = "")
  public String getConversionLinkAssetName() {
    return conversionLinkAssetName;
  }

  public void setConversionLinkAssetName(String conversionLinkAssetName) {
    this.conversionLinkAssetName = conversionLinkAssetName;
  }

  public ConversionLinkAssetStruct conversionLinkAssetDesc(String conversionLinkAssetDesc) {
    this.conversionLinkAssetDesc = conversionLinkAssetDesc;
    return this;
  }

  /**
   * Get conversionLinkAssetDesc
   *
   * @return conversionLinkAssetDesc
   */
  @ApiModelProperty(value = "")
  public String getConversionLinkAssetDesc() {
    return conversionLinkAssetDesc;
  }

  public void setConversionLinkAssetDesc(String conversionLinkAssetDesc) {
    this.conversionLinkAssetDesc = conversionLinkAssetDesc;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionLinkAssetStruct conversionLinkAssetStruct = (ConversionLinkAssetStruct) o;
    return Objects.equals(
            this.conversionLinkAssetId, conversionLinkAssetStruct.conversionLinkAssetId)
        && Objects.equals(
            this.conversionLinkAssetName, conversionLinkAssetStruct.conversionLinkAssetName)
        && Objects.equals(
            this.conversionLinkAssetDesc, conversionLinkAssetStruct.conversionLinkAssetDesc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionLinkAssetId, conversionLinkAssetName, conversionLinkAssetDesc);
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

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

/** ConversionLinkAssetsAddResponseData */
public class ConversionLinkAssetsAddResponseData {
  @SerializedName("conversion_link_asset_id")
  private Long conversionLinkAssetId = null;

  public ConversionLinkAssetsAddResponseData conversionLinkAssetId(Long conversionLinkAssetId) {
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionLinkAssetsAddResponseData conversionLinkAssetsAddResponseData =
        (ConversionLinkAssetsAddResponseData) o;
    return Objects.equals(
        this.conversionLinkAssetId, conversionLinkAssetsAddResponseData.conversionLinkAssetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionLinkAssetId);
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

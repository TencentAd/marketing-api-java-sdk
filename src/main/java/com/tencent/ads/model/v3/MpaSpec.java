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

/** 动态商品广告属性 */
@ApiModel(description = "动态商品广告属性")
public class MpaSpec {
  @SerializedName("recommend_method_ids")
  private List<Long> recommendMethodIds = null;

  @SerializedName("product_catalog_id")
  private String productCatalogId = null;

  @SerializedName("product_series_id")
  private String productSeriesId = null;

  public MpaSpec recommendMethodIds(List<Long> recommendMethodIds) {
    this.recommendMethodIds = recommendMethodIds;
    return this;
  }

  public MpaSpec addRecommendMethodIdsItem(Long recommendMethodIdsItem) {
    if (this.recommendMethodIds == null) {
      this.recommendMethodIds = new ArrayList<Long>();
    }
    this.recommendMethodIds.add(recommendMethodIdsItem);
    return this;
  }

  /**
   * Get recommendMethodIds
   *
   * @return recommendMethodIds
   */
  @ApiModelProperty(value = "")
  public List<Long> getRecommendMethodIds() {
    return recommendMethodIds;
  }

  public void setRecommendMethodIds(List<Long> recommendMethodIds) {
    this.recommendMethodIds = recommendMethodIds;
  }

  public MpaSpec productCatalogId(String productCatalogId) {
    this.productCatalogId = productCatalogId;
    return this;
  }

  /**
   * Get productCatalogId
   *
   * @return productCatalogId
   */
  @ApiModelProperty(value = "")
  public String getProductCatalogId() {
    return productCatalogId;
  }

  public void setProductCatalogId(String productCatalogId) {
    this.productCatalogId = productCatalogId;
  }

  public MpaSpec productSeriesId(String productSeriesId) {
    this.productSeriesId = productSeriesId;
    return this;
  }

  /**
   * Get productSeriesId
   *
   * @return productSeriesId
   */
  @ApiModelProperty(value = "")
  public String getProductSeriesId() {
    return productSeriesId;
  }

  public void setProductSeriesId(String productSeriesId) {
    this.productSeriesId = productSeriesId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MpaSpec mpaSpec = (MpaSpec) o;
    return Objects.equals(this.recommendMethodIds, mpaSpec.recommendMethodIds)
        && Objects.equals(this.productCatalogId, mpaSpec.productCatalogId)
        && Objects.equals(this.productSeriesId, mpaSpec.productSeriesId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recommendMethodIds, productCatalogId, productSeriesId);
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

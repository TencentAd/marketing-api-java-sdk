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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** custom_audience洞察分析结构 */
@ApiModel(description = "custom_audience洞察分析结构")
public class CustomAudienceInsights {
  @SerializedName("dimension_type")
  private DimensionType dimensionType = null;

  @SerializedName("match_rate")
  private Double matchRate = null;

  @SerializedName("distribution")
  private List<RangeDistribution> distribution = null;

  public CustomAudienceInsights dimensionType(DimensionType dimensionType) {
    this.dimensionType = dimensionType;
    return this;
  }

  /**
   * Get dimensionType
   *
   * @return dimensionType
   */
  @ApiModelProperty(value = "")
  public DimensionType getDimensionType() {
    return dimensionType;
  }

  public void setDimensionType(DimensionType dimensionType) {
    this.dimensionType = dimensionType;
  }

  public CustomAudienceInsights matchRate(Double matchRate) {
    this.matchRate = matchRate;
    return this;
  }

  /**
   * Get matchRate
   *
   * @return matchRate
   */
  @ApiModelProperty(value = "")
  public Double getMatchRate() {
    return matchRate;
  }

  public void setMatchRate(Double matchRate) {
    this.matchRate = matchRate;
  }

  public CustomAudienceInsights distribution(List<RangeDistribution> distribution) {
    this.distribution = distribution;
    return this;
  }

  public CustomAudienceInsights addDistributionItem(RangeDistribution distributionItem) {
    if (this.distribution == null) {
      this.distribution = new ArrayList<RangeDistribution>();
    }
    this.distribution.add(distributionItem);
    return this;
  }

  /**
   * Get distribution
   *
   * @return distribution
   */
  @ApiModelProperty(value = "")
  public List<RangeDistribution> getDistribution() {
    return distribution;
  }

  public void setDistribution(List<RangeDistribution> distribution) {
    this.distribution = distribution;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomAudienceInsights customAudienceInsights = (CustomAudienceInsights) o;
    return Objects.equals(this.dimensionType, customAudienceInsights.dimensionType)
        && Objects.equals(this.matchRate, customAudienceInsights.matchRate)
        && Objects.equals(this.distribution, customAudienceInsights.distribution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimensionType, matchRate, distribution);
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

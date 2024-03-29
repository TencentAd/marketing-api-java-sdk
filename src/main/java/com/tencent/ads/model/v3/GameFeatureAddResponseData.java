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

/** GameFeatureAddResponseData */
public class GameFeatureAddResponseData {
  @SerializedName("marketing_target_detail_id")
  private String marketingTargetDetailId = null;

  public GameFeatureAddResponseData marketingTargetDetailId(String marketingTargetDetailId) {
    this.marketingTargetDetailId = marketingTargetDetailId;
    return this;
  }

  /**
   * Get marketingTargetDetailId
   *
   * @return marketingTargetDetailId
   */
  @ApiModelProperty(value = "")
  public String getMarketingTargetDetailId() {
    return marketingTargetDetailId;
  }

  public void setMarketingTargetDetailId(String marketingTargetDetailId) {
    this.marketingTargetDetailId = marketingTargetDetailId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameFeatureAddResponseData gameFeatureAddResponseData = (GameFeatureAddResponseData) o;
    return Objects.equals(
        this.marketingTargetDetailId, gameFeatureAddResponseData.marketingTargetDetailId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketingTargetDetailId);
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

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
import java.util.Objects;

/** 整体曝光评估结果 */
@ApiModel(description = "整体曝光评估结果")
public class DiagnosisConclusionSpec {
  @SerializedName("time_range")
  private DiagnosisConclusionSpecTimeRange timeRange = null;

  @SerializedName("diagnosis_score")
  private Long diagnosisScore = null;

  @SerializedName("same_industry_rank")
  private Long sameIndustryRank = null;

  public DiagnosisConclusionSpec timeRange(DiagnosisConclusionSpecTimeRange timeRange) {
    this.timeRange = timeRange;
    return this;
  }

  /**
   * Get timeRange
   *
   * @return timeRange
   */
  @ApiModelProperty(value = "")
  public DiagnosisConclusionSpecTimeRange getTimeRange() {
    return timeRange;
  }

  public void setTimeRange(DiagnosisConclusionSpecTimeRange timeRange) {
    this.timeRange = timeRange;
  }

  public DiagnosisConclusionSpec diagnosisScore(Long diagnosisScore) {
    this.diagnosisScore = diagnosisScore;
    return this;
  }

  /**
   * Get diagnosisScore
   *
   * @return diagnosisScore
   */
  @ApiModelProperty(value = "")
  public Long getDiagnosisScore() {
    return diagnosisScore;
  }

  public void setDiagnosisScore(Long diagnosisScore) {
    this.diagnosisScore = diagnosisScore;
  }

  public DiagnosisConclusionSpec sameIndustryRank(Long sameIndustryRank) {
    this.sameIndustryRank = sameIndustryRank;
    return this;
  }

  /**
   * Get sameIndustryRank
   *
   * @return sameIndustryRank
   */
  @ApiModelProperty(value = "")
  public Long getSameIndustryRank() {
    return sameIndustryRank;
  }

  public void setSameIndustryRank(Long sameIndustryRank) {
    this.sameIndustryRank = sameIndustryRank;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiagnosisConclusionSpec diagnosisConclusionSpec = (DiagnosisConclusionSpec) o;
    return Objects.equals(this.timeRange, diagnosisConclusionSpec.timeRange)
        && Objects.equals(this.diagnosisScore, diagnosisConclusionSpec.diagnosisScore)
        && Objects.equals(this.sameIndustryRank, diagnosisConclusionSpec.sameIndustryRank);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeRange, diagnosisScore, sameIndustryRank);
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

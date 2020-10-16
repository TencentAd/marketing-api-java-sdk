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

/** 点击率水平 */
@ApiModel(description = "点击率水平")
public class CtrLevelStruct {
  @SerializedName("value")
  private String value = null;

  @SerializedName("score")
  private String score = null;

  @SerializedName("rank_overall")
  private String rankOverall = null;

  @SerializedName("rank_first_category")
  private String rankFirstCategory = null;

  @SerializedName("rank_second_category")
  private String rankSecondCategory = null;

  @SerializedName("self_trends")
  private List<String> selfTrends = null;

  @SerializedName("benchmark_trends")
  private List<String> benchmarkTrends = null;

  public CtrLevelStruct value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   *
   * @return value
   */
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public CtrLevelStruct score(String score) {
    this.score = score;
    return this;
  }

  /**
   * Get score
   *
   * @return score
   */
  @ApiModelProperty(value = "")
  public String getScore() {
    return score;
  }

  public void setScore(String score) {
    this.score = score;
  }

  public CtrLevelStruct rankOverall(String rankOverall) {
    this.rankOverall = rankOverall;
    return this;
  }

  /**
   * Get rankOverall
   *
   * @return rankOverall
   */
  @ApiModelProperty(value = "")
  public String getRankOverall() {
    return rankOverall;
  }

  public void setRankOverall(String rankOverall) {
    this.rankOverall = rankOverall;
  }

  public CtrLevelStruct rankFirstCategory(String rankFirstCategory) {
    this.rankFirstCategory = rankFirstCategory;
    return this;
  }

  /**
   * Get rankFirstCategory
   *
   * @return rankFirstCategory
   */
  @ApiModelProperty(value = "")
  public String getRankFirstCategory() {
    return rankFirstCategory;
  }

  public void setRankFirstCategory(String rankFirstCategory) {
    this.rankFirstCategory = rankFirstCategory;
  }

  public CtrLevelStruct rankSecondCategory(String rankSecondCategory) {
    this.rankSecondCategory = rankSecondCategory;
    return this;
  }

  /**
   * Get rankSecondCategory
   *
   * @return rankSecondCategory
   */
  @ApiModelProperty(value = "")
  public String getRankSecondCategory() {
    return rankSecondCategory;
  }

  public void setRankSecondCategory(String rankSecondCategory) {
    this.rankSecondCategory = rankSecondCategory;
  }

  public CtrLevelStruct selfTrends(List<String> selfTrends) {
    this.selfTrends = selfTrends;
    return this;
  }

  public CtrLevelStruct addSelfTrendsItem(String selfTrendsItem) {
    if (this.selfTrends == null) {
      this.selfTrends = new ArrayList<String>();
    }
    this.selfTrends.add(selfTrendsItem);
    return this;
  }

  /**
   * Get selfTrends
   *
   * @return selfTrends
   */
  @ApiModelProperty(value = "")
  public List<String> getSelfTrends() {
    return selfTrends;
  }

  public void setSelfTrends(List<String> selfTrends) {
    this.selfTrends = selfTrends;
  }

  public CtrLevelStruct benchmarkTrends(List<String> benchmarkTrends) {
    this.benchmarkTrends = benchmarkTrends;
    return this;
  }

  public CtrLevelStruct addBenchmarkTrendsItem(String benchmarkTrendsItem) {
    if (this.benchmarkTrends == null) {
      this.benchmarkTrends = new ArrayList<String>();
    }
    this.benchmarkTrends.add(benchmarkTrendsItem);
    return this;
  }

  /**
   * Get benchmarkTrends
   *
   * @return benchmarkTrends
   */
  @ApiModelProperty(value = "")
  public List<String> getBenchmarkTrends() {
    return benchmarkTrends;
  }

  public void setBenchmarkTrends(List<String> benchmarkTrends) {
    this.benchmarkTrends = benchmarkTrends;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CtrLevelStruct ctrLevelStruct = (CtrLevelStruct) o;
    return Objects.equals(this.value, ctrLevelStruct.value)
        && Objects.equals(this.score, ctrLevelStruct.score)
        && Objects.equals(this.rankOverall, ctrLevelStruct.rankOverall)
        && Objects.equals(this.rankFirstCategory, ctrLevelStruct.rankFirstCategory)
        && Objects.equals(this.rankSecondCategory, ctrLevelStruct.rankSecondCategory)
        && Objects.equals(this.selfTrends, ctrLevelStruct.selfTrends)
        && Objects.equals(this.benchmarkTrends, ctrLevelStruct.benchmarkTrends);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        value,
        score,
        rankOverall,
        rankFirstCategory,
        rankSecondCategory,
        selfTrends,
        benchmarkTrends);
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

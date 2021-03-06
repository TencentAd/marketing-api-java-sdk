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

/** 单个广告的诊断明细 */
@ApiModel(description = "单个广告的诊断明细")
public class BatchAdDiagnosisListItem {
  @SerializedName("adgroup_id")
  private Long adgroupId = null;

  @SerializedName("diagnose_time")
  private String diagnoseTime = null;

  @SerializedName("operate_suggestion")
  private OperateSuggestion operateSuggestion = null;

  @SerializedName("learning_status")
  private LearningStatus learningStatus = null;

  @SerializedName("cost_guarantee_status")
  private CostGuaranteeStatus costGuaranteeStatus = null;

  @SerializedName("cost_guarantee_money")
  private Long costGuaranteeMoney = null;

  @SerializedName("exposure_compete_score")
  private String exposureCompeteScore = null;

  @SerializedName("exposure_raise_rate")
  private String exposureRaiseRate = null;

  @SerializedName("cpa_bias_today")
  private String cpaBiasToday = null;

  @SerializedName("cpa_bias_overall")
  private String cpaBiasOverall = null;

  @SerializedName("is_ocpx")
  private Boolean isOcpx = null;

  @SerializedName("optimization_goal")
  private String optimizationGoal = null;

  @SerializedName("deep_optimization_goal")
  private String deepOptimizationGoal = null;

  @SerializedName("conclusion_description")
  private String conclusionDescription = null;

  @SerializedName("has_diagnose_detail")
  private Boolean hasDiagnoseDetail = null;

  @SerializedName("operate_suggestion_desc")
  private String operateSuggestionDesc = null;

  @SerializedName("learning_status_desc")
  private String learningStatusDesc = null;

  @SerializedName("exposure_compete_score_desc")
  private String exposureCompeteScoreDesc = null;

  @SerializedName("detail")
  private ResponseDetailStruct detail = null;

  @SerializedName("auto_acquisition_status")
  private AutoAcquisitionStatus autoAcquisitionStatus = null;

  @SerializedName("auto_acquisition_status_name")
  private String autoAcquisitionStatusName = null;

  @SerializedName("auto_acquisition_status_desc")
  private String autoAcquisitionStatusDesc = null;

  @SerializedName("auto_acquisition_begin_time")
  private String autoAcquisitionBeginTime = null;

  @SerializedName("auto_acquisition_end_time")
  private String autoAcquisitionEndTime = null;

  @SerializedName("is_potential")
  private Boolean isPotential = null;

  @SerializedName("potential_detail")
  private ResponsePotentialStruct potentialDetail = null;

  public BatchAdDiagnosisListItem adgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
    return this;
  }

  /**
   * Get adgroupId
   *
   * @return adgroupId
   */
  @ApiModelProperty(value = "")
  public Long getAdgroupId() {
    return adgroupId;
  }

  public void setAdgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
  }

  public BatchAdDiagnosisListItem diagnoseTime(String diagnoseTime) {
    this.diagnoseTime = diagnoseTime;
    return this;
  }

  /**
   * Get diagnoseTime
   *
   * @return diagnoseTime
   */
  @ApiModelProperty(value = "")
  public String getDiagnoseTime() {
    return diagnoseTime;
  }

  public void setDiagnoseTime(String diagnoseTime) {
    this.diagnoseTime = diagnoseTime;
  }

  public BatchAdDiagnosisListItem operateSuggestion(OperateSuggestion operateSuggestion) {
    this.operateSuggestion = operateSuggestion;
    return this;
  }

  /**
   * Get operateSuggestion
   *
   * @return operateSuggestion
   */
  @ApiModelProperty(value = "")
  public OperateSuggestion getOperateSuggestion() {
    return operateSuggestion;
  }

  public void setOperateSuggestion(OperateSuggestion operateSuggestion) {
    this.operateSuggestion = operateSuggestion;
  }

  public BatchAdDiagnosisListItem learningStatus(LearningStatus learningStatus) {
    this.learningStatus = learningStatus;
    return this;
  }

  /**
   * Get learningStatus
   *
   * @return learningStatus
   */
  @ApiModelProperty(value = "")
  public LearningStatus getLearningStatus() {
    return learningStatus;
  }

  public void setLearningStatus(LearningStatus learningStatus) {
    this.learningStatus = learningStatus;
  }

  public BatchAdDiagnosisListItem costGuaranteeStatus(CostGuaranteeStatus costGuaranteeStatus) {
    this.costGuaranteeStatus = costGuaranteeStatus;
    return this;
  }

  /**
   * Get costGuaranteeStatus
   *
   * @return costGuaranteeStatus
   */
  @ApiModelProperty(value = "")
  public CostGuaranteeStatus getCostGuaranteeStatus() {
    return costGuaranteeStatus;
  }

  public void setCostGuaranteeStatus(CostGuaranteeStatus costGuaranteeStatus) {
    this.costGuaranteeStatus = costGuaranteeStatus;
  }

  public BatchAdDiagnosisListItem costGuaranteeMoney(Long costGuaranteeMoney) {
    this.costGuaranteeMoney = costGuaranteeMoney;
    return this;
  }

  /**
   * Get costGuaranteeMoney
   *
   * @return costGuaranteeMoney
   */
  @ApiModelProperty(value = "")
  public Long getCostGuaranteeMoney() {
    return costGuaranteeMoney;
  }

  public void setCostGuaranteeMoney(Long costGuaranteeMoney) {
    this.costGuaranteeMoney = costGuaranteeMoney;
  }

  public BatchAdDiagnosisListItem exposureCompeteScore(String exposureCompeteScore) {
    this.exposureCompeteScore = exposureCompeteScore;
    return this;
  }

  /**
   * Get exposureCompeteScore
   *
   * @return exposureCompeteScore
   */
  @ApiModelProperty(value = "")
  public String getExposureCompeteScore() {
    return exposureCompeteScore;
  }

  public void setExposureCompeteScore(String exposureCompeteScore) {
    this.exposureCompeteScore = exposureCompeteScore;
  }

  public BatchAdDiagnosisListItem exposureRaiseRate(String exposureRaiseRate) {
    this.exposureRaiseRate = exposureRaiseRate;
    return this;
  }

  /**
   * Get exposureRaiseRate
   *
   * @return exposureRaiseRate
   */
  @ApiModelProperty(value = "")
  public String getExposureRaiseRate() {
    return exposureRaiseRate;
  }

  public void setExposureRaiseRate(String exposureRaiseRate) {
    this.exposureRaiseRate = exposureRaiseRate;
  }

  public BatchAdDiagnosisListItem cpaBiasToday(String cpaBiasToday) {
    this.cpaBiasToday = cpaBiasToday;
    return this;
  }

  /**
   * Get cpaBiasToday
   *
   * @return cpaBiasToday
   */
  @ApiModelProperty(value = "")
  public String getCpaBiasToday() {
    return cpaBiasToday;
  }

  public void setCpaBiasToday(String cpaBiasToday) {
    this.cpaBiasToday = cpaBiasToday;
  }

  public BatchAdDiagnosisListItem cpaBiasOverall(String cpaBiasOverall) {
    this.cpaBiasOverall = cpaBiasOverall;
    return this;
  }

  /**
   * Get cpaBiasOverall
   *
   * @return cpaBiasOverall
   */
  @ApiModelProperty(value = "")
  public String getCpaBiasOverall() {
    return cpaBiasOverall;
  }

  public void setCpaBiasOverall(String cpaBiasOverall) {
    this.cpaBiasOverall = cpaBiasOverall;
  }

  public BatchAdDiagnosisListItem isOcpx(Boolean isOcpx) {
    this.isOcpx = isOcpx;
    return this;
  }

  /**
   * Get isOcpx
   *
   * @return isOcpx
   */
  @ApiModelProperty(value = "")
  public Boolean isIsOcpx() {
    return isOcpx;
  }

  public void setIsOcpx(Boolean isOcpx) {
    this.isOcpx = isOcpx;
  }

  public BatchAdDiagnosisListItem optimizationGoal(String optimizationGoal) {
    this.optimizationGoal = optimizationGoal;
    return this;
  }

  /**
   * Get optimizationGoal
   *
   * @return optimizationGoal
   */
  @ApiModelProperty(value = "")
  public String getOptimizationGoal() {
    return optimizationGoal;
  }

  public void setOptimizationGoal(String optimizationGoal) {
    this.optimizationGoal = optimizationGoal;
  }

  public BatchAdDiagnosisListItem deepOptimizationGoal(String deepOptimizationGoal) {
    this.deepOptimizationGoal = deepOptimizationGoal;
    return this;
  }

  /**
   * Get deepOptimizationGoal
   *
   * @return deepOptimizationGoal
   */
  @ApiModelProperty(value = "")
  public String getDeepOptimizationGoal() {
    return deepOptimizationGoal;
  }

  public void setDeepOptimizationGoal(String deepOptimizationGoal) {
    this.deepOptimizationGoal = deepOptimizationGoal;
  }

  public BatchAdDiagnosisListItem conclusionDescription(String conclusionDescription) {
    this.conclusionDescription = conclusionDescription;
    return this;
  }

  /**
   * Get conclusionDescription
   *
   * @return conclusionDescription
   */
  @ApiModelProperty(value = "")
  public String getConclusionDescription() {
    return conclusionDescription;
  }

  public void setConclusionDescription(String conclusionDescription) {
    this.conclusionDescription = conclusionDescription;
  }

  public BatchAdDiagnosisListItem hasDiagnoseDetail(Boolean hasDiagnoseDetail) {
    this.hasDiagnoseDetail = hasDiagnoseDetail;
    return this;
  }

  /**
   * Get hasDiagnoseDetail
   *
   * @return hasDiagnoseDetail
   */
  @ApiModelProperty(value = "")
  public Boolean isHasDiagnoseDetail() {
    return hasDiagnoseDetail;
  }

  public void setHasDiagnoseDetail(Boolean hasDiagnoseDetail) {
    this.hasDiagnoseDetail = hasDiagnoseDetail;
  }

  public BatchAdDiagnosisListItem operateSuggestionDesc(String operateSuggestionDesc) {
    this.operateSuggestionDesc = operateSuggestionDesc;
    return this;
  }

  /**
   * Get operateSuggestionDesc
   *
   * @return operateSuggestionDesc
   */
  @ApiModelProperty(value = "")
  public String getOperateSuggestionDesc() {
    return operateSuggestionDesc;
  }

  public void setOperateSuggestionDesc(String operateSuggestionDesc) {
    this.operateSuggestionDesc = operateSuggestionDesc;
  }

  public BatchAdDiagnosisListItem learningStatusDesc(String learningStatusDesc) {
    this.learningStatusDesc = learningStatusDesc;
    return this;
  }

  /**
   * Get learningStatusDesc
   *
   * @return learningStatusDesc
   */
  @ApiModelProperty(value = "")
  public String getLearningStatusDesc() {
    return learningStatusDesc;
  }

  public void setLearningStatusDesc(String learningStatusDesc) {
    this.learningStatusDesc = learningStatusDesc;
  }

  public BatchAdDiagnosisListItem exposureCompeteScoreDesc(String exposureCompeteScoreDesc) {
    this.exposureCompeteScoreDesc = exposureCompeteScoreDesc;
    return this;
  }

  /**
   * Get exposureCompeteScoreDesc
   *
   * @return exposureCompeteScoreDesc
   */
  @ApiModelProperty(value = "")
  public String getExposureCompeteScoreDesc() {
    return exposureCompeteScoreDesc;
  }

  public void setExposureCompeteScoreDesc(String exposureCompeteScoreDesc) {
    this.exposureCompeteScoreDesc = exposureCompeteScoreDesc;
  }

  public BatchAdDiagnosisListItem detail(ResponseDetailStruct detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Get detail
   *
   * @return detail
   */
  @ApiModelProperty(value = "")
  public ResponseDetailStruct getDetail() {
    return detail;
  }

  public void setDetail(ResponseDetailStruct detail) {
    this.detail = detail;
  }

  public BatchAdDiagnosisListItem autoAcquisitionStatus(
      AutoAcquisitionStatus autoAcquisitionStatus) {
    this.autoAcquisitionStatus = autoAcquisitionStatus;
    return this;
  }

  /**
   * Get autoAcquisitionStatus
   *
   * @return autoAcquisitionStatus
   */
  @ApiModelProperty(value = "")
  public AutoAcquisitionStatus getAutoAcquisitionStatus() {
    return autoAcquisitionStatus;
  }

  public void setAutoAcquisitionStatus(AutoAcquisitionStatus autoAcquisitionStatus) {
    this.autoAcquisitionStatus = autoAcquisitionStatus;
  }

  public BatchAdDiagnosisListItem autoAcquisitionStatusName(String autoAcquisitionStatusName) {
    this.autoAcquisitionStatusName = autoAcquisitionStatusName;
    return this;
  }

  /**
   * Get autoAcquisitionStatusName
   *
   * @return autoAcquisitionStatusName
   */
  @ApiModelProperty(value = "")
  public String getAutoAcquisitionStatusName() {
    return autoAcquisitionStatusName;
  }

  public void setAutoAcquisitionStatusName(String autoAcquisitionStatusName) {
    this.autoAcquisitionStatusName = autoAcquisitionStatusName;
  }

  public BatchAdDiagnosisListItem autoAcquisitionStatusDesc(String autoAcquisitionStatusDesc) {
    this.autoAcquisitionStatusDesc = autoAcquisitionStatusDesc;
    return this;
  }

  /**
   * Get autoAcquisitionStatusDesc
   *
   * @return autoAcquisitionStatusDesc
   */
  @ApiModelProperty(value = "")
  public String getAutoAcquisitionStatusDesc() {
    return autoAcquisitionStatusDesc;
  }

  public void setAutoAcquisitionStatusDesc(String autoAcquisitionStatusDesc) {
    this.autoAcquisitionStatusDesc = autoAcquisitionStatusDesc;
  }

  public BatchAdDiagnosisListItem autoAcquisitionBeginTime(String autoAcquisitionBeginTime) {
    this.autoAcquisitionBeginTime = autoAcquisitionBeginTime;
    return this;
  }

  /**
   * Get autoAcquisitionBeginTime
   *
   * @return autoAcquisitionBeginTime
   */
  @ApiModelProperty(value = "")
  public String getAutoAcquisitionBeginTime() {
    return autoAcquisitionBeginTime;
  }

  public void setAutoAcquisitionBeginTime(String autoAcquisitionBeginTime) {
    this.autoAcquisitionBeginTime = autoAcquisitionBeginTime;
  }

  public BatchAdDiagnosisListItem autoAcquisitionEndTime(String autoAcquisitionEndTime) {
    this.autoAcquisitionEndTime = autoAcquisitionEndTime;
    return this;
  }

  /**
   * Get autoAcquisitionEndTime
   *
   * @return autoAcquisitionEndTime
   */
  @ApiModelProperty(value = "")
  public String getAutoAcquisitionEndTime() {
    return autoAcquisitionEndTime;
  }

  public void setAutoAcquisitionEndTime(String autoAcquisitionEndTime) {
    this.autoAcquisitionEndTime = autoAcquisitionEndTime;
  }

  public BatchAdDiagnosisListItem isPotential(Boolean isPotential) {
    this.isPotential = isPotential;
    return this;
  }

  /**
   * Get isPotential
   *
   * @return isPotential
   */
  @ApiModelProperty(value = "")
  public Boolean isIsPotential() {
    return isPotential;
  }

  public void setIsPotential(Boolean isPotential) {
    this.isPotential = isPotential;
  }

  public BatchAdDiagnosisListItem potentialDetail(ResponsePotentialStruct potentialDetail) {
    this.potentialDetail = potentialDetail;
    return this;
  }

  /**
   * Get potentialDetail
   *
   * @return potentialDetail
   */
  @ApiModelProperty(value = "")
  public ResponsePotentialStruct getPotentialDetail() {
    return potentialDetail;
  }

  public void setPotentialDetail(ResponsePotentialStruct potentialDetail) {
    this.potentialDetail = potentialDetail;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchAdDiagnosisListItem batchAdDiagnosisListItem = (BatchAdDiagnosisListItem) o;
    return Objects.equals(this.adgroupId, batchAdDiagnosisListItem.adgroupId)
        && Objects.equals(this.diagnoseTime, batchAdDiagnosisListItem.diagnoseTime)
        && Objects.equals(this.operateSuggestion, batchAdDiagnosisListItem.operateSuggestion)
        && Objects.equals(this.learningStatus, batchAdDiagnosisListItem.learningStatus)
        && Objects.equals(this.costGuaranteeStatus, batchAdDiagnosisListItem.costGuaranteeStatus)
        && Objects.equals(this.costGuaranteeMoney, batchAdDiagnosisListItem.costGuaranteeMoney)
        && Objects.equals(this.exposureCompeteScore, batchAdDiagnosisListItem.exposureCompeteScore)
        && Objects.equals(this.exposureRaiseRate, batchAdDiagnosisListItem.exposureRaiseRate)
        && Objects.equals(this.cpaBiasToday, batchAdDiagnosisListItem.cpaBiasToday)
        && Objects.equals(this.cpaBiasOverall, batchAdDiagnosisListItem.cpaBiasOverall)
        && Objects.equals(this.isOcpx, batchAdDiagnosisListItem.isOcpx)
        && Objects.equals(this.optimizationGoal, batchAdDiagnosisListItem.optimizationGoal)
        && Objects.equals(this.deepOptimizationGoal, batchAdDiagnosisListItem.deepOptimizationGoal)
        && Objects.equals(
            this.conclusionDescription, batchAdDiagnosisListItem.conclusionDescription)
        && Objects.equals(this.hasDiagnoseDetail, batchAdDiagnosisListItem.hasDiagnoseDetail)
        && Objects.equals(
            this.operateSuggestionDesc, batchAdDiagnosisListItem.operateSuggestionDesc)
        && Objects.equals(this.learningStatusDesc, batchAdDiagnosisListItem.learningStatusDesc)
        && Objects.equals(
            this.exposureCompeteScoreDesc, batchAdDiagnosisListItem.exposureCompeteScoreDesc)
        && Objects.equals(this.detail, batchAdDiagnosisListItem.detail)
        && Objects.equals(
            this.autoAcquisitionStatus, batchAdDiagnosisListItem.autoAcquisitionStatus)
        && Objects.equals(
            this.autoAcquisitionStatusName, batchAdDiagnosisListItem.autoAcquisitionStatusName)
        && Objects.equals(
            this.autoAcquisitionStatusDesc, batchAdDiagnosisListItem.autoAcquisitionStatusDesc)
        && Objects.equals(
            this.autoAcquisitionBeginTime, batchAdDiagnosisListItem.autoAcquisitionBeginTime)
        && Objects.equals(
            this.autoAcquisitionEndTime, batchAdDiagnosisListItem.autoAcquisitionEndTime)
        && Objects.equals(this.isPotential, batchAdDiagnosisListItem.isPotential)
        && Objects.equals(this.potentialDetail, batchAdDiagnosisListItem.potentialDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        adgroupId,
        diagnoseTime,
        operateSuggestion,
        learningStatus,
        costGuaranteeStatus,
        costGuaranteeMoney,
        exposureCompeteScore,
        exposureRaiseRate,
        cpaBiasToday,
        cpaBiasOverall,
        isOcpx,
        optimizationGoal,
        deepOptimizationGoal,
        conclusionDescription,
        hasDiagnoseDetail,
        operateSuggestionDesc,
        learningStatusDesc,
        exposureCompeteScoreDesc,
        detail,
        autoAcquisitionStatus,
        autoAcquisitionStatusName,
        autoAcquisitionStatusDesc,
        autoAcquisitionBeginTime,
        autoAcquisitionEndTime,
        isPotential,
        potentialDetail);
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

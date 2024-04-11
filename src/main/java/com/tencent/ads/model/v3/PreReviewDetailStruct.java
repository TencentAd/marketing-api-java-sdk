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

/** 元素预审结果明细 */
@ApiModel(description = "元素预审结果明细")
public class PreReviewDetailStruct {
  @SerializedName("site_set")
  private PreReviewSiteSetDefinitionString siteSet = null;

  @SerializedName("pre_review_result")
  private GroupRiskLevel preReviewResult = null;

  @SerializedName("reject_reason_detail")
  private List<RejectReasonDetailStruct> rejectReasonDetail = null;

  public PreReviewDetailStruct siteSet(PreReviewSiteSetDefinitionString siteSet) {
    this.siteSet = siteSet;
    return this;
  }

  /**
   * Get siteSet
   *
   * @return siteSet
   */
  @ApiModelProperty(value = "")
  public PreReviewSiteSetDefinitionString getSiteSet() {
    return siteSet;
  }

  public void setSiteSet(PreReviewSiteSetDefinitionString siteSet) {
    this.siteSet = siteSet;
  }

  public PreReviewDetailStruct preReviewResult(GroupRiskLevel preReviewResult) {
    this.preReviewResult = preReviewResult;
    return this;
  }

  /**
   * Get preReviewResult
   *
   * @return preReviewResult
   */
  @ApiModelProperty(value = "")
  public GroupRiskLevel getPreReviewResult() {
    return preReviewResult;
  }

  public void setPreReviewResult(GroupRiskLevel preReviewResult) {
    this.preReviewResult = preReviewResult;
  }

  public PreReviewDetailStruct rejectReasonDetail(
      List<RejectReasonDetailStruct> rejectReasonDetail) {
    this.rejectReasonDetail = rejectReasonDetail;
    return this;
  }

  public PreReviewDetailStruct addRejectReasonDetailItem(
      RejectReasonDetailStruct rejectReasonDetailItem) {
    if (this.rejectReasonDetail == null) {
      this.rejectReasonDetail = new ArrayList<RejectReasonDetailStruct>();
    }
    this.rejectReasonDetail.add(rejectReasonDetailItem);
    return this;
  }

  /**
   * Get rejectReasonDetail
   *
   * @return rejectReasonDetail
   */
  @ApiModelProperty(value = "")
  public List<RejectReasonDetailStruct> getRejectReasonDetail() {
    return rejectReasonDetail;
  }

  public void setRejectReasonDetail(List<RejectReasonDetailStruct> rejectReasonDetail) {
    this.rejectReasonDetail = rejectReasonDetail;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreReviewDetailStruct preReviewDetailStruct = (PreReviewDetailStruct) o;
    return Objects.equals(this.siteSet, preReviewDetailStruct.siteSet)
        && Objects.equals(this.preReviewResult, preReviewDetailStruct.preReviewResult)
        && Objects.equals(this.rejectReasonDetail, preReviewDetailStruct.rejectReasonDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siteSet, preReviewResult, rejectReasonDetail);
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
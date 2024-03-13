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

/** 出价模拟结果 */
@ApiModel(description = "出价模拟结果")
public class BidSimulateResultItem {
  @SerializedName("bid")
  private Long bid = null;

  @SerializedName("expose_cnt")
  private Long exposeCnt = null;

  @SerializedName("click_cnt")
  private Long clickCnt = null;

  @SerializedName("conversion_cnt")
  private Long conversionCnt = null;

  public BidSimulateResultItem bid(Long bid) {
    this.bid = bid;
    return this;
  }

  /**
   * Get bid
   *
   * @return bid
   */
  @ApiModelProperty(value = "")
  public Long getBid() {
    return bid;
  }

  public void setBid(Long bid) {
    this.bid = bid;
  }

  public BidSimulateResultItem exposeCnt(Long exposeCnt) {
    this.exposeCnt = exposeCnt;
    return this;
  }

  /**
   * Get exposeCnt
   *
   * @return exposeCnt
   */
  @ApiModelProperty(value = "")
  public Long getExposeCnt() {
    return exposeCnt;
  }

  public void setExposeCnt(Long exposeCnt) {
    this.exposeCnt = exposeCnt;
  }

  public BidSimulateResultItem clickCnt(Long clickCnt) {
    this.clickCnt = clickCnt;
    return this;
  }

  /**
   * Get clickCnt
   *
   * @return clickCnt
   */
  @ApiModelProperty(value = "")
  public Long getClickCnt() {
    return clickCnt;
  }

  public void setClickCnt(Long clickCnt) {
    this.clickCnt = clickCnt;
  }

  public BidSimulateResultItem conversionCnt(Long conversionCnt) {
    this.conversionCnt = conversionCnt;
    return this;
  }

  /**
   * Get conversionCnt
   *
   * @return conversionCnt
   */
  @ApiModelProperty(value = "")
  public Long getConversionCnt() {
    return conversionCnt;
  }

  public void setConversionCnt(Long conversionCnt) {
    this.conversionCnt = conversionCnt;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BidSimulateResultItem bidSimulateResultItem = (BidSimulateResultItem) o;
    return Objects.equals(this.bid, bidSimulateResultItem.bid)
        && Objects.equals(this.exposeCnt, bidSimulateResultItem.exposeCnt)
        && Objects.equals(this.clickCnt, bidSimulateResultItem.clickCnt)
        && Objects.equals(this.conversionCnt, bidSimulateResultItem.conversionCnt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bid, exposeCnt, clickCnt, conversionCnt);
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

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

/** SubcustomerTransferAddResponseData */
public class SubcustomerTransferAddResponseData {
  @SerializedName("fund_type")
  private AccountTypeMap fundType = null;

  @SerializedName("amount")
  private Long amount = null;

  @SerializedName("external_bill_no")
  private String externalBillNo = null;

  @SerializedName("time")
  private Long time = null;

  @SerializedName("recommend_amount")
  private Long recommendAmount = null;

  public SubcustomerTransferAddResponseData fundType(AccountTypeMap fundType) {
    this.fundType = fundType;
    return this;
  }

  /**
   * Get fundType
   *
   * @return fundType
   */
  @ApiModelProperty(value = "")
  public AccountTypeMap getFundType() {
    return fundType;
  }

  public void setFundType(AccountTypeMap fundType) {
    this.fundType = fundType;
  }

  public SubcustomerTransferAddResponseData amount(Long amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   *
   * @return amount
   */
  @ApiModelProperty(value = "")
  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public SubcustomerTransferAddResponseData externalBillNo(String externalBillNo) {
    this.externalBillNo = externalBillNo;
    return this;
  }

  /**
   * Get externalBillNo
   *
   * @return externalBillNo
   */
  @ApiModelProperty(value = "")
  public String getExternalBillNo() {
    return externalBillNo;
  }

  public void setExternalBillNo(String externalBillNo) {
    this.externalBillNo = externalBillNo;
  }

  public SubcustomerTransferAddResponseData time(Long time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   *
   * @return time
   */
  @ApiModelProperty(value = "")
  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }

  public SubcustomerTransferAddResponseData recommendAmount(Long recommendAmount) {
    this.recommendAmount = recommendAmount;
    return this;
  }

  /**
   * Get recommendAmount
   *
   * @return recommendAmount
   */
  @ApiModelProperty(value = "")
  public Long getRecommendAmount() {
    return recommendAmount;
  }

  public void setRecommendAmount(Long recommendAmount) {
    this.recommendAmount = recommendAmount;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubcustomerTransferAddResponseData subcustomerTransferAddResponseData =
        (SubcustomerTransferAddResponseData) o;
    return Objects.equals(this.fundType, subcustomerTransferAddResponseData.fundType)
        && Objects.equals(this.amount, subcustomerTransferAddResponseData.amount)
        && Objects.equals(this.externalBillNo, subcustomerTransferAddResponseData.externalBillNo)
        && Objects.equals(this.time, subcustomerTransferAddResponseData.time)
        && Objects.equals(this.recommendAmount, subcustomerTransferAddResponseData.recommendAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundType, amount, externalBillNo, time, recommendAmount);
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

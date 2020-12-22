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
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** AgencyInnerTransferAddRequest */
public class AgencyInnerTransferAddRequest {
  @SerializedName("fund_type_from")
  private AccountTypeMapInnerTransfer fundTypeFrom = null;

  @SerializedName("fund_type_to")
  private AccountTypeMapInnerTransfer fundTypeTo = null;

  @SerializedName("amount")
  private Long amount = null;

  @SerializedName("external_bill_no")
  private String externalBillNo = null;

  @SerializedName("memo")
  private String memo = null;

  @SerializedName("account_id")
  private Long accountId = null;

  public AgencyInnerTransferAddRequest fundTypeFrom(AccountTypeMapInnerTransfer fundTypeFrom) {
    this.fundTypeFrom = fundTypeFrom;
    return this;
  }

  /**
   * Get fundTypeFrom
   *
   * @return fundTypeFrom
   */
  @ApiModelProperty(value = "")
  public AccountTypeMapInnerTransfer getFundTypeFrom() {
    return fundTypeFrom;
  }

  public void setFundTypeFrom(AccountTypeMapInnerTransfer fundTypeFrom) {
    this.fundTypeFrom = fundTypeFrom;
  }

  public AgencyInnerTransferAddRequest fundTypeTo(AccountTypeMapInnerTransfer fundTypeTo) {
    this.fundTypeTo = fundTypeTo;
    return this;
  }

  /**
   * Get fundTypeTo
   *
   * @return fundTypeTo
   */
  @ApiModelProperty(value = "")
  public AccountTypeMapInnerTransfer getFundTypeTo() {
    return fundTypeTo;
  }

  public void setFundTypeTo(AccountTypeMapInnerTransfer fundTypeTo) {
    this.fundTypeTo = fundTypeTo;
  }

  public AgencyInnerTransferAddRequest amount(Long amount) {
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

  public AgencyInnerTransferAddRequest externalBillNo(String externalBillNo) {
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

  public AgencyInnerTransferAddRequest memo(String memo) {
    this.memo = memo;
    return this;
  }

  /**
   * Get memo
   *
   * @return memo
   */
  @ApiModelProperty(value = "")
  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }

  public AgencyInnerTransferAddRequest accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   *
   * @return accountId
   */
  @ApiModelProperty(value = "")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgencyInnerTransferAddRequest agencyInnerTransferAddRequest = (AgencyInnerTransferAddRequest) o;
    return Objects.equals(this.fundTypeFrom, agencyInnerTransferAddRequest.fundTypeFrom)
        && Objects.equals(this.fundTypeTo, agencyInnerTransferAddRequest.fundTypeTo)
        && Objects.equals(this.amount, agencyInnerTransferAddRequest.amount)
        && Objects.equals(this.externalBillNo, agencyInnerTransferAddRequest.externalBillNo)
        && Objects.equals(this.memo, agencyInnerTransferAddRequest.memo)
        && Objects.equals(this.accountId, agencyInnerTransferAddRequest.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundTypeFrom, fundTypeTo, amount, externalBillNo, memo, accountId);
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

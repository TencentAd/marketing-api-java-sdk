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

/** 返回结构 */
@ApiModel(description = "返回结构")
public class WalletInvoiceGetListStruct {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("account_name")
  private String accountName = null;

  @SerializedName("fund_type")
  private AccountTypeMap fundType = null;

  @SerializedName("time")
  private Long time = null;

  @SerializedName("external_bill_no")
  private String externalBillNo = null;

  @SerializedName("trade_type_ext")
  private TradeTypeExt tradeTypeExt = null;

  @SerializedName("amount")
  private Long amount = null;

  @SerializedName("description")
  private String description = null;

  public WalletInvoiceGetListStruct accountId(Long accountId) {
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

  public WalletInvoiceGetListStruct accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * Get accountName
   *
   * @return accountName
   */
  @ApiModelProperty(value = "")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public WalletInvoiceGetListStruct fundType(AccountTypeMap fundType) {
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

  public WalletInvoiceGetListStruct time(Long time) {
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

  public WalletInvoiceGetListStruct externalBillNo(String externalBillNo) {
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

  public WalletInvoiceGetListStruct tradeTypeExt(TradeTypeExt tradeTypeExt) {
    this.tradeTypeExt = tradeTypeExt;
    return this;
  }

  /**
   * Get tradeTypeExt
   *
   * @return tradeTypeExt
   */
  @ApiModelProperty(value = "")
  public TradeTypeExt getTradeTypeExt() {
    return tradeTypeExt;
  }

  public void setTradeTypeExt(TradeTypeExt tradeTypeExt) {
    this.tradeTypeExt = tradeTypeExt;
  }

  public WalletInvoiceGetListStruct amount(Long amount) {
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

  public WalletInvoiceGetListStruct description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   *
   * @return description
   */
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletInvoiceGetListStruct walletInvoiceGetListStruct = (WalletInvoiceGetListStruct) o;
    return Objects.equals(this.accountId, walletInvoiceGetListStruct.accountId)
        && Objects.equals(this.accountName, walletInvoiceGetListStruct.accountName)
        && Objects.equals(this.fundType, walletInvoiceGetListStruct.fundType)
        && Objects.equals(this.time, walletInvoiceGetListStruct.time)
        && Objects.equals(this.externalBillNo, walletInvoiceGetListStruct.externalBillNo)
        && Objects.equals(this.tradeTypeExt, walletInvoiceGetListStruct.tradeTypeExt)
        && Objects.equals(this.amount, walletInvoiceGetListStruct.amount)
        && Objects.equals(this.description, walletInvoiceGetListStruct.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId, accountName, fundType, time, externalBillNo, tradeTypeExt, amount, description);
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

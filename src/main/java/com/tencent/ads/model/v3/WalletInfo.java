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

/** 钱包信息 */
@ApiModel(description = "钱包信息")
public class WalletInfo {
  @SerializedName("balance")
  private Long balance = null;

  @SerializedName("wallet_id")
  private Long walletId = null;

  @SerializedName("wallet_name")
  private String walletName = null;

  @SerializedName("agency_id")
  private Long agencyId = null;

  @SerializedName("agency_name")
  private String agencyName = null;

  @SerializedName("mdm_id")
  private Long mdmId = null;

  public WalletInfo balance(Long balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Get balance
   *
   * @return balance
   */
  @ApiModelProperty(value = "")
  public Long getBalance() {
    return balance;
  }

  public void setBalance(Long balance) {
    this.balance = balance;
  }

  public WalletInfo walletId(Long walletId) {
    this.walletId = walletId;
    return this;
  }

  /**
   * Get walletId
   *
   * @return walletId
   */
  @ApiModelProperty(value = "")
  public Long getWalletId() {
    return walletId;
  }

  public void setWalletId(Long walletId) {
    this.walletId = walletId;
  }

  public WalletInfo walletName(String walletName) {
    this.walletName = walletName;
    return this;
  }

  /**
   * Get walletName
   *
   * @return walletName
   */
  @ApiModelProperty(value = "")
  public String getWalletName() {
    return walletName;
  }

  public void setWalletName(String walletName) {
    this.walletName = walletName;
  }

  public WalletInfo agencyId(Long agencyId) {
    this.agencyId = agencyId;
    return this;
  }

  /**
   * Get agencyId
   *
   * @return agencyId
   */
  @ApiModelProperty(value = "")
  public Long getAgencyId() {
    return agencyId;
  }

  public void setAgencyId(Long agencyId) {
    this.agencyId = agencyId;
  }

  public WalletInfo agencyName(String agencyName) {
    this.agencyName = agencyName;
    return this;
  }

  /**
   * Get agencyName
   *
   * @return agencyName
   */
  @ApiModelProperty(value = "")
  public String getAgencyName() {
    return agencyName;
  }

  public void setAgencyName(String agencyName) {
    this.agencyName = agencyName;
  }

  public WalletInfo mdmId(Long mdmId) {
    this.mdmId = mdmId;
    return this;
  }

  /**
   * Get mdmId
   *
   * @return mdmId
   */
  @ApiModelProperty(value = "")
  public Long getMdmId() {
    return mdmId;
  }

  public void setMdmId(Long mdmId) {
    this.mdmId = mdmId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletInfo walletInfo = (WalletInfo) o;
    return Objects.equals(this.balance, walletInfo.balance)
        && Objects.equals(this.walletId, walletInfo.walletId)
        && Objects.equals(this.walletName, walletInfo.walletName)
        && Objects.equals(this.agencyId, walletInfo.agencyId)
        && Objects.equals(this.agencyName, walletInfo.agencyName)
        && Objects.equals(this.mdmId, walletInfo.mdmId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, walletId, walletName, agencyId, agencyName, mdmId);
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
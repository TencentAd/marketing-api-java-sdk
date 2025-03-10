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

/** 返回结构 */
@ApiModel(description = "返回结构")
public class WalletListStruct {
  @SerializedName("owner_id")
  private Long ownerId = null;

  @SerializedName("owner_name")
  private String ownerName = null;

  @SerializedName("wallet_id")
  private Long walletId = null;

  @SerializedName("wallet_name")
  private String walletName = null;

  @SerializedName("mdm_id")
  private Long mdmId = null;

  @SerializedName("mdm_name")
  private String mdmName = null;

  @SerializedName("total_balance")
  private Long totalBalance = null;

  @SerializedName("bind_advertiser_cnt")
  private Long bindAdvertiserCnt = null;

  @SerializedName("tag_list")
  private List<String> tagList = null;

  @SerializedName("balance_info_list")
  private List<WalletListBalanceStruct> balanceInfoList = null;

  public WalletListStruct ownerId(Long ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * Get ownerId
   *
   * @return ownerId
   */
  @ApiModelProperty(value = "")
  public Long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }

  public WalletListStruct ownerName(String ownerName) {
    this.ownerName = ownerName;
    return this;
  }

  /**
   * Get ownerName
   *
   * @return ownerName
   */
  @ApiModelProperty(value = "")
  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public WalletListStruct walletId(Long walletId) {
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

  public WalletListStruct walletName(String walletName) {
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

  public WalletListStruct mdmId(Long mdmId) {
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

  public WalletListStruct mdmName(String mdmName) {
    this.mdmName = mdmName;
    return this;
  }

  /**
   * Get mdmName
   *
   * @return mdmName
   */
  @ApiModelProperty(value = "")
  public String getMdmName() {
    return mdmName;
  }

  public void setMdmName(String mdmName) {
    this.mdmName = mdmName;
  }

  public WalletListStruct totalBalance(Long totalBalance) {
    this.totalBalance = totalBalance;
    return this;
  }

  /**
   * Get totalBalance
   *
   * @return totalBalance
   */
  @ApiModelProperty(value = "")
  public Long getTotalBalance() {
    return totalBalance;
  }

  public void setTotalBalance(Long totalBalance) {
    this.totalBalance = totalBalance;
  }

  public WalletListStruct bindAdvertiserCnt(Long bindAdvertiserCnt) {
    this.bindAdvertiserCnt = bindAdvertiserCnt;
    return this;
  }

  /**
   * Get bindAdvertiserCnt
   *
   * @return bindAdvertiserCnt
   */
  @ApiModelProperty(value = "")
  public Long getBindAdvertiserCnt() {
    return bindAdvertiserCnt;
  }

  public void setBindAdvertiserCnt(Long bindAdvertiserCnt) {
    this.bindAdvertiserCnt = bindAdvertiserCnt;
  }

  public WalletListStruct tagList(List<String> tagList) {
    this.tagList = tagList;
    return this;
  }

  public WalletListStruct addTagListItem(String tagListItem) {
    if (this.tagList == null) {
      this.tagList = new ArrayList<String>();
    }
    this.tagList.add(tagListItem);
    return this;
  }

  /**
   * Get tagList
   *
   * @return tagList
   */
  @ApiModelProperty(value = "")
  public List<String> getTagList() {
    return tagList;
  }

  public void setTagList(List<String> tagList) {
    this.tagList = tagList;
  }

  public WalletListStruct balanceInfoList(List<WalletListBalanceStruct> balanceInfoList) {
    this.balanceInfoList = balanceInfoList;
    return this;
  }

  public WalletListStruct addBalanceInfoListItem(WalletListBalanceStruct balanceInfoListItem) {
    if (this.balanceInfoList == null) {
      this.balanceInfoList = new ArrayList<WalletListBalanceStruct>();
    }
    this.balanceInfoList.add(balanceInfoListItem);
    return this;
  }

  /**
   * Get balanceInfoList
   *
   * @return balanceInfoList
   */
  @ApiModelProperty(value = "")
  public List<WalletListBalanceStruct> getBalanceInfoList() {
    return balanceInfoList;
  }

  public void setBalanceInfoList(List<WalletListBalanceStruct> balanceInfoList) {
    this.balanceInfoList = balanceInfoList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletListStruct walletListStruct = (WalletListStruct) o;
    return Objects.equals(this.ownerId, walletListStruct.ownerId)
        && Objects.equals(this.ownerName, walletListStruct.ownerName)
        && Objects.equals(this.walletId, walletListStruct.walletId)
        && Objects.equals(this.walletName, walletListStruct.walletName)
        && Objects.equals(this.mdmId, walletListStruct.mdmId)
        && Objects.equals(this.mdmName, walletListStruct.mdmName)
        && Objects.equals(this.totalBalance, walletListStruct.totalBalance)
        && Objects.equals(this.bindAdvertiserCnt, walletListStruct.bindAdvertiserCnt)
        && Objects.equals(this.tagList, walletListStruct.tagList)
        && Objects.equals(this.balanceInfoList, walletListStruct.balanceInfoList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        ownerId,
        ownerName,
        walletId,
        walletName,
        mdmId,
        mdmName,
        totalBalance,
        bindAdvertiserCnt,
        tagList,
        balanceInfoList);
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

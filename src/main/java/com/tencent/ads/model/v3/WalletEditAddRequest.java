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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** WalletEditAddRequest */
public class WalletEditAddRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("wallet_id")
  private Long walletId = null;

  @SerializedName("wallet_name")
  private String walletName = null;

  @SerializedName("tag_list")
  private List<String> tagList = null;

  @SerializedName("contact_info_list")
  private List<ContactInfoStruct> contactInfoList = null;

  @SerializedName("contact_notify_condition")
  private ContactNotifyCondition contactNotifyCondition = null;

  public WalletEditAddRequest accountId(Long accountId) {
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

  public WalletEditAddRequest walletId(Long walletId) {
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

  public WalletEditAddRequest walletName(String walletName) {
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

  public WalletEditAddRequest tagList(List<String> tagList) {
    this.tagList = tagList;
    return this;
  }

  public WalletEditAddRequest addTagListItem(String tagListItem) {
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

  public WalletEditAddRequest contactInfoList(List<ContactInfoStruct> contactInfoList) {
    this.contactInfoList = contactInfoList;
    return this;
  }

  public WalletEditAddRequest addContactInfoListItem(ContactInfoStruct contactInfoListItem) {
    if (this.contactInfoList == null) {
      this.contactInfoList = new ArrayList<ContactInfoStruct>();
    }
    this.contactInfoList.add(contactInfoListItem);
    return this;
  }

  /**
   * Get contactInfoList
   *
   * @return contactInfoList
   */
  @ApiModelProperty(value = "")
  public List<ContactInfoStruct> getContactInfoList() {
    return contactInfoList;
  }

  public void setContactInfoList(List<ContactInfoStruct> contactInfoList) {
    this.contactInfoList = contactInfoList;
  }

  public WalletEditAddRequest contactNotifyCondition(
      ContactNotifyCondition contactNotifyCondition) {
    this.contactNotifyCondition = contactNotifyCondition;
    return this;
  }

  /**
   * Get contactNotifyCondition
   *
   * @return contactNotifyCondition
   */
  @ApiModelProperty(value = "")
  public ContactNotifyCondition getContactNotifyCondition() {
    return contactNotifyCondition;
  }

  public void setContactNotifyCondition(ContactNotifyCondition contactNotifyCondition) {
    this.contactNotifyCondition = contactNotifyCondition;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletEditAddRequest walletEditAddRequest = (WalletEditAddRequest) o;
    return Objects.equals(this.accountId, walletEditAddRequest.accountId)
        && Objects.equals(this.walletId, walletEditAddRequest.walletId)
        && Objects.equals(this.walletName, walletEditAddRequest.walletName)
        && Objects.equals(this.tagList, walletEditAddRequest.tagList)
        && Objects.equals(this.contactInfoList, walletEditAddRequest.contactInfoList)
        && Objects.equals(this.contactNotifyCondition, walletEditAddRequest.contactNotifyCondition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId, walletId, walletName, tagList, contactInfoList, contactNotifyCondition);
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

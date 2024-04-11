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

/** LocalStoresAddRequest */
public class LocalStoresAddRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("local_store_list")
  private List<CreateLocalStoreStruct> localStoreList = null;

  public LocalStoresAddRequest accountId(Long accountId) {
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

  public LocalStoresAddRequest localStoreList(List<CreateLocalStoreStruct> localStoreList) {
    this.localStoreList = localStoreList;
    return this;
  }

  public LocalStoresAddRequest addLocalStoreListItem(CreateLocalStoreStruct localStoreListItem) {
    if (this.localStoreList == null) {
      this.localStoreList = new ArrayList<CreateLocalStoreStruct>();
    }
    this.localStoreList.add(localStoreListItem);
    return this;
  }

  /**
   * Get localStoreList
   *
   * @return localStoreList
   */
  @ApiModelProperty(value = "")
  public List<CreateLocalStoreStruct> getLocalStoreList() {
    return localStoreList;
  }

  public void setLocalStoreList(List<CreateLocalStoreStruct> localStoreList) {
    this.localStoreList = localStoreList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalStoresAddRequest localStoresAddRequest = (LocalStoresAddRequest) o;
    return Objects.equals(this.accountId, localStoresAddRequest.accountId)
        && Objects.equals(this.localStoreList, localStoresAddRequest.localStoreList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, localStoreList);
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
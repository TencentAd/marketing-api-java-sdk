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

/** BidwordAddRequest */
public class BidwordAddRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("list")
  private List<SearchBidwordStruct> list = null;

  public BidwordAddRequest accountId(Long accountId) {
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

  public BidwordAddRequest list(List<SearchBidwordStruct> list) {
    this.list = list;
    return this;
  }

  public BidwordAddRequest addListItem(SearchBidwordStruct listItem) {
    if (this.list == null) {
      this.list = new ArrayList<SearchBidwordStruct>();
    }
    this.list.add(listItem);
    return this;
  }

  /**
   * Get list
   *
   * @return list
   */
  @ApiModelProperty(value = "")
  public List<SearchBidwordStruct> getList() {
    return list;
  }

  public void setList(List<SearchBidwordStruct> list) {
    this.list = list;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BidwordAddRequest bidwordAddRequest = (BidwordAddRequest) o;
    return Objects.equals(this.accountId, bidwordAddRequest.accountId)
        && Objects.equals(this.list, bidwordAddRequest.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, list);
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

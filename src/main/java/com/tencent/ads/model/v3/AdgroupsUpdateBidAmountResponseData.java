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

/** AdgroupsUpdateBidAmountResponseData */
public class AdgroupsUpdateBidAmountResponseData {
  @SerializedName("list")
  private List<AdgroupsUpdateBidAmountListStruct> list = null;

  @SerializedName("fail_id_list")
  private List<Long> failIdList = null;

  public AdgroupsUpdateBidAmountResponseData list(List<AdgroupsUpdateBidAmountListStruct> list) {
    this.list = list;
    return this;
  }

  public AdgroupsUpdateBidAmountResponseData addListItem(
      AdgroupsUpdateBidAmountListStruct listItem) {
    if (this.list == null) {
      this.list = new ArrayList<AdgroupsUpdateBidAmountListStruct>();
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
  public List<AdgroupsUpdateBidAmountListStruct> getList() {
    return list;
  }

  public void setList(List<AdgroupsUpdateBidAmountListStruct> list) {
    this.list = list;
  }

  public AdgroupsUpdateBidAmountResponseData failIdList(List<Long> failIdList) {
    this.failIdList = failIdList;
    return this;
  }

  public AdgroupsUpdateBidAmountResponseData addFailIdListItem(Long failIdListItem) {
    if (this.failIdList == null) {
      this.failIdList = new ArrayList<Long>();
    }
    this.failIdList.add(failIdListItem);
    return this;
  }

  /**
   * Get failIdList
   *
   * @return failIdList
   */
  @ApiModelProperty(value = "")
  public List<Long> getFailIdList() {
    return failIdList;
  }

  public void setFailIdList(List<Long> failIdList) {
    this.failIdList = failIdList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdgroupsUpdateBidAmountResponseData adgroupsUpdateBidAmountResponseData =
        (AdgroupsUpdateBidAmountResponseData) o;
    return Objects.equals(this.list, adgroupsUpdateBidAmountResponseData.list)
        && Objects.equals(this.failIdList, adgroupsUpdateBidAmountResponseData.failIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list, failIdList);
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

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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ShopGetResponseData */
public class ShopGetResponseData {
  @SerializedName("list")
  private List<AllDataSpec> list = null;

  @SerializedName("page_info")
  private DpPageInfo pageInfo = null;

  public ShopGetResponseData list(List<AllDataSpec> list) {
    this.list = list;
    return this;
  }

  public ShopGetResponseData addListItem(AllDataSpec listItem) {
    if (this.list == null) {
      this.list = new ArrayList<AllDataSpec>();
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
  public List<AllDataSpec> getList() {
    return list;
  }

  public void setList(List<AllDataSpec> list) {
    this.list = list;
  }

  public ShopGetResponseData pageInfo(DpPageInfo pageInfo) {
    this.pageInfo = pageInfo;
    return this;
  }

  /**
   * Get pageInfo
   *
   * @return pageInfo
   */
  @ApiModelProperty(value = "")
  public DpPageInfo getPageInfo() {
    return pageInfo;
  }

  public void setPageInfo(DpPageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopGetResponseData shopGetResponseData = (ShopGetResponseData) o;
    return Objects.equals(this.list, shopGetResponseData.list)
        && Objects.equals(this.pageInfo, shopGetResponseData.pageInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list, pageInfo);
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

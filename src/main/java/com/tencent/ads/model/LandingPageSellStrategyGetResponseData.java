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

/** LandingPageSellStrategyGetResponseData */
public class LandingPageSellStrategyGetResponseData {
  @SerializedName("list")
  private List<StrategyStruct> list = null;

  @SerializedName("page_info")
  private PageInfo pageInfo = null;

  public LandingPageSellStrategyGetResponseData list(List<StrategyStruct> list) {
    this.list = list;
    return this;
  }

  public LandingPageSellStrategyGetResponseData addListItem(StrategyStruct listItem) {
    if (this.list == null) {
      this.list = new ArrayList<StrategyStruct>();
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
  public List<StrategyStruct> getList() {
    return list;
  }

  public void setList(List<StrategyStruct> list) {
    this.list = list;
  }

  public LandingPageSellStrategyGetResponseData pageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
    return this;
  }

  /**
   * Get pageInfo
   *
   * @return pageInfo
   */
  @ApiModelProperty(value = "")
  public PageInfo getPageInfo() {
    return pageInfo;
  }

  public void setPageInfo(PageInfo pageInfo) {
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
    LandingPageSellStrategyGetResponseData landingPageSellStrategyGetResponseData =
        (LandingPageSellStrategyGetResponseData) o;
    return Objects.equals(this.list, landingPageSellStrategyGetResponseData.list)
        && Objects.equals(this.pageInfo, landingPageSellStrategyGetResponseData.pageInfo);
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

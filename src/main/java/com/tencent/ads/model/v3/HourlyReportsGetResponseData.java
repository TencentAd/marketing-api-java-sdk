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

/** HourlyReportsGetResponseData */
public class HourlyReportsGetResponseData {
  @SerializedName("list")
  private List<HourlyReportApiListStruct> list = null;

  @SerializedName("page_info")
  private PageInfo pageInfo = null;

  public HourlyReportsGetResponseData list(List<HourlyReportApiListStruct> list) {
    this.list = list;
    return this;
  }

  public HourlyReportsGetResponseData addListItem(HourlyReportApiListStruct listItem) {
    if (this.list == null) {
      this.list = new ArrayList<HourlyReportApiListStruct>();
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
  public List<HourlyReportApiListStruct> getList() {
    return list;
  }

  public void setList(List<HourlyReportApiListStruct> list) {
    this.list = list;
  }

  public HourlyReportsGetResponseData pageInfo(PageInfo pageInfo) {
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
    HourlyReportsGetResponseData hourlyReportsGetResponseData = (HourlyReportsGetResponseData) o;
    return Objects.equals(this.list, hourlyReportsGetResponseData.list)
        && Objects.equals(this.pageInfo, hourlyReportsGetResponseData.pageInfo);
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

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

/** LocalGetRequest */
public class LocalGetRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("date_range")
  private DpDateRange dateRange = null;

  @SerializedName("filtering")
  private List<FilteringStruct> filtering = null;

  @SerializedName("level")
  private DpApiReportLevel level = null;

  @SerializedName("page")
  private Long page = null;

  @SerializedName("page_size")
  private Long pageSize = null;

  public LocalGetRequest accountId(Long accountId) {
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

  public LocalGetRequest dateRange(DpDateRange dateRange) {
    this.dateRange = dateRange;
    return this;
  }

  /**
   * Get dateRange
   *
   * @return dateRange
   */
  @ApiModelProperty(value = "")
  public DpDateRange getDateRange() {
    return dateRange;
  }

  public void setDateRange(DpDateRange dateRange) {
    this.dateRange = dateRange;
  }

  public LocalGetRequest filtering(List<FilteringStruct> filtering) {
    this.filtering = filtering;
    return this;
  }

  public LocalGetRequest addFilteringItem(FilteringStruct filteringItem) {
    if (this.filtering == null) {
      this.filtering = new ArrayList<FilteringStruct>();
    }
    this.filtering.add(filteringItem);
    return this;
  }

  /**
   * Get filtering
   *
   * @return filtering
   */
  @ApiModelProperty(value = "")
  public List<FilteringStruct> getFiltering() {
    return filtering;
  }

  public void setFiltering(List<FilteringStruct> filtering) {
    this.filtering = filtering;
  }

  public LocalGetRequest level(DpApiReportLevel level) {
    this.level = level;
    return this;
  }

  /**
   * Get level
   *
   * @return level
   */
  @ApiModelProperty(value = "")
  public DpApiReportLevel getLevel() {
    return level;
  }

  public void setLevel(DpApiReportLevel level) {
    this.level = level;
  }

  public LocalGetRequest page(Long page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   *
   * @return page
   */
  @ApiModelProperty(value = "")
  public Long getPage() {
    return page;
  }

  public void setPage(Long page) {
    this.page = page;
  }

  public LocalGetRequest pageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   *
   * @return pageSize
   */
  @ApiModelProperty(value = "")
  public Long getPageSize() {
    return pageSize;
  }

  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalGetRequest localGetRequest = (LocalGetRequest) o;
    return Objects.equals(this.accountId, localGetRequest.accountId)
        && Objects.equals(this.dateRange, localGetRequest.dateRange)
        && Objects.equals(this.filtering, localGetRequest.filtering)
        && Objects.equals(this.level, localGetRequest.level)
        && Objects.equals(this.page, localGetRequest.page)
        && Objects.equals(this.pageSize, localGetRequest.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, dateRange, filtering, level, page, pageSize);
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

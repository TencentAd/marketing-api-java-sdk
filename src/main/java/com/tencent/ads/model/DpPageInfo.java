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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** 拉取创意结构 */
@ApiModel(description = "拉取创意结构")
public class DpPageInfo {
  @SerializedName("page")
  private Long page = null;

  @SerializedName("page_size")
  private Long pageSize = null;

  @SerializedName("total_page")
  private Long totalPage = null;

  @SerializedName("total_num")
  private Long totalNum = null;

  public DpPageInfo page(Long page) {
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

  public DpPageInfo pageSize(Long pageSize) {
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

  public DpPageInfo totalPage(Long totalPage) {
    this.totalPage = totalPage;
    return this;
  }

  /**
   * Get totalPage
   *
   * @return totalPage
   */
  @ApiModelProperty(value = "")
  public Long getTotalPage() {
    return totalPage;
  }

  public void setTotalPage(Long totalPage) {
    this.totalPage = totalPage;
  }

  public DpPageInfo totalNum(Long totalNum) {
    this.totalNum = totalNum;
    return this;
  }

  /**
   * Get totalNum
   *
   * @return totalNum
   */
  @ApiModelProperty(value = "")
  public Long getTotalNum() {
    return totalNum;
  }

  public void setTotalNum(Long totalNum) {
    this.totalNum = totalNum;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpPageInfo dpPageInfo = (DpPageInfo) o;
    return Objects.equals(this.page, dpPageInfo.page)
        && Objects.equals(this.pageSize, dpPageInfo.pageSize)
        && Objects.equals(this.totalPage, dpPageInfo.totalPage)
        && Objects.equals(this.totalNum, dpPageInfo.totalNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, pageSize, totalPage, totalNum);
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

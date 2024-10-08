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
import java.util.Objects;

/** 游标分页信息 */
@ApiModel(description = "游标分页信息")
public class CursorPageInfoStruct {
  @SerializedName("page_size")
  private Long pageSize = null;

  @SerializedName("total_number")
  private Long totalNumber = null;

  @SerializedName("next_cursor")
  private String nextCursor = null;

  @SerializedName("previous_cursor")
  private String previousCursor = null;

  public CursorPageInfoStruct pageSize(Long pageSize) {
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

  public CursorPageInfoStruct totalNumber(Long totalNumber) {
    this.totalNumber = totalNumber;
    return this;
  }

  /**
   * Get totalNumber
   *
   * @return totalNumber
   */
  @ApiModelProperty(value = "")
  public Long getTotalNumber() {
    return totalNumber;
  }

  public void setTotalNumber(Long totalNumber) {
    this.totalNumber = totalNumber;
  }

  public CursorPageInfoStruct nextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
    return this;
  }

  /**
   * Get nextCursor
   *
   * @return nextCursor
   */
  @ApiModelProperty(value = "")
  public String getNextCursor() {
    return nextCursor;
  }

  public void setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
  }

  public CursorPageInfoStruct previousCursor(String previousCursor) {
    this.previousCursor = previousCursor;
    return this;
  }

  /**
   * Get previousCursor
   *
   * @return previousCursor
   */
  @ApiModelProperty(value = "")
  public String getPreviousCursor() {
    return previousCursor;
  }

  public void setPreviousCursor(String previousCursor) {
    this.previousCursor = previousCursor;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CursorPageInfoStruct cursorPageInfoStruct = (CursorPageInfoStruct) o;
    return Objects.equals(this.pageSize, cursorPageInfoStruct.pageSize)
        && Objects.equals(this.totalNumber, cursorPageInfoStruct.totalNumber)
        && Objects.equals(this.nextCursor, cursorPageInfoStruct.nextCursor)
        && Objects.equals(this.previousCursor, cursorPageInfoStruct.previousCursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, totalNumber, nextCursor, previousCursor);
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

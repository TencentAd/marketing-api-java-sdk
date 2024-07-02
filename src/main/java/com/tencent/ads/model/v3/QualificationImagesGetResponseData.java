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

/** QualificationImagesGetResponseData */
public class QualificationImagesGetResponseData {
  @SerializedName("list")
  private List<QualificationImageStruct> list = null;

  @SerializedName("page_info")
  private PageInfo pageInfo = null;

  public QualificationImagesGetResponseData list(List<QualificationImageStruct> list) {
    this.list = list;
    return this;
  }

  public QualificationImagesGetResponseData addListItem(QualificationImageStruct listItem) {
    if (this.list == null) {
      this.list = new ArrayList<QualificationImageStruct>();
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
  public List<QualificationImageStruct> getList() {
    return list;
  }

  public void setList(List<QualificationImageStruct> list) {
    this.list = list;
  }

  public QualificationImagesGetResponseData pageInfo(PageInfo pageInfo) {
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
    QualificationImagesGetResponseData qualificationImagesGetResponseData =
        (QualificationImagesGetResponseData) o;
    return Objects.equals(this.list, qualificationImagesGetResponseData.list)
        && Objects.equals(this.pageInfo, qualificationImagesGetResponseData.pageInfo);
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

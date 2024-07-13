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

/** MaterialDcasetAddResponseData */
public class MaterialDcasetAddResponseData {
  @SerializedName("success_id_list")
  private List<Long> successIdList = null;

  @SerializedName("fail_id_list")
  private List<Long> failIdList = null;

  public MaterialDcasetAddResponseData successIdList(List<Long> successIdList) {
    this.successIdList = successIdList;
    return this;
  }

  public MaterialDcasetAddResponseData addSuccessIdListItem(Long successIdListItem) {
    if (this.successIdList == null) {
      this.successIdList = new ArrayList<Long>();
    }
    this.successIdList.add(successIdListItem);
    return this;
  }

  /**
   * Get successIdList
   *
   * @return successIdList
   */
  @ApiModelProperty(value = "")
  public List<Long> getSuccessIdList() {
    return successIdList;
  }

  public void setSuccessIdList(List<Long> successIdList) {
    this.successIdList = successIdList;
  }

  public MaterialDcasetAddResponseData failIdList(List<Long> failIdList) {
    this.failIdList = failIdList;
    return this;
  }

  public MaterialDcasetAddResponseData addFailIdListItem(Long failIdListItem) {
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
    MaterialDcasetAddResponseData materialDcasetAddResponseData = (MaterialDcasetAddResponseData) o;
    return Objects.equals(this.successIdList, materialDcasetAddResponseData.successIdList)
        && Objects.equals(this.failIdList, materialDcasetAddResponseData.failIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successIdList, failIdList);
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

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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** 任务结果 */
@ApiModel(description = "任务结果")
public class AsyncTasksGetData {
  @SerializedName("file_info_list")
  private List<AsyncTasksGetFileInfo> fileInfoList = null;

  @SerializedName("channel_package_info_list")
  private List<ChannelPackageInfo> channelPackageInfoList = null;

  @SerializedName("union_channel_package_info_list")
  private List<UnionChannelPackageInfo> unionChannelPackageInfoList = null;

  @SerializedName("review_element_prereview_result_list")
  private List<ElementPrereviewResultStruct> reviewElementPrereviewResultList = null;

  public AsyncTasksGetData fileInfoList(List<AsyncTasksGetFileInfo> fileInfoList) {
    this.fileInfoList = fileInfoList;
    return this;
  }

  public AsyncTasksGetData addFileInfoListItem(AsyncTasksGetFileInfo fileInfoListItem) {
    if (this.fileInfoList == null) {
      this.fileInfoList = new ArrayList<AsyncTasksGetFileInfo>();
    }
    this.fileInfoList.add(fileInfoListItem);
    return this;
  }

  /**
   * Get fileInfoList
   *
   * @return fileInfoList
   */
  @ApiModelProperty(value = "")
  public List<AsyncTasksGetFileInfo> getFileInfoList() {
    return fileInfoList;
  }

  public void setFileInfoList(List<AsyncTasksGetFileInfo> fileInfoList) {
    this.fileInfoList = fileInfoList;
  }

  public AsyncTasksGetData channelPackageInfoList(List<ChannelPackageInfo> channelPackageInfoList) {
    this.channelPackageInfoList = channelPackageInfoList;
    return this;
  }

  public AsyncTasksGetData addChannelPackageInfoListItem(
      ChannelPackageInfo channelPackageInfoListItem) {
    if (this.channelPackageInfoList == null) {
      this.channelPackageInfoList = new ArrayList<ChannelPackageInfo>();
    }
    this.channelPackageInfoList.add(channelPackageInfoListItem);
    return this;
  }

  /**
   * Get channelPackageInfoList
   *
   * @return channelPackageInfoList
   */
  @ApiModelProperty(value = "")
  public List<ChannelPackageInfo> getChannelPackageInfoList() {
    return channelPackageInfoList;
  }

  public void setChannelPackageInfoList(List<ChannelPackageInfo> channelPackageInfoList) {
    this.channelPackageInfoList = channelPackageInfoList;
  }

  public AsyncTasksGetData unionChannelPackageInfoList(
      List<UnionChannelPackageInfo> unionChannelPackageInfoList) {
    this.unionChannelPackageInfoList = unionChannelPackageInfoList;
    return this;
  }

  public AsyncTasksGetData addUnionChannelPackageInfoListItem(
      UnionChannelPackageInfo unionChannelPackageInfoListItem) {
    if (this.unionChannelPackageInfoList == null) {
      this.unionChannelPackageInfoList = new ArrayList<UnionChannelPackageInfo>();
    }
    this.unionChannelPackageInfoList.add(unionChannelPackageInfoListItem);
    return this;
  }

  /**
   * Get unionChannelPackageInfoList
   *
   * @return unionChannelPackageInfoList
   */
  @ApiModelProperty(value = "")
  public List<UnionChannelPackageInfo> getUnionChannelPackageInfoList() {
    return unionChannelPackageInfoList;
  }

  public void setUnionChannelPackageInfoList(
      List<UnionChannelPackageInfo> unionChannelPackageInfoList) {
    this.unionChannelPackageInfoList = unionChannelPackageInfoList;
  }

  public AsyncTasksGetData reviewElementPrereviewResultList(
      List<ElementPrereviewResultStruct> reviewElementPrereviewResultList) {
    this.reviewElementPrereviewResultList = reviewElementPrereviewResultList;
    return this;
  }

  public AsyncTasksGetData addReviewElementPrereviewResultListItem(
      ElementPrereviewResultStruct reviewElementPrereviewResultListItem) {
    if (this.reviewElementPrereviewResultList == null) {
      this.reviewElementPrereviewResultList = new ArrayList<ElementPrereviewResultStruct>();
    }
    this.reviewElementPrereviewResultList.add(reviewElementPrereviewResultListItem);
    return this;
  }

  /**
   * Get reviewElementPrereviewResultList
   *
   * @return reviewElementPrereviewResultList
   */
  @ApiModelProperty(value = "")
  public List<ElementPrereviewResultStruct> getReviewElementPrereviewResultList() {
    return reviewElementPrereviewResultList;
  }

  public void setReviewElementPrereviewResultList(
      List<ElementPrereviewResultStruct> reviewElementPrereviewResultList) {
    this.reviewElementPrereviewResultList = reviewElementPrereviewResultList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncTasksGetData asyncTasksGetData = (AsyncTasksGetData) o;
    return Objects.equals(this.fileInfoList, asyncTasksGetData.fileInfoList)
        && Objects.equals(this.channelPackageInfoList, asyncTasksGetData.channelPackageInfoList)
        && Objects.equals(
            this.unionChannelPackageInfoList, asyncTasksGetData.unionChannelPackageInfoList)
        && Objects.equals(
            this.reviewElementPrereviewResultList,
            asyncTasksGetData.reviewElementPrereviewResultList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        fileInfoList,
        channelPackageInfoList,
        unionChannelPackageInfoList,
        reviewElementPrereviewResultList);
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

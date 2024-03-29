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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** 返回结构 */
@ApiModel(description = "返回结构")
public class UnionPositionPackagesGetListStruct {
  @SerializedName("union_package_id")
  private Long unionPackageId = null;

  @SerializedName("union_package_name")
  private String unionPackageName = null;

  @SerializedName("union_package_type")
  private UnionPackageType unionPackageType = null;

  @SerializedName("union_position_id_list")
  private List<Long> unionPositionIdList = null;

  @SerializedName("created_time")
  private Long createdTime = null;

  @SerializedName("last_modified_time")
  private Long lastModifiedTime = null;

  public UnionPositionPackagesGetListStruct unionPackageId(Long unionPackageId) {
    this.unionPackageId = unionPackageId;
    return this;
  }

  /**
   * Get unionPackageId
   *
   * @return unionPackageId
   */
  @ApiModelProperty(value = "")
  public Long getUnionPackageId() {
    return unionPackageId;
  }

  public void setUnionPackageId(Long unionPackageId) {
    this.unionPackageId = unionPackageId;
  }

  public UnionPositionPackagesGetListStruct unionPackageName(String unionPackageName) {
    this.unionPackageName = unionPackageName;
    return this;
  }

  /**
   * Get unionPackageName
   *
   * @return unionPackageName
   */
  @ApiModelProperty(value = "")
  public String getUnionPackageName() {
    return unionPackageName;
  }

  public void setUnionPackageName(String unionPackageName) {
    this.unionPackageName = unionPackageName;
  }

  public UnionPositionPackagesGetListStruct unionPackageType(UnionPackageType unionPackageType) {
    this.unionPackageType = unionPackageType;
    return this;
  }

  /**
   * Get unionPackageType
   *
   * @return unionPackageType
   */
  @ApiModelProperty(value = "")
  public UnionPackageType getUnionPackageType() {
    return unionPackageType;
  }

  public void setUnionPackageType(UnionPackageType unionPackageType) {
    this.unionPackageType = unionPackageType;
  }

  public UnionPositionPackagesGetListStruct unionPositionIdList(List<Long> unionPositionIdList) {
    this.unionPositionIdList = unionPositionIdList;
    return this;
  }

  public UnionPositionPackagesGetListStruct addUnionPositionIdListItem(
      Long unionPositionIdListItem) {
    if (this.unionPositionIdList == null) {
      this.unionPositionIdList = new ArrayList<Long>();
    }
    this.unionPositionIdList.add(unionPositionIdListItem);
    return this;
  }

  /**
   * Get unionPositionIdList
   *
   * @return unionPositionIdList
   */
  @ApiModelProperty(value = "")
  public List<Long> getUnionPositionIdList() {
    return unionPositionIdList;
  }

  public void setUnionPositionIdList(List<Long> unionPositionIdList) {
    this.unionPositionIdList = unionPositionIdList;
  }

  public UnionPositionPackagesGetListStruct createdTime(Long createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   *
   * @return createdTime
   */
  @ApiModelProperty(value = "")
  public Long getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Long createdTime) {
    this.createdTime = createdTime;
  }

  public UnionPositionPackagesGetListStruct lastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

  /**
   * Get lastModifiedTime
   *
   * @return lastModifiedTime
   */
  @ApiModelProperty(value = "")
  public Long getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnionPositionPackagesGetListStruct unionPositionPackagesGetListStruct =
        (UnionPositionPackagesGetListStruct) o;
    return Objects.equals(this.unionPackageId, unionPositionPackagesGetListStruct.unionPackageId)
        && Objects.equals(
            this.unionPackageName, unionPositionPackagesGetListStruct.unionPackageName)
        && Objects.equals(
            this.unionPackageType, unionPositionPackagesGetListStruct.unionPackageType)
        && Objects.equals(
            this.unionPositionIdList, unionPositionPackagesGetListStruct.unionPositionIdList)
        && Objects.equals(this.createdTime, unionPositionPackagesGetListStruct.createdTime)
        && Objects.equals(
            this.lastModifiedTime, unionPositionPackagesGetListStruct.lastModifiedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        unionPackageId,
        unionPackageName,
        unionPackageType,
        unionPositionIdList,
        createdTime,
        lastModifiedTime);
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

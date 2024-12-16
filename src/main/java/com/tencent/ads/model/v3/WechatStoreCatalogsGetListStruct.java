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
public class WechatStoreCatalogsGetListStruct {
  @SerializedName("catalog_id")
  private Long catalogId = null;

  @SerializedName("catalog_name")
  private String catalogName = null;

  @SerializedName("store_id")
  private String storeId = null;

  @SerializedName("available_status")
  private Long availableStatus = null;

  @SerializedName("unavailable_cause")
  private List<String> unavailableCause = null;

  public WechatStoreCatalogsGetListStruct catalogId(Long catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  /**
   * Get catalogId
   *
   * @return catalogId
   */
  @ApiModelProperty(value = "")
  public Long getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(Long catalogId) {
    this.catalogId = catalogId;
  }

  public WechatStoreCatalogsGetListStruct catalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  /**
   * Get catalogName
   *
   * @return catalogName
   */
  @ApiModelProperty(value = "")
  public String getCatalogName() {
    return catalogName;
  }

  public void setCatalogName(String catalogName) {
    this.catalogName = catalogName;
  }

  public WechatStoreCatalogsGetListStruct storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

  /**
   * Get storeId
   *
   * @return storeId
   */
  @ApiModelProperty(value = "")
  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  public WechatStoreCatalogsGetListStruct availableStatus(Long availableStatus) {
    this.availableStatus = availableStatus;
    return this;
  }

  /**
   * Get availableStatus
   *
   * @return availableStatus
   */
  @ApiModelProperty(value = "")
  public Long getAvailableStatus() {
    return availableStatus;
  }

  public void setAvailableStatus(Long availableStatus) {
    this.availableStatus = availableStatus;
  }

  public WechatStoreCatalogsGetListStruct unavailableCause(List<String> unavailableCause) {
    this.unavailableCause = unavailableCause;
    return this;
  }

  public WechatStoreCatalogsGetListStruct addUnavailableCauseItem(String unavailableCauseItem) {
    if (this.unavailableCause == null) {
      this.unavailableCause = new ArrayList<String>();
    }
    this.unavailableCause.add(unavailableCauseItem);
    return this;
  }

  /**
   * Get unavailableCause
   *
   * @return unavailableCause
   */
  @ApiModelProperty(value = "")
  public List<String> getUnavailableCause() {
    return unavailableCause;
  }

  public void setUnavailableCause(List<String> unavailableCause) {
    this.unavailableCause = unavailableCause;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WechatStoreCatalogsGetListStruct wechatStoreCatalogsGetListStruct =
        (WechatStoreCatalogsGetListStruct) o;
    return Objects.equals(this.catalogId, wechatStoreCatalogsGetListStruct.catalogId)
        && Objects.equals(this.catalogName, wechatStoreCatalogsGetListStruct.catalogName)
        && Objects.equals(this.storeId, wechatStoreCatalogsGetListStruct.storeId)
        && Objects.equals(this.availableStatus, wechatStoreCatalogsGetListStruct.availableStatus)
        && Objects.equals(this.unavailableCause, wechatStoreCatalogsGetListStruct.unavailableCause);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, catalogName, storeId, availableStatus, unavailableCause);
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

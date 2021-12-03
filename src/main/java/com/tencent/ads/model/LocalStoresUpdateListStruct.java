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

/** 返回结构 */
@ApiModel(description = "返回结构")
public class LocalStoresUpdateListStruct {
  @SerializedName("poi_id")
  private String poiId = null;

  @SerializedName("local_store_name")
  private String localStoreName = null;

  @SerializedName("local_store_province")
  private String localStoreProvince = null;

  @SerializedName("local_store_city")
  private String localStoreCity = null;

  @SerializedName("local_store_address")
  private String localStoreAddress = null;

  @SerializedName("local_store_street")
  private String localStoreStreet = null;

  @SerializedName("local_store_business_area")
  private String localStoreBusinessArea = null;

  @SerializedName("local_store_district")
  private String localStoreDistrict = null;

  @SerializedName("local_store_location")
  private LocalStoreLocation localStoreLocation = null;

  @SerializedName("local_store_biz_info")
  private LocalStoreBizInfoStructRsp localStoreBizInfo = null;

  @SerializedName("wechat_ecosystem_accounts")
  private WechatEcosystemAccounts wechatEcosystemAccounts = null;

  public LocalStoresUpdateListStruct poiId(String poiId) {
    this.poiId = poiId;
    return this;
  }

  /**
   * Get poiId
   *
   * @return poiId
   */
  @ApiModelProperty(value = "")
  public String getPoiId() {
    return poiId;
  }

  public void setPoiId(String poiId) {
    this.poiId = poiId;
  }

  public LocalStoresUpdateListStruct localStoreName(String localStoreName) {
    this.localStoreName = localStoreName;
    return this;
  }

  /**
   * Get localStoreName
   *
   * @return localStoreName
   */
  @ApiModelProperty(value = "")
  public String getLocalStoreName() {
    return localStoreName;
  }

  public void setLocalStoreName(String localStoreName) {
    this.localStoreName = localStoreName;
  }

  public LocalStoresUpdateListStruct localStoreProvince(String localStoreProvince) {
    this.localStoreProvince = localStoreProvince;
    return this;
  }

  /**
   * Get localStoreProvince
   *
   * @return localStoreProvince
   */
  @ApiModelProperty(value = "")
  public String getLocalStoreProvince() {
    return localStoreProvince;
  }

  public void setLocalStoreProvince(String localStoreProvince) {
    this.localStoreProvince = localStoreProvince;
  }

  public LocalStoresUpdateListStruct localStoreCity(String localStoreCity) {
    this.localStoreCity = localStoreCity;
    return this;
  }

  /**
   * Get localStoreCity
   *
   * @return localStoreCity
   */
  @ApiModelProperty(value = "")
  public String getLocalStoreCity() {
    return localStoreCity;
  }

  public void setLocalStoreCity(String localStoreCity) {
    this.localStoreCity = localStoreCity;
  }

  public LocalStoresUpdateListStruct localStoreAddress(String localStoreAddress) {
    this.localStoreAddress = localStoreAddress;
    return this;
  }

  /**
   * Get localStoreAddress
   *
   * @return localStoreAddress
   */
  @ApiModelProperty(value = "")
  public String getLocalStoreAddress() {
    return localStoreAddress;
  }

  public void setLocalStoreAddress(String localStoreAddress) {
    this.localStoreAddress = localStoreAddress;
  }

  public LocalStoresUpdateListStruct localStoreStreet(String localStoreStreet) {
    this.localStoreStreet = localStoreStreet;
    return this;
  }

  /**
   * Get localStoreStreet
   *
   * @return localStoreStreet
   */
  @ApiModelProperty(value = "")
  public String getLocalStoreStreet() {
    return localStoreStreet;
  }

  public void setLocalStoreStreet(String localStoreStreet) {
    this.localStoreStreet = localStoreStreet;
  }

  public LocalStoresUpdateListStruct localStoreBusinessArea(String localStoreBusinessArea) {
    this.localStoreBusinessArea = localStoreBusinessArea;
    return this;
  }

  /**
   * Get localStoreBusinessArea
   *
   * @return localStoreBusinessArea
   */
  @ApiModelProperty(value = "")
  public String getLocalStoreBusinessArea() {
    return localStoreBusinessArea;
  }

  public void setLocalStoreBusinessArea(String localStoreBusinessArea) {
    this.localStoreBusinessArea = localStoreBusinessArea;
  }

  public LocalStoresUpdateListStruct localStoreDistrict(String localStoreDistrict) {
    this.localStoreDistrict = localStoreDistrict;
    return this;
  }

  /**
   * Get localStoreDistrict
   *
   * @return localStoreDistrict
   */
  @ApiModelProperty(value = "")
  public String getLocalStoreDistrict() {
    return localStoreDistrict;
  }

  public void setLocalStoreDistrict(String localStoreDistrict) {
    this.localStoreDistrict = localStoreDistrict;
  }

  public LocalStoresUpdateListStruct localStoreLocation(LocalStoreLocation localStoreLocation) {
    this.localStoreLocation = localStoreLocation;
    return this;
  }

  /**
   * Get localStoreLocation
   *
   * @return localStoreLocation
   */
  @ApiModelProperty(value = "")
  public LocalStoreLocation getLocalStoreLocation() {
    return localStoreLocation;
  }

  public void setLocalStoreLocation(LocalStoreLocation localStoreLocation) {
    this.localStoreLocation = localStoreLocation;
  }

  public LocalStoresUpdateListStruct localStoreBizInfo(
      LocalStoreBizInfoStructRsp localStoreBizInfo) {
    this.localStoreBizInfo = localStoreBizInfo;
    return this;
  }

  /**
   * Get localStoreBizInfo
   *
   * @return localStoreBizInfo
   */
  @ApiModelProperty(value = "")
  public LocalStoreBizInfoStructRsp getLocalStoreBizInfo() {
    return localStoreBizInfo;
  }

  public void setLocalStoreBizInfo(LocalStoreBizInfoStructRsp localStoreBizInfo) {
    this.localStoreBizInfo = localStoreBizInfo;
  }

  public LocalStoresUpdateListStruct wechatEcosystemAccounts(
      WechatEcosystemAccounts wechatEcosystemAccounts) {
    this.wechatEcosystemAccounts = wechatEcosystemAccounts;
    return this;
  }

  /**
   * Get wechatEcosystemAccounts
   *
   * @return wechatEcosystemAccounts
   */
  @ApiModelProperty(value = "")
  public WechatEcosystemAccounts getWechatEcosystemAccounts() {
    return wechatEcosystemAccounts;
  }

  public void setWechatEcosystemAccounts(WechatEcosystemAccounts wechatEcosystemAccounts) {
    this.wechatEcosystemAccounts = wechatEcosystemAccounts;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalStoresUpdateListStruct localStoresUpdateListStruct = (LocalStoresUpdateListStruct) o;
    return Objects.equals(this.poiId, localStoresUpdateListStruct.poiId)
        && Objects.equals(this.localStoreName, localStoresUpdateListStruct.localStoreName)
        && Objects.equals(this.localStoreProvince, localStoresUpdateListStruct.localStoreProvince)
        && Objects.equals(this.localStoreCity, localStoresUpdateListStruct.localStoreCity)
        && Objects.equals(this.localStoreAddress, localStoresUpdateListStruct.localStoreAddress)
        && Objects.equals(this.localStoreStreet, localStoresUpdateListStruct.localStoreStreet)
        && Objects.equals(
            this.localStoreBusinessArea, localStoresUpdateListStruct.localStoreBusinessArea)
        && Objects.equals(this.localStoreDistrict, localStoresUpdateListStruct.localStoreDistrict)
        && Objects.equals(this.localStoreLocation, localStoresUpdateListStruct.localStoreLocation)
        && Objects.equals(this.localStoreBizInfo, localStoresUpdateListStruct.localStoreBizInfo)
        && Objects.equals(
            this.wechatEcosystemAccounts, localStoresUpdateListStruct.wechatEcosystemAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        poiId,
        localStoreName,
        localStoreProvince,
        localStoreCity,
        localStoreAddress,
        localStoreStreet,
        localStoreBusinessArea,
        localStoreDistrict,
        localStoreLocation,
        localStoreBizInfo,
        wechatEcosystemAccounts);
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
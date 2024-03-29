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

/** 订单列表配置 */
@ApiModel(description = "订单列表配置")
public class EcommerceOrderListStruct {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("ecommerce_order_id")
  private String ecommerceOrderId = null;

  @SerializedName("customized_page_name")
  private String customizedPageName = null;

  @SerializedName("commodity_package_detail")
  private String commodityPackageDetail = null;

  @SerializedName("quantity")
  private Long quantity = null;

  @SerializedName("price")
  private Long price = null;

  @SerializedName("total_price")
  private Long totalPrice = null;

  @SerializedName("ecommerce_order_time")
  private String ecommerceOrderTime = null;

  @SerializedName("ecommerce_order_status")
  private EcommerceOrderStatus ecommerceOrderStatus = null;

  @SerializedName("user_name")
  private String userName = null;

  @SerializedName("user_phone")
  private String userPhone = null;

  @SerializedName("user_province")
  private String userProvince = null;

  @SerializedName("user_city")
  private String userCity = null;

  @SerializedName("user_area")
  private String userArea = null;

  @SerializedName("user_address")
  private String userAddress = null;

  @SerializedName("user_ip")
  private String userIp = null;

  @SerializedName("user_message")
  private String userMessage = null;

  @SerializedName("destination_url")
  private String destinationUrl = null;

  @SerializedName("adgroup_id")
  private Long adgroupId = null;

  @SerializedName("adgroup_name")
  private String adgroupName = null;

  @SerializedName("from_account_id")
  private Long fromAccountId = null;

  @SerializedName("delivery_spec")
  private DeliverySpec deliverySpec = null;

  public EcommerceOrderListStruct accountId(Long accountId) {
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

  public EcommerceOrderListStruct ecommerceOrderId(String ecommerceOrderId) {
    this.ecommerceOrderId = ecommerceOrderId;
    return this;
  }

  /**
   * Get ecommerceOrderId
   *
   * @return ecommerceOrderId
   */
  @ApiModelProperty(value = "")
  public String getEcommerceOrderId() {
    return ecommerceOrderId;
  }

  public void setEcommerceOrderId(String ecommerceOrderId) {
    this.ecommerceOrderId = ecommerceOrderId;
  }

  public EcommerceOrderListStruct customizedPageName(String customizedPageName) {
    this.customizedPageName = customizedPageName;
    return this;
  }

  /**
   * Get customizedPageName
   *
   * @return customizedPageName
   */
  @ApiModelProperty(value = "")
  public String getCustomizedPageName() {
    return customizedPageName;
  }

  public void setCustomizedPageName(String customizedPageName) {
    this.customizedPageName = customizedPageName;
  }

  public EcommerceOrderListStruct commodityPackageDetail(String commodityPackageDetail) {
    this.commodityPackageDetail = commodityPackageDetail;
    return this;
  }

  /**
   * Get commodityPackageDetail
   *
   * @return commodityPackageDetail
   */
  @ApiModelProperty(value = "")
  public String getCommodityPackageDetail() {
    return commodityPackageDetail;
  }

  public void setCommodityPackageDetail(String commodityPackageDetail) {
    this.commodityPackageDetail = commodityPackageDetail;
  }

  public EcommerceOrderListStruct quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   *
   * @return quantity
   */
  @ApiModelProperty(value = "")
  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public EcommerceOrderListStruct price(Long price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   *
   * @return price
   */
  @ApiModelProperty(value = "")
  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }

  public EcommerceOrderListStruct totalPrice(Long totalPrice) {
    this.totalPrice = totalPrice;
    return this;
  }

  /**
   * Get totalPrice
   *
   * @return totalPrice
   */
  @ApiModelProperty(value = "")
  public Long getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(Long totalPrice) {
    this.totalPrice = totalPrice;
  }

  public EcommerceOrderListStruct ecommerceOrderTime(String ecommerceOrderTime) {
    this.ecommerceOrderTime = ecommerceOrderTime;
    return this;
  }

  /**
   * Get ecommerceOrderTime
   *
   * @return ecommerceOrderTime
   */
  @ApiModelProperty(value = "")
  public String getEcommerceOrderTime() {
    return ecommerceOrderTime;
  }

  public void setEcommerceOrderTime(String ecommerceOrderTime) {
    this.ecommerceOrderTime = ecommerceOrderTime;
  }

  public EcommerceOrderListStruct ecommerceOrderStatus(EcommerceOrderStatus ecommerceOrderStatus) {
    this.ecommerceOrderStatus = ecommerceOrderStatus;
    return this;
  }

  /**
   * Get ecommerceOrderStatus
   *
   * @return ecommerceOrderStatus
   */
  @ApiModelProperty(value = "")
  public EcommerceOrderStatus getEcommerceOrderStatus() {
    return ecommerceOrderStatus;
  }

  public void setEcommerceOrderStatus(EcommerceOrderStatus ecommerceOrderStatus) {
    this.ecommerceOrderStatus = ecommerceOrderStatus;
  }

  public EcommerceOrderListStruct userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   *
   * @return userName
   */
  @ApiModelProperty(value = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public EcommerceOrderListStruct userPhone(String userPhone) {
    this.userPhone = userPhone;
    return this;
  }

  /**
   * Get userPhone
   *
   * @return userPhone
   */
  @ApiModelProperty(value = "")
  public String getUserPhone() {
    return userPhone;
  }

  public void setUserPhone(String userPhone) {
    this.userPhone = userPhone;
  }

  public EcommerceOrderListStruct userProvince(String userProvince) {
    this.userProvince = userProvince;
    return this;
  }

  /**
   * Get userProvince
   *
   * @return userProvince
   */
  @ApiModelProperty(value = "")
  public String getUserProvince() {
    return userProvince;
  }

  public void setUserProvince(String userProvince) {
    this.userProvince = userProvince;
  }

  public EcommerceOrderListStruct userCity(String userCity) {
    this.userCity = userCity;
    return this;
  }

  /**
   * Get userCity
   *
   * @return userCity
   */
  @ApiModelProperty(value = "")
  public String getUserCity() {
    return userCity;
  }

  public void setUserCity(String userCity) {
    this.userCity = userCity;
  }

  public EcommerceOrderListStruct userArea(String userArea) {
    this.userArea = userArea;
    return this;
  }

  /**
   * Get userArea
   *
   * @return userArea
   */
  @ApiModelProperty(value = "")
  public String getUserArea() {
    return userArea;
  }

  public void setUserArea(String userArea) {
    this.userArea = userArea;
  }

  public EcommerceOrderListStruct userAddress(String userAddress) {
    this.userAddress = userAddress;
    return this;
  }

  /**
   * Get userAddress
   *
   * @return userAddress
   */
  @ApiModelProperty(value = "")
  public String getUserAddress() {
    return userAddress;
  }

  public void setUserAddress(String userAddress) {
    this.userAddress = userAddress;
  }

  public EcommerceOrderListStruct userIp(String userIp) {
    this.userIp = userIp;
    return this;
  }

  /**
   * Get userIp
   *
   * @return userIp
   */
  @ApiModelProperty(value = "")
  public String getUserIp() {
    return userIp;
  }

  public void setUserIp(String userIp) {
    this.userIp = userIp;
  }

  public EcommerceOrderListStruct userMessage(String userMessage) {
    this.userMessage = userMessage;
    return this;
  }

  /**
   * Get userMessage
   *
   * @return userMessage
   */
  @ApiModelProperty(value = "")
  public String getUserMessage() {
    return userMessage;
  }

  public void setUserMessage(String userMessage) {
    this.userMessage = userMessage;
  }

  public EcommerceOrderListStruct destinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
    return this;
  }

  /**
   * Get destinationUrl
   *
   * @return destinationUrl
   */
  @ApiModelProperty(value = "")
  public String getDestinationUrl() {
    return destinationUrl;
  }

  public void setDestinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
  }

  public EcommerceOrderListStruct adgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
    return this;
  }

  /**
   * Get adgroupId
   *
   * @return adgroupId
   */
  @ApiModelProperty(value = "")
  public Long getAdgroupId() {
    return adgroupId;
  }

  public void setAdgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
  }

  public EcommerceOrderListStruct adgroupName(String adgroupName) {
    this.adgroupName = adgroupName;
    return this;
  }

  /**
   * Get adgroupName
   *
   * @return adgroupName
   */
  @ApiModelProperty(value = "")
  public String getAdgroupName() {
    return adgroupName;
  }

  public void setAdgroupName(String adgroupName) {
    this.adgroupName = adgroupName;
  }

  public EcommerceOrderListStruct fromAccountId(Long fromAccountId) {
    this.fromAccountId = fromAccountId;
    return this;
  }

  /**
   * Get fromAccountId
   *
   * @return fromAccountId
   */
  @ApiModelProperty(value = "")
  public Long getFromAccountId() {
    return fromAccountId;
  }

  public void setFromAccountId(Long fromAccountId) {
    this.fromAccountId = fromAccountId;
  }

  public EcommerceOrderListStruct deliverySpec(DeliverySpec deliverySpec) {
    this.deliverySpec = deliverySpec;
    return this;
  }

  /**
   * Get deliverySpec
   *
   * @return deliverySpec
   */
  @ApiModelProperty(value = "")
  public DeliverySpec getDeliverySpec() {
    return deliverySpec;
  }

  public void setDeliverySpec(DeliverySpec deliverySpec) {
    this.deliverySpec = deliverySpec;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EcommerceOrderListStruct ecommerceOrderListStruct = (EcommerceOrderListStruct) o;
    return Objects.equals(this.accountId, ecommerceOrderListStruct.accountId)
        && Objects.equals(this.ecommerceOrderId, ecommerceOrderListStruct.ecommerceOrderId)
        && Objects.equals(this.customizedPageName, ecommerceOrderListStruct.customizedPageName)
        && Objects.equals(
            this.commodityPackageDetail, ecommerceOrderListStruct.commodityPackageDetail)
        && Objects.equals(this.quantity, ecommerceOrderListStruct.quantity)
        && Objects.equals(this.price, ecommerceOrderListStruct.price)
        && Objects.equals(this.totalPrice, ecommerceOrderListStruct.totalPrice)
        && Objects.equals(this.ecommerceOrderTime, ecommerceOrderListStruct.ecommerceOrderTime)
        && Objects.equals(this.ecommerceOrderStatus, ecommerceOrderListStruct.ecommerceOrderStatus)
        && Objects.equals(this.userName, ecommerceOrderListStruct.userName)
        && Objects.equals(this.userPhone, ecommerceOrderListStruct.userPhone)
        && Objects.equals(this.userProvince, ecommerceOrderListStruct.userProvince)
        && Objects.equals(this.userCity, ecommerceOrderListStruct.userCity)
        && Objects.equals(this.userArea, ecommerceOrderListStruct.userArea)
        && Objects.equals(this.userAddress, ecommerceOrderListStruct.userAddress)
        && Objects.equals(this.userIp, ecommerceOrderListStruct.userIp)
        && Objects.equals(this.userMessage, ecommerceOrderListStruct.userMessage)
        && Objects.equals(this.destinationUrl, ecommerceOrderListStruct.destinationUrl)
        && Objects.equals(this.adgroupId, ecommerceOrderListStruct.adgroupId)
        && Objects.equals(this.adgroupName, ecommerceOrderListStruct.adgroupName)
        && Objects.equals(this.fromAccountId, ecommerceOrderListStruct.fromAccountId)
        && Objects.equals(this.deliverySpec, ecommerceOrderListStruct.deliverySpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        ecommerceOrderId,
        customizedPageName,
        commodityPackageDetail,
        quantity,
        price,
        totalPrice,
        ecommerceOrderTime,
        ecommerceOrderStatus,
        userName,
        userPhone,
        userProvince,
        userCity,
        userArea,
        userAddress,
        userIp,
        userMessage,
        destinationUrl,
        adgroupId,
        adgroupName,
        fromAccountId,
        deliverySpec);
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

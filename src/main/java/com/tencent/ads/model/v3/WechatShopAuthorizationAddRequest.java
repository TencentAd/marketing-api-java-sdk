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
import java.util.Objects;

/** WechatShopAuthorizationAddRequest */
public class WechatShopAuthorizationAddRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("wechat_channels_shop_name")
  private String wechatChannelsShopName = null;

  @SerializedName("authorization_ttl")
  private Long authorizationTtl = null;

  public WechatShopAuthorizationAddRequest accountId(Long accountId) {
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

  public WechatShopAuthorizationAddRequest wechatChannelsShopName(String wechatChannelsShopName) {
    this.wechatChannelsShopName = wechatChannelsShopName;
    return this;
  }

  /**
   * Get wechatChannelsShopName
   *
   * @return wechatChannelsShopName
   */
  @ApiModelProperty(value = "")
  public String getWechatChannelsShopName() {
    return wechatChannelsShopName;
  }

  public void setWechatChannelsShopName(String wechatChannelsShopName) {
    this.wechatChannelsShopName = wechatChannelsShopName;
  }

  public WechatShopAuthorizationAddRequest authorizationTtl(Long authorizationTtl) {
    this.authorizationTtl = authorizationTtl;
    return this;
  }

  /**
   * Get authorizationTtl
   *
   * @return authorizationTtl
   */
  @ApiModelProperty(value = "")
  public Long getAuthorizationTtl() {
    return authorizationTtl;
  }

  public void setAuthorizationTtl(Long authorizationTtl) {
    this.authorizationTtl = authorizationTtl;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WechatShopAuthorizationAddRequest wechatShopAuthorizationAddRequest =
        (WechatShopAuthorizationAddRequest) o;
    return Objects.equals(this.accountId, wechatShopAuthorizationAddRequest.accountId)
        && Objects.equals(
            this.wechatChannelsShopName, wechatShopAuthorizationAddRequest.wechatChannelsShopName)
        && Objects.equals(
            this.authorizationTtl, wechatShopAuthorizationAddRequest.authorizationTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, wechatChannelsShopName, authorizationTtl);
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

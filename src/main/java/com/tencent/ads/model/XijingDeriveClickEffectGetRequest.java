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
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** XijingDeriveClickEffectGetRequest */
public class XijingDeriveClickEffectGetRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("type")
  private String type = null;

  public XijingDeriveClickEffectGetRequest accountId(Long accountId) {
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

  public XijingDeriveClickEffectGetRequest type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XijingDeriveClickEffectGetRequest xijingDeriveClickEffectGetRequest =
        (XijingDeriveClickEffectGetRequest) o;
    return Objects.equals(this.accountId, xijingDeriveClickEffectGetRequest.accountId)
        && Objects.equals(this.type, xijingDeriveClickEffectGetRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, type);
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

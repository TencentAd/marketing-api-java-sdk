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

/** 附近推微信账户更多信息 */
@ApiModel(description = "附近推微信账户更多信息")
public class LocalWechatFundSpec {
  @SerializedName("cash_usable_amount")
  private Long cashUsableAmount = null;

  @SerializedName("gift_usable_amount")
  private Long giftUsableAmount = null;

  @SerializedName("cash_locked_amount")
  private Long cashLockedAmount = null;

  @SerializedName("gift_locked_amount")
  private Long giftLockedAmount = null;

  public LocalWechatFundSpec cashUsableAmount(Long cashUsableAmount) {
    this.cashUsableAmount = cashUsableAmount;
    return this;
  }

  /**
   * Get cashUsableAmount
   *
   * @return cashUsableAmount
   */
  @ApiModelProperty(value = "")
  public Long getCashUsableAmount() {
    return cashUsableAmount;
  }

  public void setCashUsableAmount(Long cashUsableAmount) {
    this.cashUsableAmount = cashUsableAmount;
  }

  public LocalWechatFundSpec giftUsableAmount(Long giftUsableAmount) {
    this.giftUsableAmount = giftUsableAmount;
    return this;
  }

  /**
   * Get giftUsableAmount
   *
   * @return giftUsableAmount
   */
  @ApiModelProperty(value = "")
  public Long getGiftUsableAmount() {
    return giftUsableAmount;
  }

  public void setGiftUsableAmount(Long giftUsableAmount) {
    this.giftUsableAmount = giftUsableAmount;
  }

  public LocalWechatFundSpec cashLockedAmount(Long cashLockedAmount) {
    this.cashLockedAmount = cashLockedAmount;
    return this;
  }

  /**
   * Get cashLockedAmount
   *
   * @return cashLockedAmount
   */
  @ApiModelProperty(value = "")
  public Long getCashLockedAmount() {
    return cashLockedAmount;
  }

  public void setCashLockedAmount(Long cashLockedAmount) {
    this.cashLockedAmount = cashLockedAmount;
  }

  public LocalWechatFundSpec giftLockedAmount(Long giftLockedAmount) {
    this.giftLockedAmount = giftLockedAmount;
    return this;
  }

  /**
   * Get giftLockedAmount
   *
   * @return giftLockedAmount
   */
  @ApiModelProperty(value = "")
  public Long getGiftLockedAmount() {
    return giftLockedAmount;
  }

  public void setGiftLockedAmount(Long giftLockedAmount) {
    this.giftLockedAmount = giftLockedAmount;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalWechatFundSpec localWechatFundSpec = (LocalWechatFundSpec) o;
    return Objects.equals(this.cashUsableAmount, localWechatFundSpec.cashUsableAmount)
        && Objects.equals(this.giftUsableAmount, localWechatFundSpec.giftUsableAmount)
        && Objects.equals(this.cashLockedAmount, localWechatFundSpec.cashLockedAmount)
        && Objects.equals(this.giftLockedAmount, localWechatFundSpec.giftLockedAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cashUsableAmount, giftUsableAmount, cashLockedAmount, giftLockedAmount);
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

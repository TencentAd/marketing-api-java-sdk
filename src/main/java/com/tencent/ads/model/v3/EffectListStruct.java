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

/** 返回结构 */
@ApiModel(description = "返回结构")
public class EffectListStruct {
  @SerializedName("effect_date")
  private String effectDate = null;

  @SerializedName("expire_date")
  private String expireDate = null;

  @SerializedName("amount")
  private Long amount = null;

  public EffectListStruct effectDate(String effectDate) {
    this.effectDate = effectDate;
    return this;
  }

  /**
   * Get effectDate
   *
   * @return effectDate
   */
  @ApiModelProperty(value = "")
  public String getEffectDate() {
    return effectDate;
  }

  public void setEffectDate(String effectDate) {
    this.effectDate = effectDate;
  }

  public EffectListStruct expireDate(String expireDate) {
    this.expireDate = expireDate;
    return this;
  }

  /**
   * Get expireDate
   *
   * @return expireDate
   */
  @ApiModelProperty(value = "")
  public String getExpireDate() {
    return expireDate;
  }

  public void setExpireDate(String expireDate) {
    this.expireDate = expireDate;
  }

  public EffectListStruct amount(Long amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   *
   * @return amount
   */
  @ApiModelProperty(value = "")
  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EffectListStruct effectListStruct = (EffectListStruct) o;
    return Objects.equals(this.effectDate, effectListStruct.effectDate)
        && Objects.equals(this.expireDate, effectListStruct.expireDate)
        && Objects.equals(this.amount, effectListStruct.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectDate, expireDate, amount);
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
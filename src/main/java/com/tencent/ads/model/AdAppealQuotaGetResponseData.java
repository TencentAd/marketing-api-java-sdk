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

/** AdAppealQuotaGetResponseData */
public class AdAppealQuotaGetResponseData {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("has_privilege")
  private Long hasPrivilege = null;

  @SerializedName("daily_quota")
  private Long dailyQuota = null;

  @SerializedName("leave_quota")
  private Long leaveQuota = null;

  public AdAppealQuotaGetResponseData accountId(Long accountId) {
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

  public AdAppealQuotaGetResponseData hasPrivilege(Long hasPrivilege) {
    this.hasPrivilege = hasPrivilege;
    return this;
  }

  /**
   * Get hasPrivilege
   *
   * @return hasPrivilege
   */
  @ApiModelProperty(value = "")
  public Long getHasPrivilege() {
    return hasPrivilege;
  }

  public void setHasPrivilege(Long hasPrivilege) {
    this.hasPrivilege = hasPrivilege;
  }

  public AdAppealQuotaGetResponseData dailyQuota(Long dailyQuota) {
    this.dailyQuota = dailyQuota;
    return this;
  }

  /**
   * Get dailyQuota
   *
   * @return dailyQuota
   */
  @ApiModelProperty(value = "")
  public Long getDailyQuota() {
    return dailyQuota;
  }

  public void setDailyQuota(Long dailyQuota) {
    this.dailyQuota = dailyQuota;
  }

  public AdAppealQuotaGetResponseData leaveQuota(Long leaveQuota) {
    this.leaveQuota = leaveQuota;
    return this;
  }

  /**
   * Get leaveQuota
   *
   * @return leaveQuota
   */
  @ApiModelProperty(value = "")
  public Long getLeaveQuota() {
    return leaveQuota;
  }

  public void setLeaveQuota(Long leaveQuota) {
    this.leaveQuota = leaveQuota;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdAppealQuotaGetResponseData adAppealQuotaGetResponseData = (AdAppealQuotaGetResponseData) o;
    return Objects.equals(this.accountId, adAppealQuotaGetResponseData.accountId)
        && Objects.equals(this.hasPrivilege, adAppealQuotaGetResponseData.hasPrivilege)
        && Objects.equals(this.dailyQuota, adAppealQuotaGetResponseData.dailyQuota)
        && Objects.equals(this.leaveQuota, adAppealQuotaGetResponseData.leaveQuota);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, hasPrivilege, dailyQuota, leaveQuota);
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

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

/** 修改广告衍生创意配置出价 */
@ApiModel(description = "修改广告衍生创意配置出价")
public class UpdateAdgroupDeriveConfItem {
  @SerializedName("adgroup_id")
  private Long adgroupId = null;

  @SerializedName("auto_derived_creative_enabled")
  private Boolean autoDerivedCreativeEnabled = null;

  @SerializedName("derive_template_conf")
  private DeriveTemplateConf deriveTemplateConf = null;

  @SerializedName("account_id")
  private Long accountId = null;

  public UpdateAdgroupDeriveConfItem adgroupId(Long adgroupId) {
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

  public UpdateAdgroupDeriveConfItem autoDerivedCreativeEnabled(
      Boolean autoDerivedCreativeEnabled) {
    this.autoDerivedCreativeEnabled = autoDerivedCreativeEnabled;
    return this;
  }

  /**
   * Get autoDerivedCreativeEnabled
   *
   * @return autoDerivedCreativeEnabled
   */
  @ApiModelProperty(value = "")
  public Boolean isAutoDerivedCreativeEnabled() {
    return autoDerivedCreativeEnabled;
  }

  public void setAutoDerivedCreativeEnabled(Boolean autoDerivedCreativeEnabled) {
    this.autoDerivedCreativeEnabled = autoDerivedCreativeEnabled;
  }

  public UpdateAdgroupDeriveConfItem deriveTemplateConf(DeriveTemplateConf deriveTemplateConf) {
    this.deriveTemplateConf = deriveTemplateConf;
    return this;
  }

  /**
   * Get deriveTemplateConf
   *
   * @return deriveTemplateConf
   */
  @ApiModelProperty(value = "")
  public DeriveTemplateConf getDeriveTemplateConf() {
    return deriveTemplateConf;
  }

  public void setDeriveTemplateConf(DeriveTemplateConf deriveTemplateConf) {
    this.deriveTemplateConf = deriveTemplateConf;
  }

  public UpdateAdgroupDeriveConfItem accountId(Long accountId) {
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAdgroupDeriveConfItem updateAdgroupDeriveConfItem = (UpdateAdgroupDeriveConfItem) o;
    return Objects.equals(this.adgroupId, updateAdgroupDeriveConfItem.adgroupId)
        && Objects.equals(
            this.autoDerivedCreativeEnabled, updateAdgroupDeriveConfItem.autoDerivedCreativeEnabled)
        && Objects.equals(this.deriveTemplateConf, updateAdgroupDeriveConfItem.deriveTemplateConf)
        && Objects.equals(this.accountId, updateAdgroupDeriveConfItem.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adgroupId, autoDerivedCreativeEnabled, deriveTemplateConf, accountId);
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

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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 智能定向功能,功能灰度开放，如需使用可联系您的运营接口同学。&lt;br&gt;智能定向功能与自动扩量/系统优选相关字段不可同时设置。2022年6月30日起，智能定向无法与行为兴趣意向、“二方人群”人群包同时使用
 */
@ApiModel(
    description =
        "智能定向功能,功能灰度开放，如需使用可联系您的运营接口同学。<br>智能定向功能与自动扩量/系统优选相关字段不可同时设置。2022年6月30日起，智能定向无法与行为兴趣意向、“二方人群”人群包同时使用")
public class SmartTargeting {
  @SerializedName("smart_targeting_version")
  private Long smartTargetingVersion = null;

  @SerializedName("smart_targeting_switch")
  private Boolean smartTargetingSwitch = null;

  @SerializedName("start_audience")
  private List<Long> startAudience = null;

  @SerializedName("unbreakable_targeting")
  private UnbreakableTargetingSetting unbreakableTargeting = null;

  public SmartTargeting smartTargetingVersion(Long smartTargetingVersion) {
    this.smartTargetingVersion = smartTargetingVersion;
    return this;
  }

  /**
   * Get smartTargetingVersion
   *
   * @return smartTargetingVersion
   */
  @ApiModelProperty(value = "")
  public Long getSmartTargetingVersion() {
    return smartTargetingVersion;
  }

  public void setSmartTargetingVersion(Long smartTargetingVersion) {
    this.smartTargetingVersion = smartTargetingVersion;
  }

  public SmartTargeting smartTargetingSwitch(Boolean smartTargetingSwitch) {
    this.smartTargetingSwitch = smartTargetingSwitch;
    return this;
  }

  /**
   * Get smartTargetingSwitch
   *
   * @return smartTargetingSwitch
   */
  @ApiModelProperty(value = "")
  public Boolean isSmartTargetingSwitch() {
    return smartTargetingSwitch;
  }

  public void setSmartTargetingSwitch(Boolean smartTargetingSwitch) {
    this.smartTargetingSwitch = smartTargetingSwitch;
  }

  public SmartTargeting startAudience(List<Long> startAudience) {
    this.startAudience = startAudience;
    return this;
  }

  public SmartTargeting addStartAudienceItem(Long startAudienceItem) {
    if (this.startAudience == null) {
      this.startAudience = new ArrayList<Long>();
    }
    this.startAudience.add(startAudienceItem);
    return this;
  }

  /**
   * Get startAudience
   *
   * @return startAudience
   */
  @ApiModelProperty(value = "")
  public List<Long> getStartAudience() {
    return startAudience;
  }

  public void setStartAudience(List<Long> startAudience) {
    this.startAudience = startAudience;
  }

  public SmartTargeting unbreakableTargeting(UnbreakableTargetingSetting unbreakableTargeting) {
    this.unbreakableTargeting = unbreakableTargeting;
    return this;
  }

  /**
   * Get unbreakableTargeting
   *
   * @return unbreakableTargeting
   */
  @ApiModelProperty(value = "")
  public UnbreakableTargetingSetting getUnbreakableTargeting() {
    return unbreakableTargeting;
  }

  public void setUnbreakableTargeting(UnbreakableTargetingSetting unbreakableTargeting) {
    this.unbreakableTargeting = unbreakableTargeting;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTargeting smartTargeting = (SmartTargeting) o;
    return Objects.equals(this.smartTargetingVersion, smartTargeting.smartTargetingVersion)
        && Objects.equals(this.smartTargetingSwitch, smartTargeting.smartTargetingSwitch)
        && Objects.equals(this.startAudience, smartTargeting.startAudience)
        && Objects.equals(this.unbreakableTargeting, smartTargeting.unbreakableTargeting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        smartTargetingVersion, smartTargetingSwitch, startAudience, unbreakableTargeting);
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

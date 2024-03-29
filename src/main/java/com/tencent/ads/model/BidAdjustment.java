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

/** 出价系数设置内容，仅当投放oCPC、oCPM广告时可使用 */
@ApiModel(description = "出价系数设置内容，仅当投放oCPC、oCPM广告时可使用")
public class BidAdjustment {
  @SerializedName("site_set_package")
  private List<SiteSetPackageStruct> siteSetPackage = null;

  @SerializedName("region_group_package")
  private List<RegionGroupPackageStruct> regionGroupPackage = null;

  public BidAdjustment siteSetPackage(List<SiteSetPackageStruct> siteSetPackage) {
    this.siteSetPackage = siteSetPackage;
    return this;
  }

  public BidAdjustment addSiteSetPackageItem(SiteSetPackageStruct siteSetPackageItem) {
    if (this.siteSetPackage == null) {
      this.siteSetPackage = new ArrayList<SiteSetPackageStruct>();
    }
    this.siteSetPackage.add(siteSetPackageItem);
    return this;
  }

  /**
   * Get siteSetPackage
   *
   * @return siteSetPackage
   */
  @ApiModelProperty(value = "")
  public List<SiteSetPackageStruct> getSiteSetPackage() {
    return siteSetPackage;
  }

  public void setSiteSetPackage(List<SiteSetPackageStruct> siteSetPackage) {
    this.siteSetPackage = siteSetPackage;
  }

  public BidAdjustment regionGroupPackage(List<RegionGroupPackageStruct> regionGroupPackage) {
    this.regionGroupPackage = regionGroupPackage;
    return this;
  }

  public BidAdjustment addRegionGroupPackageItem(RegionGroupPackageStruct regionGroupPackageItem) {
    if (this.regionGroupPackage == null) {
      this.regionGroupPackage = new ArrayList<RegionGroupPackageStruct>();
    }
    this.regionGroupPackage.add(regionGroupPackageItem);
    return this;
  }

  /**
   * Get regionGroupPackage
   *
   * @return regionGroupPackage
   */
  @ApiModelProperty(value = "")
  public List<RegionGroupPackageStruct> getRegionGroupPackage() {
    return regionGroupPackage;
  }

  public void setRegionGroupPackage(List<RegionGroupPackageStruct> regionGroupPackage) {
    this.regionGroupPackage = regionGroupPackage;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BidAdjustment bidAdjustment = (BidAdjustment) o;
    return Objects.equals(this.siteSetPackage, bidAdjustment.siteSetPackage)
        && Objects.equals(this.regionGroupPackage, bidAdjustment.regionGroupPackage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siteSetPackage, regionGroupPackage);
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

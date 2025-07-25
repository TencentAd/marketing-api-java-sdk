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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** 流量覆盖披露引导操作项 */
@ApiModel(description = "流量覆盖披露引导操作项")
public class SuggestActionItem {
  @SerializedName("action_id")
  private CoverageActionType actionId = null;

  @SerializedName("material_type")
  private String materialType = null;

  @SerializedName("tips")
  private String tips = null;

  @SerializedName("site_set")
  private List<String> siteSet = null;

  public SuggestActionItem actionId(CoverageActionType actionId) {
    this.actionId = actionId;
    return this;
  }

  /**
   * Get actionId
   *
   * @return actionId
   */
  @ApiModelProperty(value = "")
  public CoverageActionType getActionId() {
    return actionId;
  }

  public void setActionId(CoverageActionType actionId) {
    this.actionId = actionId;
  }

  public SuggestActionItem materialType(String materialType) {
    this.materialType = materialType;
    return this;
  }

  /**
   * Get materialType
   *
   * @return materialType
   */
  @ApiModelProperty(value = "")
  public String getMaterialType() {
    return materialType;
  }

  public void setMaterialType(String materialType) {
    this.materialType = materialType;
  }

  public SuggestActionItem tips(String tips) {
    this.tips = tips;
    return this;
  }

  /**
   * Get tips
   *
   * @return tips
   */
  @ApiModelProperty(value = "")
  public String getTips() {
    return tips;
  }

  public void setTips(String tips) {
    this.tips = tips;
  }

  public SuggestActionItem siteSet(List<String> siteSet) {
    this.siteSet = siteSet;
    return this;
  }

  public SuggestActionItem addSiteSetItem(String siteSetItem) {
    if (this.siteSet == null) {
      this.siteSet = new ArrayList<String>();
    }
    this.siteSet.add(siteSetItem);
    return this;
  }

  /**
   * Get siteSet
   *
   * @return siteSet
   */
  @ApiModelProperty(value = "")
  public List<String> getSiteSet() {
    return siteSet;
  }

  public void setSiteSet(List<String> siteSet) {
    this.siteSet = siteSet;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestActionItem suggestActionItem = (SuggestActionItem) o;
    return Objects.equals(this.actionId, suggestActionItem.actionId)
        && Objects.equals(this.materialType, suggestActionItem.materialType)
        && Objects.equals(this.tips, suggestActionItem.tips)
        && Objects.equals(this.siteSet, suggestActionItem.siteSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionId, materialType, tips, siteSet);
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

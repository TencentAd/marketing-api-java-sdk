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

/** 搜索整账户下载数据查询条件 */
@ApiModel(description = "搜索整账户下载数据查询条件")
public class TaskTypeSearchDownloadAllSpec {
  @SerializedName("campaign_ids")
  private List<Long> campaignIds = null;

  public TaskTypeSearchDownloadAllSpec campaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public TaskTypeSearchDownloadAllSpec addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<Long>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

  /**
   * Get campaignIds
   *
   * @return campaignIds
   */
  @ApiModelProperty(value = "")
  public List<Long> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskTypeSearchDownloadAllSpec taskTypeSearchDownloadAllSpec = (TaskTypeSearchDownloadAllSpec) o;
    return Objects.equals(this.campaignIds, taskTypeSearchDownloadAllSpec.campaignIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignIds);
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

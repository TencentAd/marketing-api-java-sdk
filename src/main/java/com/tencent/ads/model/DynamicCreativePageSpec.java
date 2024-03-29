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

/** 落地页信息 */
@ApiModel(description = "落地页信息")
public class DynamicCreativePageSpec {
  @SerializedName("page_id")
  private Long pageId = null;

  @SerializedName("page_url")
  private String pageUrl = null;

  @SerializedName("channels_shop_product_spec")
  private ChannelsShopProductSpec channelsShopProductSpec = null;

  public DynamicCreativePageSpec pageId(Long pageId) {
    this.pageId = pageId;
    return this;
  }

  /**
   * Get pageId
   *
   * @return pageId
   */
  @ApiModelProperty(value = "")
  public Long getPageId() {
    return pageId;
  }

  public void setPageId(Long pageId) {
    this.pageId = pageId;
  }

  public DynamicCreativePageSpec pageUrl(String pageUrl) {
    this.pageUrl = pageUrl;
    return this;
  }

  /**
   * Get pageUrl
   *
   * @return pageUrl
   */
  @ApiModelProperty(value = "")
  public String getPageUrl() {
    return pageUrl;
  }

  public void setPageUrl(String pageUrl) {
    this.pageUrl = pageUrl;
  }

  public DynamicCreativePageSpec channelsShopProductSpec(
      ChannelsShopProductSpec channelsShopProductSpec) {
    this.channelsShopProductSpec = channelsShopProductSpec;
    return this;
  }

  /**
   * Get channelsShopProductSpec
   *
   * @return channelsShopProductSpec
   */
  @ApiModelProperty(value = "")
  public ChannelsShopProductSpec getChannelsShopProductSpec() {
    return channelsShopProductSpec;
  }

  public void setChannelsShopProductSpec(ChannelsShopProductSpec channelsShopProductSpec) {
    this.channelsShopProductSpec = channelsShopProductSpec;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicCreativePageSpec dynamicCreativePageSpec = (DynamicCreativePageSpec) o;
    return Objects.equals(this.pageId, dynamicCreativePageSpec.pageId)
        && Objects.equals(this.pageUrl, dynamicCreativePageSpec.pageUrl)
        && Objects.equals(
            this.channelsShopProductSpec, dynamicCreativePageSpec.channelsShopProductSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageId, pageUrl, channelsShopProductSpec);
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

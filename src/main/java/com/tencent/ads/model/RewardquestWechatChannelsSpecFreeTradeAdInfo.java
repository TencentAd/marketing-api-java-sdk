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

/** 小任务中间页 */
@ApiModel(description = "小任务中间页")
public class RewardquestWechatChannelsSpecFreeTradeAdInfo {
  @SerializedName("thumb")
  private RewardquestWechatChannelsSpecImageInfo thumb = null;

  @SerializedName("image_list")
  private List<RewardquestWechatChannelsSpecImageInfo> imageList = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("back_color_rgb")
  private String backColorRgb = null;

  @SerializedName("dynamic_show_type")
  private ConversionDataType dynamicShowType = null;

  @SerializedName("dynamic_show_text")
  private ConversionTargetType dynamicShowText = null;

  @SerializedName("btn_text")
  private LinkUrlLinkNameType btnText = null;

  public RewardquestWechatChannelsSpecFreeTradeAdInfo thumb(
      RewardquestWechatChannelsSpecImageInfo thumb) {
    this.thumb = thumb;
    return this;
  }

  /**
   * Get thumb
   *
   * @return thumb
   */
  @ApiModelProperty(value = "")
  public RewardquestWechatChannelsSpecImageInfo getThumb() {
    return thumb;
  }

  public void setThumb(RewardquestWechatChannelsSpecImageInfo thumb) {
    this.thumb = thumb;
  }

  public RewardquestWechatChannelsSpecFreeTradeAdInfo imageList(
      List<RewardquestWechatChannelsSpecImageInfo> imageList) {
    this.imageList = imageList;
    return this;
  }

  public RewardquestWechatChannelsSpecFreeTradeAdInfo addImageListItem(
      RewardquestWechatChannelsSpecImageInfo imageListItem) {
    if (this.imageList == null) {
      this.imageList = new ArrayList<RewardquestWechatChannelsSpecImageInfo>();
    }
    this.imageList.add(imageListItem);
    return this;
  }

  /**
   * Get imageList
   *
   * @return imageList
   */
  @ApiModelProperty(value = "")
  public List<RewardquestWechatChannelsSpecImageInfo> getImageList() {
    return imageList;
  }

  public void setImageList(List<RewardquestWechatChannelsSpecImageInfo> imageList) {
    this.imageList = imageList;
  }

  public RewardquestWechatChannelsSpecFreeTradeAdInfo title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   *
   * @return title
   */
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public RewardquestWechatChannelsSpecFreeTradeAdInfo desc(String desc) {
    this.desc = desc;
    return this;
  }

  /**
   * Get desc
   *
   * @return desc
   */
  @ApiModelProperty(value = "")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public RewardquestWechatChannelsSpecFreeTradeAdInfo backColorRgb(String backColorRgb) {
    this.backColorRgb = backColorRgb;
    return this;
  }

  /**
   * Get backColorRgb
   *
   * @return backColorRgb
   */
  @ApiModelProperty(value = "")
  public String getBackColorRgb() {
    return backColorRgb;
  }

  public void setBackColorRgb(String backColorRgb) {
    this.backColorRgb = backColorRgb;
  }

  public RewardquestWechatChannelsSpecFreeTradeAdInfo dynamicShowType(
      ConversionDataType dynamicShowType) {
    this.dynamicShowType = dynamicShowType;
    return this;
  }

  /**
   * Get dynamicShowType
   *
   * @return dynamicShowType
   */
  @ApiModelProperty(value = "")
  public ConversionDataType getDynamicShowType() {
    return dynamicShowType;
  }

  public void setDynamicShowType(ConversionDataType dynamicShowType) {
    this.dynamicShowType = dynamicShowType;
  }

  public RewardquestWechatChannelsSpecFreeTradeAdInfo dynamicShowText(
      ConversionTargetType dynamicShowText) {
    this.dynamicShowText = dynamicShowText;
    return this;
  }

  /**
   * Get dynamicShowText
   *
   * @return dynamicShowText
   */
  @ApiModelProperty(value = "")
  public ConversionTargetType getDynamicShowText() {
    return dynamicShowText;
  }

  public void setDynamicShowText(ConversionTargetType dynamicShowText) {
    this.dynamicShowText = dynamicShowText;
  }

  public RewardquestWechatChannelsSpecFreeTradeAdInfo btnText(LinkUrlLinkNameType btnText) {
    this.btnText = btnText;
    return this;
  }

  /**
   * Get btnText
   *
   * @return btnText
   */
  @ApiModelProperty(value = "")
  public LinkUrlLinkNameType getBtnText() {
    return btnText;
  }

  public void setBtnText(LinkUrlLinkNameType btnText) {
    this.btnText = btnText;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RewardquestWechatChannelsSpecFreeTradeAdInfo rewardquestWechatChannelsSpecFreeTradeAdInfo =
        (RewardquestWechatChannelsSpecFreeTradeAdInfo) o;
    return Objects.equals(this.thumb, rewardquestWechatChannelsSpecFreeTradeAdInfo.thumb)
        && Objects.equals(this.imageList, rewardquestWechatChannelsSpecFreeTradeAdInfo.imageList)
        && Objects.equals(this.title, rewardquestWechatChannelsSpecFreeTradeAdInfo.title)
        && Objects.equals(this.desc, rewardquestWechatChannelsSpecFreeTradeAdInfo.desc)
        && Objects.equals(
            this.backColorRgb, rewardquestWechatChannelsSpecFreeTradeAdInfo.backColorRgb)
        && Objects.equals(
            this.dynamicShowType, rewardquestWechatChannelsSpecFreeTradeAdInfo.dynamicShowType)
        && Objects.equals(
            this.dynamicShowText, rewardquestWechatChannelsSpecFreeTradeAdInfo.dynamicShowText)
        && Objects.equals(this.btnText, rewardquestWechatChannelsSpecFreeTradeAdInfo.btnText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        thumb, imageList, title, desc, backColorRgb, dynamicShowType, dynamicShowText, btnText);
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

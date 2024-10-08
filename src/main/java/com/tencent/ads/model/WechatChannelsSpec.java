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

/** 微信视频号落地页 */
@ApiModel(description = "微信视频号落地页")
public class WechatChannelsSpec {
  @SerializedName("id")
  private String id = null;

  @SerializedName("nonce_id")
  private String nonceId = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("live_id")
  private String liveId = null;

  @SerializedName("live_title")
  private String liveTitle = null;

  @SerializedName("live_notice_id")
  private String liveNoticeId = null;

  @SerializedName("nick_name")
  private String nickName = null;

  @SerializedName("live_ad_item")
  private WechatChannelsSpecFinderLiveAdItem liveAdItem = null;

  @SerializedName("feed_page_conf")
  private List<WechatChannelsSpecFeedPageConfItem> feedPageConf = null;

  @SerializedName("live_recycle_flag")
  private Long liveRecycleFlag = null;

  @SerializedName("free_trade_ad_info")
  private WechatChannelsSpecFreeTradeAdInfo freeTradeAdInfo = null;

  @SerializedName("rewardquest_free_trade_ad_info")
  private RewardquestWechatChannelsSpecFreeTradeAdInfo rewardquestFreeTradeAdInfo = null;

  @SerializedName("export_id_hash_value")
  private Long exportIdHashValue = null;

  @SerializedName("head_img_url")
  private String headImgUrl = null;

  public WechatChannelsSpec id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   *
   * @return id
   */
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public WechatChannelsSpec nonceId(String nonceId) {
    this.nonceId = nonceId;
    return this;
  }

  /**
   * Get nonceId
   *
   * @return nonceId
   */
  @ApiModelProperty(value = "")
  public String getNonceId() {
    return nonceId;
  }

  public void setNonceId(String nonceId) {
    this.nonceId = nonceId;
  }

  public WechatChannelsSpec username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   *
   * @return username
   */
  @ApiModelProperty(value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public WechatChannelsSpec liveId(String liveId) {
    this.liveId = liveId;
    return this;
  }

  /**
   * Get liveId
   *
   * @return liveId
   */
  @ApiModelProperty(value = "")
  public String getLiveId() {
    return liveId;
  }

  public void setLiveId(String liveId) {
    this.liveId = liveId;
  }

  public WechatChannelsSpec liveTitle(String liveTitle) {
    this.liveTitle = liveTitle;
    return this;
  }

  /**
   * Get liveTitle
   *
   * @return liveTitle
   */
  @ApiModelProperty(value = "")
  public String getLiveTitle() {
    return liveTitle;
  }

  public void setLiveTitle(String liveTitle) {
    this.liveTitle = liveTitle;
  }

  public WechatChannelsSpec liveNoticeId(String liveNoticeId) {
    this.liveNoticeId = liveNoticeId;
    return this;
  }

  /**
   * Get liveNoticeId
   *
   * @return liveNoticeId
   */
  @ApiModelProperty(value = "")
  public String getLiveNoticeId() {
    return liveNoticeId;
  }

  public void setLiveNoticeId(String liveNoticeId) {
    this.liveNoticeId = liveNoticeId;
  }

  public WechatChannelsSpec nickName(String nickName) {
    this.nickName = nickName;
    return this;
  }

  /**
   * Get nickName
   *
   * @return nickName
   */
  @ApiModelProperty(value = "")
  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public WechatChannelsSpec liveAdItem(WechatChannelsSpecFinderLiveAdItem liveAdItem) {
    this.liveAdItem = liveAdItem;
    return this;
  }

  /**
   * Get liveAdItem
   *
   * @return liveAdItem
   */
  @ApiModelProperty(value = "")
  public WechatChannelsSpecFinderLiveAdItem getLiveAdItem() {
    return liveAdItem;
  }

  public void setLiveAdItem(WechatChannelsSpecFinderLiveAdItem liveAdItem) {
    this.liveAdItem = liveAdItem;
  }

  public WechatChannelsSpec feedPageConf(List<WechatChannelsSpecFeedPageConfItem> feedPageConf) {
    this.feedPageConf = feedPageConf;
    return this;
  }

  public WechatChannelsSpec addFeedPageConfItem(
      WechatChannelsSpecFeedPageConfItem feedPageConfItem) {
    if (this.feedPageConf == null) {
      this.feedPageConf = new ArrayList<WechatChannelsSpecFeedPageConfItem>();
    }
    this.feedPageConf.add(feedPageConfItem);
    return this;
  }

  /**
   * Get feedPageConf
   *
   * @return feedPageConf
   */
  @ApiModelProperty(value = "")
  public List<WechatChannelsSpecFeedPageConfItem> getFeedPageConf() {
    return feedPageConf;
  }

  public void setFeedPageConf(List<WechatChannelsSpecFeedPageConfItem> feedPageConf) {
    this.feedPageConf = feedPageConf;
  }

  public WechatChannelsSpec liveRecycleFlag(Long liveRecycleFlag) {
    this.liveRecycleFlag = liveRecycleFlag;
    return this;
  }

  /**
   * Get liveRecycleFlag
   *
   * @return liveRecycleFlag
   */
  @ApiModelProperty(value = "")
  public Long getLiveRecycleFlag() {
    return liveRecycleFlag;
  }

  public void setLiveRecycleFlag(Long liveRecycleFlag) {
    this.liveRecycleFlag = liveRecycleFlag;
  }

  public WechatChannelsSpec freeTradeAdInfo(WechatChannelsSpecFreeTradeAdInfo freeTradeAdInfo) {
    this.freeTradeAdInfo = freeTradeAdInfo;
    return this;
  }

  /**
   * Get freeTradeAdInfo
   *
   * @return freeTradeAdInfo
   */
  @ApiModelProperty(value = "")
  public WechatChannelsSpecFreeTradeAdInfo getFreeTradeAdInfo() {
    return freeTradeAdInfo;
  }

  public void setFreeTradeAdInfo(WechatChannelsSpecFreeTradeAdInfo freeTradeAdInfo) {
    this.freeTradeAdInfo = freeTradeAdInfo;
  }

  public WechatChannelsSpec rewardquestFreeTradeAdInfo(
      RewardquestWechatChannelsSpecFreeTradeAdInfo rewardquestFreeTradeAdInfo) {
    this.rewardquestFreeTradeAdInfo = rewardquestFreeTradeAdInfo;
    return this;
  }

  /**
   * Get rewardquestFreeTradeAdInfo
   *
   * @return rewardquestFreeTradeAdInfo
   */
  @ApiModelProperty(value = "")
  public RewardquestWechatChannelsSpecFreeTradeAdInfo getRewardquestFreeTradeAdInfo() {
    return rewardquestFreeTradeAdInfo;
  }

  public void setRewardquestFreeTradeAdInfo(
      RewardquestWechatChannelsSpecFreeTradeAdInfo rewardquestFreeTradeAdInfo) {
    this.rewardquestFreeTradeAdInfo = rewardquestFreeTradeAdInfo;
  }

  public WechatChannelsSpec exportIdHashValue(Long exportIdHashValue) {
    this.exportIdHashValue = exportIdHashValue;
    return this;
  }

  /**
   * Get exportIdHashValue
   *
   * @return exportIdHashValue
   */
  @ApiModelProperty(value = "")
  public Long getExportIdHashValue() {
    return exportIdHashValue;
  }

  public void setExportIdHashValue(Long exportIdHashValue) {
    this.exportIdHashValue = exportIdHashValue;
  }

  public WechatChannelsSpec headImgUrl(String headImgUrl) {
    this.headImgUrl = headImgUrl;
    return this;
  }

  /**
   * Get headImgUrl
   *
   * @return headImgUrl
   */
  @ApiModelProperty(value = "")
  public String getHeadImgUrl() {
    return headImgUrl;
  }

  public void setHeadImgUrl(String headImgUrl) {
    this.headImgUrl = headImgUrl;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WechatChannelsSpec wechatChannelsSpec = (WechatChannelsSpec) o;
    return Objects.equals(this.id, wechatChannelsSpec.id)
        && Objects.equals(this.nonceId, wechatChannelsSpec.nonceId)
        && Objects.equals(this.username, wechatChannelsSpec.username)
        && Objects.equals(this.liveId, wechatChannelsSpec.liveId)
        && Objects.equals(this.liveTitle, wechatChannelsSpec.liveTitle)
        && Objects.equals(this.liveNoticeId, wechatChannelsSpec.liveNoticeId)
        && Objects.equals(this.nickName, wechatChannelsSpec.nickName)
        && Objects.equals(this.liveAdItem, wechatChannelsSpec.liveAdItem)
        && Objects.equals(this.feedPageConf, wechatChannelsSpec.feedPageConf)
        && Objects.equals(this.liveRecycleFlag, wechatChannelsSpec.liveRecycleFlag)
        && Objects.equals(this.freeTradeAdInfo, wechatChannelsSpec.freeTradeAdInfo)
        && Objects.equals(
            this.rewardquestFreeTradeAdInfo, wechatChannelsSpec.rewardquestFreeTradeAdInfo)
        && Objects.equals(this.exportIdHashValue, wechatChannelsSpec.exportIdHashValue)
        && Objects.equals(this.headImgUrl, wechatChannelsSpec.headImgUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        id,
        nonceId,
        username,
        liveId,
        liveTitle,
        liveNoticeId,
        nickName,
        liveAdItem,
        feedPageConf,
        liveRecycleFlag,
        freeTradeAdInfo,
        rewardquestFreeTradeAdInfo,
        exportIdHashValue,
        headImgUrl);
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

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

/** 按钮组件元素 */
@ApiModel(description = "按钮组件元素")
public class ElementButtonRead {
  @SerializedName("title")
  private String title = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("link_spec")
  private ElementButtonLinkSpec linkSpec = null;

  @SerializedName("app_ios_spec")
  private AppIosSpec appIosSpec = null;

  @SerializedName("app_android_spec")
  private AppAndroidSpec appAndroidSpec = null;

  @SerializedName("mini_program_spec")
  private MiniProgramSpec miniProgramSpec = null;

  @SerializedName("mini_game_program_spec")
  private MiniGameProgramSpec miniGameProgramSpec = null;

  @SerializedName("fengye_spec")
  private FengyeSpec fengyeSpec = null;

  @SerializedName("card_spec")
  private CardSpec cardSpec = null;

  @SerializedName("follow_spec")
  private FollowSpec followSpec = null;

  @SerializedName("service_spec")
  private ServiceSpec serviceSpec = null;

  @SerializedName("wecom_spec")
  private WecomSpec wecomSpec = null;

  @SerializedName("use_icon")
  private Long useIcon = null;

  @SerializedName("tel_spec")
  private TelSpec telSpec = null;

  @SerializedName("video_channel_spec")
  private VideoChannelSpec videoChannelSpec = null;

  public ElementButtonRead title(String title) {
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

  public ElementButtonRead url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   *
   * @return url
   */
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ElementButtonRead linkSpec(ElementButtonLinkSpec linkSpec) {
    this.linkSpec = linkSpec;
    return this;
  }

  /**
   * Get linkSpec
   *
   * @return linkSpec
   */
  @ApiModelProperty(value = "")
  public ElementButtonLinkSpec getLinkSpec() {
    return linkSpec;
  }

  public void setLinkSpec(ElementButtonLinkSpec linkSpec) {
    this.linkSpec = linkSpec;
  }

  public ElementButtonRead appIosSpec(AppIosSpec appIosSpec) {
    this.appIosSpec = appIosSpec;
    return this;
  }

  /**
   * Get appIosSpec
   *
   * @return appIosSpec
   */
  @ApiModelProperty(value = "")
  public AppIosSpec getAppIosSpec() {
    return appIosSpec;
  }

  public void setAppIosSpec(AppIosSpec appIosSpec) {
    this.appIosSpec = appIosSpec;
  }

  public ElementButtonRead appAndroidSpec(AppAndroidSpec appAndroidSpec) {
    this.appAndroidSpec = appAndroidSpec;
    return this;
  }

  /**
   * Get appAndroidSpec
   *
   * @return appAndroidSpec
   */
  @ApiModelProperty(value = "")
  public AppAndroidSpec getAppAndroidSpec() {
    return appAndroidSpec;
  }

  public void setAppAndroidSpec(AppAndroidSpec appAndroidSpec) {
    this.appAndroidSpec = appAndroidSpec;
  }

  public ElementButtonRead miniProgramSpec(MiniProgramSpec miniProgramSpec) {
    this.miniProgramSpec = miniProgramSpec;
    return this;
  }

  /**
   * Get miniProgramSpec
   *
   * @return miniProgramSpec
   */
  @ApiModelProperty(value = "")
  public MiniProgramSpec getMiniProgramSpec() {
    return miniProgramSpec;
  }

  public void setMiniProgramSpec(MiniProgramSpec miniProgramSpec) {
    this.miniProgramSpec = miniProgramSpec;
  }

  public ElementButtonRead miniGameProgramSpec(MiniGameProgramSpec miniGameProgramSpec) {
    this.miniGameProgramSpec = miniGameProgramSpec;
    return this;
  }

  /**
   * Get miniGameProgramSpec
   *
   * @return miniGameProgramSpec
   */
  @ApiModelProperty(value = "")
  public MiniGameProgramSpec getMiniGameProgramSpec() {
    return miniGameProgramSpec;
  }

  public void setMiniGameProgramSpec(MiniGameProgramSpec miniGameProgramSpec) {
    this.miniGameProgramSpec = miniGameProgramSpec;
  }

  public ElementButtonRead fengyeSpec(FengyeSpec fengyeSpec) {
    this.fengyeSpec = fengyeSpec;
    return this;
  }

  /**
   * Get fengyeSpec
   *
   * @return fengyeSpec
   */
  @ApiModelProperty(value = "")
  public FengyeSpec getFengyeSpec() {
    return fengyeSpec;
  }

  public void setFengyeSpec(FengyeSpec fengyeSpec) {
    this.fengyeSpec = fengyeSpec;
  }

  public ElementButtonRead cardSpec(CardSpec cardSpec) {
    this.cardSpec = cardSpec;
    return this;
  }

  /**
   * Get cardSpec
   *
   * @return cardSpec
   */
  @ApiModelProperty(value = "")
  public CardSpec getCardSpec() {
    return cardSpec;
  }

  public void setCardSpec(CardSpec cardSpec) {
    this.cardSpec = cardSpec;
  }

  public ElementButtonRead followSpec(FollowSpec followSpec) {
    this.followSpec = followSpec;
    return this;
  }

  /**
   * Get followSpec
   *
   * @return followSpec
   */
  @ApiModelProperty(value = "")
  public FollowSpec getFollowSpec() {
    return followSpec;
  }

  public void setFollowSpec(FollowSpec followSpec) {
    this.followSpec = followSpec;
  }

  public ElementButtonRead serviceSpec(ServiceSpec serviceSpec) {
    this.serviceSpec = serviceSpec;
    return this;
  }

  /**
   * Get serviceSpec
   *
   * @return serviceSpec
   */
  @ApiModelProperty(value = "")
  public ServiceSpec getServiceSpec() {
    return serviceSpec;
  }

  public void setServiceSpec(ServiceSpec serviceSpec) {
    this.serviceSpec = serviceSpec;
  }

  public ElementButtonRead wecomSpec(WecomSpec wecomSpec) {
    this.wecomSpec = wecomSpec;
    return this;
  }

  /**
   * Get wecomSpec
   *
   * @return wecomSpec
   */
  @ApiModelProperty(value = "")
  public WecomSpec getWecomSpec() {
    return wecomSpec;
  }

  public void setWecomSpec(WecomSpec wecomSpec) {
    this.wecomSpec = wecomSpec;
  }

  public ElementButtonRead useIcon(Long useIcon) {
    this.useIcon = useIcon;
    return this;
  }

  /**
   * Get useIcon
   *
   * @return useIcon
   */
  @ApiModelProperty(value = "")
  public Long getUseIcon() {
    return useIcon;
  }

  public void setUseIcon(Long useIcon) {
    this.useIcon = useIcon;
  }

  public ElementButtonRead telSpec(TelSpec telSpec) {
    this.telSpec = telSpec;
    return this;
  }

  /**
   * Get telSpec
   *
   * @return telSpec
   */
  @ApiModelProperty(value = "")
  public TelSpec getTelSpec() {
    return telSpec;
  }

  public void setTelSpec(TelSpec telSpec) {
    this.telSpec = telSpec;
  }

  public ElementButtonRead videoChannelSpec(VideoChannelSpec videoChannelSpec) {
    this.videoChannelSpec = videoChannelSpec;
    return this;
  }

  /**
   * Get videoChannelSpec
   *
   * @return videoChannelSpec
   */
  @ApiModelProperty(value = "")
  public VideoChannelSpec getVideoChannelSpec() {
    return videoChannelSpec;
  }

  public void setVideoChannelSpec(VideoChannelSpec videoChannelSpec) {
    this.videoChannelSpec = videoChannelSpec;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElementButtonRead elementButtonRead = (ElementButtonRead) o;
    return Objects.equals(this.title, elementButtonRead.title)
        && Objects.equals(this.url, elementButtonRead.url)
        && Objects.equals(this.linkSpec, elementButtonRead.linkSpec)
        && Objects.equals(this.appIosSpec, elementButtonRead.appIosSpec)
        && Objects.equals(this.appAndroidSpec, elementButtonRead.appAndroidSpec)
        && Objects.equals(this.miniProgramSpec, elementButtonRead.miniProgramSpec)
        && Objects.equals(this.miniGameProgramSpec, elementButtonRead.miniGameProgramSpec)
        && Objects.equals(this.fengyeSpec, elementButtonRead.fengyeSpec)
        && Objects.equals(this.cardSpec, elementButtonRead.cardSpec)
        && Objects.equals(this.followSpec, elementButtonRead.followSpec)
        && Objects.equals(this.serviceSpec, elementButtonRead.serviceSpec)
        && Objects.equals(this.wecomSpec, elementButtonRead.wecomSpec)
        && Objects.equals(this.useIcon, elementButtonRead.useIcon)
        && Objects.equals(this.telSpec, elementButtonRead.telSpec)
        && Objects.equals(this.videoChannelSpec, elementButtonRead.videoChannelSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        title,
        url,
        linkSpec,
        appIosSpec,
        appAndroidSpec,
        miniProgramSpec,
        miniGameProgramSpec,
        fengyeSpec,
        cardSpec,
        followSpec,
        serviceSpec,
        wecomSpec,
        useIcon,
        telSpec,
        videoChannelSpec);
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

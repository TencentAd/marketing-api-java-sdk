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

/** 落地页内容 */
@ApiModel(description = "落地页内容")
public class PageSpecWithoutWechatChannelsFeedPageSpec {
  @SerializedName("android_app_spec")
  private AndroidAppPageSpec androidAppSpec = null;

  @SerializedName("ios_app_spec")
  private IosAppPageSpec iosAppSpec = null;

  @SerializedName("xj_android_app_h5_spec")
  private XjPageSpec xjAndroidAppH5Spec = null;

  @SerializedName("xj_ios_app_h5_spec")
  private XjPageSpec xjIosAppH5Spec = null;

  @SerializedName("xj_web_h5_spec")
  private XjPageSpec xjWebH5Spec = null;

  @SerializedName("xj_quick_spec")
  private XjPageSpec xjQuickSpec = null;

  @SerializedName("fengye_ecommmerce_spec")
  private FengyePageSpec fengyeEcommmerceSpec = null;

  @SerializedName("wechat_canvas_spec")
  private CanvasWechatPageSpec wechatCanvasSpec = null;

  @SerializedName("wechat_mini_program_spec")
  private WechatMiniProgramPageSpec wechatMiniProgramSpec = null;

  @SerializedName("wechat_canvas_mini_program_spec")
  private CanvasWechatPageSpec wechatCanvasMiniProgramSpec = null;

  @SerializedName("qq_app_mini_program_spec")
  private QqAppMiniProgramPageSpec qqAppMiniProgramSpec = null;

  @SerializedName("simple_wechat_canvas_spec")
  private SimpleCanvasWechatSpec simpleWechatCanvasSpec = null;

  @SerializedName("wechat_focus_dialog_spec")
  private WechatFocusDialog wechatFocusDialogSpec = null;

  @SerializedName("wechat_consult_spec")
  private WechatConsultPageSpec wechatConsultSpec = null;

  @SerializedName("wecom_consult_spec")
  private WecomConsultPageSpec wecomConsultSpec = null;

  @SerializedName("wechat_official_account_detail_spec")
  private WechatOfficialAccountDetailPageSpec wechatOfficialAccountDetailSpec = null;

  @SerializedName("app_deep_link_spec")
  private AppDeepLinkPageSpec appDeepLinkSpec = null;

  @SerializedName("app_market_spec")
  private AppMarketPageSpec appMarketSpec = null;

  @SerializedName("android_direct_download_spec")
  private AndroidDirectDownloadPageSpec androidDirectDownloadSpec = null;

  @SerializedName("official_spec")
  private XjPageSpec officialSpec = null;

  @SerializedName("h5_profile_spec")
  private H5ProfilePageSpec h5ProfileSpec = null;

  @SerializedName("search_area_brand_spec")
  private SearchAreaBrandPageSpec searchAreaBrandSpec = null;

  @SerializedName("wechat_channels_profile_spec")
  private WechatChannelsPageSpec wechatChannelsProfileSpec = null;

  @SerializedName("h5_spec")
  private H5PageSpec h5Spec = null;

  @SerializedName("wechat_mini_game_spec")
  private WechatMiniGamePageSpec wechatMiniGameSpec = null;

  @SerializedName("wechat_channels_reserve_spec")
  private WechatChannelsReserveLivePageSpec wechatChannelsReserveSpec = null;

  @SerializedName("android_quick_app_spec")
  private AndroidQuickAppPageSpec androidQuickAppSpec = null;

  @SerializedName("wechat_channels_shop_product_spec")
  private ChannelsShopProductSpec wechatChannelsShopProductSpec = null;

  public PageSpecWithoutWechatChannelsFeedPageSpec androidAppSpec(
      AndroidAppPageSpec androidAppSpec) {
    this.androidAppSpec = androidAppSpec;
    return this;
  }

  /**
   * Get androidAppSpec
   *
   * @return androidAppSpec
   */
  @ApiModelProperty(value = "")
  public AndroidAppPageSpec getAndroidAppSpec() {
    return androidAppSpec;
  }

  public void setAndroidAppSpec(AndroidAppPageSpec androidAppSpec) {
    this.androidAppSpec = androidAppSpec;
  }

  public PageSpecWithoutWechatChannelsFeedPageSpec iosAppSpec(IosAppPageSpec iosAppSpec) {
    this.iosAppSpec = iosAppSpec;
    return this;
  }

  /**
   * Get iosAppSpec
   *
   * @return iosAppSpec
   */
  @ApiModelProperty(value = "")
  public IosAppPageSpec getIosAppSpec() {
    return iosAppSpec;
  }

  public void setIosAppSpec(IosAppPageSpec iosAppSpec) {
    this.iosAppSpec = iosAppSpec;
  }

  public PageSpecWithoutWechatChannelsFeedPageSpec xjAndroidAppH5Spec(
      XjPageSpec xjAndroidAppH5Spec) {
    this.xjAndroidAppH5Spec = xjAndroidAppH5Spec;
    return this;
  }

  /**
   * Get xjAndroidAppH5Spec
   *
   * @return xjAndroidAppH5Spec
   */
  @ApiModelProperty(value = "")
  public XjPageSpec getXjAndroidAppH5Spec() {
    return xjAndroidAppH5Spec;
  }

  public void setXjAndroidAppH5Spec(XjPageSpec xjAndroidAppH5Spec) {
    this.xjAndroidAppH5Spec = xjAndroidAppH5Spec;
  }

  public PageSpecWithoutWechatChannelsFeedPageSpec xjIosAppH5Spec(XjPageSpec xjIosAppH5Spec) {
    this.xjIosAppH5Spec = xjIosAppH5Spec;
    return this;
  }

  /**
   * Get xjIosAppH5Spec
   *
   * @return xjIosAppH5Spec
   */
  @ApiModelProperty(value = "")
  public XjPageSpec getXjIosAppH5Spec() {
    return xjIosAppH5Spec;
  }

  public void setXjIosAppH5Spec(XjPageSpec xjIosAppH5Spec) {
    this.xjIosAppH5Spec = xjIosAppH5Spec;
  }

  public PageSpecWithoutWechatChannelsFeedPageSpec xjWebH5Spec(XjPageSpec xjWebH5Spec) {
    this.xjWebH5Spec = xjWebH5Spec;
    return this;
  }

  /**
   * Get xjWebH5Spec
   *
   * @return xjWebH5Spec
   */
  @ApiModelProperty(value = "")
  public XjPageSpec getXjWebH5Spec() {
    return xjWebH5Spec;
  }

  public void setXjWebH5Spec(XjPageSpec xjWebH5Spec) {
    this.xjWebH5Spec = xjWebH5Spec;
  }

  public PageSpecWithoutWechatChannelsFeedPageSpec xjQuickSpec(XjPageSpec xjQuickSpec) {
    this.xjQuickSpec = xjQuickSpec;
    return this;
  }

  /**
   * Get xjQuickSpec
   *
   * @return xjQuickSpec
   */
  @ApiModelProperty(value = "")
  public XjPageSpec getXjQuickSpec() {
    return xjQuickSpec;
  }

  public void setXjQuickSpec(XjPageSpec xjQuickSpec) {
    this.xjQuickSpec = xjQuickSpec;
  }

  public PageSpecWithoutWechatChannelsFeedPageSpec fengyeEcommmerceSpec(
      FengyePageSpec fengyeEcommmerceSpec) {
    this.fengyeEcommmerceSpec = fengyeEcommmerceSpec;
    return this;
  }

  /**
   * Get fengyeEcommmerceSpec
   *
   * @return fengyeEcommmerceSpec
   */
  @ApiModelProperty(value = "")
  public FengyePageSpec getFengyeEcommmerceSpec() {
    return fengyeEcommmerceSpec;
  }

  public void setFengyeEcommmerceSpec(FengyePageSpec fengyeEcommmerceSpec) {
    this.fengyeEcommmerceSpec = fengyeEcommmerceSpec;
  }

  public PageSpecWithoutWechatChannelsFeedPageSpec wechatCanvasSpec(
      CanvasWechatPageSpec wechatCanvasSpec) {
    this.wechatCanvasSpec = wechatCanvasSpec;
    return this;
  }

  /**
   * Get wechatCanvasSpec
   *
   * @return wechatCanvasSpec
   */
  @ApiModelProperty(value = "")
  public CanvasWechatPageSpec getWechatCanvasSpec() {
    return wechatCanvasSpec;
  }

  public void setWechatCanvasSpec(CanvasWechatPageSpec wechatCanvasSpec) {
    this.wechatCanvasSpec = wechatCanvasSpec;
  }

  public PageSpecWithoutWechatChannelsFeedPageSpec wechatMiniProgramSpec(
      WechatMiniProgramPageSpec wechatMiniProgramSpec) {
    this.wechatMiniProgramSpec = wechatMiniProgramSpec;
    return this;
  }

  /**
   * Get wechatMiniProgramSpec
   *
   * @return wechatMiniProgramSpec
   */
  @ApiModelProperty(value = "")
  public WechatMiniProgramPageSpec getWechatMiniProgramSpec() {
    return wechatMiniProgramSpec;
  }

  public void setWechatMiniProgramSpec(WechatMiniProgramPageSpec wechatMiniProgramSpec) {
    this.wechatMiniProgramSpec = wechatMiniProgramSpec;
  }

  public PageSpecWithoutWechatChannelsFeedPageSpec wechatCanvasMiniProgramSpec(
      CanvasWechatPageSpec wechatCanvasMiniProgramSpec) {
    this.wechatCanvasMiniProgramSpec = wechatCanvasMiniProgramSpec;
    return this;
  }

  /**
   * Get wechatCanvasMiniProgramSpec
   *
   * @return wechatCanvasMiniProgramSpec
   */
  @ApiModelProperty(value = "")
  public CanvasWechatPageSpec getWechatCanvasMiniProgramSpec() {
    return wechatCanvasMiniProgramSpec;
  }

  public void setWechatCanvasMiniProgramSpec(CanvasWechatPageSpec wechatCanvasMiniProgramSpec) {
    this.wechatCanvasMiniProgramSpec = wechatCanvasMiniProgramSpec;
  }

  public PageSpecWithoutWechatChannelsFeedPageSpec qqAppMiniProgramSpec(
      QqAppMiniProgramPageSpec qqAppMiniProgramSpec) {
    this.qqAppMiniProgramSpec = qqAppMiniProgramSpec;
    return this;
  }

  /**
   * Get qqAppMiniProgramSpec
   *
   * @return qqAppMiniProgramSpec
   */
  @ApiModelProperty(value = "")
  public QqAppMiniProgramPageSpec getQqAppMiniProgramSpec() {
    return qqAppMiniProgramSpec;
  }

  public void setQqAppMiniProgramSpec(QqAppMiniProgramPageSpec qqAppMiniProgramSpec) {
    this.qqAppMiniProgramSpec = qqAppMiniProgramSpec;
  }

  public PageSpecWithoutWechatChannelsFeedPageSpec simpleWechatCanvasSpec(
      SimpleCanvasWechatSpec simpleWechatCanvasSpec) {
    this.simpleWechatCanvasSpec = simpleWechatCanvasSpec;
    return this;
  }

  /**
   * Get simpleWechatCanvasSpec
   *
   * @return simpleWechatCanvasSpec
   */
  @ApiModelProperty(value = "")
  public SimpleCanvasWechatSpec getSimpleWechatCanvasSpec() {
    return simpleWechatCanvasSpec;
  }

  public void setSimpleWechatCanvasSpec(SimpleCanvasWechatSpec simpleWechatCanvasSpec) {
    this.simpleWechatCanvasSpec = simpleWechatCanvasSpec;
  }

  public PageSpecWithoutWechatChannelsFeedPageSpec wechatFocusDialogSpec(
      WechatFocusDialog wechatFocusDialogSpec) {
    this.wechatFocusDialogSpec = wechatFocusDialogSpec;
    return this;
  }

  /**
   * Get wechatFocusDialogSpec
   *
   * @return wechatFocusDialogSpec
   */
  @ApiModelProperty(value = "")
  public WechatFocusDialog getWechatFocusDialogSpec() {
    return wechatFocusDialogSpec;
  }

  public void setWechatFocusDialogSpec(WechatFocusDialog wechatFocusDialogSpec) {
    this.wechatFocusDialogSpec = wechatFocusDialogSpec;
  }

  public PageSpecWithoutWechatChannelsFeedPageSpec wechatConsultSpec(
      WechatConsultPageSpec wechatConsultSpec) {
    this.wechatConsultSpec = wechatConsultSpec;
    return this;
  }

  /**
   * Get wechatConsultSpec
   *
   * @return wechatConsultSpec
   */
  @ApiModelProperty(value = "")
  public WechatConsultPageSpec getWechatConsultSpec() {
    return wechatConsultSpec;
  }

  public void setWechatConsultSpec(WechatConsultPageSpec wechatConsultSpec) {
    this.wechatConsultSpec = wechatConsultSpec;
  }

  public PageSpecWithoutWechatChannelsFeedPageSpec wecomConsultSpec(
      WecomConsultPageSpec wecomConsultSpec) {
    this.wecomConsultSpec = wecomConsultSpec;
    return this;
  }

  /**
   * Get wecomConsultSpec
   *
   * @return wecomConsultSpec
   */
  @ApiModelProperty(value = "")
  public WecomConsultPageSpec getWecomConsultSpec() {
    return wecomConsultSpec;
  }

  public void setWecomConsultSpec(WecomConsultPageSpec wecomConsultSpec) {
    this.wecomConsultSpec = wecomConsultSpec;
  }

  public PageSpecWithoutWechatChannelsFeedPageSpec wechatOfficialAccountDetailSpec(
      WechatOfficialAccountDetailPageSpec wechatOfficialAccountDetailSpec) {
    this.wechatOfficialAccountDetailSpec = wechatOfficialAccountDetailSpec;
    return this;
  }

  /**
   * Get wechatOfficialAccountDetailSpec
   *
   * @return wechatOfficialAccountDetailSpec
   */
  @ApiModelProperty(value = "")
  public WechatOfficialAccountDetailPageSpec getWechatOfficialAccountDetailSpec() {
    return wechatOfficialAccountDetailSpec;
  }

  public void setWechatOfficialAccountDetailSpec(
      WechatOfficialAccountDetailPageSpec wechatOfficialAccountDetailSpec) {
    this.wechatOfficialAccountDetailSpec = wechatOfficialAccountDetailSpec;
  }

  public PageSpecWithoutWechatChannelsFeedPageSpec appDeepLinkSpec(
      AppDeepLinkPageSpec appDeepLinkSpec) {
    this.appDeepLinkSpec = appDeepLinkSpec;
    return this;
  }

  /**
   * Get appDeepLinkSpec
   *
   * @return appDeepLinkSpec
   */
  @ApiModelProperty(value = "")
  public AppDeepLinkPageSpec getAppDeepLinkSpec() {
    return appDeepLinkSpec;
  }

  public void setAppDeepLinkSpec(AppDeepLinkPageSpec appDeepLinkSpec) {
    this.appDeepLinkSpec = appDeepLinkSpec;
  }

  public PageSpecWithoutWechatChannelsFeedPageSpec appMarketSpec(AppMarketPageSpec appMarketSpec) {
    this.appMarketSpec = appMarketSpec;
    return this;
  }

  /**
   * Get appMarketSpec
   *
   * @return appMarketSpec
   */
  @ApiModelProperty(value = "")
  public AppMarketPageSpec getAppMarketSpec() {
    return appMarketSpec;
  }

  public void setAppMarketSpec(AppMarketPageSpec appMarketSpec) {
    this.appMarketSpec = appMarketSpec;
  }

  public PageSpecWithoutWechatChannelsFeedPageSpec androidDirectDownloadSpec(
      AndroidDirectDownloadPageSpec androidDirectDownloadSpec) {
    this.androidDirectDownloadSpec = androidDirectDownloadSpec;
    return this;
  }

  /**
   * Get androidDirectDownloadSpec
   *
   * @return androidDirectDownloadSpec
   */
  @ApiModelProperty(value = "")
  public AndroidDirectDownloadPageSpec getAndroidDirectDownloadSpec() {
    return androidDirectDownloadSpec;
  }

  public void setAndroidDirectDownloadSpec(
      AndroidDirectDownloadPageSpec androidDirectDownloadSpec) {
    this.androidDirectDownloadSpec = androidDirectDownloadSpec;
  }

  public PageSpecWithoutWechatChannelsFeedPageSpec officialSpec(XjPageSpec officialSpec) {
    this.officialSpec = officialSpec;
    return this;
  }

  /**
   * Get officialSpec
   *
   * @return officialSpec
   */
  @ApiModelProperty(value = "")
  public XjPageSpec getOfficialSpec() {
    return officialSpec;
  }

  public void setOfficialSpec(XjPageSpec officialSpec) {
    this.officialSpec = officialSpec;
  }

  public PageSpecWithoutWechatChannelsFeedPageSpec h5ProfileSpec(H5ProfilePageSpec h5ProfileSpec) {
    this.h5ProfileSpec = h5ProfileSpec;
    return this;
  }

  /**
   * Get h5ProfileSpec
   *
   * @return h5ProfileSpec
   */
  @ApiModelProperty(value = "")
  public H5ProfilePageSpec getH5ProfileSpec() {
    return h5ProfileSpec;
  }

  public void setH5ProfileSpec(H5ProfilePageSpec h5ProfileSpec) {
    this.h5ProfileSpec = h5ProfileSpec;
  }

  public PageSpecWithoutWechatChannelsFeedPageSpec searchAreaBrandSpec(
      SearchAreaBrandPageSpec searchAreaBrandSpec) {
    this.searchAreaBrandSpec = searchAreaBrandSpec;
    return this;
  }

  /**
   * Get searchAreaBrandSpec
   *
   * @return searchAreaBrandSpec
   */
  @ApiModelProperty(value = "")
  public SearchAreaBrandPageSpec getSearchAreaBrandSpec() {
    return searchAreaBrandSpec;
  }

  public void setSearchAreaBrandSpec(SearchAreaBrandPageSpec searchAreaBrandSpec) {
    this.searchAreaBrandSpec = searchAreaBrandSpec;
  }

  public PageSpecWithoutWechatChannelsFeedPageSpec wechatChannelsProfileSpec(
      WechatChannelsPageSpec wechatChannelsProfileSpec) {
    this.wechatChannelsProfileSpec = wechatChannelsProfileSpec;
    return this;
  }

  /**
   * Get wechatChannelsProfileSpec
   *
   * @return wechatChannelsProfileSpec
   */
  @ApiModelProperty(value = "")
  public WechatChannelsPageSpec getWechatChannelsProfileSpec() {
    return wechatChannelsProfileSpec;
  }

  public void setWechatChannelsProfileSpec(WechatChannelsPageSpec wechatChannelsProfileSpec) {
    this.wechatChannelsProfileSpec = wechatChannelsProfileSpec;
  }

  public PageSpecWithoutWechatChannelsFeedPageSpec h5Spec(H5PageSpec h5Spec) {
    this.h5Spec = h5Spec;
    return this;
  }

  /**
   * Get h5Spec
   *
   * @return h5Spec
   */
  @ApiModelProperty(value = "")
  public H5PageSpec getH5Spec() {
    return h5Spec;
  }

  public void setH5Spec(H5PageSpec h5Spec) {
    this.h5Spec = h5Spec;
  }

  public PageSpecWithoutWechatChannelsFeedPageSpec wechatMiniGameSpec(
      WechatMiniGamePageSpec wechatMiniGameSpec) {
    this.wechatMiniGameSpec = wechatMiniGameSpec;
    return this;
  }

  /**
   * Get wechatMiniGameSpec
   *
   * @return wechatMiniGameSpec
   */
  @ApiModelProperty(value = "")
  public WechatMiniGamePageSpec getWechatMiniGameSpec() {
    return wechatMiniGameSpec;
  }

  public void setWechatMiniGameSpec(WechatMiniGamePageSpec wechatMiniGameSpec) {
    this.wechatMiniGameSpec = wechatMiniGameSpec;
  }

  public PageSpecWithoutWechatChannelsFeedPageSpec wechatChannelsReserveSpec(
      WechatChannelsReserveLivePageSpec wechatChannelsReserveSpec) {
    this.wechatChannelsReserveSpec = wechatChannelsReserveSpec;
    return this;
  }

  /**
   * Get wechatChannelsReserveSpec
   *
   * @return wechatChannelsReserveSpec
   */
  @ApiModelProperty(value = "")
  public WechatChannelsReserveLivePageSpec getWechatChannelsReserveSpec() {
    return wechatChannelsReserveSpec;
  }

  public void setWechatChannelsReserveSpec(
      WechatChannelsReserveLivePageSpec wechatChannelsReserveSpec) {
    this.wechatChannelsReserveSpec = wechatChannelsReserveSpec;
  }

  public PageSpecWithoutWechatChannelsFeedPageSpec androidQuickAppSpec(
      AndroidQuickAppPageSpec androidQuickAppSpec) {
    this.androidQuickAppSpec = androidQuickAppSpec;
    return this;
  }

  /**
   * Get androidQuickAppSpec
   *
   * @return androidQuickAppSpec
   */
  @ApiModelProperty(value = "")
  public AndroidQuickAppPageSpec getAndroidQuickAppSpec() {
    return androidQuickAppSpec;
  }

  public void setAndroidQuickAppSpec(AndroidQuickAppPageSpec androidQuickAppSpec) {
    this.androidQuickAppSpec = androidQuickAppSpec;
  }

  public PageSpecWithoutWechatChannelsFeedPageSpec wechatChannelsShopProductSpec(
      ChannelsShopProductSpec wechatChannelsShopProductSpec) {
    this.wechatChannelsShopProductSpec = wechatChannelsShopProductSpec;
    return this;
  }

  /**
   * Get wechatChannelsShopProductSpec
   *
   * @return wechatChannelsShopProductSpec
   */
  @ApiModelProperty(value = "")
  public ChannelsShopProductSpec getWechatChannelsShopProductSpec() {
    return wechatChannelsShopProductSpec;
  }

  public void setWechatChannelsShopProductSpec(
      ChannelsShopProductSpec wechatChannelsShopProductSpec) {
    this.wechatChannelsShopProductSpec = wechatChannelsShopProductSpec;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageSpecWithoutWechatChannelsFeedPageSpec pageSpecWithoutWechatChannelsFeedPageSpec =
        (PageSpecWithoutWechatChannelsFeedPageSpec) o;
    return Objects.equals(
            this.androidAppSpec, pageSpecWithoutWechatChannelsFeedPageSpec.androidAppSpec)
        && Objects.equals(this.iosAppSpec, pageSpecWithoutWechatChannelsFeedPageSpec.iosAppSpec)
        && Objects.equals(
            this.xjAndroidAppH5Spec, pageSpecWithoutWechatChannelsFeedPageSpec.xjAndroidAppH5Spec)
        && Objects.equals(
            this.xjIosAppH5Spec, pageSpecWithoutWechatChannelsFeedPageSpec.xjIosAppH5Spec)
        && Objects.equals(this.xjWebH5Spec, pageSpecWithoutWechatChannelsFeedPageSpec.xjWebH5Spec)
        && Objects.equals(this.xjQuickSpec, pageSpecWithoutWechatChannelsFeedPageSpec.xjQuickSpec)
        && Objects.equals(
            this.fengyeEcommmerceSpec,
            pageSpecWithoutWechatChannelsFeedPageSpec.fengyeEcommmerceSpec)
        && Objects.equals(
            this.wechatCanvasSpec, pageSpecWithoutWechatChannelsFeedPageSpec.wechatCanvasSpec)
        && Objects.equals(
            this.wechatMiniProgramSpec,
            pageSpecWithoutWechatChannelsFeedPageSpec.wechatMiniProgramSpec)
        && Objects.equals(
            this.wechatCanvasMiniProgramSpec,
            pageSpecWithoutWechatChannelsFeedPageSpec.wechatCanvasMiniProgramSpec)
        && Objects.equals(
            this.qqAppMiniProgramSpec,
            pageSpecWithoutWechatChannelsFeedPageSpec.qqAppMiniProgramSpec)
        && Objects.equals(
            this.simpleWechatCanvasSpec,
            pageSpecWithoutWechatChannelsFeedPageSpec.simpleWechatCanvasSpec)
        && Objects.equals(
            this.wechatFocusDialogSpec,
            pageSpecWithoutWechatChannelsFeedPageSpec.wechatFocusDialogSpec)
        && Objects.equals(
            this.wechatConsultSpec, pageSpecWithoutWechatChannelsFeedPageSpec.wechatConsultSpec)
        && Objects.equals(
            this.wecomConsultSpec, pageSpecWithoutWechatChannelsFeedPageSpec.wecomConsultSpec)
        && Objects.equals(
            this.wechatOfficialAccountDetailSpec,
            pageSpecWithoutWechatChannelsFeedPageSpec.wechatOfficialAccountDetailSpec)
        && Objects.equals(
            this.appDeepLinkSpec, pageSpecWithoutWechatChannelsFeedPageSpec.appDeepLinkSpec)
        && Objects.equals(
            this.appMarketSpec, pageSpecWithoutWechatChannelsFeedPageSpec.appMarketSpec)
        && Objects.equals(
            this.androidDirectDownloadSpec,
            pageSpecWithoutWechatChannelsFeedPageSpec.androidDirectDownloadSpec)
        && Objects.equals(this.officialSpec, pageSpecWithoutWechatChannelsFeedPageSpec.officialSpec)
        && Objects.equals(
            this.h5ProfileSpec, pageSpecWithoutWechatChannelsFeedPageSpec.h5ProfileSpec)
        && Objects.equals(
            this.searchAreaBrandSpec, pageSpecWithoutWechatChannelsFeedPageSpec.searchAreaBrandSpec)
        && Objects.equals(
            this.wechatChannelsProfileSpec,
            pageSpecWithoutWechatChannelsFeedPageSpec.wechatChannelsProfileSpec)
        && Objects.equals(this.h5Spec, pageSpecWithoutWechatChannelsFeedPageSpec.h5Spec)
        && Objects.equals(
            this.wechatMiniGameSpec, pageSpecWithoutWechatChannelsFeedPageSpec.wechatMiniGameSpec)
        && Objects.equals(
            this.wechatChannelsReserveSpec,
            pageSpecWithoutWechatChannelsFeedPageSpec.wechatChannelsReserveSpec)
        && Objects.equals(
            this.androidQuickAppSpec, pageSpecWithoutWechatChannelsFeedPageSpec.androidQuickAppSpec)
        && Objects.equals(
            this.wechatChannelsShopProductSpec,
            pageSpecWithoutWechatChannelsFeedPageSpec.wechatChannelsShopProductSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        androidAppSpec,
        iosAppSpec,
        xjAndroidAppH5Spec,
        xjIosAppH5Spec,
        xjWebH5Spec,
        xjQuickSpec,
        fengyeEcommmerceSpec,
        wechatCanvasSpec,
        wechatMiniProgramSpec,
        wechatCanvasMiniProgramSpec,
        qqAppMiniProgramSpec,
        simpleWechatCanvasSpec,
        wechatFocusDialogSpec,
        wechatConsultSpec,
        wecomConsultSpec,
        wechatOfficialAccountDetailSpec,
        appDeepLinkSpec,
        appMarketSpec,
        androidDirectDownloadSpec,
        officialSpec,
        h5ProfileSpec,
        searchAreaBrandSpec,
        wechatChannelsProfileSpec,
        h5Spec,
        wechatMiniGameSpec,
        wechatChannelsReserveSpec,
        androidQuickAppSpec,
        wechatChannelsShopProductSpec);
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

package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.AdcreativeTemplatePreviewGetRequest;
import java.util.Arrays;
import java.util.List;

public class GetAdcreativeTemplatePreview {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;
  public AdcreativeTemplatePreviewGetRequest data = new AdcreativeTemplatePreviewGetRequest();
  public Long adcreativeTemplateId = 133L;
  public List<String> siteSet = Arrays.asList("SITE_SET_WECHAT");
  public WechatPromotedObjectType promotedObjectType = WechatPromotedObjectType.LINK_WECHAT;
  public String image = "YOUR AD IMAGE ID";
  public DestinationType pageType = DestinationType.DEFAULT;
  public String pageUrl = "YOUR AD PAGE URL";

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {
    data.setAccountId(accountId);

    AdcreativePreviewSpec previewSpec = new AdcreativePreviewSpec();
    previewSpec.setAdcreativeTemplateId(adcreativeTemplateId);
    previewSpec.setSiteSet(siteSet);
    previewSpec.setPromotedObjectType(promotedObjectType);
    AdcreativeCreativeElements adcreativeElements = new AdcreativeCreativeElements();
    adcreativeElements.setImage(image);
    previewSpec.setAdcreativeElements(adcreativeElements);
    previewSpec.setPageType(pageType);
    PreviewPageSpec pageSpec = new PreviewPageSpec();
    pageSpec.setPageUrl(pageUrl);
    previewSpec.setPageSpec(pageSpec);
    data.setPreviewSpec(previewSpec);
  }

  public AdcreativeTemplatePreviewGetResponseData getAdcreativeTemplatePreview() throws Exception {
    AdcreativeTemplatePreviewGetResponseData response =
        tencentAds.adcreativeTemplatePreview().adcreativeTemplatePreviewGet(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetAdcreativeTemplatePreview getAdcreativeTemplatePreview =
          new GetAdcreativeTemplatePreview();
      getAdcreativeTemplatePreview.init();
      AdcreativeTemplatePreviewGetResponseData response =
          getAdcreativeTemplatePreview.getAdcreativeTemplatePreview();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

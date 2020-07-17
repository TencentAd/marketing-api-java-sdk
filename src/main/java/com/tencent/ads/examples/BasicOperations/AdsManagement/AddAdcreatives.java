package com.tencent.ads.examples.BasicOperations.AdsManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.AdcreativesAddRequest;
import java.util.Arrays;
import java.util.List;

public class AddAdcreatives {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;
  public AdcreativesAddRequest data = new AdcreativesAddRequest();
  public Long adcreativeTemplateId = 968L;
  public String title = "YOUR AD TEXT";
  public String description = "YOUR AD DESCRIPTION";
  public DestinationType pageType = DestinationType.DEFAULT;
  public String pageUrl = "YOUR AD PAGE URL";
  public PromotedObjectType promotedObjectType = PromotedObjectType.LINK;
  public String adcreativeName = "SDK广告创意5ede2529029e9";
  public List<String> siteSet = Arrays.asList("SITE_SET_QZONE");
  public Long campaignId = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {
    data.setAccountId(accountId);

    data.setAdcreativeTemplateId(adcreativeTemplateId);

    AdcreativeCreativeElementsMp adcreativeElements = new AdcreativeCreativeElementsMp();
    adcreativeElements.setTitle(title);
    adcreativeElements.setDescription(description);
    data.setAdcreativeElements(adcreativeElements);

    data.setPageType(pageType);

    PageSpec pageSpec = new PageSpec();
    pageSpec.setPageUrl(pageUrl);
    data.setPageSpec(pageSpec);

    data.setPromotedObjectType(promotedObjectType);

    data.setAdcreativeName(adcreativeName);

    data.setSiteSet(siteSet);

    data.setCampaignId(campaignId);
  }

  public AdcreativesAddResponseData addAdcreatives() throws Exception {
    AdcreativesAddResponseData response = tencentAds.adcreatives().adcreativesAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddAdcreatives addAdcreatives = new AddAdcreatives();
      addAdcreatives.init();
      AdcreativesAddResponseData response = addAdcreatives.addAdcreatives();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

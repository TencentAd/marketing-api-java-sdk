package com.tencent.ads.examples.BasicOperations.AdsManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.DynamicCreativesAddRequest;
import java.util.Arrays;
import java.util.List;

public class AddDynamicCreatives {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;
  public DynamicCreativesAddRequest data = new DynamicCreativesAddRequest();
  public List<String> imageOptions = Arrays.asList("YOUR AD IMAGE");
  public List<String> titleOptions = Arrays.asList("YOUR AD TEXT 1", "YOUR AD TEXT 2");
  public List<String> descriptionOptions = Arrays.asList("YOUR AD DESCRIPTION");
  public DestinationType pageType = DestinationType.DEFAULT;
  public String pageUrl = "YOUR AD PAGE URL";
  public CampaignType campaignType = CampaignType.NORMAL;
  public PromotedObjectType promotedObjectType = PromotedObjectType.LINK;
  public List<String> siteSet = Arrays.asList("SITE_SET_MOBILE_INNER");
  public Long dynamicCreativeTemplateId = 717L;
  public String dynamicCreativeName = "SDK动态创意5ede25293ba60";

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {
    data.setAccountId(accountId);

    DynamicCreativeElements dynamicCreativeElements = new DynamicCreativeElements();
    dynamicCreativeElements.setImageOptions(imageOptions);
    dynamicCreativeElements.setTitleOptions(titleOptions);
    dynamicCreativeElements.setDescriptionOptions(descriptionOptions);
    data.setDynamicCreativeElements(dynamicCreativeElements);

    data.setPageType(pageType);

    DynamicPageSpec pageSpec = new DynamicPageSpec();
    pageSpec.setPageUrl(pageUrl);
    data.setPageSpec(pageSpec);

    data.setCampaignType(campaignType);

    data.setPromotedObjectType(promotedObjectType);

    data.setSiteSet(siteSet);

    data.setDynamicCreativeTemplateId(dynamicCreativeTemplateId);

    data.setDynamicCreativeName(dynamicCreativeName);
  }

  public DynamicCreativesAddResponseData addDynamicCreatives() throws Exception {
    DynamicCreativesAddResponseData response =
        tencentAds.dynamicCreatives().dynamicCreativesAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddDynamicCreatives addDynamicCreatives = new AddDynamicCreatives();
      addDynamicCreatives.init();
      DynamicCreativesAddResponseData response = addDynamicCreatives.addDynamicCreatives();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

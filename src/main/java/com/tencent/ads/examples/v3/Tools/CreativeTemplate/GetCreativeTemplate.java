package com.tencent.ads.examples.v3.Tools.CreativeTemplate;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.v3.TencentAds;
import java.util.List;

public class GetCreativeTemplate {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public String marketingGoal = null;

  public String marketingTargetType = null;

  public String marketingCarrierType = null;

  public String deliveryMode = null;

  public String marketingSubGoal = null;

  public Boolean automaticSiteEnabled = null;

  public List<String> siteSet = null;

  public String dynamicCreativeType = null;

  public Long creativeTemplateId = null;

  public Long conversionLinkAssetId = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public CreativeTemplateGetResponseData getCreativeTemplate() throws Exception {
    CreativeTemplateGetResponseData response =
        tencentAds
            .creativeTemplate()
            .creativeTemplateGet(
                accountId,
                marketingGoal,
                marketingTargetType,
                marketingCarrierType,
                deliveryMode,
                marketingSubGoal,
                automaticSiteEnabled,
                siteSet,
                dynamicCreativeType,
                creativeTemplateId,
                conversionLinkAssetId,
                fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetCreativeTemplate getCreativeTemplate = new GetCreativeTemplate();
      getCreativeTemplate.init();
      CreativeTemplateGetResponseData response = getCreativeTemplate.getCreativeTemplate();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

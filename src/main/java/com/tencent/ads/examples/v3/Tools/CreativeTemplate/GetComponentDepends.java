package com.tencent.ads.examples.v3.Tools.CreativeTemplate;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.v3.TencentAds;
import java.util.List;

public class GetComponentDepends {
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

  public String componentType = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public ComponentDependsGetResponseData getComponentDepends() throws Exception {
    ComponentDependsGetResponseData response =
        tencentAds
            .componentDepends()
            .componentDependsGet(
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
                componentType,
                fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetComponentDepends getComponentDepends = new GetComponentDepends();
      getComponentDepends.init();
      ComponentDependsGetResponseData response = getComponentDepends.getComponentDepends();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

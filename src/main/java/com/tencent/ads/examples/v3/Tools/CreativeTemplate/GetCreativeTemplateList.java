package com.tencent.ads.examples.v3.Tools.CreativeTemplate;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.v3.TencentAds;
import java.util.List;

public class GetCreativeTemplateList {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public String marketingGoal = null;

  public String marketingSubGoal = null;

  public String marketingTargetType = null;

  public String marketingCarrierType = null;

  public String siteSet = null;

  public String dynamicAbilityType = null;

  public List<Long> wechatSceneSpecPosition = null;

  public Long creativeTemplateId = null;

  public Long page = null;

  public Long pageSize = null;

  public String dynamicAdType = null;

  public String dynamicCreativeType = null;

  public List<String> supportSiteSet = null;

  public String bidMode = null;

  public List<Long> wechatChannelsScene = null;

  public List<String> displayScene = null;

  public List<String> pcScene = null;

  public Long adgroupId = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public CreativeTemplateListGetResponseData getCreativeTemplateList() throws Exception {
    CreativeTemplateListGetResponseData response =
        tencentAds
            .creativeTemplateList()
            .creativeTemplateListGet(
                accountId,
                marketingGoal,
                marketingSubGoal,
                marketingTargetType,
                marketingCarrierType,
                siteSet,
                dynamicAbilityType,
                wechatSceneSpecPosition,
                creativeTemplateId,
                page,
                pageSize,
                dynamicAdType,
                dynamicCreativeType,
                supportSiteSet,
                bidMode,
                wechatChannelsScene,
                displayScene,
                pcScene,
                adgroupId,
                fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetCreativeTemplateList getCreativeTemplateList = new GetCreativeTemplateList();
      getCreativeTemplateList.init();
      CreativeTemplateListGetResponseData response =
          getCreativeTemplateList.getCreativeTemplateList();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

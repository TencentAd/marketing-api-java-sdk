package com.tencent.ads.examples.v3.CreativeToolBox.AdParam;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.MarketingAssetOuterSpec;
import com.tencent.ads.model.v3.MpaSpec;
import com.tencent.ads.v3.TencentAds;
import java.util.List;

public class GetAdParam {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public String marketingGoal = null;

  public Long creativeTemplateId = null;

  public List<String> siteSet = null;

  public String marketingSubGoal = null;

  public String marketingCarrierType = null;

  public String marketingTargetType = null;

  public Long productCatalogId = null;

  public MarketingAssetOuterSpec marketingAssetOuterSpec = null;

  public MpaSpec mpaSpec = null;

  public String dynamicAdType = null;

  public String adgroupType = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public AdParamGetResponseData getAdParam() throws Exception {
    AdParamGetResponseData response =
        tencentAds
            .adParam()
            .adParamGet(
                accountId,
                marketingGoal,
                creativeTemplateId,
                siteSet,
                marketingSubGoal,
                marketingCarrierType,
                marketingTargetType,
                productCatalogId,
                marketingAssetOuterSpec,
                mpaSpec,
                dynamicAdType,
                adgroupType,
                fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetAdParam getAdParam = new GetAdParam();
      getAdParam.init();
      AdParamGetResponseData response = getAdParam.getAdParam();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

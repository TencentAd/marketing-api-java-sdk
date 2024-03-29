package com.tencent.ads.examples.v3.BusinessAssets.MarketingTargetAsset;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.MarketingTargetAssetsUpdateRequest;
import com.tencent.ads.model.v3.MarketingTargetAssetsUpdateResponse;
import com.tencent.ads.v3.TencentAds;

public class UpdateMarketingTargetAssets {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public MarketingTargetAssetsUpdateRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public MarketingTargetAssetsUpdateResponse updateMarketingTargetAssets() throws Exception {
    MarketingTargetAssetsUpdateResponse response =
        tencentAds.marketingTargetAssets().marketingTargetAssetsUpdate(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      UpdateMarketingTargetAssets updateMarketingTargetAssets = new UpdateMarketingTargetAssets();
      updateMarketingTargetAssets.init();
      MarketingTargetAssetsUpdateResponse response =
          updateMarketingTargetAssets.updateMarketingTargetAssets();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

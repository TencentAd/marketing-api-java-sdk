package com.tencent.ads.examples.v3.BusinessAssets.MarketingTargetAsset;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.MarketingTargetAssetsDeleteRequest;
import com.tencent.ads.model.v3.MarketingTargetAssetsDeleteResponse;
import com.tencent.ads.v3.TencentAds;

public class DeleteMarketingTargetAssets {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public MarketingTargetAssetsDeleteRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public MarketingTargetAssetsDeleteResponse deleteMarketingTargetAssets() throws Exception {
    MarketingTargetAssetsDeleteResponse response =
        tencentAds.marketingTargetAssets().marketingTargetAssetsDelete(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      DeleteMarketingTargetAssets deleteMarketingTargetAssets = new DeleteMarketingTargetAssets();
      deleteMarketingTargetAssets.init();
      MarketingTargetAssetsDeleteResponse response =
          deleteMarketingTargetAssets.deleteMarketingTargetAssets();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

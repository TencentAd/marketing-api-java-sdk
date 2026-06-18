package com.tencent.ads.examples.v3.BusinessAssets.AssetPermissions;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.AssetPrePermissionsUpdateRequest;
import com.tencent.ads.model.v3.AssetPrePermissionsUpdateResponse;
import com.tencent.ads.v3.TencentAds;

public class UpdateAssetPrePermissions {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public AssetPrePermissionsUpdateRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public AssetPrePermissionsUpdateResponse updateAssetPrePermissions() throws Exception {
    AssetPrePermissionsUpdateResponse response =
        tencentAds.assetPrePermissions().assetPrePermissionsUpdate(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      UpdateAssetPrePermissions updateAssetPrePermissions = new UpdateAssetPrePermissions();
      updateAssetPrePermissions.init();
      AssetPrePermissionsUpdateResponse response =
          updateAssetPrePermissions.updateAssetPrePermissions();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

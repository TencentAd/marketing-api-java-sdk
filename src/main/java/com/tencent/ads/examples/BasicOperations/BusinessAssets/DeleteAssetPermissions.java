package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.AssetPermissionsDeleteRequest;
import com.tencent.ads.model.AssetPermissionsDeleteResponse;

public class DeleteAssetPermissions {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;
  public AssetPermissionsDeleteRequest data = new AssetPermissionsDeleteRequest();
  public AssetPermissionGrantType assetPermissionGrantType = AssetPermissionGrantType.ASSET;
  public AssetType assetType = AssetType.CANVAS_WECHAT;
  public Long assetId = null;
  public Long licensingAccountId = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setAccountId(accountId);

    data.setAssetPermissionGrantType(assetPermissionGrantType);

    data.setAssetType(assetType);

    data.setAssetId(assetId);

    data.setLicensingAccountId(licensingAccountId);
  }

  public AssetPermissionsDeleteResponse deleteAssetPermissions() throws Exception {
    AssetPermissionsDeleteResponse response =
        tencentAds.assetPermissions().assetPermissionsDelete(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      DeleteAssetPermissions deleteAssetPermissions = new DeleteAssetPermissions();
      deleteAssetPermissions.init();
      AssetPermissionsDeleteResponse response = deleteAssetPermissions.deleteAssetPermissions();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

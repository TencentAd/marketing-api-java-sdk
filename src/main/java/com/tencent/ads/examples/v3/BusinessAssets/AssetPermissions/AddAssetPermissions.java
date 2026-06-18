package com.tencent.ads.examples.v3.BusinessAssets.AssetPermissions;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.AssetPermissionsAddRequest;
import com.tencent.ads.v3.TencentAds;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddAssetPermissions {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public List<Long> licensingAccountIdList = Arrays.asList(0L);
  public AssetPermissionsAddRequest data = new AssetPermissionsAddRequest();
  public Long accountId = null;
  public AssetType assetType = AssetType.CANVAS_WECHAT;
  public AssetPermissionGrantType assetPermissionGrantType = AssetPermissionGrantType.ASSET;
  public Long assetId = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setLicensingAccountIdList(licensingAccountIdList);

    data.setAccountId(accountId);

    data.setAssetType(assetType);

    AssetPermissionSpecStruct assetPermissionSpecStruct = new AssetPermissionSpecStruct();
    assetPermissionSpecStruct.setAssetPermissionGrantType(assetPermissionGrantType);
    assetPermissionSpecStruct.setAssetId(assetId);
    List<AssetPermissionSpecStruct> assetPermissionSpec = new ArrayList<>();
    assetPermissionSpec.add(assetPermissionSpecStruct);
    data.setAssetPermissionSpec(assetPermissionSpec);
  }

  public AssetPermissionsAddResponseData addAssetPermissions() throws Exception {
    AssetPermissionsAddResponseData response =
        tencentAds.assetPermissions().assetPermissionsAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddAssetPermissions addAssetPermissions = new AddAssetPermissions();
      addAssetPermissions.init();
      AssetPermissionsAddResponseData response = addAssetPermissions.addAssetPermissions();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

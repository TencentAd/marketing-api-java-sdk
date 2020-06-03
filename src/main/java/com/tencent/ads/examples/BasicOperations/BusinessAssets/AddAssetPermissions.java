package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AssetPermissionGrantType;
import com.tencent.ads.model.AssetPermissionSpecStruct;
import com.tencent.ads.model.AssetPermissionsAddRequest;
import com.tencent.ads.model.AssetPermissionsAddResponse;
import com.tencent.ads.model.AssetType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 本文件提供了一个创建资产授权(Asset permission)的简单示例
 */
public class AddAssetPermissions {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * 微信原生页ID
   */
  public Long WECHAT_PAGE_ID = 0L;
  /**
   * 被授权账号ID
   */
  public List<Long> LICENSING_ACCOUNT_ID = Arrays.asList(0L);

  /**
   * TencentAds
   */
  public TencentAds tencentAds;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true));// debug==true 会打印请求详细信息
    this.tencentAds.useSandbox();// 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
  }

  public Boolean addAssetPermissions() throws Exception {
    AssetPermissionsAddRequest data = new AssetPermissionsAddRequest();
    data.setAccountId(ACCOUNT_ID);
    data.setAssetType(AssetType.ASSET_TYPE_CANVAS_WECHAT);
    List<AssetPermissionSpecStruct> assetPermissionSpecStructList = new ArrayList<AssetPermissionSpecStruct>();
    assetPermissionSpecStructList
        .add(new AssetPermissionSpecStruct().assetId(WECHAT_PAGE_ID).assetPermissionGrantType(
            AssetPermissionGrantType.ASSET_PERMISSION_GRANT_TYPE_ASSET));
    data.setAssetPermissionSpec(assetPermissionSpecStructList);
    data.setLicensingAccountIdList(LICENSING_ACCOUNT_ID);
    AssetPermissionsAddResponse response = tencentAds.assetPermissions().assetPermissionsAdd(data);
    if (response != null) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    try {
      AddAssetPermissions addAssetPermissions = new AddAssetPermissions();
      addAssetPermissions.init();
      Boolean res = addAssetPermissions.addAssetPermissions();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
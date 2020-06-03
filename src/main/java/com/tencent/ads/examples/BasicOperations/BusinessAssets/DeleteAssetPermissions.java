package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AssetPermissionGrantType;
import com.tencent.ads.model.AssetPermissionsDeleteRequest;
import com.tencent.ads.model.AssetPermissionsDeleteResponse;
import com.tencent.ads.model.AssetType;

/*****
 * 本文件提供了一个删除资产授权(Asset permission)的简单示例
 */
public class DeleteAssetPermissions {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR WECHAT PAGE ID
   */
  public Long WECHAT_PAGE_ID = 0L; // 微信原生页ID
  /**
   * YOUR LICENSING ACCOUNT ID
   */
  public Long LICENSING_ACCOUNT_ID = 0L; // 被授权账号ID
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

  public AssetPermissionsDeleteResponse deleteAssetPermissions() throws Exception {
    AssetPermissionsDeleteRequest data = new AssetPermissionsDeleteRequest();
    data.accountId(ACCOUNT_ID);
    data.licensingAccountId(LICENSING_ACCOUNT_ID);
    data.assetType(AssetType.ASSET_TYPE_CANVAS_WECHAT);
    data.assetPermissionGrantType(AssetPermissionGrantType.ASSET_PERMISSION_GRANT_TYPE_ASSET);
    data.assetId(WECHAT_PAGE_ID);
    AssetPermissionsDeleteResponse response = tencentAds.assetPermissions()
        .assetPermissionsDelete(data);
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

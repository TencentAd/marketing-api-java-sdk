package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.UnionPositionPackagesDeleteRequest;
import com.tencent.ads.model.UnionPositionPackagesDeleteResponse;


/*****
 * 本文件提供了一个删除联盟流量包(Union position package)的简单示例
 */
public class DeleteUnionPositionPackages {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR PACKAGE ID
   */
  public Long UNION_PACKAGE_ID = 0L; // 联盟流量包ID
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

  public UnionPositionPackagesDeleteResponse deleteUnionPositionPackages() throws Exception {
    UnionPositionPackagesDeleteRequest data = new UnionPositionPackagesDeleteRequest();
    data.accountId(ACCOUNT_ID);
    data.unionPackageId(UNION_PACKAGE_ID);
    UnionPositionPackagesDeleteResponse response = tencentAds.unionPositionPackages()
        .unionPositionPackagesDelete(data);
    return response;

  }

  public static void main(String[] args) {
    try {
      DeleteUnionPositionPackages deleteUnionPositionPackages = new DeleteUnionPositionPackages();
      deleteUnionPositionPackages.init();
      UnionPositionPackagesDeleteResponse response = deleteUnionPositionPackages
          .deleteUnionPositionPackages();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

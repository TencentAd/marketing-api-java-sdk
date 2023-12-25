package com.tencent.ads.examples.v3.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.UnionPositionPackagesDeleteRequest;
import com.tencent.ads.model.v3.UnionPositionPackagesDeleteResponse;
import com.tencent.ads.v3.TencentAds;

public class DeleteUnionPositionPackages {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;
  public UnionPositionPackagesDeleteRequest data = new UnionPositionPackagesDeleteRequest();
  public Long unionPackageId = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setAccountId(accountId);

    data.setUnionPackageId(unionPackageId);
  }

  public UnionPositionPackagesDeleteResponse deleteUnionPositionPackages() throws Exception {
    UnionPositionPackagesDeleteResponse response =
        tencentAds.unionPositionPackages().unionPositionPackagesDelete(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      DeleteUnionPositionPackages deleteUnionPositionPackages = new DeleteUnionPositionPackages();
      deleteUnionPositionPackages.init();
      UnionPositionPackagesDeleteResponse response =
          deleteUnionPositionPackages.deleteUnionPositionPackages();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

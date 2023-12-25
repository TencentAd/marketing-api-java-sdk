package com.tencent.ads.examples.v3.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.UnionPositionPackagesUpdateRequest;
import com.tencent.ads.v3.TencentAds;

public class UpdateUnionPositionPackages {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public UnionPositionPackagesUpdateRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public UnionPositionPackagesUpdateResponseData updateUnionPositionPackages() throws Exception {
    UnionPositionPackagesUpdateResponseData response =
        tencentAds.unionPositionPackages().unionPositionPackagesUpdate(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      UpdateUnionPositionPackages updateUnionPositionPackages = new UpdateUnionPositionPackages();
      updateUnionPositionPackages.init();
      UnionPositionPackagesUpdateResponseData response =
          updateUnionPositionPackages.updateUnionPositionPackages();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

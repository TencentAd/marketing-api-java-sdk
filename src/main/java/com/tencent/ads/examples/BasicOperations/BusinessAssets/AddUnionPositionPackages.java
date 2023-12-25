package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.UnionPositionPackagesAddRequest;
import java.util.Arrays;
import java.util.List;

public class AddUnionPositionPackages {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;
  public UnionPositionPackagesAddRequest data = new UnionPositionPackagesAddRequest();
  public PromotedObjectType promotedObjectType = PromotedObjectType.LINK;
  public List<Long> unionPositionIdList = Arrays.asList(0L);
  public String unionPackageName = "SDK流量包5ede252bd3a86";
  public UnionPackageType unionPackageType = UnionPackageType.INCLUDE;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setAccountId(accountId);

    data.setPromotedObjectType(promotedObjectType);

    data.setUnionPositionIdList(unionPositionIdList);

    data.setUnionPackageName(unionPackageName);

    data.setUnionPackageType(unionPackageType);
  }

  public UnionPositionPackagesAddResponseData addUnionPositionPackages() throws Exception {
    UnionPositionPackagesAddResponseData response =
        tencentAds.unionPositionPackages().unionPositionPackagesAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddUnionPositionPackages addUnionPositionPackages = new AddUnionPositionPackages();
      addUnionPositionPackages.init();
      UnionPositionPackagesAddResponseData response =
          addUnionPositionPackages.addUnionPositionPackages();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

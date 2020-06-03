package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.PromotedObjectType;
import com.tencent.ads.model.UnionPackageType;
import com.tencent.ads.model.UnionPositionPackagesAddRequest;
import com.tencent.ads.model.UnionPositionPackagesAddResponseData;
import java.util.Arrays;
import java.util.UUID;

/*****
 * 本文件提供了一个创建联盟流量包(Union position package)的简单示例
 */
public class AddUnionPositionPackages {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * PROMOTED_OBJECT_TYPE
   */
  public PromotedObjectType PROMOTED_OBJECT_TYPE = PromotedObjectType.LINK; // 推广普通外链
  /**
   * UNION_PACKAGE_TYPE
   */
  public UnionPackageType UNION_PACKAGE_TYPE = UnionPackageType.INCLUDE; // 定投流量包
  /**
   * YOUR POSTION ID
   */
  public Long UNION_POSITION_ID = 0L; // 联盟广告位ID
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

  public UnionPositionPackagesAddResponseData addUnionPositionPackages() throws Exception {
    UnionPositionPackagesAddRequest data = new UnionPositionPackagesAddRequest();
    data.accountId(ACCOUNT_ID);
    data.unionPackageName("SDK流量包" + UUID.randomUUID().toString().substring(0, 10));
    data.promotedObjectType(PROMOTED_OBJECT_TYPE);
    data.unionPackageType(UNION_PACKAGE_TYPE);
    data.unionPositionIdList(Arrays.asList(UNION_POSITION_ID));
    UnionPositionPackagesAddResponseData response = tencentAds.unionPositionPackages()
        .unionPositionPackagesAdd(data);
    return response;

  }

  public static void main(String[] args) {
    try {
      AddUnionPositionPackages addUnionPositionPackages = new AddUnionPositionPackages();
      addUnionPositionPackages.init();
      UnionPositionPackagesAddResponseData response = addUnionPositionPackages
          .addUnionPositionPackages();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

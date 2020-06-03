package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.UnionPositionPackagesGetResponseData;
import java.util.Arrays;

/*****
 * 本文件提供了一个获取联盟流量包(Union position package)列表的简单示例
 */
public class GetUnionPositionPackages {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
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

  public UnionPositionPackagesGetResponseData getUnionPositionPackages() throws Exception {
    UnionPositionPackagesGetResponseData response = tencentAds.unionPositionPackages()
        .unionPositionPackagesGet(ACCOUNT_ID,
            null, null, null, Arrays
                .asList("union_package_id", "union_package_name", "union_package_type",
                    "union_position_id_list", "created_time", "last_modified_time"));
    return response;

  }

  public static void main(String[] args) {
    try {
      GetUnionPositionPackages getUnionPositionPackages = new GetUnionPositionPackages();
      getUnionPositionPackages.init();
      UnionPositionPackagesGetResponseData response = getUnionPositionPackages
          .getUnionPositionPackages();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
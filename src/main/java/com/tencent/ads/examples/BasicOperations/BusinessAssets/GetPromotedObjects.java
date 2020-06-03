package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.PromotedObjectsGetResponseData;
import java.util.Arrays;

/*****
 * 本文件提供了一个获取推广目标(Promoted object)列表的简单示例
 */
public class GetPromotedObjects {

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

  public PromotedObjectsGetResponseData getPromotedObjects() throws Exception {
    PromotedObjectsGetResponseData response = tencentAds.promotedObjects()
        .promotedObjectsGet(ACCOUNT_ID,
            null, null, null, Arrays
                .asList("promoted_object_name", "promoted_object_id", "promoted_object_type",
                    "promoted_object_spec", "created_time", "last_modified_time"));
    return response;

  }

  public static void main(String[] args) {
    try {
      GetPromotedObjects getPromotedObjects = new GetPromotedObjects();
      getPromotedObjects.init();
      PromotedObjectsGetResponseData response = getPromotedObjects.getPromotedObjects();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

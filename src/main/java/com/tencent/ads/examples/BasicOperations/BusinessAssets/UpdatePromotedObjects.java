package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.PromotedObjectType;
import com.tencent.ads.model.PromotedObjectsUpdateRequest;
import com.tencent.ads.model.PromotedObjectsUpdateResponseData;

/*****
 * 本文件提供了一个更新推广目标(Promoted object)的简单示例
 */
public class UpdatePromotedObjects {

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
  public PromotedObjectType PROMOTED_OBJECT_TYPE = PromotedObjectType.APP_IOS; // iOS App
  /**
   * YOUR PROMOTED OBJECT
   */
  public String PROMOTED_OBJECT_ID = "YOUR PROMOTED OBJECT"; // 推广目标ID，如iOS App ID
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

  public PromotedObjectsUpdateResponseData updatePromotedObjects() throws Exception {
    PromotedObjectsUpdateRequest data = new PromotedObjectsUpdateRequest();
    data.accountId(ACCOUNT_ID);
    data.promotedObjectType(PROMOTED_OBJECT_TYPE);
    data.promotedObjectId(PROMOTED_OBJECT_ID);
    PromotedObjectsUpdateResponseData response = tencentAds.promotedObjects()
        .promotedObjectsUpdate(data);
    return response;

  }

  public static void main(String[] args) {
    try {
      UpdatePromotedObjects updatePromotedObjects = new UpdatePromotedObjects();
      updatePromotedObjects.init();
      PromotedObjectsUpdateResponseData response = updatePromotedObjects.updatePromotedObjects();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.PromotedObjectsUpdateRequest;

public class UpdatePromotedObjects {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public String promotedObjectId = "YOUR PROMOTED OBJECT";
  public PromotedObjectsUpdateRequest data = new PromotedObjectsUpdateRequest();
  public Long accountId = null;
  public PromotedObjectType promotedObjectType = PromotedObjectType.APP_IOS;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setPromotedObjectId(promotedObjectId);

    data.setAccountId(accountId);

    data.setPromotedObjectType(promotedObjectType);
  }

  public PromotedObjectsUpdateResponseData updatePromotedObjects() throws Exception {
    PromotedObjectsUpdateResponseData response =
        tencentAds.promotedObjects().promotedObjectsUpdate(data);
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

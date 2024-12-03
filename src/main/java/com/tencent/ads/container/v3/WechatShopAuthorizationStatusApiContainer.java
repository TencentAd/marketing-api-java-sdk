/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 3.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.tencent.ads.container.v3;

import com.google.inject.Inject;
import com.tencent.ads.ApiContainer;
import com.tencent.ads.ApiException;
import com.tencent.ads.Pair;
import com.tencent.ads.anno.*;
import com.tencent.ads.api.v3.WechatShopAuthorizationStatusApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.WechatShopAuthorizationStatusUpdateRequest;
import com.tencent.ads.model.v3.WechatShopAuthorizationStatusUpdateResponse;
import com.tencent.ads.model.v3.WechatShopAuthorizationStatusUpdateResponseData;

public class WechatShopAuthorizationStatusApiContainer extends ApiContainer {

  @Inject WechatShopAuthorizationStatusApi api;

  /**
   * 微信小店授权状态更新
   *
   * @param data (required)
   * @return WechatShopAuthorizationStatusUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public WechatShopAuthorizationStatusUpdateResponseData wechatShopAuthorizationStatusUpdate(
      WechatShopAuthorizationStatusUpdateRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    WechatShopAuthorizationStatusUpdateResponse resp =
        api.wechatShopAuthorizationStatusUpdate(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

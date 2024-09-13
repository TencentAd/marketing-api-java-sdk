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
import com.tencent.ads.api.v3.WxGamePlayablePageApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.WxGamePlayablePageGetResponse;
import com.tencent.ads.model.v3.WxGamePlayablePageGetResponseData;
import java.util.List;

public class WxGamePlayablePageApiContainer extends ApiContainer {

  @Inject WxGamePlayablePageApi api;

  /**
   * 获取微信小游戏试玩页
   *
   * @param accountId (required)
   * @param appId (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return WxGamePlayablePageGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public WxGamePlayablePageGetResponseData wxGamePlayablePageGet(
      Long accountId, String appId, List<String> fields, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    WxGamePlayablePageGetResponse resp =
        api.wxGamePlayablePageGet(accountId, appId, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

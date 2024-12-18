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
import com.tencent.ads.api.v3.WechatStoreCatalogsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.WechatStoreCatalogsGetResponse;
import com.tencent.ads.model.v3.WechatStoreCatalogsGetResponseData;
import java.util.List;

public class WechatStoreCatalogsApiContainer extends ApiContainer {

  @Inject WechatStoreCatalogsApi api;

  /**
   * 获取微信小店商品库
   *
   * @param accountId (required)
   * @param storeIds (optional)
   * @param catalogIds (optional)
   * @param catalogName (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return WechatStoreCatalogsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public WechatStoreCatalogsGetResponseData wechatStoreCatalogsGet(
      Long accountId,
      List<String> storeIds,
      List<Long> catalogIds,
      String catalogName,
      Long page,
      Long pageSize,
      List<String> fields,
      Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    WechatStoreCatalogsGetResponse resp =
        api.wechatStoreCatalogsGet(
            accountId, storeIds, catalogIds, catalogName, page, pageSize, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

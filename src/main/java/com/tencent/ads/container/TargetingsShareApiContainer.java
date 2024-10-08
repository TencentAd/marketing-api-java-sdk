/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 1.3
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.tencent.ads.container;

import com.google.inject.Inject;
import com.tencent.ads.ApiContainer;
import com.tencent.ads.ApiException;
import com.tencent.ads.Pair;
import com.tencent.ads.anno.*;
import com.tencent.ads.api.TargetingsShareApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.TargetingsShareAddRequest;
import com.tencent.ads.model.TargetingsShareAddResponse;
import com.tencent.ads.model.TargetingsShareAddResponseData;
import com.tencent.ads.model.TargetingsShareGetResponse;
import com.tencent.ads.model.TargetingsShareGetResponseData;
import java.util.List;

public class TargetingsShareApiContainer extends ApiContainer {

  @Inject TargetingsShareApi api;

  /**
   * 分享定向
   *
   * @param data (required)
   * @return TargetingsShareAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public TargetingsShareAddResponseData targetingsShareAdd(
      TargetingsShareAddRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    TargetingsShareAddResponse resp = api.targetingsShareAdd(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 获取定向分享记录
   *
   * @param accountId (required)
   * @param targetingId (required)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return TargetingsShareGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public TargetingsShareGetResponseData targetingsShareGet(
      Long accountId,
      Long targetingId,
      Long page,
      Long pageSize,
      List<String> fields,
      Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    TargetingsShareGetResponse resp =
        api.targetingsShareGet(accountId, targetingId, page, pageSize, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

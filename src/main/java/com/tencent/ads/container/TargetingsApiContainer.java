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
import com.tencent.ads.api.TargetingsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.FilteringStruct;
import com.tencent.ads.model.TargetingsAddRequest;
import com.tencent.ads.model.TargetingsAddResponse;
import com.tencent.ads.model.TargetingsAddResponseData;
import com.tencent.ads.model.TargetingsDeleteRequest;
import com.tencent.ads.model.TargetingsDeleteResponse;
import com.tencent.ads.model.TargetingsDeleteResponseData;
import com.tencent.ads.model.TargetingsGetResponse;
import com.tencent.ads.model.TargetingsGetResponseData;
import com.tencent.ads.model.TargetingsUpdateRequest;
import com.tencent.ads.model.TargetingsUpdateResponse;
import com.tencent.ads.model.TargetingsUpdateResponseData;
import java.util.List;

public class TargetingsApiContainer extends ApiContainer {

  @Inject TargetingsApi api;

  /**
   * 创建定向
   *
   * @param data (required)
   * @return TargetingsAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public TargetingsAddResponseData targetingsAdd(TargetingsAddRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    TargetingsAddResponse resp = api.targetingsAdd(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 删除定向
   *
   * @param data (required)
   * @return TargetingsDeleteResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public TargetingsDeleteResponseData targetingsDelete(
      TargetingsDeleteRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    TargetingsDeleteResponse resp = api.targetingsDelete(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 获取定向
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return TargetingsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public TargetingsGetResponseData targetingsGet(
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields,
      Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    TargetingsGetResponse resp =
        api.targetingsGet(accountId, filtering, page, pageSize, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 更新定向
   *
   * @param data (required)
   * @return TargetingsUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public TargetingsUpdateResponseData targetingsUpdate(
      TargetingsUpdateRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    TargetingsUpdateResponse resp = api.targetingsUpdate(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

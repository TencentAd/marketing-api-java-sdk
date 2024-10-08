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
import com.tencent.ads.api.v3.AsyncTasksApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.AsyncTaskFilteringStruct;
import com.tencent.ads.model.v3.AsyncTasksAddRequest;
import com.tencent.ads.model.v3.AsyncTasksAddResponse;
import com.tencent.ads.model.v3.AsyncTasksAddResponseData;
import com.tencent.ads.model.v3.AsyncTasksGetResponse;
import com.tencent.ads.model.v3.AsyncTasksGetResponseData;
import java.util.List;

public class AsyncTasksApiContainer extends ApiContainer {

  @Inject AsyncTasksApi api;

  /**
   * 创建异步任务
   *
   * @param data (required)
   * @return AsyncTasksAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public AsyncTasksAddResponseData asyncTasksAdd(AsyncTasksAddRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    AsyncTasksAddResponse resp = api.asyncTasksAdd(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 获取异步任务
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return AsyncTasksGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public AsyncTasksGetResponseData asyncTasksGet(
      Long accountId,
      List<AsyncTaskFilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields,
      Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    AsyncTasksGetResponse resp =
        api.asyncTasksGet(accountId, filtering, page, pageSize, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

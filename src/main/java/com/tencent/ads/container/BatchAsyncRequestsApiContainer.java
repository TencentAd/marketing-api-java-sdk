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
import com.tencent.ads.api.BatchAsyncRequestsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.BatchAsyncRequestsAddRequest;
import com.tencent.ads.model.BatchAsyncRequestsAddResponse;
import com.tencent.ads.model.BatchAsyncRequestsAddResponseData;
import com.tencent.ads.model.BatchAsyncRequestsGetResponse;
import com.tencent.ads.model.BatchAsyncRequestsGetResponseData;
import com.tencent.ads.model.FilteringStruct;
import java.util.List;

public class BatchAsyncRequestsApiContainer extends ApiContainer {

  @Inject BatchAsyncRequestsApi api;

  /**
   * 创建批量异步请求任务
   *
   * @param data (required)
   * @return BatchAsyncRequestsAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public BatchAsyncRequestsAddResponseData batchAsyncRequestsAdd(
      BatchAsyncRequestsAddRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    BatchAsyncRequestsAddResponse resp = api.batchAsyncRequestsAdd(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 获取批量异步请求任务列表
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return BatchAsyncRequestsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public BatchAsyncRequestsGetResponseData batchAsyncRequestsGet(
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields,
      Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    BatchAsyncRequestsGetResponse resp =
        api.batchAsyncRequestsGet(accountId, filtering, page, pageSize, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

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
import com.tencent.ads.api.v3.BatchAsyncRequestSpecificationApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.BatchAsyncRequestSpecificationGetResponse;
import com.tencent.ads.model.v3.BatchAsyncRequestSpecificationGetResponseData;
import java.util.List;

public class BatchAsyncRequestSpecificationApiContainer extends ApiContainer {

  @Inject BatchAsyncRequestSpecificationApi api;

  /**
   * 获取批量异步请求任务详情
   *
   * @param accountId (required)
   * @param taskId (required)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return BatchAsyncRequestSpecificationGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public BatchAsyncRequestSpecificationGetResponseData batchAsyncRequestSpecificationGet(
      Long accountId,
      Long taskId,
      Long page,
      Long pageSize,
      List<String> fields,
      Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    BatchAsyncRequestSpecificationGetResponse resp =
        api.batchAsyncRequestSpecificationGet(
            accountId, taskId, page, pageSize, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

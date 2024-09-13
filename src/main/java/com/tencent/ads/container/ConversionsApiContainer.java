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
import com.tencent.ads.api.ConversionsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.ConversionsAddRequest;
import com.tencent.ads.model.ConversionsAddResponse;
import com.tencent.ads.model.ConversionsAddResponseData;
import com.tencent.ads.model.ConversionsGetResponse;
import com.tencent.ads.model.ConversionsGetResponseData;
import com.tencent.ads.model.FilteringStruct;
import java.util.List;

public class ConversionsApiContainer extends ApiContainer {

  @Inject ConversionsApi api;

  /**
   * 新增转化归因
   *
   * @param data (required)
   * @return ConversionsAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ConversionsAddResponseData conversionsAdd(ConversionsAddRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    ConversionsAddResponse resp = api.conversionsAdd(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 获取转化归因
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ConversionsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ConversionsGetResponseData conversionsGet(
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields,
      Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    ConversionsGetResponse resp =
        api.conversionsGet(accountId, filtering, page, pageSize, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

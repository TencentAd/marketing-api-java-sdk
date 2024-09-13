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
import com.tencent.ads.api.v3.ElementAppealQuotaApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.ElementAppealQuotaGetResponse;
import com.tencent.ads.model.v3.ElementAppealQuotaGetResponseData;
import java.util.List;

public class ElementAppealQuotaApiContainer extends ApiContainer {

  @Inject ElementAppealQuotaApi api;

  /**
   * 获取元素申诉复审配额
   *
   * @param accountId (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return ElementAppealQuotaGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ElementAppealQuotaGetResponseData elementAppealQuotaGet(
      Long accountId, List<String> fields, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    ElementAppealQuotaGetResponse resp = api.elementAppealQuotaGet(accountId, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

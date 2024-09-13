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
import com.tencent.ads.api.v3.LeadsCallRecordApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.LeadsCallRecordGetResponse;
import com.tencent.ads.model.v3.LeadsCallRecordGetResponseData;
import java.util.List;

public class LeadsCallRecordApiContainer extends ApiContainer {

  @Inject LeadsCallRecordApi api;

  /**
   * 获取通话结果
   *
   * @param accountId (required)
   * @param leadsId (optional)
   * @param outerLeadsId (optional)
   * @param requestId (optional)
   * @param contactId (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return LeadsCallRecordGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public LeadsCallRecordGetResponseData leadsCallRecordGet(
      Long accountId,
      Long leadsId,
      String outerLeadsId,
      String requestId,
      String contactId,
      List<String> fields,
      Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    LeadsCallRecordGetResponse resp =
        api.leadsCallRecordGet(
            accountId, leadsId, outerLeadsId, requestId, contactId, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

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
import com.tencent.ads.api.AgencyRealtimeCostApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.AgencyRealtimeCostGetResponse;
import com.tencent.ads.model.AgencyRealtimeCostGetResponseData;
import java.util.List;

public class AgencyRealtimeCostApiContainer extends ApiContainer {

  @Inject AgencyRealtimeCostApi api;

  /**
   * 服务商当日分账户实时消耗
   *
   * @param accountId (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return AgencyRealtimeCostGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public AgencyRealtimeCostGetResponseData agencyRealtimeCostGet(
      Long accountId, List<String> fields, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    AgencyRealtimeCostGetResponse resp = api.agencyRealtimeCostGet(accountId, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

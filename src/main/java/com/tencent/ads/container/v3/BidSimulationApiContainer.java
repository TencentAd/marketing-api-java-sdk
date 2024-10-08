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
import com.tencent.ads.api.v3.BidSimulationApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.BidSimulationGetResponse;
import com.tencent.ads.model.v3.BidSimulationGetResponseData;
import java.util.List;

public class BidSimulationApiContainer extends ApiContainer {

  @Inject BidSimulationApi api;

  /**
   * 出价模拟预估
   *
   * @param accountId (required)
   * @param reqType (optional)
   * @param optimizationGoalLevel (optional)
   * @param adgroupId (optional)
   * @param bidList (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return BidSimulationGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public BidSimulationGetResponseData bidSimulationGet(
      Long accountId,
      Long reqType,
      Long optimizationGoalLevel,
      Long adgroupId,
      List<Long> bidList,
      List<String> fields,
      Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    BidSimulationGetResponse resp =
        api.bidSimulationGet(
            accountId, reqType, optimizationGoalLevel, adgroupId, bidList, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

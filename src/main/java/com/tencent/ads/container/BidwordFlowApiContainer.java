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
import com.tencent.ads.api.BidwordFlowApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.BidwordFlowGetRequest;
import com.tencent.ads.model.BidwordFlowGetResponse;
import com.tencent.ads.model.BidwordFlowGetResponseData;

public class BidwordFlowApiContainer extends ApiContainer {

  @Inject BidwordFlowApi api;

  /**
   * 查询关键词流量接口
   *
   * @param data (required)
   * @return BidwordFlowGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public BidwordFlowGetResponseData bidwordFlowGet(BidwordFlowGetRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    BidwordFlowGetResponse resp = api.bidwordFlowGet(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

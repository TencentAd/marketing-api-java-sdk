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
import com.tencent.ads.api.BidwordRptApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.BidwordRptGetRequest;
import com.tencent.ads.model.BidwordRptGetResponse;
import com.tencent.ads.model.BidwordRptGetResponseData;

public class BidwordRptApiContainer extends ApiContainer {

  @Inject BidwordRptApi api;

  /**
   * 关键词报表接口
   *
   * @param data (required)
   * @return BidwordRptGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public BidwordRptGetResponseData bidwordRptGet(BidwordRptGetRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    BidwordRptGetResponse resp = api.bidwordRptGet(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

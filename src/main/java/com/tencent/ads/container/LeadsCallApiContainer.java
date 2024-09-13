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
import com.tencent.ads.api.LeadsCallApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.LeadsCallCreateRequest;
import com.tencent.ads.model.LeadsCallCreateResponse;
import com.tencent.ads.model.LeadsCallCreateResponseData;

public class LeadsCallApiContainer extends ApiContainer {

  @Inject LeadsCallApi api;

  /**
   * 网络电话呼叫
   *
   * @param data (required)
   * @return LeadsCallCreateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public LeadsCallCreateResponseData leadsCallCreate(
      LeadsCallCreateRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    LeadsCallCreateResponse resp = api.leadsCallCreate(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

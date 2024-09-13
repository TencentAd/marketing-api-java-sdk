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
import com.tencent.ads.api.v3.TargetingsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.TargetingsGetRequest;
import com.tencent.ads.model.v3.TargetingsGetResponse;
import com.tencent.ads.model.v3.TargetingsGetResponseData;

public class TargetingsApiContainer extends ApiContainer {

  @Inject TargetingsApi api;

  /**
   * 获取定向模板
   *
   * @param data (required)
   * @return TargetingsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public TargetingsGetResponseData targetingsGet(TargetingsGetRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    TargetingsGetResponse resp = api.targetingsGet(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

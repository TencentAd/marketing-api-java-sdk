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
import com.tencent.ads.api.AdParamApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.AdParamGetRequest;
import com.tencent.ads.model.AdParamGetResponse;
import com.tencent.ads.model.AdParamGetResponseData;

public class AdParamApiContainer extends ApiContainer {

  @Inject AdParamApi api;

  /**
   * 获取词包
   *
   * @param data (required)
   * @return AdParamGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public AdParamGetResponseData adParamGet(AdParamGetRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    AdParamGetResponse resp = api.adParamGet(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

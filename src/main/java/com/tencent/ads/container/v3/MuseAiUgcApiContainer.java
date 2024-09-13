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
import com.tencent.ads.api.v3.MuseAiUgcApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.MuseAiUgcAddRequest;
import com.tencent.ads.model.v3.MuseAiUgcAddResponse;
import com.tencent.ads.model.v3.MuseAiUgcAddResponseData;

public class MuseAiUgcApiContainer extends ApiContainer {

  @Inject MuseAiUgcApi api;

  /**
   * 二次编辑素材回传接口
   *
   * @param data (required)
   * @return MuseAiUgcAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public MuseAiUgcAddResponseData museAiUgcAdd(MuseAiUgcAddRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    MuseAiUgcAddResponse resp = api.museAiUgcAdd(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

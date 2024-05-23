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
import com.tencent.ads.anno.*;
import com.tencent.ads.api.v3.MuseAiMaterialApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.MuseAiMaterialAddRequest;
import com.tencent.ads.model.v3.MuseAiMaterialAddResponse;
import com.tencent.ads.model.v3.MuseAiMaterialAddResponseData;

public class MuseAiMaterialApiContainer extends ApiContainer {

  @Inject MuseAiMaterialApi api;

  /**
   * 选择并保存妙思AI素材接口
   *
   * @param data (required)
   * @return MuseAiMaterialAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public MuseAiMaterialAddResponseData museAiMaterialAdd(
      MuseAiMaterialAddRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    MuseAiMaterialAddResponse resp = api.museAiMaterialAdd(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
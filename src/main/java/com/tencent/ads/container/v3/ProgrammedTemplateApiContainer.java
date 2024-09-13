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
import com.tencent.ads.api.v3.ProgrammedTemplateApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.ProgrammedTemplateGetRequest;
import com.tencent.ads.model.v3.ProgrammedTemplateGetResponse;
import com.tencent.ads.model.v3.ProgrammedTemplateGetResponseData;

public class ProgrammedTemplateApiContainer extends ApiContainer {

  @Inject ProgrammedTemplateApi api;

  /**
   * 获取模板列表接口
   *
   * @param data (required)
   * @return ProgrammedTemplateGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ProgrammedTemplateGetResponseData programmedTemplateGet(
      ProgrammedTemplateGetRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    ProgrammedTemplateGetResponse resp = api.programmedTemplateGet(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

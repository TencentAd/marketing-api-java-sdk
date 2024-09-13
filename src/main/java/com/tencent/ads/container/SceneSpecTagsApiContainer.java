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
import com.tencent.ads.api.SceneSpecTagsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.SceneSpecTagsGetResponse;
import com.tencent.ads.model.SceneSpecTagsGetResponseData;
import java.util.List;

public class SceneSpecTagsApiContainer extends ApiContainer {

  @Inject SceneSpecTagsApi api;

  /**
   * 获取场景定向标签
   *
   * @param type (required)
   * @param accountId (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return SceneSpecTagsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public SceneSpecTagsGetResponseData sceneSpecTagsGet(
      String type, Long accountId, List<String> fields, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    SceneSpecTagsGetResponse resp = api.sceneSpecTagsGet(type, accountId, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

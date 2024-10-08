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
import com.tencent.ads.api.v3.AudienceGrantRelationsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.AudienceGrantRelationsAddRequest;
import com.tencent.ads.model.v3.AudienceGrantRelationsAddResponse;
import com.tencent.ads.model.v3.AudienceGrantRelationsGetResponse;
import com.tencent.ads.model.v3.AudienceGrantRelationsGetResponseData;
import com.tencent.ads.model.v3.AudienceGrantRelationsGetSingleFilter;
import java.util.List;

public class AudienceGrantRelationsApiContainer extends ApiContainer {

  @Inject AudienceGrantRelationsApi api;

  /**
   * 添加人群授权
   *
   * @param data (required)
   * @return AudienceGrantRelationsAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public AudienceGrantRelationsAddResponse audienceGrantRelationsAdd(
      AudienceGrantRelationsAddRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    AudienceGrantRelationsAddResponse resp = api.audienceGrantRelationsAdd(data, headerPair);
    handleResponse(gson.toJson(resp));

    return resp;
  }

  /**
   * 获取人群授权信息
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return AudienceGrantRelationsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public AudienceGrantRelationsGetResponseData audienceGrantRelationsGet(
      Long accountId,
      List<AudienceGrantRelationsGetSingleFilter> filtering,
      Long page,
      Long pageSize,
      List<String> fields,
      Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    AudienceGrantRelationsGetResponse resp =
        api.audienceGrantRelationsGet(accountId, filtering, page, pageSize, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

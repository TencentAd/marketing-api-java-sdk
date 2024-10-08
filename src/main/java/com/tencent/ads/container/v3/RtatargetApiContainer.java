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
import com.tencent.ads.api.v3.RtatargetApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.RtatargetAddRequest;
import com.tencent.ads.model.v3.RtatargetAddResponse;
import com.tencent.ads.model.v3.RtatargetDeleteRequest;
import com.tencent.ads.model.v3.RtatargetDeleteResponse;
import com.tencent.ads.model.v3.RtatargetGetRequest;
import com.tencent.ads.model.v3.RtatargetGetResponse;
import com.tencent.ads.model.v3.RtatargetGetResponseData;

public class RtatargetApiContainer extends ApiContainer {

  @Inject RtatargetApi api;

  /**
   * 新增RTA策略
   *
   * @param data (required)
   * @return RtatargetAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public RtatargetAddResponse rtatargetAdd(RtatargetAddRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    RtatargetAddResponse resp = api.rtatargetAdd(data, headerPair);
    handleResponse(gson.toJson(resp));

    return resp;
  }

  /**
   * 删除RTA策略
   *
   * @param data (required)
   * @return RtatargetDeleteResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public RtatargetDeleteResponse rtatargetDelete(RtatargetDeleteRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    RtatargetDeleteResponse resp = api.rtatargetDelete(data, headerPair);
    handleResponse(gson.toJson(resp));

    return resp;
  }

  /**
   * 获取RTA策略
   *
   * @param data (required)
   * @return RtatargetGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public RtatargetGetResponseData rtatargetGet(RtatargetGetRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    RtatargetGetResponse resp = api.rtatargetGet(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

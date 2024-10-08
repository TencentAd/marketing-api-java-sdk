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
import com.tencent.ads.api.v3.ProgrammedApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.ProgrammedAddRequest;
import com.tencent.ads.model.v3.ProgrammedAddResponse;
import com.tencent.ads.model.v3.ProgrammedAddResponseData;
import com.tencent.ads.model.v3.ProgrammedGetRequest;
import com.tencent.ads.model.v3.ProgrammedGetResponse;
import com.tencent.ads.model.v3.ProgrammedGetResponseData;
import com.tencent.ads.model.v3.ProgrammedUpdateRequest;
import com.tencent.ads.model.v3.ProgrammedUpdateResponse;
import com.tencent.ads.model.v3.ProgrammedUpdateResponseData;

public class ProgrammedApiContainer extends ApiContainer {

  @Inject ProgrammedApi api;

  /**
   * 创建模板预览接口
   *
   * @param data (required)
   * @return ProgrammedAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ProgrammedAddResponseData programmedAdd(ProgrammedAddRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    ProgrammedAddResponse resp = api.programmedAdd(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 获取模板预览接口
   *
   * @param data (required)
   * @return ProgrammedGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ProgrammedGetResponseData programmedGet(ProgrammedGetRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    ProgrammedGetResponse resp = api.programmedGet(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 更新模板预览接口
   *
   * @param data (required)
   * @return ProgrammedUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ProgrammedUpdateResponseData programmedUpdate(
      ProgrammedUpdateRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    ProgrammedUpdateResponse resp = api.programmedUpdate(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

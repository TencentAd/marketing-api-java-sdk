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
import com.tencent.ads.api.v3.ExtendPackageApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.ExtendPackageAddRequest;
import com.tencent.ads.model.v3.ExtendPackageAddResponse;
import com.tencent.ads.model.v3.ExtendPackageAddResponseData;
import com.tencent.ads.model.v3.ExtendPackageGetResponse;
import com.tencent.ads.model.v3.ExtendPackageGetResponseData;
import com.tencent.ads.model.v3.ExtendPackageUpdateRequest;
import com.tencent.ads.model.v3.ExtendPackageUpdateResponse;
import com.tencent.ads.model.v3.ExtendPackageUpdateResponseData;
import com.tencent.ads.model.v3.FilteringStruct;
import java.util.List;

public class ExtendPackageApiContainer extends ApiContainer {

  @Inject ExtendPackageApi api;

  /**
   * 创建应用分包
   *
   * @param data (required)
   * @return ExtendPackageAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ExtendPackageAddResponseData extendPackageAdd(
      ExtendPackageAddRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    ExtendPackageAddResponse resp = api.extendPackageAdd(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 查询应用分包列表
   *
   * @param accountId (required)
   * @param packageId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ExtendPackageGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ExtendPackageGetResponseData extendPackageGet(
      Long accountId,
      Long packageId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields,
      Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    ExtendPackageGetResponse resp =
        api.extendPackageGet(accountId, packageId, filtering, page, pageSize, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 更新应用子包版本
   *
   * @param data (required)
   * @return ExtendPackageUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ExtendPackageUpdateResponseData extendPackageUpdate(
      ExtendPackageUpdateRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    ExtendPackageUpdateResponse resp = api.extendPackageUpdate(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

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
import com.tencent.ads.api.BrandApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.BrandAddResponse;
import com.tencent.ads.model.BrandAddResponseData;
import com.tencent.ads.model.BrandGetResponse;
import com.tencent.ads.model.BrandGetResponseData;
import java.io.File;
import java.util.List;

public class BrandApiContainer extends ApiContainer {

  @Inject BrandApi api;

  /**
   * 创建品牌形象
   *
   * @param accountId (required)
   * @param name (required)
   * @param brandImageFile (required)
   * @return BrandAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public BrandAddResponseData brandAdd(
      Long accountId, String name, File brandImageFile, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    BrandAddResponse resp = api.brandAdd(accountId, name, brandImageFile, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 获取品牌形象列表
   *
   * @param accountId (required)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return BrandGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public BrandGetResponseData brandGet(
      Long accountId, Long page, Long pageSize, List<String> fields, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    BrandGetResponse resp = api.brandGet(accountId, page, pageSize, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

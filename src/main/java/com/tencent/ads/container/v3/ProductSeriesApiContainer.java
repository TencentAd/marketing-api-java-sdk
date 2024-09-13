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
import com.tencent.ads.api.v3.ProductSeriesApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.ProductSeriesAddRequest;
import com.tencent.ads.model.v3.ProductSeriesAddResponse;
import com.tencent.ads.model.v3.ProductSeriesAddResponseData;
import com.tencent.ads.model.v3.ProductSeriesGetResponse;
import com.tencent.ads.model.v3.ProductSeriesGetResponseData;
import com.tencent.ads.model.v3.ProductSeriesSearchFilteringStruct;
import java.util.List;

public class ProductSeriesApiContainer extends ApiContainer {

  @Inject ProductSeriesApi api;

  /**
   * 创建商品系列
   *
   * @param data (required)
   * @return ProductSeriesAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ProductSeriesAddResponseData productSeriesAdd(
      ProductSeriesAddRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    ProductSeriesAddResponse resp = api.productSeriesAdd(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 获取商品系列
   *
   * @param accountId (required)
   * @param catalogId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ProductSeriesGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ProductSeriesGetResponseData productSeriesGet(
      Long accountId,
      Long catalogId,
      List<ProductSeriesSearchFilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields,
      Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    ProductSeriesGetResponse resp =
        api.productSeriesGet(accountId, catalogId, filtering, page, pageSize, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

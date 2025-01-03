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
import com.tencent.ads.api.v3.ProductItemsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.FilteringStruct;
import com.tencent.ads.model.v3.ProductItemsAddRequest;
import com.tencent.ads.model.v3.ProductItemsAddResponse;
import com.tencent.ads.model.v3.ProductItemsAddResponseData;
import com.tencent.ads.model.v3.ProductItemsBatchUpdateRequest;
import com.tencent.ads.model.v3.ProductItemsBatchUpdateResponse;
import com.tencent.ads.model.v3.ProductItemsDeleteRequest;
import com.tencent.ads.model.v3.ProductItemsDeleteResponse;
import com.tencent.ads.model.v3.ProductItemsGetResponse;
import com.tencent.ads.model.v3.ProductItemsGetResponseData;
import com.tencent.ads.model.v3.ProductItemsUpdateRequest;
import com.tencent.ads.model.v3.ProductItemsUpdateResponse;
import java.util.List;

public class ProductItemsApiContainer extends ApiContainer {

  @Inject ProductItemsApi api;

  /**
   * 添加商品
   *
   * @param data (required)
   * @return ProductItemsAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ProductItemsAddResponseData productItemsAdd(
      ProductItemsAddRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    ProductItemsAddResponse resp = api.productItemsAdd(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 批量更新商品信息
   *
   * @param data (required)
   * @return ProductItemsBatchUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ProductItemsBatchUpdateResponse productItemsBatchUpdate(
      ProductItemsBatchUpdateRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    ProductItemsBatchUpdateResponse resp = api.productItemsBatchUpdate(data, headerPair);
    handleResponse(gson.toJson(resp));

    return resp;
  }

  /**
   * 删除商品信息
   *
   * @param data (required)
   * @return ProductItemsDeleteResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ProductItemsDeleteResponse productItemsDelete(
      ProductItemsDeleteRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    ProductItemsDeleteResponse resp = api.productItemsDelete(data, headerPair);
    handleResponse(gson.toJson(resp));

    return resp;
  }

  /**
   * 获取商品
   *
   * @param accountId (required)
   * @param productCatalogId (required)
   * @param filtering (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ProductItemsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ProductItemsGetResponseData productItemsGet(
      Long accountId,
      Long productCatalogId,
      List<FilteringStruct> filtering,
      List<String> fields,
      Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    ProductItemsGetResponse resp =
        api.productItemsGet(accountId, productCatalogId, filtering, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 更新商品信息
   *
   * @param data (required)
   * @return ProductItemsUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ProductItemsUpdateResponse productItemsUpdate(
      ProductItemsUpdateRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    ProductItemsUpdateResponse resp = api.productItemsUpdate(data, headerPair);
    handleResponse(gson.toJson(resp));

    return resp;
  }
}

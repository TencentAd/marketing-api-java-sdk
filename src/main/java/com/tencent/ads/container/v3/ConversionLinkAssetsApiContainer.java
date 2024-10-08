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
import com.tencent.ads.api.v3.ConversionLinkAssetsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.ConversionLinkAssetsAddRequest;
import com.tencent.ads.model.v3.ConversionLinkAssetsAddResponse;
import com.tencent.ads.model.v3.ConversionLinkAssetsAddResponseData;
import com.tencent.ads.model.v3.ConversionLinkAssetsGetResponse;
import com.tencent.ads.model.v3.ConversionLinkAssetsGetResponseData;
import com.tencent.ads.model.v3.ConversionLinkAssetsUpdateRequest;
import com.tencent.ads.model.v3.ConversionLinkAssetsUpdateResponse;
import com.tencent.ads.model.v3.ConversionLinkAssetsUpdateResponseData;
import com.tencent.ads.model.v3.FilteringStruct;
import java.util.List;

public class ConversionLinkAssetsApiContainer extends ApiContainer {

  @Inject ConversionLinkAssetsApi api;

  /**
   * 创建营销链路
   *
   * @param data (required)
   * @return ConversionLinkAssetsAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ConversionLinkAssetsAddResponseData conversionLinkAssetsAdd(
      ConversionLinkAssetsAddRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    ConversionLinkAssetsAddResponse resp = api.conversionLinkAssetsAdd(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 获取营销链路
   *
   * @param accountId (required)
   * @param filtering (required)
   * @param page (optional)
   * @param pageSize (optional)
   * @param key (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ConversionLinkAssetsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ConversionLinkAssetsGetResponseData conversionLinkAssetsGet(
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      String key,
      List<String> fields,
      Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    ConversionLinkAssetsGetResponse resp =
        api.conversionLinkAssetsGet(accountId, filtering, page, pageSize, key, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 更新营销链路
   *
   * @param data (required)
   * @return ConversionLinkAssetsUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ConversionLinkAssetsUpdateResponseData conversionLinkAssetsUpdate(
      ConversionLinkAssetsUpdateRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    ConversionLinkAssetsUpdateResponse resp = api.conversionLinkAssetsUpdate(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

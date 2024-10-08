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
import com.tencent.ads.api.v3.AdcreativePreviewsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.AdcreativePreviewsAddRequest;
import com.tencent.ads.model.v3.AdcreativePreviewsAddResponse;
import com.tencent.ads.model.v3.AdcreativePreviewsAddResponseData;
import com.tencent.ads.model.v3.AdcreativePreviewsGetResponse;
import com.tencent.ads.model.v3.AdcreativePreviewsGetResponseData;
import com.tencent.ads.model.v3.FilteringStruct;
import java.util.List;

public class AdcreativePreviewsApiContainer extends ApiContainer {

  @Inject AdcreativePreviewsApi api;

  /**
   * 绑定广告预览受众
   *
   * @param data (required)
   * @return AdcreativePreviewsAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public AdcreativePreviewsAddResponseData adcreativePreviewsAdd(
      AdcreativePreviewsAddRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    AdcreativePreviewsAddResponse resp = api.adcreativePreviewsAdd(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 获取绑定的广告预览受众列表
   *
   * @param accountId (required)
   * @param filtering (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return AdcreativePreviewsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public AdcreativePreviewsGetResponseData adcreativePreviewsGet(
      Long accountId, List<FilteringStruct> filtering, List<String> fields, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    AdcreativePreviewsGetResponse resp =
        api.adcreativePreviewsGet(accountId, filtering, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

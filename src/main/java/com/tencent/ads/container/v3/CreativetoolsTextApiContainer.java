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
import com.tencent.ads.anno.*;
import com.tencent.ads.api.v3.CreativetoolsTextApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.CreativetoolsTextGetResponse;
import com.tencent.ads.model.v3.CreativetoolsTextGetResponseData;
import java.util.List;

public class CreativetoolsTextApiContainer extends ApiContainer {

  @Inject CreativetoolsTextApi api;

  /**
   * 获取广告文案
   *
   * @param accountId (required)
   * @param maxTextLength (required)
   * @param keyword (optional)
   * @param filtering (optional)
   * @param number (optional)
   * @param categoryFirstLevel (optional)
   * @param categorySecondLevel (optional)
   * @param productCatalogId (optional)
   * @param productOuterIds (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return CreativetoolsTextGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public CreativetoolsTextGetResponseData creativetoolsTextGet(
      Long accountId,
      Long maxTextLength,
      String keyword,
      List<Long> filtering,
      Long number,
      Long categoryFirstLevel,
      Long categorySecondLevel,
      Long productCatalogId,
      List<String> productOuterIds,
      List<String> fields,
      String... headerPair)
      throws ApiException, TencentAdsResponseException {
    CreativetoolsTextGetResponse resp =
        api.creativetoolsTextGet(
            accountId,
            maxTextLength,
            keyword,
            filtering,
            number,
            categoryFirstLevel,
            categorySecondLevel,
            productCatalogId,
            productOuterIds,
            fields,
            headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
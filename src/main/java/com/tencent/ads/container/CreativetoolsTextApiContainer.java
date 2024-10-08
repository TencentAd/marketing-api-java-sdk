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
import com.tencent.ads.api.CreativetoolsTextApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.CreativetoolsTextGetResponse;
import com.tencent.ads.model.CreativetoolsTextGetResponseData;
import java.util.List;

public class CreativetoolsTextApiContainer extends ApiContainer {

  @Inject CreativetoolsTextApi api;

  /**
   * 获取广告文案
   *
   * @param accountId (required)
   * @param maxTextLength (required)
   * @param categoryFirstLevel (optional)
   * @param categorySecondLevel (optional)
   * @param keyword (optional)
   * @param filtering (optional)
   * @param number (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return CreativetoolsTextGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public CreativetoolsTextGetResponseData creativetoolsTextGet(
      Long accountId,
      Long maxTextLength,
      Long categoryFirstLevel,
      Long categorySecondLevel,
      String keyword,
      List<Long> filtering,
      Long number,
      List<String> fields,
      Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    CreativetoolsTextGetResponse resp =
        api.creativetoolsTextGet(
            accountId,
            maxTextLength,
            categoryFirstLevel,
            categorySecondLevel,
            keyword,
            filtering,
            number,
            fields,
            headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

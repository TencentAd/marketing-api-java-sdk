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
import com.tencent.ads.api.CustomAudienceInsightsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.CustomAudienceInsightsGetResponse;
import com.tencent.ads.model.CustomAudienceInsightsGetResponseData;
import java.util.List;

public class CustomAudienceInsightsApiContainer extends ApiContainer {

  @Inject CustomAudienceInsightsApi api;

  /**
   * 人群洞察分析
   *
   * @param accountId (required)
   * @param audienceId (required)
   * @param dimensionType (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return CustomAudienceInsightsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public CustomAudienceInsightsGetResponseData customAudienceInsightsGet(
      Long accountId,
      Long audienceId,
      List<String> dimensionType,
      List<String> fields,
      Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    CustomAudienceInsightsGetResponse resp =
        api.customAudienceInsightsGet(accountId, audienceId, dimensionType, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

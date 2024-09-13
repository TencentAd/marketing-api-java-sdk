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
import com.tencent.ads.api.v3.CustomAudienceEstimationsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.CustomAudienceEstimationsGetResponse;
import com.tencent.ads.model.v3.CustomAudienceEstimationsGetResponseData;
import com.tencent.ads.model.v3.EstimationAudienceSpec;
import java.util.List;

public class CustomAudienceEstimationsApiContainer extends ApiContainer {

  @Inject CustomAudienceEstimationsApi api;

  /**
   * 人群覆盖数预估
   *
   * @param accountId (required)
   * @param type (required)
   * @param audienceSpec (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return CustomAudienceEstimationsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public CustomAudienceEstimationsGetResponseData customAudienceEstimationsGet(
      Long accountId,
      String type,
      EstimationAudienceSpec audienceSpec,
      List<String> fields,
      Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    CustomAudienceEstimationsGetResponse resp =
        api.customAudienceEstimationsGet(accountId, type, audienceSpec, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

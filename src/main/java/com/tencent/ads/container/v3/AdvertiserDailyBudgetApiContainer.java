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
import com.tencent.ads.api.v3.AdvertiserDailyBudgetApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.AdvertiserDailyBudgetGetResponse;
import com.tencent.ads.model.v3.AdvertiserDailyBudgetGetResponseData;
import java.util.List;

public class AdvertiserDailyBudgetApiContainer extends ApiContainer {

  @Inject AdvertiserDailyBudgetApi api;

  /**
   * 获取竞价广告账户日预算
   *
   * @param accountId (required)
   * @param fields (required)
   * @return AdvertiserDailyBudgetGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public AdvertiserDailyBudgetGetResponseData advertiserDailyBudgetGet(
      Long accountId, List<String> fields, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    AdvertiserDailyBudgetGetResponse resp =
        api.advertiserDailyBudgetGet(accountId, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
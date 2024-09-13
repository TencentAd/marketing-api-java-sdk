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
import com.tencent.ads.api.v3.MarketingTargetTypesApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.MarketingTargetTypesGetResponse;
import com.tencent.ads.model.v3.MarketingTargetTypesGetResponseData;
import java.util.List;

public class MarketingTargetTypesApiContainer extends ApiContainer {

  @Inject MarketingTargetTypesApi api;

  /**
   * 获取可投放推广内容资产类型名称
   *
   * @param accountId (optional)
   * @param organizationId (optional)
   * @param businessType (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return MarketingTargetTypesGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public MarketingTargetTypesGetResponseData marketingTargetTypesGet(
      Long accountId,
      Long organizationId,
      String businessType,
      List<String> fields,
      Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    MarketingTargetTypesGetResponse resp =
        api.marketingTargetTypesGet(accountId, organizationId, businessType, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

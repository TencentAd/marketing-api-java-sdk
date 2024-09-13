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
import com.tencent.ads.api.v3.UserActionSetReportsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.DateRangeDn;
import com.tencent.ads.model.v3.UserActionSetReportsGetResponse;
import com.tencent.ads.model.v3.UserActionSetReportsGetResponseData;
import java.util.List;

public class UserActionSetReportsApiContainer extends ApiContainer {

  @Inject UserActionSetReportsApi api;

  /**
   * 获取用户行为数据源报表
   *
   * @param accountId (required)
   * @param userActionSetId (required)
   * @param dateRange (required)
   * @param timeGranularity (required)
   * @param aggregation (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return UserActionSetReportsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public UserActionSetReportsGetResponseData userActionSetReportsGet(
      Long accountId,
      Long userActionSetId,
      DateRangeDn dateRange,
      String timeGranularity,
      String aggregation,
      List<String> fields,
      Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    UserActionSetReportsGetResponse resp =
        api.userActionSetReportsGet(
            accountId,
            userActionSetId,
            dateRange,
            timeGranularity,
            aggregation,
            fields,
            headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

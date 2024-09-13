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
import com.tencent.ads.api.v3.MergeFundTypeDailyBalanceReportApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.DateRangeTransaction;
import com.tencent.ads.model.v3.MergeFundTypeDailyBalanceReportGetResponse;
import com.tencent.ads.model.v3.MergeFundTypeDailyBalanceReportGetResponseData;
import java.util.List;

public class MergeFundTypeDailyBalanceReportApiContainer extends ApiContainer {

  @Inject MergeFundTypeDailyBalanceReportApi api;

  /**
   * 获取资金合并类型资金账户日结明细
   *
   * @param accountId (required)
   * @param dateRange (required)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return MergeFundTypeDailyBalanceReportGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public MergeFundTypeDailyBalanceReportGetResponseData mergeFundTypeDailyBalanceReportGet(
      Long accountId,
      DateRangeTransaction dateRange,
      Long page,
      Long pageSize,
      List<String> fields,
      Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    MergeFundTypeDailyBalanceReportGetResponse resp =
        api.mergeFundTypeDailyBalanceReportGet(
            accountId, dateRange, page, pageSize, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

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
import com.tencent.ads.anno.*;
import com.tencent.ads.api.WechatFundStatementsDetailedApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.FilteringStruct;
import com.tencent.ads.model.ReportDateRange;
import com.tencent.ads.model.WechatFundStatementsDetailedGetResponse;
import com.tencent.ads.model.WechatFundStatementsDetailedGetResponseData;
import java.util.List;

public class WechatFundStatementsDetailedApiContainer extends ApiContainer {

  @Inject WechatFundStatementsDetailedApi api;

  /**
   * 获取微信资金账户流水信息
   *
   * @param tradeType (required)
   * @param dateRange (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return WechatFundStatementsDetailedGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public WechatFundStatementsDetailedGetResponseData wechatFundStatementsDetailedGet(
      String tradeType,
      ReportDateRange dateRange,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields)
      throws ApiException, TencentAdsResponseException {
    WechatFundStatementsDetailedGetResponse resp =
        api.wechatFundStatementsDetailedGet(
            tradeType, dateRange, filtering, page, pageSize, fields);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

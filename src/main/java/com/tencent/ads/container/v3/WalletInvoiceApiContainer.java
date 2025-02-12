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
import com.tencent.ads.api.v3.WalletInvoiceApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.WalletDateRangeTransaction;
import com.tencent.ads.model.v3.WalletInvoiceGetResponse;
import com.tencent.ads.model.v3.WalletInvoiceGetResponseData;
import java.util.List;

public class WalletInvoiceApiContainer extends ApiContainer {

  @Inject WalletInvoiceApi api;

  /**
   * 共享钱包流水相关信息查询
   *
   * @param accountId (required)
   * @param walletIdList (required)
   * @param dateRange (required)
   * @param fundType (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return WalletInvoiceGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public WalletInvoiceGetResponseData walletInvoiceGet(
      Long accountId,
      String walletIdList,
      WalletDateRangeTransaction dateRange,
      String fundType,
      Long page,
      Long pageSize,
      List<String> fields,
      Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    WalletInvoiceGetResponse resp =
        api.walletInvoiceGet(
            accountId, walletIdList, dateRange, fundType, page, pageSize, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

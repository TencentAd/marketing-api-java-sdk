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
import com.tencent.ads.api.v3.WalletGetBindingAdvertiserApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.WalletGetBindingAdvertiserGetResponse;
import com.tencent.ads.model.v3.WalletGetBindingAdvertiserGetResponseData;
import java.util.List;

public class WalletGetBindingAdvertiserApiContainer extends ApiContainer {

  @Inject WalletGetBindingAdvertiserApi api;

  /**
   * 查询单个共享钱包下的关联账户信息
   *
   * @param accountId (required)
   * @param walletId (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return WalletGetBindingAdvertiserGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public WalletGetBindingAdvertiserGetResponseData walletGetBindingAdvertiserGet(
      Long accountId, Long walletId, List<String> fields, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    WalletGetBindingAdvertiserGetResponse resp =
        api.walletGetBindingAdvertiserGet(accountId, walletId, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

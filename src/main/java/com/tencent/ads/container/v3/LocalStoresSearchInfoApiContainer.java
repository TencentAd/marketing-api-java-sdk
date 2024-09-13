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
import com.tencent.ads.api.v3.LocalStoresSearchInfoApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.LocalStoresSearchInfoGetResponse;
import com.tencent.ads.model.v3.LocalStoresSearchInfoGetResponseData;
import java.util.List;

public class LocalStoresSearchInfoApiContainer extends ApiContainer {

  @Inject LocalStoresSearchInfoApi api;

  /**
   * 搜索门店
   *
   * @param accountId (required)
   * @param keyWord (required)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return LocalStoresSearchInfoGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public LocalStoresSearchInfoGetResponseData localStoresSearchInfoGet(
      Long accountId,
      String keyWord,
      Long page,
      Long pageSize,
      List<String> fields,
      Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    LocalStoresSearchInfoGetResponse resp =
        api.localStoresSearchInfoGet(accountId, keyWord, page, pageSize, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

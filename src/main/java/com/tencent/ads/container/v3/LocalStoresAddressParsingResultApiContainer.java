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
import com.tencent.ads.api.v3.LocalStoresAddressParsingResultApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.LocalStoresAddressParsingResultGetRequest;
import com.tencent.ads.model.v3.LocalStoresAddressParsingResultGetResponse;
import com.tencent.ads.model.v3.LocalStoresAddressParsingResultGetResponseData;

public class LocalStoresAddressParsingResultApiContainer extends ApiContainer {

  @Inject LocalStoresAddressParsingResultApi api;

  /**
   * 解析门店地址
   *
   * @param data (required)
   * @return LocalStoresAddressParsingResultGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public LocalStoresAddressParsingResultGetResponseData localStoresAddressParsingResultGet(
      LocalStoresAddressParsingResultGetRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    LocalStoresAddressParsingResultGetResponse resp =
        api.localStoresAddressParsingResultGet(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

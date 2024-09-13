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
import com.tencent.ads.api.v3.MergeFundTypeSubcustomerTransferApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.MergeFundTypeSubcustomerTransferAddRequest;
import com.tencent.ads.model.v3.MergeFundTypeSubcustomerTransferAddResponse;
import com.tencent.ads.model.v3.MergeFundTypeSubcustomerTransferAddResponseData;

public class MergeFundTypeSubcustomerTransferApiContainer extends ApiContainer {

  @Inject MergeFundTypeSubcustomerTransferApi api;

  /**
   * 资金合并类型同商务管家子客间转账
   *
   * @param data (required)
   * @return MergeFundTypeSubcustomerTransferAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public MergeFundTypeSubcustomerTransferAddResponseData mergeFundTypeSubcustomerTransferAdd(
      MergeFundTypeSubcustomerTransferAddRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    MergeFundTypeSubcustomerTransferAddResponse resp =
        api.mergeFundTypeSubcustomerTransferAdd(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

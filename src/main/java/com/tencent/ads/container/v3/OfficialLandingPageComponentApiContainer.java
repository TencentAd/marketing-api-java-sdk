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
import com.tencent.ads.api.v3.OfficialLandingPageComponentApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.OfficialLandingPageComponentAddRequest;
import com.tencent.ads.model.v3.OfficialLandingPageComponentAddResponse;
import com.tencent.ads.model.v3.OfficialLandingPageComponentAddResponseData;

public class OfficialLandingPageComponentApiContainer extends ApiContainer {

  @Inject OfficialLandingPageComponentApi api;

  /**
   * 官方落地页-基于组件创建
   *
   * @param data (required)
   * @return OfficialLandingPageComponentAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public OfficialLandingPageComponentAddResponseData officialLandingPageComponentAdd(
      OfficialLandingPageComponentAddRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    OfficialLandingPageComponentAddResponse resp =
        api.officialLandingPageComponentAdd(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

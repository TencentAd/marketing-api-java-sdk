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
import com.tencent.ads.anno.*;
import com.tencent.ads.api.v3.UserActionsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.UserActionsAddRequest;
import com.tencent.ads.model.v3.UserActionsAddResponse;

public class UserActionsApiContainer extends ApiContainer {

  @Inject UserActionsApi api;

  /**
   * 上传用户行为数据
   *
   * @param data (required)
   * @return UserActionsAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public UserActionsAddResponse userActionsAdd(UserActionsAddRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    UserActionsAddResponse resp = api.userActionsAdd(data, headerPair);
    handleResponse(gson.toJson(resp));

    return resp;
  }
}
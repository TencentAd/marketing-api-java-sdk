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
import com.tencent.ads.api.v3.UserActionSetsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.UserActionSetsAddRequest;
import com.tencent.ads.model.v3.UserActionSetsAddResponse;
import com.tencent.ads.model.v3.UserActionSetsAddResponseData;
import com.tencent.ads.model.v3.UserActionSetsGetResponse;
import com.tencent.ads.model.v3.UserActionSetsGetResponseData;
import java.util.List;

public class UserActionSetsApiContainer extends ApiContainer {

  @Inject UserActionSetsApi api;

  /**
   * 创建用户行为数据源
   *
   * @param data (required)
   * @return UserActionSetsAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public UserActionSetsAddResponseData userActionSetsAdd(
      UserActionSetsAddRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    UserActionSetsAddResponse resp = api.userActionSetsAdd(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 获取用户行为数据源
   *
   * @param accountId (required)
   * @param userActionSetId (optional)
   * @param type (optional)
   * @param mobileAppId (optional)
   * @param wechatAppId (optional)
   * @param name (optional)
   * @param includePermission (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return UserActionSetsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public UserActionSetsGetResponseData userActionSetsGet(
      Long accountId,
      Long userActionSetId,
      List<String> type,
      Long mobileAppId,
      String wechatAppId,
      String name,
      Boolean includePermission,
      List<String> fields,
      String... headerPair)
      throws ApiException, TencentAdsResponseException {
    UserActionSetsGetResponse resp =
        api.userActionSetsGet(
            accountId,
            userActionSetId,
            type,
            mobileAppId,
            wechatAppId,
            name,
            includePermission,
            fields,
            headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
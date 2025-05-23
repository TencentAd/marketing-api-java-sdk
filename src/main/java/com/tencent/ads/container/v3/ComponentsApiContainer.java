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
import com.tencent.ads.api.v3.ComponentsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.ComponentsAddRequest;
import com.tencent.ads.model.v3.ComponentsAddResponse;
import com.tencent.ads.model.v3.ComponentsAddResponseData;
import com.tencent.ads.model.v3.ComponentsDeleteRequest;
import com.tencent.ads.model.v3.ComponentsDeleteResponse;
import com.tencent.ads.model.v3.ComponentsDeleteResponseData;
import com.tencent.ads.model.v3.ComponentsGetResponse;
import com.tencent.ads.model.v3.ComponentsGetResponseData;
import com.tencent.ads.model.v3.FilteringStruct;
import java.util.List;

public class ComponentsApiContainer extends ApiContainer {

  @Inject ComponentsApi api;

  /**
   * 创建创意组件
   *
   * @param data (required)
   * @return ComponentsAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ComponentsAddResponseData componentsAdd(ComponentsAddRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    ComponentsAddResponse resp = api.componentsAdd(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 删除创意组件
   *
   * @param data (required)
   * @return ComponentsDeleteResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ComponentsDeleteResponseData componentsDelete(
      ComponentsDeleteRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    ComponentsDeleteResponse resp = api.componentsDelete(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 获取创意组件
   *
   * @param accountId (optional)
   * @param organizationId (optional)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param isDeleted (optional)
   * @param fields (optional)
   * @param componentIdFilteringMode (optional)
   * @return ComponentsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ComponentsGetResponseData componentsGet(
      Long accountId,
      Long organizationId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      Boolean isDeleted,
      List<String> fields,
      String componentIdFilteringMode,
      Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    ComponentsGetResponse resp =
        api.componentsGet(
            accountId,
            organizationId,
            filtering,
            page,
            pageSize,
            isDeleted,
            fields,
            componentIdFilteringMode,
            headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

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
import com.tencent.ads.api.v3.ComponentsMetadataApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.ComponentsMetadataGetResponse;
import com.tencent.ads.model.v3.ComponentsMetadataGetResponseData;
import com.tencent.ads.model.v3.GetMetadataFilteringStruct;
import java.util.List;

public class ComponentsMetadataApiContainer extends ApiContainer {

  @Inject ComponentsMetadataApi api;

  /**
   * 查询创意组件元数据
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ComponentsMetadataGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ComponentsMetadataGetResponseData componentsMetadataGet(
      Long accountId,
      List<GetMetadataFilteringStruct> filtering,
      List<String> fields,
      Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    ComponentsMetadataGetResponse resp =
        api.componentsMetadataGet(accountId, filtering, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

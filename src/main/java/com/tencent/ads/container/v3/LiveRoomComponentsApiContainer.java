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
import com.tencent.ads.api.v3.LiveRoomComponentsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.FilteringStruct;
import com.tencent.ads.model.v3.LiveRoomComponentsAddRequest;
import com.tencent.ads.model.v3.LiveRoomComponentsAddResponse;
import com.tencent.ads.model.v3.LiveRoomComponentsAddResponseData;
import com.tencent.ads.model.v3.LiveRoomComponentsDeleteRequest;
import com.tencent.ads.model.v3.LiveRoomComponentsDeleteResponse;
import com.tencent.ads.model.v3.LiveRoomComponentsDeleteResponseData;
import com.tencent.ads.model.v3.LiveRoomComponentsGetResponse;
import com.tencent.ads.model.v3.LiveRoomComponentsGetResponseData;
import com.tencent.ads.model.v3.LiveRoomComponentsUpdateRequest;
import com.tencent.ads.model.v3.LiveRoomComponentsUpdateResponse;
import com.tencent.ads.model.v3.LiveRoomComponentsUpdateResponseData;
import java.util.List;

public class LiveRoomComponentsApiContainer extends ApiContainer {

  @Inject LiveRoomComponentsApi api;

  /**
   * 创建直播间组件
   *
   * @param data (required)
   * @return LiveRoomComponentsAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public LiveRoomComponentsAddResponseData liveRoomComponentsAdd(
      LiveRoomComponentsAddRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    LiveRoomComponentsAddResponse resp = api.liveRoomComponentsAdd(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 删除直播间组件
   *
   * @param data (required)
   * @return LiveRoomComponentsDeleteResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public LiveRoomComponentsDeleteResponseData liveRoomComponentsDelete(
      LiveRoomComponentsDeleteRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    LiveRoomComponentsDeleteResponse resp = api.liveRoomComponentsDelete(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 查询直播间组件信息
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return LiveRoomComponentsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public LiveRoomComponentsGetResponseData liveRoomComponentsGet(
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields,
      String... headerPair)
      throws ApiException, TencentAdsResponseException {
    LiveRoomComponentsGetResponse resp =
        api.liveRoomComponentsGet(accountId, filtering, page, pageSize, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 更新直播间组件
   *
   * @param data (required)
   * @return LiveRoomComponentsUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public LiveRoomComponentsUpdateResponseData liveRoomComponentsUpdate(
      LiveRoomComponentsUpdateRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    LiveRoomComponentsUpdateResponse resp = api.liveRoomComponentsUpdate(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

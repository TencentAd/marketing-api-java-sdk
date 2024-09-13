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
import com.tencent.ads.api.v3.LiveRoomComponentStatusApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.LiveRoomComponentStatusUpdateRequest;
import com.tencent.ads.model.v3.LiveRoomComponentStatusUpdateResponse;
import com.tencent.ads.model.v3.LiveRoomComponentStatusUpdateResponseData;

public class LiveRoomComponentStatusApiContainer extends ApiContainer {

  @Inject LiveRoomComponentStatusApi api;

  /**
   * 更新直播间组件状态
   *
   * @param data (required)
   * @return LiveRoomComponentStatusUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public LiveRoomComponentStatusUpdateResponseData liveRoomComponentStatusUpdate(
      LiveRoomComponentStatusUpdateRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    LiveRoomComponentStatusUpdateResponse resp =
        api.liveRoomComponentStatusUpdate(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

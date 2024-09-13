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
import com.tencent.ads.api.v3.VideoChannelFansDataApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.VideoChannelFansDataGetRequest;
import com.tencent.ads.model.v3.VideoChannelFansDataGetResponse;
import com.tencent.ads.model.v3.VideoChannelFansDataGetResponseData;

public class VideoChannelFansDataApiContainer extends ApiContainer {

  @Inject VideoChannelFansDataApi api;

  /**
   * 获取粉丝数据
   *
   * @param data (required)
   * @return VideoChannelFansDataGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public VideoChannelFansDataGetResponseData videoChannelFansDataGet(
      VideoChannelFansDataGetRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    VideoChannelFansDataGetResponse resp = api.videoChannelFansDataGet(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

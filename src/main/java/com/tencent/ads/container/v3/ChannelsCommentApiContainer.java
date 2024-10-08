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
import com.tencent.ads.api.v3.ChannelsCommentApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.ChannelsCommentAddRequest;
import com.tencent.ads.model.v3.ChannelsCommentAddResponse;
import com.tencent.ads.model.v3.ChannelsCommentDeleteRequest;
import com.tencent.ads.model.v3.ChannelsCommentDeleteResponse;

public class ChannelsCommentApiContainer extends ApiContainer {

  @Inject ChannelsCommentApi api;

  /**
   * 回复视频号评论
   *
   * @param data (required)
   * @return ChannelsCommentAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ChannelsCommentAddResponse channelsCommentAdd(
      ChannelsCommentAddRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    ChannelsCommentAddResponse resp = api.channelsCommentAdd(data, headerPair);
    handleResponse(gson.toJson(resp));

    return resp;
  }

  /**
   * 删除视频号评论
   *
   * @param data (required)
   * @return ChannelsCommentDeleteResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ChannelsCommentDeleteResponse channelsCommentDelete(
      ChannelsCommentDeleteRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    ChannelsCommentDeleteResponse resp = api.channelsCommentDelete(data, headerPair);
    handleResponse(gson.toJson(resp));

    return resp;
  }
}

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
import com.tencent.ads.api.v3.ChannelsLivenoticeinfoApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.ChannelsLivenoticeinfoGetResponse;
import com.tencent.ads.model.v3.ChannelsLivenoticeinfoGetResponseData;
import java.util.List;

public class ChannelsLivenoticeinfoApiContainer extends ApiContainer {

  @Inject ChannelsLivenoticeinfoApi api;

  /**
   * 获取视频号当前的预约直播信息
   *
   * @param accountId (required)
   * @param finderUsername (optional)
   * @param nickname (optional)
   * @param wechatChannelsAccountId (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ChannelsLivenoticeinfoGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ChannelsLivenoticeinfoGetResponseData channelsLivenoticeinfoGet(
      Long accountId,
      String finderUsername,
      String nickname,
      String wechatChannelsAccountId,
      List<String> fields,
      Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    ChannelsLivenoticeinfoGetResponse resp =
        api.channelsLivenoticeinfoGet(
            accountId, finderUsername, nickname, wechatChannelsAccountId, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

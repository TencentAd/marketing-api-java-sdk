/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 1.3
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.tencent.ads.container;

import com.google.inject.Inject;
import com.tencent.ads.ApiContainer;
import com.tencent.ads.ApiException;
import com.tencent.ads.Pair;
import com.tencent.ads.anno.*;
import com.tencent.ads.api.VideoChannelDealerDataApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.VideoChannelDealerDataGetRequest;
import com.tencent.ads.model.VideoChannelDealerDataGetResponse;
import com.tencent.ads.model.VideoChannelDealerDataGetResponseData;

public class VideoChannelDealerDataApiContainer extends ApiContainer {

  @Inject VideoChannelDealerDataApi api;

  /**
   * 获取经销商聚合数据
   *
   * @param data (required)
   * @return VideoChannelDealerDataGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public VideoChannelDealerDataGetResponseData videoChannelDealerDataGet(
      VideoChannelDealerDataGetRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    VideoChannelDealerDataGetResponse resp = api.videoChannelDealerDataGet(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

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
import com.tencent.ads.api.PlayablePagesApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.FilteringStruct;
import com.tencent.ads.model.PlayablePagesAddResponse;
import com.tencent.ads.model.PlayablePagesAddResponseData;
import com.tencent.ads.model.PlayablePagesGetResponse;
import com.tencent.ads.model.PlayablePagesGetResponseData;
import java.io.File;
import java.util.List;

public class PlayablePagesApiContainer extends ApiContainer {

  @Inject PlayablePagesApi api;

  /**
   * 添加互动推广页（待废弃,详见公告）
   *
   * @param accountId (required)
   * @param playablePageName (required)
   * @param materialFile (required)
   * @return PlayablePagesAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public PlayablePagesAddResponseData playablePagesAdd(
      Long accountId, String playablePageName, File materialFile, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    PlayablePagesAddResponse resp =
        api.playablePagesAdd(accountId, playablePageName, materialFile, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 获取互动推广页
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return PlayablePagesGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public PlayablePagesGetResponseData playablePagesGet(
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields,
      Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    PlayablePagesGetResponse resp =
        api.playablePagesGet(accountId, filtering, page, pageSize, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

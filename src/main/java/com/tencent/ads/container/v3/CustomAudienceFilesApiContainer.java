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
import com.tencent.ads.api.v3.CustomAudienceFilesApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.CustomAudienceFilesAddResponse;
import com.tencent.ads.model.v3.CustomAudienceFilesAddResponseData;
import com.tencent.ads.model.v3.CustomAudienceFilesGetResponse;
import com.tencent.ads.model.v3.CustomAudienceFilesGetResponseData;
import java.io.File;
import java.util.List;

public class CustomAudienceFilesApiContainer extends ApiContainer {

  @Inject CustomAudienceFilesApi api;

  /**
   * 上传客户人群数据文件
   *
   * @param accountId (required)
   * @param audienceId (required)
   * @param userIdType (required)
   * @param file (required)
   * @param operationType (optional)
   * @param openAppId (optional)
   * @return CustomAudienceFilesAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public CustomAudienceFilesAddResponseData customAudienceFilesAdd(
      Long accountId,
      Long audienceId,
      String userIdType,
      File file,
      String operationType,
      String openAppId,
      Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    CustomAudienceFilesAddResponse resp =
        api.customAudienceFilesAdd(
            accountId, audienceId, userIdType, file, operationType, openAppId, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 获取客户人群数据文件
   *
   * @param accountId (required)
   * @param audienceId (optional)
   * @param customAudienceFileId (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return CustomAudienceFilesGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public CustomAudienceFilesGetResponseData customAudienceFilesGet(
      Long accountId,
      Long audienceId,
      Long customAudienceFileId,
      Long page,
      Long pageSize,
      List<String> fields,
      Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    CustomAudienceFilesGetResponse resp =
        api.customAudienceFilesGet(
            accountId, audienceId, customAudienceFileId, page, pageSize, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

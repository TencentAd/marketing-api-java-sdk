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
import com.tencent.ads.api.CustomAudiencesApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.CustomAudiencesAddRequest;
import com.tencent.ads.model.CustomAudiencesAddResponse;
import com.tencent.ads.model.CustomAudiencesAddResponseData;
import com.tencent.ads.model.CustomAudiencesDeleteRequest;
import com.tencent.ads.model.CustomAudiencesDeleteResponse;
import com.tencent.ads.model.CustomAudiencesGetResponse;
import com.tencent.ads.model.CustomAudiencesGetResponseData;
import com.tencent.ads.model.CustomAudiencesUpdateRequest;
import com.tencent.ads.model.CustomAudiencesUpdateResponse;
import java.util.List;

public class CustomAudiencesApiContainer extends ApiContainer {

  @Inject CustomAudiencesApi api;

  /**
   * 创建客户人群
   *
   * @param data (required)
   * @return CustomAudiencesAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public CustomAudiencesAddResponseData customAudiencesAdd(
      CustomAudiencesAddRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    CustomAudiencesAddResponse resp = api.customAudiencesAdd(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 删除客户人群
   *
   * @param data (required)
   * @return CustomAudiencesDeleteResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public CustomAudiencesDeleteResponse customAudiencesDelete(
      CustomAudiencesDeleteRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    CustomAudiencesDeleteResponse resp = api.customAudiencesDelete(data, headerPair);
    handleResponse(gson.toJson(resp));

    return resp;
  }

  /**
   * 获取客户人群
   *
   * @param accountId (required)
   * @param audienceId (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param platform 数据应用，不填写默认为DMP (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return CustomAudiencesGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public CustomAudiencesGetResponseData customAudiencesGet(
      Long accountId,
      Long audienceId,
      Long page,
      Long pageSize,
      String platform,
      List<String> fields,
      Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    CustomAudiencesGetResponse resp =
        api.customAudiencesGet(accountId, audienceId, page, pageSize, platform, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 更新客户人群
   *
   * @param data (required)
   * @return CustomAudiencesUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public CustomAudiencesUpdateResponse customAudiencesUpdate(
      CustomAudiencesUpdateRequest data, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    CustomAudiencesUpdateResponse resp = api.customAudiencesUpdate(data, headerPair);
    handleResponse(gson.toJson(resp));

    return resp;
  }
}

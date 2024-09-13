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
import com.tencent.ads.api.v3.KeywordRecommendApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.KeywordRecommendGetResponse;
import com.tencent.ads.model.v3.KeywordRecommendGetResponseData;
import com.tencent.ads.model.v3.OrderByStructInfo;
import java.util.List;

public class KeywordRecommendApiContainer extends ApiContainer {

  @Inject KeywordRecommendApi api;

  /**
   * 获取关键词推荐结果
   *
   * @param siteSets (required)
   * @param recommendCategory (required)
   * @param accountId (required)
   * @param systemIndustryId (required)
   * @param queryWord (optional)
   * @param businessPointId (optional)
   * @param adgroupId (optional)
   * @param campaignId (optional)
   * @param includeWord (optional)
   * @param excludeWord (optional)
   * @param filterAdWord (optional)
   * @param filterAccountWord (optional)
   * @param recommendReasons (optional)
   * @param province (optional)
   * @param city (optional)
   * @param orderBy (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return KeywordRecommendGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public KeywordRecommendGetResponseData keywordRecommendGet(
      List<String> siteSets,
      String recommendCategory,
      Long accountId,
      Long systemIndustryId,
      List<String> queryWord,
      String businessPointId,
      Long adgroupId,
      Long campaignId,
      List<String> includeWord,
      List<String> excludeWord,
      Boolean filterAdWord,
      Boolean filterAccountWord,
      List<String> recommendReasons,
      List<Long> province,
      List<Long> city,
      List<OrderByStructInfo> orderBy,
      List<String> fields,
      Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    KeywordRecommendGetResponse resp =
        api.keywordRecommendGet(
            siteSets,
            recommendCategory,
            accountId,
            systemIndustryId,
            queryWord,
            businessPointId,
            adgroupId,
            campaignId,
            includeWord,
            excludeWord,
            filterAdWord,
            filterAccountWord,
            recommendReasons,
            province,
            city,
            orderBy,
            fields,
            headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

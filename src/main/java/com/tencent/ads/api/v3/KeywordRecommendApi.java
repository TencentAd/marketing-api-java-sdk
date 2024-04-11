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

package com.tencent.ads.api.v3;

import com.google.gson.reflect.TypeToken;
import com.tencent.ads.ApiCallback;
import com.tencent.ads.ApiClient;
import com.tencent.ads.ApiException;
import com.tencent.ads.ApiResponse;
import com.tencent.ads.Configuration;
import com.tencent.ads.Pair;
import com.tencent.ads.ProgressRequestBody;
import com.tencent.ads.ProgressResponseBody;
import com.tencent.ads.model.v3.KeywordRecommendGetResponse;
import com.tencent.ads.model.v3.OrderByStructInfo;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeywordRecommendApi {
  private ApiClient apiClient;

  public KeywordRecommendApi() {
    this(Configuration.getV3DefaultApiClient());
  }

  public KeywordRecommendApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for keywordRecommendGet
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
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call keywordRecommendGetCall(
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
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/keyword_recommend/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (siteSets != null)
      localVarCollectionQueryParams.addAll(
          apiClient.parameterToPairs("multi", "site_sets", siteSets));
    if (recommendCategory != null)
      localVarQueryParams.addAll(
          apiClient.parameterToPair("recommend_category", recommendCategory));
    if (accountId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("account_id", accountId));
    if (systemIndustryId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("system_industry_id", systemIndustryId));
    if (queryWord != null)
      localVarCollectionQueryParams.addAll(
          apiClient.parameterToPairs("multi", "query_word", queryWord));
    if (businessPointId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("business_point_id", businessPointId));
    if (adgroupId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("adgroup_id", adgroupId));
    if (campaignId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("campaign_id", campaignId));
    if (includeWord != null)
      localVarCollectionQueryParams.addAll(
          apiClient.parameterToPairs("multi", "include_word", includeWord));
    if (excludeWord != null)
      localVarCollectionQueryParams.addAll(
          apiClient.parameterToPairs("multi", "exclude_word", excludeWord));
    if (filterAdWord != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("filter_ad_word", filterAdWord));
    if (filterAccountWord != null)
      localVarQueryParams.addAll(
          apiClient.parameterToPair("filter_account_word", filterAccountWord));
    if (recommendReasons != null)
      localVarCollectionQueryParams.addAll(
          apiClient.parameterToPairs("multi", "recommend_reasons", recommendReasons));
    if (province != null)
      localVarCollectionQueryParams.addAll(
          apiClient.parameterToPairs("multi", "province", province));
    if (city != null)
      localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "city", city));
    if (orderBy != null)
      localVarCollectionQueryParams.addAll(
          apiClient.parameterToPairs("multi", "order_by", orderBy));
    if (fields != null)
      localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "fields", fields));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {"text/plain"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    if (headerPair != null && headerPair.length > 0) {
      if (headerPair.length % 2 != 0) {
        throw new UnsupportedOperationException("Parameter headerPair must be paired");
      }
      for (int i = 0; i < headerPair.length / 2; i++) {
        localVarHeaderParams.put(headerPair[i], headerPair[i * 2 + 1]);
      }
    }

    if (progressListener != null) {
      apiClient
          .getHttpClient()
          .networkInterceptors()
          .add(
              new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(
                    com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                  com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                  return originalResponse
                      .newBuilder()
                      .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                      .build();
                }
              });
    }

    String[] localVarAuthNames = new String[] {"accessToken", "nonce", "timestamp"};
    return apiClient.buildCall(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAuthNames,
        progressRequestListener);
  }

  @SuppressWarnings("rawtypes")
  private com.squareup.okhttp.Call keywordRecommendGetValidateBeforeCall(
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
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    // verify the required parameter 'siteSets' is set
    if (siteSets == null) {
      throw new ApiException(
          "Missing the required parameter 'siteSets' when calling keywordRecommendGet(Async)");
    }

    // verify the required parameter 'recommendCategory' is set
    if (recommendCategory == null) {
      throw new ApiException(
          "Missing the required parameter 'recommendCategory' when calling keywordRecommendGet(Async)");
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling keywordRecommendGet(Async)");
    }

    // verify the required parameter 'systemIndustryId' is set
    if (systemIndustryId == null) {
      throw new ApiException(
          "Missing the required parameter 'systemIndustryId' when calling keywordRecommendGet(Async)");
    }

    com.squareup.okhttp.Call call =
        keywordRecommendGetCall(
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
            progressListener,
            progressRequestListener,
            headerPair);
    return call;
  }

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
  public KeywordRecommendGetResponse keywordRecommendGet(
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
      String... headerPair)
      throws ApiException {
    ApiResponse<KeywordRecommendGetResponse> resp =
        keywordRecommendGetWithHttpInfo(
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
    return resp.getData();
  }

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
   * @return ApiResponse&lt;KeywordRecommendGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<KeywordRecommendGetResponse> keywordRecommendGetWithHttpInfo(
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
      String... headerPair)
      throws ApiException {
    com.squareup.okhttp.Call call =
        keywordRecommendGetValidateBeforeCall(
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
            null,
            null,
            headerPair);
    Type localVarReturnType = new TypeToken<KeywordRecommendGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 获取关键词推荐结果 (asynchronously)
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
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call keywordRecommendGetAsync(
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
      final ApiCallback<KeywordRecommendGetResponse> callback,
      String... headerPair)
      throws ApiException {

    ProgressResponseBody.ProgressListener progressListener = null;
    ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

    if (callback != null) {
      progressListener =
          new ProgressResponseBody.ProgressListener() {
            @Override
            public void update(long bytesRead, long contentLength, boolean done) {
              callback.onDownloadProgress(bytesRead, contentLength, done);
            }
          };

      progressRequestListener =
          new ProgressRequestBody.ProgressRequestListener() {
            @Override
            public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
              callback.onUploadProgress(bytesWritten, contentLength, done);
            }
          };
    }

    com.squareup.okhttp.Call call =
        keywordRecommendGetValidateBeforeCall(
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
            progressListener,
            progressRequestListener,
            headerPair);
    Type localVarReturnType = new TypeToken<KeywordRecommendGetResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}
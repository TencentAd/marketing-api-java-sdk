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
import com.tencent.ads.model.v3.MarketingCarrierDetail;
import com.tencent.ads.model.v3.OptimizationGoalPermissionsGetResponse;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OptimizationGoalPermissionsApi {
  private ApiClient apiClient;

  public OptimizationGoalPermissionsApi() {
    this(Configuration.getV3DefaultApiClient());
  }

  public OptimizationGoalPermissionsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for optimizationGoalPermissionsGet
   *
   * @param accountId (required)
   * @param siteSet (required)
   * @param marketingGoal (required)
   * @param marketingSubGoal (required)
   * @param marketingCarrierType (required)
   * @param marketingTargetType (required)
   * @param bidMode (optional)
   * @param marketingCarrierDetail (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call optimizationGoalPermissionsGetCall(
      Long accountId,
      List<String> siteSet,
      String marketingGoal,
      String marketingSubGoal,
      String marketingCarrierType,
      String marketingTargetType,
      String bidMode,
      MarketingCarrierDetail marketingCarrierDetail,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/optimization_goal_permissions/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (accountId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("account_id", accountId));
    if (siteSet != null)
      localVarCollectionQueryParams.addAll(
          apiClient.parameterToPairs("multi", "site_set", siteSet));
    if (bidMode != null) localVarQueryParams.addAll(apiClient.parameterToPair("bid_mode", bidMode));
    if (marketingGoal != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("marketing_goal", marketingGoal));
    if (marketingSubGoal != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("marketing_sub_goal", marketingSubGoal));
    if (marketingCarrierType != null)
      localVarQueryParams.addAll(
          apiClient.parameterToPair("marketing_carrier_type", marketingCarrierType));
    if (marketingTargetType != null)
      localVarQueryParams.addAll(
          apiClient.parameterToPair("marketing_target_type", marketingTargetType));
    if (marketingCarrierDetail != null)
      localVarQueryParams.addAll(
          apiClient.parameterToPair("marketing_carrier_detail", marketingCarrierDetail));
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
      for (int i = 0; i < headerPair.length; i++) {
        localVarHeaderParams.put(headerPair[i].getName(), headerPair[i].getValue());
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
  private com.squareup.okhttp.Call optimizationGoalPermissionsGetValidateBeforeCall(
      Long accountId,
      List<String> siteSet,
      String marketingGoal,
      String marketingSubGoal,
      String marketingCarrierType,
      String marketingTargetType,
      String bidMode,
      MarketingCarrierDetail marketingCarrierDetail,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling optimizationGoalPermissionsGet(Async)");
    }

    // verify the required parameter 'siteSet' is set
    if (siteSet == null) {
      throw new ApiException(
          "Missing the required parameter 'siteSet' when calling optimizationGoalPermissionsGet(Async)");
    }

    // verify the required parameter 'marketingGoal' is set
    if (marketingGoal == null) {
      throw new ApiException(
          "Missing the required parameter 'marketingGoal' when calling optimizationGoalPermissionsGet(Async)");
    }

    // verify the required parameter 'marketingSubGoal' is set
    if (marketingSubGoal == null) {
      throw new ApiException(
          "Missing the required parameter 'marketingSubGoal' when calling optimizationGoalPermissionsGet(Async)");
    }

    // verify the required parameter 'marketingCarrierType' is set
    if (marketingCarrierType == null) {
      throw new ApiException(
          "Missing the required parameter 'marketingCarrierType' when calling optimizationGoalPermissionsGet(Async)");
    }

    // verify the required parameter 'marketingTargetType' is set
    if (marketingTargetType == null) {
      throw new ApiException(
          "Missing the required parameter 'marketingTargetType' when calling optimizationGoalPermissionsGet(Async)");
    }

    com.squareup.okhttp.Call call =
        optimizationGoalPermissionsGetCall(
            accountId,
            siteSet,
            marketingGoal,
            marketingSubGoal,
            marketingCarrierType,
            marketingTargetType,
            bidMode,
            marketingCarrierDetail,
            fields,
            progressListener,
            progressRequestListener,
            headerPair);
    return call;
  }

  /**
   * 查询优化目标权限
   *
   * @param accountId (required)
   * @param siteSet (required)
   * @param marketingGoal (required)
   * @param marketingSubGoal (required)
   * @param marketingCarrierType (required)
   * @param marketingTargetType (required)
   * @param bidMode (optional)
   * @param marketingCarrierDetail (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return OptimizationGoalPermissionsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public OptimizationGoalPermissionsGetResponse optimizationGoalPermissionsGet(
      Long accountId,
      List<String> siteSet,
      String marketingGoal,
      String marketingSubGoal,
      String marketingCarrierType,
      String marketingTargetType,
      String bidMode,
      MarketingCarrierDetail marketingCarrierDetail,
      List<String> fields,
      Pair... headerPair)
      throws ApiException {
    ApiResponse<OptimizationGoalPermissionsGetResponse> resp =
        optimizationGoalPermissionsGetWithHttpInfo(
            accountId,
            siteSet,
            marketingGoal,
            marketingSubGoal,
            marketingCarrierType,
            marketingTargetType,
            bidMode,
            marketingCarrierDetail,
            fields,
            headerPair);
    return resp.getData();
  }

  /**
   * 查询优化目标权限
   *
   * @param accountId (required)
   * @param siteSet (required)
   * @param marketingGoal (required)
   * @param marketingSubGoal (required)
   * @param marketingCarrierType (required)
   * @param marketingTargetType (required)
   * @param bidMode (optional)
   * @param marketingCarrierDetail (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;OptimizationGoalPermissionsGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<OptimizationGoalPermissionsGetResponse>
      optimizationGoalPermissionsGetWithHttpInfo(
          Long accountId,
          List<String> siteSet,
          String marketingGoal,
          String marketingSubGoal,
          String marketingCarrierType,
          String marketingTargetType,
          String bidMode,
          MarketingCarrierDetail marketingCarrierDetail,
          List<String> fields,
          Pair... headerPair)
          throws ApiException {
    com.squareup.okhttp.Call call =
        optimizationGoalPermissionsGetValidateBeforeCall(
            accountId,
            siteSet,
            marketingGoal,
            marketingSubGoal,
            marketingCarrierType,
            marketingTargetType,
            bidMode,
            marketingCarrierDetail,
            fields,
            null,
            null,
            headerPair);
    Type localVarReturnType = new TypeToken<OptimizationGoalPermissionsGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 查询优化目标权限 (asynchronously)
   *
   * @param accountId (required)
   * @param siteSet (required)
   * @param marketingGoal (required)
   * @param marketingSubGoal (required)
   * @param marketingCarrierType (required)
   * @param marketingTargetType (required)
   * @param bidMode (optional)
   * @param marketingCarrierDetail (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call optimizationGoalPermissionsGetAsync(
      Long accountId,
      List<String> siteSet,
      String marketingGoal,
      String marketingSubGoal,
      String marketingCarrierType,
      String marketingTargetType,
      String bidMode,
      MarketingCarrierDetail marketingCarrierDetail,
      List<String> fields,
      final ApiCallback<OptimizationGoalPermissionsGetResponse> callback,
      Pair... headerPair)
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
        optimizationGoalPermissionsGetValidateBeforeCall(
            accountId,
            siteSet,
            marketingGoal,
            marketingSubGoal,
            marketingCarrierType,
            marketingTargetType,
            bidMode,
            marketingCarrierDetail,
            fields,
            progressListener,
            progressRequestListener,
            headerPair);
    Type localVarReturnType = new TypeToken<OptimizationGoalPermissionsGetResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}

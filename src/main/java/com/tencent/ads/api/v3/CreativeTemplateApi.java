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
import com.tencent.ads.model.v3.CreativeTemplateGetResponse;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreativeTemplateApi {
  private ApiClient apiClient;

  public CreativeTemplateApi() {
    this(Configuration.getV3DefaultApiClient());
  }

  public CreativeTemplateApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for creativeTemplateGet
   *
   * @param accountId (required)
   * @param marketingGoal (required)
   * @param marketingTargetType (required)
   * @param marketingCarrierType (required)
   * @param deliveryMode (required)
   * @param marketingSubGoal (optional)
   * @param automaticSiteEnabled (optional)
   * @param siteSet (optional)
   * @param dynamicCreativeType (optional)
   * @param creativeTemplateId (optional)
   * @param conversionLinkAssetId (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call creativeTemplateGetCall(
      Long accountId,
      String marketingGoal,
      String marketingTargetType,
      String marketingCarrierType,
      String deliveryMode,
      String marketingSubGoal,
      Boolean automaticSiteEnabled,
      List<String> siteSet,
      String dynamicCreativeType,
      Long creativeTemplateId,
      Long conversionLinkAssetId,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/creative_template/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (accountId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("account_id", accountId));
    if (marketingGoal != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("marketing_goal", marketingGoal));
    if (marketingSubGoal != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("marketing_sub_goal", marketingSubGoal));
    if (marketingTargetType != null)
      localVarQueryParams.addAll(
          apiClient.parameterToPair("marketing_target_type", marketingTargetType));
    if (marketingCarrierType != null)
      localVarQueryParams.addAll(
          apiClient.parameterToPair("marketing_carrier_type", marketingCarrierType));
    if (automaticSiteEnabled != null)
      localVarQueryParams.addAll(
          apiClient.parameterToPair("automatic_site_enabled", automaticSiteEnabled));
    if (siteSet != null)
      localVarCollectionQueryParams.addAll(
          apiClient.parameterToPairs("multi", "site_set", siteSet));
    if (deliveryMode != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("delivery_mode", deliveryMode));
    if (dynamicCreativeType != null)
      localVarQueryParams.addAll(
          apiClient.parameterToPair("dynamic_creative_type", dynamicCreativeType));
    if (creativeTemplateId != null)
      localVarQueryParams.addAll(
          apiClient.parameterToPair("creative_template_id", creativeTemplateId));
    if (conversionLinkAssetId != null)
      localVarQueryParams.addAll(
          apiClient.parameterToPair("conversion_link_asset_id", conversionLinkAssetId));
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
  private com.squareup.okhttp.Call creativeTemplateGetValidateBeforeCall(
      Long accountId,
      String marketingGoal,
      String marketingTargetType,
      String marketingCarrierType,
      String deliveryMode,
      String marketingSubGoal,
      Boolean automaticSiteEnabled,
      List<String> siteSet,
      String dynamicCreativeType,
      Long creativeTemplateId,
      Long conversionLinkAssetId,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling creativeTemplateGet(Async)");
    }

    // verify the required parameter 'marketingGoal' is set
    if (marketingGoal == null) {
      throw new ApiException(
          "Missing the required parameter 'marketingGoal' when calling creativeTemplateGet(Async)");
    }

    // verify the required parameter 'marketingTargetType' is set
    if (marketingTargetType == null) {
      throw new ApiException(
          "Missing the required parameter 'marketingTargetType' when calling creativeTemplateGet(Async)");
    }

    // verify the required parameter 'marketingCarrierType' is set
    if (marketingCarrierType == null) {
      throw new ApiException(
          "Missing the required parameter 'marketingCarrierType' when calling creativeTemplateGet(Async)");
    }

    // verify the required parameter 'deliveryMode' is set
    if (deliveryMode == null) {
      throw new ApiException(
          "Missing the required parameter 'deliveryMode' when calling creativeTemplateGet(Async)");
    }

    com.squareup.okhttp.Call call =
        creativeTemplateGetCall(
            accountId,
            marketingGoal,
            marketingTargetType,
            marketingCarrierType,
            deliveryMode,
            marketingSubGoal,
            automaticSiteEnabled,
            siteSet,
            dynamicCreativeType,
            creativeTemplateId,
            conversionLinkAssetId,
            fields,
            progressListener,
            progressRequestListener,
            headerPair);
    return call;
  }

  /**
   * 获取创意规格详情
   *
   * @param accountId (required)
   * @param marketingGoal (required)
   * @param marketingTargetType (required)
   * @param marketingCarrierType (required)
   * @param deliveryMode (required)
   * @param marketingSubGoal (optional)
   * @param automaticSiteEnabled (optional)
   * @param siteSet (optional)
   * @param dynamicCreativeType (optional)
   * @param creativeTemplateId (optional)
   * @param conversionLinkAssetId (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return CreativeTemplateGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public CreativeTemplateGetResponse creativeTemplateGet(
      Long accountId,
      String marketingGoal,
      String marketingTargetType,
      String marketingCarrierType,
      String deliveryMode,
      String marketingSubGoal,
      Boolean automaticSiteEnabled,
      List<String> siteSet,
      String dynamicCreativeType,
      Long creativeTemplateId,
      Long conversionLinkAssetId,
      List<String> fields,
      String... headerPair)
      throws ApiException {
    ApiResponse<CreativeTemplateGetResponse> resp =
        creativeTemplateGetWithHttpInfo(
            accountId,
            marketingGoal,
            marketingTargetType,
            marketingCarrierType,
            deliveryMode,
            marketingSubGoal,
            automaticSiteEnabled,
            siteSet,
            dynamicCreativeType,
            creativeTemplateId,
            conversionLinkAssetId,
            fields,
            headerPair);
    return resp.getData();
  }

  /**
   * 获取创意规格详情
   *
   * @param accountId (required)
   * @param marketingGoal (required)
   * @param marketingTargetType (required)
   * @param marketingCarrierType (required)
   * @param deliveryMode (required)
   * @param marketingSubGoal (optional)
   * @param automaticSiteEnabled (optional)
   * @param siteSet (optional)
   * @param dynamicCreativeType (optional)
   * @param creativeTemplateId (optional)
   * @param conversionLinkAssetId (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;CreativeTemplateGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<CreativeTemplateGetResponse> creativeTemplateGetWithHttpInfo(
      Long accountId,
      String marketingGoal,
      String marketingTargetType,
      String marketingCarrierType,
      String deliveryMode,
      String marketingSubGoal,
      Boolean automaticSiteEnabled,
      List<String> siteSet,
      String dynamicCreativeType,
      Long creativeTemplateId,
      Long conversionLinkAssetId,
      List<String> fields,
      String... headerPair)
      throws ApiException {
    com.squareup.okhttp.Call call =
        creativeTemplateGetValidateBeforeCall(
            accountId,
            marketingGoal,
            marketingTargetType,
            marketingCarrierType,
            deliveryMode,
            marketingSubGoal,
            automaticSiteEnabled,
            siteSet,
            dynamicCreativeType,
            creativeTemplateId,
            conversionLinkAssetId,
            fields,
            null,
            null,
            headerPair);
    Type localVarReturnType = new TypeToken<CreativeTemplateGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 获取创意规格详情 (asynchronously)
   *
   * @param accountId (required)
   * @param marketingGoal (required)
   * @param marketingTargetType (required)
   * @param marketingCarrierType (required)
   * @param deliveryMode (required)
   * @param marketingSubGoal (optional)
   * @param automaticSiteEnabled (optional)
   * @param siteSet (optional)
   * @param dynamicCreativeType (optional)
   * @param creativeTemplateId (optional)
   * @param conversionLinkAssetId (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call creativeTemplateGetAsync(
      Long accountId,
      String marketingGoal,
      String marketingTargetType,
      String marketingCarrierType,
      String deliveryMode,
      String marketingSubGoal,
      Boolean automaticSiteEnabled,
      List<String> siteSet,
      String dynamicCreativeType,
      Long creativeTemplateId,
      Long conversionLinkAssetId,
      List<String> fields,
      final ApiCallback<CreativeTemplateGetResponse> callback,
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
        creativeTemplateGetValidateBeforeCall(
            accountId,
            marketingGoal,
            marketingTargetType,
            marketingCarrierType,
            deliveryMode,
            marketingSubGoal,
            automaticSiteEnabled,
            siteSet,
            dynamicCreativeType,
            creativeTemplateId,
            conversionLinkAssetId,
            fields,
            progressListener,
            progressRequestListener,
            headerPair);
    Type localVarReturnType = new TypeToken<CreativeTemplateGetResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}

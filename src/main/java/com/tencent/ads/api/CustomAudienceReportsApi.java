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

package com.tencent.ads.api;

import com.google.gson.reflect.TypeToken;
import com.tencent.ads.ApiCallback;
import com.tencent.ads.ApiClient;
import com.tencent.ads.ApiException;
import com.tencent.ads.ApiResponse;
import com.tencent.ads.Configuration;
import com.tencent.ads.Pair;
import com.tencent.ads.ProgressRequestBody;
import com.tencent.ads.ProgressResponseBody;
import com.tencent.ads.model.CustomAudienceReportsGetResponse;
import com.tencent.ads.model.DateRange;
import com.tencent.ads.model.FilteringStruct;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomAudienceReportsApi {
  private ApiClient apiClient;

  public CustomAudienceReportsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CustomAudienceReportsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for customAudienceReportsGet
   *
   * @param accountId (required)
   * @param filtering (required)
   * @param dateRange (required)
   * @param groupBy (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call customAudienceReportsGetCall(
      Long accountId,
      List<FilteringStruct> filtering,
      DateRange dateRange,
      List<String> groupBy,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/custom_audience_reports/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (accountId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("account_id", accountId));
    if (filtering != null)
      localVarCollectionQueryParams.addAll(
          apiClient.parameterToPairs("multi", "filtering", filtering));
    if (dateRange != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("date_range", dateRange));
    if (groupBy != null)
      localVarCollectionQueryParams.addAll(
          apiClient.parameterToPairs("multi", "group_by", groupBy));
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
  private com.squareup.okhttp.Call customAudienceReportsGetValidateBeforeCall(
      Long accountId,
      List<FilteringStruct> filtering,
      DateRange dateRange,
      List<String> groupBy,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling customAudienceReportsGet(Async)");
    }

    // verify the required parameter 'filtering' is set
    if (filtering == null) {
      throw new ApiException(
          "Missing the required parameter 'filtering' when calling customAudienceReportsGet(Async)");
    }

    // verify the required parameter 'dateRange' is set
    if (dateRange == null) {
      throw new ApiException(
          "Missing the required parameter 'dateRange' when calling customAudienceReportsGet(Async)");
    }

    com.squareup.okhttp.Call call =
        customAudienceReportsGetCall(
            accountId,
            filtering,
            dateRange,
            groupBy,
            fields,
            progressListener,
            progressRequestListener,
            headerPair);
    return call;
  }

  /**
   * 人群报表
   *
   * @param accountId (required)
   * @param filtering (required)
   * @param dateRange (required)
   * @param groupBy (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return CustomAudienceReportsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public CustomAudienceReportsGetResponse customAudienceReportsGet(
      Long accountId,
      List<FilteringStruct> filtering,
      DateRange dateRange,
      List<String> groupBy,
      List<String> fields,
      Pair... headerPair)
      throws ApiException {
    ApiResponse<CustomAudienceReportsGetResponse> resp =
        customAudienceReportsGetWithHttpInfo(
            accountId, filtering, dateRange, groupBy, fields, headerPair);
    return resp.getData();
  }

  /**
   * 人群报表
   *
   * @param accountId (required)
   * @param filtering (required)
   * @param dateRange (required)
   * @param groupBy (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;CustomAudienceReportsGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<CustomAudienceReportsGetResponse> customAudienceReportsGetWithHttpInfo(
      Long accountId,
      List<FilteringStruct> filtering,
      DateRange dateRange,
      List<String> groupBy,
      List<String> fields,
      Pair... headerPair)
      throws ApiException {
    com.squareup.okhttp.Call call =
        customAudienceReportsGetValidateBeforeCall(
            accountId, filtering, dateRange, groupBy, fields, null, null, headerPair);
    Type localVarReturnType = new TypeToken<CustomAudienceReportsGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 人群报表 (asynchronously)
   *
   * @param accountId (required)
   * @param filtering (required)
   * @param dateRange (required)
   * @param groupBy (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call customAudienceReportsGetAsync(
      Long accountId,
      List<FilteringStruct> filtering,
      DateRange dateRange,
      List<String> groupBy,
      List<String> fields,
      final ApiCallback<CustomAudienceReportsGetResponse> callback,
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
        customAudienceReportsGetValidateBeforeCall(
            accountId,
            filtering,
            dateRange,
            groupBy,
            fields,
            progressListener,
            progressRequestListener,
            headerPair);
    Type localVarReturnType = new TypeToken<CustomAudienceReportsGetResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}

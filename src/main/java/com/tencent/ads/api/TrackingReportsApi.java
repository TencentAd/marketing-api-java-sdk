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
import com.tencent.ads.model.DateRange;
import com.tencent.ads.model.TrackingReportsGetResponse;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrackingReportsApi {
  private ApiClient apiClient;

  public TrackingReportsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TrackingReportsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for trackingReportsGet
   *
   * @param accountId (required)
   * @param dateRange (required)
   * @param timeGranularity (optional)
   * @param promotedObjectType (optional)
   * @param promotedObjectId (optional)
   * @param feedbackUrl (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call trackingReportsGetCall(
      Long accountId,
      DateRange dateRange,
      String timeGranularity,
      String promotedObjectType,
      String promotedObjectId,
      String feedbackUrl,
      Long page,
      Long pageSize,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/tracking_reports/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (accountId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("account_id", accountId));
    if (dateRange != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("date_range", dateRange));
    if (timeGranularity != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("time_granularity", timeGranularity));
    if (promotedObjectType != null)
      localVarQueryParams.addAll(
          apiClient.parameterToPair("promoted_object_type", promotedObjectType));
    if (promotedObjectId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("promoted_object_id", promotedObjectId));
    if (feedbackUrl != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("feedback_url", feedbackUrl));
    if (page != null) localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
    if (pageSize != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
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
  private com.squareup.okhttp.Call trackingReportsGetValidateBeforeCall(
      Long accountId,
      DateRange dateRange,
      String timeGranularity,
      String promotedObjectType,
      String promotedObjectId,
      String feedbackUrl,
      Long page,
      Long pageSize,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling trackingReportsGet(Async)");
    }

    // verify the required parameter 'dateRange' is set
    if (dateRange == null) {
      throw new ApiException(
          "Missing the required parameter 'dateRange' when calling trackingReportsGet(Async)");
    }

    com.squareup.okhttp.Call call =
        trackingReportsGetCall(
            accountId,
            dateRange,
            timeGranularity,
            promotedObjectType,
            promotedObjectId,
            feedbackUrl,
            page,
            pageSize,
            fields,
            progressListener,
            progressRequestListener,
            headerPair);
    return call;
  }

  /**
   * 点击追踪报表
   *
   * @param accountId (required)
   * @param dateRange (required)
   * @param timeGranularity (optional)
   * @param promotedObjectType (optional)
   * @param promotedObjectId (optional)
   * @param feedbackUrl (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return TrackingReportsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public TrackingReportsGetResponse trackingReportsGet(
      Long accountId,
      DateRange dateRange,
      String timeGranularity,
      String promotedObjectType,
      String promotedObjectId,
      String feedbackUrl,
      Long page,
      Long pageSize,
      List<String> fields,
      Pair... headerPair)
      throws ApiException {
    ApiResponse<TrackingReportsGetResponse> resp =
        trackingReportsGetWithHttpInfo(
            accountId,
            dateRange,
            timeGranularity,
            promotedObjectType,
            promotedObjectId,
            feedbackUrl,
            page,
            pageSize,
            fields,
            headerPair);
    return resp.getData();
  }

  /**
   * 点击追踪报表
   *
   * @param accountId (required)
   * @param dateRange (required)
   * @param timeGranularity (optional)
   * @param promotedObjectType (optional)
   * @param promotedObjectId (optional)
   * @param feedbackUrl (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;TrackingReportsGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<TrackingReportsGetResponse> trackingReportsGetWithHttpInfo(
      Long accountId,
      DateRange dateRange,
      String timeGranularity,
      String promotedObjectType,
      String promotedObjectId,
      String feedbackUrl,
      Long page,
      Long pageSize,
      List<String> fields,
      Pair... headerPair)
      throws ApiException {
    com.squareup.okhttp.Call call =
        trackingReportsGetValidateBeforeCall(
            accountId,
            dateRange,
            timeGranularity,
            promotedObjectType,
            promotedObjectId,
            feedbackUrl,
            page,
            pageSize,
            fields,
            null,
            null,
            headerPair);
    Type localVarReturnType = new TypeToken<TrackingReportsGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 点击追踪报表 (asynchronously)
   *
   * @param accountId (required)
   * @param dateRange (required)
   * @param timeGranularity (optional)
   * @param promotedObjectType (optional)
   * @param promotedObjectId (optional)
   * @param feedbackUrl (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call trackingReportsGetAsync(
      Long accountId,
      DateRange dateRange,
      String timeGranularity,
      String promotedObjectType,
      String promotedObjectId,
      String feedbackUrl,
      Long page,
      Long pageSize,
      List<String> fields,
      final ApiCallback<TrackingReportsGetResponse> callback,
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
        trackingReportsGetValidateBeforeCall(
            accountId,
            dateRange,
            timeGranularity,
            promotedObjectType,
            promotedObjectId,
            feedbackUrl,
            page,
            pageSize,
            fields,
            progressListener,
            progressRequestListener,
            headerPair);
    Type localVarReturnType = new TypeToken<TrackingReportsGetResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}

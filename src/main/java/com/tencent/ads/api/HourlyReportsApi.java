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
import com.tencent.ads.model.FilteringStruct;
import com.tencent.ads.model.HourlyReportsGetResponse;
import com.tencent.ads.model.OrderByStruct;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HourlyReportsApi {
  private ApiClient apiClient;

  public HourlyReportsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public HourlyReportsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for hourlyReportsGet
   *
   * @param accountId (required)
   * @param level (required)
   * @param dateRange (required)
   * @param filtering (optional)
   * @param groupBy (optional)
   * @param orderBy (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param timeLine (optional)
   * @param fields (optional)
   * @param weixinOfficialAccountsUpgradeEnabled (optional)
   * @param adqAccountsUpgradeEnabled (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call hourlyReportsGetCall(
      Long accountId,
      String level,
      DateRange dateRange,
      List<FilteringStruct> filtering,
      List<String> groupBy,
      List<OrderByStruct> orderBy,
      Long page,
      Long pageSize,
      String timeLine,
      List<String> fields,
      Boolean weixinOfficialAccountsUpgradeEnabled,
      Boolean adqAccountsUpgradeEnabled,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/hourly_reports/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (accountId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("account_id", accountId));
    if (level != null) localVarQueryParams.addAll(apiClient.parameterToPair("level", level));
    if (dateRange != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("date_range", dateRange));
    if (filtering != null)
      localVarCollectionQueryParams.addAll(
          apiClient.parameterToPairs("multi", "filtering", filtering));
    if (groupBy != null)
      localVarCollectionQueryParams.addAll(
          apiClient.parameterToPairs("multi", "group_by", groupBy));
    if (orderBy != null)
      localVarCollectionQueryParams.addAll(
          apiClient.parameterToPairs("multi", "order_by", orderBy));
    if (page != null) localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
    if (pageSize != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
    if (timeLine != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("time_line", timeLine));
    if (fields != null)
      localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "fields", fields));
    if (weixinOfficialAccountsUpgradeEnabled != null)
      localVarQueryParams.addAll(
          apiClient.parameterToPair(
              "weixin_official_accounts_upgrade_enabled", weixinOfficialAccountsUpgradeEnabled));
    if (adqAccountsUpgradeEnabled != null)
      localVarQueryParams.addAll(
          apiClient.parameterToPair("adq_accounts_upgrade_enabled", adqAccountsUpgradeEnabled));

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
  private com.squareup.okhttp.Call hourlyReportsGetValidateBeforeCall(
      Long accountId,
      String level,
      DateRange dateRange,
      List<FilteringStruct> filtering,
      List<String> groupBy,
      List<OrderByStruct> orderBy,
      Long page,
      Long pageSize,
      String timeLine,
      List<String> fields,
      Boolean weixinOfficialAccountsUpgradeEnabled,
      Boolean adqAccountsUpgradeEnabled,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling hourlyReportsGet(Async)");
    }

    // verify the required parameter 'level' is set
    if (level == null) {
      throw new ApiException(
          "Missing the required parameter 'level' when calling hourlyReportsGet(Async)");
    }

    // verify the required parameter 'dateRange' is set
    if (dateRange == null) {
      throw new ApiException(
          "Missing the required parameter 'dateRange' when calling hourlyReportsGet(Async)");
    }

    com.squareup.okhttp.Call call =
        hourlyReportsGetCall(
            accountId,
            level,
            dateRange,
            filtering,
            groupBy,
            orderBy,
            page,
            pageSize,
            timeLine,
            fields,
            weixinOfficialAccountsUpgradeEnabled,
            adqAccountsUpgradeEnabled,
            progressListener,
            progressRequestListener,
            headerPair);
    return call;
  }

  /**
   * 获取小时报表
   *
   * @param accountId (required)
   * @param level (required)
   * @param dateRange (required)
   * @param filtering (optional)
   * @param groupBy (optional)
   * @param orderBy (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param timeLine (optional)
   * @param fields (optional)
   * @param weixinOfficialAccountsUpgradeEnabled (optional)
   * @param adqAccountsUpgradeEnabled (optional)
   * @return HourlyReportsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public HourlyReportsGetResponse hourlyReportsGet(
      Long accountId,
      String level,
      DateRange dateRange,
      List<FilteringStruct> filtering,
      List<String> groupBy,
      List<OrderByStruct> orderBy,
      Long page,
      Long pageSize,
      String timeLine,
      List<String> fields,
      Boolean weixinOfficialAccountsUpgradeEnabled,
      Boolean adqAccountsUpgradeEnabled,
      String... headerPair)
      throws ApiException {
    ApiResponse<HourlyReportsGetResponse> resp =
        hourlyReportsGetWithHttpInfo(
            accountId,
            level,
            dateRange,
            filtering,
            groupBy,
            orderBy,
            page,
            pageSize,
            timeLine,
            fields,
            weixinOfficialAccountsUpgradeEnabled,
            adqAccountsUpgradeEnabled,
            headerPair);
    return resp.getData();
  }

  /**
   * 获取小时报表
   *
   * @param accountId (required)
   * @param level (required)
   * @param dateRange (required)
   * @param filtering (optional)
   * @param groupBy (optional)
   * @param orderBy (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param timeLine (optional)
   * @param fields (optional)
   * @param weixinOfficialAccountsUpgradeEnabled (optional)
   * @param adqAccountsUpgradeEnabled (optional)
   * @return ApiResponse&lt;HourlyReportsGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<HourlyReportsGetResponse> hourlyReportsGetWithHttpInfo(
      Long accountId,
      String level,
      DateRange dateRange,
      List<FilteringStruct> filtering,
      List<String> groupBy,
      List<OrderByStruct> orderBy,
      Long page,
      Long pageSize,
      String timeLine,
      List<String> fields,
      Boolean weixinOfficialAccountsUpgradeEnabled,
      Boolean adqAccountsUpgradeEnabled,
      String... headerPair)
      throws ApiException {
    com.squareup.okhttp.Call call =
        hourlyReportsGetValidateBeforeCall(
            accountId,
            level,
            dateRange,
            filtering,
            groupBy,
            orderBy,
            page,
            pageSize,
            timeLine,
            fields,
            weixinOfficialAccountsUpgradeEnabled,
            adqAccountsUpgradeEnabled,
            null,
            null,
            headerPair);
    Type localVarReturnType = new TypeToken<HourlyReportsGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 获取小时报表 (asynchronously)
   *
   * @param accountId (required)
   * @param level (required)
   * @param dateRange (required)
   * @param filtering (optional)
   * @param groupBy (optional)
   * @param orderBy (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param timeLine (optional)
   * @param fields (optional)
   * @param weixinOfficialAccountsUpgradeEnabled (optional)
   * @param adqAccountsUpgradeEnabled (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call hourlyReportsGetAsync(
      Long accountId,
      String level,
      DateRange dateRange,
      List<FilteringStruct> filtering,
      List<String> groupBy,
      List<OrderByStruct> orderBy,
      Long page,
      Long pageSize,
      String timeLine,
      List<String> fields,
      Boolean weixinOfficialAccountsUpgradeEnabled,
      Boolean adqAccountsUpgradeEnabled,
      final ApiCallback<HourlyReportsGetResponse> callback,
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
        hourlyReportsGetValidateBeforeCall(
            accountId,
            level,
            dateRange,
            filtering,
            groupBy,
            orderBy,
            page,
            pageSize,
            timeLine,
            fields,
            weixinOfficialAccountsUpgradeEnabled,
            adqAccountsUpgradeEnabled,
            progressListener,
            progressRequestListener,
            headerPair);
    Type localVarReturnType = new TypeToken<HourlyReportsGetResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}

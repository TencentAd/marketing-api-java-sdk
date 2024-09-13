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
import com.tencent.ads.model.v3.AdvertiserAddRequest;
import com.tencent.ads.model.v3.AdvertiserAddResponse;
import com.tencent.ads.model.v3.AdvertiserGetResponse;
import com.tencent.ads.model.v3.AdvertiserUpdateDailyBudgetRequest;
import com.tencent.ads.model.v3.AdvertiserUpdateDailyBudgetResponse;
import com.tencent.ads.model.v3.AdvertiserUpdateRequest;
import com.tencent.ads.model.v3.AdvertiserUpdateResponse;
import com.tencent.ads.model.v3.FilteringStruct;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdvertiserApi {
  private ApiClient apiClient;

  public AdvertiserApi() {
    this(Configuration.getV3DefaultApiClient());
  }

  public AdvertiserApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for advertiserAdd
   *
   * @param data (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call advertiserAddCall(
      AdvertiserAddRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    Object localVarPostBody = data;

    // create path and map variables
    String localVarPath = "/advertiser/add";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {"application/json", "application/xml"};
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
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAuthNames,
        progressRequestListener);
  }

  @SuppressWarnings("rawtypes")
  private com.squareup.okhttp.Call advertiserAddValidateBeforeCall(
      AdvertiserAddRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(
          "Missing the required parameter 'data' when calling advertiserAdd(Async)");
    }

    com.squareup.okhttp.Call call =
        advertiserAddCall(data, progressListener, progressRequestListener, headerPair);
    return call;
  }

  /**
   * 添加腾讯广告服务商子客
   *
   * @param data (required)
   * @return AdvertiserAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public AdvertiserAddResponse advertiserAdd(AdvertiserAddRequest data, Pair... headerPair)
      throws ApiException {
    ApiResponse<AdvertiserAddResponse> resp = advertiserAddWithHttpInfo(data, headerPair);
    return resp.getData();
  }

  /**
   * 添加腾讯广告服务商子客
   *
   * @param data (required)
   * @return ApiResponse&lt;AdvertiserAddResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<AdvertiserAddResponse> advertiserAddWithHttpInfo(
      AdvertiserAddRequest data, Pair... headerPair) throws ApiException {
    com.squareup.okhttp.Call call = advertiserAddValidateBeforeCall(data, null, null, headerPair);
    Type localVarReturnType = new TypeToken<AdvertiserAddResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 添加腾讯广告服务商子客 (asynchronously)
   *
   * @param data (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call advertiserAddAsync(
      AdvertiserAddRequest data,
      final ApiCallback<AdvertiserAddResponse> callback,
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
        advertiserAddValidateBeforeCall(
            data, progressListener, progressRequestListener, headerPair);
    Type localVarReturnType = new TypeToken<AdvertiserAddResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  /**
   * Build call for advertiserGet
   *
   * @param fields (required)
   * @param paginationMode (required)
   * @param pageSize (required)
   * @param agencyId (optional)
   * @param accountId (optional)
   * @param filtering (optional)
   * @param page (optional)
   * @param cursor (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call advertiserGetCall(
      List<String> fields,
      String paginationMode,
      Long pageSize,
      Long agencyId,
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long cursor,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/advertiser/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (agencyId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("agency_id", agencyId));
    if (accountId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("account_id", accountId));
    if (filtering != null)
      localVarCollectionQueryParams.addAll(
          apiClient.parameterToPairs("multi", "filtering", filtering));
    if (fields != null)
      localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "fields", fields));
    if (paginationMode != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("pagination_mode", paginationMode));
    if (page != null) localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
    if (pageSize != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
    if (cursor != null) localVarQueryParams.addAll(apiClient.parameterToPair("cursor", cursor));

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
  private com.squareup.okhttp.Call advertiserGetValidateBeforeCall(
      List<String> fields,
      String paginationMode,
      Long pageSize,
      Long agencyId,
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long cursor,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    // verify the required parameter 'fields' is set
    if (fields == null) {
      throw new ApiException(
          "Missing the required parameter 'fields' when calling advertiserGet(Async)");
    }

    // verify the required parameter 'paginationMode' is set
    if (paginationMode == null) {
      throw new ApiException(
          "Missing the required parameter 'paginationMode' when calling advertiserGet(Async)");
    }

    // verify the required parameter 'pageSize' is set
    if (pageSize == null) {
      throw new ApiException(
          "Missing the required parameter 'pageSize' when calling advertiserGet(Async)");
    }

    com.squareup.okhttp.Call call =
        advertiserGetCall(
            fields,
            paginationMode,
            pageSize,
            agencyId,
            accountId,
            filtering,
            page,
            cursor,
            progressListener,
            progressRequestListener,
            headerPair);
    return call;
  }

  /**
   * 查询腾讯广告广告主信息
   *
   * @param fields (required)
   * @param paginationMode (required)
   * @param pageSize (required)
   * @param agencyId (optional)
   * @param accountId (optional)
   * @param filtering (optional)
   * @param page (optional)
   * @param cursor (optional)
   * @return AdvertiserGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public AdvertiserGetResponse advertiserGet(
      List<String> fields,
      String paginationMode,
      Long pageSize,
      Long agencyId,
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long cursor,
      Pair... headerPair)
      throws ApiException {
    ApiResponse<AdvertiserGetResponse> resp =
        advertiserGetWithHttpInfo(
            fields,
            paginationMode,
            pageSize,
            agencyId,
            accountId,
            filtering,
            page,
            cursor,
            headerPair);
    return resp.getData();
  }

  /**
   * 查询腾讯广告广告主信息
   *
   * @param fields (required)
   * @param paginationMode (required)
   * @param pageSize (required)
   * @param agencyId (optional)
   * @param accountId (optional)
   * @param filtering (optional)
   * @param page (optional)
   * @param cursor (optional)
   * @return ApiResponse&lt;AdvertiserGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<AdvertiserGetResponse> advertiserGetWithHttpInfo(
      List<String> fields,
      String paginationMode,
      Long pageSize,
      Long agencyId,
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long cursor,
      Pair... headerPair)
      throws ApiException {
    com.squareup.okhttp.Call call =
        advertiserGetValidateBeforeCall(
            fields,
            paginationMode,
            pageSize,
            agencyId,
            accountId,
            filtering,
            page,
            cursor,
            null,
            null,
            headerPair);
    Type localVarReturnType = new TypeToken<AdvertiserGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 查询腾讯广告广告主信息 (asynchronously)
   *
   * @param fields (required)
   * @param paginationMode (required)
   * @param pageSize (required)
   * @param agencyId (optional)
   * @param accountId (optional)
   * @param filtering (optional)
   * @param page (optional)
   * @param cursor (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call advertiserGetAsync(
      List<String> fields,
      String paginationMode,
      Long pageSize,
      Long agencyId,
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long cursor,
      final ApiCallback<AdvertiserGetResponse> callback,
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
        advertiserGetValidateBeforeCall(
            fields,
            paginationMode,
            pageSize,
            agencyId,
            accountId,
            filtering,
            page,
            cursor,
            progressListener,
            progressRequestListener,
            headerPair);
    Type localVarReturnType = new TypeToken<AdvertiserGetResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  /**
   * Build call for advertiserUpdate
   *
   * @param data (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call advertiserUpdateCall(
      AdvertiserUpdateRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    Object localVarPostBody = data;

    // create path and map variables
    String localVarPath = "/advertiser/update";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {"application/json", "application/xml"};
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
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAuthNames,
        progressRequestListener);
  }

  @SuppressWarnings("rawtypes")
  private com.squareup.okhttp.Call advertiserUpdateValidateBeforeCall(
      AdvertiserUpdateRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(
          "Missing the required parameter 'data' when calling advertiserUpdate(Async)");
    }

    com.squareup.okhttp.Call call =
        advertiserUpdateCall(data, progressListener, progressRequestListener, headerPair);
    return call;
  }

  /**
   * 更新腾讯广告广告主信息
   *
   * @param data (required)
   * @return AdvertiserUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public AdvertiserUpdateResponse advertiserUpdate(AdvertiserUpdateRequest data, Pair... headerPair)
      throws ApiException {
    ApiResponse<AdvertiserUpdateResponse> resp = advertiserUpdateWithHttpInfo(data, headerPair);
    return resp.getData();
  }

  /**
   * 更新腾讯广告广告主信息
   *
   * @param data (required)
   * @return ApiResponse&lt;AdvertiserUpdateResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<AdvertiserUpdateResponse> advertiserUpdateWithHttpInfo(
      AdvertiserUpdateRequest data, Pair... headerPair) throws ApiException {
    com.squareup.okhttp.Call call =
        advertiserUpdateValidateBeforeCall(data, null, null, headerPair);
    Type localVarReturnType = new TypeToken<AdvertiserUpdateResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 更新腾讯广告广告主信息 (asynchronously)
   *
   * @param data (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call advertiserUpdateAsync(
      AdvertiserUpdateRequest data,
      final ApiCallback<AdvertiserUpdateResponse> callback,
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
        advertiserUpdateValidateBeforeCall(
            data, progressListener, progressRequestListener, headerPair);
    Type localVarReturnType = new TypeToken<AdvertiserUpdateResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  /**
   * Build call for advertiserUpdateDailyBudget
   *
   * @param data (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call advertiserUpdateDailyBudgetCall(
      AdvertiserUpdateDailyBudgetRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    Object localVarPostBody = data;

    // create path and map variables
    String localVarPath = "/advertiser/update_daily_budget";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {"application/json", "application/xml"};
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
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAuthNames,
        progressRequestListener);
  }

  @SuppressWarnings("rawtypes")
  private com.squareup.okhttp.Call advertiserUpdateDailyBudgetValidateBeforeCall(
      AdvertiserUpdateDailyBudgetRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(
          "Missing the required parameter 'data' when calling advertiserUpdateDailyBudget(Async)");
    }

    com.squareup.okhttp.Call call =
        advertiserUpdateDailyBudgetCall(
            data, progressListener, progressRequestListener, headerPair);
    return call;
  }

  /**
   * 批量修改广告主日限额
   *
   * @param data (required)
   * @return AdvertiserUpdateDailyBudgetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public AdvertiserUpdateDailyBudgetResponse advertiserUpdateDailyBudget(
      AdvertiserUpdateDailyBudgetRequest data, Pair... headerPair) throws ApiException {
    ApiResponse<AdvertiserUpdateDailyBudgetResponse> resp =
        advertiserUpdateDailyBudgetWithHttpInfo(data, headerPair);
    return resp.getData();
  }

  /**
   * 批量修改广告主日限额
   *
   * @param data (required)
   * @return ApiResponse&lt;AdvertiserUpdateDailyBudgetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<AdvertiserUpdateDailyBudgetResponse> advertiserUpdateDailyBudgetWithHttpInfo(
      AdvertiserUpdateDailyBudgetRequest data, Pair... headerPair) throws ApiException {
    com.squareup.okhttp.Call call =
        advertiserUpdateDailyBudgetValidateBeforeCall(data, null, null, headerPair);
    Type localVarReturnType = new TypeToken<AdvertiserUpdateDailyBudgetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 批量修改广告主日限额 (asynchronously)
   *
   * @param data (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call advertiserUpdateDailyBudgetAsync(
      AdvertiserUpdateDailyBudgetRequest data,
      final ApiCallback<AdvertiserUpdateDailyBudgetResponse> callback,
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
        advertiserUpdateDailyBudgetValidateBeforeCall(
            data, progressListener, progressRequestListener, headerPair);
    Type localVarReturnType = new TypeToken<AdvertiserUpdateDailyBudgetResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}

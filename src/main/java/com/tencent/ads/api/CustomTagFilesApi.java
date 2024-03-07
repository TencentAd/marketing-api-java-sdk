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
import com.tencent.ads.model.CustomTagFilesAddResponse;
import com.tencent.ads.model.CustomTagFilesGetResponse;
import com.tencent.ads.model.FilteringStruct;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomTagFilesApi {
  private ApiClient apiClient;

  public CustomTagFilesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CustomTagFilesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for customTagFilesAdd
   *
   * @param accountId (required)
   * @param userIdType (required)
   * @param tagId (required)
   * @param file (required)
   * @param operationType (optional)
   * @param openAppId (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call customTagFilesAddCall(
      Long accountId,
      String userIdType,
      Long tagId,
      File file,
      String operationType,
      String openAppId,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/custom_tag_files/add";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    if (accountId != null) localVarFormParams.put("account_id", accountId);
    if (userIdType != null) localVarFormParams.put("user_id_type", userIdType);
    if (tagId != null) localVarFormParams.put("tag_id", tagId);
    if (file != null) localVarFormParams.put("file", file);
    if (operationType != null) localVarFormParams.put("operation_type", operationType);
    if (openAppId != null) localVarFormParams.put("open_app_id", openAppId);

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {"multipart/form-data"};
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
  private com.squareup.okhttp.Call customTagFilesAddValidateBeforeCall(
      Long accountId,
      String userIdType,
      Long tagId,
      File file,
      String operationType,
      String openAppId,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling customTagFilesAdd(Async)");
    }

    // verify the required parameter 'userIdType' is set
    if (userIdType == null) {
      throw new ApiException(
          "Missing the required parameter 'userIdType' when calling customTagFilesAdd(Async)");
    }

    // verify the required parameter 'tagId' is set
    if (tagId == null) {
      throw new ApiException(
          "Missing the required parameter 'tagId' when calling customTagFilesAdd(Async)");
    }

    // verify the required parameter 'file' is set
    if (file == null) {
      throw new ApiException(
          "Missing the required parameter 'file' when calling customTagFilesAdd(Async)");
    }

    com.squareup.okhttp.Call call =
        customTagFilesAddCall(
            accountId,
            userIdType,
            tagId,
            file,
            operationType,
            openAppId,
            progressListener,
            progressRequestListener,
            headerPair);
    return call;
  }

  /**
   * 上传客户标签人群数据文件
   *
   * @param accountId (required)
   * @param userIdType (required)
   * @param tagId (required)
   * @param file (required)
   * @param operationType (optional)
   * @param openAppId (optional)
   * @return CustomTagFilesAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public CustomTagFilesAddResponse customTagFilesAdd(
      Long accountId,
      String userIdType,
      Long tagId,
      File file,
      String operationType,
      String openAppId,
      String... headerPair)
      throws ApiException {
    ApiResponse<CustomTagFilesAddResponse> resp =
        customTagFilesAddWithHttpInfo(
            accountId, userIdType, tagId, file, operationType, openAppId, headerPair);
    return resp.getData();
  }

  /**
   * 上传客户标签人群数据文件
   *
   * @param accountId (required)
   * @param userIdType (required)
   * @param tagId (required)
   * @param file (required)
   * @param operationType (optional)
   * @param openAppId (optional)
   * @return ApiResponse&lt;CustomTagFilesAddResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<CustomTagFilesAddResponse> customTagFilesAddWithHttpInfo(
      Long accountId,
      String userIdType,
      Long tagId,
      File file,
      String operationType,
      String openAppId,
      String... headerPair)
      throws ApiException {
    com.squareup.okhttp.Call call =
        customTagFilesAddValidateBeforeCall(
            accountId, userIdType, tagId, file, operationType, openAppId, null, null, headerPair);
    Type localVarReturnType = new TypeToken<CustomTagFilesAddResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 上传客户标签人群数据文件 (asynchronously)
   *
   * @param accountId (required)
   * @param userIdType (required)
   * @param tagId (required)
   * @param file (required)
   * @param operationType (optional)
   * @param openAppId (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call customTagFilesAddAsync(
      Long accountId,
      String userIdType,
      Long tagId,
      File file,
      String operationType,
      String openAppId,
      final ApiCallback<CustomTagFilesAddResponse> callback,
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
        customTagFilesAddValidateBeforeCall(
            accountId,
            userIdType,
            tagId,
            file,
            operationType,
            openAppId,
            progressListener,
            progressRequestListener,
            headerPair);
    Type localVarReturnType = new TypeToken<CustomTagFilesAddResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  /**
   * Build call for customTagFilesGet
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call customTagFilesGetCall(
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/custom_tag_files/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (accountId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("account_id", accountId));
    if (filtering != null)
      localVarCollectionQueryParams.addAll(
          apiClient.parameterToPairs("multi", "filtering", filtering));
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
  private com.squareup.okhttp.Call customTagFilesGetValidateBeforeCall(
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling customTagFilesGet(Async)");
    }

    com.squareup.okhttp.Call call =
        customTagFilesGetCall(
            accountId,
            filtering,
            page,
            pageSize,
            fields,
            progressListener,
            progressRequestListener,
            headerPair);
    return call;
  }

  /**
   * 获取客户标签人群文件
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return CustomTagFilesGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public CustomTagFilesGetResponse customTagFilesGet(
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields,
      String... headerPair)
      throws ApiException {
    ApiResponse<CustomTagFilesGetResponse> resp =
        customTagFilesGetWithHttpInfo(accountId, filtering, page, pageSize, fields, headerPair);
    return resp.getData();
  }

  /**
   * 获取客户标签人群文件
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;CustomTagFilesGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<CustomTagFilesGetResponse> customTagFilesGetWithHttpInfo(
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields,
      String... headerPair)
      throws ApiException {
    com.squareup.okhttp.Call call =
        customTagFilesGetValidateBeforeCall(
            accountId, filtering, page, pageSize, fields, null, null, headerPair);
    Type localVarReturnType = new TypeToken<CustomTagFilesGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 获取客户标签人群文件 (asynchronously)
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call customTagFilesGetAsync(
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields,
      final ApiCallback<CustomTagFilesGetResponse> callback,
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
        customTagFilesGetValidateBeforeCall(
            accountId,
            filtering,
            page,
            pageSize,
            fields,
            progressListener,
            progressRequestListener,
            headerPair);
    Type localVarReturnType = new TypeToken<CustomTagFilesGetResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}

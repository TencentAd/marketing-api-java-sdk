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
import com.tencent.ads.model.CustomAudienceFilesAddResponse;
import com.tencent.ads.model.CustomAudienceFilesGetResponse;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomAudienceFilesApi {
  private ApiClient apiClient;

  public CustomAudienceFilesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CustomAudienceFilesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for customAudienceFilesAdd
   *
   * @param accountId (required)
   * @param audienceId (required)
   * @param userIdType (required)
   * @param file (required)
   * @param operationType (optional)
   * @param openAppId (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call customAudienceFilesAddCall(
      Long accountId,
      Long audienceId,
      String userIdType,
      File file,
      String operationType,
      String openAppId,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/custom_audience_files/add";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    if (accountId != null) localVarFormParams.put("account_id", accountId);
    if (audienceId != null) localVarFormParams.put("audience_id", audienceId);
    if (userIdType != null) localVarFormParams.put("user_id_type", userIdType);
    if (file != null) localVarFormParams.put("file", file);
    if (operationType != null) localVarFormParams.put("operation_type", operationType);
    if (openAppId != null) localVarFormParams.put("open_app_id", openAppId);

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {"multipart/form-data"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

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
  private com.squareup.okhttp.Call customAudienceFilesAddValidateBeforeCall(
      Long accountId,
      Long audienceId,
      String userIdType,
      File file,
      String operationType,
      String openAppId,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling customAudienceFilesAdd(Async)");
    }

    // verify the required parameter 'audienceId' is set
    if (audienceId == null) {
      throw new ApiException(
          "Missing the required parameter 'audienceId' when calling customAudienceFilesAdd(Async)");
    }

    // verify the required parameter 'userIdType' is set
    if (userIdType == null) {
      throw new ApiException(
          "Missing the required parameter 'userIdType' when calling customAudienceFilesAdd(Async)");
    }

    // verify the required parameter 'file' is set
    if (file == null) {
      throw new ApiException(
          "Missing the required parameter 'file' when calling customAudienceFilesAdd(Async)");
    }

    com.squareup.okhttp.Call call =
        customAudienceFilesAddCall(
            accountId,
            audienceId,
            userIdType,
            file,
            operationType,
            openAppId,
            progressListener,
            progressRequestListener);
    return call;
  }

  /**
   * 上传客户人群数据文件
   *
   * @param accountId (required)
   * @param audienceId (required)
   * @param userIdType (required)
   * @param file (required)
   * @param operationType (optional)
   * @param openAppId (optional)
   * @return CustomAudienceFilesAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public CustomAudienceFilesAddResponse customAudienceFilesAdd(
      Long accountId,
      Long audienceId,
      String userIdType,
      File file,
      String operationType,
      String openAppId)
      throws ApiException {
    ApiResponse<CustomAudienceFilesAddResponse> resp =
        customAudienceFilesAddWithHttpInfo(
            accountId, audienceId, userIdType, file, operationType, openAppId);
    return resp.getData();
  }

  /**
   * 上传客户人群数据文件
   *
   * @param accountId (required)
   * @param audienceId (required)
   * @param userIdType (required)
   * @param file (required)
   * @param operationType (optional)
   * @param openAppId (optional)
   * @return ApiResponse&lt;CustomAudienceFilesAddResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<CustomAudienceFilesAddResponse> customAudienceFilesAddWithHttpInfo(
      Long accountId,
      Long audienceId,
      String userIdType,
      File file,
      String operationType,
      String openAppId)
      throws ApiException {
    com.squareup.okhttp.Call call =
        customAudienceFilesAddValidateBeforeCall(
            accountId, audienceId, userIdType, file, operationType, openAppId, null, null);
    Type localVarReturnType = new TypeToken<CustomAudienceFilesAddResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 上传客户人群数据文件 (asynchronously)
   *
   * @param accountId (required)
   * @param audienceId (required)
   * @param userIdType (required)
   * @param file (required)
   * @param operationType (optional)
   * @param openAppId (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call customAudienceFilesAddAsync(
      Long accountId,
      Long audienceId,
      String userIdType,
      File file,
      String operationType,
      String openAppId,
      final ApiCallback<CustomAudienceFilesAddResponse> callback)
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
        customAudienceFilesAddValidateBeforeCall(
            accountId,
            audienceId,
            userIdType,
            file,
            operationType,
            openAppId,
            progressListener,
            progressRequestListener);
    Type localVarReturnType = new TypeToken<CustomAudienceFilesAddResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  /**
   * Build call for customAudienceFilesGet
   *
   * @param accountId (required)
   * @param audienceId (optional)
   * @param customAudienceFileId (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call customAudienceFilesGetCall(
      Long accountId,
      Long audienceId,
      Long customAudienceFileId,
      Long page,
      Long pageSize,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/custom_audience_files/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (accountId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("account_id", accountId));
    if (audienceId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("audience_id", audienceId));
    if (customAudienceFileId != null)
      localVarQueryParams.addAll(
          apiClient.parameterToPair("custom_audience_file_id", customAudienceFileId));
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
  private com.squareup.okhttp.Call customAudienceFilesGetValidateBeforeCall(
      Long accountId,
      Long audienceId,
      Long customAudienceFileId,
      Long page,
      Long pageSize,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling customAudienceFilesGet(Async)");
    }

    com.squareup.okhttp.Call call =
        customAudienceFilesGetCall(
            accountId,
            audienceId,
            customAudienceFileId,
            page,
            pageSize,
            fields,
            progressListener,
            progressRequestListener);
    return call;
  }

  /**
   * 获取客户人群数据文件
   *
   * @param accountId (required)
   * @param audienceId (optional)
   * @param customAudienceFileId (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return CustomAudienceFilesGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public CustomAudienceFilesGetResponse customAudienceFilesGet(
      Long accountId,
      Long audienceId,
      Long customAudienceFileId,
      Long page,
      Long pageSize,
      List<String> fields)
      throws ApiException {
    ApiResponse<CustomAudienceFilesGetResponse> resp =
        customAudienceFilesGetWithHttpInfo(
            accountId, audienceId, customAudienceFileId, page, pageSize, fields);
    return resp.getData();
  }

  /**
   * 获取客户人群数据文件
   *
   * @param accountId (required)
   * @param audienceId (optional)
   * @param customAudienceFileId (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;CustomAudienceFilesGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<CustomAudienceFilesGetResponse> customAudienceFilesGetWithHttpInfo(
      Long accountId,
      Long audienceId,
      Long customAudienceFileId,
      Long page,
      Long pageSize,
      List<String> fields)
      throws ApiException {
    com.squareup.okhttp.Call call =
        customAudienceFilesGetValidateBeforeCall(
            accountId, audienceId, customAudienceFileId, page, pageSize, fields, null, null);
    Type localVarReturnType = new TypeToken<CustomAudienceFilesGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 获取客户人群数据文件 (asynchronously)
   *
   * @param accountId (required)
   * @param audienceId (optional)
   * @param customAudienceFileId (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call customAudienceFilesGetAsync(
      Long accountId,
      Long audienceId,
      Long customAudienceFileId,
      Long page,
      Long pageSize,
      List<String> fields,
      final ApiCallback<CustomAudienceFilesGetResponse> callback)
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
        customAudienceFilesGetValidateBeforeCall(
            accountId,
            audienceId,
            customAudienceFileId,
            page,
            pageSize,
            fields,
            progressListener,
            progressRequestListener);
    Type localVarReturnType = new TypeToken<CustomAudienceFilesGetResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}

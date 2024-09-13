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
import com.tencent.ads.model.v3.FilteringStruct;
import com.tencent.ads.model.v3.LiveRoomComponentsAddRequest;
import com.tencent.ads.model.v3.LiveRoomComponentsAddResponse;
import com.tencent.ads.model.v3.LiveRoomComponentsDeleteRequest;
import com.tencent.ads.model.v3.LiveRoomComponentsDeleteResponse;
import com.tencent.ads.model.v3.LiveRoomComponentsGetResponse;
import com.tencent.ads.model.v3.LiveRoomComponentsUpdateRequest;
import com.tencent.ads.model.v3.LiveRoomComponentsUpdateResponse;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LiveRoomComponentsApi {
  private ApiClient apiClient;

  public LiveRoomComponentsApi() {
    this(Configuration.getV3DefaultApiClient());
  }

  public LiveRoomComponentsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for liveRoomComponentsAdd
   *
   * @param data (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call liveRoomComponentsAddCall(
      LiveRoomComponentsAddRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    Object localVarPostBody = data;

    // create path and map variables
    String localVarPath = "/live_room_components/add";

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
  private com.squareup.okhttp.Call liveRoomComponentsAddValidateBeforeCall(
      LiveRoomComponentsAddRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(
          "Missing the required parameter 'data' when calling liveRoomComponentsAdd(Async)");
    }

    com.squareup.okhttp.Call call =
        liveRoomComponentsAddCall(data, progressListener, progressRequestListener, headerPair);
    return call;
  }

  /**
   * 创建直播间组件
   *
   * @param data (required)
   * @return LiveRoomComponentsAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public LiveRoomComponentsAddResponse liveRoomComponentsAdd(
      LiveRoomComponentsAddRequest data, Pair... headerPair) throws ApiException {
    ApiResponse<LiveRoomComponentsAddResponse> resp =
        liveRoomComponentsAddWithHttpInfo(data, headerPair);
    return resp.getData();
  }

  /**
   * 创建直播间组件
   *
   * @param data (required)
   * @return ApiResponse&lt;LiveRoomComponentsAddResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<LiveRoomComponentsAddResponse> liveRoomComponentsAddWithHttpInfo(
      LiveRoomComponentsAddRequest data, Pair... headerPair) throws ApiException {
    com.squareup.okhttp.Call call =
        liveRoomComponentsAddValidateBeforeCall(data, null, null, headerPair);
    Type localVarReturnType = new TypeToken<LiveRoomComponentsAddResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 创建直播间组件 (asynchronously)
   *
   * @param data (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call liveRoomComponentsAddAsync(
      LiveRoomComponentsAddRequest data,
      final ApiCallback<LiveRoomComponentsAddResponse> callback,
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
        liveRoomComponentsAddValidateBeforeCall(
            data, progressListener, progressRequestListener, headerPair);
    Type localVarReturnType = new TypeToken<LiveRoomComponentsAddResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  /**
   * Build call for liveRoomComponentsDelete
   *
   * @param data (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call liveRoomComponentsDeleteCall(
      LiveRoomComponentsDeleteRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    Object localVarPostBody = data;

    // create path and map variables
    String localVarPath = "/live_room_components/delete";

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
  private com.squareup.okhttp.Call liveRoomComponentsDeleteValidateBeforeCall(
      LiveRoomComponentsDeleteRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(
          "Missing the required parameter 'data' when calling liveRoomComponentsDelete(Async)");
    }

    com.squareup.okhttp.Call call =
        liveRoomComponentsDeleteCall(data, progressListener, progressRequestListener, headerPair);
    return call;
  }

  /**
   * 删除直播间组件
   *
   * @param data (required)
   * @return LiveRoomComponentsDeleteResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public LiveRoomComponentsDeleteResponse liveRoomComponentsDelete(
      LiveRoomComponentsDeleteRequest data, Pair... headerPair) throws ApiException {
    ApiResponse<LiveRoomComponentsDeleteResponse> resp =
        liveRoomComponentsDeleteWithHttpInfo(data, headerPair);
    return resp.getData();
  }

  /**
   * 删除直播间组件
   *
   * @param data (required)
   * @return ApiResponse&lt;LiveRoomComponentsDeleteResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<LiveRoomComponentsDeleteResponse> liveRoomComponentsDeleteWithHttpInfo(
      LiveRoomComponentsDeleteRequest data, Pair... headerPair) throws ApiException {
    com.squareup.okhttp.Call call =
        liveRoomComponentsDeleteValidateBeforeCall(data, null, null, headerPair);
    Type localVarReturnType = new TypeToken<LiveRoomComponentsDeleteResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 删除直播间组件 (asynchronously)
   *
   * @param data (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call liveRoomComponentsDeleteAsync(
      LiveRoomComponentsDeleteRequest data,
      final ApiCallback<LiveRoomComponentsDeleteResponse> callback,
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
        liveRoomComponentsDeleteValidateBeforeCall(
            data, progressListener, progressRequestListener, headerPair);
    Type localVarReturnType = new TypeToken<LiveRoomComponentsDeleteResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  /**
   * Build call for liveRoomComponentsGet
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
  public com.squareup.okhttp.Call liveRoomComponentsGetCall(
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/live_room_components/get";

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
  private com.squareup.okhttp.Call liveRoomComponentsGetValidateBeforeCall(
      Long accountId,
      List<FilteringStruct> filtering,
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
          "Missing the required parameter 'accountId' when calling liveRoomComponentsGet(Async)");
    }

    com.squareup.okhttp.Call call =
        liveRoomComponentsGetCall(
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
   * 查询直播间组件信息
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return LiveRoomComponentsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public LiveRoomComponentsGetResponse liveRoomComponentsGet(
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields,
      Pair... headerPair)
      throws ApiException {
    ApiResponse<LiveRoomComponentsGetResponse> resp =
        liveRoomComponentsGetWithHttpInfo(accountId, filtering, page, pageSize, fields, headerPair);
    return resp.getData();
  }

  /**
   * 查询直播间组件信息
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;LiveRoomComponentsGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<LiveRoomComponentsGetResponse> liveRoomComponentsGetWithHttpInfo(
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields,
      Pair... headerPair)
      throws ApiException {
    com.squareup.okhttp.Call call =
        liveRoomComponentsGetValidateBeforeCall(
            accountId, filtering, page, pageSize, fields, null, null, headerPair);
    Type localVarReturnType = new TypeToken<LiveRoomComponentsGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 查询直播间组件信息 (asynchronously)
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
  public com.squareup.okhttp.Call liveRoomComponentsGetAsync(
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields,
      final ApiCallback<LiveRoomComponentsGetResponse> callback,
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
        liveRoomComponentsGetValidateBeforeCall(
            accountId,
            filtering,
            page,
            pageSize,
            fields,
            progressListener,
            progressRequestListener,
            headerPair);
    Type localVarReturnType = new TypeToken<LiveRoomComponentsGetResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  /**
   * Build call for liveRoomComponentsUpdate
   *
   * @param data (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call liveRoomComponentsUpdateCall(
      LiveRoomComponentsUpdateRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    Object localVarPostBody = data;

    // create path and map variables
    String localVarPath = "/live_room_components/update";

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
  private com.squareup.okhttp.Call liveRoomComponentsUpdateValidateBeforeCall(
      LiveRoomComponentsUpdateRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(
          "Missing the required parameter 'data' when calling liveRoomComponentsUpdate(Async)");
    }

    com.squareup.okhttp.Call call =
        liveRoomComponentsUpdateCall(data, progressListener, progressRequestListener, headerPair);
    return call;
  }

  /**
   * 更新直播间组件
   *
   * @param data (required)
   * @return LiveRoomComponentsUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public LiveRoomComponentsUpdateResponse liveRoomComponentsUpdate(
      LiveRoomComponentsUpdateRequest data, Pair... headerPair) throws ApiException {
    ApiResponse<LiveRoomComponentsUpdateResponse> resp =
        liveRoomComponentsUpdateWithHttpInfo(data, headerPair);
    return resp.getData();
  }

  /**
   * 更新直播间组件
   *
   * @param data (required)
   * @return ApiResponse&lt;LiveRoomComponentsUpdateResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<LiveRoomComponentsUpdateResponse> liveRoomComponentsUpdateWithHttpInfo(
      LiveRoomComponentsUpdateRequest data, Pair... headerPair) throws ApiException {
    com.squareup.okhttp.Call call =
        liveRoomComponentsUpdateValidateBeforeCall(data, null, null, headerPair);
    Type localVarReturnType = new TypeToken<LiveRoomComponentsUpdateResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 更新直播间组件 (asynchronously)
   *
   * @param data (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call liveRoomComponentsUpdateAsync(
      LiveRoomComponentsUpdateRequest data,
      final ApiCallback<LiveRoomComponentsUpdateResponse> callback,
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
        liveRoomComponentsUpdateValidateBeforeCall(
            data, progressListener, progressRequestListener, headerPair);
    Type localVarReturnType = new TypeToken<LiveRoomComponentsUpdateResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}

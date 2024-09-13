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
import com.tencent.ads.model.v3.MaterialLabelsAddRequest;
import com.tencent.ads.model.v3.MaterialLabelsAddResponse;
import com.tencent.ads.model.v3.MaterialLabelsBindRequest;
import com.tencent.ads.model.v3.MaterialLabelsBindResponse;
import com.tencent.ads.model.v3.MaterialLabelsDeleteRequest;
import com.tencent.ads.model.v3.MaterialLabelsDeleteResponse;
import com.tencent.ads.model.v3.MaterialLabelsGetResponse;
import com.tencent.ads.model.v3.MaterialLabelsUpdateRequest;
import com.tencent.ads.model.v3.MaterialLabelsUpdateResponse;
import com.tencent.ads.model.v3.OrderByStruct;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaterialLabelsApi {
  private ApiClient apiClient;

  public MaterialLabelsApi() {
    this(Configuration.getV3DefaultApiClient());
  }

  public MaterialLabelsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for materialLabelsAdd
   *
   * @param data (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call materialLabelsAddCall(
      MaterialLabelsAddRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    Object localVarPostBody = data;

    // create path and map variables
    String localVarPath = "/material_labels/add";

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
  private com.squareup.okhttp.Call materialLabelsAddValidateBeforeCall(
      MaterialLabelsAddRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(
          "Missing the required parameter 'data' when calling materialLabelsAdd(Async)");
    }

    com.squareup.okhttp.Call call =
        materialLabelsAddCall(data, progressListener, progressRequestListener, headerPair);
    return call;
  }

  /**
   * 创建素材标签
   *
   * @param data (required)
   * @return MaterialLabelsAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public MaterialLabelsAddResponse materialLabelsAdd(
      MaterialLabelsAddRequest data, Pair... headerPair) throws ApiException {
    ApiResponse<MaterialLabelsAddResponse> resp = materialLabelsAddWithHttpInfo(data, headerPair);
    return resp.getData();
  }

  /**
   * 创建素材标签
   *
   * @param data (required)
   * @return ApiResponse&lt;MaterialLabelsAddResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<MaterialLabelsAddResponse> materialLabelsAddWithHttpInfo(
      MaterialLabelsAddRequest data, Pair... headerPair) throws ApiException {
    com.squareup.okhttp.Call call =
        materialLabelsAddValidateBeforeCall(data, null, null, headerPair);
    Type localVarReturnType = new TypeToken<MaterialLabelsAddResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 创建素材标签 (asynchronously)
   *
   * @param data (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call materialLabelsAddAsync(
      MaterialLabelsAddRequest data,
      final ApiCallback<MaterialLabelsAddResponse> callback,
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
        materialLabelsAddValidateBeforeCall(
            data, progressListener, progressRequestListener, headerPair);
    Type localVarReturnType = new TypeToken<MaterialLabelsAddResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  /**
   * Build call for materialLabelsBind
   *
   * @param data (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call materialLabelsBindCall(
      MaterialLabelsBindRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    Object localVarPostBody = data;

    // create path and map variables
    String localVarPath = "/material_labels/bind";

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
  private com.squareup.okhttp.Call materialLabelsBindValidateBeforeCall(
      MaterialLabelsBindRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(
          "Missing the required parameter 'data' when calling materialLabelsBind(Async)");
    }

    com.squareup.okhttp.Call call =
        materialLabelsBindCall(data, progressListener, progressRequestListener, headerPair);
    return call;
  }

  /**
   * 绑定标签素材关联关系
   *
   * @param data (required)
   * @return MaterialLabelsBindResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public MaterialLabelsBindResponse materialLabelsBind(
      MaterialLabelsBindRequest data, Pair... headerPair) throws ApiException {
    ApiResponse<MaterialLabelsBindResponse> resp = materialLabelsBindWithHttpInfo(data, headerPair);
    return resp.getData();
  }

  /**
   * 绑定标签素材关联关系
   *
   * @param data (required)
   * @return ApiResponse&lt;MaterialLabelsBindResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<MaterialLabelsBindResponse> materialLabelsBindWithHttpInfo(
      MaterialLabelsBindRequest data, Pair... headerPair) throws ApiException {
    com.squareup.okhttp.Call call =
        materialLabelsBindValidateBeforeCall(data, null, null, headerPair);
    Type localVarReturnType = new TypeToken<MaterialLabelsBindResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 绑定标签素材关联关系 (asynchronously)
   *
   * @param data (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call materialLabelsBindAsync(
      MaterialLabelsBindRequest data,
      final ApiCallback<MaterialLabelsBindResponse> callback,
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
        materialLabelsBindValidateBeforeCall(
            data, progressListener, progressRequestListener, headerPair);
    Type localVarReturnType = new TypeToken<MaterialLabelsBindResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  /**
   * Build call for materialLabelsDelete
   *
   * @param data (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call materialLabelsDeleteCall(
      MaterialLabelsDeleteRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    Object localVarPostBody = data;

    // create path and map variables
    String localVarPath = "/material_labels/delete";

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
  private com.squareup.okhttp.Call materialLabelsDeleteValidateBeforeCall(
      MaterialLabelsDeleteRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(
          "Missing the required parameter 'data' when calling materialLabelsDelete(Async)");
    }

    com.squareup.okhttp.Call call =
        materialLabelsDeleteCall(data, progressListener, progressRequestListener, headerPair);
    return call;
  }

  /**
   * 删除素材标签
   *
   * @param data (required)
   * @return MaterialLabelsDeleteResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public MaterialLabelsDeleteResponse materialLabelsDelete(
      MaterialLabelsDeleteRequest data, Pair... headerPair) throws ApiException {
    ApiResponse<MaterialLabelsDeleteResponse> resp =
        materialLabelsDeleteWithHttpInfo(data, headerPair);
    return resp.getData();
  }

  /**
   * 删除素材标签
   *
   * @param data (required)
   * @return ApiResponse&lt;MaterialLabelsDeleteResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<MaterialLabelsDeleteResponse> materialLabelsDeleteWithHttpInfo(
      MaterialLabelsDeleteRequest data, Pair... headerPair) throws ApiException {
    com.squareup.okhttp.Call call =
        materialLabelsDeleteValidateBeforeCall(data, null, null, headerPair);
    Type localVarReturnType = new TypeToken<MaterialLabelsDeleteResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 删除素材标签 (asynchronously)
   *
   * @param data (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call materialLabelsDeleteAsync(
      MaterialLabelsDeleteRequest data,
      final ApiCallback<MaterialLabelsDeleteResponse> callback,
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
        materialLabelsDeleteValidateBeforeCall(
            data, progressListener, progressRequestListener, headerPair);
    Type localVarReturnType = new TypeToken<MaterialLabelsDeleteResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  /**
   * Build call for materialLabelsGet
   *
   * @param accountId (required)
   * @param labelId (optional)
   * @param labelName (optional)
   * @param firstLabelLevelIdList 一级标签类目ID列表 (optional)
   * @param secondLabelLevelIdList 二级标签类目ID列表 (optional)
   * @param needCount (optional)
   * @param businessScenario (optional)
   * @param orderBy (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call materialLabelsGetCall(
      Long accountId,
      Long labelId,
      String labelName,
      List<Long> firstLabelLevelIdList,
      List<Long> secondLabelLevelIdList,
      Boolean needCount,
      String businessScenario,
      List<OrderByStruct> orderBy,
      Long page,
      Long pageSize,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/material_labels/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (accountId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("account_id", accountId));
    if (labelId != null) localVarQueryParams.addAll(apiClient.parameterToPair("label_id", labelId));
    if (labelName != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("label_name", labelName));
    if (firstLabelLevelIdList != null)
      localVarCollectionQueryParams.addAll(
          apiClient.parameterToPairs("multi", "first_label_level_id_list", firstLabelLevelIdList));
    if (secondLabelLevelIdList != null)
      localVarCollectionQueryParams.addAll(
          apiClient.parameterToPairs(
              "multi", "second_label_level_id_list", secondLabelLevelIdList));
    if (needCount != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("need_count", needCount));
    if (businessScenario != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("business_scenario", businessScenario));
    if (orderBy != null)
      localVarCollectionQueryParams.addAll(
          apiClient.parameterToPairs("multi", "order_by", orderBy));
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
  private com.squareup.okhttp.Call materialLabelsGetValidateBeforeCall(
      Long accountId,
      Long labelId,
      String labelName,
      List<Long> firstLabelLevelIdList,
      List<Long> secondLabelLevelIdList,
      Boolean needCount,
      String businessScenario,
      List<OrderByStruct> orderBy,
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
          "Missing the required parameter 'accountId' when calling materialLabelsGet(Async)");
    }

    com.squareup.okhttp.Call call =
        materialLabelsGetCall(
            accountId,
            labelId,
            labelName,
            firstLabelLevelIdList,
            secondLabelLevelIdList,
            needCount,
            businessScenario,
            orderBy,
            page,
            pageSize,
            fields,
            progressListener,
            progressRequestListener,
            headerPair);
    return call;
  }

  /**
   * 获取素材标签列表
   *
   * @param accountId (required)
   * @param labelId (optional)
   * @param labelName (optional)
   * @param firstLabelLevelIdList 一级标签类目ID列表 (optional)
   * @param secondLabelLevelIdList 二级标签类目ID列表 (optional)
   * @param needCount (optional)
   * @param businessScenario (optional)
   * @param orderBy (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return MaterialLabelsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public MaterialLabelsGetResponse materialLabelsGet(
      Long accountId,
      Long labelId,
      String labelName,
      List<Long> firstLabelLevelIdList,
      List<Long> secondLabelLevelIdList,
      Boolean needCount,
      String businessScenario,
      List<OrderByStruct> orderBy,
      Long page,
      Long pageSize,
      List<String> fields,
      Pair... headerPair)
      throws ApiException {
    ApiResponse<MaterialLabelsGetResponse> resp =
        materialLabelsGetWithHttpInfo(
            accountId,
            labelId,
            labelName,
            firstLabelLevelIdList,
            secondLabelLevelIdList,
            needCount,
            businessScenario,
            orderBy,
            page,
            pageSize,
            fields,
            headerPair);
    return resp.getData();
  }

  /**
   * 获取素材标签列表
   *
   * @param accountId (required)
   * @param labelId (optional)
   * @param labelName (optional)
   * @param firstLabelLevelIdList 一级标签类目ID列表 (optional)
   * @param secondLabelLevelIdList 二级标签类目ID列表 (optional)
   * @param needCount (optional)
   * @param businessScenario (optional)
   * @param orderBy (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;MaterialLabelsGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<MaterialLabelsGetResponse> materialLabelsGetWithHttpInfo(
      Long accountId,
      Long labelId,
      String labelName,
      List<Long> firstLabelLevelIdList,
      List<Long> secondLabelLevelIdList,
      Boolean needCount,
      String businessScenario,
      List<OrderByStruct> orderBy,
      Long page,
      Long pageSize,
      List<String> fields,
      Pair... headerPair)
      throws ApiException {
    com.squareup.okhttp.Call call =
        materialLabelsGetValidateBeforeCall(
            accountId,
            labelId,
            labelName,
            firstLabelLevelIdList,
            secondLabelLevelIdList,
            needCount,
            businessScenario,
            orderBy,
            page,
            pageSize,
            fields,
            null,
            null,
            headerPair);
    Type localVarReturnType = new TypeToken<MaterialLabelsGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 获取素材标签列表 (asynchronously)
   *
   * @param accountId (required)
   * @param labelId (optional)
   * @param labelName (optional)
   * @param firstLabelLevelIdList 一级标签类目ID列表 (optional)
   * @param secondLabelLevelIdList 二级标签类目ID列表 (optional)
   * @param needCount (optional)
   * @param businessScenario (optional)
   * @param orderBy (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call materialLabelsGetAsync(
      Long accountId,
      Long labelId,
      String labelName,
      List<Long> firstLabelLevelIdList,
      List<Long> secondLabelLevelIdList,
      Boolean needCount,
      String businessScenario,
      List<OrderByStruct> orderBy,
      Long page,
      Long pageSize,
      List<String> fields,
      final ApiCallback<MaterialLabelsGetResponse> callback,
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
        materialLabelsGetValidateBeforeCall(
            accountId,
            labelId,
            labelName,
            firstLabelLevelIdList,
            secondLabelLevelIdList,
            needCount,
            businessScenario,
            orderBy,
            page,
            pageSize,
            fields,
            progressListener,
            progressRequestListener,
            headerPair);
    Type localVarReturnType = new TypeToken<MaterialLabelsGetResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  /**
   * Build call for materialLabelsUpdate
   *
   * @param data (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call materialLabelsUpdateCall(
      MaterialLabelsUpdateRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    Object localVarPostBody = data;

    // create path and map variables
    String localVarPath = "/material_labels/update";

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
  private com.squareup.okhttp.Call materialLabelsUpdateValidateBeforeCall(
      MaterialLabelsUpdateRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(
          "Missing the required parameter 'data' when calling materialLabelsUpdate(Async)");
    }

    com.squareup.okhttp.Call call =
        materialLabelsUpdateCall(data, progressListener, progressRequestListener, headerPair);
    return call;
  }

  /**
   * 更新素材标签
   *
   * @param data (required)
   * @return MaterialLabelsUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public MaterialLabelsUpdateResponse materialLabelsUpdate(
      MaterialLabelsUpdateRequest data, Pair... headerPair) throws ApiException {
    ApiResponse<MaterialLabelsUpdateResponse> resp =
        materialLabelsUpdateWithHttpInfo(data, headerPair);
    return resp.getData();
  }

  /**
   * 更新素材标签
   *
   * @param data (required)
   * @return ApiResponse&lt;MaterialLabelsUpdateResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<MaterialLabelsUpdateResponse> materialLabelsUpdateWithHttpInfo(
      MaterialLabelsUpdateRequest data, Pair... headerPair) throws ApiException {
    com.squareup.okhttp.Call call =
        materialLabelsUpdateValidateBeforeCall(data, null, null, headerPair);
    Type localVarReturnType = new TypeToken<MaterialLabelsUpdateResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 更新素材标签 (asynchronously)
   *
   * @param data (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call materialLabelsUpdateAsync(
      MaterialLabelsUpdateRequest data,
      final ApiCallback<MaterialLabelsUpdateResponse> callback,
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
        materialLabelsUpdateValidateBeforeCall(
            data, progressListener, progressRequestListener, headerPair);
    Type localVarReturnType = new TypeToken<MaterialLabelsUpdateResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}

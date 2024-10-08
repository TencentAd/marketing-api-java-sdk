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
import com.tencent.ads.model.DynamicAdVideoAddRequest;
import com.tencent.ads.model.DynamicAdVideoAddResponse;
import com.tencent.ads.model.DynamicAdVideoGetResponse;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DynamicAdVideoApi {
  private ApiClient apiClient;

  public DynamicAdVideoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DynamicAdVideoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for dynamicAdVideoAdd
   *
   * @param data (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call dynamicAdVideoAddCall(
      DynamicAdVideoAddRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    Object localVarPostBody = data;

    // create path and map variables
    String localVarPath = "/dynamic_ad_video/add";

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
  private com.squareup.okhttp.Call dynamicAdVideoAddValidateBeforeCall(
      DynamicAdVideoAddRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(
          "Missing the required parameter 'data' when calling dynamicAdVideoAdd(Async)");
    }

    com.squareup.okhttp.Call call =
        dynamicAdVideoAddCall(data, progressListener, progressRequestListener, headerPair);
    return call;
  }

  /**
   * 创建用于广告投放的动态广告视频
   *
   * @param data (required)
   * @return DynamicAdVideoAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public DynamicAdVideoAddResponse dynamicAdVideoAdd(
      DynamicAdVideoAddRequest data, Pair... headerPair) throws ApiException {
    ApiResponse<DynamicAdVideoAddResponse> resp = dynamicAdVideoAddWithHttpInfo(data, headerPair);
    return resp.getData();
  }

  /**
   * 创建用于广告投放的动态广告视频
   *
   * @param data (required)
   * @return ApiResponse&lt;DynamicAdVideoAddResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<DynamicAdVideoAddResponse> dynamicAdVideoAddWithHttpInfo(
      DynamicAdVideoAddRequest data, Pair... headerPair) throws ApiException {
    com.squareup.okhttp.Call call =
        dynamicAdVideoAddValidateBeforeCall(data, null, null, headerPair);
    Type localVarReturnType = new TypeToken<DynamicAdVideoAddResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 创建用于广告投放的动态广告视频 (asynchronously)
   *
   * @param data (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call dynamicAdVideoAddAsync(
      DynamicAdVideoAddRequest data,
      final ApiCallback<DynamicAdVideoAddResponse> callback,
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
        dynamicAdVideoAddValidateBeforeCall(
            data, progressListener, progressRequestListener, headerPair);
    Type localVarReturnType = new TypeToken<DynamicAdVideoAddResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  /**
   * Build call for dynamicAdVideoGet
   *
   * @param accountId (required)
   * @param productCatalogId (required)
   * @param productMode (required)
   * @param productOuterId (required)
   * @param dynamicAdTemplateId (required)
   * @param fields 返回参数的字段列表 (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call dynamicAdVideoGetCall(
      Long accountId,
      Long productCatalogId,
      String productMode,
      String productOuterId,
      Long dynamicAdTemplateId,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/dynamic_ad_video/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (accountId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("account_id", accountId));
    if (productCatalogId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("product_catalog_id", productCatalogId));
    if (productMode != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("product_mode", productMode));
    if (productOuterId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("product_outer_id", productOuterId));
    if (dynamicAdTemplateId != null)
      localVarQueryParams.addAll(
          apiClient.parameterToPair("dynamic_ad_template_id", dynamicAdTemplateId));
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
  private com.squareup.okhttp.Call dynamicAdVideoGetValidateBeforeCall(
      Long accountId,
      Long productCatalogId,
      String productMode,
      String productOuterId,
      Long dynamicAdTemplateId,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling dynamicAdVideoGet(Async)");
    }

    // verify the required parameter 'productCatalogId' is set
    if (productCatalogId == null) {
      throw new ApiException(
          "Missing the required parameter 'productCatalogId' when calling dynamicAdVideoGet(Async)");
    }

    // verify the required parameter 'productMode' is set
    if (productMode == null) {
      throw new ApiException(
          "Missing the required parameter 'productMode' when calling dynamicAdVideoGet(Async)");
    }

    // verify the required parameter 'productOuterId' is set
    if (productOuterId == null) {
      throw new ApiException(
          "Missing the required parameter 'productOuterId' when calling dynamicAdVideoGet(Async)");
    }

    // verify the required parameter 'dynamicAdTemplateId' is set
    if (dynamicAdTemplateId == null) {
      throw new ApiException(
          "Missing the required parameter 'dynamicAdTemplateId' when calling dynamicAdVideoGet(Async)");
    }

    com.squareup.okhttp.Call call =
        dynamicAdVideoGetCall(
            accountId,
            productCatalogId,
            productMode,
            productOuterId,
            dynamicAdTemplateId,
            fields,
            progressListener,
            progressRequestListener,
            headerPair);
    return call;
  }

  /**
   * 获取广告投放的动态广告视频
   *
   * @param accountId (required)
   * @param productCatalogId (required)
   * @param productMode (required)
   * @param productOuterId (required)
   * @param dynamicAdTemplateId (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return DynamicAdVideoGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public DynamicAdVideoGetResponse dynamicAdVideoGet(
      Long accountId,
      Long productCatalogId,
      String productMode,
      String productOuterId,
      Long dynamicAdTemplateId,
      List<String> fields,
      Pair... headerPair)
      throws ApiException {
    ApiResponse<DynamicAdVideoGetResponse> resp =
        dynamicAdVideoGetWithHttpInfo(
            accountId,
            productCatalogId,
            productMode,
            productOuterId,
            dynamicAdTemplateId,
            fields,
            headerPair);
    return resp.getData();
  }

  /**
   * 获取广告投放的动态广告视频
   *
   * @param accountId (required)
   * @param productCatalogId (required)
   * @param productMode (required)
   * @param productOuterId (required)
   * @param dynamicAdTemplateId (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;DynamicAdVideoGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<DynamicAdVideoGetResponse> dynamicAdVideoGetWithHttpInfo(
      Long accountId,
      Long productCatalogId,
      String productMode,
      String productOuterId,
      Long dynamicAdTemplateId,
      List<String> fields,
      Pair... headerPair)
      throws ApiException {
    com.squareup.okhttp.Call call =
        dynamicAdVideoGetValidateBeforeCall(
            accountId,
            productCatalogId,
            productMode,
            productOuterId,
            dynamicAdTemplateId,
            fields,
            null,
            null,
            headerPair);
    Type localVarReturnType = new TypeToken<DynamicAdVideoGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 获取广告投放的动态广告视频 (asynchronously)
   *
   * @param accountId (required)
   * @param productCatalogId (required)
   * @param productMode (required)
   * @param productOuterId (required)
   * @param dynamicAdTemplateId (required)
   * @param fields 返回参数的字段列表 (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call dynamicAdVideoGetAsync(
      Long accountId,
      Long productCatalogId,
      String productMode,
      String productOuterId,
      Long dynamicAdTemplateId,
      List<String> fields,
      final ApiCallback<DynamicAdVideoGetResponse> callback,
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
        dynamicAdVideoGetValidateBeforeCall(
            accountId,
            productCatalogId,
            productMode,
            productOuterId,
            dynamicAdTemplateId,
            fields,
            progressListener,
            progressRequestListener,
            headerPair);
    Type localVarReturnType = new TypeToken<DynamicAdVideoGetResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}

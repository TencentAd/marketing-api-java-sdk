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
import com.tencent.ads.model.v3.WechatPagesCsgrouplistAddRequest;
import com.tencent.ads.model.v3.WechatPagesCsgrouplistAddResponse;
import com.tencent.ads.model.v3.WechatPagesCsgrouplistGetResponse;
import com.tencent.ads.model.v3.WechatPagesCsgrouplistUpdateRequest;
import com.tencent.ads.model.v3.WechatPagesCsgrouplistUpdateResponse;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WechatPagesCsgrouplistApi {
  private ApiClient apiClient;

  public WechatPagesCsgrouplistApi() {
    this(Configuration.getV3DefaultApiClient());
  }

  public WechatPagesCsgrouplistApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for wechatPagesCsgrouplistAdd
   *
   * @param data (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call wechatPagesCsgrouplistAddCall(
      WechatPagesCsgrouplistAddRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    Object localVarPostBody = data;

    // create path and map variables
    String localVarPath = "/wechat_pages_csgrouplist/add";

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
  private com.squareup.okhttp.Call wechatPagesCsgrouplistAddValidateBeforeCall(
      WechatPagesCsgrouplistAddRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(
          "Missing the required parameter 'data' when calling wechatPagesCsgrouplistAdd(Async)");
    }

    com.squareup.okhttp.Call call =
        wechatPagesCsgrouplistAddCall(data, progressListener, progressRequestListener, headerPair);
    return call;
  }

  /**
   * 增加企业微信组件客服组
   *
   * @param data (required)
   * @return WechatPagesCsgrouplistAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public WechatPagesCsgrouplistAddResponse wechatPagesCsgrouplistAdd(
      WechatPagesCsgrouplistAddRequest data, Pair... headerPair) throws ApiException {
    ApiResponse<WechatPagesCsgrouplistAddResponse> resp =
        wechatPagesCsgrouplistAddWithHttpInfo(data, headerPair);
    return resp.getData();
  }

  /**
   * 增加企业微信组件客服组
   *
   * @param data (required)
   * @return ApiResponse&lt;WechatPagesCsgrouplistAddResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<WechatPagesCsgrouplistAddResponse> wechatPagesCsgrouplistAddWithHttpInfo(
      WechatPagesCsgrouplistAddRequest data, Pair... headerPair) throws ApiException {
    com.squareup.okhttp.Call call =
        wechatPagesCsgrouplistAddValidateBeforeCall(data, null, null, headerPair);
    Type localVarReturnType = new TypeToken<WechatPagesCsgrouplistAddResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 增加企业微信组件客服组 (asynchronously)
   *
   * @param data (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call wechatPagesCsgrouplistAddAsync(
      WechatPagesCsgrouplistAddRequest data,
      final ApiCallback<WechatPagesCsgrouplistAddResponse> callback,
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
        wechatPagesCsgrouplistAddValidateBeforeCall(
            data, progressListener, progressRequestListener, headerPair);
    Type localVarReturnType = new TypeToken<WechatPagesCsgrouplistAddResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  /**
   * Build call for wechatPagesCsgrouplistGet
   *
   * @param accountId (required)
   * @param page (optional)
   * @param pageSize (optional)
   * @param corpId (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call wechatPagesCsgrouplistGetCall(
      Long accountId,
      Long page,
      Long pageSize,
      String corpId,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/wechat_pages_csgrouplist/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (accountId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("account_id", accountId));
    if (page != null) localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
    if (pageSize != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
    if (corpId != null) localVarQueryParams.addAll(apiClient.parameterToPair("corp_id", corpId));
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
  private com.squareup.okhttp.Call wechatPagesCsgrouplistGetValidateBeforeCall(
      Long accountId,
      Long page,
      Long pageSize,
      String corpId,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling wechatPagesCsgrouplistGet(Async)");
    }

    com.squareup.okhttp.Call call =
        wechatPagesCsgrouplistGetCall(
            accountId,
            page,
            pageSize,
            corpId,
            fields,
            progressListener,
            progressRequestListener,
            headerPair);
    return call;
  }

  /**
   * 获取企业微信客服组列表
   *
   * @param accountId (required)
   * @param page (optional)
   * @param pageSize (optional)
   * @param corpId (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return WechatPagesCsgrouplistGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public WechatPagesCsgrouplistGetResponse wechatPagesCsgrouplistGet(
      Long accountId,
      Long page,
      Long pageSize,
      String corpId,
      List<String> fields,
      Pair... headerPair)
      throws ApiException {
    ApiResponse<WechatPagesCsgrouplistGetResponse> resp =
        wechatPagesCsgrouplistGetWithHttpInfo(
            accountId, page, pageSize, corpId, fields, headerPair);
    return resp.getData();
  }

  /**
   * 获取企业微信客服组列表
   *
   * @param accountId (required)
   * @param page (optional)
   * @param pageSize (optional)
   * @param corpId (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;WechatPagesCsgrouplistGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<WechatPagesCsgrouplistGetResponse> wechatPagesCsgrouplistGetWithHttpInfo(
      Long accountId,
      Long page,
      Long pageSize,
      String corpId,
      List<String> fields,
      Pair... headerPair)
      throws ApiException {
    com.squareup.okhttp.Call call =
        wechatPagesCsgrouplistGetValidateBeforeCall(
            accountId, page, pageSize, corpId, fields, null, null, headerPair);
    Type localVarReturnType = new TypeToken<WechatPagesCsgrouplistGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 获取企业微信客服组列表 (asynchronously)
   *
   * @param accountId (required)
   * @param page (optional)
   * @param pageSize (optional)
   * @param corpId (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call wechatPagesCsgrouplistGetAsync(
      Long accountId,
      Long page,
      Long pageSize,
      String corpId,
      List<String> fields,
      final ApiCallback<WechatPagesCsgrouplistGetResponse> callback,
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
        wechatPagesCsgrouplistGetValidateBeforeCall(
            accountId,
            page,
            pageSize,
            corpId,
            fields,
            progressListener,
            progressRequestListener,
            headerPair);
    Type localVarReturnType = new TypeToken<WechatPagesCsgrouplistGetResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  /**
   * Build call for wechatPagesCsgrouplistUpdate
   *
   * @param data (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call wechatPagesCsgrouplistUpdateCall(
      WechatPagesCsgrouplistUpdateRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    Object localVarPostBody = data;

    // create path and map variables
    String localVarPath = "/wechat_pages_csgrouplist/update";

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
  private com.squareup.okhttp.Call wechatPagesCsgrouplistUpdateValidateBeforeCall(
      WechatPagesCsgrouplistUpdateRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(
          "Missing the required parameter 'data' when calling wechatPagesCsgrouplistUpdate(Async)");
    }

    com.squareup.okhttp.Call call =
        wechatPagesCsgrouplistUpdateCall(
            data, progressListener, progressRequestListener, headerPair);
    return call;
  }

  /**
   * 更新企业微信组件客服组
   *
   * @param data (required)
   * @return WechatPagesCsgrouplistUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public WechatPagesCsgrouplistUpdateResponse wechatPagesCsgrouplistUpdate(
      WechatPagesCsgrouplistUpdateRequest data, Pair... headerPair) throws ApiException {
    ApiResponse<WechatPagesCsgrouplistUpdateResponse> resp =
        wechatPagesCsgrouplistUpdateWithHttpInfo(data, headerPair);
    return resp.getData();
  }

  /**
   * 更新企业微信组件客服组
   *
   * @param data (required)
   * @return ApiResponse&lt;WechatPagesCsgrouplistUpdateResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<WechatPagesCsgrouplistUpdateResponse> wechatPagesCsgrouplistUpdateWithHttpInfo(
      WechatPagesCsgrouplistUpdateRequest data, Pair... headerPair) throws ApiException {
    com.squareup.okhttp.Call call =
        wechatPagesCsgrouplistUpdateValidateBeforeCall(data, null, null, headerPair);
    Type localVarReturnType = new TypeToken<WechatPagesCsgrouplistUpdateResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 更新企业微信组件客服组 (asynchronously)
   *
   * @param data (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call wechatPagesCsgrouplistUpdateAsync(
      WechatPagesCsgrouplistUpdateRequest data,
      final ApiCallback<WechatPagesCsgrouplistUpdateResponse> callback,
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
        wechatPagesCsgrouplistUpdateValidateBeforeCall(
            data, progressListener, progressRequestListener, headerPair);
    Type localVarReturnType = new TypeToken<WechatPagesCsgrouplistUpdateResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}

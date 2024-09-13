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
import com.tencent.ads.model.v3.RtaexpDataRoiGetRequest;
import com.tencent.ads.model.v3.RtaexpDataRoiGetResponse;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RtaexpDataRoiApi {
  private ApiClient apiClient;

  public RtaexpDataRoiApi() {
    this(Configuration.getV3DefaultApiClient());
  }

  public RtaexpDataRoiApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for rtaexpDataRoiGet
   *
   * @param data (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call rtaexpDataRoiGetCall(
      RtaexpDataRoiGetRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    Object localVarPostBody = data;

    // create path and map variables
    String localVarPath = "/rtaexp_data_roi/get";

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
  private com.squareup.okhttp.Call rtaexpDataRoiGetValidateBeforeCall(
      RtaexpDataRoiGetRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(
          "Missing the required parameter 'data' when calling rtaexpDataRoiGet(Async)");
    }

    com.squareup.okhttp.Call call =
        rtaexpDataRoiGetCall(data, progressListener, progressRequestListener, headerPair);
    return call;
  }

  /**
   * 实验数据查询
   *
   * @param data (required)
   * @return RtaexpDataRoiGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public RtaexpDataRoiGetResponse rtaexpDataRoiGet(RtaexpDataRoiGetRequest data, Pair... headerPair)
      throws ApiException {
    ApiResponse<RtaexpDataRoiGetResponse> resp = rtaexpDataRoiGetWithHttpInfo(data, headerPair);
    return resp.getData();
  }

  /**
   * 实验数据查询
   *
   * @param data (required)
   * @return ApiResponse&lt;RtaexpDataRoiGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<RtaexpDataRoiGetResponse> rtaexpDataRoiGetWithHttpInfo(
      RtaexpDataRoiGetRequest data, Pair... headerPair) throws ApiException {
    com.squareup.okhttp.Call call =
        rtaexpDataRoiGetValidateBeforeCall(data, null, null, headerPair);
    Type localVarReturnType = new TypeToken<RtaexpDataRoiGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 实验数据查询 (asynchronously)
   *
   * @param data (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call rtaexpDataRoiGetAsync(
      RtaexpDataRoiGetRequest data,
      final ApiCallback<RtaexpDataRoiGetResponse> callback,
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
        rtaexpDataRoiGetValidateBeforeCall(
            data, progressListener, progressRequestListener, headerPair);
    Type localVarReturnType = new TypeToken<RtaexpDataRoiGetResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}

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
import com.tencent.ads.model.v3.QualificationImagesAddResponse;
import com.tencent.ads.model.v3.QualificationImagesGetResponse;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QualificationImagesApi {
  private ApiClient apiClient;

  public QualificationImagesApi() {
    this(Configuration.getV3DefaultApiClient());
  }

  public QualificationImagesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for qualificationImagesAdd
   *
   * @param accountId (required)
   * @param signature (required)
   * @param file (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call qualificationImagesAddCall(
      Long accountId,
      String signature,
      File file,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/qualification_images/add";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    if (accountId != null) localVarFormParams.put("account_id", accountId);
    if (signature != null) localVarFormParams.put("signature", signature);
    if (file != null) localVarFormParams.put("file", file);

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {"multipart/form-data"};
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
  private com.squareup.okhttp.Call qualificationImagesAddValidateBeforeCall(
      Long accountId,
      String signature,
      File file,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling qualificationImagesAdd(Async)");
    }

    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(
          "Missing the required parameter 'signature' when calling qualificationImagesAdd(Async)");
    }

    // verify the required parameter 'file' is set
    if (file == null) {
      throw new ApiException(
          "Missing the required parameter 'file' when calling qualificationImagesAdd(Async)");
    }

    com.squareup.okhttp.Call call =
        qualificationImagesAddCall(
            accountId, signature, file, progressListener, progressRequestListener, headerPair);
    return call;
  }

  /**
   * @param accountId (required)
   * @param signature (required)
   * @param file (required)
   * @return QualificationImagesAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public QualificationImagesAddResponse qualificationImagesAdd(
      Long accountId, String signature, File file, Pair... headerPair) throws ApiException {
    ApiResponse<QualificationImagesAddResponse> resp =
        qualificationImagesAddWithHttpInfo(accountId, signature, file, headerPair);
    return resp.getData();
  }

  /**
   * @param accountId (required)
   * @param signature (required)
   * @param file (required)
   * @return ApiResponse&lt;QualificationImagesAddResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<QualificationImagesAddResponse> qualificationImagesAddWithHttpInfo(
      Long accountId, String signature, File file, Pair... headerPair) throws ApiException {
    com.squareup.okhttp.Call call =
        qualificationImagesAddValidateBeforeCall(
            accountId, signature, file, null, null, headerPair);
    Type localVarReturnType = new TypeToken<QualificationImagesAddResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * (asynchronously)
   *
   * @param accountId (required)
   * @param signature (required)
   * @param file (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call qualificationImagesAddAsync(
      Long accountId,
      String signature,
      File file,
      final ApiCallback<QualificationImagesAddResponse> callback,
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
        qualificationImagesAddValidateBeforeCall(
            accountId, signature, file, progressListener, progressRequestListener, headerPair);
    Type localVarReturnType = new TypeToken<QualificationImagesAddResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  /**
   * Build call for qualificationImagesGet
   *
   * @param accountId (required)
   * @param imageIds (required)
   * @param page (required)
   * @param pageSize (required)
   * @param fields 返回参数的字段列表 (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call qualificationImagesGetCall(
      Long accountId,
      List<String> imageIds,
      Long page,
      Long pageSize,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/qualification_images/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (accountId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("account_id", accountId));
    if (imageIds != null)
      localVarCollectionQueryParams.addAll(
          apiClient.parameterToPairs("multi", "image_ids", imageIds));
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
  private com.squareup.okhttp.Call qualificationImagesGetValidateBeforeCall(
      Long accountId,
      List<String> imageIds,
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
          "Missing the required parameter 'accountId' when calling qualificationImagesGet(Async)");
    }

    // verify the required parameter 'imageIds' is set
    if (imageIds == null) {
      throw new ApiException(
          "Missing the required parameter 'imageIds' when calling qualificationImagesGet(Async)");
    }

    // verify the required parameter 'page' is set
    if (page == null) {
      throw new ApiException(
          "Missing the required parameter 'page' when calling qualificationImagesGet(Async)");
    }

    // verify the required parameter 'pageSize' is set
    if (pageSize == null) {
      throw new ApiException(
          "Missing the required parameter 'pageSize' when calling qualificationImagesGet(Async)");
    }

    com.squareup.okhttp.Call call =
        qualificationImagesGetCall(
            accountId,
            imageIds,
            page,
            pageSize,
            fields,
            progressListener,
            progressRequestListener,
            headerPair);
    return call;
  }

  /**
   * @param accountId (required)
   * @param imageIds (required)
   * @param page (required)
   * @param pageSize (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return QualificationImagesGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public QualificationImagesGetResponse qualificationImagesGet(
      Long accountId,
      List<String> imageIds,
      Long page,
      Long pageSize,
      List<String> fields,
      Pair... headerPair)
      throws ApiException {
    ApiResponse<QualificationImagesGetResponse> resp =
        qualificationImagesGetWithHttpInfo(accountId, imageIds, page, pageSize, fields, headerPair);
    return resp.getData();
  }

  /**
   * @param accountId (required)
   * @param imageIds (required)
   * @param page (required)
   * @param pageSize (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;QualificationImagesGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<QualificationImagesGetResponse> qualificationImagesGetWithHttpInfo(
      Long accountId,
      List<String> imageIds,
      Long page,
      Long pageSize,
      List<String> fields,
      Pair... headerPair)
      throws ApiException {
    com.squareup.okhttp.Call call =
        qualificationImagesGetValidateBeforeCall(
            accountId, imageIds, page, pageSize, fields, null, null, headerPair);
    Type localVarReturnType = new TypeToken<QualificationImagesGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * (asynchronously)
   *
   * @param accountId (required)
   * @param imageIds (required)
   * @param page (required)
   * @param pageSize (required)
   * @param fields 返回参数的字段列表 (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call qualificationImagesGetAsync(
      Long accountId,
      List<String> imageIds,
      Long page,
      Long pageSize,
      List<String> fields,
      final ApiCallback<QualificationImagesGetResponse> callback,
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
        qualificationImagesGetValidateBeforeCall(
            accountId,
            imageIds,
            page,
            pageSize,
            fields,
            progressListener,
            progressRequestListener,
            headerPair);
    Type localVarReturnType = new TypeToken<QualificationImagesGetResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}

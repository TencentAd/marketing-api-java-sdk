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
import com.tencent.ads.model.v3.OauthTokenResponse;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OauthApi {
  private ApiClient apiClient;

  public OauthApi() {
    this(Configuration.getV3DefaultApiClient());
  }

  public OauthApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for oauthAuthorize
   *
   * @param clientId (required)
   * @param redirectUri (required)
   * @param state (optional)
   * @param scope (optional)
   * @param accountType (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call oauthAuthorizeCall(
      Long clientId,
      String redirectUri,
      String state,
      String scope,
      String accountType,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/oauth/authorize";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (clientId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("client_id", clientId));
    if (redirectUri != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("redirect_uri", redirectUri));
    if (state != null) localVarQueryParams.addAll(apiClient.parameterToPair("state", state));
    if (scope != null) localVarQueryParams.addAll(apiClient.parameterToPair("scope", scope));
    if (accountType != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("account_type", accountType));
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

    String[] localVarAuthNames = new String[] {};
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
  private com.squareup.okhttp.Call oauthAuthorizeValidateBeforeCall(
      Long clientId,
      String redirectUri,
      String state,
      String scope,
      String accountType,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(
          "Missing the required parameter 'clientId' when calling oauthAuthorize(Async)");
    }

    // verify the required parameter 'redirectUri' is set
    if (redirectUri == null) {
      throw new ApiException(
          "Missing the required parameter 'redirectUri' when calling oauthAuthorize(Async)");
    }

    com.squareup.okhttp.Call call =
        oauthAuthorizeCall(
            clientId,
            redirectUri,
            state,
            scope,
            accountType,
            fields,
            progressListener,
            progressRequestListener,
            headerPair);
    return call;
  }

  /**
   * 获取Authorization Code
   *
   * @param clientId (required)
   * @param redirectUri (required)
   * @param state (optional)
   * @param scope (optional)
   * @param accountType (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return String
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public String oauthAuthorize(
      Long clientId,
      String redirectUri,
      String state,
      String scope,
      String accountType,
      List<String> fields,
      Pair... headerPair)
      throws ApiException {
    ApiResponse<String> resp =
        oauthAuthorizeWithHttpInfo(
            clientId, redirectUri, state, scope, accountType, fields, headerPair);
    return resp.getData();
  }

  /**
   * 获取Authorization Code
   *
   * @param clientId (required)
   * @param redirectUri (required)
   * @param state (optional)
   * @param scope (optional)
   * @param accountType (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<String> oauthAuthorizeWithHttpInfo(
      Long clientId,
      String redirectUri,
      String state,
      String scope,
      String accountType,
      List<String> fields,
      Pair... headerPair)
      throws ApiException {
    com.squareup.okhttp.Call call =
        oauthAuthorizeValidateBeforeCall(
            clientId, redirectUri, state, scope, accountType, fields, null, null, headerPair);
    Type localVarReturnType = new TypeToken<String>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 获取Authorization Code (asynchronously)
   *
   * @param clientId (required)
   * @param redirectUri (required)
   * @param state (optional)
   * @param scope (optional)
   * @param accountType (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call oauthAuthorizeAsync(
      Long clientId,
      String redirectUri,
      String state,
      String scope,
      String accountType,
      List<String> fields,
      final ApiCallback<String> callback,
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
        oauthAuthorizeValidateBeforeCall(
            clientId,
            redirectUri,
            state,
            scope,
            accountType,
            fields,
            progressListener,
            progressRequestListener,
            headerPair);
    Type localVarReturnType = new TypeToken<String>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  /**
   * Build call for oauthToken
   *
   * @param clientId (required)
   * @param clientSecret (required)
   * @param grantType (required)
   * @param authorizationCode (optional)
   * @param refreshToken 当 grant_type&#x3D;refresh_token 时必填； (optional)
   * @param redirectUri (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call oauthTokenCall(
      Long clientId,
      String clientSecret,
      String grantType,
      String authorizationCode,
      String refreshToken,
      String redirectUri,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/oauth/token";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (clientId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("client_id", clientId));
    if (clientSecret != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("client_secret", clientSecret));
    if (grantType != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("grant_type", grantType));
    if (authorizationCode != null)
      localVarQueryParams.addAll(
          apiClient.parameterToPair("authorization_code", authorizationCode));
    if (refreshToken != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("refresh_token", refreshToken));
    if (redirectUri != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("redirect_uri", redirectUri));
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

    String[] localVarAuthNames = new String[] {};
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
  private com.squareup.okhttp.Call oauthTokenValidateBeforeCall(
      Long clientId,
      String clientSecret,
      String grantType,
      String authorizationCode,
      String refreshToken,
      String redirectUri,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(
          "Missing the required parameter 'clientId' when calling oauthToken(Async)");
    }

    // verify the required parameter 'clientSecret' is set
    if (clientSecret == null) {
      throw new ApiException(
          "Missing the required parameter 'clientSecret' when calling oauthToken(Async)");
    }

    // verify the required parameter 'grantType' is set
    if (grantType == null) {
      throw new ApiException(
          "Missing the required parameter 'grantType' when calling oauthToken(Async)");
    }

    com.squareup.okhttp.Call call =
        oauthTokenCall(
            clientId,
            clientSecret,
            grantType,
            authorizationCode,
            refreshToken,
            redirectUri,
            fields,
            progressListener,
            progressRequestListener,
            headerPair);
    return call;
  }

  /**
   * 通过Authorization Code获取Access Token或刷新Access Token
   *
   * @param clientId (required)
   * @param clientSecret (required)
   * @param grantType (required)
   * @param authorizationCode (optional)
   * @param refreshToken 当 grant_type&#x3D;refresh_token 时必填； (optional)
   * @param redirectUri (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return OauthTokenResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public OauthTokenResponse oauthToken(
      Long clientId,
      String clientSecret,
      String grantType,
      String authorizationCode,
      String refreshToken,
      String redirectUri,
      List<String> fields,
      Pair... headerPair)
      throws ApiException {
    ApiResponse<OauthTokenResponse> resp =
        oauthTokenWithHttpInfo(
            clientId,
            clientSecret,
            grantType,
            authorizationCode,
            refreshToken,
            redirectUri,
            fields,
            headerPair);
    return resp.getData();
  }

  /**
   * 通过Authorization Code获取Access Token或刷新Access Token
   *
   * @param clientId (required)
   * @param clientSecret (required)
   * @param grantType (required)
   * @param authorizationCode (optional)
   * @param refreshToken 当 grant_type&#x3D;refresh_token 时必填； (optional)
   * @param redirectUri (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;OauthTokenResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<OauthTokenResponse> oauthTokenWithHttpInfo(
      Long clientId,
      String clientSecret,
      String grantType,
      String authorizationCode,
      String refreshToken,
      String redirectUri,
      List<String> fields,
      Pair... headerPair)
      throws ApiException {
    com.squareup.okhttp.Call call =
        oauthTokenValidateBeforeCall(
            clientId,
            clientSecret,
            grantType,
            authorizationCode,
            refreshToken,
            redirectUri,
            fields,
            null,
            null,
            headerPair);
    Type localVarReturnType = new TypeToken<OauthTokenResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 通过Authorization Code获取Access Token或刷新Access Token (asynchronously)
   *
   * @param clientId (required)
   * @param clientSecret (required)
   * @param grantType (required)
   * @param authorizationCode (optional)
   * @param refreshToken 当 grant_type&#x3D;refresh_token 时必填； (optional)
   * @param redirectUri (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call oauthTokenAsync(
      Long clientId,
      String clientSecret,
      String grantType,
      String authorizationCode,
      String refreshToken,
      String redirectUri,
      List<String> fields,
      final ApiCallback<OauthTokenResponse> callback,
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
        oauthTokenValidateBeforeCall(
            clientId,
            clientSecret,
            grantType,
            authorizationCode,
            refreshToken,
            redirectUri,
            fields,
            progressListener,
            progressRequestListener,
            headerPair);
    Type localVarReturnType = new TypeToken<OauthTokenResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}

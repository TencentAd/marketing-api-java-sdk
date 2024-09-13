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
import com.tencent.ads.model.XijingPageInteractiveAddResponse;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class XijingPageInteractiveApi {
  private ApiClient apiClient;

  public XijingPageInteractiveApi() {
    this(Configuration.getDefaultApiClient());
  }

  public XijingPageInteractiveApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for xijingPageInteractiveAdd
   *
   * @param accountId (required)
   * @param isAutoSubmit (required)
   * @param pageType (required)
   * @param interactivePageType (required)
   * @param pageTitle (required)
   * @param pageName (required)
   * @param mobileAppId (required)
   * @param file (optional)
   * @param transformType (optional)
   * @param pageConfig (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call xijingPageInteractiveAddCall(
      Long accountId,
      Long isAutoSubmit,
      String pageType,
      String interactivePageType,
      String pageTitle,
      String pageName,
      String mobileAppId,
      File file,
      String transformType,
      String pageConfig,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/xijing_page_interactive/add";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    if (accountId != null) localVarFormParams.put("account_id", accountId);
    if (isAutoSubmit != null) localVarFormParams.put("is_auto_submit", isAutoSubmit);
    if (pageType != null) localVarFormParams.put("page_type", pageType);
    if (interactivePageType != null)
      localVarFormParams.put("interactive_page_type", interactivePageType);
    if (pageTitle != null) localVarFormParams.put("page_title", pageTitle);
    if (pageName != null) localVarFormParams.put("page_name", pageName);
    if (mobileAppId != null) localVarFormParams.put("mobile_app_id", mobileAppId);
    if (file != null) localVarFormParams.put("file", file);
    if (transformType != null) localVarFormParams.put("transform_type", transformType);
    if (pageConfig != null) localVarFormParams.put("page_config", pageConfig);

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
  private com.squareup.okhttp.Call xijingPageInteractiveAddValidateBeforeCall(
      Long accountId,
      Long isAutoSubmit,
      String pageType,
      String interactivePageType,
      String pageTitle,
      String pageName,
      String mobileAppId,
      File file,
      String transformType,
      String pageConfig,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      Pair... headerPair)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling xijingPageInteractiveAdd(Async)");
    }

    // verify the required parameter 'isAutoSubmit' is set
    if (isAutoSubmit == null) {
      throw new ApiException(
          "Missing the required parameter 'isAutoSubmit' when calling xijingPageInteractiveAdd(Async)");
    }

    // verify the required parameter 'pageType' is set
    if (pageType == null) {
      throw new ApiException(
          "Missing the required parameter 'pageType' when calling xijingPageInteractiveAdd(Async)");
    }

    // verify the required parameter 'interactivePageType' is set
    if (interactivePageType == null) {
      throw new ApiException(
          "Missing the required parameter 'interactivePageType' when calling xijingPageInteractiveAdd(Async)");
    }

    // verify the required parameter 'pageTitle' is set
    if (pageTitle == null) {
      throw new ApiException(
          "Missing the required parameter 'pageTitle' when calling xijingPageInteractiveAdd(Async)");
    }

    // verify the required parameter 'pageName' is set
    if (pageName == null) {
      throw new ApiException(
          "Missing the required parameter 'pageName' when calling xijingPageInteractiveAdd(Async)");
    }

    // verify the required parameter 'mobileAppId' is set
    if (mobileAppId == null) {
      throw new ApiException(
          "Missing the required parameter 'mobileAppId' when calling xijingPageInteractiveAdd(Async)");
    }

    com.squareup.okhttp.Call call =
        xijingPageInteractiveAddCall(
            accountId,
            isAutoSubmit,
            pageType,
            interactivePageType,
            pageTitle,
            pageName,
            mobileAppId,
            file,
            transformType,
            pageConfig,
            progressListener,
            progressRequestListener,
            headerPair);
    return call;
  }

  /**
   * 蹊径-创建互动落地页
   *
   * @param accountId (required)
   * @param isAutoSubmit (required)
   * @param pageType (required)
   * @param interactivePageType (required)
   * @param pageTitle (required)
   * @param pageName (required)
   * @param mobileAppId (required)
   * @param file (optional)
   * @param transformType (optional)
   * @param pageConfig (optional)
   * @return XijingPageInteractiveAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public XijingPageInteractiveAddResponse xijingPageInteractiveAdd(
      Long accountId,
      Long isAutoSubmit,
      String pageType,
      String interactivePageType,
      String pageTitle,
      String pageName,
      String mobileAppId,
      File file,
      String transformType,
      String pageConfig,
      Pair... headerPair)
      throws ApiException {
    ApiResponse<XijingPageInteractiveAddResponse> resp =
        xijingPageInteractiveAddWithHttpInfo(
            accountId,
            isAutoSubmit,
            pageType,
            interactivePageType,
            pageTitle,
            pageName,
            mobileAppId,
            file,
            transformType,
            pageConfig,
            headerPair);
    return resp.getData();
  }

  /**
   * 蹊径-创建互动落地页
   *
   * @param accountId (required)
   * @param isAutoSubmit (required)
   * @param pageType (required)
   * @param interactivePageType (required)
   * @param pageTitle (required)
   * @param pageName (required)
   * @param mobileAppId (required)
   * @param file (optional)
   * @param transformType (optional)
   * @param pageConfig (optional)
   * @return ApiResponse&lt;XijingPageInteractiveAddResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<XijingPageInteractiveAddResponse> xijingPageInteractiveAddWithHttpInfo(
      Long accountId,
      Long isAutoSubmit,
      String pageType,
      String interactivePageType,
      String pageTitle,
      String pageName,
      String mobileAppId,
      File file,
      String transformType,
      String pageConfig,
      Pair... headerPair)
      throws ApiException {
    com.squareup.okhttp.Call call =
        xijingPageInteractiveAddValidateBeforeCall(
            accountId,
            isAutoSubmit,
            pageType,
            interactivePageType,
            pageTitle,
            pageName,
            mobileAppId,
            file,
            transformType,
            pageConfig,
            null,
            null,
            headerPair);
    Type localVarReturnType = new TypeToken<XijingPageInteractiveAddResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 蹊径-创建互动落地页 (asynchronously)
   *
   * @param accountId (required)
   * @param isAutoSubmit (required)
   * @param pageType (required)
   * @param interactivePageType (required)
   * @param pageTitle (required)
   * @param pageName (required)
   * @param mobileAppId (required)
   * @param file (optional)
   * @param transformType (optional)
   * @param pageConfig (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call xijingPageInteractiveAddAsync(
      Long accountId,
      Long isAutoSubmit,
      String pageType,
      String interactivePageType,
      String pageTitle,
      String pageName,
      String mobileAppId,
      File file,
      String transformType,
      String pageConfig,
      final ApiCallback<XijingPageInteractiveAddResponse> callback,
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
        xijingPageInteractiveAddValidateBeforeCall(
            accountId,
            isAutoSubmit,
            pageType,
            interactivePageType,
            pageTitle,
            pageName,
            mobileAppId,
            file,
            transformType,
            pageConfig,
            progressListener,
            progressRequestListener,
            headerPair);
    Type localVarReturnType = new TypeToken<XijingPageInteractiveAddResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}

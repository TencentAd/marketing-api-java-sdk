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
import com.tencent.ads.model.v3.ProductItemsDetailGetResponse;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductItemsDetailApi {
  private ApiClient apiClient;

  public ProductItemsDetailApi() {
    this(Configuration.getV3DefaultApiClient());
  }

  public ProductItemsDetailApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for productItemsDetailGet
   *
   * @param accountId (required)
   * @param productCatalogId (required)
   * @param productOuterId (required)
   * @param fields 返回参数的字段列表 (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call productItemsDetailGetCall(
      Long accountId,
      Long productCatalogId,
      String productOuterId,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/product_items_detail/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (accountId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("account_id", accountId));
    if (productCatalogId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("product_catalog_id", productCatalogId));
    if (productOuterId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("product_outer_id", productOuterId));
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
  private com.squareup.okhttp.Call productItemsDetailGetValidateBeforeCall(
      Long accountId,
      Long productCatalogId,
      String productOuterId,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling productItemsDetailGet(Async)");
    }

    // verify the required parameter 'productCatalogId' is set
    if (productCatalogId == null) {
      throw new ApiException(
          "Missing the required parameter 'productCatalogId' when calling productItemsDetailGet(Async)");
    }

    // verify the required parameter 'productOuterId' is set
    if (productOuterId == null) {
      throw new ApiException(
          "Missing the required parameter 'productOuterId' when calling productItemsDetailGet(Async)");
    }

    com.squareup.okhttp.Call call =
        productItemsDetailGetCall(
            accountId,
            productCatalogId,
            productOuterId,
            fields,
            progressListener,
            progressRequestListener,
            headerPair);
    return call;
  }

  /**
   * 获取商品详情
   *
   * @param accountId (required)
   * @param productCatalogId (required)
   * @param productOuterId (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return ProductItemsDetailGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ProductItemsDetailGetResponse productItemsDetailGet(
      Long accountId,
      Long productCatalogId,
      String productOuterId,
      List<String> fields,
      String... headerPair)
      throws ApiException {
    ApiResponse<ProductItemsDetailGetResponse> resp =
        productItemsDetailGetWithHttpInfo(
            accountId, productCatalogId, productOuterId, fields, headerPair);
    return resp.getData();
  }

  /**
   * 获取商品详情
   *
   * @param accountId (required)
   * @param productCatalogId (required)
   * @param productOuterId (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;ProductItemsDetailGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<ProductItemsDetailGetResponse> productItemsDetailGetWithHttpInfo(
      Long accountId,
      Long productCatalogId,
      String productOuterId,
      List<String> fields,
      String... headerPair)
      throws ApiException {
    com.squareup.okhttp.Call call =
        productItemsDetailGetValidateBeforeCall(
            accountId, productCatalogId, productOuterId, fields, null, null, headerPair);
    Type localVarReturnType = new TypeToken<ProductItemsDetailGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 获取商品详情 (asynchronously)
   *
   * @param accountId (required)
   * @param productCatalogId (required)
   * @param productOuterId (required)
   * @param fields 返回参数的字段列表 (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call productItemsDetailGetAsync(
      Long accountId,
      Long productCatalogId,
      String productOuterId,
      List<String> fields,
      final ApiCallback<ProductItemsDetailGetResponse> callback,
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
        productItemsDetailGetValidateBeforeCall(
            accountId,
            productCatalogId,
            productOuterId,
            fields,
            progressListener,
            progressRequestListener,
            headerPair);
    Type localVarReturnType = new TypeToken<ProductItemsDetailGetResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}

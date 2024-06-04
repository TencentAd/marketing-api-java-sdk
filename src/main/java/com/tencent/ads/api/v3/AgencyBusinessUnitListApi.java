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
import com.tencent.ads.model.v3.AgencyBusinessUnitListGetResponse;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgencyBusinessUnitListApi {
  private ApiClient apiClient;

  public AgencyBusinessUnitListApi() {
    this(Configuration.getV3DefaultApiClient());
  }

  public AgencyBusinessUnitListApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for agencyBusinessUnitListGet
   *
   * @param page (required)
   * @param pageSize (required)
   * @param organizationId (optional)
   * @param businessUnitName (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call agencyBusinessUnitListGetCall(
      Long page,
      Long pageSize,
      Long organizationId,
      String businessUnitName,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/agency_business_unit_list/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (organizationId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("organization_id", organizationId));
    if (businessUnitName != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("business_unit_name", businessUnitName));
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
  private com.squareup.okhttp.Call agencyBusinessUnitListGetValidateBeforeCall(
      Long page,
      Long pageSize,
      Long organizationId,
      String businessUnitName,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener,
      String... headerPair)
      throws ApiException {

    // verify the required parameter 'page' is set
    if (page == null) {
      throw new ApiException(
          "Missing the required parameter 'page' when calling agencyBusinessUnitListGet(Async)");
    }

    // verify the required parameter 'pageSize' is set
    if (pageSize == null) {
      throw new ApiException(
          "Missing the required parameter 'pageSize' when calling agencyBusinessUnitListGet(Async)");
    }

    com.squareup.okhttp.Call call =
        agencyBusinessUnitListGetCall(
            page,
            pageSize,
            organizationId,
            businessUnitName,
            fields,
            progressListener,
            progressRequestListener,
            headerPair);
    return call;
  }

  /**
   * 查询服务商业务单元列表
   *
   * @param page (required)
   * @param pageSize (required)
   * @param organizationId (optional)
   * @param businessUnitName (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return AgencyBusinessUnitListGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public AgencyBusinessUnitListGetResponse agencyBusinessUnitListGet(
      Long page,
      Long pageSize,
      Long organizationId,
      String businessUnitName,
      List<String> fields,
      String... headerPair)
      throws ApiException {
    ApiResponse<AgencyBusinessUnitListGetResponse> resp =
        agencyBusinessUnitListGetWithHttpInfo(
            page, pageSize, organizationId, businessUnitName, fields, headerPair);
    return resp.getData();
  }

  /**
   * 查询服务商业务单元列表
   *
   * @param page (required)
   * @param pageSize (required)
   * @param organizationId (optional)
   * @param businessUnitName (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;AgencyBusinessUnitListGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<AgencyBusinessUnitListGetResponse> agencyBusinessUnitListGetWithHttpInfo(
      Long page,
      Long pageSize,
      Long organizationId,
      String businessUnitName,
      List<String> fields,
      String... headerPair)
      throws ApiException {
    com.squareup.okhttp.Call call =
        agencyBusinessUnitListGetValidateBeforeCall(
            page, pageSize, organizationId, businessUnitName, fields, null, null, headerPair);
    Type localVarReturnType = new TypeToken<AgencyBusinessUnitListGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 查询服务商业务单元列表 (asynchronously)
   *
   * @param page (required)
   * @param pageSize (required)
   * @param organizationId (optional)
   * @param businessUnitName (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call agencyBusinessUnitListGetAsync(
      Long page,
      Long pageSize,
      Long organizationId,
      String businessUnitName,
      List<String> fields,
      final ApiCallback<AgencyBusinessUnitListGetResponse> callback,
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
        agencyBusinessUnitListGetValidateBeforeCall(
            page,
            pageSize,
            organizationId,
            businessUnitName,
            fields,
            progressListener,
            progressRequestListener,
            headerPair);
    Type localVarReturnType = new TypeToken<AgencyBusinessUnitListGetResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}

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
import com.tencent.ads.model.WechatAdvertiserLocalBusinessAddResponse;
import com.tencent.ads.model.WechatAdvertiserLocalBusinessGetResponse;
import com.tencent.ads.model.WechatAdvertiserLocalBusinessUpdateResponse;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WechatAdvertiserLocalBusinessApi {
  private ApiClient apiClient;

  public WechatAdvertiserLocalBusinessApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WechatAdvertiserLocalBusinessApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for wechatAdvertiserLocalBusinessAdd
   *
   * @param headImage (required)
   * @param name (required)
   * @param description (required)
   * @param contactPerson (required)
   * @param contactPersonMobile (required)
   * @param contactPersonCardId (required)
   * @param corporation (required)
   * @param corporationLicence (required)
   * @param industryId (required)
   * @param businessId (required)
   * @param contactPersonTele (optional)
   * @param businessContent (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call wechatAdvertiserLocalBusinessAddCall(
      File headImage,
      String name,
      String description,
      String contactPerson,
      String contactPersonMobile,
      String contactPersonCardId,
      String corporation,
      String corporationLicence,
      Long industryId,
      String businessId,
      String contactPersonTele,
      String businessContent,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/wechat_advertiser_local_business/add";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    if (headImage != null) localVarFormParams.put("head_image", headImage);
    if (name != null) localVarFormParams.put("name", name);
    if (description != null) localVarFormParams.put("description", description);
    if (contactPerson != null) localVarFormParams.put("contact_person", contactPerson);
    if (contactPersonMobile != null)
      localVarFormParams.put("contact_person_mobile", contactPersonMobile);
    if (contactPersonCardId != null)
      localVarFormParams.put("contact_person_card_id", contactPersonCardId);
    if (contactPersonTele != null) localVarFormParams.put("contact_person_tele", contactPersonTele);
    if (corporation != null) localVarFormParams.put("corporation", corporation);
    if (corporationLicence != null)
      localVarFormParams.put("corporation_licence", corporationLicence);
    if (businessContent != null) localVarFormParams.put("business_content", businessContent);
    if (industryId != null) localVarFormParams.put("industry_id", industryId);
    if (businessId != null) localVarFormParams.put("business_id", businessId);

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {"multipart/form-data"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

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
  private com.squareup.okhttp.Call wechatAdvertiserLocalBusinessAddValidateBeforeCall(
      File headImage,
      String name,
      String description,
      String contactPerson,
      String contactPersonMobile,
      String contactPersonCardId,
      String corporation,
      String corporationLicence,
      Long industryId,
      String businessId,
      String contactPersonTele,
      String businessContent,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'headImage' is set
    if (headImage == null) {
      throw new ApiException(
          "Missing the required parameter 'headImage' when calling wechatAdvertiserLocalBusinessAdd(Async)");
    }

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling wechatAdvertiserLocalBusinessAdd(Async)");
    }

    // verify the required parameter 'description' is set
    if (description == null) {
      throw new ApiException(
          "Missing the required parameter 'description' when calling wechatAdvertiserLocalBusinessAdd(Async)");
    }

    // verify the required parameter 'contactPerson' is set
    if (contactPerson == null) {
      throw new ApiException(
          "Missing the required parameter 'contactPerson' when calling wechatAdvertiserLocalBusinessAdd(Async)");
    }

    // verify the required parameter 'contactPersonMobile' is set
    if (contactPersonMobile == null) {
      throw new ApiException(
          "Missing the required parameter 'contactPersonMobile' when calling wechatAdvertiserLocalBusinessAdd(Async)");
    }

    // verify the required parameter 'contactPersonCardId' is set
    if (contactPersonCardId == null) {
      throw new ApiException(
          "Missing the required parameter 'contactPersonCardId' when calling wechatAdvertiserLocalBusinessAdd(Async)");
    }

    // verify the required parameter 'corporation' is set
    if (corporation == null) {
      throw new ApiException(
          "Missing the required parameter 'corporation' when calling wechatAdvertiserLocalBusinessAdd(Async)");
    }

    // verify the required parameter 'corporationLicence' is set
    if (corporationLicence == null) {
      throw new ApiException(
          "Missing the required parameter 'corporationLicence' when calling wechatAdvertiserLocalBusinessAdd(Async)");
    }

    // verify the required parameter 'industryId' is set
    if (industryId == null) {
      throw new ApiException(
          "Missing the required parameter 'industryId' when calling wechatAdvertiserLocalBusinessAdd(Async)");
    }

    // verify the required parameter 'businessId' is set
    if (businessId == null) {
      throw new ApiException(
          "Missing the required parameter 'businessId' when calling wechatAdvertiserLocalBusinessAdd(Async)");
    }

    com.squareup.okhttp.Call call =
        wechatAdvertiserLocalBusinessAddCall(
            headImage,
            name,
            description,
            contactPerson,
            contactPersonMobile,
            contactPersonCardId,
            corporation,
            corporationLicence,
            industryId,
            businessId,
            contactPersonTele,
            businessContent,
            progressListener,
            progressRequestListener);
    return call;
  }

  /**
   * 附近推商家开户
   *
   * @param headImage (required)
   * @param name (required)
   * @param description (required)
   * @param contactPerson (required)
   * @param contactPersonMobile (required)
   * @param contactPersonCardId (required)
   * @param corporation (required)
   * @param corporationLicence (required)
   * @param industryId (required)
   * @param businessId (required)
   * @param contactPersonTele (optional)
   * @param businessContent (optional)
   * @return WechatAdvertiserLocalBusinessAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public WechatAdvertiserLocalBusinessAddResponse wechatAdvertiserLocalBusinessAdd(
      File headImage,
      String name,
      String description,
      String contactPerson,
      String contactPersonMobile,
      String contactPersonCardId,
      String corporation,
      String corporationLicence,
      Long industryId,
      String businessId,
      String contactPersonTele,
      String businessContent)
      throws ApiException {
    ApiResponse<WechatAdvertiserLocalBusinessAddResponse> resp =
        wechatAdvertiserLocalBusinessAddWithHttpInfo(
            headImage,
            name,
            description,
            contactPerson,
            contactPersonMobile,
            contactPersonCardId,
            corporation,
            corporationLicence,
            industryId,
            businessId,
            contactPersonTele,
            businessContent);
    return resp.getData();
  }

  /**
   * 附近推商家开户
   *
   * @param headImage (required)
   * @param name (required)
   * @param description (required)
   * @param contactPerson (required)
   * @param contactPersonMobile (required)
   * @param contactPersonCardId (required)
   * @param corporation (required)
   * @param corporationLicence (required)
   * @param industryId (required)
   * @param businessId (required)
   * @param contactPersonTele (optional)
   * @param businessContent (optional)
   * @return ApiResponse&lt;WechatAdvertiserLocalBusinessAddResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<WechatAdvertiserLocalBusinessAddResponse>
      wechatAdvertiserLocalBusinessAddWithHttpInfo(
          File headImage,
          String name,
          String description,
          String contactPerson,
          String contactPersonMobile,
          String contactPersonCardId,
          String corporation,
          String corporationLicence,
          Long industryId,
          String businessId,
          String contactPersonTele,
          String businessContent)
          throws ApiException {
    com.squareup.okhttp.Call call =
        wechatAdvertiserLocalBusinessAddValidateBeforeCall(
            headImage,
            name,
            description,
            contactPerson,
            contactPersonMobile,
            contactPersonCardId,
            corporation,
            corporationLicence,
            industryId,
            businessId,
            contactPersonTele,
            businessContent,
            null,
            null);
    Type localVarReturnType =
        new TypeToken<WechatAdvertiserLocalBusinessAddResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 附近推商家开户 (asynchronously)
   *
   * @param headImage (required)
   * @param name (required)
   * @param description (required)
   * @param contactPerson (required)
   * @param contactPersonMobile (required)
   * @param contactPersonCardId (required)
   * @param corporation (required)
   * @param corporationLicence (required)
   * @param industryId (required)
   * @param businessId (required)
   * @param contactPersonTele (optional)
   * @param businessContent (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call wechatAdvertiserLocalBusinessAddAsync(
      File headImage,
      String name,
      String description,
      String contactPerson,
      String contactPersonMobile,
      String contactPersonCardId,
      String corporation,
      String corporationLicence,
      Long industryId,
      String businessId,
      String contactPersonTele,
      String businessContent,
      final ApiCallback<WechatAdvertiserLocalBusinessAddResponse> callback)
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
        wechatAdvertiserLocalBusinessAddValidateBeforeCall(
            headImage,
            name,
            description,
            contactPerson,
            contactPersonMobile,
            contactPersonCardId,
            corporation,
            corporationLicence,
            industryId,
            businessId,
            contactPersonTele,
            businessContent,
            progressListener,
            progressRequestListener);
    Type localVarReturnType =
        new TypeToken<WechatAdvertiserLocalBusinessAddResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  /**
   * Build call for wechatAdvertiserLocalBusinessGet
   *
   * @param accountId (required)
   * @param fields 返回参数的字段列表 (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call wechatAdvertiserLocalBusinessGetCall(
      Long accountId,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/wechat_advertiser_local_business/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (accountId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("account_id", accountId));
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
  private com.squareup.okhttp.Call wechatAdvertiserLocalBusinessGetValidateBeforeCall(
      Long accountId,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling wechatAdvertiserLocalBusinessGet(Async)");
    }

    com.squareup.okhttp.Call call =
        wechatAdvertiserLocalBusinessGetCall(
            accountId, fields, progressListener, progressRequestListener);
    return call;
  }

  /**
   * 查询附近推商家信息
   *
   * @param accountId (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return WechatAdvertiserLocalBusinessGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public WechatAdvertiserLocalBusinessGetResponse wechatAdvertiserLocalBusinessGet(
      Long accountId, List<String> fields) throws ApiException {
    ApiResponse<WechatAdvertiserLocalBusinessGetResponse> resp =
        wechatAdvertiserLocalBusinessGetWithHttpInfo(accountId, fields);
    return resp.getData();
  }

  /**
   * 查询附近推商家信息
   *
   * @param accountId (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;WechatAdvertiserLocalBusinessGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<WechatAdvertiserLocalBusinessGetResponse>
      wechatAdvertiserLocalBusinessGetWithHttpInfo(Long accountId, List<String> fields)
          throws ApiException {
    com.squareup.okhttp.Call call =
        wechatAdvertiserLocalBusinessGetValidateBeforeCall(accountId, fields, null, null);
    Type localVarReturnType =
        new TypeToken<WechatAdvertiserLocalBusinessGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 查询附近推商家信息 (asynchronously)
   *
   * @param accountId (required)
   * @param fields 返回参数的字段列表 (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call wechatAdvertiserLocalBusinessGetAsync(
      Long accountId,
      List<String> fields,
      final ApiCallback<WechatAdvertiserLocalBusinessGetResponse> callback)
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
        wechatAdvertiserLocalBusinessGetValidateBeforeCall(
            accountId, fields, progressListener, progressRequestListener);
    Type localVarReturnType =
        new TypeToken<WechatAdvertiserLocalBusinessGetResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  /**
   * Build call for wechatAdvertiserLocalBusinessUpdate
   *
   * @param headImage (required)
   * @param name (required)
   * @param description (required)
   * @param contactPerson (required)
   * @param contactPersonMobile (required)
   * @param contactPersonCardId (required)
   * @param corporation (required)
   * @param corporationLicence (required)
   * @param industryId (required)
   * @param accountId (required)
   * @param contactPersonTele (optional)
   * @param businessContent (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call wechatAdvertiserLocalBusinessUpdateCall(
      File headImage,
      String name,
      String description,
      String contactPerson,
      String contactPersonMobile,
      String contactPersonCardId,
      String corporation,
      String corporationLicence,
      Long industryId,
      Long accountId,
      String contactPersonTele,
      String businessContent,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/wechat_advertiser_local_business/update";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    if (headImage != null) localVarFormParams.put("head_image", headImage);
    if (name != null) localVarFormParams.put("name", name);
    if (description != null) localVarFormParams.put("description", description);
    if (contactPerson != null) localVarFormParams.put("contact_person", contactPerson);
    if (contactPersonMobile != null)
      localVarFormParams.put("contact_person_mobile", contactPersonMobile);
    if (contactPersonCardId != null)
      localVarFormParams.put("contact_person_card_id", contactPersonCardId);
    if (contactPersonTele != null) localVarFormParams.put("contact_person_tele", contactPersonTele);
    if (corporation != null) localVarFormParams.put("corporation", corporation);
    if (corporationLicence != null)
      localVarFormParams.put("corporation_licence", corporationLicence);
    if (businessContent != null) localVarFormParams.put("business_content", businessContent);
    if (industryId != null) localVarFormParams.put("industry_id", industryId);
    if (accountId != null) localVarFormParams.put("account_id", accountId);

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {"multipart/form-data"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

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
  private com.squareup.okhttp.Call wechatAdvertiserLocalBusinessUpdateValidateBeforeCall(
      File headImage,
      String name,
      String description,
      String contactPerson,
      String contactPersonMobile,
      String contactPersonCardId,
      String corporation,
      String corporationLicence,
      Long industryId,
      Long accountId,
      String contactPersonTele,
      String businessContent,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'headImage' is set
    if (headImage == null) {
      throw new ApiException(
          "Missing the required parameter 'headImage' when calling wechatAdvertiserLocalBusinessUpdate(Async)");
    }

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling wechatAdvertiserLocalBusinessUpdate(Async)");
    }

    // verify the required parameter 'description' is set
    if (description == null) {
      throw new ApiException(
          "Missing the required parameter 'description' when calling wechatAdvertiserLocalBusinessUpdate(Async)");
    }

    // verify the required parameter 'contactPerson' is set
    if (contactPerson == null) {
      throw new ApiException(
          "Missing the required parameter 'contactPerson' when calling wechatAdvertiserLocalBusinessUpdate(Async)");
    }

    // verify the required parameter 'contactPersonMobile' is set
    if (contactPersonMobile == null) {
      throw new ApiException(
          "Missing the required parameter 'contactPersonMobile' when calling wechatAdvertiserLocalBusinessUpdate(Async)");
    }

    // verify the required parameter 'contactPersonCardId' is set
    if (contactPersonCardId == null) {
      throw new ApiException(
          "Missing the required parameter 'contactPersonCardId' when calling wechatAdvertiserLocalBusinessUpdate(Async)");
    }

    // verify the required parameter 'corporation' is set
    if (corporation == null) {
      throw new ApiException(
          "Missing the required parameter 'corporation' when calling wechatAdvertiserLocalBusinessUpdate(Async)");
    }

    // verify the required parameter 'corporationLicence' is set
    if (corporationLicence == null) {
      throw new ApiException(
          "Missing the required parameter 'corporationLicence' when calling wechatAdvertiserLocalBusinessUpdate(Async)");
    }

    // verify the required parameter 'industryId' is set
    if (industryId == null) {
      throw new ApiException(
          "Missing the required parameter 'industryId' when calling wechatAdvertiserLocalBusinessUpdate(Async)");
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling wechatAdvertiserLocalBusinessUpdate(Async)");
    }

    com.squareup.okhttp.Call call =
        wechatAdvertiserLocalBusinessUpdateCall(
            headImage,
            name,
            description,
            contactPerson,
            contactPersonMobile,
            contactPersonCardId,
            corporation,
            corporationLicence,
            industryId,
            accountId,
            contactPersonTele,
            businessContent,
            progressListener,
            progressRequestListener);
    return call;
  }

  /**
   * 更新附近推商家信息
   *
   * @param headImage (required)
   * @param name (required)
   * @param description (required)
   * @param contactPerson (required)
   * @param contactPersonMobile (required)
   * @param contactPersonCardId (required)
   * @param corporation (required)
   * @param corporationLicence (required)
   * @param industryId (required)
   * @param accountId (required)
   * @param contactPersonTele (optional)
   * @param businessContent (optional)
   * @return WechatAdvertiserLocalBusinessUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public WechatAdvertiserLocalBusinessUpdateResponse wechatAdvertiserLocalBusinessUpdate(
      File headImage,
      String name,
      String description,
      String contactPerson,
      String contactPersonMobile,
      String contactPersonCardId,
      String corporation,
      String corporationLicence,
      Long industryId,
      Long accountId,
      String contactPersonTele,
      String businessContent)
      throws ApiException {
    ApiResponse<WechatAdvertiserLocalBusinessUpdateResponse> resp =
        wechatAdvertiserLocalBusinessUpdateWithHttpInfo(
            headImage,
            name,
            description,
            contactPerson,
            contactPersonMobile,
            contactPersonCardId,
            corporation,
            corporationLicence,
            industryId,
            accountId,
            contactPersonTele,
            businessContent);
    return resp.getData();
  }

  /**
   * 更新附近推商家信息
   *
   * @param headImage (required)
   * @param name (required)
   * @param description (required)
   * @param contactPerson (required)
   * @param contactPersonMobile (required)
   * @param contactPersonCardId (required)
   * @param corporation (required)
   * @param corporationLicence (required)
   * @param industryId (required)
   * @param accountId (required)
   * @param contactPersonTele (optional)
   * @param businessContent (optional)
   * @return ApiResponse&lt;WechatAdvertiserLocalBusinessUpdateResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<WechatAdvertiserLocalBusinessUpdateResponse>
      wechatAdvertiserLocalBusinessUpdateWithHttpInfo(
          File headImage,
          String name,
          String description,
          String contactPerson,
          String contactPersonMobile,
          String contactPersonCardId,
          String corporation,
          String corporationLicence,
          Long industryId,
          Long accountId,
          String contactPersonTele,
          String businessContent)
          throws ApiException {
    com.squareup.okhttp.Call call =
        wechatAdvertiserLocalBusinessUpdateValidateBeforeCall(
            headImage,
            name,
            description,
            contactPerson,
            contactPersonMobile,
            contactPersonCardId,
            corporation,
            corporationLicence,
            industryId,
            accountId,
            contactPersonTele,
            businessContent,
            null,
            null);
    Type localVarReturnType =
        new TypeToken<WechatAdvertiserLocalBusinessUpdateResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 更新附近推商家信息 (asynchronously)
   *
   * @param headImage (required)
   * @param name (required)
   * @param description (required)
   * @param contactPerson (required)
   * @param contactPersonMobile (required)
   * @param contactPersonCardId (required)
   * @param corporation (required)
   * @param corporationLicence (required)
   * @param industryId (required)
   * @param accountId (required)
   * @param contactPersonTele (optional)
   * @param businessContent (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call wechatAdvertiserLocalBusinessUpdateAsync(
      File headImage,
      String name,
      String description,
      String contactPerson,
      String contactPersonMobile,
      String contactPersonCardId,
      String corporation,
      String corporationLicence,
      Long industryId,
      Long accountId,
      String contactPersonTele,
      String businessContent,
      final ApiCallback<WechatAdvertiserLocalBusinessUpdateResponse> callback)
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
        wechatAdvertiserLocalBusinessUpdateValidateBeforeCall(
            headImage,
            name,
            description,
            contactPerson,
            contactPersonMobile,
            contactPersonCardId,
            corporation,
            corporationLicence,
            industryId,
            accountId,
            contactPersonTele,
            businessContent,
            progressListener,
            progressRequestListener);
    Type localVarReturnType =
        new TypeToken<WechatAdvertiserLocalBusinessUpdateResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}

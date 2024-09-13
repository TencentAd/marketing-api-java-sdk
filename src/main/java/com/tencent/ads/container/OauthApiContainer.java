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

package com.tencent.ads.container;

import com.google.inject.Inject;
import com.tencent.ads.ApiContainer;
import com.tencent.ads.ApiException;
import com.tencent.ads.Pair;
import com.tencent.ads.anno.*;
import com.tencent.ads.api.OauthApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.OauthTokenResponse;
import com.tencent.ads.model.OauthTokenResponseData;
import java.util.List;

@NeedDiffHost
public class OauthApiContainer extends ApiContainer {

  @Inject OauthApi api;

  /**
   * 获取Authorization Code
   *
   * @param clientId (required)
   * @param redirectUri (required)
   * @param state (optional)
   * @param scope (optional)
   * @param accountType (optional)
   * @param accountDisplayNumber (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return String
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  @NeedDiffHost
  public String oauthAuthorize(
      Long clientId,
      String redirectUri,
      String state,
      String scope,
      String accountType,
      Long accountDisplayNumber,
      List<String> fields,
      Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    String resp =
        api.oauthAuthorize(
            clientId,
            redirectUri,
            state,
            scope,
            accountType,
            accountDisplayNumber,
            fields,
            headerPair);

    return resp;
  }

  /**
   * 通过Authorization Code获取Access Token或刷新Access Token
   *
   * @param clientId (required)
   * @param clientSecret (required)
   * @param grantType (required)
   * @param authorizationCode (optional)
   * @param refreshToken (optional)
   * @param redirectUri 应用回调地址，当 grant_type&#x3D;authorization_code时，redirect_uri 为必传参数，仅支持 http 和
   *     https，不支持指定端口号，且传入的地址需要与获取authorization_code时，传入的回调地址保持一致 (optional)
   * @return OauthTokenResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  @NeedDiffHost
  public OauthTokenResponseData oauthToken(
      Long clientId,
      String clientSecret,
      String grantType,
      String authorizationCode,
      String refreshToken,
      String redirectUri,
      Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    OauthTokenResponse resp =
        api.oauthToken(
            clientId,
            clientSecret,
            grantType,
            authorizationCode,
            refreshToken,
            redirectUri,
            headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

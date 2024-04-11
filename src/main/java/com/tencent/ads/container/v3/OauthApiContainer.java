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

package com.tencent.ads.container.v3;

import com.google.inject.Inject;
import com.tencent.ads.ApiContainer;
import com.tencent.ads.ApiException;
import com.tencent.ads.anno.*;
import com.tencent.ads.api.v3.OauthApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.OauthTokenResponse;
import com.tencent.ads.model.v3.OauthTokenResponseData;
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
      List<String> fields,
      String... headerPair)
      throws ApiException, TencentAdsResponseException {
    String resp =
        api.oauthAuthorize(clientId, redirectUri, state, scope, accountType, fields, headerPair);

    return resp;
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
  @NeedDiffHost
  public OauthTokenResponseData oauthToken(
      Long clientId,
      String clientSecret,
      String grantType,
      String authorizationCode,
      String refreshToken,
      String redirectUri,
      List<String> fields,
      String... headerPair)
      throws ApiException, TencentAdsResponseException {
    OauthTokenResponse resp =
        api.oauthToken(
            clientId,
            clientSecret,
            grantType,
            authorizationCode,
            refreshToken,
            redirectUri,
            fields,
            headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
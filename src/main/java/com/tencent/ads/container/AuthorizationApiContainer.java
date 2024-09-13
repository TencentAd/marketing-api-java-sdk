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
import com.tencent.ads.api.AuthorizationApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import java.util.List;

@NeedDiffHost
public class AuthorizationApiContainer extends ApiContainer {

  @Inject AuthorizationApi api;

  /**
   * 绑定微信公众号(待废弃)
   *
   * @param accessToken (required)
   * @param redirectUri (required)
   * @param accountId 需绑定公众号的广告主 id，有操作权限的帐号 id (optional)
   * @param wechatAccountId 微信公众号id，用于判断扫描的公众号与请求时的wechat_account_id是否一致 (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return String
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  @NeedDiffHost
  public String authorizationWechatBind(
      String accessToken,
      String redirectUri,
      Long accountId,
      String wechatAccountId,
      List<String> fields,
      Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    String resp =
        api.authorizationWechatBind(
            accessToken, redirectUri, accountId, wechatAccountId, fields, headerPair);

    return resp;
  }
}

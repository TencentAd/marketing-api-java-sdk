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
import com.tencent.ads.anno.*;
import com.tencent.ads.api.WechatPagesCustomApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.WechatPagesCustomAddRequest;
import com.tencent.ads.model.WechatPagesCustomAddResponse;
import com.tencent.ads.model.WechatPagesCustomAddResponseData;

public class WechatPagesCustomApiContainer extends ApiContainer {

  @Inject WechatPagesCustomApi api;

  /**
   * 基于组件创建微信原生页
   *
   * @param data (required)
   * @return WechatPagesCustomAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public WechatPagesCustomAddResponseData wechatPagesCustomAdd(WechatPagesCustomAddRequest data)
      throws ApiException, TencentAdsResponseException {
    WechatPagesCustomAddResponse resp = api.wechatPagesCustomAdd(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

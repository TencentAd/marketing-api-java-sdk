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
import com.tencent.ads.Pair;
import com.tencent.ads.anno.*;
import com.tencent.ads.api.v3.WechatChannelsAdAccountWechatBindingApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.WechatChannelsAdAccountWechatBindingAddRequest;
import com.tencent.ads.model.v3.WechatChannelsAdAccountWechatBindingAddResponse;
import com.tencent.ads.model.v3.WechatChannelsAdAccountWechatBindingAddResponseData;
import com.tencent.ads.model.v3.WechatChannelsAdAccountWechatBindingGetResponse;
import com.tencent.ads.model.v3.WechatChannelsAdAccountWechatBindingGetResponseData;
import java.util.List;

public class WechatChannelsAdAccountWechatBindingApiContainer extends ApiContainer {

  @Inject WechatChannelsAdAccountWechatBindingApi api;

  /**
   * 视频号开户绑定微信号
   *
   * @param data (required)
   * @return WechatChannelsAdAccountWechatBindingAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public WechatChannelsAdAccountWechatBindingAddResponseData
      wechatChannelsAdAccountWechatBindingAdd(
          WechatChannelsAdAccountWechatBindingAddRequest data, Pair... headerPair)
          throws ApiException, TencentAdsResponseException {
    WechatChannelsAdAccountWechatBindingAddResponse resp =
        api.wechatChannelsAdAccountWechatBindingAdd(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 视频号开户绑定微信状态查询
   *
   * @param accountId (required)
   * @param wechatBindAuthToken (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return WechatChannelsAdAccountWechatBindingGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public WechatChannelsAdAccountWechatBindingGetResponseData
      wechatChannelsAdAccountWechatBindingGet(
          Long accountId, String wechatBindAuthToken, List<String> fields, Pair... headerPair)
          throws ApiException, TencentAdsResponseException {
    WechatChannelsAdAccountWechatBindingGetResponse resp =
        api.wechatChannelsAdAccountWechatBindingGet(
            accountId, wechatBindAuthToken, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

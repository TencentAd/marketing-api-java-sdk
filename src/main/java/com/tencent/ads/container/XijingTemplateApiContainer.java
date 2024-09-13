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
import com.tencent.ads.api.XijingTemplateApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.XijingTemplateGetResponse;
import com.tencent.ads.model.XijingTemplateGetResponseData;
import java.util.List;

public class XijingTemplateApiContainer extends ApiContainer {

  @Inject XijingTemplateApi api;

  /**
   * 获取蹊径落地页模板
   *
   * @param accountId (required)
   * @param templateId (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return XijingTemplateGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public XijingTemplateGetResponseData xijingTemplateGet(
      Long accountId, String templateId, List<String> fields, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    XijingTemplateGetResponse resp =
        api.xijingTemplateGet(accountId, templateId, fields, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

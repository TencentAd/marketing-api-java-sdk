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
import com.tencent.ads.api.v3.ProgrammedCommponentPreviewTemplateApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.ProgrammedCommponentPreviewTemplateUpdateRequest;
import com.tencent.ads.model.v3.ProgrammedCommponentPreviewTemplateUpdateResponse;
import com.tencent.ads.model.v3.ProgrammedCommponentPreviewTemplateUpdateResponseData;

public class ProgrammedCommponentPreviewTemplateApiContainer extends ApiContainer {

  @Inject ProgrammedCommponentPreviewTemplateApi api;

  /**
   * 组件化创意衍生预览模版替换接口
   *
   * @param data (required)
   * @return ProgrammedCommponentPreviewTemplateUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ProgrammedCommponentPreviewTemplateUpdateResponseData
      programmedCommponentPreviewTemplateUpdate(
          ProgrammedCommponentPreviewTemplateUpdateRequest data, Pair... headerPair)
          throws ApiException, TencentAdsResponseException {
    ProgrammedCommponentPreviewTemplateUpdateResponse resp =
        api.programmedCommponentPreviewTemplateUpdate(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

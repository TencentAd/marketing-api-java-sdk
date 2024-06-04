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
import com.tencent.ads.api.v3.AgencyBusinessUnitApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.v3.AgencyBusinessUnitAddRequest;
import com.tencent.ads.model.v3.AgencyBusinessUnitAddResponse;
import com.tencent.ads.model.v3.AgencyBusinessUnitAddResponseData;
import com.tencent.ads.model.v3.AgencyBusinessUnitUpdateRequest;
import com.tencent.ads.model.v3.AgencyBusinessUnitUpdateResponse;
import com.tencent.ads.model.v3.AgencyBusinessUnitUpdateResponseData;

public class AgencyBusinessUnitApiContainer extends ApiContainer {

  @Inject AgencyBusinessUnitApi api;

  /**
   * 创建服务商业务单元
   *
   * @param data (required)
   * @return AgencyBusinessUnitAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public AgencyBusinessUnitAddResponseData agencyBusinessUnitAdd(
      AgencyBusinessUnitAddRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    AgencyBusinessUnitAddResponse resp = api.agencyBusinessUnitAdd(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 修改服务商业务单元
   *
   * @param data (required)
   * @return AgencyBusinessUnitUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public AgencyBusinessUnitUpdateResponseData agencyBusinessUnitUpdate(
      AgencyBusinessUnitUpdateRequest data, String... headerPair)
      throws ApiException, TencentAdsResponseException {
    AgencyBusinessUnitUpdateResponse resp = api.agencyBusinessUnitUpdate(data, headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

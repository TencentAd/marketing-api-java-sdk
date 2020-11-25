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
import com.tencent.ads.api.ReportApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.ReportConversionsPredictRequest;
import com.tencent.ads.model.ReportConversionsPredictResponse;
import com.tencent.ads.model.ReportConversionsPredictResponseData;
import com.tencent.ads.model.ReportVideoFrameRequest;
import com.tencent.ads.model.ReportVideoFrameResponse;
import com.tencent.ads.model.ReportVideoFrameResponseData;

public class ReportApiContainer extends ApiContainer {

  @Inject ReportApi api;

  /**
   * 获取当日转化效果预估数据
   *
   * @param data (required)
   * @return ReportConversionsPredictResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ReportConversionsPredictResponseData reportConversionsPredict(
      ReportConversionsPredictRequest data) throws ApiException, TencentAdsResponseException {
    ReportConversionsPredictResponse resp = api.reportConversionsPredict(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 视频流失分析接口
   *
   * @param data (required)
   * @return ReportVideoFrameResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ReportVideoFrameResponseData reportVideoFrame(ReportVideoFrameRequest data)
      throws ApiException, TencentAdsResponseException {
    ReportVideoFrameResponse resp = api.reportVideoFrame(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

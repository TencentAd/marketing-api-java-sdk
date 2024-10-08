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
import com.tencent.ads.api.VideomakerAutoadjustmentsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.ManualAdjustment;
import com.tencent.ads.model.SmartAdjustment;
import com.tencent.ads.model.VideomakerAutoadjustmentsAddResponse;
import com.tencent.ads.model.VideomakerAutoadjustmentsAddResponseData;
import java.io.File;

public class VideomakerAutoadjustmentsApiContainer extends ApiContainer {

  @Inject VideomakerAutoadjustmentsApi api;

  /**
   * 创建智能调整任务
   *
   * @param accountId (required)
   * @param adjustmentType (required)
   * @param videoId (optional)
   * @param videoFile (optional)
   * @param signature (optional)
   * @param smartAdjustment (optional)
   * @param manualAdjustment (optional)
   * @return VideomakerAutoadjustmentsAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public VideomakerAutoadjustmentsAddResponseData videomakerAutoadjustmentsAdd(
      Long accountId,
      String adjustmentType,
      String videoId,
      File videoFile,
      String signature,
      SmartAdjustment smartAdjustment,
      ManualAdjustment manualAdjustment,
      Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    VideomakerAutoadjustmentsAddResponse resp =
        api.videomakerAutoadjustmentsAdd(
            accountId,
            adjustmentType,
            videoId,
            videoFile,
            signature,
            smartAdjustment,
            manualAdjustment,
            headerPair);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}

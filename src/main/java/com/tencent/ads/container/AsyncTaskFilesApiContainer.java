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
import com.tencent.ads.api.AsyncTaskFilesApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import java.util.List;

@NeedDiffHost
public class AsyncTaskFilesApiContainer extends ApiContainer {

  @Inject AsyncTaskFilesApi api;

  /**
   * 获取文件接口
   *
   * @param accountId (required)
   * @param taskId (required)
   * @param fileId (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return String
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  @NeedDiffHost
  public String asyncTaskFilesGet(
      Long accountId, Long taskId, Long fileId, List<String> fields, Pair... headerPair)
      throws ApiException, TencentAdsResponseException {
    String resp = api.asyncTaskFilesGet(accountId, taskId, fileId, fields, headerPair);

    return resp;
  }
}

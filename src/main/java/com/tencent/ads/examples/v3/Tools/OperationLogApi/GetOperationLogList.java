package com.tencent.ads.examples.v3.Tools.OperationLogApi;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.v3.TencentAds;
import java.util.List;

public class GetOperationLogList {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public String operationObjectType = null;

  public String startDate = null;

  public String endDate = null;

  public Long page = null;

  public Long pageSize = null;

  public Long objectId = null;

  public List<String> operatorPlatformList = null;

  public List<String> operationActionList = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public OperationLogListGetResponseData getOperationLogList() throws Exception {
    OperationLogListGetResponseData response =
        tencentAds
            .operationLogList()
            .operationLogListGet(
                accountId,
                operationObjectType,
                startDate,
                endDate,
                page,
                pageSize,
                objectId,
                operatorPlatformList,
                operationActionList,
                fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetOperationLogList getOperationLogList = new GetOperationLogList();
      getOperationLogList.init();
      OperationLogListGetResponseData response = getOperationLogList.getOperationLogList();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

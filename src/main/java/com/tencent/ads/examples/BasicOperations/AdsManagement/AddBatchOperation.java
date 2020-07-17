package com.tencent.ads.examples.BasicOperations.AdsManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.BatchOperationAddRequest;
import com.tencent.ads.model.BatchOperationAddResponse;
import java.util.Arrays;
import java.util.List;

public class AddBatchOperation {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;
  public BatchOperationAddRequest data = new BatchOperationAddRequest();
  public BatchOperationType operationType = BatchOperationType.DATE;
  public List<Long> resourceIdList = Arrays.asList(0L);
  public String beginDate = "YOUR ADGROUP BEGIN DATE";
  public String endDate = "YOUR ADGROUP END DATE";
  public ResourceType resourceType = ResourceType.RESOURCE_TYPE_ADGROUP;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {
    data.setAccountId(accountId);

    data.setOperationType(operationType);

    data.setResourceIdList(resourceIdList);

    DateSpec dateSpec = new DateSpec();
    dateSpec.setBeginDate(beginDate);
    dateSpec.setEndDate(endDate);
    OperationSpec operationSpec = new OperationSpec();
    operationSpec.setDateSpec(dateSpec);
    data.setOperationSpec(operationSpec);

    data.setResourceType(resourceType);
  }

  public BatchOperationAddResponse addBatchOperation() throws Exception {
    BatchOperationAddResponse response = tencentAds.batchOperation().batchOperationAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddBatchOperation addBatchOperation = new AddBatchOperation();
      addBatchOperation.init();
      BatchOperationAddResponse response = addBatchOperation.addBatchOperation();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

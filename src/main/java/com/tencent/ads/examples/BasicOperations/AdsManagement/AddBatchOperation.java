package com.tencent.ads.examples.BasicOperations.AdsManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.BatchOperationAddRequest;
import com.tencent.ads.model.BatchOperationAddResponse;
import com.tencent.ads.model.BatchOperationType;
import com.tencent.ads.model.DateSpec;
import com.tencent.ads.model.OperationSpec;
import com.tencent.ads.model.ResourceType;
import java.util.Arrays;

/**
 * 本文件提供了一个批量修改广告组(Adgroup)的简单示例
 **/
public class AddBatchOperation {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR ADGROUP ID
   */
  public Long ADGROUP_ID = 0L;

  /**
   * 广告开始投放日期
   */
  public String BEGIN_DATE = "YOUR ADGROUP BEGIN DATE";
  /**
   * 广告结束投放日期
   */
  public String END_DATE = "YOUR ADGROUP END DATE";
  /**
   * 批量修改投放日期
   */
  public BatchOperationType OPERATE_TYPE = BatchOperationType.DATE;
  /**
   * ADGROUP
   */
  public ResourceType RESOURCE_TYPE = ResourceType.RESOURCE_TYPE_ADGROUP;
  /**
   * TencentAds
   */
  public TencentAds tencentAds;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true));// debug==true 会打印请求详细信息
    this.tencentAds.useSandbox();// 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
  }

  public Boolean addBatchOperation() throws Exception {
    BatchOperationAddRequest data = new BatchOperationAddRequest();
    data.setAccountId(ACCOUNT_ID);
    data.setResourceType(RESOURCE_TYPE);
    data.setOperationType(OPERATE_TYPE);
    data.setResourceIdList(Arrays.asList(ADGROUP_ID));
    data.setOperationSpec(
        new OperationSpec().dateSpec(new DateSpec().beginDate(BEGIN_DATE).endDate(END_DATE)));
    BatchOperationAddResponse response = tencentAds.batchOperation().batchOperationAdd(data);
    if (response != null && response.getCode() == 0) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    try {
      AddBatchOperation addBatchOperation = new AddBatchOperation();
      addBatchOperation.init();
      Boolean res = addBatchOperation.addBatchOperation();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

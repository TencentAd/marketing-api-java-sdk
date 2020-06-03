package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AgeStruct;
import com.tencent.ads.model.CampaignTargeting;
import com.tencent.ads.model.EstimationGetRequest;
import com.tencent.ads.model.EstimationGetResponseData;
import com.tencent.ads.model.EstimationReadTargetingSetting;
import java.util.Arrays;

/*****
 * 本文件提供了一个获取覆盖人数(Estimation)的简单示例
 */
public class GetEstimation {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR CAMPAIGN ID
   */
  public Long CAMPAIGN_ID = 0L; // 推广计划ID
  /**
   * YOUR TARGETING MIN AGE
   */
  public Long TARGETING_AGE_MIN = 0L; // 年龄定向
  /**
   * YOUR TARGETING MAX AGE
   */
  public Long TARGETING_AGE_MAX = 0L; // 年龄定向
  /**
   * YOUR TARGETING GENDER
   */
  public String TARGETING_GENDER = "YOUR TARGETING GENDE"; // 性别定向
  /**
   * TencentAds
   */
  public TencentAds tencentAds;
  private EstimationGetRequest data;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true));// debug==true 会打印请求详细信息
    this.tencentAds.useSandbox();// 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
  }

  public EstimationGetResponseData getEstimation() throws Exception {
    EstimationGetRequest data = new EstimationGetRequest();
    data.accountId(ACCOUNT_ID);
    data.targeting(new EstimationReadTargetingSetting()
        .age(Arrays.asList(new AgeStruct().min(TARGETING_AGE_MIN).max(TARGETING_AGE_MAX)))
        .gender(Arrays.asList(TARGETING_GENDER)));
    data.campaignSpec(new CampaignTargeting().campaignId(CAMPAIGN_ID));
    EstimationGetResponseData response = tencentAds.estimation().estimationGet(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetEstimation getEstimation = new GetEstimation();
      getEstimation.init();
      EstimationGetResponseData response = getEstimation.getEstimation();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

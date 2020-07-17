package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.EstimationGetRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetEstimation {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long max = null;
  public Long min = null;
  public List<String> gender = Arrays.asList("YOUR TARGETING GENDER");
  public EstimationGetRequest data = new EstimationGetRequest();
  public Long accountId = null;
  public Long campaignId = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {
    AgeStruct ageStruct = new AgeStruct();
    ageStruct.setMax(max);
    ageStruct.setMin(min);
    List<AgeStruct> age = new ArrayList<>();
    age.add(ageStruct);
    EstimationReadTargetingSetting targeting = new EstimationReadTargetingSetting();
    targeting.setAge(age);
    targeting.setGender(gender);
    data.setTargeting(targeting);

    data.setAccountId(accountId);

    CampaignTargeting campaignSpec = new CampaignTargeting();
    campaignSpec.setCampaignId(campaignId);
    data.setCampaignSpec(campaignSpec);
  }

  public EstimationGetResponseData getEstimation() throws Exception {
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

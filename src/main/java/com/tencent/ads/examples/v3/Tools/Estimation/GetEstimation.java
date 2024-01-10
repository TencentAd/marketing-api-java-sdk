package com.tencent.ads.examples.v3.Tools.Estimation;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.EstimationGetRequest;
import com.tencent.ads.v3.TencentAds;
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

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    AgeStruct ageStruct = new AgeStruct();
    ageStruct.setMax(max);
    ageStruct.setMin(min);
    List<AgeStruct> age = new ArrayList<>();
    age.add(ageStruct);
    WriteTargetingSetting targeting = new WriteTargetingSetting();
    targeting.setAge(age);
    targeting.setGender(gender);
    data.setTargeting(targeting);

    data.setAccountId(accountId);
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

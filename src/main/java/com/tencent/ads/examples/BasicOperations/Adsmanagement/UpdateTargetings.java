package com.tencent.ads.examples.BasicOperations.Adsmanagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.TargetingsUpdateRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpdateTargetings {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long targetingId = null;
  public TargetingsUpdateRequest data = new TargetingsUpdateRequest();
  public Long max = null;
  public Long min = null;
  public List<String> gender = Arrays.asList("YOUR TARGETING GENDER");
  public Long accountId = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setTargetingId(targetingId);

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

  public TargetingsUpdateResponseData updateTargetings() throws Exception {
    TargetingsUpdateResponseData response = tencentAds.targetings().targetingsUpdate(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      UpdateTargetings updateTargetings = new UpdateTargetings();
      updateTargetings.init();
      TargetingsUpdateResponseData response = updateTargetings.updateTargetings();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

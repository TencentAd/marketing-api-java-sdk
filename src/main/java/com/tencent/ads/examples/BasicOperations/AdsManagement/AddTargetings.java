package com.tencent.ads.examples.BasicOperations.AdsManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.TargetingsAddRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddTargetings {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long max = null;
  public Long min = null;
  public List<String> gender = Arrays.asList("YOUR TARGETING GENDER");
  public TargetingsAddRequest data = new TargetingsAddRequest();
  public Long accountId = null;
  public String targetingName = "SDK定向5ede252947141";
  public String description = "SDK 测试定向";

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
    WriteTargetingSetting targeting = new WriteTargetingSetting();
    targeting.setAge(age);
    targeting.setGender(gender);
    data.setTargeting(targeting);

    data.setAccountId(accountId);

    data.setTargetingName(targetingName);

    data.setDescription(description);
  }

  public TargetingsAddResponseData addTargetings() throws Exception {
    TargetingsAddResponseData response = tencentAds.targetings().targetingsAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddTargetings addTargetings = new AddTargetings();
      addTargetings.init();
      TargetingsAddResponseData response = addTargetings.addTargetings();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

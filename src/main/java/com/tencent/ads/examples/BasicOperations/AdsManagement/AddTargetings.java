package com.tencent.ads.examples.BasicOperations.AdsManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AgeStruct;
import com.tencent.ads.model.TargetingsAddRequest;
import com.tencent.ads.model.TargetingsAddResponseData;
import com.tencent.ads.model.WriteTargetingSetting;
import java.util.Arrays;
import java.util.UUID;

/*****
 * 本文件提供了一个创建定向(Targeting)的简单示例
 */
public class AddTargetings {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
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
  public String TARGETING_GENDER = "YOUR TARGETING GENDER"; // 性别定向
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

  public Long addTargetings() throws Exception {
    TargetingsAddRequest data = new TargetingsAddRequest();
    data.accountId(ACCOUNT_ID);
    data.targetingName("SDK定向" + UUID.randomUUID().toString().substring(0, 22));
    data.targeting(new WriteTargetingSetting().gender(Arrays.asList(TARGETING_GENDER))
        .age(Arrays.asList(new AgeStruct().max(TARGETING_AGE_MAX).min(TARGETING_AGE_MIN))));
    TargetingsAddResponseData response = tencentAds.targetings().targetingsAdd(data);
    return response.getTargetingId();
  }

  public static void main(String[] args) {
    try {
      AddTargetings example = new AddTargetings();
      example.init();
      Long targetId = example.addTargetings();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

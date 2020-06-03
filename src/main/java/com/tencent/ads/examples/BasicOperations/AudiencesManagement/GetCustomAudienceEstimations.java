package com.tencent.ads.examples.BasicOperations.AudiencesManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.CombineSpec;
import com.tencent.ads.model.CustomAudienceEstimationsGetRequest;
import com.tencent.ads.model.CustomAudienceEstimationsGetResponseData;
import com.tencent.ads.model.EstimationAudienceSpec;
import com.tencent.ads.model.IncludeSimpleRule;
import com.tencent.ads.model.SimpleRule;
import java.lang.reflect.Array;
import java.util.Arrays;

/*****
 * 本文件提供了一个获取客户人群数预估(Custom audience estimation)的简单示例
 */
public class GetCustomAudienceEstimations {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR AUDIENCE_ID
   */
  public Long AUDIENCE_ID = 0L; // 人群ID
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

  public CustomAudienceEstimationsGetResponseData getCustomAudienceEstimations() throws Exception {
    CustomAudienceEstimationsGetRequest data = new CustomAudienceEstimationsGetRequest();
    data.accountId(ACCOUNT_ID);
    data.type("COMBINE");
    IncludeSimpleRule includeSimpleRule = new IncludeSimpleRule();
    includeSimpleRule.add(new SimpleRule().audienceId(AUDIENCE_ID));
    data.audienceSpec(new EstimationAudienceSpec().combineSpec(
        new CombineSpec().include(Arrays.asList(includeSimpleRule))));

    CustomAudienceEstimationsGetResponseData response = tencentAds.customAudienceEstimations()
        .customAudienceEstimationsGet(data);
    return response;

  }

  public static void main(String[] args) {
    try {
      GetCustomAudienceEstimations getCustomAudienceEstimations = new GetCustomAudienceEstimations();
      getCustomAudienceEstimations.init();
      CustomAudienceEstimationsGetResponseData response = getCustomAudienceEstimations
          .getCustomAudienceEstimations();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

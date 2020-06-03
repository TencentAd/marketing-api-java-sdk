package com.tencent.ads.examples.BasicOperations.Insights;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.CustomAudienceInsights;
import com.tencent.ads.model.CustomAudienceInsightsGetResponseData;
import java.util.Arrays;
import java.util.List;

/*****
 * 本文件提供了一个获取人群洞察分析(Custom audience insight)列表的简单示例
 */
public class GetCustomAudienceInsights {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR AUDIENCE ID
   */
  public Long AUDIENCE_ID = 0L; // 人群ID
  /**
   * YOUR DIMENSION_TYPE
   */
  public String DIMENSION_TYPE = "AGE"; // 透视维度
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

  public CustomAudienceInsightsGetResponseData getCustomAudienceInsights() throws Exception {
    CustomAudienceInsightsGetResponseData response = tencentAds.customAudienceInsights()
        .customAudienceInsightsGet(ACCOUNT_ID,
            AUDIENCE_ID, Arrays.asList(DIMENSION_TYPE),
            Arrays.asList("dimension_type", "match_rate", "distribution"));
    return response;

  }

  public static void main(String[] args) {
    try {
      GetCustomAudienceInsights GetCustomAudienceInsights = new GetCustomAudienceInsights();
      GetCustomAudienceInsights.init();
      CustomAudienceInsightsGetResponseData response = GetCustomAudienceInsights
          .getCustomAudienceInsights();
      if (response != null) {
        List<CustomAudienceInsights> list = response.getList();
      }
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
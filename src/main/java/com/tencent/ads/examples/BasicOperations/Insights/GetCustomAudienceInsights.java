package com.tencent.ads.examples.BasicOperations.Insights;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import java.util.Arrays;
import java.util.List;

public class GetCustomAudienceInsights {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public Long audienceId = null;

  public List<String> dimensionType = Arrays.asList("AGE");

  public List<String> fields = Arrays.asList("dimension_type", "match_rate", "distribution");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public CustomAudienceInsightsGetResponseData getCustomAudienceInsights() throws Exception {
    CustomAudienceInsightsGetResponseData response =
        tencentAds
            .customAudienceInsights()
            .customAudienceInsightsGet(accountId, audienceId, dimensionType, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetCustomAudienceInsights getCustomAudienceInsights = new GetCustomAudienceInsights();
      getCustomAudienceInsights.init();
      CustomAudienceInsightsGetResponseData response =
          getCustomAudienceInsights.getCustomAudienceInsights();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

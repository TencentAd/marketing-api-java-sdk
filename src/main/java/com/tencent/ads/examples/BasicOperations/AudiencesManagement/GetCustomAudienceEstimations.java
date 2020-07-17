package com.tencent.ads.examples.BasicOperations.AudiencesManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.CustomAudienceEstimationsGetRequest;
import java.util.ArrayList;
import java.util.List;

public class GetCustomAudienceEstimations {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;
  public CustomAudienceEstimationsGetRequest data = new CustomAudienceEstimationsGetRequest();
  public Long audienceId = null;
  public String type = "COMBINE";

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {
    data.setAccountId(accountId);

    SimpleRule simpleRule = new SimpleRule();
    simpleRule.setAudienceId(audienceId);
    IncludeSimpleRule includeSimpleRule = new IncludeSimpleRule();
    includeSimpleRule.add(simpleRule);
    List<IncludeSimpleRule> include = new ArrayList<>();
    include.add(includeSimpleRule);
    CombineSpec combineSpec = new CombineSpec();
    combineSpec.setInclude(include);
    EstimationAudienceSpec audienceSpec = new EstimationAudienceSpec();
    audienceSpec.setCombineSpec(combineSpec);
    data.setAudienceSpec(audienceSpec);

    data.setType(type);
  }

  public CustomAudienceEstimationsGetResponseData getCustomAudienceEstimations() throws Exception {
    CustomAudienceEstimationsGetResponseData response =
        tencentAds.customAudienceEstimations().customAudienceEstimationsGet(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetCustomAudienceEstimations getCustomAudienceEstimations =
          new GetCustomAudienceEstimations();
      getCustomAudienceEstimations.init();
      CustomAudienceEstimationsGetResponseData response =
          getCustomAudienceEstimations.getCustomAudienceEstimations();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

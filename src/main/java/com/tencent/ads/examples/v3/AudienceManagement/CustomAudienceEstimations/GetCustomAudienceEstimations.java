package com.tencent.ads.examples.v3.AudienceManagement.CustomAudienceEstimations;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.EstimationAudienceSpec;
import com.tencent.ads.v3.TencentAds;
import java.util.ArrayList;
import java.util.List;

public class GetCustomAudienceEstimations {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public String type = "COMBINE";

  public EstimationAudienceSpec audienceSpec = new EstimationAudienceSpec();

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    Long audienceId = null;
    SimpleRule simpleRule = new SimpleRule();
    simpleRule.setAudienceId(audienceId);
    IncludeSimpleRule includeSimpleRule = new IncludeSimpleRule();
    includeSimpleRule.add(simpleRule);
    List<IncludeSimpleRule> include = new ArrayList<>();
    include.add(includeSimpleRule);
    CombineSpec combineSpec = new CombineSpec();
    combineSpec.setInclude(include);
    audienceSpec.setCombineSpec(combineSpec);
  }

  public CustomAudienceEstimationsGetResponseData getCustomAudienceEstimations() throws Exception {
    CustomAudienceEstimationsGetResponseData response =
        tencentAds
            .customAudienceEstimations()
            .customAudienceEstimationsGet(accountId, type, audienceSpec, fields);
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

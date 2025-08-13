package com.tencent.ads.examples.v3.Tools.OptimizationGoalPermissions;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.MarketingCarrierDetail;
import com.tencent.ads.v3.TencentAds;
import java.util.List;

public class GetOptimizationGoalPermissions {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public List<String> siteSet = null;

  public String marketingGoal = null;

  public String marketingSubGoal = null;

  public String marketingCarrierType = null;

  public String marketingTargetType = null;

  public String bidMode = null;

  public MarketingCarrierDetail marketingCarrierDetail = null;

  public String deliveryScene = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public OptimizationGoalPermissionsGetResponseData getOptimizationGoalPermissions()
      throws Exception {
    OptimizationGoalPermissionsGetResponseData response =
        tencentAds
            .optimizationGoalPermissions()
            .optimizationGoalPermissionsGet(
                accountId,
                siteSet,
                marketingGoal,
                marketingSubGoal,
                marketingCarrierType,
                marketingTargetType,
                bidMode,
                marketingCarrierDetail,
                deliveryScene,
                fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetOptimizationGoalPermissions getOptimizationGoalPermissions =
          new GetOptimizationGoalPermissions();
      getOptimizationGoalPermissions.init();
      OptimizationGoalPermissionsGetResponseData response =
          getOptimizationGoalPermissions.getOptimizationGoalPermissions();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

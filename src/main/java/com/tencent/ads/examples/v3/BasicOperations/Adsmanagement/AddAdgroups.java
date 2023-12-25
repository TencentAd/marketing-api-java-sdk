package com.tencent.ads.examples.v3.BasicOperations.Adsmanagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.AdgroupsAddRequest;
import com.tencent.ads.v3.TencentAds;
import java.util.Arrays;
import java.util.List;

public class AddAdgroups {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public String endDate = "YOUR ADGROUP END DATE";
  public AdgroupsAddRequest data = new AdgroupsAddRequest();
  public OptimizationGoal optimizationGoal = OptimizationGoal.IMPRESSION;
  public List<String> userOs = Arrays.asList("IOS");
  public Long accountId = null;
  public Long bidAmount = 150L;
  public String timeSeries =
      "111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111";
  public String beginDate = "YOUR ADGROUP BEGIN DATE";
  public List<String> siteSet = Arrays.asList("SITE_SET_QZONE");
  public String adgroupName = "SDK广告组5ede25290dec2";

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setEndDate(endDate);

    data.setOptimizationGoal(optimizationGoal);

    WriteTargetingSetting targeting = new WriteTargetingSetting();
    targeting.setUserOs(userOs);
    data.setTargeting(targeting);

    data.setAccountId(accountId);

    data.setBidAmount(bidAmount);

    data.setTimeSeries(timeSeries);

    data.setBeginDate(beginDate);

    data.setSiteSet(siteSet);

    data.setAdgroupName(adgroupName);
  }

  public AdgroupsAddResponseData addAdgroups() throws Exception {
    AdgroupsAddResponseData response = tencentAds.adgroups().adgroupsAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddAdgroups addAdgroups = new AddAdgroups();
      addAdgroups.init();
      AdgroupsAddResponseData response = addAdgroups.addAdgroups();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

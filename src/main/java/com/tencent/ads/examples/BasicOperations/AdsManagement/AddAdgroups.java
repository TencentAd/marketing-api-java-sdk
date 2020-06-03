package com.tencent.ads.examples.BasicOperations.AdsManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AdgroupsAddRequest;
import com.tencent.ads.model.AdgroupsAddResponseData;
import com.tencent.ads.model.BillingEvent;
import com.tencent.ads.model.OptimizationGoal;
import com.tencent.ads.model.PromotedObjectType;
import com.tencent.ads.model.WriteTargetingSettingForAdgroup;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * 本文件提供了一个创建广告组(Adgroup)的简单示例
 **/
public class AddAdgroups {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;

  /**
   * YOUR CAMPAIGN ID
   */
  public Long CAMPAIGN_ID = 0L;
  /**
   * 推广普通外链
   */
  public PromotedObjectType PROMOTED_OBJECT_TYPE = PromotedObjectType.LINK;
  /**
   * 投放QQ空间流量
   */
  public List<String> SITE_SET = Arrays.asList("SITE_SET_QZONE");
  /**
   * 按曝光扣费(CPM)
   */
  public BillingEvent BILLING_EVENT = BillingEvent.IMPRESSION;
  /**
   * 广告目标优化类型：曝光
   */
  public OptimizationGoal OPTIMIZATION_GOAL = OptimizationGoal.IMPRESSION;
  /**
   * 出价1.5元(150分)
   */
  public Long BID_AMOUNT = 150L;
  /**
   * 广告开始投放日期
   */
  public String BEGIN_DATE = "YOUR ADGROUP BEGIN DATE";
  /**
   * 广告结束投放日期
   */
  public String END_DATE = "YOUR ADGROUP END DATE";
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

  public Long addAdgroups() throws Exception {
    AdgroupsAddRequest data = new AdgroupsAddRequest();
    String timeSeries = "11111111111111111111111"
        + "1111111111111111111111111111111111111111111"
        + "1111111111111111111111111111111111111111111"
        + "1111111111111111111111111111111111111111111"
        + "1111111111111111111111111111111111111111111"
        + "1111111111111111111111111111111111111111111"
        + "1111111111111111111111111111111111111111111"
        + "1111111111111111111111111111111111111111111111111111111";
    data.setAccountId(ACCOUNT_ID);
    data.setCampaignId(CAMPAIGN_ID);
    data.setAdgroupName("SDK广告组" + UUID.randomUUID().toString());
    data.setPromotedObjectType(PROMOTED_OBJECT_TYPE);
    data.setBeginDate(BEGIN_DATE);
    data.setEndDate(END_DATE);
    data.setBillingEvent(BILLING_EVENT);
    data.setBidAmount(BID_AMOUNT);
    data.setOptimizationGoal(OPTIMIZATION_GOAL);
    data.setSiteSet(SITE_SET);
    data.setTargeting(new WriteTargetingSettingForAdgroup().userOs(Arrays.asList("IOS")));
    data.setTimeSeries(timeSeries);

    AdgroupsAddResponseData response = tencentAds.adgroups().adgroupsAdd(data);
    if (response != null) {
      return response.getAdgroupId();
    }
    return null;
  }

  public static void main(String[] args) {
    try {
      AddAdgroups addAdgroups = new AddAdgroups();
      addAdgroups.init();
      Long adgroupId = addAdgroups.addAdgroups();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}

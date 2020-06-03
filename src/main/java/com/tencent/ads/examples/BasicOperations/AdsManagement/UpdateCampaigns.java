package com.tencent.ads.examples.BasicOperations.AdsManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AdStatus;
import com.tencent.ads.model.CampaignsUpdateRequest;
import com.tencent.ads.model.CampaignsUpdateResponseData;

/**
 * 本文件提供了一个修改推广计划(Campaign)的简单示例
 **/
public class UpdateCampaigns {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * NEED UPDATE CAMPAIGN ID
   */
  public Long CAMPAIGN_ID = 0L;
  /**
   * 日预算修改为100元(10000分)
   */
  public Long DAILY_BUDGET = 10000L;
  /**
   * 状态修改为暂停
   */
  public AdStatus CONFIGURED_STATUS = AdStatus.SUSPEND;
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

  public Long updateCampaigns() throws Exception {
    CampaignsUpdateRequest data = new CampaignsUpdateRequest();
    data.setAccountId(ACCOUNT_ID);
    data.setCampaignId(CAMPAIGN_ID);
    data.setDailyBudget(DAILY_BUDGET);
    data.setConfiguredStatus(CONFIGURED_STATUS);
    CampaignsUpdateResponseData response = tencentAds.campaigns().campaignsUpdate(data);
    if (response != null) {
      return response.getCampaignId();
    }
    return null;
  }


  public static void main(String[] args) {
    try {
      UpdateCampaigns updateCampaigns = new UpdateCampaigns();
      updateCampaigns.init();
      Long campaignId = updateCampaigns.updateCampaigns();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

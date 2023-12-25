package com.tencent.ads.examples.BasicOperations.Adsmanagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.CampaignsUpdateRequest;

public class UpdateCampaigns {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;
  public CampaignsUpdateRequest data = new CampaignsUpdateRequest();
  public Long dailyBudget = 10000L;
  public AdStatus configuredStatus = AdStatus.SUSPEND;
  public Long campaignId = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setAccountId(accountId);

    data.setDailyBudget(dailyBudget);

    data.setConfiguredStatus(configuredStatus);

    data.setCampaignId(campaignId);
  }

  public CampaignsUpdateResponseData updateCampaigns() throws Exception {
    CampaignsUpdateResponseData response = tencentAds.campaigns().campaignsUpdate(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      UpdateCampaigns updateCampaigns = new UpdateCampaigns();
      updateCampaigns.init();
      CampaignsUpdateResponseData response = updateCampaigns.updateCampaigns();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

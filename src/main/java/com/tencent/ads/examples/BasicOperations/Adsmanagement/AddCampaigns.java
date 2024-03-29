package com.tencent.ads.examples.BasicOperations.Adsmanagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.CampaignsAddRequest;

public class AddCampaigns {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public String campaignName = "SDK计划5ede2529308ad";
  public CampaignsAddRequest data = new CampaignsAddRequest();
  public Long accountId = null;
  public CampaignType campaignType = CampaignType.NORMAL;
  public PromotedObjectType promotedObjectType = PromotedObjectType.LINK;
  public Long dailyBudget = 5000L;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setCampaignName(campaignName);

    data.setAccountId(accountId);

    data.setCampaignType(campaignType);

    data.setPromotedObjectType(promotedObjectType);

    data.setDailyBudget(dailyBudget);
  }

  public CampaignsAddResponseData addCampaigns() throws Exception {
    CampaignsAddResponseData response = tencentAds.campaigns().campaignsAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddCampaigns addCampaigns = new AddCampaigns();
      addCampaigns.init();
      CampaignsAddResponseData response = addCampaigns.addCampaigns();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

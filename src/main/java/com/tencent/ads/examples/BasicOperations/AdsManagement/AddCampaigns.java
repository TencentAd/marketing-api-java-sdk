package com.tencent.ads.examples.BasicOperations.AdsManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.CampaignType;
import com.tencent.ads.model.CampaignsAddRequest;
import com.tencent.ads.model.CampaignsAddResponseData;
import com.tencent.ads.model.PromotedObjectType;
import java.util.UUID;

/**
 * 本文件提供了一个创建推广计划(Campaign)的简单示例
 **/
public class AddCampaigns {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * 普通推广计划
   */
  public CampaignType CAMPAIGN_TYPE = CampaignType.NORMAL;
  /**
   * 推广普通外链
   */
  public PromotedObjectType PROMOTED_OBJECT_TYPE = PromotedObjectType.LINK;
  /**
   * 日预算50元(5000分)
   */
  public Long DAILY_BUDGET = 5000L;
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

  public Long addCampaigns() throws Exception {
    CampaignsAddRequest data = new CampaignsAddRequest();
    data.setAccountId(ACCOUNT_ID);
    data.setCampaignName("SDK推广计划" + UUID.randomUUID().toString());
    data.setCampaignType(CAMPAIGN_TYPE);
    data.setPromotedObjectType(PROMOTED_OBJECT_TYPE);
    data.setDailyBudget(DAILY_BUDGET);
    CampaignsAddResponseData response = tencentAds.campaigns().campaignsAdd(data);
    if (response != null) {
      return response.getCampaignId();
    }
    return null;
  }

  public static void main(String[] args) {
    try {
      AddCampaigns addCampaigns = new AddCampaigns();
      addCampaigns.init();
      Long campaignId = addCampaigns.addCampaigns();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

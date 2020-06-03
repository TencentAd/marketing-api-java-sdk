package com.tencent.ads.examples.BasicOperations.AdsManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.CampaignsDeleteRequest;
import com.tencent.ads.model.CampaignsDeleteResponseData;

/**
 * 本文件提供了一个删除推广计划(Campaign)的简单示例
 **/
public class DeleteCampaigns {

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
   * TencentAds
   */
  public TencentAds tencentAds;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true));// debug==true 会打印请求详细信息
    this.tencentAds.useSandbox();// 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
  }

  public Long deleteCampaigns() throws Exception {
    CampaignsDeleteRequest data = new CampaignsDeleteRequest();
    data.setAccountId(ACCOUNT_ID);
    data.setCampaignId(CAMPAIGN_ID);
    CampaignsDeleteResponseData response = tencentAds.campaigns().campaignsDelete(data);
    if (response != null) {
      return response.getCampaignId();
    }
    return null;
  }

  public static void main(String[] args) {
    try {
      DeleteCampaigns deleteCampaigns = new DeleteCampaigns();
      deleteCampaigns.init();
      Long campaignId = deleteCampaigns.deleteCampaigns();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}

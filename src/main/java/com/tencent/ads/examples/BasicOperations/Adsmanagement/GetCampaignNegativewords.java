package com.tencent.ads.examples.BasicOperations.Adsmanagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.CampaignNegativewordsGetRequest;

public class GetCampaignNegativewords {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public CampaignNegativewordsGetRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public CampaignNegativewordsGetResponseData getCampaignNegativewords() throws Exception {
    CampaignNegativewordsGetResponseData response =
        tencentAds.campaignNegativewords().campaignNegativewordsGet(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetCampaignNegativewords getCampaignNegativewords = new GetCampaignNegativewords();
      getCampaignNegativewords.init();
      CampaignNegativewordsGetResponseData response =
          getCampaignNegativewords.getCampaignNegativewords();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

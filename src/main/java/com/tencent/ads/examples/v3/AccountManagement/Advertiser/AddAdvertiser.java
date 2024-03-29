package com.tencent.ads.examples.v3.AccountManagement.Advertiser;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.AdvertiserAddRequest;
import com.tencent.ads.v3.TencentAds;

public class AddAdvertiser {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long systemIndustryId = null;
  public AdvertiserAddRequest data = new AdvertiserAddRequest();
  public String introductionUrl = "YOUR INTRODUCTION PAGE URL";
  public String certificationImageId = "YOUR CERTIFICATION IMAGE ID";
  public String corporationName = "YOUR CORPORATION NAME";

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setSystemIndustryId(systemIndustryId);

    data.setIntroductionUrl(introductionUrl);

    data.setCertificationImageId(certificationImageId);

    data.setCorporationName(corporationName);
  }

  public AdvertiserAddResponseData addAdvertiser() throws Exception {
    AdvertiserAddResponseData response = tencentAds.advertiser().advertiserAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddAdvertiser addAdvertiser = new AddAdvertiser();
      addAdvertiser.init();
      AdvertiserAddResponseData response = addAdvertiser.addAdvertiser();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

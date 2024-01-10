package com.tencent.ads.examples.v3.AdsManagement.Negativewords;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.AdgroupNegativewordsGetRequest;
import com.tencent.ads.v3.TencentAds;

public class GetAdgroupNegativewords {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public AdgroupNegativewordsGetRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public AdgroupNegativewordsGetResponseData getAdgroupNegativewords() throws Exception {
    AdgroupNegativewordsGetResponseData response =
        tencentAds.adgroupNegativewords().adgroupNegativewordsGet(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetAdgroupNegativewords getAdgroupNegativewords = new GetAdgroupNegativewords();
      getAdgroupNegativewords.init();
      AdgroupNegativewordsGetResponseData response =
          getAdgroupNegativewords.getAdgroupNegativewords();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

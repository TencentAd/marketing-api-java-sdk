package com.tencent.ads.examples.v3.SearchAdsManagement.Negativewords;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.v3.TencentAds;
import java.util.List;

public class GetNegativewords {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public List<Long> adgroupIds = null;

  public List<Long> dynamicCreativeIds = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public NegativewordsGetResponseData getNegativewords() throws Exception {
    NegativewordsGetResponseData response =
        tencentAds
            .negativewords()
            .negativewordsGet(accountId, adgroupIds, dynamicCreativeIds, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetNegativewords getNegativewords = new GetNegativewords();
      getNegativewords.init();
      NegativewordsGetResponseData response = getNegativewords.getNegativewords();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

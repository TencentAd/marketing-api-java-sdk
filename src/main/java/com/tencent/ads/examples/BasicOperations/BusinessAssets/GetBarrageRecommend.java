package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import java.util.List;

public class GetBarrageRecommend {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public BarrageRecommendGetResponseData getBarrageRecommend() throws Exception {
    BarrageRecommendGetResponseData response =
        tencentAds.barrageRecommend().barrageRecommendGet(accountId, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetBarrageRecommend getBarrageRecommend = new GetBarrageRecommend();
      getBarrageRecommend.init();
      BarrageRecommendGetResponseData response = getBarrageRecommend.getBarrageRecommend();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

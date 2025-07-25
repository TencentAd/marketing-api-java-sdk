package com.tencent.ads.examples.v3.BusinessAssets.WechatChannelsAdAccount;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.v3.TencentAds;
import java.util.List;

public class GetWechatChannelsAdAccountValidation {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public String nickname = null;

  public String headImageId = null;

  public String wechatChannelsAccountId = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public WechatChannelsAdAccountValidationGetResponseData getWechatChannelsAdAccountValidation()
      throws Exception {
    WechatChannelsAdAccountValidationGetResponseData response =
        tencentAds
            .wechatChannelsAdAccountValidation()
            .wechatChannelsAdAccountValidationGet(
                accountId, nickname, headImageId, wechatChannelsAccountId, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetWechatChannelsAdAccountValidation getWechatChannelsAdAccountValidation =
          new GetWechatChannelsAdAccountValidation();
      getWechatChannelsAdAccountValidation.init();
      WechatChannelsAdAccountValidationGetResponseData response =
          getWechatChannelsAdAccountValidation.getWechatChannelsAdAccountValidation();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

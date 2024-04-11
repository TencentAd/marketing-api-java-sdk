package com.tencent.ads.examples.v3.Tools.WechatPages;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.WechatPagesCsgrouplistAddRequest;
import com.tencent.ads.model.v3.WechatPagesCsgrouplistAddResponse;
import com.tencent.ads.v3.TencentAds;

public class AddWechatPagesCsgrouplist {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public WechatPagesCsgrouplistAddRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public WechatPagesCsgrouplistAddResponse addWechatPagesCsgrouplist() throws Exception {
    WechatPagesCsgrouplistAddResponse response =
        tencentAds.wechatPagesCsgrouplist().wechatPagesCsgrouplistAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddWechatPagesCsgrouplist addWechatPagesCsgrouplist = new AddWechatPagesCsgrouplist();
      addWechatPagesCsgrouplist.init();
      WechatPagesCsgrouplistAddResponse response =
          addWechatPagesCsgrouplist.addWechatPagesCsgrouplist();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

package com.tencent.ads.examples.BasicOperations.Adsmanagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import java.util.List;

public class GetTargetcpaTag {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public List<String> tagTypes = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public TargetcpaTagGetResponseData getTargetcpaTag() throws Exception {
    TargetcpaTagGetResponseData response =
        tencentAds.targetcpaTag().targetcpaTagGet(accountId, tagTypes, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetTargetcpaTag getTargetcpaTag = new GetTargetcpaTag();
      getTargetcpaTag.init();
      TargetcpaTagGetResponseData response = getTargetcpaTag.getTargetcpaTag();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

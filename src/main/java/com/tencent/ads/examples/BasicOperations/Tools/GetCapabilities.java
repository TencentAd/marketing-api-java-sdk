package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.CapabilitiesGetQuerySpec;
import java.util.Arrays;
import java.util.List;

public class GetCapabilities {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public String capability = "CAPABILITY_WECHAT_ECOMMERCE_PRODUCT";

  public CapabilitiesGetQuerySpec querySpec = null;

  public List<String> fields =
      Arrays.asList("wechat_ecommerce_product_spec", "wechat_link_ad_spec", "wechat_ocpa_spec");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public CapabilitiesGetResponseData getCapabilities() throws Exception {
    CapabilitiesGetResponseData response =
        tencentAds.capabilities().capabilitiesGet(accountId, capability, querySpec, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetCapabilities getCapabilities = new GetCapabilities();
      getCapabilities.init();
      CapabilitiesGetResponseData response = getCapabilities.getCapabilities();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

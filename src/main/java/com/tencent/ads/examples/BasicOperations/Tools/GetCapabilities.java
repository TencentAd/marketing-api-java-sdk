package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.CapabilitiesGetResponseData;
import java.util.Arrays;

/*****
 * 本文件提供了一个获取广告投放能力(Capability)列表的简单示例
 */
public class GetCapabilities {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR CAPABILITY
   */
  public String CAPABILITY = "CAPABILITY_WECHAT_ECOMMERCE_PRODUCT";
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

  public CapabilitiesGetResponseData getCapabilities() throws Exception {
    CapabilitiesGetResponseData response = tencentAds.capabilities()
        .capabilitiesGet(ACCOUNT_ID, CAPABILITY, null,
            Arrays.asList("wechat_ecommerce_product_spec", "wechat_link_ad_spec",
                "wechat_ocpa_spec"));
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

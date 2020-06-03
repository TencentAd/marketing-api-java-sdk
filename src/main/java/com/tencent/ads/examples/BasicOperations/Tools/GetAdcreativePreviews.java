package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AdcreativePreviewsGetListStruct;
import com.tencent.ads.model.AdcreativePreviewsGetResponseData;
import com.tencent.ads.model.FilteringStruct;
import java.util.Arrays;
import java.util.List;

/*****
 * 本文件提供了一个获取预览受众(Adcreative preview)的简单示例
 */
public class GetAdcreativePreviews {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR ADGROUP ID
   */
  public Long ADGROUP_ID = 0L; // 广告组ID
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

  public AdcreativePreviewsGetResponseData getAdcreativePreviews() throws Exception {
    AdcreativePreviewsGetResponseData response = tencentAds.adcreativePreviews()
        .adcreativePreviewsGet(ACCOUNT_ID,
            Arrays.asList(new FilteringStruct().field("adgroup_id")
                .values(Arrays.asList(String.valueOf(ADGROUP_ID))).operator("EQUALS")),
            Arrays.asList("user_id", "user_id_type"));
    return response;
  }

  public static void main(String[] args) {
    try {
      GetAdcreativePreviews getAdcreativePreviews = new GetAdcreativePreviews();
      getAdcreativePreviews.init();
      AdcreativePreviewsGetResponseData response = getAdcreativePreviews.getAdcreativePreviews();
      if (response != null) {
        List<AdcreativePreviewsGetListStruct> list = response.getList();
      }
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

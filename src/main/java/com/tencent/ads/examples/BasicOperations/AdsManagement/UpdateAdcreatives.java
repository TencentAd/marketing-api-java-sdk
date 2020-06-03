package com.tencent.ads.examples.BasicOperations.AdsManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AdcreativeCreativeElementsMp;
import com.tencent.ads.model.AdcreativesUpdateRequest;
import com.tencent.ads.model.AdcreativesUpdateResponseData;
import com.tencent.ads.model.PageSpec;

/**
 * 本文件提供了一个修改广告创意(Adcreative)的简单示例
 **/
public class UpdateAdcreatives {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;

  /**
   * NEED UPDATE ADCREATIVE ID
   */
  public Long ADCREATIVE_ID = 0L;

  /**
   * 广告标题，968规格要求：字数：10~14
   */
  public String AD_TITLE = "YOUR AD TITLE";
  /**
   * 广告文案，968规格要求：字数：24~30
   */
  public String AD_DESCRIPTION = "YOUR AD DESCRIPTION";
  /**
   * 广告落地页地址
   */
  public String PAGE_URL = "YOUR AD PAGE URL";

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

  public Long updateAdcreatives() throws Exception {
    AdcreativesUpdateRequest data = new AdcreativesUpdateRequest();
    data.setAccountId(ACCOUNT_ID);
    data.setAdcreativeId(ADCREATIVE_ID);
    data.setAdcreativeElements(
        new AdcreativeCreativeElementsMp().title(AD_TITLE).description(AD_DESCRIPTION));
    data.setPageSpec(new PageSpec().pageUrl(PAGE_URL));
    AdcreativesUpdateResponseData response = tencentAds.adcreatives().adcreativesUpdate(data);
    if (response != null) {
      return response.getAdcreativeId();
    }
    return null;
  }

  public static void main(String[] args) {
    try {
      UpdateAdcreatives updateAdcreatives = new UpdateAdcreatives();
      updateAdcreatives.init();
      Long adcreativeId = updateAdcreatives.updateAdcreatives();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

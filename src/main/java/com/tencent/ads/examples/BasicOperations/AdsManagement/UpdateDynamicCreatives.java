package com.tencent.ads.examples.BasicOperations.AdsManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.DynamicCreativeElements;
import com.tencent.ads.model.DynamicCreativesUpdateRequest;
import com.tencent.ads.model.DynamicCreativesUpdateResponseData;
import java.util.Arrays;

/*****
 * 本文件提供了一个修改动态创意(Dynamic creative)的简单示例
 */
public class UpdateDynamicCreatives {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR DYNAMIC CREATIVE ID
   */
  public Long DYNAMIC_CREATIVE_ID = 0L; // 要修改的动态创意ID
  /**
   * 方形小图
   */
  public Long ADCREATIVE_TEMPLATE_ID = 717L; // 方形小图
  /**
   * 广告图片
   */
  public String AD_IMAGE_ID = "YOUR AD IMAGE"; // 广告图片，717规格要求：147x147, <30K, png/jpg
  /**
   * 广告标题
   */
  public String AD_TITLE_1 = "YOUR AD TEXT 1"; // 广告标题，717规格要求：字数：1~10
  /**
   * 广告标题
   */
  public String AD_TITLE_2 = "YOUR AD TEXT 2"; // 广告标题，717规格要求：字数：1~10
  /**
   * 广告文案
   */
  public String AD_DESCRIPTION = "YOUR AD DESCRIPTION"; // 广告文案，717规格要求：字数：1~18
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

  public Long updateDynamicCreatives() throws Exception {
    DynamicCreativesUpdateRequest data = new DynamicCreativesUpdateRequest();
    data.accountId(ACCOUNT_ID);
    data.dynamicCreativeTemplateId(ADCREATIVE_TEMPLATE_ID);
    data.dynamicCreativeId(DYNAMIC_CREATIVE_ID);
    data.dynamicCreativeElements(
        new DynamicCreativeElements().imageOptions(Arrays.asList(AD_IMAGE_ID))
            .titleOptions(Arrays.asList(AD_TITLE_1, AD_TITLE_2))
            .descriptionOptions(Arrays.asList(AD_DESCRIPTION)));

    DynamicCreativesUpdateResponseData response = tencentAds.dynamicCreatives()
        .dynamicCreativesUpdate(data);
    if (response != null) {
      return response.getDynamicCreativeId();
    }
    return null;
  }

  public static void main(String[] args) {
    try {
      UpdateDynamicCreatives example = new UpdateDynamicCreatives();
      example.init();
      Long id = example.updateDynamicCreatives();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}

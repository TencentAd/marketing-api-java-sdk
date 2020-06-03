package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AdcreativePreviewsAddRequest;
import com.tencent.ads.model.AdcreativePreviewsAddResponse;
import com.tencent.ads.model.ViewerIdType;
import java.util.Arrays;

/*****
 * 本文件提供了一个创建预览受众(Adcreative preview)的简单示例
 */
public class AddAdcreativePreviews {

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
   * YOUR USER_ID_TYPE_QQ_ID
   */
  public ViewerIdType USER_ID_TYPE = ViewerIdType.QQ_ID; // 受众ID类型
  /**
   * YOUR USER QQ
   */
  public String USER_ID_QQ = "YOUR USER QQ"; // 受众ID
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

  public AdcreativePreviewsAddResponse addAdcreativePreviews() throws Exception {
    AdcreativePreviewsAddRequest data = new AdcreativePreviewsAddRequest();
    data.accountId(ACCOUNT_ID);
    data.adgroupId(ADGROUP_ID);
    data.userIdType(USER_ID_TYPE);
    data.userIdList(Arrays.asList(USER_ID_QQ));
    AdcreativePreviewsAddResponse response = tencentAds.adcreativePreviews()
        .adcreativePreviewsAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddAdcreativePreviews addAdcreativePreviews = new AddAdcreativePreviews();
      addAdcreativePreviews.init();
      AdcreativePreviewsAddResponse response = addAdcreativePreviews.addAdcreativePreviews();
      if (response != null) {
        // your code
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
package com.tencent.ads.examples.BasicOperations.AudiencesManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.CustomDataSaltGetRequest;
import com.tencent.ads.model.CustomDataSaltGetResponseData;

/*****
 * 本文件提供了一个获取加密用盐(Salt)列表的简单示例
 */
public class GetCustomDataSalts {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
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

  public CustomDataSaltGetResponseData getCustomDataSalts() throws Exception {
    CustomDataSaltGetRequest data = new CustomDataSaltGetRequest();
    data.accountId(ACCOUNT_ID);
    CustomDataSaltGetResponseData response = tencentAds.customDataSalt().customDataSaltGet(data);
    return response;

  }

  public static void main(String[] args) {
    try {
      GetCustomDataSalts getCustomDataSalts = new GetCustomDataSalts();
      getCustomDataSalts.init();
      CustomDataSaltGetResponseData response = getCustomDataSalts.getCustomDataSalts();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

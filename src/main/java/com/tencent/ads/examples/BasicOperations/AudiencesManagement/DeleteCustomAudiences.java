package com.tencent.ads.examples.BasicOperations.AudiencesManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.CustomAudiencesDeleteRequest;
import com.tencent.ads.model.CustomAudiencesDeleteResponse;

/*****
 * 本文件提供了一个删除客户人群(Custom audience)的简单示例
 */
public class DeleteCustomAudiences {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR AUDIENCE ID
   */
  public Long AUDIENCE_ID = 0L; // 人群ID
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

  public CustomAudiencesDeleteResponse deleteCustomAudiences() throws Exception {
    CustomAudiencesDeleteRequest data = new CustomAudiencesDeleteRequest();
    data.accountId(ACCOUNT_ID);
    data.audienceId(AUDIENCE_ID);
    CustomAudiencesDeleteResponse response = tencentAds.customAudiences()
        .customAudiencesDelete(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      DeleteCustomAudiences deleteCustomAudiences = new DeleteCustomAudiences();
      deleteCustomAudiences.init();
      CustomAudiencesDeleteResponse response = deleteCustomAudiences.deleteCustomAudiences();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

package com.tencent.ads.examples.BasicOperations.AudiencesManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.CustomAudiencesUpdateRequest;
import com.tencent.ads.model.CustomAudiencesUpdateResponse;

/*****
 * 本文件提供了一个修改客户人群(Custom audience)的简单示例
 */
public class UpdateCustomAudiences {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR AUDIENCE_ID
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

  public CustomAudiencesUpdateResponse updateCustomAudiences() throws Exception {
    CustomAudiencesUpdateRequest data = new CustomAudiencesUpdateRequest();
    data.accountId(ACCOUNT_ID);
    data.audienceId(AUDIENCE_ID);
    data.description("SDK sample updated");
    CustomAudiencesUpdateResponse response = tencentAds.customAudiences()
        .customAudiencesUpdate(data);
    return response;

  }

  public static void main(String[] args) {
    try {
      UpdateCustomAudiences updateCustomAudiences = new UpdateCustomAudiences();
      updateCustomAudiences.init();
      CustomAudiencesUpdateResponse response = updateCustomAudiences.updateCustomAudiences();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

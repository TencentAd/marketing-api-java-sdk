package com.tencent.ads.examples.BasicOperations.AudiencesManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AudienceType;
import com.tencent.ads.model.CustomAudiencesAddRequest;
import com.tencent.ads.model.CustomAudiencesAddResponseData;
import java.util.UUID;


/*****
 * 本文件提供了一个创建客户人群(Custom audience)的简单示例
 */
public class AddCustomAudiences {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * TYPE
   */
  public AudienceType TYPE = AudienceType.CUSTOMER_FILE; // 号码文件人群
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

  public CustomAudiencesAddResponseData addCustomAudiences() throws Exception {
    CustomAudiencesAddRequest data = new CustomAudiencesAddRequest();
    data.accountId(ACCOUNT_ID);
    data.name("SDK人群" + UUID.randomUUID().toString().substring(0, 10));
    data.type(TYPE);
    data.description("SDK sample");
    CustomAudiencesAddResponseData response = tencentAds.customAudiences().customAudiencesAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddCustomAudiences addCustomAudiences = new AddCustomAudiences();
      addCustomAudiences.init();
      CustomAudiencesAddResponseData response = addCustomAudiences.addCustomAudiences();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

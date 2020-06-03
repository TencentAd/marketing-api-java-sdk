package com.tencent.ads.examples.BasicOperations.AudiencesManagement;

/*****
 * 本文件提供了一个创建客户标签(Custom tag)的简单示例
 */

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.CustomTagsAddRequest;
import com.tencent.ads.model.CustomTagsAddResponseData;
import java.util.UUID;

public class AddCustomTags {

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

  public CustomTagsAddResponseData addCustomTags() throws Exception {
    CustomTagsAddRequest data = new CustomTagsAddRequest();
    data.accountId(ACCOUNT_ID);
    data.name("SDK标签" + UUID.randomUUID().toString().substring(0, 10));

    CustomTagsAddResponseData response = tencentAds.customTags().customTagsAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddCustomTags addCustomTags = new AddCustomTags();
      addCustomTags.init();
      CustomTagsAddResponseData response = addCustomTags.addCustomTags();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

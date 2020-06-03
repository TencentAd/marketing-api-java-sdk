package com.tencent.ads.examples.BasicOperations.AudiencesManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.CustomTagsUpdateRequest;
import com.tencent.ads.model.CustomTagsUpdateResponse;

/*****
 * 本文件提供了一个更新客户标签(Custom tag)的简单示例
 */
public class UpdateCustomTags {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR TAG ID
   */
  public Long TAG_ID = 0L;// 标签ID
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

  public CustomTagsUpdateResponse updateCustomTags() throws Exception {
    CustomTagsUpdateRequest data = new CustomTagsUpdateRequest();
    data.accountId(ACCOUNT_ID);
    data.tagId(TAG_ID);
    data.description("SDK sample updated");
    CustomTagsUpdateResponse response = tencentAds.customTags().customTagsUpdate(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      UpdateCustomTags updateCustomTags = new UpdateCustomTags();
      updateCustomTags.init();
      CustomTagsUpdateResponse response = updateCustomTags.updateCustomTags();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
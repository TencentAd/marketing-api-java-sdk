package com.tencent.ads.examples.BasicOperations.AudiencesManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.CustomTagsDeleteRequest;
import com.tencent.ads.model.CustomTagsDeleteResponse;

/*****
 * 本文件提供了一个删除客户标签(Custom tag)的简单示例
 */
public class DeleteCustomTags {

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

  public CustomTagsDeleteResponse deleteCustomTags() throws Exception {
    CustomTagsDeleteRequest data = new CustomTagsDeleteRequest();
    data.accountId(ACCOUNT_ID);
    data.tagId(TAG_ID);
    CustomTagsDeleteResponse response = tencentAds.customTags().customTagsDelete(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      DeleteCustomTags deleteCustomTags = new DeleteCustomTags();
      deleteCustomTags.init();
      CustomTagsDeleteResponse response = deleteCustomTags.deleteCustomTags();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

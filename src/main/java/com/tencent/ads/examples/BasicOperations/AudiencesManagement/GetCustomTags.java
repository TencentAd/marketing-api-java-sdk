package com.tencent.ads.examples.BasicOperations.AudiencesManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.CustomTagsGetResponseData;
import java.util.Arrays;

/*****
 * 本文件提供了一个获取客户标签(Custom tag)列表的简单示例
 */
public class GetCustomTags {

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

  public CustomTagsGetResponseData getCustomTags() throws Exception {
    CustomTagsGetResponseData response = tencentAds.customTags()
        .customTagsGet(ACCOUNT_ID, null, null,
            null, null, null, null, Arrays
                .asList("tag_id", "parent_tag_id", "name", "description", "tag_code", "user_count",
                    "created_time"));

    return response;
  }

  public static void main(String[] args) {
    try {
      GetCustomTags getCustomTags = new GetCustomTags();
      getCustomTags.init();
      CustomTagsGetResponseData response = getCustomTags.getCustomTags();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

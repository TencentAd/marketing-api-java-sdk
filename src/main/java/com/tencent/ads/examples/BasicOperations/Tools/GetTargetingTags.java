package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.TargetingTagsGetResponseData;
import java.util.Arrays;

/*****
 * 本文件提供了一个获取定向标签(Targeting tag)列表的简单示例
 */
public class GetTargetingTags {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR APP_CATEGORY
   */
  public String TYPE = "APP_CATEGORY";

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

  public TargetingTagsGetResponseData getTargetingTags() throws Exception {
    TargetingTagsGetResponseData response = tencentAds.targetingTags().targetingTagsGet(TYPE, null,
        Arrays.asList("id", "name", "parent_id", "parent_name", "city_level"));
    return response;
  }

  public static void main(String[] args) {
    try {
      GetTargetingTags getTargetingTags = new GetTargetingTags();
      getTargetingTags.init();
      TargetingTagsGetResponseData response = getTargetingTags.getTargetingTags();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

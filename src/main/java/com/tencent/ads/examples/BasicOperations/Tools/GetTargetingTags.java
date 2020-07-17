package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.TagSpec;
import java.util.Arrays;
import java.util.List;

public class GetTargetingTags {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public String type = "APP_CATEGORY";

  public Long accountId = null;

  public TagSpec tagSpec = null;

  public List<String> fields =
      Arrays.asList("id", "name", "parent_id", "parent_name", "city_level");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {}

  public TargetingTagsGetResponseData getTargetingTags() throws Exception {
    TargetingTagsGetResponseData response =
        tencentAds.targetingTags().targetingTagsGet(type, accountId, tagSpec, fields);
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

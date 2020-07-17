package com.tencent.ads.examples.BasicOperations.AudiencesManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.CustomTagsUpdateRequest;
import com.tencent.ads.model.CustomTagsUpdateResponse;

public class UpdateCustomTags {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;
  public CustomTagsUpdateRequest data = new CustomTagsUpdateRequest();
  public Long tagId = null;
  public String description = "SDK sample";

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {
    data.setAccountId(accountId);

    data.setTagId(tagId);

    data.setDescription(description);
  }

  public CustomTagsUpdateResponse updateCustomTags() throws Exception {
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

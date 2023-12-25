package com.tencent.ads.examples.BasicOperations.AudiencesManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.CustomTagsAddRequest;

public class AddCustomTags {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;
  public CustomTagsAddRequest data = new CustomTagsAddRequest();
  public String name = "SDK标签5ede252a69cb1";

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setAccountId(accountId);

    data.setName(name);
  }

  public CustomTagsAddResponseData addCustomTags() throws Exception {
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

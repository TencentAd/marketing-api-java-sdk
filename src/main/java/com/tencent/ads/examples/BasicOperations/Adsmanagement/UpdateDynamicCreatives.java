package com.tencent.ads.examples.BasicOperations.Adsmanagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.DynamicCreativesUpdateRequest;
import java.util.Arrays;
import java.util.List;

public class UpdateDynamicCreatives {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;
  public DynamicCreativesUpdateRequest data = new DynamicCreativesUpdateRequest();
  public List<String> imageOptions = Arrays.asList("YOUR AD IMAGE");
  public List<String> titleOptions = Arrays.asList("YOUR AD TEXT 1", "YOUR AD TEXT 2");
  public List<String> descriptionOptions = Arrays.asList("YOUR AD DESCRIPTION");
  public Long dynamicCreativeId = null;
  public Long dynamicCreativeTemplateId = 717L;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setAccountId(accountId);

    DynamicCreativeElements dynamicCreativeElements = new DynamicCreativeElements();
    dynamicCreativeElements.setImageOptions(imageOptions);
    dynamicCreativeElements.setTitleOptions(titleOptions);
    dynamicCreativeElements.setDescriptionOptions(descriptionOptions);
    data.setDynamicCreativeElements(dynamicCreativeElements);

    data.setDynamicCreativeId(dynamicCreativeId);

    data.setDynamicCreativeTemplateId(dynamicCreativeTemplateId);
  }

  public DynamicCreativesUpdateResponseData updateDynamicCreatives() throws Exception {
    DynamicCreativesUpdateResponseData response =
        tencentAds.dynamicCreatives().dynamicCreativesUpdate(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      UpdateDynamicCreatives updateDynamicCreatives = new UpdateDynamicCreatives();
      updateDynamicCreatives.init();
      DynamicCreativesUpdateResponseData response = updateDynamicCreatives.updateDynamicCreatives();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

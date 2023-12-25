package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.AdcreativePreviewsAddRequest;
import com.tencent.ads.model.AdcreativePreviewsAddResponse;
import java.util.Arrays;
import java.util.List;

public class AddAdcreativePreviews {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public List<String> userIdList = Arrays.asList("YOUR USER QQ");
  public AdcreativePreviewsAddRequest data = new AdcreativePreviewsAddRequest();
  public Long accountId = null;
  public Long adgroupId = null;
  public ViewerIdType userIdType = ViewerIdType.QQ_ID;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setUserIdList(userIdList);

    data.setAccountId(accountId);

    data.setAdgroupId(adgroupId);

    data.setUserIdType(userIdType);
  }

  public AdcreativePreviewsAddResponse addAdcreativePreviews() throws Exception {
    AdcreativePreviewsAddResponse response =
        tencentAds.adcreativePreviews().adcreativePreviewsAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddAdcreativePreviews addAdcreativePreviews = new AddAdcreativePreviews();
      addAdcreativePreviews.init();
      AdcreativePreviewsAddResponse response = addAdcreativePreviews.addAdcreativePreviews();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

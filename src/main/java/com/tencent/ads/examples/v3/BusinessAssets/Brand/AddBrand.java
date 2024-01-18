package com.tencent.ads.examples.v3.BusinessAssets.Brand;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.v3.TencentAds;
import java.io.File;

public class AddBrand {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public String name = "YOUR BRAND NAME";

  public File brandImageFile = new File("YOUR BRAND IMAGE FILE PATH");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public BrandAddResponseData addBrand() throws Exception {
    BrandAddResponseData response = tencentAds.brand().brandAdd(accountId, name, brandImageFile);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddBrand addBrand = new AddBrand();
      addBrand.init();
      BrandAddResponseData response = addBrand.addBrand();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

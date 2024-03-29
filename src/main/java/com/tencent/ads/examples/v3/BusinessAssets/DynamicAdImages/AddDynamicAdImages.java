package com.tencent.ads.examples.v3.BusinessAssets.DynamicAdImages;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.DynamicAdImagesAddRequest;
import com.tencent.ads.v3.TencentAds;

public class AddDynamicAdImages {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long productCatalogId = null;
  public DynamicAdImagesAddRequest data = new DynamicAdImagesAddRequest();
  public Long accountId = null;
  public ProductMode productMode = ProductMode.SINGLE;
  public String productSource = "YOUR PRODUCT ID";
  public DynamicAdTemplateSize dynamicAdTemplateSize = DynamicAdTemplateSize._1280_720;
  public Long dynamicAdTemplateId = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setProductCatalogId(productCatalogId);

    data.setAccountId(accountId);

    data.setProductMode(productMode);

    data.setProductSource(productSource);

    data.setDynamicAdTemplateSize(dynamicAdTemplateSize);

    data.setDynamicAdTemplateId(dynamicAdTemplateId);
  }

  public DynamicAdImagesAddResponseData addDynamicAdImages() throws Exception {
    DynamicAdImagesAddResponseData response = tencentAds.dynamicAdImages().dynamicAdImagesAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddDynamicAdImages addDynamicAdImages = new AddDynamicAdImages();
      addDynamicAdImages.init();
      DynamicAdImagesAddResponseData response = addDynamicAdImages.addDynamicAdImages();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

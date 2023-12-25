package com.tencent.ads.examples.BasicOperations.CreativeToolBox;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import java.util.List;

public class GetCreativeSampleProducts {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public Long productCatalogId = null;

  public List<String> productOuterIds = null;

  public Long productSeriesId = null;

  public Long templateId = null;

  public String templateType = null;

  public String imageId = null;

  public String videoId = null;

  public List<String> productFields = null;

  public Long limit = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public CreativeSampleProductsGetResponseData getCreativeSampleProducts() throws Exception {
    CreativeSampleProductsGetResponseData response =
        tencentAds
            .creativeSampleProducts()
            .creativeSampleProductsGet(
                accountId,
                productCatalogId,
                productOuterIds,
                productSeriesId,
                templateId,
                templateType,
                imageId,
                videoId,
                productFields,
                limit,
                fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetCreativeSampleProducts getCreativeSampleProducts = new GetCreativeSampleProducts();
      getCreativeSampleProducts.init();
      CreativeSampleProductsGetResponseData response =
          getCreativeSampleProducts.getCreativeSampleProducts();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

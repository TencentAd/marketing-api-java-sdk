package com.tencent.ads.examples.v3.Tools.ComponentsMetadata;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.GetMetadataFilteringStruct;
import com.tencent.ads.v3.TencentAds;
import java.util.List;

public class GetComponentsMetadata {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public List<GetMetadataFilteringStruct> filtering = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public ComponentsMetadataGetResponseData getComponentsMetadata() throws Exception {
    ComponentsMetadataGetResponseData response =
        tencentAds.componentsMetadata().componentsMetadataGet(accountId, filtering, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetComponentsMetadata getComponentsMetadata = new GetComponentsMetadata();
      getComponentsMetadata.init();
      ComponentsMetadataGetResponseData response = getComponentsMetadata.getComponentsMetadata();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

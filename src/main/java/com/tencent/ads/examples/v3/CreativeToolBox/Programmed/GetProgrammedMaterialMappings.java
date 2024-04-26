package com.tencent.ads.examples.v3.CreativeToolBox.Programmed;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.v3.TencentAds;
import java.util.List;

public class GetProgrammedMaterialMappings {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public Long dynamicCreativeId = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public ProgrammedMaterialMappingsGetResponseData getProgrammedMaterialMappings()
      throws Exception {
    ProgrammedMaterialMappingsGetResponseData response =
        tencentAds
            .programmedMaterialMappings()
            .programmedMaterialMappingsGet(accountId, dynamicCreativeId, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetProgrammedMaterialMappings getProgrammedMaterialMappings =
          new GetProgrammedMaterialMappings();
      getProgrammedMaterialMappings.init();
      ProgrammedMaterialMappingsGetResponseData response =
          getProgrammedMaterialMappings.getProgrammedMaterialMappings();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

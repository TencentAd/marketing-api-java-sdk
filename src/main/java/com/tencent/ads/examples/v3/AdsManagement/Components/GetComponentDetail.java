package com.tencent.ads.examples.v3.AdsManagement.Components;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.AdContext;
import com.tencent.ads.model.v3.ComponentDetailFilteringStruct;
import com.tencent.ads.v3.TencentAds;
import java.util.List;

public class GetComponentDetail {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public List<ComponentDetailFilteringStruct> filtering = null;

  public Long page = null;

  public Long pageSize = null;

  public Long organizationId = null;

  public AdContext adContext = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public ComponentDetailGetResponseData getComponentDetail() throws Exception {
    ComponentDetailGetResponseData response =
        tencentAds
            .componentDetail()
            .componentDetailGet(
                accountId, filtering, page, pageSize, organizationId, adContext, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetComponentDetail getComponentDetail = new GetComponentDetail();
      getComponentDetail.init();
      ComponentDetailGetResponseData response = getComponentDetail.getComponentDetail();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

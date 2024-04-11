package com.tencent.ads.examples.v3.BusinessAssets.Pages;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.AdContext;
import com.tencent.ads.model.v3.FilteringStruct;
import com.tencent.ads.v3.TencentAds;
import java.util.Arrays;
import java.util.List;

public class GetPages {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public List<FilteringStruct> filtering = null;

  public Long page = null;

  public Long pageSize = null;

  public AdContext adContext = null;

  public List<String> fields =
      Arrays.asList(
          "page_id",
          "page_name",
          "preview_url",
          "created_time",
          "last_modified_time",
          "promoted_object_id",
          "page_type");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public PagesGetResponseData getPages() throws Exception {
    PagesGetResponseData response =
        tencentAds.pages().pagesGet(accountId, filtering, page, pageSize, adContext, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetPages getPages = new GetPages();
      getPages.init();
      PagesGetResponseData response = getPages.getPages();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.FilteringStruct;
import java.util.Arrays;
import java.util.List;

public class GetWechatPages {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public Long ownerUid = null;

  public List<FilteringStruct> filtering = null;

  public Long page = null;

  public Long pageSize = null;

  public List<String> fields =
      Arrays.asList(
          "page_id",
          "page_name",
          "created_time",
          "last_modified_time",
          "page_template_id",
          "page_elements_spec_list",
          "share_content_spec",
          "preview_url",
          "page_type");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public WechatPagesGetResponseData getWechatPages() throws Exception {
    WechatPagesGetResponseData response =
        tencentAds
            .wechatPages()
            .wechatPagesGet(accountId, ownerUid, filtering, page, pageSize, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetWechatPages getWechatPages = new GetWechatPages();
      getWechatPages.init();
      WechatPagesGetResponseData response = getWechatPages.getWechatPages();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

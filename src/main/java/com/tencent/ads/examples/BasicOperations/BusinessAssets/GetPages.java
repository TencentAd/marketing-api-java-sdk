package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.PagesGetResponseData;
import java.util.Arrays;


/*****
 * 本文件提供了一个获取落地页(Page)列表的简单示例
 */
public class GetPages {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * PROMOTED_OBJECT_TYPE
   */
  public String PROMOTED_OBJECT_TYPE = "PROMOTED_OBJECT_TYPE_LINK"; // 外链
  /**
   * TencentAds
   */
  public TencentAds tencentAds;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true));// debug==true 会打印请求详细信息
    this.tencentAds.useSandbox();// 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
  }

  public PagesGetResponseData getPages() throws Exception {
    PagesGetResponseData response = tencentAds.pages().pagesGet(ACCOUNT_ID, PROMOTED_OBJECT_TYPE,
        null, null, null, Arrays
            .asList("page_id", "page_name", "preview_url", "created_time", "last_modified_time",
                "promoted_object_id", "page_type"));
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
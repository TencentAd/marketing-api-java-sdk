package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.WechatPagesGetResponseData;
import java.util.Arrays;

/*****
 * 本文件提供了一个获取微信原生页(Wechat page)列表的简单示例
 */
public class GetWechatPages {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
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

  public WechatPagesGetResponseData getWechatPages() throws Exception {
    WechatPagesGetResponseData response = tencentAds.wechatPages().wechatPagesGet(ACCOUNT_ID, null,
        null, null, Arrays.asList("page_id", "page_name", "created_time", "last_modified_time",
            "page_template_id", "page_elements_spec_list", "share_content_spec", "preview_url",
            "page_type"));
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

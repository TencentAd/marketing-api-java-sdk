package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.PlayablePagesGetResponseData;
import java.util.Arrays;

/*****
 * 本文件提供了一个获取试玩素材(Playable page)列表的简单示例
 */
public class GetPlayablePages {

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

  public PlayablePagesGetResponseData getPlayablePages() throws Exception {
    PlayablePagesGetResponseData response = tencentAds.playablePages()
        .playablePagesGet(ACCOUNT_ID, null, null, null, Arrays
            .asList("playable_page_material_id", "playable_page_name", "playable_page_cdn_base_url",
                "audit_status", "created_time", "last_modified_time"));
    return response;

  }

  public static void main(String[] args) {
    try {
      GetPlayablePages getPlayablePages = new GetPlayablePages();
      getPlayablePages.init();
      PlayablePagesGetResponseData response = getPlayablePages.getPlayablePages();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.PlayablePagesAddResponseData;
import java.io.File;
import java.util.UUID;

/*****
 * 本文件提供了一个创建试玩素材(Playable page)的简单示例
 */
public class AddPlayablePages {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR MATERIAL ZIP FILE PATH
   */
  public String MATERIAL_FILE = "YOUR MATERIAL ZIP FILE PATH";
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

  public PlayablePagesAddResponseData addPlayablePages() throws Exception {
    PlayablePagesAddResponseData response = tencentAds.playablePages()
        .playablePagesAdd(ACCOUNT_ID, "SDK试玩" + UUID.randomUUID().toString().substring(0, 10),
            new File(MATERIAL_FILE));
    return response;

  }

  public static void main(String[] args) {
    try {
      AddPlayablePages addPlayablePages = new AddPlayablePages();
      addPlayablePages.init();
      PlayablePagesAddResponseData response = addPlayablePages.addPlayablePages();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.WechatPagesDeleteRequest;
import com.tencent.ads.model.WechatPagesDeleteResponseData;


/*****
 * 本文件提供了一个删除微信原生页(Wechat page)的简单示例
 */
public class DeleteWechatPages {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR PAGE ID
   */
  public Long PAGE_ID = 0L; // 微信原生页ID
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

  public WechatPagesDeleteResponseData deleteWechatPages() throws Exception {
    WechatPagesDeleteRequest data = new WechatPagesDeleteRequest();
    data.accountId(ACCOUNT_ID);
    data.pageId(PAGE_ID);
    WechatPagesDeleteResponseData response = tencentAds.wechatPages().wechatPagesDelete(data);
    return response;

  }

  public static void main(String[] args) {
    try {
      DeleteWechatPages deleteWechatPages = new DeleteWechatPages();
      deleteWechatPages.init();
      WechatPagesDeleteResponseData response = deleteWechatPages.deleteWechatPages();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

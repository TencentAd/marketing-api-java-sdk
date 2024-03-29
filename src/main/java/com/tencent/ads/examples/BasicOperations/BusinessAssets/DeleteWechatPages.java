package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.WechatPagesDeleteRequest;

public class DeleteWechatPages {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long pageId = null;
  public WechatPagesDeleteRequest data = new WechatPagesDeleteRequest();
  public Long accountId = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setPageId(pageId);

    data.setAccountId(accountId);
  }

  public WechatPagesDeleteResponseData deleteWechatPages() throws Exception {
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

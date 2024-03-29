package com.tencent.ads.examples.v3.BusinessAssets.Pages;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.WechatPagesAddRequest;
import com.tencent.ads.v3.TencentAds;

public class AddWechatPages {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;
  public WechatPagesAddRequest data = new WechatPagesAddRequest();
  public String pageName = "SDK原生页5ede252bee1a8";
  public Long pageTemplateId = null;
  public String shareTitle = "分享标题";
  public String shareDescription = "分享内容";

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setAccountId(accountId);

    data.setPageName(pageName);

    data.setPageTemplateId(pageTemplateId);

    ShareContentSpec shareContentSpec = new ShareContentSpec();
    shareContentSpec.setShareTitle(shareTitle);
    shareContentSpec.setShareDescription(shareDescription);
    data.setShareContentSpec(shareContentSpec);
  }

  public WechatPagesAddResponseData addWechatPages() throws Exception {
    WechatPagesAddResponseData response = tencentAds.wechatPages().wechatPagesAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddWechatPages addWechatPages = new AddWechatPages();
      addWechatPages.init();
      WechatPagesAddResponseData response = addWechatPages.addWechatPages();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

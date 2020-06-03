package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.ElementButtonRead;
import com.tencent.ads.model.ElementGoods;
import com.tencent.ads.model.GoodsButtonSpec;
import com.tencent.ads.model.PageElementsStruct;
import com.tencent.ads.model.PageElementsType;
import com.tencent.ads.model.ServiceSpec;
import com.tencent.ads.model.ShareContentSpec;
import com.tencent.ads.model.WechatPagesAddRequest;
import com.tencent.ads.model.WechatPagesAddResponseData;
import java.util.Arrays;
import java.util.UUID;


/*****
 * 本文件提供了一个创建微信原生页(Wechat page)的简单示例
 */
public class AddWechatPages {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR PAGE TEMPLATE ID
   */
  public Long PAGE_TEMPLATE_ID = 0L; // 微信原生页模板ID
  /**
   * YOUR AD TITLE
   */
  public String PAGE_TITLE = "YOUR AD TITLE"; // 标题
  /**
   * YOUR BUTTON TEXT
   */
  public String PAGE_BUTTON = "YOUR BUTTON TEXT"; // 按钮文字
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

  public WechatPagesAddResponseData addWechatPages() throws Exception {
    WechatPagesAddRequest data = new WechatPagesAddRequest();
    data.accountId(ACCOUNT_ID);
    data.pageName("SDK原生页" + UUID.randomUUID().toString().substring(0, 10));
    data.pageTemplateId(PAGE_TEMPLATE_ID);
    data.pageElementsSpecList(Arrays.asList(
        new PageElementsStruct().elementType(PageElementsType.GOODS).elementGoods(
            new ElementGoods().goodsButtonSpec(new GoodsButtonSpec().title(PAGE_TITLE))),
        new PageElementsStruct().elementType(PageElementsType.BUTTON)
            .buttonSpec(
                new ElementButtonRead().serviceSpec(new ServiceSpec().title(PAGE_BUTTON)))));
    data.shareContentSpec(new ShareContentSpec().shareTitle("分享标题").shareDescription("分享内容"));
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

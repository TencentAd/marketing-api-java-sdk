package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.WechatPagesAddRequest;
import java.util.ArrayList;
import java.util.List;

public class AddWechatPages {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public PageElementsType elementType = PageElementsType.GOODS;
  public String title = "YOUR AD TITLE";
  public PageElementsType elementType_1 = PageElementsType.BUTTON;
  public String title_1 = "YOUR BUTTON TEXT";
  public WechatPagesAddRequest data = new WechatPagesAddRequest();
  public Long accountId = null;
  public String pageName = "SDK原生页5ede252bee1a8";
  public Long pageTemplateId = null;
  public String shareTitle = "分享标题";
  public String shareDescription = "分享内容";

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {
    PageElementsStruct pageElementsStruct = new PageElementsStruct();
    pageElementsStruct.setElementType(elementType);
    GoodsButtonSpec goodsButtonSpec = new GoodsButtonSpec();
    goodsButtonSpec.setTitle(title);
    ElementGoods elementGoods = new ElementGoods();
    elementGoods.setGoodsButtonSpec(goodsButtonSpec);
    pageElementsStruct.setElementGoods(elementGoods);
    PageElementsStruct pageElementsStruct_1 = new PageElementsStruct();
    pageElementsStruct_1.setElementType(elementType_1);
    ServiceSpec serviceSpec_1 = new ServiceSpec();
    serviceSpec_1.setTitle(title_1);
    ElementButtonRead buttonSpec_1 = new ElementButtonRead();
    buttonSpec_1.setServiceSpec(serviceSpec_1);
    pageElementsStruct_1.setButtonSpec(buttonSpec_1);
    List<PageElementsStruct> pageElementsSpecList = new ArrayList<>();
    pageElementsSpecList.add(pageElementsStruct);
    pageElementsSpecList.add(pageElementsStruct_1);
    data.setPageElementsSpecList(pageElementsSpecList);

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

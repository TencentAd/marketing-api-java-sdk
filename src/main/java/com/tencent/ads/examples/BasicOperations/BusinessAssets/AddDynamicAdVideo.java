package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.DynamicAdVideoAddRequest;
import com.tencent.ads.model.DynamicAdVideoAddResponseData;
import com.tencent.ads.model.ProductMode;

/*****
 * 本文件提供了一个创建动态商品视频(Dynamic ad video)的简单示例
 */
public class AddDynamicAdVideo {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR PRODUCT CATALOG ID
   */
  public Long PRODUCT_CATALOG_ID = 0L; // 商品库ID
  /**
   * PRODUCT_MODE
   */
  public ProductMode PRODUCT_MODE = ProductMode.SINGLE; // 单商品广告
  /**
   * YOUR PRODUCT ID
   */
  public String PRODUCT_SOURCE = "YOUR PRODUCT ID"; // 商品ID
  /**
   * YOUR DYNAMIC AD TEMPLATE ID
   */
  public Long DYNAMIC_TEMPLATE_ID = 0L; // 动态商品模板ID
  /**
   * DYNAMIC_VIDEO_DURATION
   */
  public Long DYNAMIC_VIDEO_DURATION = 240L; // 动态视频素材最大时长
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

  public DynamicAdVideoAddResponseData addDynamicAdVideo() throws Exception {
    DynamicAdVideoAddRequest data = new DynamicAdVideoAddRequest();
    data.accountId(ACCOUNT_ID);
    data.productCatalogId(PRODUCT_CATALOG_ID);
    data.productMode(PRODUCT_MODE);
    data.productSource(PRODUCT_SOURCE);
    data.videoMaxDuration(DYNAMIC_VIDEO_DURATION);
    data.dynamicAdTemplateId(DYNAMIC_TEMPLATE_ID);
    DynamicAdVideoAddResponseData response = tencentAds.dynamicAdVideo().dynamicAdVideoAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddDynamicAdVideo addDynamicAdVideo = new AddDynamicAdVideo();
      addDynamicAdVideo.init();
      DynamicAdVideoAddResponseData response = addDynamicAdVideo.addDynamicAdVideo();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

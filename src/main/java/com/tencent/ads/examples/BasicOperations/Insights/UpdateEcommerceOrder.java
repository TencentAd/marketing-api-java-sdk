package com.tencent.ads.examples.BasicOperations.Insights;


import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.EcommerceOrderUpdateRequest;
import com.tencent.ads.model.EcommerceOrderUpdateResponse;
import com.tencent.ads.model.ExpressCompany;

/*****
 * 本文件提供了一个更新订单(GetEcommerce order)的简单示例
 */
public class UpdateEcommerceOrder {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR ORDER ID
   */
  public String ORDER_ID = "YOUR ORDER ID"; // 订单ID
  /**
   * YOUR Express Company
   */
  public ExpressCompany EXPRESS = ExpressCompany.SF_EXPRESS; // 快递公司
  /**
   * YOUR TRACKING_NO
   */
  public String TRACKING_NO = "YOUR TRACKING NO"; // 快递单号
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

  public EcommerceOrderUpdateResponse updateEcommerceOrder() throws Exception {
    EcommerceOrderUpdateRequest ecommerceOrderUpdateRequest = new EcommerceOrderUpdateRequest();
    ecommerceOrderUpdateRequest.accountId(ACCOUNT_ID);
    ecommerceOrderUpdateRequest.ecommerceOrderId(ORDER_ID);
    ecommerceOrderUpdateRequest.deliveryTrackingNumber(TRACKING_NO);
    ecommerceOrderUpdateRequest.expressCompany(EXPRESS);
    EcommerceOrderUpdateResponse response = tencentAds.ecommerceOrder()
        .ecommerceOrderUpdate(ecommerceOrderUpdateRequest);

    return response;
  }

  public static void main(String[] args) {
    try {
      UpdateEcommerceOrder updateEcommerceOrder = new UpdateEcommerceOrder();
      updateEcommerceOrder.init();
      EcommerceOrderUpdateResponse response = updateEcommerceOrder.updateEcommerceOrder();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
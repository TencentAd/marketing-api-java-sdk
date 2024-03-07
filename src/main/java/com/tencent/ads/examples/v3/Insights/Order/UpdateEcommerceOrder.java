package com.tencent.ads.examples.v3.Insights.Order;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.EcommerceOrderUpdateRequest;
import com.tencent.ads.model.v3.EcommerceOrderUpdateResponse;
import com.tencent.ads.v3.TencentAds;

public class UpdateEcommerceOrder {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;
  public EcommerceOrderUpdateRequest data = new EcommerceOrderUpdateRequest();
  public String ecommerceOrderId = "YOUR ORDER ID";
  public String deliveryTrackingNumber = "YOUR TRACKING NO";
  public ExpressCompany expressCompany = ExpressCompany.SF_EXPRESS;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setAccountId(accountId);

    data.setEcommerceOrderId(ecommerceOrderId);

    data.setDeliveryTrackingNumber(deliveryTrackingNumber);

    data.setExpressCompany(expressCompany);
  }

  public EcommerceOrderUpdateResponse updateEcommerceOrder() throws Exception {
    EcommerceOrderUpdateResponse response = tencentAds.ecommerceOrder().ecommerceOrderUpdate(data);
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

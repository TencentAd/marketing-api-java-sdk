package com.tencent.ads.examples.v3.Insights.Order;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.DateRange;
import com.tencent.ads.model.v3.FilteringStruct;
import com.tencent.ads.v3.TencentAds;
import java.util.Arrays;
import java.util.List;

public class GetEcommerceOrder {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public String date = null;

  public DateRange dateRange = new DateRange();

  public List<FilteringStruct> filtering = null;

  public Long page = null;

  public Long pageSize = null;

  public List<String> fields =
      Arrays.asList(
          "account_id",
          "ecommerce_order_id",
          "customized_page_name",
          "commodity_package_detail",
          "quantity",
          "price",
          "total_price",
          "ecommerce_order_time",
          "ecommerce_order_status",
          "user_name",
          "user_phone",
          "user_province",
          "user_city",
          "user_area",
          "user_address",
          "user_ip",
          "user_message",
          "destination_url",
          "adgroup_id",
          "adgroup_name",
          "from_account_id",
          "delivery_spec");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    String startDate = "REPORT START DATE";
    dateRange.setStartDate(startDate);
    String endDate = "REPORT END DATE";
    dateRange.setEndDate(endDate);
  }

  public EcommerceOrderGetResponseData getEcommerceOrder() throws Exception {
    EcommerceOrderGetResponseData response =
        tencentAds
            .ecommerceOrder()
            .ecommerceOrderGet(accountId, date, dateRange, filtering, page, pageSize, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetEcommerceOrder getEcommerceOrder = new GetEcommerceOrder();
      getEcommerceOrder.init();
      EcommerceOrderGetResponseData response = getEcommerceOrder.getEcommerceOrder();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

package com.tencent.ads.examples.BasicOperations.Insights;


import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.EcommerceOrderGetResponseData;
import com.tencent.ads.model.EcommerceOrderListStruct;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*****
 * 本文件提供了一个获取订单(GetEcommerce order)列表的简单示例
 */
public class GetEcommerceOrder {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * REPORT START DATE
   */
  public String START_DATE = "REPORT START DATE"; // 报表开始日期 YYYY-MM-DDD
  /**
   * REPORT END DATE
   */
  public String END_DATE = "REPORT END DATE"; // 报表结束日期 YYYY-MM-DDD
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

  public EcommerceOrderGetResponseData getEcommerceOrder() throws Exception {
    Map<String, Object> dateRange = new HashMap<>();
    dateRange.put("start_date", START_DATE);
    dateRange.put("end_date", END_DATE);
    EcommerceOrderGetResponseData response = tencentAds.ecommerceOrder()
        .ecommerceOrderGet(ACCOUNT_ID,
            dateRange, null, null, null,
            Arrays.asList("account_id", "ecommerce_order_id", "customized_page_name",
                "commodity_package_detail", "quantity",
                "price", "total_price", "ecommerce_order_time", "ecommerce_order_status",
                "user_name", "user_phone",
                "user_province", "user_city", "user_area", "user_address", "user_ip",
                "user_message",
                "destination_url", "adgroup_id", "adgroup_name", "from_account_id",
                "delivery_spec"));

    return response;
  }

  public static void main(String[] args) {
    try {
      GetEcommerceOrder getEcommerceOrder = new GetEcommerceOrder();
      getEcommerceOrder.init();
      EcommerceOrderGetResponseData response = getEcommerceOrder.getEcommerceOrder();
      if (response != null) {
        List<EcommerceOrderListStruct> list = response.getList();
      }
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
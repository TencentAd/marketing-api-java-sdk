package com.tencent.ads.examples.BasicOperations.Account;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.DailyCostGetResponseData;
import com.tencent.ads.model.FilteringStruct;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 本文件提供了一个获取日消耗(Daily cost)列表的简单示例
 */
public class GetDailyCost {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * 报表开始日期
   */
  public String START_DATE = "REPORT START DATE";
  /**
   * 报表结束日期
   */
  public String END_DATE = "REPORT END DATE";
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

  public DailyCostGetResponseData getDailyCost() throws Exception {
    Map<String, Object> dateRange = new HashMap<String, Object>();
    dateRange.put("start_date", START_DATE);
    dateRange.put("end_date", END_DATE);
    Long accountId = ACCOUNT_ID;
    List<FilteringStruct> filtering = null;
    Long page = null;
    Long pageSize = null;
    List<String> fields = Arrays.asList();
    DailyCostGetResponseData response = tencentAds.dailyCost().
        dailyCostGet(dateRange, accountId, filtering, page, pageSize, fields);

    return response;
  }

  public static void main(String[] args) {
    try {
      GetDailyCost getDailyCost = new GetDailyCost();
      getDailyCost.init();
      DailyCostGetResponseData responseData = getDailyCost.getDailyCost();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
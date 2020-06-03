package com.tencent.ads.examples.BasicOperations.AdsManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AdsGetResponseData;
import com.tencent.ads.model.FilteringStruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 本文件提供了一个获取广告(Ad)列表的简单示例
 **/
public class GetAds {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
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

  public AdsGetResponseData getAds() throws Exception {
    Long accountId = ACCOUNT_ID;
    List<FilteringStruct> filtering = new ArrayList<>();
    Long page = null;
    Long pageSize = null;
    Boolean isDeleted = null;
    List<String> fields = Arrays
        .asList("ad_id", "campaign_id", "adgroup_id", "adcreative_id", "ad_name");
    FilteringStruct filter = new FilteringStruct().field("configured_status").operator("EQUALS")
        .values(Arrays.asList("AD_STATUS_NORMAL"));
    filtering.add(filter);
    AdsGetResponseData response = tencentAds.ads()
        .adsGet(accountId, filtering, page, pageSize, isDeleted, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetAds getAds = new GetAds();
      getAds.init();
      AdsGetResponseData responseData = getAds.getAds();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }


}

package com.tencent.ads.examples.BasicOperations.AdsManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.CampaignsGetResponseData;
import com.tencent.ads.model.FilteringStruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 本文件提供了一个获取推广计划(Campaign)列表的简单示例
 **/
public class GetCampaigns {

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

  public CampaignsGetResponseData getCampaigns() throws Exception {
    Long accountId = ACCOUNT_ID;
    List<FilteringStruct> filtering = new ArrayList<>();
    Long page = null;
    Long pageSize = null;
    Boolean isDeleted = null;
    List<String> fields = Arrays
        .asList("campaign_id", "campaign_name", "campaign_type");
    FilteringStruct filter = new FilteringStruct().field("promoted_object_type").operator("EQUALS")
        .values(Arrays.asList("PROMOTED_OBJECT_TYPE_APP_IOS"));
    filtering.add(filter);
    CampaignsGetResponseData responseData = tencentAds.campaigns()
        .campaignsGet(accountId, filtering, page, pageSize, isDeleted, fields);
    return responseData;
  }

  public static void main(String[] args) {
    try {
      GetCampaigns getCampaigns = new GetCampaigns();
      getCampaigns.init();
      CampaignsGetResponseData responseData = getCampaigns.getCampaigns();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}

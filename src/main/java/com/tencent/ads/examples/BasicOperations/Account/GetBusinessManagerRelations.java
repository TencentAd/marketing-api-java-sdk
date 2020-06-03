package com.tencent.ads.examples.BasicOperations.Account;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.BusinessManagerRelationsGetResponseData;
import java.util.List;

/**
 * 本文件提供了一个获取商务管家代理的广告主(Advertiser)列表的简单示例
 */
public class GetBusinessManagerRelations {

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

  public BusinessManagerRelationsGetResponseData getBusinessManagerRelations() throws Exception {
    Long page = null;
    Long pageSize = null;
    List<String> fields = null;
    BusinessManagerRelationsGetResponseData response = tencentAds.businessManagerRelations().
        businessManagerRelationsGet(page, pageSize, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetBusinessManagerRelations getBusinessManagerRelations = new GetBusinessManagerRelations();
      getBusinessManagerRelations.init();
      BusinessManagerRelationsGetResponseData responseData = getBusinessManagerRelations
          .getBusinessManagerRelations();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
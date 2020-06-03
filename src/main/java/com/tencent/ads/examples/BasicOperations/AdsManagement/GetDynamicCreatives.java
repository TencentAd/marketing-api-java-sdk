package com.tencent.ads.examples.BasicOperations.AdsManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.DynamicCreativesGetListStruct;
import com.tencent.ads.model.DynamicCreativesGetResponseData;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*****
 * 本文件提供了一个获取动态创意(Dynamic creative)列表的简单示例
 */
public class GetDynamicCreatives {

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

  public List<DynamicCreativesGetListStruct> getDynamicCreatives() throws Exception {

    List<String> fields = Arrays.asList("dynamic_creative_id", "dynamic_creative_name");
    DynamicCreativesGetResponseData response = tencentAds.dynamicCreatives()
        .dynamicCreativesGet(ACCOUNT_ID, null, null, null, fields);
    if (response != null) {
      return response.getList();
    }
    return Collections.emptyList();
  }

  public static void main(String[] args) {
    try {
      GetDynamicCreatives example = new GetDynamicCreatives();
      example.init();
      List<DynamicCreativesGetListStruct> list = example.getDynamicCreatives();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}

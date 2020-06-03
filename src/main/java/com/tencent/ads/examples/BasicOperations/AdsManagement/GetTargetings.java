package com.tencent.ads.examples.BasicOperations.AdsManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.TargetingsGetListStruct;
import com.tencent.ads.model.TargetingsGetResponseData;
import java.util.Arrays;
import java.util.List;

/*****
 * 本文件提供了一个获取定向(Targeting)列表的简单示例
 */
public class GetTargetings {

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

  public List<TargetingsGetListStruct> getTargetings() throws Exception {
    List<String> fields = Arrays.asList("targeting_id", "targeting_name");
    TargetingsGetResponseData response = tencentAds.targetings()
        .targetingsGet(ACCOUNT_ID, null, null, null, fields);
    return response.getList();
  }

  public static void main(String[] args) {
    try {
      GetTargetings example = new GetTargetings();
      example.init();
      List<TargetingsGetListStruct> list = example.getTargetings();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

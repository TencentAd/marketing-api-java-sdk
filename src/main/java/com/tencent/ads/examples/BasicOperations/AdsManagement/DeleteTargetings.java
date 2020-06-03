package com.tencent.ads.examples.BasicOperations.AdsManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.TargetingsDeleteRequest;
import com.tencent.ads.model.TargetingsDeleteResponseData;

/*****
 * 本文件提供了一个删除定向(Targeting)的简单示例
 */
public class DeleteTargetings {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR TARGETING ID
   */
  public Long TARGETING_ID = 0L; // 要删除的定向ID
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

  public Long deleteTargetings() throws Exception {
    TargetingsDeleteRequest data = new TargetingsDeleteRequest();
    data.accountId(ACCOUNT_ID);
    data.targetingId(TARGETING_ID);
    TargetingsDeleteResponseData response = tencentAds.targetings().targetingsDelete(data);
    return response.getTargetingId();
  }

  public static void main(String[] args) {
    try {
      DeleteTargetings example = new DeleteTargetings();
      example.init();
      Long targetId = example.deleteTargetings();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

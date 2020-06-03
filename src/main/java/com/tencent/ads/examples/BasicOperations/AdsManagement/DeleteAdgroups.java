package com.tencent.ads.examples.BasicOperations.AdsManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AdgroupsDeleteRequest;
import com.tencent.ads.model.AdgroupsDeleteResponseData;

/**
 * 本文件提供了一个删除广告组(Adgroup)的简单示例
 **/
public class DeleteAdgroups {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * NEED DELETE ADGROUP ID
   */
  public Long ADGROUP_ID = 0L;
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

  public Long deleteAdgroups() throws Exception {
    AdgroupsDeleteRequest data = new AdgroupsDeleteRequest();
    data.setAccountId(ACCOUNT_ID);
    data.setAdgroupId(ADGROUP_ID);
    AdgroupsDeleteResponseData response = tencentAds.adgroups().adgroupsDelete(data);
    if (response != null) {
      return response.getAdgroupId();
    }
    return null;
  }

  public static void main(String[] args) {
    try {
      DeleteAdgroups deleteAdgroups = new DeleteAdgroups();
      deleteAdgroups.init();
      Long adgroupId = deleteAdgroups.deleteAdgroups();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

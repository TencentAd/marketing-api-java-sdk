package com.tencent.ads.examples.BasicOperations.AdsManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AdStatus;
import com.tencent.ads.model.AdgroupsUpdateRequest;
import com.tencent.ads.model.AdgroupsUpdateResponseData;

/**
 * 本文件提供了一个修改广告组(Adgroup)的简单示例
 **/
public class UpdateAdgroups {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * NEED UPDATE ADGROUP ID
   */
  public Long ADGROUP_ID = 0L;
  /**
   * 出价修改为3元(300分)
   */
  public Long BID_AMOUNT = 300L;
  /**
   * 广告开始投放日期
   */
  public String BEGIN_DATE = "YOUR ADGROUP BEGIN DATE";
  /**
   * 广告结束投放日期
   */
  public String END_DATE = "YOUR ADGROUP END DATE";
  /**
   * 状态修改为暂停
   */
  public AdStatus CONFIGURED_STATUS = AdStatus.SUSPEND;
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

  public Long updateAdgroups() throws Exception {
    AdgroupsUpdateRequest data = new AdgroupsUpdateRequest();
    data.setAccountId(ACCOUNT_ID);
    data.setAdgroupId(ADGROUP_ID);
    data.setBeginDate(BEGIN_DATE);
    data.setEndDate(END_DATE);
    data.setBidAmount(BID_AMOUNT);
    data.setConfiguredStatus(CONFIGURED_STATUS);
    AdgroupsUpdateResponseData response = tencentAds.adgroups().adgroupsUpdate(data);
    if (response != null) {
      return response.getAdgroupId();
    }
    return null;
  }

  public static void main(String[] args) {
    try {
      UpdateAdgroups updateAdgroups = new UpdateAdgroups();
      updateAdgroups.init();
      Long adgroupId = updateAdgroups.updateAdgroups();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
